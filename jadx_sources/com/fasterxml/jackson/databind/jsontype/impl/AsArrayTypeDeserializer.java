package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.C6329h;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsArrayTypeDeserializer(JavaType javaType, InterfaceC6429c interfaceC6429c, String str, boolean z11, JavaType javaType2) {
        super(javaType, interfaceC6429c, str, z11, javaType2);
    }

    public boolean _usesExternalId() {
        return false;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public AbstractC6428b forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public JsonTypeInfo.EnumC6265As getTypeInclusion() {
        return JsonTypeInfo.EnumC6265As.WRAPPER_ARRAY;
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objMo10876b0;
        if (jsonParser.mo10883h() && (objMo10876b0 = jsonParser.mo10876b0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objMo10876b0);
        }
        boolean zMo10898o0 = jsonParser.mo10898o0();
        String str_locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        AbstractC6390e<Object> abstractC6390e_findDeserializer = _findDeserializer(deserializationContext, str_locateTypeId);
        if (this._typeIdVisible && !_usesExternalId() && jsonParser.mo10890k0(JsonToken.START_OBJECT)) {
            C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            c6499pBufferForInputBuffering.mo10850y0();
            c6499pBufferForInputBuffering.mo10810a0(this._typePropertyName);
            c6499pBufferForInputBuffering.mo10787C0(str_locateTypeId);
            jsonParser.mo10885i();
            jsonParser = C6329h.m11083E0(false, c6499pBufferForInputBuffering.m12014U0(jsonParser), jsonParser);
            jsonParser.mo10905t0();
        }
        if (zMo10898o0 && jsonParser.mo10889k() == JsonToken.END_ARRAY) {
            return abstractC6390e_findDeserializer.getNullValue(deserializationContext);
        }
        Object objDeserialize = abstractC6390e_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (zMo10898o0) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
            }
        }
        return objDeserialize;
    }

    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10898o0()) {
            if (this._defaultImpl != null) {
                return this._idResolver.mo11688f();
            }
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonTokenMo10905t0 == jsonToken) {
            String strMo10869W = jsonParser.mo10869W();
            jsonParser.mo10905t0();
            return strMo10869W;
        }
        deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }
}
