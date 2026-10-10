package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.annotation.InterfaceC6294y;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public enum JsonFormatTypes {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;


    /* JADX INFO: renamed from: b */
    public static final Map<String, JsonFormatTypes> f10521b = new HashMap();

    static {
        for (JsonFormatTypes jsonFormatTypes : values()) {
            f10521b.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }

    @JsonCreator
    public static JsonFormatTypes forValue(String str) {
        return f10521b.get(str);
    }

    @InterfaceC6294y
    public String value() {
        return name().toLowerCase();
    }
}
