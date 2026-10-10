package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6489f;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes45.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Binary;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.m10897o());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        C6489f c6489f = new C6489f(byteBuffer);
        jsonParser.mo10913x0(deserializationContext.getBase64Variant(), c6489f);
        c6489f.close();
        return byteBuffer;
    }
}
