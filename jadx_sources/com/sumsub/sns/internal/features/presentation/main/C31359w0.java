package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.w0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31359w0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f63552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31359w0(C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63553b = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31359w0 c31359w0 = new C31359w0(this.f63553b, continuation);
        c31359w0.f63552a = ((Boolean) obj).booleanValue();
        return c31359w0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C31359w0 c31359w0 = new C31359w0(this.f63553b, (Continuation) obj2);
        c31359w0.f63552a = bool.booleanValue();
        return c31359w0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z11 = this.f63552a;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Show progress = " + z11, null);
        C31251c2 c31251c2 = this.f63553b;
        C31355v0 c31355v0 = new C31355v0(z11, null);
        C31363x0 c31363x0 = C31251c2.f63266C;
        c31251c2.updateState(true, c31355v0);
        this.f63553b.f63279m.f63400a.setValue(Boolean.valueOf(z11));
        if (z11) {
            C31251c2 c31251c3 = this.f63553b;
            InterfaceC41775x1 interfaceC41775x1 = c31251c3.f63286t;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            c31251c3.f63286t = null;
            AbstractC28073M0.updateState$default(c31251c3, false, new C31367y0(null), 1, null);
            c31251c3.f63286t = C41696j.m91104d(ViewModelKt.getViewModelScope(c31251c3), null, null, new C31258e1(c31251c3, null), 3, null);
        } else {
            C31251c2 c31251c4 = this.f63553b;
            InterfaceC41775x1 interfaceC41775x2 = c31251c4.f63286t;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            c31251c4.f63286t = null;
            AbstractC28073M0.updateState$default(c31251c4, false, new C31367y0(null), 1, null);
        }
        return Unit.INSTANCE;
    }
}
