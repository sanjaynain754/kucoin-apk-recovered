package com.kubi.futures.trade.position;

import com.facebook.react.uimanager.ViewProps;
import fm.C37569d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.f3, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PositionRenderInfo.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionRenderInfo;", "", ViewProps.MARGIN, "", "leverage", "liquidation", "entryPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMargin", "()Ljava/lang/String;", "getLeverage", "getLiquidation", "getEntryPrice", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionRenderInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String margin;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String leverage;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String liquidation;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String entryPrice;

    public PositionRenderInfo() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionRenderInfo)) {
            return false;
        }
        PositionRenderInfo positionRenderInfo = (PositionRenderInfo) other;
        return Intrinsics.areEqual(this.margin, positionRenderInfo.margin) && Intrinsics.areEqual(this.leverage, positionRenderInfo.leverage) && Intrinsics.areEqual(this.liquidation, positionRenderInfo.liquidation) && Intrinsics.areEqual(this.entryPrice, positionRenderInfo.entryPrice);
    }

    public PositionRenderInfo(@NotNull String margin, @NotNull String leverage, @NotNull String liquidation, @NotNull String entryPrice) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(liquidation, "liquidation");
        Intrinsics.checkNotNullParameter(entryPrice, "entryPrice");
        this.margin = margin;
        this.leverage = leverage;
        this.liquidation = liquidation;
        this.entryPrice = entryPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLiquidation() {
        return this.liquidation;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMargin() {
        return this.margin;
    }

    public int hashCode() {
        return (((((this.margin.hashCode() * 31) + this.leverage.hashCode()) * 31) + this.liquidation.hashCode()) * 31) + this.entryPrice.hashCode();
    }

    @NotNull
    public String toString() {
        return "PositionRenderInfo(margin=" + this.margin + ", leverage=" + this.leverage + ", liquidation=" + this.liquidation + ", entryPrice=" + this.entryPrice + ')';
    }

    public /* synthetic */ PositionRenderInfo(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C37569d.m84684y() : str, (i11 & 2) != 0 ? C37569d.m84684y() : str2, (i11 & 4) != 0 ? C37569d.m84684y() : str3, (i11 & 8) != 0 ? C37569d.m84684y() : str4);
    }
}
