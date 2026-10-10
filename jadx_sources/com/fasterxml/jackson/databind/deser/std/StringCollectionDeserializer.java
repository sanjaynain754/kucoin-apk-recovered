package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected final AbstractC6390e<Object> _delegateDeserializer;
    protected final AbstractC6390e<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, AbstractC6390e<?> abstractC6390e, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, abstractC6390e, abstractC6390e, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC6390e<?> abstractC6390e, AbstractC6390e<?> abstractC6390e2, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(javaType, interfaceC6375j, bool);
        this._valueDeserializer = abstractC6390e2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = abstractC6390e;
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return jsonParser.mo10890k0(JsonToken.VALUE_STRING) ? _deserializeFromString(jsonParser, deserializationContext) : (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        AbstractC6390e<String> abstractC6390e = this._valueDeserializer;
        if (jsonParser.mo10889k() != JsonToken.VALUE_NULL) {
            try {
                str_parseString = abstractC6390e == null ? _parseString(jsonParser, deserializationContext) : abstractC6390e.deserialize(jsonParser, deserializationContext);
            } catch (Exception e11) {
                throw JsonMappingException.wrapWithPath(e11, collection, collection.size());
            }
        } else {
            if (this._skipNullValues) {
                return collection;
            }
            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
        }
        collection.add(str_parseString);
        return collection;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390eFindDeserializer;
        AbstractC6390e<?> abstractC6390eHandleSecondaryContextualization;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            abstractC6390eFindDeserializer = null;
        } else if (valueInstantiator.getArrayDelegateCreator() != null) {
            abstractC6390eFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig()), beanProperty);
        } else if (this._valueInstantiator.getDelegateCreator() != null) {
            abstractC6390eFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
        } else {
            abstractC6390eFindDeserializer = null;
        }
        AbstractC6390e<String> abstractC6390e = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        if (abstractC6390e == null) {
            abstractC6390eHandleSecondaryContextualization = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC6390e);
            if (abstractC6390eHandleSecondaryContextualization == null) {
                abstractC6390eHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
            }
        } else {
            abstractC6390eHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC6390e, beanProperty, contentType);
        }
        return withResolved(abstractC6390eFindDeserializer, isDefaultDeserializer(abstractC6390eHandleSecondaryContextualization) ? null : abstractC6390eHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, abstractC6390eHandleSecondaryContextualization), findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
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
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public StringCollectionDeserializer withResolved(AbstractC6390e<?> abstractC6390e, AbstractC6390e<?> abstractC6390e2, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._nullProvider == interfaceC6375j && this._valueDeserializer == abstractC6390e2 && this._delegateDeserializer == abstractC6390e) ? this : new StringCollectionDeserializer(this._containerType, this._valueInstantiator, abstractC6390e, abstractC6390e2, interfaceC6375j, bool);
    }

    /* JADX INFO: renamed from: a */
    public final Collection<String> m11415a(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, AbstractC6390e<String> abstractC6390e) throws IOException {
        String strDeserialize;
        while (true) {
            try {
                if (jsonParser.mo10904s0() == null) {
                    JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
                    if (jsonTokenMo10889k == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        strDeserialize = abstractC6390e.deserialize(jsonParser, deserializationContext);
                    }
                } else {
                    strDeserialize = abstractC6390e.deserialize(jsonParser, deserializationContext);
                }
                collection.add(strDeserialize);
            } catch (Exception e11) {
                throw JsonMappingException.wrapWithPath(e11, collection, collection.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        if (!jsonParser.mo10898o0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        AbstractC6390e<String> abstractC6390e = this._valueDeserializer;
        if (abstractC6390e != null) {
            return m11415a(jsonParser, deserializationContext, collection, abstractC6390e);
        }
        while (true) {
            try {
                String strMo10904s0 = jsonParser.mo10904s0();
                if (strMo10904s0 != null) {
                    collection.add(strMo10904s0);
                } else {
                    JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
                    if (jsonTokenMo10889k == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        str_parseString = _parseString(jsonParser, deserializationContext);
                    }
                    collection.add(str_parseString);
                }
            } catch (Exception e11) {
                throw JsonMappingException.wrapWithPath(e11, collection, collection.size());
            }
        }
    }
}
