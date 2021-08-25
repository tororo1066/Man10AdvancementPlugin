package man10advancementplugin.man10advancementplugin.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import man10advancementplugin.man10advancementplugin.advancement.data.ItemData;
import java.util.function.Consumer;

public class UsedTotem implements Trigger {

    @Expose
    @SerializedName("item")
    private ItemData item;

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }
}
