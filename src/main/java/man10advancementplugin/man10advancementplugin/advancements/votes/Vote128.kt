package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.FrameType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object Vote128 : Advancement(Man10Advancement.plugin,"vote_128") {

    init {
        setParent(Vote64.key)
        addCriteria("vote128", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("たくさん投票")
            it.setDescription("128回投票する")
            it.setFrame(FrameType.CHALLENGER)
            it.setIcon(Material.ELYTRA,"{Enchantments:[{id:protection,lvl:1}]}")
        }
    }
}