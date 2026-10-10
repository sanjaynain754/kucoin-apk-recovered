package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30380i extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f61118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28052C f61119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30380i(AbstractC28052C abstractC28052C, Continuation continuation) {
        super(1, continuation);
        this.f61119b = abstractC28052C;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C30380i(this.f61119b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C30380i(this.f61119b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61118a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AbstractC28052C abstractC28052C = this.f61119b;
        this.f61118a = 1;
        Object strings = abstractC28052C.getStrings(this);
        if (strings == coroutine_suspended) {
            return coroutine_suspended;
        }
        return strings;
    }
}
