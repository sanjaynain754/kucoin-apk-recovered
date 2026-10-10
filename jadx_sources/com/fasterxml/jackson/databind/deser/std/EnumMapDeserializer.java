package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.InterfaceC6376k;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C6372g;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes45.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements InterfaceC6358c, InterfaceC6376k {
    private static final long serialVersionUID = 1;
    protected AbstractC6390e<Object> _delegateDeserializer;
    protected final Class<?> _enumClass;
    protected AbstractC6394i _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected AbstractC6390e<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC6428b _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC6394i abstractC6394i, AbstractC6390e<?> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j) {
        super(javaType, interfaceC6375j, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = abstractC6394i;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._valueInstantiator = valueInstantiator;
    }

    public EnumMap<?, ?> _deserializeUsingProperties(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, null);
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            strMo10887j = jsonParser.mo10890k0(JsonToken.FIELD_NAME) ? jsonParser.mo10887j() : null;
        }
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (settableBeanPropertyM11300e == null) {
                Enum r11 = (Enum) this._keyDeserializer.deserializeKey(strMo10887j, deserializationContext);
                if (r11 != null) {
                    try {
                        if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                            AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
                            objDeserialize = abstractC6428b == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                        } else if (!this._skipNullValues) {
                            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        c6372gM11302g.m11367d(r11, objDeserialize);
                    } catch (Exception e11) {
                        wrapAndThrow(deserializationContext, e11, this._containerType.getRawClass(), strMo10887j);
                        return null;
                    }
                } else {
                    if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strMo10887j, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                    }
                    jsonParser.mo10905t0();
                    jsonParser.mo10856C0();
                }
            } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, settableBeanPropertyM11300e.deserialize(jsonParser, deserializationContext))) {
                jsonParser.mo10905t0();
                try {
                    return deserialize(jsonParser, deserializationContext, (EnumMap) propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g));
                } catch (Exception e12) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e12, this._containerType.getRawClass(), strMo10887j);
                }
            }
            strMo10887j = jsonParser.mo10903r0();
        }
        try {
            return (EnumMap) propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
        } catch (Exception e13) {
            wrapAndThrow(deserializationContext, e13, this._containerType.getRawClass(), strMo10887j);
            return null;
        }
    }

    public EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
            try {
                return !valueInstantiator.canCreateUsingDefault() ? (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]) : (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            e = e12;
        }
        return (EnumMap) C6490g.m11937g0(deserializationContext, e);
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6394i abstractC6394iFindKeyDeserializer = this._keyDeserializer;
        if (abstractC6394iFindKeyDeserializer == null) {
            abstractC6394iFindKeyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        AbstractC6390e<?> abstractC6390e = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390e == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390e, beanProperty, contentType);
        AbstractC6428b abstractC6428bForProperty = this._valueTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        return withResolved(abstractC6394iFindKeyDeserializer, abstractC6390eFindContextualValueDeserializer, abstractC6428bForProperty, findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC6390e<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6376k
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    JavaType javaType = this._containerType;
                    deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
                return;
            }
            if (!this._valueInstantiator.canCreateUsingArrayDelegate()) {
                if (this._valueInstantiator.canCreateFromObjectWith()) {
                    this._propertyBasedCreator = PropertyBasedCreator.m11297c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    return;
                }
                return;
            }
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
    }

    public EnumMapDeserializer withResolved(AbstractC6394i abstractC6394i, AbstractC6390e<?> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j) {
        return (abstractC6394i == this._keyDeserializer && interfaceC6375j == this._nullProvider && abstractC6390e == this._valueDeserializer && abstractC6428b == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this, abstractC6394i, abstractC6390e, abstractC6428b, interfaceC6375j);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 1 && iMo10891l != 2) {
            if (iMo10891l == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iMo10891l != 5) {
                if (iMo10891l != 6) {
                    return (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                return _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructMap(deserializationContext);
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, AbstractC6394i abstractC6394i, AbstractC6390e<?> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j) {
        super(enumMapDeserializer, interfaceC6375j, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = abstractC6394i;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String strMo10887j;
        Object objDeserializeWithType;
        jsonParser.mo10916z0(enumMap);
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenMo10889k != jsonToken) {
                if (jsonTokenMo10889k != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
                return enumMap;
            }
            strMo10887j = jsonParser.mo10887j();
        }
        while (strMo10887j != null) {
            Enum r11 = (Enum) this._keyDeserializer.deserializeKey(strMo10887j, deserializationContext);
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (r11 == null) {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strMo10887j, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                }
                jsonParser.mo10856C0();
            } else {
                try {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC6428b == null) {
                        objDeserializeWithType = abstractC6390e.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    }
                    enumMap.put(r11, objDeserializeWithType);
                } catch (Exception e11) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e11, enumMap, strMo10887j);
                }
            }
            strMo10887j = jsonParser.mo10903r0();
        }
        return enumMap;
    }

    @Deprecated
    public EnumMapDeserializer(JavaType javaType, AbstractC6394i abstractC6394i, AbstractC6390e<?> abstractC6390e, AbstractC6428b abstractC6428b) {
        this(javaType, null, abstractC6394i, abstractC6390e, abstractC6428b, null);
    }
}
