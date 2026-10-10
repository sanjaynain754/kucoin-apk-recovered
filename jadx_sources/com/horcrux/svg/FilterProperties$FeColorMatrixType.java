package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum FilterProperties$FeColorMatrixType {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: b */
    public static final Map<String, FilterProperties$FeColorMatrixType> f12959b = new HashMap();
    private final String type;

    static {
        for (FilterProperties$FeColorMatrixType filterProperties$FeColorMatrixType : values()) {
            f12959b.put(filterProperties$FeColorMatrixType.type, filterProperties$FeColorMatrixType);
        }
    }

    public static FilterProperties$FeColorMatrixType getEnum(String str) {
        Map<String, FilterProperties$FeColorMatrixType> map = f12959b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    FilterProperties$FeColorMatrixType(String str) {
        this.type = str;
    }
}
