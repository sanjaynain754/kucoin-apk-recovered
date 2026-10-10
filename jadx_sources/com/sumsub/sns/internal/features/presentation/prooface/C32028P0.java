package com.sumsub.sns.internal.features.presentation.prooface;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.model.prooface.C29800C;
import com.sumsub.sns.internal.features.data.model.prooface.C29801D;
import com.sumsub.sns.internal.features.data.model.prooface.C29802E;
import com.sumsub.sns.internal.features.data.model.prooface.C29803F;
import com.sumsub.sns.internal.features.data.model.prooface.C29804G;
import com.sumsub.sns.internal.features.data.model.prooface.C29805H;
import com.sumsub.sns.internal.features.data.model.prooface.C29806I;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32144A0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32146B0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32253y0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32255z0;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32148C0;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32150D0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import java.io.IOException;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.P0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32028P0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32072c2 f65112a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70974a(InterfaceC32150D0 interfaceC32150D0, ContinuationImpl continuationImpl) {
        C32022N0 c32022n0;
        if (continuationImpl instanceof C32022N0) {
            c32022n0 = (C32022N0) continuationImpl;
            int i11 = c32022n0.f65090d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32022n0.f65090d = i11 - Integer.MIN_VALUE;
            } else {
                c32022n0 = new C32022N0(this, continuationImpl);
            }
        } else {
            c32022n0 = new C32022N0(this, continuationImpl);
        }
        Object obj = c32022n0.f65088b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32022n0.f65090d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC32267d.m71078a("ViewModel: handleTermination: terminalState: " + interfaceC32150D0);
            if (interfaceC32150D0 instanceof InterfaceC32148C0) {
                C32072c2 c32072c2 = this.f65112a;
                c32022n0.f65087a = (InterfaceC32148C0) interfaceC32150D0;
                c32022n0.f65090d = 1;
                if (C32072c2.m71013c(c32072c2, c32022n0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(interfaceC32150D0 instanceof C32253y0)) {
                    throw new NoWhenBranchMatchedException();
                }
                C41696j.m91104d(ViewModelKt.getViewModelScope(this.f65112a), null, null, new C32025O0(((C32253y0) interfaceC32150D0).f65709a.f59995a, this.f65112a, this, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC32150D0 = c32022n0.f65087a;
        ResultKt.throwOnFailure(obj);
        InterfaceC32148C0 interfaceC32148C0 = (InterfaceC32148C0) interfaceC32150D0;
        if (interfaceC32148C0 instanceof C32255z0) {
            SNSException.Network network = new SNSException.Network(((C32255z0) interfaceC32150D0).f65711a);
            m70975a(new C29803F(network));
            this.f65112a.m71017a(network);
        } else if (Intrinsics.areEqual(interfaceC32148C0, C32144A0.f65435a)) {
            m70975a(new C29802E(new IllegalStateException("Liveness init failure")));
        } else {
            if (!Intrinsics.areEqual(interfaceC32148C0, C32146B0.f65437a)) {
                throw new NoWhenBranchMatchedException();
            }
            m70975a(new C29803F(new IOException()));
        }
        return Unit.INSTANCE;
    }

    public C32028P0(C32072c2 c32072c2) {
        this.f65112a = c32072c2;
    }

    /* JADX INFO: renamed from: a */
    public final void m70975a(AbstractC29807J abstractC29807J) {
        AbstractC32267d.m71078a("ViewModel: finishWithReason: " + abstractC29807J);
        if (!(abstractC29807J instanceof C29806I) && !(abstractC29807J instanceof C29801D)) {
            if (abstractC29807J instanceof C29805H) {
                AbstractC28052C.finish$default(this.f65112a, C28491s.f58027b, null, null, null, 14, null);
                return;
            }
            if (abstractC29807J instanceof C29802E) {
                C32072c2 c32072c2 = this.f65112a;
                AbstractC28052C.throwError$default(c32072c2, ((C29802E) abstractC29807J).f59878a, c32072c2.f65258a.f59014a, null, 4, null);
                return;
            } else if (abstractC29807J instanceof C29803F) {
                C32072c2 c32072c3 = this.f65112a;
                AbstractC28052C.throwError$default(c32072c3, ((C29803F) abstractC29807J).f59879a, c32072c3.f65258a.f59014a, null, 4, null);
                return;
            } else {
                if (!Intrinsics.areEqual(abstractC29807J, C29800C.f59876a) && !Intrinsics.areEqual(abstractC29807J, C29804G.f59880a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC28052C.finish$default(this.f65112a, C28491s.f58027b, null, null, null, 14, null);
                return;
            }
        }
        AbstractC28052C.finish$default(this.f65112a, new C28494t(), null, null, null, 14, null);
    }
}
