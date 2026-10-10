package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.e */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7823e extends AbstractC7824f {

    /* JADX INFO: renamed from: a */
    private final int f12114a;

    /* JADX INFO: renamed from: b */
    private final long f12115b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7824f) {
            AbstractC7824f abstractC7824f = (AbstractC7824f) obj;
            if (this.f12114a == abstractC7824f.mo13312a() && this.f12115b == abstractC7824f.mo13313b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC7824f
    /* JADX INFO: renamed from: a */
    public final int mo13312a() {
        return this.f12114a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC7824f
    /* JADX INFO: renamed from: b */
    public final long mo13313b() {
        return this.f12115b;
    }

    public final int hashCode() {
        long j11 = this.f12115b;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((this.f12114a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12114a + ", eventTimestamp=" + this.f12115b + "}";
    }

    public C7823e(int i11, long j11) {
        this.f12114a = i11;
        this.f12115b = j11;
    }
}
