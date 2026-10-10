package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes45.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    private static final long serialVersionUID = 1;

    public AtomicIntegerDeserializer() {
        super((Class<?>) AtomicInteger.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AtomicInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10896n0()) {
            return new AtomicInteger(jsonParser.mo10860M());
        }
        Integer num_parseInteger = _parseInteger(jsonParser, deserializationContext, AtomicInteger.class);
        if (num_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(num_parseInteger.intValue());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }
}
