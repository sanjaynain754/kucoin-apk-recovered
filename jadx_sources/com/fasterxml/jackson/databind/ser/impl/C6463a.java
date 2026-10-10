package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.a */
/* JADX INFO: compiled from: ObjectIdWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6463a {

    /* JADX INFO: renamed from: a */
    public final JavaType f10618a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6306i f10619b;

    /* JADX INFO: renamed from: c */
    public final ObjectIdGenerator<?> f10620c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6393h<Object> f10621d;

    /* JADX INFO: renamed from: e */
    public final boolean f10622e;

    /* JADX INFO: renamed from: a */
    public static C6463a m11795a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z11) {
        String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new C6463a(javaType, simpleName != null ? new SerializedString(simpleName) : null, objectIdGenerator, null, z11);
    }

    /* JADX INFO: renamed from: b */
    public C6463a m11796b(boolean z11) {
        return z11 == this.f10622e ? this : new C6463a(this.f10618a, this.f10619b, this.f10620c, this.f10621d, z11);
    }

    /* JADX INFO: renamed from: c */
    public C6463a m11797c(AbstractC6393h<?> abstractC6393h) {
        return new C6463a(this.f10618a, this.f10619b, this.f10620c, abstractC6393h, this.f10622e);
    }

    public C6463a(JavaType javaType, InterfaceC6306i interfaceC6306i, ObjectIdGenerator<?> objectIdGenerator, AbstractC6393h<?> abstractC6393h, boolean z11) {
        this.f10618a = javaType;
        this.f10619b = interfaceC6306i;
        this.f10620c = objectIdGenerator;
        this.f10621d = abstractC6393h;
        this.f10622e = z11;
    }
}
