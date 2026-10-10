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
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, InterfaceC6429c interfaceC6429c, String str, boolean z11, JavaType javaType2) {
        super(javaType, interfaceC6429c, str, z11, javaType2);
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public AbstractC6428b forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public JsonTypeInfo.EnumC6265As getTypeInclusion() {
        return JsonTypeInfo.EnumC6265As.WRAPPER_OBJECT;
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objMo10876b0;
        if (jsonParser.mo10883h() && (objMo10876b0 = jsonParser.mo10876b0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objMo10876b0);
        }
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenMo10889k == jsonToken) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenMo10905t0 != jsonToken2) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (jsonTokenMo10889k != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String strMo10869W = jsonParser.mo10869W();
        AbstractC6390e<Object> abstractC6390e_findDeserializer = _findDeserializer(deserializationContext, strMo10869W);
        jsonParser.mo10905t0();
        if (this._typeIdVisible && jsonParser.mo10890k0(jsonToken)) {
            C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            c6499pBufferForInputBuffering.mo10850y0();
            c6499pBufferForInputBuffering.mo10810a0(this._typePropertyName);
            c6499pBufferForInputBuffering.mo10787C0(strMo10869W);
            jsonParser.mo10885i();
            jsonParser = C6329h.m11083E0(false, c6499pBufferForInputBuffering.m12014U0(jsonParser), jsonParser);
            jsonParser.mo10905t0();
        }
        Object objDeserialize = abstractC6390e_findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken jsonTokenMo10905t1 = jsonParser.mo10905t0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenMo10905t1 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
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
