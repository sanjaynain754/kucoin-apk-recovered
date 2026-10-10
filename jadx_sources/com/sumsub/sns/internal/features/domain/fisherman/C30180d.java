package com.sumsub.sns.internal.features.domain.fisherman;

import com.sumsub.fisherman.FishermanSDK;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30180d extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f60652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FishermanSDK f60653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30180d(FishermanSDK fishermanSDK, Continuation continuation) {
        super(1, continuation);
        this.f60653b = fishermanSDK;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C30180d(this.f60653b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C30180d(this.f60653b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60652a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FishermanSDK fishermanSDK = this.f60653b;
        this.f60652a = 1;
        Object objPreheat = fishermanSDK.preheat(true, this);
        if (objPreheat == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objPreheat;
    }
}
