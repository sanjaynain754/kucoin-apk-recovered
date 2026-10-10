package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.j */
/* JADX INFO: compiled from: SerializerFactory.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6468j {
    @Deprecated
    public abstract AbstractC6393h<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException;

    public AbstractC6393h<Object> createKeySerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6393h<Object> abstractC6393h) throws JsonMappingException {
        return createKeySerializer(abstractC6446m.getConfig(), javaType, abstractC6393h);
    }

    public abstract AbstractC6393h<Object> createSerializer(AbstractC6446m abstractC6446m, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC6431e createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC6468j withAdditionalKeySerializers(InterfaceC6469k interfaceC6469k);

    public abstract AbstractC6468j withAdditionalSerializers(InterfaceC6469k interfaceC6469k);

    public abstract AbstractC6468j withSerializerModifier(AbstractC6454c abstractC6454c);
}
