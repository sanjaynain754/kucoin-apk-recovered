package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.InterfaceC6392g;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.n */
/* JADX INFO: compiled from: RawValue.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6497n implements InterfaceC6392g {

    /* JADX INFO: renamed from: b */
    public Object f10750b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6497n)) {
            return false;
        }
        Object obj2 = this.f10750b;
        Object obj3 = ((C6497n) obj).f10750b;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    /* JADX INFO: renamed from: a */
    public void m11997a(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f10750b;
        if (obj instanceof InterfaceC6306i) {
            jsonGenerator.mo10840s0((InterfaceC6306i) obj);
        } else {
            jsonGenerator.mo10841t0(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11998b(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f10750b;
        if (obj instanceof InterfaceC6392g) {
            jsonGenerator.mo10826k0(obj);
        } else {
            m11997a(jsonGenerator);
        }
    }

    public int hashCode() {
        Object obj = this.f10750b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g
    public void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object obj = this.f10750b;
        if (obj instanceof InterfaceC6392g) {
            ((InterfaceC6392g) obj).serialize(jsonGenerator, abstractC6446m);
        } else {
            m11997a(jsonGenerator);
        }
    }

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g
    public void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        Object obj = this.f10750b;
        if (obj instanceof InterfaceC6392g) {
            ((InterfaceC6392g) obj).serializeWithType(jsonGenerator, abstractC6446m, abstractC6431e);
        } else if (obj instanceof InterfaceC6306i) {
            serialize(jsonGenerator, abstractC6446m);
        }
    }

    public String toString() {
        return String.format("[RawValue of type %s]", C6490g.m11938h(this.f10750b));
    }

    public C6497n(String str) {
        this.f10750b = str;
    }
}
