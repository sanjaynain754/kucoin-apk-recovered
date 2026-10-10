package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6406c;
import java.util.Collection;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.a */
/* JADX INFO: compiled from: SubtypeResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6427a {
    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedMember, javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public abstract void registerSubtypes(Collection<Class<?>> collection);

    public abstract void registerSubtypes(NamedType... namedTypeArr);

    public abstract void registerSubtypes(Class<?>... clsArr);

    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(C6406c c6406c, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypesByClass(mapperConfig, c6406c);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, C6406c c6406c) {
        return collectAndResolveSubtypes(c6406c, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, C6406c c6406c) {
        return collectAndResolveSubtypes(c6406c, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public AbstractC6427a copy() {
        return this;
    }
}
