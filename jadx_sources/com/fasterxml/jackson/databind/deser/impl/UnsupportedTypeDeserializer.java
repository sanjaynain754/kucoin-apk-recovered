package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected final String _message;
    protected final JavaType _type;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this._type = javaType;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objMo10858J;
        if (jsonParser.mo10889k() == JsonToken.VALUE_EMBEDDED_OBJECT && ((objMo10858J = jsonParser.mo10858J()) == null || this._type.getRawClass().isAssignableFrom(objMo10858J.getClass()))) {
            return objMo10858J;
        }
        deserializationContext.reportBadDefinition(this._type, this._message);
        return null;
    }
}
