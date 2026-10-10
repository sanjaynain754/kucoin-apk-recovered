package com.sumsub.sns.internal.features.domain.fisherman;

import com.sumsub.fisherman.FishermanSDK;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30178b extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f60645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FishermanSDK f60646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f60647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30178b(FishermanSDK fishermanSDK, String str, Continuation continuation) {
        super(1, continuation);
        this.f60646b = fishermanSDK;
        this.f60647c = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C30178b(this.f60646b, this.f60647c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C30178b(this.f60646b, this.f60647c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60645a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FishermanSDK fishermanSDK = this.f60646b;
        String str = this.f60647c;
        this.f60645a = 1;
        Object objCapture = fishermanSDK.capture(str, this);
        if (objCapture == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objCapture;
    }
}
