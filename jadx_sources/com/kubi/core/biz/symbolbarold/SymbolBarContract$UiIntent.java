package com.kubi.core.biz.symbolbarold;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SymbolBarContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "TradePanelModelChange", "SymbolChange", "ToMarketActivity", "ToLeverActivity", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$SymbolChange;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$ToLeverActivity;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$ToMarketActivity;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$TradePanelModelChange;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SymbolBarContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: SymbolBarContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$SymbolChange;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SymbolChange extends SymbolBarContract$UiIntent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SymbolChange) && Intrinsics.areEqual(this.symbol, ((SymbolChange) other).symbol);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SymbolChange(@NotNull String symbol) {
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
            return "SymbolChange(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: SymbolBarContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$ToLeverActivity;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "isIsolatedEnable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ToLeverActivity extends SymbolBarContract$UiIntent {
        private final boolean isIsolatedEnable;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToLeverActivity) && this.isIsolatedEnable == ((ToLeverActivity) other).isIsolatedEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isIsolatedEnable);
        }

        /* JADX INFO: renamed from: isIsolatedEnable, reason: from getter */
        public final boolean getIsIsolatedEnable() {
            return this.isIsolatedEnable;
        }

        @NotNull
        public String toString() {
            return "ToLeverActivity(isIsolatedEnable=" + this.isIsolatedEnable + ')';
        }
    }

    /* JADX INFO: compiled from: SymbolBarContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$TradePanelModelChange;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "mode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "<init>", "(Lcom/kubi/core/base/setting/data/TradePanelModel;)V", "getMode", "()Lcom/kubi/core/base/setting/data/TradePanelModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TradePanelModelChange extends SymbolBarContract$UiIntent {

        @NotNull
        private final InterfaceC38170b mode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TradePanelModelChange) && Intrinsics.areEqual(this.mode, ((TradePanelModelChange) other).mode);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradePanelModelChange(@NotNull InterfaceC38170b mode) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
        }

        @NotNull
        public final InterfaceC38170b getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        @NotNull
        public String toString() {
            return "TradePanelModelChange(mode=" + this.mode + ')';
        }
    }

    public /* synthetic */ SymbolBarContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SymbolBarContract$UiIntent() {
    }
}
