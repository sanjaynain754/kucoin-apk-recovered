package com.geetest.gtc4;

import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.p */
/* JADX INFO: loaded from: classes45.dex */
public final class C6842p {

    /* JADX INFO: renamed from: a */
    public final int f11453a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11454b;

    public final boolean equals(Object obj) {
        if (obj instanceof C6842p) {
            return Arrays.equals(this.f11454b, ((C6842p) obj).f11454b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11453a;
    }

    public C6842p(byte[] bArr) {
        this.f11453a = AbstractC6834o0.m12688b(bArr);
        this.f11454b = bArr;
    }
}
