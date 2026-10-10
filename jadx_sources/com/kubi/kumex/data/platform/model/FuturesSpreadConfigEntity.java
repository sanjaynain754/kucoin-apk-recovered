package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesSpreadConfigEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;", "", "symbol", "", "marketSlippageStep", "Ljava/math/BigDecimal;", "marketSlippageEnabled", "", "marketSlippageOpen", "maxMarketSlippageOpen", "marketSlippageClose", "maxMarketSlippageClose", "highSlippageWarningThreshold", "spread", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getMarketSlippageStep", "()Ljava/math/BigDecimal;", "getMarketSlippageEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketSlippageOpen", "getMaxMarketSlippageOpen", "getMarketSlippageClose", "getMaxMarketSlippageClose", "getHighSlippageWarningThreshold", "getSpread", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesSpreadConfigEntity {

    @Nullable
    private final BigDecimal highSlippageWarningThreshold;

    @Nullable
    private final BigDecimal marketSlippageClose;

    @Nullable
    private final Boolean marketSlippageEnabled;

    @Nullable
    private final BigDecimal marketSlippageOpen;

    @Nullable
    private final BigDecimal marketSlippageStep;

    @Nullable
    private final BigDecimal maxMarketSlippageClose;

    @Nullable
    private final BigDecimal maxMarketSlippageOpen;

    @Nullable
    private final BigDecimal spread;

    @Nullable
    private final String symbol;

    public FuturesSpreadConfigEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesSpreadConfigEntity)) {
            return false;
        }
        FuturesSpreadConfigEntity futuresSpreadConfigEntity = (FuturesSpreadConfigEntity) other;
        return Intrinsics.areEqual(this.symbol, futuresSpreadConfigEntity.symbol) && Intrinsics.areEqual(this.marketSlippageStep, futuresSpreadConfigEntity.marketSlippageStep) && Intrinsics.areEqual(this.marketSlippageEnabled, futuresSpreadConfigEntity.marketSlippageEnabled) && Intrinsics.areEqual(this.marketSlippageOpen, futuresSpreadConfigEntity.marketSlippageOpen) && Intrinsics.areEqual(this.maxMarketSlippageOpen, futuresSpreadConfigEntity.maxMarketSlippageOpen) && Intrinsics.areEqual(this.marketSlippageClose, futuresSpreadConfigEntity.marketSlippageClose) && Intrinsics.areEqual(this.maxMarketSlippageClose, futuresSpreadConfigEntity.maxMarketSlippageClose) && Intrinsics.areEqual(this.highSlippageWarningThreshold, futuresSpreadConfigEntity.highSlippageWarningThreshold) && Intrinsics.areEqual(this.spread, futuresSpreadConfigEntity.spread);
    }

    public FuturesSpreadConfigEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.symbol = str;
        this.marketSlippageStep = bigDecimal;
        this.marketSlippageEnabled = bool;
        this.marketSlippageOpen = bigDecimal2;
        this.maxMarketSlippageOpen = bigDecimal3;
        this.marketSlippageClose = bigDecimal4;
        this.maxMarketSlippageClose = bigDecimal5;
        this.highSlippageWarningThreshold = bigDecimal6;
        this.spread = bigDecimal7;
    }

    public static /* synthetic */ FuturesSpreadConfigEntity copy$default(FuturesSpreadConfigEntity futuresSpreadConfigEntity, String str, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresSpreadConfigEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = futuresSpreadConfigEntity.marketSlippageStep;
        }
        if ((i11 & 4) != 0) {
            bool = futuresSpreadConfigEntity.marketSlippageEnabled;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = futuresSpreadConfigEntity.marketSlippageOpen;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = futuresSpreadConfigEntity.maxMarketSlippageOpen;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = futuresSpreadConfigEntity.marketSlippageClose;
        }
        if ((i11 & 64) != 0) {
            bigDecimal5 = futuresSpreadConfigEntity.maxMarketSlippageClose;
        }
        if ((i11 & 128) != 0) {
            bigDecimal6 = futuresSpreadConfigEntity.highSlippageWarningThreshold;
        }
        if ((i11 & 256) != 0) {
            bigDecimal7 = futuresSpreadConfigEntity.spread;
        }
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal5;
        BigDecimal bigDecimal12 = bigDecimal3;
        Boolean bool2 = bool;
        return futuresSpreadConfigEntity.copy(str, bigDecimal, bool2, bigDecimal2, bigDecimal12, bigDecimal10, bigDecimal11, bigDecimal8, bigDecimal9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMarketSlippageStep() {
        return this.marketSlippageStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getMarketSlippageEnabled() {
        return this.marketSlippageEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMarketSlippageOpen() {
        return this.marketSlippageOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMaxMarketSlippageOpen() {
        return this.maxMarketSlippageOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMarketSlippageClose() {
        return this.marketSlippageClose;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMaxMarketSlippageClose() {
        return this.maxMarketSlippageClose;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getHighSlippageWarningThreshold() {
        return this.highSlippageWarningThreshold;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getSpread() {
        return this.spread;
    }

    @NotNull
    public final FuturesSpreadConfigEntity copy(@Nullable String symbol, @Nullable BigDecimal marketSlippageStep, @Nullable Boolean marketSlippageEnabled, @Nullable BigDecimal marketSlippageOpen, @Nullable BigDecimal maxMarketSlippageOpen, @Nullable BigDecimal marketSlippageClose, @Nullable BigDecimal maxMarketSlippageClose, @Nullable BigDecimal highSlippageWarningThreshold, @Nullable BigDecimal spread) {
        return new FuturesSpreadConfigEntity(symbol, marketSlippageStep, marketSlippageEnabled, marketSlippageOpen, maxMarketSlippageOpen, marketSlippageClose, maxMarketSlippageClose, highSlippageWarningThreshold, spread);
    }

    @Nullable
    public final BigDecimal getHighSlippageWarningThreshold() {
        return this.highSlippageWarningThreshold;
    }

    @Nullable
    public final BigDecimal getMarketSlippageClose() {
        return this.marketSlippageClose;
    }

    @Nullable
    public final Boolean getMarketSlippageEnabled() {
        return this.marketSlippageEnabled;
    }

    @Nullable
    public final BigDecimal getMarketSlippageOpen() {
        return this.marketSlippageOpen;
    }

    @Nullable
    public final BigDecimal getMarketSlippageStep() {
        return this.marketSlippageStep;
    }

    @Nullable
    public final BigDecimal getMaxMarketSlippageClose() {
        return this.maxMarketSlippageClose;
    }

    @Nullable
    public final BigDecimal getMaxMarketSlippageOpen() {
        return this.maxMarketSlippageOpen;
    }

    @Nullable
    public final BigDecimal getSpread() {
        return this.spread;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.marketSlippageStep;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.marketSlippageEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.marketSlippageOpen;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxMarketSlippageOpen;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.marketSlippageClose;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.maxMarketSlippageClose;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.highSlippageWarningThreshold;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.spread;
        return iHashCode8 + (bigDecimal7 != null ? bigDecimal7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesSpreadConfigEntity(symbol=" + this.symbol + ", marketSlippageStep=" + this.marketSlippageStep + ", marketSlippageEnabled=" + this.marketSlippageEnabled + ", marketSlippageOpen=" + this.marketSlippageOpen + ", maxMarketSlippageOpen=" + this.maxMarketSlippageOpen + ", marketSlippageClose=" + this.marketSlippageClose + ", maxMarketSlippageClose=" + this.maxMarketSlippageClose + ", highSlippageWarningThreshold=" + this.highSlippageWarningThreshold + ", spread=" + this.spread + ')';
    }

    public /* synthetic */ FuturesSpreadConfigEntity(String str, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7);
    }
}
