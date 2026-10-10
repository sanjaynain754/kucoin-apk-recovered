package com.kubi.core.biz.symbol;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import java.math.BigDecimal;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ShareSymbolBizVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.symbol.ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2", m90122f = "ShareSymbolBizVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nShareSymbolBizVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2\n+ 2 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM\n*L\n1#1,272:1\n265#2,3:273\n*S KotlinDebug\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2\n*L\n233#1:273,3\n*E\n"})
public final class ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2 extends SuspendLambda implements Function2<WsMarketSnapshotEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareSymbolBizVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(WsMarketSnapshotEntity wsMarketSnapshotEntity, Continuation<? super Unit> continuation) {
        return ((ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2) create(wsMarketSnapshotEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2(ShareSymbolBizVM shareSymbolBizVM, String str, Continuation<? super ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2> continuation) {
        super(2, continuation);
        this.this$0 = shareSymbolBizVM;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2 shareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2 = new ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2(this.this$0, this.$symbol, continuation);
        shareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2.L$0 = obj;
        return shareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TradeItemBean tradeItemBean;
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TradeItemBean tradeItemBean2 = this.this$0.f20868Z;
        if (Intrinsics.areEqual(tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, this.$symbol) && Intrinsics.areEqual(this.this$0.f20866X, this.$symbol) && (tradeItemBean = this.this$0.f20868Z) != null) {
            ShareSymbolBizVM shareSymbolBizVM = this.this$0;
            String str = this.$symbol;
            if (wsMarketSnapshotEntity != null) {
                wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
            }
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) shareSymbolBizVM.f20871c0.mo86421a());
            if (symbolBizUiState != null) {
                shareSymbolBizVM.f20871c0.mo90855d(SymbolBizUiState.copy$default(symbolBizUiState, null, tradeItemBean, null, false, false, false, 61, null));
            }
            shareSymbolBizVM.m22744x(str, wsMarketSnapshotEntity != null ? new BigDecimal(String.valueOf(wsMarketSnapshotEntity.getChangeRate())) : null);
        }
        return Unit.INSTANCE;
    }
}
