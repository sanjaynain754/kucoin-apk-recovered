package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes45.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    private static final long serialVersionUID = 1;

    public AtomicBooleanDeserializer() {
        super((Class<?>) AtomicBoolean.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AtomicBoolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (jsonTokenMo10889k == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean bool_parseBoolean = _parseBoolean(jsonParser, deserializationContext, AtomicBoolean.class);
        if (bool_parseBoolean == null) {
            return null;
        }
        return new AtomicBoolean(bool_parseBoolean.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicBoolean(false);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Boolean;
    }
}
