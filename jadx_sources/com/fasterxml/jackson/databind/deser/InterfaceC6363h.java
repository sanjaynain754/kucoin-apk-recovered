package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.h */
/* JADX INFO: compiled from: Deserializers.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6363h {
    /* JADX INFO: renamed from: a */
    AbstractC6390e<?> m11278a(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException;

    /* JADX INFO: renamed from: b */
    AbstractC6390e<?> m11279b(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;

    /* JADX INFO: renamed from: c */
    AbstractC6390e<?> m11280c(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;

    /* JADX INFO: renamed from: d */
    AbstractC6390e<?> m11281d(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;

    /* JADX INFO: renamed from: e */
    AbstractC6390e<?> m11282e(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException;

    /* JADX INFO: renamed from: f */
    AbstractC6390e<?> m11283f(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;

    /* JADX INFO: renamed from: g */
    AbstractC6390e<?> m11284g(Class<? extends AbstractC6391f> cls, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException;

    /* JADX INFO: renamed from: h */
    AbstractC6390e<?> m11285h(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;

    /* JADX INFO: renamed from: i */
    AbstractC6390e<?> m11286i(MapType mapType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b, AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) throws JsonMappingException;
}
