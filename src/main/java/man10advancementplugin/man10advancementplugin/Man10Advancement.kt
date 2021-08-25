package man10advancementplugin.man10advancementplugin

import org.bukkit.plugin.java.JavaPlugin

class Man10Advancement : JavaPlugin() {

    companion object{
        lateinit var plugin : Man10Advancement
    }
    override fun onEnable() {
        plugin = this
        server.pluginManager.registerEvents(AdvancementUtils(),this)
        AdvancementUtils().loadAdvancements()

    }


}