package man10advancementplugin.man10advancementplugin.advancements.rankup

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object RankUpToGold : Advancement(plugin,"rank_gold") {

    init {
        setParent(RankUpToIron.key)
        addCriteria("gold",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("§e金")
            it.setDescription("GOLDランクになる")
            it.setAnnounce(false)
            it.setIcon(Material.GOLD_INGOT)
        }
    }
}