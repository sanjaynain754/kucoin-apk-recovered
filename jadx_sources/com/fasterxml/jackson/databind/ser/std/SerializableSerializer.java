package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.InterfaceC6392g;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class SerializableSerializer extends StdSerializer<InterfaceC6392g> {
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(InterfaceC6392g.class);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, InterfaceC6392g interfaceC6392g) {
        if (interfaceC6392g instanceof InterfaceC6392g.a) {
            return ((InterfaceC6392g.a) interfaceC6392g).isEmpty(abstractC6446m);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(InterfaceC6392g interfaceC6392g, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        interfaceC6392g.serialize(jsonGenerator, abstractC6446m);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public final void serializeWithType(InterfaceC6392g interfaceC6392g, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        interfaceC6392g.serializeWithType(jsonGenerator, abstractC6446m, abstractC6431e);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95581k(javaType);
    }
}
