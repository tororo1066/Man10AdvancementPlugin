package man10advancementplugin.man10advancementplugin.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.function.Consumer;

public class Location implements Trigger {

    @Expose
    @SerializedName("location")
    private man10advancementplugin.man10advancementplugin.advancement.data.LocationData location;

    public void setLocation(Consumer<man10advancementplugin.man10advancementplugin.advancement.data.LocationData> consumer) {
        this.location = new man10advancementplugin.man10advancementplugin.advancement.data.LocationData();
        consumer.accept(location);
    }
}
