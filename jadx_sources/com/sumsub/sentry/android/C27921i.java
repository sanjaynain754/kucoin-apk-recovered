package com.sumsub.sentry.android;

/* JADX INFO: renamed from: com.sumsub.sentry.android.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27921i {

    /* JADX INFO: renamed from: a */
    public final boolean f57040a;

    /* JADX INFO: renamed from: b */
    public final boolean f57041b;

    /* JADX INFO: renamed from: c */
    public final boolean f57042c;

    /* JADX INFO: renamed from: d */
    public final boolean f57043d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27921i)) {
            return false;
        }
        C27921i c27921i = (C27921i) obj;
        return this.f57040a == c27921i.f57040a && this.f57041b == c27921i.f57041b && this.f57042c == c27921i.f57042c && this.f57043d == c27921i.f57043d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57043d) + AbstractC27920h.m69001a(this.f57042c, AbstractC27920h.m69001a(this.f57041b, Boolean.hashCode(this.f57040a) * 31, 31), 31);
    }

    public final String toString() {
        return "RootSentryConfig(checkTestKeys=" + this.f57040a + ", checkRootFiles=" + this.f57041b + ", checkSUExist=" + this.f57042c + ", checkRootPackages=" + this.f57043d + ")";
    }

    public C27921i(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f57040a = z11;
        this.f57041b = z12;
        this.f57042c = z13;
        this.f57043d = z14;
    }
}
