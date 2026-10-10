package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.j */
/* JADX INFO: compiled from: NullValueProvider.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6375j {
    Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    default Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }
}
