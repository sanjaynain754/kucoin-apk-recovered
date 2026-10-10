package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.C6271b0;
import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.C6490g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.p */
/* JADX INFO: compiled from: ObjectIdInfo.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6419p {

    /* JADX INFO: renamed from: f */
    public static final C6419p f10457f = new C6419p(PropertyName.NO_NAME, Object.class, null, false, null);

    /* JADX INFO: renamed from: a */
    public final PropertyName f10458a;

    /* JADX INFO: renamed from: b */
    public final Class<? extends ObjectIdGenerator<?>> f10459b;

    /* JADX INFO: renamed from: c */
    public final Class<? extends InterfaceC6269a0> f10460c;

    /* JADX INFO: renamed from: d */
    public final Class<?> f10461d;

    /* JADX INFO: renamed from: e */
    public final boolean f10462e;

    public C6419p(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends InterfaceC6269a0> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.a0>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.a0>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6419p(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z11, Class cls3) {
        this.f10458a = propertyName;
        this.f10461d = cls;
        this.f10459b = cls2;
        this.f10462e = z11;
        this.f10460c = cls3 == null ? C6271b0.class : cls3;
    }

    /* JADX INFO: renamed from: a */
    public static C6419p m11570a() {
        return f10457f;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11571b() {
        return this.f10462e;
    }

    /* JADX INFO: renamed from: c */
    public Class<? extends ObjectIdGenerator<?>> m11572c() {
        return this.f10459b;
    }

    /* JADX INFO: renamed from: d */
    public PropertyName m11573d() {
        return this.f10458a;
    }

    /* JADX INFO: renamed from: e */
    public Class<? extends InterfaceC6269a0> m11574e() {
        return this.f10460c;
    }

    /* JADX INFO: renamed from: f */
    public Class<?> m11575f() {
        return this.f10461d;
    }

    /* JADX INFO: renamed from: g */
    public C6419p m11576g(boolean z11) {
        return this.f10462e == z11 ? this : new C6419p(this.f10458a, this.f10461d, this.f10459b, z11, this.f10460c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f10458a + ", scope=" + C6490g.m11921X(this.f10461d) + ", generatorType=" + C6490g.m11921X(this.f10459b) + ", alwaysAsId=" + this.f10462e;
    }
}
