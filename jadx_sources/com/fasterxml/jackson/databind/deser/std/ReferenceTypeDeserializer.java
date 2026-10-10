package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements InterfaceC6358c {
    private static final long serialVersionUID = 2;
    protected final JavaType _fullType;
    protected final AbstractC6390e<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC6428b _valueTypeDeserializer;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        super(javaType);
        this._valueInstantiator = valueInstantiator;
        this._fullType = javaType;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            return (T) deserialize(jsonParser, deserializationContext, valueInstantiator.createUsingDefault(deserializationContext));
        }
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        return (T) referenceValue(abstractC6428b == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public abstract T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    public abstract Object getReferenced(T t11);

    public abstract T referenceValue(Object obj);

    public abstract T updateReference(T t11, Object obj);

    public abstract ReferenceTypeDeserializer<T> withResolved(AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e);

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390e = this._valueDeserializer;
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390e == null ? deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390e, beanProperty, this._fullType.getReferencedType());
        AbstractC6428b abstractC6428bForProperty = this._valueTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        return (abstractC6390eFindContextualValueDeserializer == this._valueDeserializer && abstractC6428bForProperty == this._valueTypeDeserializer) ? this : withResolved(abstractC6428bForProperty, abstractC6390eFindContextualValueDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            return getNullValue(deserializationContext);
        }
        AbstractC6428b abstractC6428b2 = this._valueTypeDeserializer;
        return abstractC6428b2 == null ? deserialize(jsonParser, deserializationContext) : referenceValue(abstractC6428b2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._fullType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        return abstractC6390e != null ? abstractC6390e.logicalType() : super.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        if (abstractC6390e == null) {
            return null;
        }
        return abstractC6390e.supportsUpdate(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public ReferenceTypeDeserializer(JavaType javaType, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        this(javaType, null, abstractC6428b, abstractC6390e);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t11) throws IOException {
        Object objDeserializeWithType;
        Object objDeserializeWithType2;
        if (!this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) && this._valueTypeDeserializer == null) {
            Object referenced = getReferenced(t11);
            if (referenced == null) {
                AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
                if (abstractC6428b == null) {
                    objDeserializeWithType2 = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    objDeserializeWithType2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                }
                return referenceValue(objDeserializeWithType2);
            }
            objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        } else {
            AbstractC6428b abstractC6428b2 = this._valueTypeDeserializer;
            if (abstractC6428b2 == null) {
                objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b2);
            }
        }
        return updateReference(t11, objDeserializeWithType);
    }
}
