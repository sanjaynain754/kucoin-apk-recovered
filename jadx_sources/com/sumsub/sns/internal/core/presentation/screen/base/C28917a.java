package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28917a {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f58801a;

    /* JADX INFO: renamed from: b */
    public final AbstractC28503w f58802b;

    /* JADX INFO: renamed from: c */
    public final ErrorClosure$Outcome f58803c;

    /* JADX INFO: renamed from: d */
    public final String f58804d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28917a)) {
            return false;
        }
        C28917a c28917a = (C28917a) obj;
        return Intrinsics.areEqual(this.f58801a, c28917a.f58801a) && Intrinsics.areEqual(this.f58802b, c28917a.f58802b) && this.f58803c == c28917a.f58803c && Intrinsics.areEqual(this.f58804d, c28917a.f58804d);
    }

    public final int hashCode() {
        int iHashCode = (this.f58803c.hashCode() + ((this.f58802b.hashCode() + (this.f58801a.hashCode() * 31)) * 31)) * 31;
        String str = this.f58804d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ErrorClosure(error=" + this.f58801a + ", finishReason=" + this.f58802b + ", outcome=" + this.f58803c + ", requestKey=" + this.f58804d + ")";
    }

    public C28917a(AbstractC29149l0 abstractC29149l0, AbstractC28503w abstractC28503w, ErrorClosure$Outcome errorClosure$Outcome, String str) {
        this.f58801a = abstractC29149l0;
        this.f58802b = abstractC28503w;
        this.f58803c = errorClosure$Outcome;
        this.f58804d = str;
    }
}
