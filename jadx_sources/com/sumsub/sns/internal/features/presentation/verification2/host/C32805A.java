package com.sumsub.sns.internal.features.presentation.verification2.host;

import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32805A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32814J f67137a;

    /* JADX INFO: renamed from: a */
    public final void m71346a(InterfaceC32830n interfaceC32830n) {
        if (Intrinsics.areEqual(interfaceC32830n, C32828l.f67176a)) {
            this.f67137a.fireEvent(C32807C.f67139a);
        } else {
            if (!Intrinsics.areEqual(interfaceC32830n, C32829m.f67177a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f67137a.fireEvent(C32809E.f67141a);
        }
    }

    public C32805A(C32814J c32814j) {
        this.f67137a = c32814j;
    }

    /* JADX INFO: renamed from: a */
    public final void m71347a(InterfaceC32834r interfaceC32834r) {
        if (Intrinsics.areEqual(interfaceC32834r, C32833q.f67180a)) {
            this.f67137a.fireEvent(C32808D.f67140a);
        } else if (Intrinsics.areEqual(interfaceC32834r, C32831o.f67178a)) {
            this.f67137a.fireEvent(C32806B.f67138a);
        } else {
            if (Intrinsics.areEqual(interfaceC32834r, C32832p.f67179a)) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this.f67137a), null, null, new C32841z(this.f67137a, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
