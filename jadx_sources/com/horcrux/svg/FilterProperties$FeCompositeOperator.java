package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum FilterProperties$FeCompositeOperator {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: b */
    public static final Map<String, FilterProperties$FeCompositeOperator> f12962b = new HashMap();
    private final String type;

    static {
        for (FilterProperties$FeCompositeOperator filterProperties$FeCompositeOperator : values()) {
            f12962b.put(filterProperties$FeCompositeOperator.type, filterProperties$FeCompositeOperator);
        }
    }

    public static FilterProperties$FeCompositeOperator getEnum(String str) {
        Map<String, FilterProperties$FeCompositeOperator> map = f12962b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    FilterProperties$FeCompositeOperator(String str) {
        this.type = str;
    }
}
