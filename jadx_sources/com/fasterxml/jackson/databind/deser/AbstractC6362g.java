package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractC6339a;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.g */
/* JADX INFO: compiled from: DeserializerFactory.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6362g {
    protected static final InterfaceC6363h[] NO_DESERIALIZERS = new InterfaceC6363h[0];

    public abstract AbstractC6390e<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b, Class<?> cls) throws JsonMappingException;

    public abstract AbstractC6390e<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6394i createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC6390e<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6390e<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract AbstractC6428b findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) throws JsonMappingException;

    public abstract boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC6362g withAbstractTypeResolver(AbstractC6339a abstractC6339a);

    public abstract AbstractC6362g withAdditionalDeserializers(InterfaceC6363h interfaceC6363h);

    public abstract AbstractC6362g withAdditionalKeyDeserializers(InterfaceC6364i interfaceC6364i);

    public abstract AbstractC6362g withDeserializerModifier(AbstractC6357b abstractC6357b);

    public abstract AbstractC6362g withValueInstantiators(InterfaceC6378m interfaceC6378m);
}
