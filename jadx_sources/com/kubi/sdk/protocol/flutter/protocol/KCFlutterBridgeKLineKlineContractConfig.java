package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J²\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010AJ\t\u0010B\u001a\u00020\bHÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!¨\u0006C"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineContractConfig;", "", "pricePrecision", "", "lot", "", "tradePrecision", "multiplier", "", "baseCurrency", "quoteCurrency", "ticksize", "displayName", "displayPrep", "openTime", "isInverse", "displayBaseCurrency", "indexSymbol", "settleCurrency", "contractCurTradeUnit", "shortPrecision", "(JZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBaseCurrency", "()Ljava/lang/String;", "getContractCurTradeUnit", "getDisplayBaseCurrency", "getDisplayName", "getDisplayPrep", "getIndexSymbol", "()Z", "getLot", "getMultiplier", "getOpenTime", "()J", "getPricePrecision", "getQuoteCurrency", "getSettleCurrency", "getShortPrecision", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTicksize", "getTradePrecision", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineContractConfig;", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKLineKlineContractConfig {

    @NotNull
    private final String baseCurrency;

    @Nullable
    private final String contractCurTradeUnit;

    @NotNull
    private final String displayBaseCurrency;

    @NotNull
    private final String displayName;

    @NotNull
    private final String displayPrep;

    @NotNull
    private final String indexSymbol;
    private final boolean isInverse;
    private final boolean lot;

    @NotNull
    private final String multiplier;
    private final long openTime;
    private final long pricePrecision;

    @NotNull
    private final String quoteCurrency;

    @NotNull
    private final String settleCurrency;

    @Nullable
    private final Long shortPrecision;

    @NotNull
    private final String ticksize;
    private final long tradePrecision;

    public KCFlutterBridgeKLineKlineContractConfig(long j11, boolean z11, long j12, @NotNull String multiplier, @NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull String ticksize, @NotNull String displayName, @NotNull String displayPrep, long j13, boolean z12, @NotNull String displayBaseCurrency, @NotNull String indexSymbol, @NotNull String settleCurrency, @Nullable String str, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(ticksize, "ticksize");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPrep, "displayPrep");
        Intrinsics.checkNotNullParameter(displayBaseCurrency, "displayBaseCurrency");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        this.pricePrecision = j11;
        this.lot = z11;
        this.tradePrecision = j12;
        this.multiplier = multiplier;
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.ticksize = ticksize;
        this.displayName = displayName;
        this.displayPrep = displayPrep;
        this.openTime = j13;
        this.isInverse = z12;
        this.displayBaseCurrency = displayBaseCurrency;
        this.indexSymbol = indexSymbol;
        this.settleCurrency = settleCurrency;
        this.contractCurTradeUnit = str;
        this.shortPrecision = l11;
    }

    public static /* synthetic */ KCFlutterBridgeKLineKlineContractConfig copy$default(KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig, long j11, boolean z11, long j12, String str, String str2, String str3, String str4, String str5, String str6, long j13, boolean z12, String str7, String str8, String str9, String str10, Long l11, int i11, Object obj) {
        long j14 = (i11 & 1) != 0 ? kCFlutterBridgeKLineKlineContractConfig.pricePrecision : j11;
        return kCFlutterBridgeKLineKlineContractConfig.copy(j14, (i11 & 2) != 0 ? kCFlutterBridgeKLineKlineContractConfig.lot : z11, (i11 & 4) != 0 ? kCFlutterBridgeKLineKlineContractConfig.tradePrecision : j12, (i11 & 8) != 0 ? kCFlutterBridgeKLineKlineContractConfig.multiplier : str, (i11 & 16) != 0 ? kCFlutterBridgeKLineKlineContractConfig.baseCurrency : str2, (i11 & 32) != 0 ? kCFlutterBridgeKLineKlineContractConfig.quoteCurrency : str3, (i11 & 64) != 0 ? kCFlutterBridgeKLineKlineContractConfig.ticksize : str4, (i11 & 128) != 0 ? kCFlutterBridgeKLineKlineContractConfig.displayName : str5, (i11 & 256) != 0 ? kCFlutterBridgeKLineKlineContractConfig.displayPrep : str6, (i11 & 512) != 0 ? kCFlutterBridgeKLineKlineContractConfig.openTime : j13, (i11 & 1024) != 0 ? kCFlutterBridgeKLineKlineContractConfig.isInverse : z12, (i11 & 2048) != 0 ? kCFlutterBridgeKLineKlineContractConfig.displayBaseCurrency : str7, (i11 & 4096) != 0 ? kCFlutterBridgeKLineKlineContractConfig.indexSymbol : str8, (i11 & 8192) != 0 ? kCFlutterBridgeKLineKlineContractConfig.settleCurrency : str9, (i11 & 16384) != 0 ? kCFlutterBridgeKLineKlineContractConfig.contractCurTradeUnit : str10, (i11 & 32768) != 0 ? kCFlutterBridgeKLineKlineContractConfig.shortPrecision : l11);
    }

    @NotNull
    public final KCFlutterBridgeKLineKlineContractConfig copy(long pricePrecision, boolean lot, long tradePrecision, @NotNull String multiplier, @NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull String ticksize, @NotNull String displayName, @NotNull String displayPrep, long openTime, boolean isInverse, @NotNull String displayBaseCurrency, @NotNull String indexSymbol, @NotNull String settleCurrency, @Nullable String contractCurTradeUnit, @Nullable Long shortPrecision) {
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(ticksize, "ticksize");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPrep, "displayPrep");
        Intrinsics.checkNotNullParameter(displayBaseCurrency, "displayBaseCurrency");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        return new KCFlutterBridgeKLineKlineContractConfig(pricePrecision, lot, tradePrecision, multiplier, baseCurrency, quoteCurrency, ticksize, displayName, displayPrep, openTime, isInverse, displayBaseCurrency, indexSymbol, settleCurrency, contractCurTradeUnit, shortPrecision);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeKLineKlineContractConfig)) {
            return false;
        }
        KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig = (KCFlutterBridgeKLineKlineContractConfig) other;
        return this.pricePrecision == kCFlutterBridgeKLineKlineContractConfig.pricePrecision && this.lot == kCFlutterBridgeKLineKlineContractConfig.lot && this.tradePrecision == kCFlutterBridgeKLineKlineContractConfig.tradePrecision && Intrinsics.areEqual(this.multiplier, kCFlutterBridgeKLineKlineContractConfig.multiplier) && Intrinsics.areEqual(this.baseCurrency, kCFlutterBridgeKLineKlineContractConfig.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, kCFlutterBridgeKLineKlineContractConfig.quoteCurrency) && Intrinsics.areEqual(this.ticksize, kCFlutterBridgeKLineKlineContractConfig.ticksize) && Intrinsics.areEqual(this.displayName, kCFlutterBridgeKLineKlineContractConfig.displayName) && Intrinsics.areEqual(this.displayPrep, kCFlutterBridgeKLineKlineContractConfig.displayPrep) && this.openTime == kCFlutterBridgeKLineKlineContractConfig.openTime && this.isInverse == kCFlutterBridgeKLineKlineContractConfig.isInverse && Intrinsics.areEqual(this.displayBaseCurrency, kCFlutterBridgeKLineKlineContractConfig.displayBaseCurrency) && Intrinsics.areEqual(this.indexSymbol, kCFlutterBridgeKLineKlineContractConfig.indexSymbol) && Intrinsics.areEqual(this.settleCurrency, kCFlutterBridgeKLineKlineContractConfig.settleCurrency) && Intrinsics.areEqual(this.contractCurTradeUnit, kCFlutterBridgeKLineKlineContractConfig.contractCurTradeUnit) && Intrinsics.areEqual(this.shortPrecision, kCFlutterBridgeKLineKlineContractConfig.shortPrecision);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPricePrecision() {
        return this.pricePrecision;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getOpenTime() {
        return this.openTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsInverse() {
        return this.isInverse;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getContractCurTradeUnit() {
        return this.contractCurTradeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getShortPrecision() {
        return this.shortPrecision;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getLot() {
        return this.lot;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTradePrecision() {
        return this.tradePrecision;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTicksize() {
        return this.ticksize;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisplayPrep() {
        return this.displayPrep;
    }

    @NotNull
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getContractCurTradeUnit() {
        return this.contractCurTradeUnit;
    }

    @NotNull
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getDisplayPrep() {
        return this.displayPrep;
    }

    @NotNull
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    public final boolean getLot() {
        return this.lot;
    }

    @NotNull
    public final String getMultiplier() {
        return this.multiplier;
    }

    public final long getOpenTime() {
        return this.openTime;
    }

    public final long getPricePrecision() {
        return this.pricePrecision;
    }

    @NotNull
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    public final Long getShortPrecision() {
        return this.shortPrecision;
    }

    @NotNull
    public final String getTicksize() {
        return this.ticksize;
    }

    public final long getTradePrecision() {
        return this.tradePrecision;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.pricePrecision) * 31;
        boolean z11 = this.lot;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iHashCode2 = (((((((((((((((((iHashCode + r11) * 31) + Long.hashCode(this.tradePrecision)) * 31) + this.multiplier.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.ticksize.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.displayPrep.hashCode()) * 31) + Long.hashCode(this.openTime)) * 31;
        boolean z12 = this.isInverse;
        int iHashCode3 = (((((((iHashCode2 + (z12 ? 1 : z12)) * 31) + this.displayBaseCurrency.hashCode()) * 31) + this.indexSymbol.hashCode()) * 31) + this.settleCurrency.hashCode()) * 31;
        String str = this.contractCurTradeUnit;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.shortPrecision;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    public final boolean isInverse() {
        return this.isInverse;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pricePrecision", Long.valueOf(this.pricePrecision));
        linkedHashMap.put("lot", Boolean.valueOf(this.lot));
        linkedHashMap.put("tradePrecision", Long.valueOf(this.tradePrecision));
        linkedHashMap.put("multiplier", this.multiplier);
        linkedHashMap.put("baseCurrency", this.baseCurrency);
        linkedHashMap.put("quoteCurrency", this.quoteCurrency);
        linkedHashMap.put("ticksize", this.ticksize);
        linkedHashMap.put("displayName", this.displayName);
        linkedHashMap.put("displayPrep", this.displayPrep);
        linkedHashMap.put("openTime", Long.valueOf(this.openTime));
        linkedHashMap.put("isInverse", Boolean.valueOf(this.isInverse));
        linkedHashMap.put("displayBaseCurrency", this.displayBaseCurrency);
        linkedHashMap.put("indexSymbol", this.indexSymbol);
        linkedHashMap.put("settleCurrency", this.settleCurrency);
        linkedHashMap.put("contractCurTradeUnit", this.contractCurTradeUnit);
        linkedHashMap.put("shortPrecision", this.shortPrecision);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKLineKlineContractConfig(pricePrecision=" + this.pricePrecision + ", lot=" + this.lot + ", tradePrecision=" + this.tradePrecision + ", multiplier=" + this.multiplier + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", ticksize=" + this.ticksize + ", displayName=" + this.displayName + ", displayPrep=" + this.displayPrep + ", openTime=" + this.openTime + ", isInverse=" + this.isInverse + ", displayBaseCurrency=" + this.displayBaseCurrency + ", indexSymbol=" + this.indexSymbol + ", settleCurrency=" + this.settleCurrency + ", contractCurTradeUnit=" + this.contractCurTradeUnit + ", shortPrecision=" + this.shortPrecision + ')';
    }
}
