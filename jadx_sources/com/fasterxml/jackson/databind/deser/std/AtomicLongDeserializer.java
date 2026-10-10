package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes45.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    private static final long serialVersionUID = 1;

    public AtomicLongDeserializer() {
        super((Class<?>) AtomicLong.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AtomicLong deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10896n0()) {
            return new AtomicLong(jsonParser.mo10861O());
        }
        Long l_parseLong = _parseLong(jsonParser, deserializationContext, AtomicLong.class);
        if (l_parseLong == null) {
            return null;
        }
        return new AtomicLong(l_parseLong.intValue());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }
}
