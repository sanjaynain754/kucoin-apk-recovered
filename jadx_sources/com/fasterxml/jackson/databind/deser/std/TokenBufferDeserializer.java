package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class TokenBufferDeserializer extends StdScalarDeserializer<C6499p> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super((Class<?>) C6499p.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public C6499p deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.bufferForInputBuffering(jsonParser).m12018Y0(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }
}
