package man10advancementplugin.man10advancementplugin.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import man10advancementplugin.man10advancementplugin.advancement.data.DimensionType;
import java.lang.reflect.Type;

public class DimensionTypeAdapter implements JsonSerializer<DimensionType> {

    @Override
    public JsonElement serialize(DimensionType src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src.getKey());
    }

}
