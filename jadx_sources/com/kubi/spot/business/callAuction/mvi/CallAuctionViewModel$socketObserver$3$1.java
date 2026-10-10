package com.kubi.spot.business.callAuction.mvi;

import com.kubi.spot.entity.callAuction.WsCallAuctionEstimateInfoEntity;
import i20.CallAuctionInfo;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import w20.C45700a;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$socketObserver$3$1", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$socketObserver$3$1\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,333:1\n43#2,7:334\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$socketObserver$3$1\n*L\n193#1:334,7\n*E\n"})
public final class CallAuctionViewModel$socketObserver$3$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    final /* synthetic */ WsCallAuctionEstimateInfoEntity $wsEntity;
    int label;
    final /* synthetic */ CallAuctionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$socketObserver$3$1$a */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24766a implements Function1<UIState, UIState> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CallAuctionInfo f49876b;

        public C24766a(CallAuctionInfo callAuctionInfo) {
            this.f49876b = callAuctionInfo;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UIState invoke(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, this.f49876b, null, null, null, null, null, 62, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$socketObserver$3$1(CallAuctionViewModel callAuctionViewModel, WsCallAuctionEstimateInfoEntity wsCallAuctionEstimateInfoEntity, String str, Continuation<? super CallAuctionViewModel$socketObserver$3$1> continuation) {
        super(2, continuation);
        this.this$0 = callAuctionViewModel;
        this.$wsEntity = wsCallAuctionEstimateInfoEntity;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallAuctionViewModel$socketObserver$3$1(this.this$0, this.$wsEntity, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CallAuctionViewModel$socketObserver$3$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                this.this$0.updateState(new C24766a(this.this$0.m60565O(this.$wsEntity, this.$symbol)));
            } catch (Exception e11) {
                C45700a.m100877c(e11, "CallAuctionViewModel");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
