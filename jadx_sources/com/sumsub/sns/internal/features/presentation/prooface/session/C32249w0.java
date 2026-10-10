package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.selects.SelectImplementation;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.w0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32249w0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65704a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32231n0 f65706c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32233o0 f65707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32249w0(C32231n0 c32231n0, C32233o0 c32233o0, Continuation continuation) {
        super(2, continuation);
        this.f65706c = c32231n0;
        this.f65707d = c32233o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32249w0 c32249w0 = new C32249w0(this.f65706c, this.f65707d, continuation);
        c32249w0.f65705b = obj;
        return c32249w0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32249w0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65704a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41709m0 = (InterfaceC41709m0) this.f65705b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f65705b;
            C32231n0 c32231n0 = this.f65706c;
            C32233o0 c32233o0 = this.f65707d;
            SelectImplementation selectImplementation = new SelectImplementation(get$context());
            selectImplementation.mo91279g(C41696j.m91102b(interfaceC41709m1, null, null, new C32241s0(c32231n0, null), 3, null).mo91196C(), new C32243t0(null));
            selectImplementation.mo91279g(C41696j.m91102b(interfaceC41709m1, null, null, new C32245u0(c32233o0, null), 3, null).mo91196C(), new C32247v0(null));
            this.f65705b = interfaceC41709m1;
            this.f65704a = 1;
            obj = selectImplementation.m91283o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41709m0 = interfaceC41709m1;
        }
        JobKt__JobKt.m90365i(interfaceC41709m0.getCoroutineContext(), null, 1, null);
        return obj;
    }
}
