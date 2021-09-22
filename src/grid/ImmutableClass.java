package grid;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class ImmutableClass {
    ////once object is created, we can't change its content
    //string class, warapper classes are immutable
    //final class
    //private memebr
    //deep copy

    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    public ImmutableClass(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        return Collections.unmodifiableMap( metadata);
    }
}
