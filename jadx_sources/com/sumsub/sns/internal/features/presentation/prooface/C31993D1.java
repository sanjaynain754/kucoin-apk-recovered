package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.D1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31993D1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31993D1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65040b = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31993D1(this.f65040b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31993D1(this.f65040b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65039a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65040b.f65274q;
            Unit unit = Unit.INSTANCE;
            this.f65039a = 1;
            if (interfaceC41668m.emit(unit, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
