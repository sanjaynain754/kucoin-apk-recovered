package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes45.dex */
public final class TypeWrappedDeserializer extends AbstractC6390e<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC6390e<Object> _deserializer;
    protected final AbstractC6428b _typeDeserializer;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<?> getDelegatee() {
        return this._deserializer.getDelegatee();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Class<?> handledType() {
        return this._deserializer.handledType();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return this._deserializer.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._deserializer.supportsUpdate(deserializationConfig);
    }

    public TypeWrappedDeserializer(AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        this._typeDeserializer = abstractC6428b;
        this._deserializer = abstractC6390e;
    }
}
