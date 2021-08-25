package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object Vote64 : Advancement(Man10Advancement.plugin,"vote_64") {

    init {
        setParent(Vote32.key)
        addCriteria("vote64", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("いっぱい投票")
            it.setDescription("64回投票する")
            it.setIcon(Material.IRON_SWORD,"{CustomModelData:13,Enchantments:[{id:protection,lvl:1}]}")
        }
    }
}