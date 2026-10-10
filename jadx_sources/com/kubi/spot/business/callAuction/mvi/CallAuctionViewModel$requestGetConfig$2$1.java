package com.kubi.spot.business.callAuction.mvi;

import com.kubi.spot.business.callAuction.bean.CallAuctionConfigBean;
import com.kubi.spot.entity.callAuction.CallAuctionConfigEntity;
import j20.C40250a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$requestGetConfig$2$1", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$requestGetConfig$2$1\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,333:1\n8#2,2:334\n8#2,2:336\n8#2,2:338\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$requestGetConfig$2$1\n*L\n104#1:334,2\n107#1:336,2\n114#1:338,2\n*E\n"})
public final class CallAuctionViewModel$requestGetConfig$2$1 extends SuspendLambda implements Function2<CallAuctionConfigEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $useCountDown;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CallAuctionViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(CallAuctionConfigEntity callAuctionConfigEntity, Continuation<? super Unit> continuation) {
        return ((CallAuctionViewModel$requestGetConfig$2$1) create(callAuctionConfigEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$requestGetConfig$2$1(CallAuctionViewModel callAuctionViewModel, boolean z11, Continuation<? super CallAuctionViewModel$requestGetConfig$2$1> continuation) {
        super(2, continuation);
        this.this$0 = callAuctionViewModel;
        this.$useCountDown = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CallAuctionViewModel$requestGetConfig$2$1 callAuctionViewModel$requestGetConfig$2$1 = new CallAuctionViewModel$requestGetConfig$2$1(this.this$0, this.$useCountDown, continuation);
        callAuctionViewModel$requestGetConfig$2$1.L$0 = obj;
        return callAuctionViewModel$requestGetConfig$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long countdown;
        CallAuctionConfigEntity callAuctionConfigEntity = (CallAuctionConfigEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j("trade|Spot|CallAuctionViewModel", "repository.requestGetConfig.onSuccess");
        final CallAuctionConfigBean callAuctionConfigBeanM88604a = new C40250a().m88604a(callAuctionConfigEntity);
        C44128b.m97266j("trade|Spot|CallAuctionViewModel", "updateState:callAuctionGetConfig phase");
        this.this$0.updateState(new Function1() { // from class: com.kubi.spot.business.callAuction.mvi.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CallAuctionViewModel$requestGetConfig$2$1.m60573f(callAuctionConfigBeanM88604a, (UIState) obj2);
            }
        });
        C44128b.m97266j("trade|Spot|CallAuctionViewModel", "repository.requestGetConfig.onSuccess: phase:" + ((UIState) this.this$0.getState()).getPhase() + " useCountDown:" + this.$useCountDown);
        if (((UIState) this.this$0.getState()).getPhase() != CallAuctionContract$Phase.OPENING && this.$useCountDown && (countdown = callAuctionConfigBeanM88604a.getCountdown()) != null) {
            this.this$0.m60538B(countdown.longValue() / ((long) 1000));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m60573f(CallAuctionConfigBean callAuctionConfigBean, UIState uIState) {
        CallAuctionContract$Phase phase = callAuctionConfigBean.getPhase();
        if (phase == null) {
            phase = CallAuctionContract$Phase.OPENING;
        }
        return UIState.copy$default(uIState, null, callAuctionConfigBean, phase, null, null, null, 57, null);
    }
}
