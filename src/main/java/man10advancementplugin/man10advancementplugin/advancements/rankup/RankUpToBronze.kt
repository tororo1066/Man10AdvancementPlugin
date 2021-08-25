package man10advancementplugin.man10advancementplugin.advancements.rankup

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object RankUpToBronze : Advancement(plugin,"rank_bronze") {

    init {
        setParent(LoginMan10.key)
        addCriteria("bronze",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("§6銅")
            it.setDescription("BRONZEランクになる")
            it.setAnnounce(false)
            it.setIcon(Material.COPPER_INGOT)
        }
    }
}