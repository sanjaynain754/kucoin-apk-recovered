package com.kubi.core.biz.banner;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.resources.widget.MarqueeTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotBannerContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "Lcom/kubi/mvi/state/IIntent;", "GetNoticeList", "SymbolChange", "JumpDetails", "Close", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$Close;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$GetNoticeList;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$JumpDetails;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$SymbolChange;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SpotBannerContract$Intent extends InterfaceC19282d {

    /* JADX INFO: compiled from: SpotBannerContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$Close;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "bannerEntity", "Lcom/kubi/core/biz/banner/SpotDisplayBanner;", "<init>", "(Lcom/kubi/core/biz/banner/SpotDisplayBanner;)V", "getBannerEntity", "()Lcom/kubi/core/biz/banner/SpotDisplayBanner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Close implements SpotBannerContract$Intent {

        @Nullable
        private final SpotDisplayBanner bannerEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Close) && Intrinsics.areEqual(this.bannerEntity, ((Close) other).bannerEntity);
        }

        @Nullable
        public final SpotDisplayBanner getBannerEntity() {
            return this.bannerEntity;
        }

        public int hashCode() {
            SpotDisplayBanner spotDisplayBanner = this.bannerEntity;
            if (spotDisplayBanner == null) {
                return 0;
            }
            return spotDisplayBanner.hashCode();
        }

        @NotNull
        public String toString() {
            return "Close(bannerEntity=" + this.bannerEntity + ')';
        }

        public Close(@Nullable SpotDisplayBanner spotDisplayBanner) {
            this.bannerEntity = spotDisplayBanner;
        }
    }

    /* JADX INFO: compiled from: SpotBannerContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$GetNoticeList;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetNoticeList implements SpotBannerContract$Intent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetNoticeList) && Intrinsics.areEqual(this.symbol, ((GetNoticeList) other).symbol);
        }

        public GetNoticeList(@NotNull String symbol) {
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
            return "GetNoticeList(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: SpotBannerContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$JumpDetails;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "currentIndex", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "<init>", "(Lcom/kubi/resources/widget/MarqueeTextView$IString;)V", "getCurrentIndex", "()Lcom/kubi/resources/widget/MarqueeTextView$IString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class JumpDetails implements SpotBannerContract$Intent {

        @Nullable
        private final MarqueeTextView.InterfaceC22932e currentIndex;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JumpDetails) && Intrinsics.areEqual(this.currentIndex, ((JumpDetails) other).currentIndex);
        }

        @Nullable
        public final MarqueeTextView.InterfaceC22932e getCurrentIndex() {
            return this.currentIndex;
        }

        public int hashCode() {
            MarqueeTextView.InterfaceC22932e interfaceC22932e = this.currentIndex;
            if (interfaceC22932e == null) {
                return 0;
            }
            return interfaceC22932e.hashCode();
        }

        @NotNull
        public String toString() {
            return "JumpDetails(currentIndex=" + this.currentIndex + ')';
        }
    }

    /* JADX INFO: compiled from: SpotBannerContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$Intent$SymbolChange;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SymbolChange implements SpotBannerContract$Intent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SymbolChange) && Intrinsics.areEqual(this.symbol, ((SymbolChange) other).symbol);
        }

        public SymbolChange(@NotNull String symbol) {
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
            return "SymbolChange(symbol=" + this.symbol + ')';
        }
    }
}
