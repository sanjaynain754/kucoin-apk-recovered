package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.e */
/* JADX INFO: compiled from: JsonDeserializer.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6390e<T> implements InterfaceC6375j {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.e$a */
    /* JADX INFO: compiled from: JsonDeserializer.java */
    public static abstract class a extends AbstractC6390e<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t11) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public AbstractC6390e<?> getDelegatee() {
        return null;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b, T t11) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
    }

    public SettableBeanProperty findBackReference(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }

    public AbstractC6390e<?> replaceDelegatee(AbstractC6390e<?> abstractC6390e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public AbstractC6390e<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }
}
