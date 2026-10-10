package com.kubi.core.biz.symbol;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UiState.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015¨\u0006%"}, m90084d2 = {"Lcom/kubi/core/biz/symbol/SymbolBizUiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeEnable", "", "isMaintenance", "isMargin", "<init>", "(Ljava/lang/String;Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/data/entity/SymbolInfoEntity;ZZZ)V", "getSymbol", "()Ljava/lang/String;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getTradeEnable", "()Z", "isInCallAuctionTrade", "isSupportLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolBizUiState implements InterfaceC19284f {
    private final boolean isMaintenance;
    private final boolean isMargin;

    @Nullable
    private final String symbol;

    @Nullable
    private final SymbolInfoEntity symbolInfo;
    private final boolean tradeEnable;

    @Nullable
    private final TradeItemBean tradeItemBean;

    public SymbolBizUiState() {
        this(null, null, null, false, false, false, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolBizUiState)) {
            return false;
        }
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) other;
        return Intrinsics.areEqual(this.symbol, symbolBizUiState.symbol) && Intrinsics.areEqual(this.tradeItemBean, symbolBizUiState.tradeItemBean) && Intrinsics.areEqual(this.symbolInfo, symbolBizUiState.symbolInfo) && this.tradeEnable == symbolBizUiState.tradeEnable && this.isMaintenance == symbolBizUiState.isMaintenance && this.isMargin == symbolBizUiState.isMargin;
    }

    public SymbolBizUiState(@Nullable String str, @Nullable TradeItemBean tradeItemBean, @Nullable SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12, boolean z13) {
        this.symbol = str;
        this.tradeItemBean = tradeItemBean;
        this.symbolInfo = symbolInfoEntity;
        this.tradeEnable = z11;
        this.isMaintenance = z12;
        this.isMargin = z13;
    }

    public static /* synthetic */ SymbolBizUiState copy$default(SymbolBizUiState symbolBizUiState, String str, TradeItemBean tradeItemBean, SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = symbolBizUiState.symbol;
        }
        if ((i11 & 2) != 0) {
            tradeItemBean = symbolBizUiState.tradeItemBean;
        }
        if ((i11 & 4) != 0) {
            symbolInfoEntity = symbolBizUiState.symbolInfo;
        }
        if ((i11 & 8) != 0) {
            z11 = symbolBizUiState.tradeEnable;
        }
        if ((i11 & 16) != 0) {
            z12 = symbolBizUiState.isMaintenance;
        }
        if ((i11 & 32) != 0) {
            z13 = symbolBizUiState.isMargin;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return symbolBizUiState.copy(str, tradeItemBean, symbolInfoEntity, z11, z14, z15);
    }

    @NotNull
    public final SymbolBizUiState copy(@Nullable String symbol, @Nullable TradeItemBean tradeItemBean, @Nullable SymbolInfoEntity symbolInfo, boolean tradeEnable, boolean isMaintenance, boolean isMargin) {
        return new SymbolBizUiState(symbol, tradeItemBean, symbolInfo, tradeEnable, isMaintenance, isMargin);
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final SymbolInfoEntity getSymbolInfo() {
        return this.symbolInfo;
    }

    @Nullable
    public final TradeItemBean getTradeItemBean() {
        return this.tradeItemBean;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TradeItemBean tradeItemBean = this.tradeItemBean;
        int iHashCode2 = (iHashCode + (tradeItemBean == null ? 0 : tradeItemBean.hashCode())) * 31;
        SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
        return ((((((iHashCode2 + (symbolInfoEntity != null ? symbolInfoEntity.hashCode() : 0)) * 31) + Boolean.hashCode(this.tradeEnable)) * 31) + Boolean.hashCode(this.isMaintenance)) * 31) + Boolean.hashCode(this.isMargin);
    }

    public final boolean isInCallAuctionTrade() {
        SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
        if (symbolInfoEntity != null ? Intrinsics.areEqual(symbolInfoEntity.getEnableAuctionTrade(), Boolean.TRUE) : false) {
            CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
            if (callAuctionSwitch.m21642h(this.isMargin) && callAuctionSwitch.m21637c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: isMaintenance, reason: from getter */
    public final boolean getIsMaintenance() {
        return this.isMaintenance;
    }

    public final boolean isSupportLabel() {
        SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
        return symbolInfoEntity != null && symbolInfoEntity.getMark() == 1;
    }

    @NotNull
    public String toString() {
        return "SymbolBizUiState(symbol=" + this.symbol + ", tradeItemBean=" + this.tradeItemBean + ", symbolInfo=" + this.symbolInfo + ", tradeEnable=" + this.tradeEnable + ", isMaintenance=" + this.isMaintenance + ", isMargin=" + this.isMargin + ')';
    }

    public /* synthetic */ SymbolBizUiState(String str, TradeItemBean tradeItemBean, SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : tradeItemBean, (i11 & 4) != 0 ? null : symbolInfoEntity, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
    }
}
