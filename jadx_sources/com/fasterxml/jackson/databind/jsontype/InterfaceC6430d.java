package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import java.util.Collection;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.d */
/* JADX INFO: compiled from: TypeResolverBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6430d<T extends InterfaceC6430d<T>> {
    AbstractC6428b buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    AbstractC6431e buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.EnumC6265As enumC6265As);

    T init(JsonTypeInfo.EnumC6266Id enumC6266Id, InterfaceC6429c interfaceC6429c);

    T typeIdVisibility(boolean z11);

    T typeProperty(String str);

    default T withDefaultImpl(Class<?> cls) {
        return (T) defaultImpl(cls);
    }
}
