package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.InterfaceC6376k;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements InterfaceC6358c, InterfaceC6376k {
    private static final long serialVersionUID = 1;
    protected final InterfaceC6491h<Object, T> _converter;
    protected final AbstractC6390e<Object> _delegateDeserializer;
    protected final JavaType _delegateType;

    public StdDelegatingDeserializer(InterfaceC6491h<?, T> interfaceC6491h) {
        super((Class<?>) Object.class);
        this._converter = interfaceC6491h;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    public Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this._delegateType));
    }

    public T convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            AbstractC6390e<?> abstractC6390eHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC6390e, beanProperty, this._delegateType);
            return abstractC6390eHandleSecondaryContextualization != this._delegateDeserializer ? withDelegate(this._converter, this._delegateType, abstractC6390eHandleSecondaryContextualization) : this;
        }
        JavaType javaTypeMo11360a = this._converter.mo11360a(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, javaTypeMo11360a, deserializationContext.findContextualValueDeserializer(javaTypeMo11360a, beanProperty));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<?> getDelegatee() {
        return this._delegateDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return this._delegateDeserializer.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6376k
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        InterfaceC6375j interfaceC6375j = this._delegateDeserializer;
        if (interfaceC6375j == null || !(interfaceC6375j instanceof InterfaceC6376k)) {
            return;
        }
        ((InterfaceC6376k) interfaceC6375j).resolve(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegateDeserializer.supportsUpdate(deserializationConfig);
    }

    public StdDelegatingDeserializer<T> withDelegate(InterfaceC6491h<Object, T> interfaceC6491h, JavaType javaType, AbstractC6390e<?> abstractC6390e) {
        C6490g.m11951n0(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(interfaceC6491h, javaType, abstractC6390e);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._delegateType.getRawClass().isAssignableFrom(obj.getClass())) {
            return (T) this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj);
        }
        return (T) _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }

    public StdDelegatingDeserializer(InterfaceC6491h<Object, T> interfaceC6491h, JavaType javaType, AbstractC6390e<?> abstractC6390e) {
        super(javaType);
        this._converter = interfaceC6491h;
        this._delegateType = javaType;
        this._delegateDeserializer = abstractC6390e;
    }

    public StdDelegatingDeserializer(StdDelegatingDeserializer<T> stdDelegatingDeserializer) {
        super(stdDelegatingDeserializer);
        this._converter = stdDelegatingDeserializer._converter;
        this._delegateType = stdDelegatingDeserializer._delegateType;
        this._delegateDeserializer = stdDelegatingDeserializer._delegateDeserializer;
    }
}
