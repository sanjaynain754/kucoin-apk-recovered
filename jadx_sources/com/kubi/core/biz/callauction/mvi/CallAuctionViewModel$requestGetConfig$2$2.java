package com.kubi.core.biz.callauction.mvi;

import com.kubi.core.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import p428le.C42177a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import ve.C45518a;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$requestGetConfig$2$2", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CallAuctionViewModel$requestGetConfig$2$2 extends SuspendLambda implements Function2<CallAuctionEstimateInfoEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CallAuctionViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity, Continuation<? super Unit> continuation) {
        return ((CallAuctionViewModel$requestGetConfig$2$2) create(callAuctionEstimateInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$requestGetConfig$2$2(CallAuctionViewModel callAuctionViewModel, Continuation<? super CallAuctionViewModel$requestGetConfig$2$2> continuation) {
        super(2, continuation);
        this.this$0 = callAuctionViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CallAuctionViewModel$requestGetConfig$2$2 callAuctionViewModel$requestGetConfig$2$2 = new CallAuctionViewModel$requestGetConfig$2$2(this.this$0, continuation);
        callAuctionViewModel$requestGetConfig$2$2.L$0 = obj;
        return callAuctionViewModel$requestGetConfig$2$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity = (CallAuctionEstimateInfoEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C45518a.m100507a("repository.requestCallAuctionInfo.onSuccess", "CallAuctionViewModel");
        final C42177a c42177a = new C42177a();
        C45518a.m100507a("updateState:response", "CallAuctionViewModel");
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.callauction.mvi.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CallAuctionViewModel$requestGetConfig$2$2.m21685f(c42177a, callAuctionEstimateInfoEntity, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m21685f(C42177a c42177a, CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity, UIState uIState) {
        return UIState.copy$default(uIState, c42177a.m92612a(callAuctionEstimateInfoEntity), null, null, null, null, null, 62, null);
    }
}
