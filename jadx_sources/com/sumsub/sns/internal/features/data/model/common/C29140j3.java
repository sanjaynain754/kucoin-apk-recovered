package com.sumsub.sns.internal.features.data.model.common;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.j3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29140j3 {

    /* JADX INFO: renamed from: a */
    public final C29185r2 f59117a;

    /* JADX INFO: renamed from: b */
    public final List f59118b;

    /* JADX INFO: renamed from: c */
    public final C28994D3 f59119c;

    /* JADX INFO: renamed from: d */
    public final C28984B3 f59120d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29140j3)) {
            return false;
        }
        C29140j3 c29140j3 = (C29140j3) obj;
        return Intrinsics.areEqual(this.f59117a, c29140j3.f59117a) && Intrinsics.areEqual(this.f59118b, c29140j3.f59118b) && Intrinsics.areEqual(this.f59119c, c29140j3.f59119c) && Intrinsics.areEqual(this.f59120d, c29140j3.f59120d);
    }

    public final int hashCode() {
        C29185r2 c29185r2 = this.f59117a;
        int iHashCode = (this.f59118b.hashCode() + ((c29185r2 == null ? 0 : c29185r2.hashCode()) * 31)) * 31;
        C28994D3 c28994d3 = this.f59119c;
        int iHashCode2 = (iHashCode + (c28994d3 == null ? 0 : c28994d3.hashCode())) * 31;
        C28984B3 c28984b3 = this.f59120d;
        return iHashCode2 + (c28984b3 != null ? c28984b3.hashCode() : 0);
    }

    public final String toString() {
        return "RequiredIdDocStatus(review=" + this.f59117a + ", documents=" + this.f59118b + ", workflowStatus=" + this.f59119c + ", videoIdentData=" + this.f59120d + ")";
    }

    public C29140j3(C29185r2 c29185r2, List list, C28994D3 c28994d3, C28984B3 c28984b3) {
        this.f59117a = c29185r2;
        this.f59118b = list;
        this.f59119c = c28994d3;
        this.f59120d = c28984b3;
    }
}
