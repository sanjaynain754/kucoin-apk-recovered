package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6635z {

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.z$a */
    @FunctionalInterface
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo12072a() throws Throwable;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> T m12513a(a<T> aVar, @NonNull T t11) {
        try {
            T tMo12072a = aVar.mo12072a();
            if (tMo12072a != null) {
                return tMo12072a;
            }
            return t11;
        } catch (Throwable unused) {
        }
    }
}
