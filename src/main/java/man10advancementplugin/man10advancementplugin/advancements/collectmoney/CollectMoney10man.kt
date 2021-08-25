package man10advancementplugin.man10advancementplugin.advancements.collectmoney

import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import man10advancementplugin.man10advancementplugin.advancements.LoginMan10
import org.bukkit.Material

object CollectMoney10man : Advancement(plugin,"collect_money_10man") {

    init {
        setParent(LoginMan10.key)
        addCriteria("collect10man",TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("小金持ち")
            it.setDescription("10万円を所持する")
            it.setAnnounce(false)
            it.setIcon(Material.COPPER_INGOT,"{CustomModelData:1}")
        }
    }
}