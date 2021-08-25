package man10advancementplugin.man10advancementplugin

import com.bencodez.votingplugin.events.PlayerVoteEvent
import com.bencodez.votingplugin.topvoter.TopVoter
import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.AdvancementManager
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import man10advancementplugin.man10advancementplugin.advancements.collectmoney.*
import man10advancementplugin.man10advancementplugin.advancements.rankup.RankUpToBronze
import man10advancementplugin.man10advancementplugin.advancements.rankup.RankUpToGold
import man10advancementplugin.man10advancementplugin.advancements.rankup.RankUpToIron
import man10advancementplugin.man10advancementplugin.advancements.votes.*
import me.armar.plugins.autorank.api.events.CheckCommandEvent
import me.armar.plugins.autorank.api.events.PlayerPromoteEvent
import me.armar.plugins.autorank.api.events.RequirementCompleteEvent
import net.ess3.api.events.UserBalanceUpdateEvent
import org.bukkit.Bukkit
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent


class AdvancementUtils : AdvancementManager(plugin),Listener {

    fun loadAdvancements(){//実績を登録する
        register(LoginMan10)//root実績
        registerAll(RankUpToBronze,RankUpToIron,RankUpToGold)//rank関連
        registerAll(CollectMoney10man, CollectMoney100man, CollectMoney1000man,CollectMoney2000man,CollectMoney5000man,CollectMoney1oku)//moeny関連
        registerAll(Vote1,Vote10,Vote32,Vote64,Vote128,Vote200)//vote関連
        createAll(true)
    }

    private fun registerAll(vararg advancement: Advancement){//実績の登録を楽にする関数
        advancement.forEach { register(it) }
    }

    @EventHandler
    fun onjoin(e : PlayerJoinEvent){ //プレイヤーが参加したときにrootの実績を解除させる
        e.player.awardAdvancement(LoginMan10.key)
    }

    @EventHandler
    fun onRankUpdate(e : PlayerPromoteEvent){
        plugin.logger.info("test")
        plugin.server.logger.info(e.groupTo)
        when(e.groupTo){
            "Member"->{
                e.player.awardAdvancement(RankUpToBronze.key)
            }
        }
    }

    @EventHandler
    fun test(e : RequirementCompleteEvent){
        plugin.logger.info(e.requirement.toString())
    }

    @EventHandler
    fun test2(e : CheckCommandEvent){
        plugin.logger.info(e.player.toString())
    }

    /**
     * プレイヤーの所持金が変わったときに呼び出すイベント(essentials)
     */
    @EventHandler
    fun onBalanceUpdate(e : UserBalanceUpdateEvent){
        val balance = e.newBalance.toDouble()
        val p = e.player
        if (balance < 100000)return
        p.awardAdvancement(CollectMoney10man.key)

        if (balance < 1000000)return
        p.awardAdvancement(CollectMoney100man.key)

        if (balance < 10000000)return
        p.awardAdvancement(CollectMoney1000man.key)

        if (balance < 20000000)return
        p.awardAdvancement(CollectMoney2000man.key)

        if (balance < 50000000)return
        p.awardAdvancement(CollectMoney5000man.key)

        if (balance < 100000000)return
        p.awardAdvancement(CollectMoney1oku.key)
    }

    /**
     * 投票したときに呼び出すイベント(VotingPlugin)
     */

    @EventHandler
    fun onVoting(e : PlayerVoteEvent){
        if (!e.isRealVote)return
        val p = Bukkit.getPlayer(e.player)?:return
        val voteCount = e.votingPluginUser.getTotal(TopVoter.AllTime)

        if (voteCount < 1)return
        p.awardAdvancement(Vote1.key)

        if (voteCount < 10)return
        p.awardAdvancement(Vote10.key)

        if (voteCount < 32)return
        p.awardAdvancement(Vote32.key)

        if (voteCount < 64)return
        p.awardAdvancement(Vote64.key)

        if (voteCount < 128)return
        p.awardAdvancement(Vote128.key)

        if (voteCount < 200)return
        p.awardAdvancement(Vote200.key)
    }

    /**
     * プレイヤーの実績を解除する関数
     * @param key 解除したい実績のkeyを入れる
     */
    fun Player.awardAdvancement(key: NamespacedKey) {
        val advancement = Bukkit.getAdvancement(key)!!
        val progress = getAdvancementProgress(advancement)
        advancement.criteria.forEach { progress.awardCriteria(it) }
    }

}
