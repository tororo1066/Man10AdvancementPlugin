package man10advancementplugin.man10advancementplugin.advancements.collectmoney

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.FrameType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object CollectMoney1oku : Advancement(plugin,"collect_money_1oku") {

    init {
        setParent(CollectMoney5000man.key)
        addCriteria("collect1oku", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("億万長者")
            it.setDescription("1億円を所持する")
            it.setFrame(FrameType.CHALLENGER)
            it.setIcon(Material.NETHERITE_INGOT,"{CustomModelData:1}")
        }
    }
}