package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.C6488e;
import java.io.IOException;
import java.nio.ByteBuffer;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            jsonGenerator.m10802T(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, byteBuffer.limit() - iPosition);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        C6488e c6488e = new C6488e(byteBufferAsReadOnlyBuffer);
        jsonGenerator.m10799Q(c6488e, byteBufferAsReadOnlyBuffer.remaining());
        c6488e.close();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95583m(javaType);
    }
}
