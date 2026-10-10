package com.kubi.core.biz.loan.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginLeverageEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/core/biz/loan/entity/MarginLeverageEntity;", "", "symbol", "", "symbolId", "isBaseAllowBorrow", "", "baseLeverage", "Ljava/math/BigDecimal;", "isQuoteAllowBorrow", "quoteLeverage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getSymbolId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBaseLeverage", "()Ljava/math/BigDecimal;", "getQuoteLeverage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;)Lcom/kubi/core/biz/loan/entity/MarginLeverageEntity;", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginLeverageEntity {

    @Nullable
    private final BigDecimal baseLeverage;

    @Nullable
    private final Boolean isBaseAllowBorrow;

    @Nullable
    private final Boolean isQuoteAllowBorrow;

    @Nullable
    private final BigDecimal quoteLeverage;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolId;

    public MarginLeverageEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginLeverageEntity)) {
            return false;
        }
        MarginLeverageEntity marginLeverageEntity = (MarginLeverageEntity) other;
        return Intrinsics.areEqual(this.symbol, marginLeverageEntity.symbol) && Intrinsics.areEqual(this.symbolId, marginLeverageEntity.symbolId) && Intrinsics.areEqual(this.isBaseAllowBorrow, marginLeverageEntity.isBaseAllowBorrow) && Intrinsics.areEqual(this.baseLeverage, marginLeverageEntity.baseLeverage) && Intrinsics.areEqual(this.isQuoteAllowBorrow, marginLeverageEntity.isQuoteAllowBorrow) && Intrinsics.areEqual(this.quoteLeverage, marginLeverageEntity.quoteLeverage);
    }

    public MarginLeverageEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal2) {
        this.symbol = str;
        this.symbolId = str2;
        this.isBaseAllowBorrow = bool;
        this.baseLeverage = bigDecimal;
        this.isQuoteAllowBorrow = bool2;
        this.quoteLeverage = bigDecimal2;
    }

    public static /* synthetic */ MarginLeverageEntity copy$default(MarginLeverageEntity marginLeverageEntity, String str, String str2, Boolean bool, BigDecimal bigDecimal, Boolean bool2, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginLeverageEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = marginLeverageEntity.symbolId;
        }
        if ((i11 & 4) != 0) {
            bool = marginLeverageEntity.isBaseAllowBorrow;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = marginLeverageEntity.baseLeverage;
        }
        if ((i11 & 16) != 0) {
            bool2 = marginLeverageEntity.isQuoteAllowBorrow;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = marginLeverageEntity.quoteLeverage;
        }
        Boolean bool3 = bool2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return marginLeverageEntity.copy(str, str2, bool, bigDecimal, bool3, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolId() {
        return this.symbolId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsBaseAllowBorrow() {
        return this.isBaseAllowBorrow;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBaseLeverage() {
        return this.baseLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsQuoteAllowBorrow() {
        return this.isQuoteAllowBorrow;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getQuoteLeverage() {
        return this.quoteLeverage;
    }

    @NotNull
    public final MarginLeverageEntity copy(@Nullable String symbol, @Nullable String symbolId, @Nullable Boolean isBaseAllowBorrow, @Nullable BigDecimal baseLeverage, @Nullable Boolean isQuoteAllowBorrow, @Nullable BigDecimal quoteLeverage) {
        return new MarginLeverageEntity(symbol, symbolId, isBaseAllowBorrow, baseLeverage, isQuoteAllowBorrow, quoteLeverage);
    }

    @Nullable
    public final BigDecimal getBaseLeverage() {
        return this.baseLeverage;
    }

    @Nullable
    public final BigDecimal getQuoteLeverage() {
        return this.quoteLeverage;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolId() {
        return this.symbolId;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isBaseAllowBorrow;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal = this.baseLeverage;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool2 = this.isQuoteAllowBorrow;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.quoteLeverage;
        return iHashCode5 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isBaseAllowBorrow() {
        return this.isBaseAllowBorrow;
    }

    @Nullable
    public final Boolean isQuoteAllowBorrow() {
        return this.isQuoteAllowBorrow;
    }

    @NotNull
    public String toString() {
        return "MarginLeverageEntity(symbol=" + this.symbol + ", symbolId=" + this.symbolId + ", isBaseAllowBorrow=" + this.isBaseAllowBorrow + ", baseLeverage=" + this.baseLeverage + ", isQuoteAllowBorrow=" + this.isQuoteAllowBorrow + ", quoteLeverage=" + this.quoteLeverage + ')';
    }

    public /* synthetic */ MarginLeverageEntity(String str, String str2, Boolean bool, BigDecimal bigDecimal, Boolean bool2, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bigDecimal2);
    }
}
