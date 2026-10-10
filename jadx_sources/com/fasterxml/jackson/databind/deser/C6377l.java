package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.C6490g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.l */
/* JADX INFO: compiled from: UnresolvedId.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6377l {

    /* JADX INFO: renamed from: a */
    public final Object f10333a;

    /* JADX INFO: renamed from: b */
    public final JsonLocation f10334b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f10335c;

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f10333a, C6490g.m11921X(this.f10335c), this.f10334b);
    }

    public C6377l(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f10333a = obj;
        this.f10335c = cls;
        this.f10334b = jsonLocation;
    }
}
