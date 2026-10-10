package com.kubi.kucoin.main;

import com.kubi.app.bizcontrol.BizControlService;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.mine.api.service.IMineService;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCoinMainActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.main.KuCoinMainActivity$queryKycStatus$1", m90122f = "KuCoinMainActivity.kt", m90123i = {1, 1}, m90124l = {418, 426}, m90125m = "invokeSuspend", m90126n = {"kycStatusEntity", "beforeType"}, m90127s = {"L$0", "L$1"})
public final class KuCoinMainActivity$queryKycStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KuCoinMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinMainActivity$queryKycStatus$1(KuCoinMainActivity kuCoinMainActivity, Continuation<? super KuCoinMainActivity$queryKycStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinMainActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuCoinMainActivity$queryKycStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinMainActivity$queryKycStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KycStatusEntity kycStatusEntity;
        String displayType;
        String displayType2;
        KycStatusEntity kycStatusEntity2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kycStatusEntity2 = (KycStatusEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            kycStatusEntity = kycStatusEntity2;
            this.this$0.f27971x.postValue(kycStatusEntity);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        IMineService iMineService = IMineService.f35025a.get();
        this.label = 1;
        obj = iMineService.mo41624g(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        kycStatusEntity = (KycStatusEntity) obj;
        KycStatusEntity kycStatusEntity3 = (KycStatusEntity) this.this$0.f27971x.getValue();
        String displayType3 = null;
        if (kycStatusEntity3 != null) {
            displayType = kycStatusEntity3.getDisplayType();
        } else {
            displayType = null;
        }
        if (displayType != null) {
            if (kycStatusEntity != null) {
                displayType2 = kycStatusEntity.getDisplayType();
            } else {
                displayType2 = null;
            }
            if (!Intrinsics.areEqual(displayType, displayType2)) {
                KycStyleType kycStyleType = KycStyleType.SUCCESS;
                if (kycStatusEntity != null) {
                    displayType3 = kycStatusEntity.getDisplayType();
                }
                if (kycStyleType.equalString(displayType3)) {
                    BizControlService bizControlService = BizControlService.f15438a;
                    this.L$0 = kycStatusEntity;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(displayType);
                    this.label = 2;
                    if (bizControlService.m14999h(this) != coroutine_suspended) {
                        kycStatusEntity2 = kycStatusEntity;
                        kycStatusEntity = kycStatusEntity2;
                    }
                    return coroutine_suspended;
                }
            }
        }
        this.this$0.f27971x.postValue(kycStatusEntity);
        return Unit.INSTANCE;
    }
}
