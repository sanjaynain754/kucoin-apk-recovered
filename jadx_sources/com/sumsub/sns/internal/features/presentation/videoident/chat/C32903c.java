package com.sumsub.sns.internal.features.presentation.videoident.chat;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32903c extends FocusStatus {

    /* JADX INFO: renamed from: a */
    public final boolean f67307a;

    public C32903c(boolean z11) {
        super(null);
        this.f67307a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32903c) && this.f67307a == ((C32903c) obj).f67307a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67307a);
    }

    public final String toString() {
        return "Lost(transient=" + this.f67307a + ")";
    }
}
