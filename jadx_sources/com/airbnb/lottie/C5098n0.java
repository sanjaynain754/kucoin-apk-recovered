package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.airbnb.lottie.n0 */
/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5098n0<V> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final V f6172a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Throwable f6173b;

    public C5098n0(V v11) {
        this.f6172a = v11;
        this.f6173b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5098n0)) {
            return false;
        }
        C5098n0 c5098n0 = (C5098n0) obj;
        if (m5811b() != null && m5811b().equals(c5098n0.m5811b())) {
            return true;
        }
        if (m5810a() == null || c5098n0.m5810a() == null) {
            return false;
        }
        return m5810a().toString().equals(m5810a().toString());
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Throwable m5810a() {
        return this.f6173b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public V m5811b() {
        return this.f6172a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m5811b(), m5810a()});
    }

    public C5098n0(Throwable th2) {
        this.f6173b = th2;
        this.f6172a = null;
    }
}
