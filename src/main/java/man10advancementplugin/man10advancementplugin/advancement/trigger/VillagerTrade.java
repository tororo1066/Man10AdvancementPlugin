package man10advancementplugin.man10advancementplugin.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import man10advancementplugin.man10advancementplugin.advancement.data.EntityData;
import man10advancementplugin.man10advancementplugin.advancement.data.ItemData;
import java.util.function.Consumer;

public class VillagerTrade implements Trigger {

    @Expose
    @SerializedName("item")
    private ItemData item;

    @Expose
    @SerializedName("villager")
    private EntityData villager;

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }

    public void setVillager(Consumer<EntityData> consumer) {
        this.villager = new EntityData();
        consumer.accept(villager);
    }
}
