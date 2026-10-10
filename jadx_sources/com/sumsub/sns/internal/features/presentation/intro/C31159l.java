package com.sumsub.sns.internal.features.presentation.intro;

import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.intro.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31159l implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final C28895g f62998a;

    /* JADX INFO: renamed from: b */
    public final Map f62999b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31159l)) {
            return false;
        }
        C31159l c31159l = (C31159l) obj;
        return Intrinsics.areEqual(this.f62998a, c31159l.f62998a) && Intrinsics.areEqual(this.f62999b, c31159l.f62999b);
    }

    public final int hashCode() {
        return this.f62999b.hashCode() + (this.f62998a.hashCode() * 31);
    }

    public final String toString() {
        return "IntroViewState(stepInfo=" + this.f62998a + ", data=" + this.f62999b + ")";
    }

    public C31159l(C28895g c28895g, Map map) {
        this.f62998a = c28895g;
        this.f62999b = map;
    }
}
