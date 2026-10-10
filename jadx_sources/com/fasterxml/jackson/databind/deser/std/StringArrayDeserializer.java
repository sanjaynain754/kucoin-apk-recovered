package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6495l;
import java.io.IOException;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements InterfaceC6358c {

    /* JADX INFO: renamed from: b */
    public static final String[] f10361b = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    protected AbstractC6390e<String> _elementDeserializer;
    protected final InterfaceC6375j _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = abstractC6390e;
        this._nullProvider = interfaceC6375j;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC6375j);
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] objArrM11987j;
        String strDeserialize;
        int i11;
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArrM11987j = c6495lLeaseObjectBuffer.m11986i();
            length = 0;
        } else {
            length = strArr.length;
            objArrM11987j = c6495lLeaseObjectBuffer.m11987j(strArr, length);
        }
        AbstractC6390e<String> abstractC6390e = this._elementDeserializer;
        while (true) {
            try {
                try {
                    if (jsonParser.mo10904s0() == null) {
                        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
                        if (jsonTokenMo10889k == JsonToken.END_ARRAY) {
                            String[] strArr2 = (String[]) c6495lLeaseObjectBuffer.m11984g(objArrM11987j, length, String.class);
                            deserializationContext.returnObjectBuffer(c6495lLeaseObjectBuffer);
                            return strArr2;
                        }
                        if (jsonTokenMo10889k != JsonToken.VALUE_NULL) {
                            strDeserialize = abstractC6390e.deserialize(jsonParser, deserializationContext);
                        } else if (!this._skipNullValues) {
                            strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        strDeserialize = abstractC6390e.deserialize(jsonParser, deserializationContext);
                    }
                    objArrM11987j[length] = strDeserialize;
                    length = i11;
                } catch (Exception e11) {
                    e = e11;
                    length = i11;
                    throw JsonMappingException.wrapWithPath(e, String.class, length);
                }
                if (length >= objArrM11987j.length) {
                    objArrM11987j = c6495lLeaseObjectBuffer.m11980c(objArrM11987j);
                    length = 0;
                }
                i11 = length + 1;
            } catch (Exception e12) {
                e = e12;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String[] m11414a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.mo10890k0(JsonToken.VALUE_NULL) ? (String) this._nullProvider.getNullValue(deserializationContext) : _parseString(jsonParser, deserializationContext)};
        }
        return jsonParser.mo10890k0(JsonToken.VALUE_STRING) ? _deserializeFromString(jsonParser, deserializationContext) : (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390eFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType javaTypeConstructType = deserializationContext.constructType(String.class);
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390eFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(javaTypeConstructType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390eFindConvertingContentDeserializer, beanProperty, javaTypeConstructType);
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        InterfaceC6375j interfaceC6375jFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer);
        if (abstractC6390eFindContextualValueDeserializer != null && isDefaultDeserializer(abstractC6390eFindContextualValueDeserializer)) {
            abstractC6390eFindContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == abstractC6390eFindContextualValueDeserializer && Objects.equals(this._unwrapSingle, boolFindFormatFeature) && this._nullProvider == interfaceC6375jFindContentNullProvider) ? this : new StringArrayDeserializer(abstractC6390eFindContextualValueDeserializer, interfaceC6375jFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return f10361b;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i11;
        if (!jsonParser.mo10898o0()) {
            return m11414a(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
        int i12 = 0;
        while (true) {
            try {
                String strMo10904s0 = jsonParser.mo10904s0();
                try {
                    if (strMo10904s0 == null) {
                        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
                        if (jsonTokenMo10889k == JsonToken.END_ARRAY) {
                            String[] strArr = (String[]) c6495lLeaseObjectBuffer.m11984g(objArrM11986i, i12, String.class);
                            deserializationContext.returnObjectBuffer(c6495lLeaseObjectBuffer);
                            return strArr;
                        }
                        if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                strMo10904s0 = (String) this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else {
                            strMo10904s0 = _parseString(jsonParser, deserializationContext);
                        }
                    }
                    objArrM11986i[i12] = strMo10904s0;
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
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        if (!jsonParser.mo10898o0()) {
            String[] strArrM11414a = m11414a(jsonParser, deserializationContext);
            if (strArrM11414a == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrM11414a.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrM11414a, 0, strArr2, length, strArrM11414a.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrM11987j = c6495lLeaseObjectBuffer.m11987j(strArr, length2);
        while (true) {
            try {
                String strMo10904s0 = jsonParser.mo10904s0();
                if (strMo10904s0 == null) {
                    JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
                    if (jsonTokenMo10889k == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) c6495lLeaseObjectBuffer.m11984g(objArrM11987j, length2, String.class);
                        deserializationContext.returnObjectBuffer(c6495lLeaseObjectBuffer);
                        return strArr3;
                    }
                    if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
                        if (this._skipNullValues) {
                            return f10361b;
                        }
                        strMo10904s0 = (String) this._nullProvider.getNullValue(deserializationContext);
                    } else {
                        strMo10904s0 = _parseString(jsonParser, deserializationContext);
                    }
                    throw JsonMappingException.wrapWithPath(e, objArrM11987j, c6495lLeaseObjectBuffer.m11981d() + length2);
                }
                if (length2 >= objArrM11987j.length) {
                    objArrM11987j = c6495lLeaseObjectBuffer.m11980c(objArrM11987j);
                    length2 = 0;
                }
                int i11 = length2 + 1;
                try {
                    objArrM11987j[length2] = strMo10904s0;
                    length2 = i11;
                } catch (Exception e11) {
                    e = e11;
                    length2 = i11;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
    }
}
