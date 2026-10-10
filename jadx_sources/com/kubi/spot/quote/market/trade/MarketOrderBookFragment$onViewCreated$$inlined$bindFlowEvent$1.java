package com.kubi.spot.quote.market.trade;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$Phase;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import t20.C44653m0;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.trade.MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1", m90122f = "MarketOrderBookFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 MarketOrderBookFragment.kt\ncom/kubi/spot/quote/market/trade/MarketOrderBookFragment\n*L\n1#1,187:1\n142#2,6:188\n*E\n"})
public final class MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketOrderBookFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1(String str, Continuation continuation, MarketOrderBookFragment marketOrderBookFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = marketOrderBookFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1 marketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1 = new MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        marketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1.L$0 = obj;
        return marketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        KuCoinDepthView kuCoinDepthView;
        KuCoinDepthView kuCoinDepthView2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof CallAuctionContract$Phase)) {
                    if (((CallAuctionContract$Phase) c43460a.getData()) == CallAuctionContract$Phase.OPENING || !CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
                        C44653m0 c44653m0M62802y3 = this.this$0.m62802y3();
                        if (c44653m0M62802y3 != null && (kuCoinDepthView = c44653m0M62802y3.f99218c) != null) {
                            ViewExtKt.m66594y(kuCoinDepthView);
                        }
                    } else {
                        C44653m0 c44653m0M62802y4 = this.this$0.m62802y3();
                        if (c44653m0M62802y4 != null && (kuCoinDepthView2 = c44653m0M62802y4.f99218c) != null) {
                            ViewExtKt.m66577h(kuCoinDepthView2);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
