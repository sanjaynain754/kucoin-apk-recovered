package com.kubi.kyc.data;

import cn.InterfaceC5014a;
import com.kubi.kyc.api.KycInfoEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KycPrecheckRepository.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kyc/api/KycInfoEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.data.KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1", m90122f = "KycPrecheckRepository.kt", m90123i = {}, m90124l = {16}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super KycInfoEntity>, Object> {
    int label;
    final /* synthetic */ KycPrecheckRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1(KycPrecheckRepository kycPrecheckRepository, Continuation<? super KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = kycPrecheckRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super KycInfoEntity> continuation) {
        return ((KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC5014a interfaceC5014a = this.this$0.f31213a;
        this.label = 1;
        Object objM5429b = interfaceC5014a.m5429b(this);
        if (objM5429b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM5429b;
    }
}
