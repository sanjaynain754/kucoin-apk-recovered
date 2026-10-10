package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.e */
/* JADX INFO: compiled from: WritableObjectId.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6467e {

    /* JADX INFO: renamed from: a */
    public final ObjectIdGenerator<?> f10647a;

    /* JADX INFO: renamed from: b */
    public Object f10648b;

    /* JADX INFO: renamed from: c */
    public boolean f10649c = false;

    /* JADX INFO: renamed from: b */
    public void m11821b(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, C6463a c6463a) throws IOException {
        this.f10649c = true;
        if (jsonGenerator.mo10825k()) {
            Object obj = this.f10648b;
            jsonGenerator.mo10828l0(obj == null ? null : String.valueOf(obj));
            return;
        }
        InterfaceC6306i interfaceC6306i = c6463a.f10619b;
        if (interfaceC6306i != null) {
            jsonGenerator.mo10808Z(interfaceC6306i);
            c6463a.f10621d.serialize(this.f10648b, jsonGenerator, abstractC6446m);
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m11820a(Object obj) {
        if (this.f10648b == null) {
            this.f10648b = this.f10647a.generateId(obj);
        }
        return this.f10648b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m11822c(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, C6463a c6463a) throws IOException {
        if (this.f10648b == null) {
            return false;
        }
        if (!this.f10649c && !c6463a.f10622e) {
            return false;
        }
        if (jsonGenerator.mo10825k()) {
            jsonGenerator.m10830m0(String.valueOf(this.f10648b));
            return true;
        }
        c6463a.f10621d.serialize(this.f10648b, jsonGenerator, abstractC6446m);
        return true;
    }

    public C6467e(ObjectIdGenerator<?> objectIdGenerator) {
        this.f10647a = objectIdGenerator;
    }
}
