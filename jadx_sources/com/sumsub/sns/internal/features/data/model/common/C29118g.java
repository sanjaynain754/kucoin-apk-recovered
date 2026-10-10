package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.core.data.model.FlowActionType;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29118g {

    /* JADX INFO: renamed from: a */
    public final String f59062a;

    /* JADX INFO: renamed from: b */
    public final FlowActionType f59063b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29118g)) {
            return false;
        }
        C29118g c29118g = (C29118g) obj;
        return Intrinsics.areEqual(this.f59062a, c29118g.f59062a) && Intrinsics.areEqual(this.f59063b, c29118g.f59063b);
    }

    public final int hashCode() {
        return this.f59063b.hashCode() + (this.f59062a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(id=" + this.f59062a + ", type=" + this.f59063b + ")";
    }

    public C29118g(String str, FlowActionType flowActionType) {
        this.f59062a = str;
        this.f59063b = flowActionType;
    }
}
