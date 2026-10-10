package com.fasterxml.jackson.databind.ser.std;

import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
    public final String valueToString(Object obj) {
        return obj.toString();
    }
}
