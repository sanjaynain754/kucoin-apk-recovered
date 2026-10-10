package com.sumsub.sns.internal.features.presentation.videoident.chat;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32902b extends FocusStatus {

    /* JADX INFO: renamed from: a */
    public final boolean f67306a;

    public C32902b(boolean z11) {
        super(null);
        this.f67306a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32902b) && this.f67306a == ((C32902b) obj).f67306a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67306a);
    }

    public final String toString() {
        return "Gained(transient=" + this.f67306a + ")";
    }
}
