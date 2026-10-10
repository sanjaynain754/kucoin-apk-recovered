package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29980i {

    /* JADX INFO: renamed from: a */
    public final AbstractC29971N f60239a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29971N f60240b;

    /* JADX INFO: renamed from: c */
    public final AbstractC29971N f60241c;

    /* JADX INFO: renamed from: d */
    public final AbstractC29971N f60242d;

    /* JADX INFO: renamed from: e */
    public final boolean f60243e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29980i)) {
            return false;
        }
        C29980i c29980i = (C29980i) obj;
        return Intrinsics.areEqual(this.f60239a, c29980i.f60239a) && Intrinsics.areEqual(this.f60240b, c29980i.f60240b) && Intrinsics.areEqual(this.f60241c, c29980i.f60241c) && Intrinsics.areEqual(this.f60242d, c29980i.f60242d) && this.f60243e == c29980i.f60243e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70060a() {
        if (this.f60239a.m70050b() != null && this.f60240b.m70050b() != null && this.f60241c.m70050b() != null) {
            if (!this.f60243e) {
                return false;
            }
            AbstractC29172p abstractC29172p = (AbstractC29172p) this.f60239a.m70051c();
            if (abstractC29172p != null && (abstractC29172p instanceof C29082a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60243e) + ((this.f60242d.hashCode() + ((this.f60241c.hashCode() + ((this.f60240b.hashCode() + (this.f60239a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Data(applicant=" + this.f60239a + ", config=" + this.f60240b + ", strings=" + this.f60241c + ", featureFlags=" + this.f60242d + ", isActionFlow=" + this.f60243e + ")";
    }

    public C29980i(AbstractC29971N abstractC29971N, AbstractC29971N abstractC29971N2, AbstractC29971N abstractC29971N3, AbstractC29971N abstractC29971N4, boolean z11) {
        this.f60239a = abstractC29971N;
        this.f60240b = abstractC29971N2;
        this.f60241c = abstractC29971N3;
        this.f60242d = abstractC29971N4;
        this.f60243e = z11;
    }
}
