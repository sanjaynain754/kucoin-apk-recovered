package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.AbstractC6390e;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.a */
/* JADX INFO: compiled from: JdkDeserializers.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6388a {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f10362a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i11 = 0; i11 < 7; i11++) {
            f10362a.add(clsArr[i11].getName());
        }
        for (Class<?> cls : FromStringDeserializer.types()) {
            f10362a.add(cls.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6390e<?> m11423a(Class<?> cls, String str) {
        if (!f10362a.contains(str)) {
            return null;
        }
        FromStringDeserializer<?> fromStringDeserializerFindDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (fromStringDeserializerFindDeserializer != null) {
            return fromStringDeserializerFindDeserializer;
        }
        if (cls == UUID.class) {
            return new UUIDDeserializer();
        }
        if (cls == StackTraceElement.class) {
            return new StackTraceElementDeserializer();
        }
        if (cls == AtomicBoolean.class) {
            return new AtomicBooleanDeserializer();
        }
        if (cls == AtomicInteger.class) {
            return new AtomicIntegerDeserializer();
        }
        if (cls == AtomicLong.class) {
            return new AtomicLongDeserializer();
        }
        if (cls == ByteBuffer.class) {
            return new ByteBufferDeserializer();
        }
        if (cls == Void.class) {
            return NullifyingDeserializer.instance;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11424b(Class<?> cls) {
        return f10362a.contains(cls.getName());
    }
}
