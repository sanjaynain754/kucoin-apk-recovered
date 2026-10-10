package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30079M {

    /* JADX INFO: renamed from: a */
    public final C29124h f60443a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29172p f60444b;

    /* JADX INFO: renamed from: c */
    public final C29983l f60445c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30079M)) {
            return false;
        }
        C30079M c30079m = (C30079M) obj;
        return Intrinsics.areEqual(this.f60443a, c30079m.f60443a) && Intrinsics.areEqual(this.f60444b, c30079m.f60444b) && Intrinsics.areEqual(this.f60445c, c30079m.f60445c);
    }

    public final int hashCode() {
        return this.f60445c.hashCode() + ((this.f60444b.hashCode() + (this.f60443a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Result(config=" + this.f60443a + ", applicant=" + this.f60444b + ", strings=" + this.f60445c + ")";
    }

    public C30079M(C29124h c29124h, AbstractC29172p abstractC29172p, C29983l c29983l) {
        this.f60443a = c29124h;
        this.f60444b = abstractC29172p;
        this.f60445c = c29983l;
    }
}
