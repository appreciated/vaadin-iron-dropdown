package gwt;

import elemental.json.JsonFactory;
import elemental.json.JsonValue;
import elemental.json.impl.JreJsonObject;

public class FluentJreJsonObject extends JreJsonObject {
    public FluentJreJsonObject(JsonFactory factory) {
        super(factory);
    }

    public FluentJreJsonObject putFluent(String key, JsonValue value) {
        put(key, value);
        return this;
    }

    public FluentJreJsonObject putFluent(String key, String value) {
        put(key, value);
        return this;
    }

    public FluentJreJsonObject putFluent(String key, double value) {
        put(key, value);
        return this;
    }

    public FluentJreJsonObject putFluent(String key, boolean bool) {
        put(key, bool);
        return this;
    }
}
