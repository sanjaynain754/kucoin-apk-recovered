package com.kubi.tradebase.business.kyc;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: KycViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.kyc.KycViewModel$getKycInfo$3", m90122f = "KycViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KycViewModel$getKycInfo$3 extends SuspendLambda implements Function3<InterfaceC41635f<? super NoticeDetailEntity>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onComplete;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycViewModel$getKycInfo$3(Function0<Unit> function0, Continuation<? super KycViewModel$getKycInfo$3> continuation) {
        super(3, continuation);
        this.$onComplete = function0;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super NoticeDetailEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return new KycViewModel$getKycInfo$3(this.$onComplete, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Function0<Unit> function0 = this.$onComplete;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
