package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import java.lang.reflect.Type;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class ToEmptyObjectSerializer extends StdSerializer<Object> {
    public ToEmptyObjectSerializer(Class<?> cls) {
        super(cls, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10784A0(obj, 0);
        jsonGenerator.mo10806X();
    }

    public ToEmptyObjectSerializer(JavaType javaType) {
        super(javaType);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        abstractC6431e.mo11696h(jsonGenerator, abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(obj, JsonToken.START_OBJECT)));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo11794d(javaType);
    }
}
