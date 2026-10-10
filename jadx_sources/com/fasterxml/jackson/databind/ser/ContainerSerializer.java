package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public abstract ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e);

    public abstract AbstractC6393h<?> getContentSerializer();

    public abstract JavaType getContentType();

    @Deprecated
    public boolean hasContentTypeAnnotation(AbstractC6446m abstractC6446m, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t11);

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerSerializer<?> withValueTypeSerializer(AbstractC6431e abstractC6431e) {
        return abstractC6431e == null ? this : _withValueTypeSerializer(abstractC6431e);
    }

    public ContainerSerializer(Class<?> cls, boolean z11) {
        super(cls, z11);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
