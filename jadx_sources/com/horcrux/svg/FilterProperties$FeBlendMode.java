package com.horcrux.svg;

import com.tencent.bugly.proguard.C33789m5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum FilterProperties$FeBlendMode {
    UNKNOWN("unknown"),
    NORMAL(C33789m5.f70921k),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: b */
    public static final Map<String, FilterProperties$FeBlendMode> f12957b = new HashMap();
    private final String mode;

    static {
        for (FilterProperties$FeBlendMode filterProperties$FeBlendMode : values()) {
            f12957b.put(filterProperties$FeBlendMode.mode, filterProperties$FeBlendMode);
        }
    }

    public static FilterProperties$FeBlendMode getEnum(String str) {
        Map<String, FilterProperties$FeBlendMode> map = f12957b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mode;
    }

    FilterProperties$FeBlendMode(String str) {
        this.mode = str;
    }
}
