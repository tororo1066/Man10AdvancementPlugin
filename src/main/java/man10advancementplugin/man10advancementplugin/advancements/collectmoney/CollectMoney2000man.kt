package man10advancementplugin.man10advancementplugin.advancements.collectmoney

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.FrameType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object CollectMoney2000man : Advancement(plugin,"collect_money_2000man") {

    init {
        setParent(CollectMoney1000man.key)
        addCriteria("collect2000man", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("超大金持ち")
            it.setDescription("2000万円を所持する")
            it.setFrame(FrameType.CHALLENGER)
            it.setIcon(Material.DIAMOND,"{CustomModelData:1}")
        }
    }
}