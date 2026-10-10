package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.channels.InterfaceC41565d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30469J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30469J0(C30444C2 c30444c2, Continuation continuation) {
        super(2, continuation);
        this.f61448b = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30469J0(this.f61448b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30469J0(this.f61448b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61447a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41565d interfaceC41565d = this.f61448b.f61351O;
            Unit unit = Unit.INSTANCE;
            this.f61447a = 1;
            if (interfaceC41565d.send(unit, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
