package man10advancementplugin.man10advancementplugin.advancement.trigger;

import man10advancementplugin.man10advancementplugin.advancement.data.DistanceData;
import man10advancementplugin.man10advancementplugin.advancement.data.LocationData;
import java.util.function.Consumer;

public class NetherTravel implements Trigger {

    private LocationData entered;
    private LocationData exited;
    private DistanceData distance;

    public void setEntered(Consumer<LocationData> consumer) {
        this.entered = new LocationData();
        consumer.accept(entered);
    }

    public void setExited(Consumer<LocationData> consumer) {
        this.exited = new LocationData();
        consumer.accept(exited);
    }

    public void setDistance(Consumer<DistanceData> consumer) {
        this.distance = new DistanceData();
        consumer.accept(distance);
    }

}
