package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29973b {

    /* JADX INFO: renamed from: f */
    public static final C29972a f60208f = new C29972a();

    /* JADX INFO: renamed from: a */
    public final long f60209a;

    /* JADX INFO: renamed from: b */
    public final boolean f60210b;

    /* JADX INFO: renamed from: c */
    public final boolean f60211c;

    /* JADX INFO: renamed from: d */
    public final long f60212d;

    /* JADX INFO: renamed from: e */
    public final long f60213e;

    public /* synthetic */ C29973b() {
        this(120L, false, true, 3000L, 5000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29973b)) {
            return false;
        }
        C29973b c29973b = (C29973b) obj;
        return this.f60209a == c29973b.f60209a && this.f60210b == c29973b.f60210b && this.f60211c == c29973b.f60211c && this.f60212d == c29973b.f60212d && this.f60213e == c29973b.f60213e;
    }

    public C29973b(long j11, boolean z11, boolean z12, long j12, long j13) {
        this.f60209a = j11;
        this.f60210b = z11;
        this.f60211c = z12;
        this.f60212d = j12;
        this.f60213e = j13;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60213e) + ((Long.hashCode(this.f60212d) + AbstractC27920h.m69001a(this.f60211c, AbstractC27920h.m69001a(this.f60210b, Long.hashCode(this.f60209a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ApplicantPollingConfig(periodSec=" + this.f60209a + ", armedRefresh=" + this.f60210b + ", waitForConnection=" + this.f60211c + ", waitTimeoutMs=" + this.f60212d + ", stopTimeoutMs=" + this.f60213e + ")";
    }
}
