package com.kubi.spot.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.helper.SymbolInfoHelper;
import com.kubi.spot.tradeLogic.a;
import gf.C37890n;
import java.math.BigDecimal;
import o30.InterfaceC42953a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SymbolBeanWrapper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÂ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/spot/entity/SymbolBeanWrapper;", "Lcom/kubi/spot/tradeLogic/ISymbolInfo;", "symbol", "Lcom/kubi/data/entity/TradeItemBean;", "baseBalance", "Lcom/kubi/tradebase/entity/IBalance;", "quoteBalance", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/tradebase/entity/IBalance;Lcom/kubi/tradebase/entity/IBalance;)V", "getSymbol", "", "getQuoteMinSize", "Ljava/math/BigDecimal;", "getLimitVolMinSize", "getQuoteMaxSize", "getBaseMinSize", "getBaseMaxSize", "isTradeEnable", "", "getBaseBalance", "getQuoteBalance", "getSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolBeanWrapper implements a {

    @Nullable
    private final InterfaceC42953a baseBalance;

    @Nullable
    private final InterfaceC42953a quoteBalance;

    @NotNull
    private final TradeItemBean symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolBeanWrapper)) {
            return false;
        }
        SymbolBeanWrapper symbolBeanWrapper = (SymbolBeanWrapper) other;
        return Intrinsics.areEqual(this.symbol, symbolBeanWrapper.symbol) && Intrinsics.areEqual(this.baseBalance, symbolBeanWrapper.baseBalance) && Intrinsics.areEqual(this.quoteBalance, symbolBeanWrapper.quoteBalance);
    }

    public SymbolBeanWrapper(@NotNull TradeItemBean symbol, @Nullable InterfaceC42953a interfaceC42953a, @Nullable InterfaceC42953a interfaceC42953a2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.baseBalance = interfaceC42953a;
        this.quoteBalance = interfaceC42953a2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final TradeItemBean getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final InterfaceC42953a getBaseBalance() {
        return this.baseBalance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final InterfaceC42953a getQuoteBalance() {
        return this.quoteBalance;
    }

    public static /* synthetic */ SymbolBeanWrapper copy$default(SymbolBeanWrapper symbolBeanWrapper, TradeItemBean tradeItemBean, InterfaceC42953a interfaceC42953a, InterfaceC42953a interfaceC42953a2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tradeItemBean = symbolBeanWrapper.symbol;
        }
        if ((i11 & 2) != 0) {
            interfaceC42953a = symbolBeanWrapper.baseBalance;
        }
        if ((i11 & 4) != 0) {
            interfaceC42953a2 = symbolBeanWrapper.quoteBalance;
        }
        return symbolBeanWrapper.copy(tradeItemBean, interfaceC42953a, interfaceC42953a2);
    }

    @NotNull
    public final SymbolBeanWrapper copy(@NotNull TradeItemBean symbol, @Nullable InterfaceC42953a interfaceC42953a, @Nullable InterfaceC42953a interfaceC42953a2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new SymbolBeanWrapper(symbol, interfaceC42953a, interfaceC42953a2);
    }

    @Nullable
    public InterfaceC42953a getBaseBalance() {
        return this.baseBalance;
    }

    @NotNull
    public BigDecimal getBaseMaxSize() {
        return new BigDecimal(String.valueOf(this.symbol.getSymbolInfoEntity().getBaseMaxSize()));
    }

    @NotNull
    public BigDecimal getBaseMinSize() {
        return new BigDecimal(String.valueOf(this.symbol.getSymbolInfoEntity().getBaseMinSize()));
    }

    @NotNull
    public BigDecimal getLimitVolMinSize() {
        return new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(this.symbol.getSymbolInfoEntity().getQuoteCurrency())));
    }

    @Nullable
    public InterfaceC42953a getQuoteBalance() {
        return this.quoteBalance;
    }

    @NotNull
    public BigDecimal getQuoteMaxSize() {
        return new BigDecimal(String.valueOf(this.symbol.getSymbolInfoEntity().getQuoteMaxSize()));
    }

    @NotNull
    public BigDecimal getQuoteMinSize() {
        return new BigDecimal(String.valueOf(this.symbol.getSymbolInfoEntity().getQuoteMinSize()));
    }

    @NotNull
    public String getSymbol() {
        String symbol = this.symbol.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    @NotNull
    public final SymbolInfoEntity getSymbolInfo() {
        SymbolInfoEntity symbolInfoEntity = this.symbol.getSymbolInfoEntity();
        Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
        return symbolInfoEntity;
    }

    public int hashCode() {
        int iHashCode = this.symbol.hashCode() * 31;
        InterfaceC42953a interfaceC42953a = this.baseBalance;
        int iHashCode2 = (iHashCode + (interfaceC42953a == null ? 0 : interfaceC42953a.hashCode())) * 31;
        InterfaceC42953a interfaceC42953a2 = this.quoteBalance;
        return iHashCode2 + (interfaceC42953a2 != null ? interfaceC42953a2.hashCode() : 0);
    }

    public boolean isTradeEnable() {
        return SymbolInfoHelper.f50575a.m61804a(this.symbol, true);
    }

    @NotNull
    public String toString() {
        return "SymbolBeanWrapper(symbol=" + this.symbol + ", baseBalance=" + this.baseBalance + ", quoteBalance=" + this.quoteBalance + ')';
    }
}
