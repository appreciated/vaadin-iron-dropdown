package gwt;

import elemental.json.JsonFactory;
import elemental.json.JsonValue;
import elemental.json.impl.JreJsonArray;

public class FluentJreJsonArray extends JreJsonArray {
    public FluentJreJsonArray(JsonFactory factory) {
        super(factory);
    }

    public FluentJreJsonArray setFluent(int index, JsonValue value) {
        set(index, value);
        return this;
    }

    public FluentJreJsonArray setFluent(int index, String string) {
        set(index, string);
        return this;
    }

    public FluentJreJsonArray setFluent(int index, double number) {
        set(index, number);
        return this;
    }

    public FluentJreJsonArray setFluent(int index, boolean bool) {
        set(index, bool);
        return this;
    }
}
