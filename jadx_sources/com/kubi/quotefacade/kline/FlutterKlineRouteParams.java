package com.kubi.quotefacade.kline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.kline.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: KlineRnDetailRouteHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/FlutterKlineRouteParams;", "", "symbol", "", "klineType", "leverTradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getKlineType", "getLeverTradeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlutterKlineRouteParams {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String klineType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String leverTradeType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlutterKlineRouteParams)) {
            return false;
        }
        FlutterKlineRouteParams flutterKlineRouteParams = (FlutterKlineRouteParams) other;
        return Intrinsics.areEqual(this.symbol, flutterKlineRouteParams.symbol) && Intrinsics.areEqual(this.klineType, flutterKlineRouteParams.klineType) && Intrinsics.areEqual(this.leverTradeType, flutterKlineRouteParams.leverTradeType);
    }

    public FlutterKlineRouteParams(@NotNull String symbol, @NotNull String klineType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        this.symbol = symbol;
        this.klineType = klineType;
        this.leverTradeType = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKlineType() {
        return this.klineType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeverTradeType() {
        return this.leverTradeType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + this.klineType.hashCode()) * 31;
        String str = this.leverTradeType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FlutterKlineRouteParams(symbol=" + this.symbol + ", klineType=" + this.klineType + ", leverTradeType=" + this.leverTradeType + ')';
    }
}
