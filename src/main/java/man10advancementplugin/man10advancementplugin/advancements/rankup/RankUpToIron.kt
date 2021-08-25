package man10advancementplugin.man10advancementplugin.advancements.rankup

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object RankUpToIron : Advancement(plugin,"rank_iron") {

    init {
        setParent(RankUpToBronze.key)
        addCriteria("iron",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("§5鉄")
            it.setDescription("IRONランクになる")
            it.setAnnounce(false)
            it.setIcon(Material.IRON_INGOT)
        }
    }
}