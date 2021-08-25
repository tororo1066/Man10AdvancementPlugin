package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object Vote32 : Advancement(Man10Advancement.plugin,"vote_32") {

    init {
        setParent(Vote10.key)
        addCriteria("vote32", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("もりもり投票")
            it.setDescription("32回投票する")
            it.setIcon(Material.BUNDLE)
        }
    }
}