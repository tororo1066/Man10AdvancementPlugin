package man10advancementplugin.man10advancementplugin.advancements.collectmoney

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object CollectMoney100man : Advancement(plugin,"collect_money_100man") {

    init {
        setParent(CollectMoney10man.key)
        addCriteria("collect100man",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("金持ち")
            it.setDescription("100万円を所持する")
            it.setIcon(Material.IRON_INGOT,"{CustomModelData:1}")
        }
    }
}