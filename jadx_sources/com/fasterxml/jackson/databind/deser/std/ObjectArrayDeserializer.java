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
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6495l;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements InterfaceC6358c {
    private static final long serialVersionUID = 1;
    protected final Class<?> _elementClass;
    protected AbstractC6390e<Object> _elementDeserializer;
    protected final AbstractC6428b _elementTypeDeserializer;
    protected final Object[] _emptyValue;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        super(javaType, (InterfaceC6375j) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = abstractC6390e;
        this._elementTypeDeserializer = abstractC6428b;
        this._emptyValue = arrayType.getEmptyArray();
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390e = this._elementDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC6390e<?> abstractC6390eFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC6390e);
        JavaType contentType = this._containerType.getContentType();
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390eFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390eFindConvertingContentDeserializer, beanProperty, contentType);
        AbstractC6428b abstractC6428bForProperty = this._elementTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        return withResolved(abstractC6428bForProperty, abstractC6390eFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return (Object[]) abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC6390e<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._emptyValue;
    }

    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
                return this._elementClass == Byte.class ? deserializeFromBase64(jsonParser, deserializationContext) : _deserializeFromString(jsonParser, deserializationContext);
            }
            return (Object[]) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        if (!jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            AbstractC6428b abstractC6428b = this._elementTypeDeserializer;
            objDeserialize = abstractC6428b == null ? this._elementDeserializer.deserialize(jsonParser, deserializationContext) : this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
        } else {
            if (this._skipNullValues) {
                return this._emptyValue;
            }
            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
        }
        Object[] objArr = this._untyped ? new Object[1] : (Object[]) Array.newInstance(this._elementClass, 1);
        objArr[0] = objDeserialize;
        return objArr;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public ObjectArrayDeserializer withDeserializer(AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        return withResolved(abstractC6428b, abstractC6390e, this._nullProvider, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && interfaceC6375j == this._nullProvider && abstractC6390e == this._elementDeserializer && abstractC6428b == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, abstractC6390e, abstractC6428b, interfaceC6375j, bool);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArrM11984g;
        Object objDeserializeWithType;
        int i11;
        if (!jsonParser.mo10898o0()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
        AbstractC6428b abstractC6428b = this._elementTypeDeserializer;
        int i12 = 0;
        while (true) {
            try {
                JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC6428b == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    }
                    objArrM11986i[i12] = objDeserializeWithType;
                    i12 = i11;
                } catch (Exception e11) {
                    e = e11;
                    i12 = i11;
                    throw JsonMappingException.wrapWithPath(e, objArrM11986i, c6495lLeaseObjectBuffer.m11981d() + i12);
                }
                if (i12 >= objArrM11986i.length) {
                    objArrM11986i = c6495lLeaseObjectBuffer.m11980c(objArrM11986i);
                    i12 = 0;
                }
                i11 = i12 + 1;
            } catch (Exception e12) {
                e = e12;
            }
        }
        if (this._untyped) {
            objArrM11984g = c6495lLeaseObjectBuffer.m11983f(objArrM11986i, i12);
        } else {
            objArrM11984g = c6495lLeaseObjectBuffer.m11984g(objArrM11986i, i12, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(c6495lLeaseObjectBuffer);
        return objArrM11984g;
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] bArrMo10899p = jsonParser.mo10899p(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[bArrMo10899p.length];
        int length = bArrMo10899p.length;
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = Byte.valueOf(bArrMo10899p[i11]);
        }
        return bArr;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(objectArrayDeserializer, interfaceC6375j, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = abstractC6390e;
        this._elementTypeDeserializer = abstractC6428b;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArrM11984g;
        Object objDeserializeWithType;
        int i11;
        if (!jsonParser.mo10898o0()) {
            Object[] objArrHandleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (objArrHandleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrHandleNonArray.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrHandleNonArray, 0, objArr2, length, objArrHandleNonArray.length);
            return objArr2;
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrM11987j = c6495lLeaseObjectBuffer.m11987j(objArr, length2);
        AbstractC6428b abstractC6428b = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC6428b == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    }
                    objArrM11987j[length2] = objDeserializeWithType;
                    length2 = i11;
                } catch (Exception e11) {
                    e = e11;
                    length2 = i11;
                    throw JsonMappingException.wrapWithPath(e, objArrM11987j, c6495lLeaseObjectBuffer.m11981d() + length2);
                }
                if (length2 >= objArrM11987j.length) {
                    objArrM11987j = c6495lLeaseObjectBuffer.m11980c(objArrM11987j);
                    length2 = 0;
                }
                i11 = length2 + 1;
            } catch (Exception e12) {
                e = e12;
            }
        }
        if (this._untyped) {
            objArrM11984g = c6495lLeaseObjectBuffer.m11983f(objArrM11987j, length2);
        } else {
            objArrM11984g = c6495lLeaseObjectBuffer.m11984g(objArrM11987j, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(c6495lLeaseObjectBuffer);
        return objArrM11984g;
    }
}
