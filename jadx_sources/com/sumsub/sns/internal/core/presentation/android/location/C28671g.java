package com.sumsub.sns.internal.core.presentation.android.location;

import p852kotlin.time.Duration;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28671g implements InterfaceC28673i {

    /* JADX INFO: renamed from: a */
    public final long f58299a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28671g) && Duration.m105192equalsimpl0(this.f58299a, ((C28671g) obj).f58299a);
    }

    public final int hashCode() {
        return Duration.m105208hashCodeimpl(this.f58299a);
    }

    public final String toString() {
        return "AcquireLocation(freshness=" + Duration.m105227toStringimpl(this.f58299a) + ")";
    }

    public C28671g(long j11) {
        this.f58299a = j11;
    }
}
