package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29134i3;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29550g0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30084S {

    /* JADX INFO: renamed from: a */
    public final String f60459a;

    /* JADX INFO: renamed from: b */
    public final C29550g0 f60460b;

    /* JADX INFO: renamed from: c */
    public final C29134i3 f60461c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30084S)) {
            return false;
        }
        C30084S c30084s = (C30084S) obj;
        return Intrinsics.areEqual(this.f60459a, c30084s.f60459a) && Intrinsics.areEqual(this.f60460b, c30084s.f60460b) && Intrinsics.areEqual(this.f60461c, c30084s.f60461c);
    }

    public final int hashCode() {
        return this.f60461c.hashCode() + ((this.f60460b.hashCode() + (this.f60459a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QuestionnaireInfo(questionnaireId=" + this.f60459a + ", questionnaireResponse=" + this.f60460b + ", questionnaireSubmitModel=" + this.f60461c + ")";
    }

    public C30084S(String str, C29550g0 c29550g0, C29134i3 c29134i3) {
        this.f60459a = str;
        this.f60460b = c29550g0;
        this.f60461c = c29134i3;
    }
}
