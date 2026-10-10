package com.kubi.unify.unify.common.history;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.unify.unify.mapper.HistoryMapper;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import rh0.C44095a;

/* JADX INFO: compiled from: HistoryEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00066"}, m90084d2 = {"Lcom/kubi/unify/unify/common/history/UnifyPositionDetailEntity;", "", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "", "liquidAmount", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "realisedGrossCost", "side", "size", "symbol", FirebaseAnalytics.Param.TAX, "tradeFee", "type", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getLiquidAmount", "()Ljava/math/BigDecimal;", "getPrice", "getRealisedGrossCost", "getSide", "getSize", "getSymbol", "getTax", "getTradeFee", "getType", "toProfitDetailItemEntity", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/unify/unify/common/history/UnifyPositionDetailEntity;", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyPositionDetailEntity {

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal liquidAmount;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final BigDecimal realisedGrossCost;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final BigDecimal tradeFee;

    @Nullable
    private final String type;

    public static /* synthetic */ UnifyPositionDetailEntity copy$default(UnifyPositionDetailEntity unifyPositionDetailEntity, Long l11, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, BigDecimal bigDecimal4, String str3, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = unifyPositionDetailEntity.createdAt;
        }
        if ((i11 & 2) != 0) {
            str = unifyPositionDetailEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = unifyPositionDetailEntity.liquidAmount;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = unifyPositionDetailEntity.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = unifyPositionDetailEntity.realisedGrossCost;
        }
        if ((i11 & 32) != 0) {
            str2 = unifyPositionDetailEntity.side;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = unifyPositionDetailEntity.size;
        }
        if ((i11 & 128) != 0) {
            str3 = unifyPositionDetailEntity.symbol;
        }
        if ((i11 & 256) != 0) {
            bigDecimal5 = unifyPositionDetailEntity.tax;
        }
        if ((i11 & 512) != 0) {
            bigDecimal6 = unifyPositionDetailEntity.tradeFee;
        }
        if ((i11 & 1024) != 0) {
            str4 = unifyPositionDetailEntity.type;
        }
        BigDecimal bigDecimal7 = bigDecimal6;
        String str5 = str4;
        String str6 = str3;
        BigDecimal bigDecimal8 = bigDecimal5;
        String str7 = str2;
        BigDecimal bigDecimal9 = bigDecimal4;
        BigDecimal bigDecimal10 = bigDecimal3;
        BigDecimal bigDecimal11 = bigDecimal;
        return unifyPositionDetailEntity.copy(l11, str, bigDecimal11, bigDecimal2, bigDecimal10, str7, bigDecimal9, str6, bigDecimal8, bigDecimal7, str5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyPositionDetailEntity)) {
            return false;
        }
        UnifyPositionDetailEntity unifyPositionDetailEntity = (UnifyPositionDetailEntity) other;
        return Intrinsics.areEqual(this.createdAt, unifyPositionDetailEntity.createdAt) && Intrinsics.areEqual(this.currency, unifyPositionDetailEntity.currency) && Intrinsics.areEqual(this.liquidAmount, unifyPositionDetailEntity.liquidAmount) && Intrinsics.areEqual(this.price, unifyPositionDetailEntity.price) && Intrinsics.areEqual(this.realisedGrossCost, unifyPositionDetailEntity.realisedGrossCost) && Intrinsics.areEqual(this.side, unifyPositionDetailEntity.side) && Intrinsics.areEqual(this.size, unifyPositionDetailEntity.size) && Intrinsics.areEqual(this.symbol, unifyPositionDetailEntity.symbol) && Intrinsics.areEqual(this.tax, unifyPositionDetailEntity.tax) && Intrinsics.areEqual(this.tradeFee, unifyPositionDetailEntity.tradeFee) && Intrinsics.areEqual(this.type, unifyPositionDetailEntity.type);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getTradeFee() {
        return this.tradeFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @NotNull
    public final UnifyPositionDetailEntity copy(@Nullable Long createdAt, @Nullable String currency, @Nullable BigDecimal liquidAmount, @Nullable BigDecimal price, @Nullable BigDecimal realisedGrossCost, @Nullable String side, @Nullable BigDecimal size, @Nullable String symbol, @Nullable BigDecimal tax, @Nullable BigDecimal tradeFee, @Nullable String type) {
        return new UnifyPositionDetailEntity(createdAt, currency, liquidAmount, price, realisedGrossCost, side, size, symbol, tax, tradeFee, type);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final BigDecimal getTradeFee() {
        return this.tradeFee;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Long l11 = this.createdAt;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.liquidAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.realisedGrossCost;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.side;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.size;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.tax;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.tradeFee;
        int iHashCode10 = (iHashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str4 = this.type;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final ProfitDetailItemEntity toProfitDetailItemEntity() {
        return ((HistoryMapper) C44095a.m97166c(HistoryMapper.class)).toProfitDetailItemEntity(this);
    }

    @NotNull
    public String toString() {
        return "UnifyPositionDetailEntity(createdAt=" + this.createdAt + ", currency=" + this.currency + ", liquidAmount=" + this.liquidAmount + ", price=" + this.price + ", realisedGrossCost=" + this.realisedGrossCost + ", side=" + this.side + ", size=" + this.size + ", symbol=" + this.symbol + ", tax=" + this.tax + ", tradeFee=" + this.tradeFee + ", type=" + this.type + ')';
    }

    public UnifyPositionDetailEntity(@Nullable Long l11, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable BigDecimal bigDecimal4, @Nullable String str3, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str4) {
        this.createdAt = l11;
        this.currency = str;
        this.liquidAmount = bigDecimal;
        this.price = bigDecimal2;
        this.realisedGrossCost = bigDecimal3;
        this.side = str2;
        this.size = bigDecimal4;
        this.symbol = str3;
        this.tax = bigDecimal5;
        this.tradeFee = bigDecimal6;
        this.type = str4;
    }
}
