package com.sumsub.sns.internal.features.presentation.exitsurvey;

import java.util.Set;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31026j extends AbstractC31027k {

    /* JADX INFO: renamed from: a */
    public final String f62714a;

    /* JADX INFO: renamed from: b */
    public final Set f62715b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31026j)) {
            return false;
        }
        C31026j c31026j = (C31026j) obj;
        return Intrinsics.areEqual(this.f62714a, c31026j.f62714a) && Intrinsics.areEqual(this.f62715b, c31026j.f62715b);
    }

    public final int hashCode() {
        String str = this.f62714a;
        return this.f62715b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(successText=" + this.f62714a + ", selectedOptions=" + this.f62715b + ")";
    }

    public C31026j(String str, Set set) {
        this.f62714a = str;
        this.f62715b = set;
    }
}
