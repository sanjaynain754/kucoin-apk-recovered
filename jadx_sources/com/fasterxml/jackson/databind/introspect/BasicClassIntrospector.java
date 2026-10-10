package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class BasicClassIntrospector extends AbstractC6415l implements Serializable {
    protected static final C6413j BOOLEAN_DESC;
    protected static final C6413j INT_DESC;
    protected static final C6413j LONG_DESC;
    protected static final C6413j OBJECT_DESC;
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f10374b = Object.class;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f10375c = String.class;

    /* JADX INFO: renamed from: d */
    public static final Class<?> f10376d = AbstractC6391f.class;
    protected static final C6413j STRING_DESC = C6413j.m11518K(null, SimpleType.constructUnsafe(String.class), C6407d.m11475h(String.class));

    public C6420q collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar, boolean z11) {
        C6406c c6406c_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        return constructPropertyCollector(mapperConfig, c6406c_resolveAnnotatedClass, javaType, z11, javaType.isRecordType() ? mapperConfig.getAccessorNaming().forRecord(mapperConfig, c6406c_resolveAnnotatedClass) : mapperConfig.getAccessorNaming().forPOJO(mapperConfig, c6406c_resolveAnnotatedClass));
    }

    public C6420q collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar, AbstractC6340b abstractC6340b, boolean z11) {
        C6406c c6406c_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        return constructPropertyCollector(mapperConfig, c6406c_resolveAnnotatedClass, javaType, z11, mapperConfig.getAccessorNaming().forBuilder(mapperConfig, c6406c_resolveAnnotatedClass, abstractC6340b));
    }

    public C6420q constructPropertyCollector(MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType, boolean z11, AccessorNamingStrategy accessorNamingStrategy) {
        return new C6420q(mapperConfig, z11, javaType, c6406c, accessorNamingStrategy);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public /* bridge */ /* synthetic */ AbstractC6340b forClassAnnotations(MapperConfig mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        return forClassAnnotations((MapperConfig<?>) mapperConfig, javaType, aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public /* bridge */ /* synthetic */ AbstractC6340b forDirectClassAnnotations(MapperConfig mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        return forDirectClassAnnotations((MapperConfig<?>) mapperConfig, javaType, aVar);
    }

    static {
        Class cls = Boolean.TYPE;
        BOOLEAN_DESC = C6413j.m11518K(null, SimpleType.constructUnsafe(cls), C6407d.m11475h(cls));
        Class cls2 = Integer.TYPE;
        INT_DESC = C6413j.m11518K(null, SimpleType.constructUnsafe(cls2), C6407d.m11475h(cls2));
        Class cls3 = Long.TYPE;
        LONG_DESC = C6413j.m11518K(null, SimpleType.constructUnsafe(cls3), C6407d.m11475h(cls3));
        OBJECT_DESC = C6413j.m11518K(null, SimpleType.constructUnsafe(Object.class), C6407d.m11475h(Object.class));
    }

    @Deprecated
    public C6420q constructPropertyCollector(MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType, boolean z11, String str) {
        return new C6420q(mapperConfig, z11, javaType, c6406c, str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public AbstractC6415l copy() {
        return new BasicClassIntrospector();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        C6413j c6413j_findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return c6413j_findStdTypeDesc == null ? C6413j.m11518K(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, aVar)) : c6413j_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forCreation(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6415l.a aVar) {
        C6413j c6413j_findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        return (c6413j_findStdTypeDesc == null && (c6413j_findStdTypeDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType)) == null) ? C6413j.m11517J(collectProperties(deserializationConfig, javaType, aVar, false)) : c6413j_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6415l.a aVar) {
        C6413j c6413j_findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        return (c6413j_findStdTypeDesc == null && (c6413j_findStdTypeDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType)) == null) ? C6413j.m11517J(collectProperties(deserializationConfig, javaType, aVar, false)) : c6413j_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        C6413j c6413j_findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return c6413j_findStdTypeDesc == null ? C6413j.m11518K(mapperConfig, javaType, _resolveAnnotatedWithoutSuperTypes(mapperConfig, javaType, aVar)) : c6413j_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forSerialization(SerializationConfig serializationConfig, JavaType javaType, AbstractC6415l.a aVar) {
        C6413j c6413j_findStdTypeDesc = _findStdTypeDesc(serializationConfig, javaType);
        return (c6413j_findStdTypeDesc == null && (c6413j_findStdTypeDesc = _findStdJdkCollectionDesc(serializationConfig, javaType)) == null) ? C6413j.m11519L(collectProperties(serializationConfig, javaType, aVar, true)) : c6413j_findStdTypeDesc;
    }

    public C6413j _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return C6413j.m11518K(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    public C6413j _findStdTypeDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass == Integer.TYPE) {
                return INT_DESC;
            }
            if (rawClass == Long.TYPE) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.TYPE) {
                return BOOLEAN_DESC;
            }
            return null;
        }
        if (C6490g.m11910M(rawClass)) {
            if (rawClass == f10374b) {
                return OBJECT_DESC;
            }
            if (rawClass == f10375c) {
                return STRING_DESC;
            }
            if (rawClass == Integer.class) {
                return INT_DESC;
            }
            if (rawClass == Long.class) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.class) {
                return BOOLEAN_DESC;
            }
            return null;
        }
        if (f10376d.isAssignableFrom(rawClass)) {
            return C6413j.m11518K(mapperConfig, javaType, C6407d.m11475h(rawClass));
        }
        return null;
    }

    public boolean _isStdJDKCollection(JavaType javaType) {
        if (javaType.isContainerType() && !javaType.isArrayType()) {
            Class<?> rawClass = javaType.getRawClass();
            if (C6490g.m11910M(rawClass) && (Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass))) {
                return true;
            }
        }
        return false;
    }

    public C6406c _resolveAnnotatedClass(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        return C6407d.m11476i(mapperConfig, javaType, aVar);
    }

    public C6406c _resolveAnnotatedWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        return C6407d.m11477m(mapperConfig, javaType, aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    public C6413j forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6415l.a aVar, AbstractC6340b abstractC6340b) {
        return C6413j.m11517J(collectPropertiesWithBuilder(deserializationConfig, javaType, aVar, abstractC6340b, false));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l
    @Deprecated
    public C6413j forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6415l.a aVar) {
        return C6413j.m11517J(collectPropertiesWithBuilder(deserializationConfig, javaType, aVar, null, false));
    }

    @Deprecated
    public C6420q collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar, boolean z11) {
        return collectPropertiesWithBuilder(mapperConfig, javaType, aVar, null, z11);
    }

    @Deprecated
    public C6420q collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar, boolean z11, String str) {
        C6406c c6406c_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        return constructPropertyCollector(mapperConfig, c6406c_resolveAnnotatedClass, javaType, z11, new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, c6406c_resolveAnnotatedClass));
    }
}
