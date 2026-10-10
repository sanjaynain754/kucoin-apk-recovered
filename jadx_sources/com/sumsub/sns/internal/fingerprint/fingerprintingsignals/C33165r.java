package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33165r {

    /* JADX INFO: renamed from: a */
    public final StabilityLevel f67654a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33165r) && this.f67654a == ((C33165r) obj).f67654a;
    }

    public final int hashCode() {
        return this.f67654a.hashCode();
    }

    public final String toString() {
        return "Info(stabilityLevel=" + this.f67654a + ")";
    }

    public C33165r(StabilityLevel stabilityLevel) {
        this.f67654a = stabilityLevel;
    }
}
