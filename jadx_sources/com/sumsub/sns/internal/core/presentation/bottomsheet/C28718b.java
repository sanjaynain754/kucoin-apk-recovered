package com.sumsub.sns.internal.core.presentation.bottomsheet;

import com.sumsub.sns.internal.core.analytics.Screen;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28718b implements InterfaceC28719c {

    /* JADX INFO: renamed from: a */
    public final Screen f58405a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28718b) && this.f58405a == ((C28718b) obj).f58405a;
    }

    public final int hashCode() {
        return this.f58405a.hashCode();
    }

    public final String toString() {
        return "Screen(screen=" + this.f58405a + ")";
    }

    public C28718b(Screen screen) {
        this.f58405a = screen;
    }
}
