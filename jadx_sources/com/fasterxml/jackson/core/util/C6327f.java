package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.InterfaceC6326e;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.f */
/* JADX INFO: compiled from: JacksonFeatureSet.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6327f<F extends InterfaceC6326e> {

    /* JADX INFO: renamed from: a */
    public int f10160a;

    /* JADX INFO: renamed from: a */
    public static <F extends InterfaceC6326e> C6327f<F> m11080a(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f11 : fArr) {
            if (f11.enabledByDefault()) {
                mask |= f11.getMask();
            }
        }
        return new C6327f<>(mask);
    }

    /* JADX INFO: renamed from: c */
    public C6327f<F> m11082c(F f11) {
        int mask = f11.getMask() | this.f10160a;
        return mask == this.f10160a ? this : new C6327f<>(mask);
    }

    public C6327f(int i11) {
        this.f10160a = i11;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11081b(F f11) {
        if ((f11.getMask() & this.f10160a) != 0) {
            return true;
        }
        return false;
    }
}
