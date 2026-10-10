package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32539l0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66375a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f66377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32539l0(C28075O c28075o, Continuation continuation) {
        super(2, continuation);
        this.f66377c = c28075o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32539l0 c32539l0 = new C32539l0(this.f66377c, continuation);
        c32539l0.f66376b = obj;
        return c32539l0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32539l0 c32539l0 = new C32539l0(this.f66377c, (Continuation) obj2);
        c32539l0.f66376b = (InterfaceC41635f) obj;
        return c32539l0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM69770a;
        String strM69770a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66375a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f66376b;
            C29124h c29124h = this.f66377c.f57270b;
            String strM69770a3 = null;
            if (c29124h != null) {
                strM69770a = AbstractC29130i.m69770a("sumsubid.reuseNoData.title", c29124h.f59089v);
            } else {
                strM69770a = null;
            }
            if (c29124h != null) {
                strM69770a2 = AbstractC29130i.m69770a("sumsubid.reuseNoData.subtitle", c29124h.f59089v);
            } else {
                strM69770a2 = null;
            }
            if (c29124h != null) {
                strM69770a3 = AbstractC29130i.m69770a("sumsubid.reuseNoData.actionContinue", c29124h.f59089v);
            }
            C32494S0 c32494s0 = new C32494S0(strM69770a, strM69770a2, strM69770a3, new C32520f(Control.ContinueButton, new C32460B(0)));
            this.f66375a = 1;
            if (interfaceC41635f.emit(c32494s0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
