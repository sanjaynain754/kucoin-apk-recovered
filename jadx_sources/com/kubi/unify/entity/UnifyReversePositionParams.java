package com.kubi.unify.entity;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyReversePositionParams.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyReversePositionParams;", "", "symbol", "", AppsFlyerProperties.CHANNEL, "leverage", "Ljava/math/BigDecimal;", "positionSide", "side", "qty", "marginMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getChannel", "getLeverage", "()Ljava/math/BigDecimal;", "getPositionSide", "getSide", "getQty", "getMarginMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyReversePositionParams {

    @NotNull
    private final String channel;

    @NotNull
    private final BigDecimal leverage;

    @NotNull
    private final String marginMode;

    @NotNull
    private final String positionSide;

    @NotNull
    private final BigDecimal qty;

    @NotNull
    private final String side;

    @NotNull
    private final String symbol;

    public UnifyReversePositionParams(@NotNull String symbol, @NotNull String channel, @NotNull BigDecimal leverage, @NotNull String positionSide, @NotNull String side, @NotNull BigDecimal qty, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        this.symbol = symbol;
        this.channel = channel;
        this.leverage = leverage;
        this.positionSide = positionSide;
        this.side = side;
        this.qty = qty;
        this.marginMode = marginMode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyReversePositionParams)) {
            return false;
        }
        UnifyReversePositionParams unifyReversePositionParams = (UnifyReversePositionParams) other;
        return Intrinsics.areEqual(this.symbol, unifyReversePositionParams.symbol) && Intrinsics.areEqual(this.channel, unifyReversePositionParams.channel) && Intrinsics.areEqual(this.leverage, unifyReversePositionParams.leverage) && Intrinsics.areEqual(this.positionSide, unifyReversePositionParams.positionSide) && Intrinsics.areEqual(this.side, unifyReversePositionParams.side) && Intrinsics.areEqual(this.qty, unifyReversePositionParams.qty) && Intrinsics.areEqual(this.marginMode, unifyReversePositionParams.marginMode);
    }

    public static /* synthetic */ UnifyReversePositionParams copy$default(UnifyReversePositionParams unifyReversePositionParams, String str, String str2, BigDecimal bigDecimal, String str3, String str4, BigDecimal bigDecimal2, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyReversePositionParams.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = unifyReversePositionParams.channel;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = unifyReversePositionParams.leverage;
        }
        if ((i11 & 8) != 0) {
            str3 = unifyReversePositionParams.positionSide;
        }
        if ((i11 & 16) != 0) {
            str4 = unifyReversePositionParams.side;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = unifyReversePositionParams.qty;
        }
        if ((i11 & 64) != 0) {
            str5 = unifyReversePositionParams.marginMode;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        String str6 = str5;
        String str7 = str4;
        BigDecimal bigDecimal4 = bigDecimal;
        return unifyReversePositionParams.copy(str, str2, bigDecimal4, str3, str7, bigDecimal3, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getQty() {
        return this.qty;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final UnifyReversePositionParams copy(@NotNull String symbol, @NotNull String channel, @NotNull BigDecimal leverage, @NotNull String positionSide, @NotNull String side, @NotNull BigDecimal qty, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        return new UnifyReversePositionParams(symbol, channel, leverage, positionSide, side, qty, marginMode);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    public final BigDecimal getQty() {
        return this.qty;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((((((((((this.symbol.hashCode() * 31) + this.channel.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.positionSide.hashCode()) * 31) + this.side.hashCode()) * 31) + this.qty.hashCode()) * 31) + this.marginMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnifyReversePositionParams(symbol=" + this.symbol + ", channel=" + this.channel + ", leverage=" + this.leverage + ", positionSide=" + this.positionSide + ", side=" + this.side + ", qty=" + this.qty + ", marginMode=" + this.marginMode + ')';
    }

    public /* synthetic */ UnifyReversePositionParams(String str, String str2, BigDecimal bigDecimal, String str3, String str4, BigDecimal bigDecimal2, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "ANDROID" : str2, bigDecimal, str3, str4, bigDecimal2, str5);
    }
}
