package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes45.dex */
public abstract class TypeDeserializerBase extends AbstractC6428b implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected AbstractC6390e<Object> _defaultImplDeserializer;
    protected final Map<String, AbstractC6390e<Object>> _deserializers;
    protected final InterfaceC6429c _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    public TypeDeserializerBase(JavaType javaType, InterfaceC6429c interfaceC6429c, String str, boolean z11, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = interfaceC6429c;
        this._typePropertyName = C6490g.m11923Z(str);
        this._typeIdVisible = z11;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.mo10876b0());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public abstract AbstractC6428b forProperty(BeanProperty beanProperty);

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public abstract JsonTypeInfo.EnumC6265As getTypeInclusion();

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        AbstractC6390e<Object> abstractC6390e_findDeserializer;
        if (obj == null) {
            abstractC6390e_findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (abstractC6390e_findDeserializer == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            abstractC6390e_findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return abstractC6390e_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final AbstractC6390e<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        AbstractC6390e<Object> abstractC6390e;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (C6490g.m11907J(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            try {
                if (this._defaultImplDeserializer == null) {
                    this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
                }
                abstractC6390e = this._defaultImplDeserializer;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC6390e;
    }

    public final AbstractC6390e<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        AbstractC6390e<Object> abstractC6390eFindContextualValueDeserializer = this._deserializers.get(str);
        if (abstractC6390eFindContextualValueDeserializer == null) {
            JavaType javaTypeMo11685c = this._idResolver.mo11685c(deserializationContext, str);
            if (javaTypeMo11685c == null) {
                abstractC6390eFindContextualValueDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (abstractC6390eFindContextualValueDeserializer == null) {
                    JavaType javaType_handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (javaType_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    abstractC6390eFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleUnknownTypeId, this._property);
                }
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == javaTypeMo11685c.getClass() && !javaTypeMo11685c.hasGenericTypes()) {
                    try {
                        javaTypeMo11685c = deserializationContext.constructSpecializedType(this._baseType, javaTypeMo11685c.getRawClass());
                    } catch (IllegalArgumentException e11) {
                        throw deserializationContext.invalidTypeIdException(this._baseType, str, e11.getMessage());
                    }
                }
                abstractC6390eFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaTypeMo11685c, this._property);
            }
            this._deserializers.put(str, abstractC6390eFindContextualValueDeserializer);
        }
        return abstractC6390eFindContextualValueDeserializer;
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        String strMo11684b = this._idResolver.mo11684b();
        if (strMo11684b == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + strMo11684b;
        }
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, beanProperty.getName());
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, str2);
    }

    public JavaType baseType() {
        return this._baseType;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Class<?> getDefaultImpl() {
        return C6490g.m11931d0(this._defaultImpl);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public InterfaceC6429c getTypeIdResolver() {
        return this._idResolver;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public boolean hasDefaultImpl() {
        return this._defaultImpl != null;
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + ']';
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
