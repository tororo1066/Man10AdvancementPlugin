package man10advancementplugin.man10advancementplugin.advancements.votes

import man10advancementplugin.man10advancementplugin.Man10Advancement
import man10advancementplugin.man10advancementplugin.advancement.Advancement
import man10advancementplugin.man10advancementplugin.advancement.display.FrameType
import man10advancementplugin.man10advancementplugin.advancement.trigger.TriggerType
import org.bukkit.Material

object Vote200 : Advancement(Man10Advancement.plugin,"vote_200") {

    init {
        setParent(Vote64.key)
        addCriteria("vote200", TriggerType.IMPOSSIBLE){}
        setDisplay {
            it.setTitle("最高に投票")
            it.setDescription("200回投票する\n100日も投票ありがとう！")
            it.setFrame(FrameType.CHALLENGER)
            it.setIcon(Material.STONE_HOE,"{CustomModelData:28}")
        }
    }
}