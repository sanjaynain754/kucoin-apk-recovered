package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum FilterProperties$Units {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: b */
    public static final Map<String, FilterProperties$Units> f12964b = new HashMap();
    private final String units;

    static {
        for (FilterProperties$Units filterProperties$Units : values()) {
            f12964b.put(filterProperties$Units.units, filterProperties$Units);
        }
    }

    public static FilterProperties$Units getEnum(String str) {
        Map<String, FilterProperties$Units> map = f12964b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.units;
    }

    FilterProperties$Units(String str) {
        this.units = str;
    }
}
