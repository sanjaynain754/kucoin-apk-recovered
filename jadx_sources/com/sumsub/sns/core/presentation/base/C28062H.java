package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28062H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28064I f57234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f57235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28062H(AbstractC28064I abstractC28064I, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f57234b = abstractC28064I;
        this.f57235c = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28062H c28062h = new C28062H(this.f57234b, this.f57235c, continuation);
        c28062h.f57233a = obj;
        return c28062h;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28062H) create((InterfaceC28147s) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC28147s interfaceC28147s = (InterfaceC28147s) this.f57233a;
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this.f57234b), "Lifecycle New state: " + interfaceC28147s, null, 4, null);
        AbstractC28064I abstractC28064I = this.f57234b;
        abstractC28064I.handleState(interfaceC28147s, abstractC28064I.lastViewState, this.f57235c);
        this.f57234b.lastViewState = interfaceC28147s;
        return Unit.INSTANCE;
    }
}
