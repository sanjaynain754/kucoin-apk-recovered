package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10890k0(JsonToken.FIELD_NAME)) {
            jsonParser.mo10856C0();
            return null;
        }
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 == null || jsonTokenMo10905t0 == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.mo10856C0();
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 1 && iMo10891l != 3 && iMo10891l != 5) {
            return null;
        }
        return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }
}
