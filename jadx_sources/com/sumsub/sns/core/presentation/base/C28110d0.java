package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28110d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57319a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f57321c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28142p0 f57322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28110d0(Function2 function2, AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(2, continuation);
        this.f57321c = function2;
        this.f57322d = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28110d0 c28110d0 = new C28110d0(this.f57321c, this.f57322d, continuation);
        c28110d0.f57320b = obj;
        return c28110d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28110d0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57319a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f57320b;
                Function2 function2 = this.f57321c;
                this.f57319a = 1;
                if (function2.invoke(interfaceC41709m0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f57322d.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f57322d.showProgress(false);
            throw th2;
        }
    }
}
