package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object Vote10 : Advancement(Man10Advancement.plugin,"vote_10") {

    init {
        setParent(Vote1.key)
        addCriteria("vote10", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("投票者")
            it.setDescription("10回投票する")
            it.setAnnounce(false)
            it.setIcon(Material.EXPERIENCE_BOTTLE)
        }
    }
}