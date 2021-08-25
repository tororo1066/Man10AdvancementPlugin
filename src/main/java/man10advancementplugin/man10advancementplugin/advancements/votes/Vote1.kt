package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object Vote1 : Advancement(plugin,"vote_1") {

    init {
        setParent(LoginMan10.key)
        addCriteria("vote1",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("初めての投票")
            it.setDescription("1回投票する")
            it.setAnnounce(false)
            it.setIcon(Material.DIAMOND,"{CustomModelData:3}")
        }
    }
}