package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32242t implements InterfaceC32251x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32252y f65695a;

    /* JADX INFO: renamed from: b */
    public final AnswerType f65696b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32242t)) {
            return false;
        }
        C32242t c32242t = (C32242t) obj;
        return Intrinsics.areEqual(this.f65695a, c32242t.f65695a) && this.f65696b == c32242t.f65696b;
    }

    public final int hashCode() {
        return this.f65696b.hashCode() + (this.f65695a.hashCode() * 31);
    }

    public final String toString() {
        return "InProgress(status=" + this.f65695a + ", answer=" + this.f65696b + ")";
    }

    public C32242t(InterfaceC32252y interfaceC32252y, AnswerType answerType) {
        this.f65695a = interfaceC32252y;
        this.f65696b = answerType;
    }
}
