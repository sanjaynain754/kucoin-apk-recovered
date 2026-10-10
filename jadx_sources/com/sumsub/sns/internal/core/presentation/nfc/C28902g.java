package com.sumsub.sns.internal.core.presentation.nfc;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28902g implements InterfaceC28898c {

    /* JADX INFO: renamed from: a */
    public final int f58765a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28902g) && this.f58765a == ((C28902g) obj).f58765a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58765a);
    }

    public final String toString() {
        return "StateReading(progress=" + this.f58765a + ")";
    }

    public C28902g(int i11) {
        this.f58765a = i11;
    }
}
