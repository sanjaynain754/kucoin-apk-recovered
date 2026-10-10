package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC6390e<Object> _deserializer;
    protected final JavaType _idType;
    public final ObjectIdGenerator<?> generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final InterfaceC6269a0 resolver;

    public static ObjectIdReader construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC6390e<?> abstractC6390e, SettableBeanProperty settableBeanProperty, InterfaceC6269a0 interfaceC6269a0) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, abstractC6390e, settableBeanProperty, interfaceC6269a0);
    }

    public AbstractC6390e<Object> getDeserializer() {
        return this._deserializer;
    }

    public JavaType getIdType() {
        return this._idType;
    }

    public boolean isValidReferencePropertyName(String str, JsonParser jsonParser) {
        return this.generator.isValidReferencePropertyName(str, jsonParser);
    }

    public boolean maySerializeAsObject() {
        return this.generator.maySerializeAsObject();
    }

    public Object readObjectReference(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext);
    }

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC6390e<?> abstractC6390e, SettableBeanProperty settableBeanProperty, InterfaceC6269a0 interfaceC6269a0) {
        this._idType = javaType;
        this.propertyName = propertyName;
        this.generator = objectIdGenerator;
        this.resolver = interfaceC6269a0;
        this._deserializer = abstractC6390e;
        this.idProperty = settableBeanProperty;
    }
}
