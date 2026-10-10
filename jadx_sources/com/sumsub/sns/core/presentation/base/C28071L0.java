package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28071L0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41668m f57262a;

    /* JADX INFO: renamed from: b */
    public int f57263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28073M0 f57264c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function2 f57265d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC28147s f57266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28071L0(AbstractC28073M0 abstractC28073M0, Function2 function2, InterfaceC28147s interfaceC28147s, Continuation continuation) {
        super(2, continuation);
        this.f57264c = abstractC28073M0;
        this.f57265d = function2;
        this.f57266e = interfaceC28147s;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28071L0(this.f57264c, this.f57265d, this.f57266e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28071L0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41668m interfaceC41668m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57263b;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41668m = this.f57262a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m2 = this.f57264c._viewState;
            Function2 function2 = this.f57265d;
            InterfaceC28147s interfaceC28147s = this.f57266e;
            this.f57262a = interfaceC41668m2;
            this.f57263b = 1;
            Object objInvoke = function2.invoke(interfaceC28147s, this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41668m = interfaceC41668m2;
            obj = objInvoke;
        }
        interfaceC41668m.mo90855d(obj);
        return Unit.INSTANCE;
    }
}
