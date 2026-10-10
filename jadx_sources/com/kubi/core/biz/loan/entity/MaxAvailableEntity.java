package com.kubi.core.biz.loan.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MaxAvailableEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/biz/loan/entity/MaxAvailableEntity;", "", "tradeType", "", "symbol", "buyMaxAvailable", "Ljava/math/BigDecimal;", "sellMaxAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getTradeType", "()Ljava/lang/String;", "getSymbol", "getBuyMaxAvailable", "()Ljava/math/BigDecimal;", "getSellMaxAvailable", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MaxAvailableEntity {

    @Nullable
    private final BigDecimal buyMaxAvailable;

    @Nullable
    private final BigDecimal sellMaxAvailable;

    @Nullable
    private final String symbol;

    @Nullable
    private final String tradeType;

    public MaxAvailableEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxAvailableEntity)) {
            return false;
        }
        MaxAvailableEntity maxAvailableEntity = (MaxAvailableEntity) other;
        return Intrinsics.areEqual(this.tradeType, maxAvailableEntity.tradeType) && Intrinsics.areEqual(this.symbol, maxAvailableEntity.symbol) && Intrinsics.areEqual(this.buyMaxAvailable, maxAvailableEntity.buyMaxAvailable) && Intrinsics.areEqual(this.sellMaxAvailable, maxAvailableEntity.sellMaxAvailable);
    }

    public MaxAvailableEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.tradeType = str;
        this.symbol = str2;
        this.buyMaxAvailable = bigDecimal;
        this.sellMaxAvailable = bigDecimal2;
    }

    public static /* synthetic */ MaxAvailableEntity copy$default(MaxAvailableEntity maxAvailableEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = maxAvailableEntity.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = maxAvailableEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = maxAvailableEntity.buyMaxAvailable;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = maxAvailableEntity.sellMaxAvailable;
        }
        return maxAvailableEntity.copy(str, str2, bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getBuyMaxAvailable() {
        return this.buyMaxAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSellMaxAvailable() {
        return this.sellMaxAvailable;
    }

    @NotNull
    public final MaxAvailableEntity copy(@Nullable String tradeType, @Nullable String symbol, @Nullable BigDecimal buyMaxAvailable, @Nullable BigDecimal sellMaxAvailable) {
        return new MaxAvailableEntity(tradeType, symbol, buyMaxAvailable, sellMaxAvailable);
    }

    @Nullable
    public final BigDecimal getBuyMaxAvailable() {
        return this.buyMaxAvailable;
    }

    @Nullable
    public final BigDecimal getSellMaxAvailable() {
        return this.sellMaxAvailable;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.tradeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.buyMaxAvailable;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.sellMaxAvailable;
        return iHashCode3 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MaxAvailableEntity(tradeType=" + this.tradeType + ", symbol=" + this.symbol + ", buyMaxAvailable=" + this.buyMaxAvailable + ", sellMaxAvailable=" + this.sellMaxAvailable + ')';
    }

    public /* synthetic */ MaxAvailableEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2);
    }
}
