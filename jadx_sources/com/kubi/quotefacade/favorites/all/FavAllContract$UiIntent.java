package com.kubi.quotefacade.favorites.all;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavAllContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchFavData", "PinItemToTop", "CollectOrCancelCoin", "UpdateSubscribe", "UpdateSubscribeAlpha", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FavAllContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FavAllContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "favType", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "itemPosition", "<init>", "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;I)V", "getFavType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "getItemPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CollectOrCancelCoin extends FavAllContract$UiIntent {

        @Nullable
        private final Integer favType;
        private final int itemPosition;

        @Nullable
        private final TradeItemBean tradeItemBean;

        public CollectOrCancelCoin(@Nullable Integer num, @Nullable TradeItemBean tradeItemBean, int i11) {
            super(null);
            this.favType = num;
            this.tradeItemBean = tradeItemBean;
            this.itemPosition = i11;
        }

        @Nullable
        public final Integer getFavType() {
            return this.favType;
        }

        public final int getItemPosition() {
            return this.itemPosition;
        }

        @Nullable
        public final TradeItemBean getTradeItemBean() {
            return this.tradeItemBean;
        }
    }

    /* JADX INFO: compiled from: FavAllContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchFavData extends FavAllContract$UiIntent {
        public FetchFavData() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FavAllContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "favType", "", "symbol", "", "datasource", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFavType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSymbol", "()Ljava/lang/String;", "getDatasource", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class PinItemToTop extends FavAllContract$UiIntent {

        @Nullable
        private final String datasource;

        @Nullable
        private final Integer favType;

        @Nullable
        private final String symbol;

        public PinItemToTop(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
            super(null);
            this.favType = num;
            this.symbol = str;
            this.datasource = str2;
        }

        @Nullable
        public final String getDatasource() {
            return this.datasource;
        }

        @Nullable
        public final Integer getFavType() {
            return this.favType;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }
    }

    /* JADX INFO: compiled from: FavAllContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "symbols", "", "", "favType", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getSymbols", "()Ljava/util/List;", "getFavType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;", "equals", "", "other", "", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateSubscribe extends FavAllContract$UiIntent {

        @Nullable
        private final Integer favType;

        @NotNull
        private final List<String> symbols;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateSubscribe)) {
                return false;
            }
            UpdateSubscribe updateSubscribe = (UpdateSubscribe) other;
            return Intrinsics.areEqual(this.symbols, updateSubscribe.symbols) && Intrinsics.areEqual(this.favType, updateSubscribe.favType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSubscribe(@NotNull List<String> symbols, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            this.symbols = symbols;
            this.favType = num;
        }

        @Nullable
        public final Integer getFavType() {
            return this.favType;
        }

        @NotNull
        public final List<String> getSymbols() {
            return this.symbols;
        }

        public int hashCode() {
            int iHashCode = this.symbols.hashCode() * 31;
            Integer num = this.favType;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "UpdateSubscribe(symbols=" + this.symbols + ", favType=" + this.favType + ')';
        }
    }

    /* JADX INFO: compiled from: FavAllContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "tokenBridgeId", "", "", "favType", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getTokenBridgeId", "()Ljava/util/List;", "getFavType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;", "equals", "", "other", "", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateSubscribeAlpha extends FavAllContract$UiIntent {

        @Nullable
        private final Integer favType;

        @NotNull
        private final List<String> tokenBridgeId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateSubscribeAlpha)) {
                return false;
            }
            UpdateSubscribeAlpha updateSubscribeAlpha = (UpdateSubscribeAlpha) other;
            return Intrinsics.areEqual(this.tokenBridgeId, updateSubscribeAlpha.tokenBridgeId) && Intrinsics.areEqual(this.favType, updateSubscribeAlpha.favType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSubscribeAlpha(@NotNull List<String> tokenBridgeId, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(tokenBridgeId, "tokenBridgeId");
            this.tokenBridgeId = tokenBridgeId;
            this.favType = num;
        }

        @NotNull
        public final List<String> getTokenBridgeId() {
            return this.tokenBridgeId;
        }

        public int hashCode() {
            int iHashCode = this.tokenBridgeId.hashCode() * 31;
            Integer num = this.favType;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "UpdateSubscribeAlpha(tokenBridgeId=" + this.tokenBridgeId + ", favType=" + this.favType + ')';
        }
    }

    public /* synthetic */ FavAllContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FavAllContract$UiIntent() {
    }
}
