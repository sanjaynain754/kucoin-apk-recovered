package com.kubi.quotefacade.event;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketListContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchListData", "CollectOrCancelCoin", "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;", "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MarketListContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MarketListContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;", "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent;", "marketType", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "itemPosition", "<init>", "(ILcom/kubi/data/entity/TradeItemBean;I)V", "getMarketType", "()I", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "getItemPosition", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CollectOrCancelCoin extends MarketListContract$UIIntent {
        private final int itemPosition;
        private final int marketType;

        @Nullable
        private final TradeItemBean tradeItemBean;

        public CollectOrCancelCoin(int i11, @Nullable TradeItemBean tradeItemBean, int i12) {
            super(null);
            this.marketType = i11;
            this.tradeItemBean = tradeItemBean;
            this.itemPosition = i12;
        }

        public final int getItemPosition() {
            return this.itemPosition;
        }

        public final int getMarketType() {
            return this.marketType;
        }

        @Nullable
        public final TradeItemBean getTradeItemBean() {
            return this.tradeItemBean;
        }
    }

    /* JADX INFO: compiled from: MarketListContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;", "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent;", "marketType", "", "l1p", "", "l2p", "pageSize", "symbol", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)V", "getMarketType", "()I", "getL1p", "()Ljava/lang/String;", "getL2p", "getPageSize", "getSymbol", "()Ljava/util/ArrayList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchListData extends MarketListContract$UIIntent {

        @NotNull
        private final String l1p;

        @NotNull
        private final String l2p;
        private final int marketType;
        private final int pageSize;

        @NotNull
        private final ArrayList<String> symbol;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchListData(int i11, @NotNull String l1p, @NotNull String l2p, int i12, @NotNull ArrayList<String> symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(l1p, "l1p");
            Intrinsics.checkNotNullParameter(l2p, "l2p");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.marketType = i11;
            this.l1p = l1p;
            this.l2p = l2p;
            this.pageSize = i12;
            this.symbol = symbol;
        }

        @NotNull
        public final String getL1p() {
            return this.l1p;
        }

        @NotNull
        public final String getL2p() {
            return this.l2p;
        }

        public final int getMarketType() {
            return this.marketType;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        @NotNull
        public final ArrayList<String> getSymbol() {
            return this.symbol;
        }
    }

    public /* synthetic */ MarketListContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarketListContract$UIIntent() {
    }
}
