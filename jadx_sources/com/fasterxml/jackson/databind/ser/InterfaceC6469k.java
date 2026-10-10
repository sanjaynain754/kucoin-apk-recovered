package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.k */
/* JADX INFO: compiled from: Serializers.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6469k {
    /* JADX INFO: renamed from: a */
    AbstractC6393h<?> m11823a(SerializationConfig serializationConfig, ReferenceType referenceType, AbstractC6340b abstractC6340b, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h);

    /* JADX INFO: renamed from: b */
    AbstractC6393h<?> m11824b(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b);

    /* JADX INFO: renamed from: c */
    AbstractC6393h<?> m11825c(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, AbstractC6340b abstractC6340b, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h);

    /* JADX INFO: renamed from: d */
    AbstractC6393h<?> m11826d(SerializationConfig serializationConfig, MapLikeType mapLikeType, AbstractC6340b abstractC6340b, AbstractC6393h<Object> abstractC6393h, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h2);

    /* JADX INFO: renamed from: e */
    AbstractC6393h<?> m11827e(SerializationConfig serializationConfig, MapType mapType, AbstractC6340b abstractC6340b, AbstractC6393h<Object> abstractC6393h, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h2);

    /* JADX INFO: renamed from: f */
    AbstractC6393h<?> m11828f(SerializationConfig serializationConfig, ArrayType arrayType, AbstractC6340b abstractC6340b, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h);

    /* JADX INFO: renamed from: g */
    AbstractC6393h<?> m11829g(SerializationConfig serializationConfig, CollectionType collectionType, AbstractC6340b abstractC6340b, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h);
}
