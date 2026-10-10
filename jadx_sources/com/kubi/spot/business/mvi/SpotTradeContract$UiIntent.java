package com.kubi.spot.business.mvi;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotTradeContract.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetAssetTotal", "GetNoticeList", "GetComplianceInfo", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetAssetTotal;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetComplianceInfo;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SpotTradeContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: SpotTradeContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetAssetTotal;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetAssetTotal extends SpotTradeContract$UiIntent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetAssetTotal) && Intrinsics.areEqual(this.symbol, ((GetAssetTotal) other).symbol);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAssetTotal(@NotNull String symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetAssetTotal(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: SpotTradeContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetComplianceInfo;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetComplianceInfo extends SpotTradeContract$UiIntent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetComplianceInfo) && Intrinsics.areEqual(this.symbol, ((GetComplianceInfo) other).symbol);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetComplianceInfo(@NotNull String symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetComplianceInfo(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: SpotTradeContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent;", "symbolCode", "", "<init>", "(Ljava/lang/String;)V", "getSymbolCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetNoticeList extends SpotTradeContract$UiIntent {

        @NotNull
        private final String symbolCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetNoticeList) && Intrinsics.areEqual(this.symbolCode, ((GetNoticeList) other).symbolCode);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetNoticeList(@NotNull String symbolCode) {
            super(null);
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            this.symbolCode = symbolCode;
        }

        @NotNull
        public final String getSymbolCode() {
            return this.symbolCode;
        }

        public int hashCode() {
            return this.symbolCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetNoticeList(symbolCode=" + this.symbolCode + ')';
        }
    }

    public /* synthetic */ SpotTradeContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpotTradeContract$UiIntent() {
    }
}
