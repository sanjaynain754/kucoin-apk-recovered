package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import java.lang.reflect.Type;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    public StdScalarSerializer(Class<?> cls, boolean z11) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(t11, JsonToken.VALUE_STRING));
        serialize(t11, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    public StdScalarSerializer(StdScalarSerializer<?> stdScalarSerializer) {
        super(stdScalarSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        visitStringFormat(interfaceC43399e, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }
}
