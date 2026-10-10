package com.kubi.core.biz.symbolbarold;

import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarContract$UiState, reason: from toString */
/* JADX INFO: compiled from: SymbolBarContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "leverConfig", "Lcom/kubi/core/biz/symbolbarold/LeverConfig;", "<init>", "(Ljava/lang/String;Lcom/kubi/core/biz/symbolbarold/LeverConfig;)V", "getSymbol", "()Ljava/lang/String;", "getLeverConfig", "()Lcom/kubi/core/biz/symbolbarold/LeverConfig;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @NotNull
    private final LeverConfig leverConfig;

    @Nullable
    private final String symbol;

    /* JADX WARN: Multi-variable type inference failed */
    public UiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && Intrinsics.areEqual(this.leverConfig, uiState.leverConfig);
    }

    public UiState(@Nullable String str, @NotNull LeverConfig leverConfig) {
        Intrinsics.checkNotNullParameter(leverConfig, "leverConfig");
        this.symbol = str;
        this.leverConfig = leverConfig;
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, String str, LeverConfig leverConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uiState.symbol;
        }
        if ((i11 & 2) != 0) {
            leverConfig = uiState.leverConfig;
        }
        return uiState.copy(str, leverConfig);
    }

    @NotNull
    public final UiState copy(@Nullable String str, @NotNull LeverConfig leverConfig) {
        Intrinsics.checkNotNullParameter(leverConfig, "leverConfig");
        return new UiState(str, leverConfig);
    }

    @NotNull
    public final LeverConfig getLeverConfig() {
        return this.leverConfig;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.leverConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", leverConfig=" + this.leverConfig + ')';
    }

    public /* synthetic */ UiState(String str, LeverConfig leverConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? new LeverConfig(null, false, null, false, 15, null) : leverConfig);
    }
}
