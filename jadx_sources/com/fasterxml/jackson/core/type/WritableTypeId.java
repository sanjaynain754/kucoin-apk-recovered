package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes45.dex */
public class WritableTypeId {

    /* JADX INFO: renamed from: a */
    public Object f10140a;

    /* JADX INFO: renamed from: b */
    public Class<?> f10141b;

    /* JADX INFO: renamed from: c */
    public Object f10142c;

    /* JADX INFO: renamed from: d */
    public String f10143d;

    /* JADX INFO: renamed from: e */
    public Inclusion f10144e;

    /* JADX INFO: renamed from: f */
    public JsonToken f10145f;

    /* JADX INFO: renamed from: g */
    public boolean f10146g;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.f10140a = obj;
        this.f10142c = obj2;
        this.f10145f = jsonToken;
    }
}
