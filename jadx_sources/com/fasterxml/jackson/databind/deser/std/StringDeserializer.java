package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10882g0;
        if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return jsonParser.mo10869W();
        }
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonTokenMo10889k != JsonToken.VALUE_EMBEDDED_OBJECT) {
            if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
                return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            }
            return (!jsonTokenMo10889k.isScalarValue() || (strMo10882g0 = jsonParser.mo10882g0()) == null) ? (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser) : strMo10882g0;
        }
        Object objMo10858J = jsonParser.mo10858J();
        if (objMo10858J == null) {
            return null;
        }
        return objMo10858J instanceof byte[] ? deserializationContext.getBase64Variant().encode((byte[]) objMo10858J, false) : objMo10858J.toString();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Textual;
    }
}
