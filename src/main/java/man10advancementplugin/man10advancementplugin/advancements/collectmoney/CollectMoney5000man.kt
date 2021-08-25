package man10advancementplugin.man10advancementplugin.advancements.collectmoney

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.FrameType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object CollectMoney5000man : Advancement(plugin,"collect_money_5000man") {

    init {
        setParent(CollectMoney2000man.key)
        addCriteria("collect5000man", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("真の大金持ち")
            it.setDescription("5000万円を所持する")
            it.setFrame(FrameType.CHALLENGER)
            it.setIcon(Material.EMERALD,"{CustomModelData:1}")
        }
    }
}