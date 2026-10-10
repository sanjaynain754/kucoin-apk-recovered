package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType _containerType;
    protected final InterfaceC6375j _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public ContainerDeserializerBase(JavaType javaType, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = interfaceC6375j;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC6375j);
    }

    public abstract AbstractC6390e<Object> getContentDeserializer();

    @Deprecated
    public <BOGUS> BOGUS wrapAndThrow(Throwable th2, Object obj, String str) throws IOException {
        return (BOGUS) wrapAndThrow(null, th2, obj, str);
    }

    public JavaType getContentType() {
        JavaType javaType = this._containerType;
        return javaType == null ? TypeFactory.unknownType() : javaType.getContentType();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public <BOGUS> BOGUS wrapAndThrow(DeserializationContext deserializationContext, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C6490g.m11943j0(th2);
        }
        if (!(th2 instanceof IOException) || (th2 instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th2, obj, (String) C6490g.m11922Y(str, "N/A"));
        }
        throw ((IOException) th2);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public SettableBeanProperty findBackReference(String str) {
        AbstractC6390e<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e11) {
            return C6490g.m11937g0(deserializationContext, e11);
        }
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (InterfaceC6375j) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = interfaceC6375j;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC6375j);
    }
}
