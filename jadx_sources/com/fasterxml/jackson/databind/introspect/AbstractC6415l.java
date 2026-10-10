package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.l */
/* JADX INFO: compiled from: ClassIntrospector.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6415l {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.l$a */
    /* JADX INFO: compiled from: ClassIntrospector.java */
    public interface a {
        a copy();

        Class<?> findMixInClassFor(Class<?> cls);
    }

    public abstract AbstractC6415l copy();

    public abstract AbstractC6340b forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract AbstractC6340b forCreation(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract AbstractC6340b forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    @Deprecated
    public abstract AbstractC6340b forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract AbstractC6340b forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, a aVar, AbstractC6340b abstractC6340b);

    public abstract AbstractC6340b forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract AbstractC6340b forSerialization(SerializationConfig serializationConfig, JavaType javaType, a aVar);
}
