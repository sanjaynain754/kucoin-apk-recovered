package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum FilterProperties$EdgeMode {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: b */
    public static final Map<String, FilterProperties$EdgeMode> f12955b = new HashMap();
    private final String edgeMode;

    static {
        for (FilterProperties$EdgeMode filterProperties$EdgeMode : values()) {
            f12955b.put(filterProperties$EdgeMode.edgeMode, filterProperties$EdgeMode);
        }
    }

    public static FilterProperties$EdgeMode getEnum(String str) {
        Map<String, FilterProperties$EdgeMode> map = f12955b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.edgeMode;
    }

    FilterProperties$EdgeMode(String str) {
        this.edgeMode = str;
    }
}
