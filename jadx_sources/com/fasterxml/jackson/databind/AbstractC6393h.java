package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Iterator;
import p528p7.InterfaceC43399e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.h */
/* JADX INFO: compiled from: JsonSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6393h<T> {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.h$a */
    /* JADX INFO: compiled from: JsonSerializer.java */
    public static abstract class a extends AbstractC6393h<Object> {
    }

    public AbstractC6393h<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(AbstractC6446m abstractC6446m, T t11) {
        return t11 == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public abstract void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    public boolean usesObjectId() {
        return false;
    }

    @Deprecated
    public boolean isEmpty(T t11) {
        return isEmpty(null, t11);
    }

    public AbstractC6393h<T> replaceDelegatee(AbstractC6393h<?> abstractC6393h) {
        throw new UnsupportedOperationException();
    }

    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95581k(javaType);
    }

    public Iterator<PropertyWriter> properties() {
        return C6490g.m11950n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        Class clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = t11.getClass();
        }
        abstractC6446m.reportBadDefinition((Class<?>) clsHandledType, String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsHandledType.getName(), getClass().getName()));
    }

    public AbstractC6393h<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6393h<?> withFilterId(Object obj) {
        return this;
    }
}
