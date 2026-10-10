package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes45.dex */
public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    protected AnnotatedConstructor _annotated;
    protected final transient Constructor<?> _creator;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._creator = constructor;
    }

    public Object readResolve() {
        return new InnerClassProperty(this, this._annotated);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty == this.delegate ? this : new InnerClassProperty(settableBeanProperty, this._creator);
    }

    public Object writeReplace() {
        return this._annotated == null ? new InnerClassProperty(this, new AnnotatedConstructor(null, this._creator, null, null)) : this;
    }

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, AnnotatedConstructor annotatedConstructor) {
        super(settableBeanProperty);
        this._annotated = annotatedConstructor;
        Constructor<?> annotated = annotatedConstructor == null ? null : annotatedConstructor.getAnnotated();
        this._creator = annotated;
        if (annotated == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objNewInstance;
        Object objDeserializeWithType;
        if (jsonParser.mo10889k() == JsonToken.VALUE_NULL) {
            objDeserializeWithType = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
            if (abstractC6428b != null) {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
            } else {
                try {
                    objNewInstance = this._creator.newInstance(obj);
                } catch (Exception e11) {
                    C6490g.m11949m0(e11, String.format("Failed to instantiate class %s, problem: %s", this._creator.getDeclaringClass().getName(), e11.getMessage()));
                    objNewInstance = null;
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, objNewInstance);
                objDeserializeWithType = objNewInstance;
            }
        }
        set(obj, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }
}
