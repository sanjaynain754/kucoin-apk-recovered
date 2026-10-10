package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.f */
/* JADX INFO: compiled from: DeserializationProblemHandler.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6361f {

    /* JADX INFO: renamed from: a */
    public static final Object f10270a = new Object();

    /* JADX INFO: renamed from: d */
    public JavaType m11269d(DeserializationContext deserializationContext, JavaType javaType, InterfaceC6429c interfaceC6429c, String str) throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m11272g(DeserializationContext deserializationContext, JsonParser jsonParser, AbstractC6390e<?> abstractC6390e, Object obj, String str) throws IOException {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public JavaType m11273h(DeserializationContext deserializationContext, JavaType javaType, String str, InterfaceC6429c interfaceC6429c, String str2) throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Object m11266a(DeserializationContext deserializationContext, Class<?> cls, Object obj, Throwable th2) throws IOException {
        return f10270a;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public Object m11267b(DeserializationContext deserializationContext, Class<?> cls, JsonParser jsonParser, String str) throws IOException {
        return f10270a;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public Object m11271f(DeserializationContext deserializationContext, Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str) throws IOException {
        return f10270a;
    }

    /* JADX INFO: renamed from: i */
    public Object m11274i(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f10270a;
    }

    /* JADX INFO: renamed from: j */
    public Object m11275j(DeserializationContext deserializationContext, JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        return f10270a;
    }

    /* JADX INFO: renamed from: k */
    public Object m11276k(DeserializationContext deserializationContext, Class<?> cls, Number number, String str) throws IOException {
        return f10270a;
    }

    /* JADX INFO: renamed from: l */
    public Object m11277l(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f10270a;
    }

    /* JADX INFO: renamed from: c */
    public Object m11268c(DeserializationContext deserializationContext, Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str) throws IOException {
        return m11267b(deserializationContext, cls, jsonParser, str);
    }

    /* JADX INFO: renamed from: e */
    public Object m11270e(DeserializationContext deserializationContext, JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str) throws IOException {
        return m11271f(deserializationContext, javaType.getRawClass(), jsonToken, jsonParser, str);
    }
}
