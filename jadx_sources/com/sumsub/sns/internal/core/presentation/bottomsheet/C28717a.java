package com.sumsub.sns.internal.core.presentation.bottomsheet;

import com.sumsub.sns.internal.core.analytics.Popup;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28717a implements InterfaceC28719c {

    /* JADX INFO: renamed from: a */
    public final Popup f58404a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28717a) && this.f58404a == ((C28717a) obj).f58404a;
    }

    public final int hashCode() {
        return this.f58404a.hashCode();
    }

    public final String toString() {
        return "Popup(popup=" + this.f58404a + ")";
    }

    public C28717a(Popup popup) {
        this.f58404a = popup;
    }
}
