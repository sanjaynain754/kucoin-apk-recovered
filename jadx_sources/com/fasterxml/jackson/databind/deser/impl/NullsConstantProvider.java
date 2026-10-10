package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class NullsConstantProvider implements InterfaceC6375j, Serializable {

    /* JADX INFO: renamed from: b */
    public static final NullsConstantProvider f10271b = new NullsConstantProvider(null);

    /* JADX INFO: renamed from: c */
    public static final NullsConstantProvider f10272c = new NullsConstantProvider(null);
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? f10272c : new NullsConstantProvider(obj);
    }

    public static boolean isNuller(InterfaceC6375j interfaceC6375j) {
        return interfaceC6375j == f10272c;
    }

    public static boolean isSkipper(InterfaceC6375j interfaceC6375j) {
        return interfaceC6375j == f10271b;
    }

    public static NullsConstantProvider nuller() {
        return f10272c;
    }

    public static NullsConstantProvider skipper() {
        return f10271b;
    }

    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }

    public NullsConstantProvider(Object obj) {
        AccessPattern accessPattern;
        this._nullValue = obj;
        if (obj == null) {
            accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            accessPattern = AccessPattern.CONSTANT;
        }
        this._access = accessPattern;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return super.getAbsentValue(deserializationContext);
    }
}
