package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes45.dex */
public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, AbstractC6390e<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, AbstractC6390e<Object>> _incompleteDeserializers;

    public DeserializerCache() {
        this(2000);
    }

    public AbstractC6390e<Object> _createAndCache2(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390e_createDeserializer;
        try {
            abstractC6390e_createDeserializer = _createDeserializer(deserializationContext, abstractC6362g, javaType);
        } catch (IllegalArgumentException e11) {
            deserializationContext.reportBadDefinition(javaType, C6490g.m11952o(e11));
            abstractC6390e_createDeserializer = null;
        }
        if (abstractC6390e_createDeserializer == null) {
            return null;
        }
        boolean z11 = !m11213a(javaType) && abstractC6390e_createDeserializer.isCachable();
        if (abstractC6390e_createDeserializer instanceof InterfaceC6376k) {
            this._incompleteDeserializers.put(javaType, abstractC6390e_createDeserializer);
            ((InterfaceC6376k) abstractC6390e_createDeserializer).resolve(deserializationContext);
            this._incompleteDeserializers.remove(javaType);
        }
        if (z11) {
            this._cachedDeserializers.put(javaType, abstractC6390e_createDeserializer);
        }
        return abstractC6390e_createDeserializer;
    }

    /* JADX INFO: renamed from: b */
    public final Class<?> m11214b(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || C6490g.m11907J(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    public DeserializerCache(int i11) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._cachedDeserializers = new LRUMap<>(Math.min(64, i11 >> 2), i11);
    }

    public AbstractC6390e<Object> _createAndCacheValueDeserializer(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390e;
        synchronized (this._incompleteDeserializers) {
            try {
                AbstractC6390e<Object> abstractC6390e_findCachedDeserializer = _findCachedDeserializer(javaType);
                if (abstractC6390e_findCachedDeserializer != null) {
                    return abstractC6390e_findCachedDeserializer;
                }
                int size = this._incompleteDeserializers.size();
                if (size > 0 && (abstractC6390e = this._incompleteDeserializers.get(javaType)) != null) {
                    return abstractC6390e;
                }
                try {
                    AbstractC6390e<Object> abstractC6390e_createAndCache2 = _createAndCache2(deserializationContext, abstractC6362g, javaType);
                    if (size == 0 && this._incompleteDeserializers.size() > 0) {
                        this._incompleteDeserializers.clear();
                    }
                    return abstractC6390e_createAndCache2;
                } catch (Throwable th2) {
                    if (size == 0 && this._incompleteDeserializers.size() > 0) {
                        this._incompleteDeserializers.clear();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public AbstractC6390e<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (m11213a(javaType)) {
            return null;
        }
        return this._cachedDeserializers.get(javaType);
    }

    public AbstractC6394i _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return (AbstractC6394i) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public AbstractC6390e<Object> _createDeserializer(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = abstractC6362g.mapAbstractType(config, javaType);
        }
        AbstractC6340b abstractC6340bIntrospect = config.introspect(javaType);
        AbstractC6390e<Object> abstractC6390eFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, abstractC6340bIntrospect.mo11174t());
        if (abstractC6390eFindDeserializerFromAnnotation != null) {
            return abstractC6390eFindDeserializerFromAnnotation;
        }
        JavaType javaTypeM11215c = m11215c(deserializationContext, abstractC6340bIntrospect.mo11174t(), javaType);
        if (javaTypeM11215c != javaType) {
            abstractC6340bIntrospect = config.introspect(javaTypeM11215c);
            javaType = javaTypeM11215c;
        }
        Class<?> clsMo11167m = abstractC6340bIntrospect.mo11167m();
        if (clsMo11167m != null) {
            return abstractC6362g.createBuilderBasedDeserializer(deserializationContext, javaType, abstractC6340bIntrospect, clsMo11167m);
        }
        InterfaceC6491h<Object, Object> interfaceC6491hMo11160f = abstractC6340bIntrospect.mo11160f();
        if (interfaceC6491hMo11160f == null) {
            return _createDeserializer2(deserializationContext, abstractC6362g, javaType, abstractC6340bIntrospect);
        }
        JavaType javaTypeMo11360a = interfaceC6491hMo11160f.mo11360a(deserializationContext.getTypeFactory());
        if (!javaTypeMo11360a.hasRawClass(javaType.getRawClass())) {
            abstractC6340bIntrospect = config.introspect(javaTypeMo11360a);
        }
        return new StdDelegatingDeserializer(interfaceC6491hMo11160f, javaTypeMo11360a, _createDeserializer2(deserializationContext, abstractC6362g, javaTypeMo11360a, abstractC6340bIntrospect));
    }

    public AbstractC6390e<?> _createDeserializer2(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return abstractC6362g.createEnumDeserializer(deserializationContext, javaType, abstractC6340b);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return abstractC6362g.createArrayDeserializer(deserializationContext, (ArrayType) javaType, abstractC6340b);
            }
            if (javaType.isMapLikeType() && abstractC6340b.mo11161g(null).getShape() != JsonFormat.Shape.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType instanceof MapType) {
                    return abstractC6362g.createMapDeserializer(deserializationContext, (MapType) mapLikeType, abstractC6340b);
                }
                return abstractC6362g.createMapLikeDeserializer(deserializationContext, mapLikeType, abstractC6340b);
            }
            if (javaType.isCollectionLikeType() && abstractC6340b.mo11161g(null).getShape() != JsonFormat.Shape.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType instanceof CollectionType) {
                    return abstractC6362g.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, abstractC6340b);
                }
                return abstractC6362g.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, abstractC6340b);
            }
        }
        if (javaType.isReferenceType()) {
            return abstractC6362g.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, abstractC6340b);
        }
        if (AbstractC6391f.class.isAssignableFrom(javaType.getRawClass())) {
            return abstractC6362g.createTreeDeserializer(config, javaType, abstractC6340b);
        }
        return abstractC6362g.createBeanDeserializer(deserializationContext, javaType, abstractC6340b);
    }

    public AbstractC6390e<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        if (!C6490g.m11908K(javaType.getRawClass())) {
            return (AbstractC6390e) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (AbstractC6390e) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11213a(JavaType javaType) {
        if (javaType.isContainerType()) {
            JavaType contentType = javaType.getContentType();
            if (contentType != null && (contentType.getValueHandler() != null || contentType.getTypeHandler() != null)) {
                return true;
            }
            if (javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final JavaType m11215c(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        Object objFindContentDeserializer;
        AbstractC6390e<Object> abstractC6390eDeserializerInstance;
        JavaType keyType;
        Object objFindKeyDeserializer;
        AbstractC6394i abstractC6394iKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && (keyType = javaType.getKeyType()) != null && keyType.getValueHandler() == null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(abstractC6404a)) != null && (abstractC6394iKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(abstractC6404a, objFindKeyDeserializer)) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(abstractC6394iKeyDeserializerInstance);
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(abstractC6404a)) != null) {
            if (objFindContentDeserializer instanceof AbstractC6390e) {
                abstractC6390eDeserializerInstance = (AbstractC6390e) objFindContentDeserializer;
            } else {
                Class<?> clsM11214b = m11214b(objFindContentDeserializer, "findContentDeserializer", AbstractC6390e.a.class);
                if (clsM11214b != null) {
                    abstractC6390eDeserializerInstance = deserializationContext.deserializerInstance(abstractC6404a, clsM11214b);
                } else {
                    abstractC6390eDeserializerInstance = null;
                }
            }
            if (abstractC6390eDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(abstractC6390eDeserializerInstance);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), abstractC6404a, javaType);
    }

    public InterfaceC6491h<Object, Object> findConverter(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(abstractC6404a);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(abstractC6404a, objFindDeserializationConverter);
    }

    public AbstractC6390e<Object> findConvertingDeserializer(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a, AbstractC6390e<Object> abstractC6390e) throws JsonMappingException {
        InterfaceC6491h<Object, Object> interfaceC6491hFindConverter = findConverter(deserializationContext, abstractC6404a);
        if (interfaceC6491hFindConverter == null) {
            return abstractC6390e;
        }
        return new StdDelegatingDeserializer(interfaceC6491hFindConverter, interfaceC6491hFindConverter.mo11360a(deserializationContext.getTypeFactory()), abstractC6390e);
    }

    public AbstractC6390e<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, AbstractC6404a abstractC6404a) throws JsonMappingException {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(abstractC6404a);
        if (objFindDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, abstractC6404a, deserializationContext.deserializerInstance(abstractC6404a, objFindDeserializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6394i findKeyDeserializer(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        AbstractC6394i abstractC6394iCreateKeyDeserializer = abstractC6362g.createKeyDeserializer(deserializationContext, javaType);
        if (abstractC6394iCreateKeyDeserializer == 0) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (abstractC6394iCreateKeyDeserializer instanceof InterfaceC6376k) {
            ((InterfaceC6376k) abstractC6394iCreateKeyDeserializer).resolve(deserializationContext);
        }
        return abstractC6394iCreateKeyDeserializer;
    }

    public AbstractC6390e<Object> findValueDeserializer(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390e_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (abstractC6390e_findCachedDeserializer == null) {
            AbstractC6390e<Object> abstractC6390e_createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, abstractC6362g, javaType);
            if (abstractC6390e_createAndCacheValueDeserializer == null) {
                return _handleUnknownValueDeserializer(deserializationContext, javaType);
            }
            return abstractC6390e_createAndCacheValueDeserializer;
        }
        return abstractC6390e_findCachedDeserializer;
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, AbstractC6362g abstractC6362g, JavaType javaType) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390e_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (abstractC6390e_findCachedDeserializer == null) {
            abstractC6390e_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, abstractC6362g, javaType);
        }
        if (abstractC6390e_findCachedDeserializer != null) {
            return true;
        }
        return false;
    }
}
