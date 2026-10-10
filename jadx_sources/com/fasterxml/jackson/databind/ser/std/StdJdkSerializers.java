package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class StdJdkSerializers {

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode(TypedValues.Custom.S_BOOLEAN, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10803U(atomicBoolean.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            interfaceC43399e.mo95584n(javaType);
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10815e0(atomicInteger.get());
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.LONG);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10816f0(atomicLong.get());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Collection<Map.Entry<Class<?>, Object>> m11838a() {
        HashMap map = new HashMap();
        map.put(URL.class, new ToStringSerializer(URL.class));
        map.put(URI.class, new ToStringSerializer(URI.class));
        map.put(Currency.class, new ToStringSerializer(Currency.class));
        map.put(UUID.class, new UUIDSerializer());
        map.put(Pattern.class, new ToStringSerializer(Pattern.class));
        map.put(Locale.class, new ToStringSerializer(Locale.class));
        map.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        map.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        map.put(AtomicLong.class, AtomicLongSerializer.class);
        map.put(File.class, FileSerializer.class);
        map.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.instance;
        map.put(Void.class, nullSerializer);
        map.put(Void.TYPE, nullSerializer);
        return map.entrySet();
    }
}
