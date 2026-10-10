package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.C1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31990C1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28758x f65035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31990C1(C32072c2 c32072c2, C28758x c28758x, Continuation continuation) {
        super(2, continuation);
        this.f65034b = c32072c2;
        this.f65035c = c28758x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31990C1(this.f65034b, this.f65035c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31990C1(this.f65034b, this.f65035c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65033a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65034b.f65272o;
            C28758x c28758x = this.f65035c;
            this.f65033a = 1;
            if (interfaceC41668m.emit(c28758x, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
