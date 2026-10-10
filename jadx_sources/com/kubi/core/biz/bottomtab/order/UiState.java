package com.kubi.core.biz.bottomtab.order;

import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.BalanceData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsContract$UiState, reason: from toString */
/* JADX INFO: compiled from: BottomOrderTabsContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010!\u001a\u00020\bJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\rHÆ\u0003J|\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\rHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "baseBalance", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "quoteBalance", "hasAssets", "", "isOnlyCurrentSymbol", "cancelAllAdvancedEnable", "cancelAllActiveEnable", "openOrdersNum", "", "advanceOrdersNum", "delegationCount", "<init>", "(Ljava/lang/String;Lcom/kubi/core/base/arch/api/data/BalanceData;Lcom/kubi/core/base/arch/api/data/BalanceData;ZZZZLjava/lang/Integer;Ljava/lang/Integer;I)V", "getSymbol", "()Ljava/lang/String;", "getBaseBalance", "()Lcom/kubi/core/base/arch/api/data/BalanceData;", "getQuoteBalance", "getHasAssets", "()Z", "getCancelAllAdvancedEnable", "getCancelAllActiveEnable", "getOpenOrdersNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdvanceOrdersNum", "getDelegationCount", "()I", "isZeroBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/kubi/core/base/arch/api/data/BalanceData;Lcom/kubi/core/base/arch/api/data/BalanceData;ZZZZLjava/lang/Integer;Ljava/lang/Integer;I)Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @Nullable
    private final Integer advanceOrdersNum;

    @Nullable
    private final BalanceData baseBalance;
    private final boolean cancelAllActiveEnable;
    private final boolean cancelAllAdvancedEnable;
    private final int delegationCount;
    private final boolean hasAssets;
    private final boolean isOnlyCurrentSymbol;

    @Nullable
    private final Integer openOrdersNum;

    @Nullable
    private final BalanceData quoteBalance;

    @Nullable
    private final String symbol;

    public UiState() {
        this(null, null, null, false, false, false, false, null, null, 0, 1023, null);
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, String str, BalanceData balanceData, BalanceData balanceData2, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, Integer num2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = uiState.symbol;
        }
        if ((i12 & 2) != 0) {
            balanceData = uiState.baseBalance;
        }
        if ((i12 & 4) != 0) {
            balanceData2 = uiState.quoteBalance;
        }
        if ((i12 & 8) != 0) {
            z11 = uiState.hasAssets;
        }
        if ((i12 & 16) != 0) {
            z12 = uiState.isOnlyCurrentSymbol;
        }
        if ((i12 & 32) != 0) {
            z13 = uiState.cancelAllAdvancedEnable;
        }
        if ((i12 & 64) != 0) {
            z14 = uiState.cancelAllActiveEnable;
        }
        if ((i12 & 128) != 0) {
            num = uiState.openOrdersNum;
        }
        if ((i12 & 256) != 0) {
            num2 = uiState.advanceOrdersNum;
        }
        if ((i12 & 512) != 0) {
            i11 = uiState.delegationCount;
        }
        Integer num3 = num2;
        int i13 = i11;
        boolean z15 = z14;
        Integer num4 = num;
        boolean z16 = z12;
        boolean z17 = z13;
        return uiState.copy(str, balanceData, balanceData2, z11, z16, z17, z15, num4, num3, i13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && Intrinsics.areEqual(this.baseBalance, uiState.baseBalance) && Intrinsics.areEqual(this.quoteBalance, uiState.quoteBalance) && this.hasAssets == uiState.hasAssets && this.isOnlyCurrentSymbol == uiState.isOnlyCurrentSymbol && this.cancelAllAdvancedEnable == uiState.cancelAllAdvancedEnable && this.cancelAllActiveEnable == uiState.cancelAllActiveEnable && Intrinsics.areEqual(this.openOrdersNum, uiState.openOrdersNum) && Intrinsics.areEqual(this.advanceOrdersNum, uiState.advanceOrdersNum) && this.delegationCount == uiState.delegationCount;
    }

    public UiState(@Nullable String str, @Nullable BalanceData balanceData, @Nullable BalanceData balanceData2, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable Integer num, @Nullable Integer num2, int i11) {
        this.symbol = str;
        this.baseBalance = balanceData;
        this.quoteBalance = balanceData2;
        this.hasAssets = z11;
        this.isOnlyCurrentSymbol = z12;
        this.cancelAllAdvancedEnable = z13;
        this.cancelAllActiveEnable = z14;
        this.openOrdersNum = num;
        this.advanceOrdersNum = num2;
        this.delegationCount = i11;
    }

    @NotNull
    public final UiState copy(@Nullable String str, @Nullable BalanceData balanceData, @Nullable BalanceData balanceData2, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable Integer num, @Nullable Integer num2, int i11) {
        return new UiState(str, balanceData, balanceData2, z11, z12, z13, z14, num, num2, i11);
    }

    @Nullable
    public final Integer getAdvanceOrdersNum() {
        return this.advanceOrdersNum;
    }

    @Nullable
    public final BalanceData getBaseBalance() {
        return this.baseBalance;
    }

    public final boolean getCancelAllActiveEnable() {
        return this.cancelAllActiveEnable;
    }

    public final boolean getCancelAllAdvancedEnable() {
        return this.cancelAllAdvancedEnable;
    }

    public final int getDelegationCount() {
        return this.delegationCount;
    }

    @Nullable
    public final Integer getOpenOrdersNum() {
        return this.openOrdersNum;
    }

    @Nullable
    public final BalanceData getQuoteBalance() {
        return this.quoteBalance;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BalanceData balanceData = this.baseBalance;
        int iHashCode2 = (iHashCode + (balanceData == null ? 0 : balanceData.hashCode())) * 31;
        BalanceData balanceData2 = this.quoteBalance;
        int iHashCode3 = (((((((((iHashCode2 + (balanceData2 == null ? 0 : balanceData2.hashCode())) * 31) + Boolean.hashCode(this.hasAssets)) * 31) + Boolean.hashCode(this.isOnlyCurrentSymbol)) * 31) + Boolean.hashCode(this.cancelAllAdvancedEnable)) * 31) + Boolean.hashCode(this.cancelAllActiveEnable)) * 31;
        Integer num = this.openOrdersNum;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.advanceOrdersNum;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.delegationCount);
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", baseBalance=" + this.baseBalance + ", quoteBalance=" + this.quoteBalance + ", hasAssets=" + this.hasAssets + ", isOnlyCurrentSymbol=" + this.isOnlyCurrentSymbol + ", cancelAllAdvancedEnable=" + this.cancelAllAdvancedEnable + ", cancelAllActiveEnable=" + this.cancelAllActiveEnable + ", openOrdersNum=" + this.openOrdersNum + ", advanceOrdersNum=" + this.advanceOrdersNum + ", delegationCount=" + this.delegationCount + ')';
    }

    public /* synthetic */ UiState(String str, BalanceData balanceData, BalanceData balanceData2, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, Integer num2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : balanceData, (i12 & 4) != 0 ? null : balanceData2, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? false : z14, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : num2, (i12 & 512) != 0 ? 0 : i11);
    }
}
