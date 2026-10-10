package com.kubi.tradebase.business.kyc;

import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KycViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.kyc.KycViewModel$getKycInfo$4", m90122f = "KycViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KycViewModel$getKycInfo$4 extends SuspendLambda implements Function2<NoticeDetailEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<NoticeDetailEntity> $completableDeferred;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KycViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(NoticeDetailEntity noticeDetailEntity, Continuation<? super Unit> continuation) {
        return ((KycViewModel$getKycInfo$4) create(noticeDetailEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycViewModel$getKycInfo$4(KycViewModel kycViewModel, InterfaceC41769w<NoticeDetailEntity> interfaceC41769w, Continuation<? super KycViewModel$getKycInfo$4> continuation) {
        super(2, continuation);
        this.this$0 = kycViewModel;
        this.$completableDeferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KycViewModel$getKycInfo$4 kycViewModel$getKycInfo$4 = new KycViewModel$getKycInfo$4(this.this$0, this.$completableDeferred, continuation);
        kycViewModel$getKycInfo$4.L$0 = obj;
        return kycViewModel$getKycInfo$4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NoticeDetailEntity noticeDetailEntity = (NoticeDetailEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m63184s(noticeDetailEntity, this.$completableDeferred);
        return Unit.INSTANCE;
    }
}
