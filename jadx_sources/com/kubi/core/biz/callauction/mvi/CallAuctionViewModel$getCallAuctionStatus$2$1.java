package com.kubi.core.biz.callauction.mvi;

import com.kubi.core.spot.entity.TradeItemBeanEquals;
import com.kubi.core.spot.exeption.SpotMessage;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.utils.C27099x;
import gf.C37890n;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ve.C45518a;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolPreviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$getCallAuctionStatus$2$1", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {338}, m90125m = "invokeSuspend", m90126n = {"it", "tradeItemBean", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$2$1\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,332:1\n35#2,3:333\n196#3,3:336\n55#4,2:339\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$2$1\n*L\n147#1:333,3\n146#1:336,3\n152#1:339,2\n*E\n"})
public final class CallAuctionViewModel$getCallAuctionStatus$2$1 extends SuspendLambda implements Function2<SymbolPreviewEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBeanEquals $tradeItemBeanEquals;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CallAuctionViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(SymbolPreviewEntity symbolPreviewEntity, Continuation<? super Unit> continuation) {
        return ((CallAuctionViewModel$getCallAuctionStatus$2$1) create(symbolPreviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$getCallAuctionStatus$2$1(TradeItemBeanEquals tradeItemBeanEquals, CallAuctionViewModel callAuctionViewModel, Continuation<? super CallAuctionViewModel$getCallAuctionStatus$2$1> continuation) {
        super(2, continuation);
        this.$tradeItemBeanEquals = tradeItemBeanEquals;
        this.this$0 = callAuctionViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m21681f(TradeItemBeanEquals tradeItemBeanEquals, UIState uIState) {
        return UIState.copy$default(uIState, null, null, null, null, null, tradeItemBeanEquals, 31, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CallAuctionViewModel$getCallAuctionStatus$2$1 callAuctionViewModel$getCallAuctionStatus$2$1 = new CallAuctionViewModel$getCallAuctionStatus$2$1(this.$tradeItemBeanEquals, this.this$0, continuation);
        callAuctionViewModel$getCallAuctionStatus$2$1.L$0 = obj;
        return callAuctionViewModel$getCallAuctionStatus$2$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM66919i;
        TradeItemBeanEquals tradeItemBeanEquals;
        final TradeItemBeanEquals tradeItemBeanEquals2;
        SymbolPreviewEntity symbolPreviewEntity = (SymbolPreviewEntity) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C45518a.m100507a("repository.getPreviewInfo.onSuccess", "CallAuctionViewModel");
            TradeItemBeanEquals tradeItemBeanEquals3 = new TradeItemBeanEquals();
            C27099x c27099x = C27099x.f54458a;
            SymbolInfoEntity symbolInfoEntity = this.$tradeItemBeanEquals.getSymbolInfoEntity();
            if (symbolInfoEntity == null || (strM66919i = C27099x.m66919i(symbolInfoEntity, false, 2, null)) == null) {
                strM66919i = "";
            }
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C11830x6efe37a3(strM66919i, null)), C42911a.m94120b());
            this.L$0 = symbolPreviewEntity;
            this.L$1 = tradeItemBeanEquals3;
            this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$3 = SpillingKt.nullOutSpilledVariable(strM66919i);
            this.L$4 = tradeItemBeanEquals3;
            this.I$0 = 0;
            this.label = 1;
            Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            tradeItemBeanEquals = tradeItemBeanEquals3;
            obj = objM90914f0;
            tradeItemBeanEquals2 = tradeItemBeanEquals;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tradeItemBeanEquals = (TradeItemBeanEquals) this.L$4;
            tradeItemBeanEquals2 = (TradeItemBeanEquals) this.L$1;
            ResultKt.throwOnFailure(obj);
        }
        tradeItemBeanEquals.setSymbolInfoEntity((SymbolInfoEntity) obj);
        tradeItemBeanEquals2.getSymbolInfoEntity().setEnableAuctionTrade(symbolPreviewEntity.isEnableAuctionTrade());
        C37890n.f85269a.m85607H(tradeItemBeanEquals2.getSymbolInfoEntity());
        if (Intrinsics.areEqual(symbolPreviewEntity.isEnableAuctionTrade(), Boxing.boxBoolean(true))) {
            C43846g.m96568c(new SpotMessage("isEnableAuctionTrade is true", "CallAuctionViewModel", false, 4, null), null, 2, null);
        }
        C45518a.m100507a("updateState:response", "CallAuctionViewModel");
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.callauction.mvi.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CallAuctionViewModel$getCallAuctionStatus$2$1.m21681f(tradeItemBeanEquals2, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
