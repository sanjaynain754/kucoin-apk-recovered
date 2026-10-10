package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitReversePositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "", "symbol", "", "positionSide", "leverage", "Ljava/math/BigDecimal;", "fundsType", AppsFlyerProperties.CHANNEL, "side", "qty", "marginMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPositionSide", "getLeverage", "()Ljava/math/BigDecimal;", "getFundsType", "getChannel", "getSide", "getQty", "getMarginMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitReversePositionEntity {

    @NotNull
    private final String channel;

    @NotNull
    private final String fundsType;

    @NotNull
    private final BigDecimal leverage;

    @Nullable
    private final String marginMode;

    @NotNull
    private final String positionSide;

    @Nullable
    private final BigDecimal qty;

    @Nullable
    private final String side;

    @NotNull
    private final String symbol;

    public SubmitReversePositionEntity(@NotNull String symbol, @NotNull String positionSide, @NotNull BigDecimal leverage, @NotNull String fundsType, @NotNull String channel, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.symbol = symbol;
        this.positionSide = positionSide;
        this.leverage = leverage;
        this.fundsType = fundsType;
        this.channel = channel;
        this.side = str;
        this.qty = bigDecimal;
        this.marginMode = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitReversePositionEntity)) {
            return false;
        }
        SubmitReversePositionEntity submitReversePositionEntity = (SubmitReversePositionEntity) other;
        return Intrinsics.areEqual(this.symbol, submitReversePositionEntity.symbol) && Intrinsics.areEqual(this.positionSide, submitReversePositionEntity.positionSide) && Intrinsics.areEqual(this.leverage, submitReversePositionEntity.leverage) && Intrinsics.areEqual(this.fundsType, submitReversePositionEntity.fundsType) && Intrinsics.areEqual(this.channel, submitReversePositionEntity.channel) && Intrinsics.areEqual(this.side, submitReversePositionEntity.side) && Intrinsics.areEqual(this.qty, submitReversePositionEntity.qty) && Intrinsics.areEqual(this.marginMode, submitReversePositionEntity.marginMode);
    }

    public static /* synthetic */ SubmitReversePositionEntity copy$default(SubmitReversePositionEntity submitReversePositionEntity, String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, BigDecimal bigDecimal2, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitReversePositionEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = submitReversePositionEntity.positionSide;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = submitReversePositionEntity.leverage;
        }
        if ((i11 & 8) != 0) {
            str3 = submitReversePositionEntity.fundsType;
        }
        if ((i11 & 16) != 0) {
            str4 = submitReversePositionEntity.channel;
        }
        if ((i11 & 32) != 0) {
            str5 = submitReversePositionEntity.side;
        }
        if ((i11 & 64) != 0) {
            bigDecimal2 = submitReversePositionEntity.qty;
        }
        if ((i11 & 128) != 0) {
            str6 = submitReversePositionEntity.marginMode;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return submitReversePositionEntity.copy(str, str2, bigDecimal, str3, str8, str9, bigDecimal3, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getQty() {
        return this.qty;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final SubmitReversePositionEntity copy(@NotNull String symbol, @NotNull String positionSide, @NotNull BigDecimal leverage, @NotNull String fundsType, @NotNull String channel, @Nullable String side, @Nullable BigDecimal qty, @Nullable String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new SubmitReversePositionEntity(symbol, positionSide, leverage, fundsType, channel, side, qty, marginMode);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getFundsType() {
        return this.fundsType;
    }

    @NotNull
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final BigDecimal getQty() {
        return this.qty;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.symbol.hashCode() * 31) + this.positionSide.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.fundsType.hashCode()) * 31) + this.channel.hashCode()) * 31;
        String str = this.side;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.qty;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.marginMode;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmitReversePositionEntity(symbol=" + this.symbol + ", positionSide=" + this.positionSide + ", leverage=" + this.leverage + ", fundsType=" + this.fundsType + ", channel=" + this.channel + ", side=" + this.side + ", qty=" + this.qty + ", marginMode=" + this.marginMode + ')';
    }

    public /* synthetic */ SubmitReversePositionEntity(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, BigDecimal bigDecimal2, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, str3, (i11 & 16) != 0 ? "ANDROID" : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : str6);
    }
}
