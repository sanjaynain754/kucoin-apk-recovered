package com.kubi.core.biz.order.record.active;

import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.active.OpenOrdersRecordContract$UiState, reason: from toString */
/* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "isOnlyCurrentSymbol", "", "normalOrdersIsEmpty", "advanceOrdersIsEmpty", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "()Z", "getNormalOrdersIsEmpty", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdvanceOrdersIsEmpty", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiState;", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @Nullable
    private final Boolean advanceOrdersIsEmpty;
    private final boolean isOnlyCurrentSymbol;

    @Nullable
    private final Boolean normalOrdersIsEmpty;

    @Nullable
    private final String symbol;

    public UiState() {
        this(null, false, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && this.isOnlyCurrentSymbol == uiState.isOnlyCurrentSymbol && Intrinsics.areEqual(this.normalOrdersIsEmpty, uiState.normalOrdersIsEmpty) && Intrinsics.areEqual(this.advanceOrdersIsEmpty, uiState.advanceOrdersIsEmpty);
    }

    public UiState(@Nullable String str, boolean z11, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.symbol = str;
        this.isOnlyCurrentSymbol = z11;
        this.normalOrdersIsEmpty = bool;
        this.advanceOrdersIsEmpty = bool2;
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, String str, boolean z11, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uiState.symbol;
        }
        if ((i11 & 2) != 0) {
            z11 = uiState.isOnlyCurrentSymbol;
        }
        if ((i11 & 4) != 0) {
            bool = uiState.normalOrdersIsEmpty;
        }
        if ((i11 & 8) != 0) {
            bool2 = uiState.advanceOrdersIsEmpty;
        }
        return uiState.copy(str, z11, bool, bool2);
    }

    @NotNull
    public final UiState copy(@Nullable String symbol, boolean isOnlyCurrentSymbol, @Nullable Boolean normalOrdersIsEmpty, @Nullable Boolean advanceOrdersIsEmpty) {
        return new UiState(symbol, isOnlyCurrentSymbol, normalOrdersIsEmpty, advanceOrdersIsEmpty);
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isOnlyCurrentSymbol)) * 31;
        Boolean bool = this.normalOrdersIsEmpty;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.advanceOrdersIsEmpty;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isOnlyCurrentSymbol, reason: from getter */
    public final boolean getIsOnlyCurrentSymbol() {
        return this.isOnlyCurrentSymbol;
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", isOnlyCurrentSymbol=" + this.isOnlyCurrentSymbol + ", normalOrdersIsEmpty=" + this.normalOrdersIsEmpty + ", advanceOrdersIsEmpty=" + this.advanceOrdersIsEmpty + ')';
    }

    public /* synthetic */ UiState(String str, boolean z11, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2);
    }
}
