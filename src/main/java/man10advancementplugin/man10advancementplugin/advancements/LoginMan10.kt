package man10advancementplugin.man10advancementplugin.advancements

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.Man10Advancement.Companion.plugin
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.BackgroundType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material
import org.bukkit.NamespacedKey

object LoginMan10 : Advancement(NamespacedKey(plugin,"login_man10")) {

    init {
        addCriteria("none", TriggerType.IMPOSSIBLE) {}
        setDisplay {
            it.setTitle("Man10Advancement")
            it.setDescription("man10サーバーにログインする")
            it.setAnnounce(false)
            it.setIcon(Material.BAKED_POTATO,"{CustomModelData:3}")
            it.setBackground(NamespacedKey.minecraft("textures/man10/common/pink.png"))
        }
    }
}