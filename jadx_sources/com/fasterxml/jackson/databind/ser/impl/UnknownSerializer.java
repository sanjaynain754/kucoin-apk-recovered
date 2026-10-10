package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super((Class<?>) Object.class);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (abstractC6446m.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(abstractC6446m, obj);
        }
        super.serialize(obj, jsonGenerator, abstractC6446m);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        if (abstractC6446m.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(abstractC6446m, obj);
        }
        super.serializeWithType(obj, jsonGenerator, abstractC6446m, abstractC6431e);
    }

    public void failForEmpty(AbstractC6446m abstractC6446m, Object obj) throws JsonMappingException {
        abstractC6446m.reportBadDefinition(handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()));
    }
}
