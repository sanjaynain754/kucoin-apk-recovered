package com.kubi.unify.unify.common.history;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
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
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003JÚ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001f¨\u0006H"}, m90084d2 = {"Lcom/kubi/unify/unify/common/history/UnifyProfitRecordEntity;", "", "closeTime", "", "closeType", "", FirebaseAnalytics.Param.CURRENCY, "dealComm", "Ljava/math/BigDecimal;", "fundingFee", "leverage", "liquidAmount", "liquidPrice", "marginMode", "openTime", "positionId", "realisedCost", "realisedGrossCost", "roe", "side", "symbol", FirebaseAnalytics.Param.TAX, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCloseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCloseType", "()Ljava/lang/String;", "getCurrency", "getDealComm", "()Ljava/math/BigDecimal;", "getFundingFee", "getLeverage", "getLiquidAmount", "getLiquidPrice", "getMarginMode", "getOpenTime", "getPositionId", "getRealisedCost", "getRealisedGrossCost", "getRoe", "getSide", "getSymbol", "getTax", "toProfitRecordEntity", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/unify/unify/common/history/UnifyProfitRecordEntity;", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyProfitRecordEntity {

    @Nullable
    private final Long closeTime;

    @Nullable
    private final String closeType;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal dealComm;

    @Nullable
    private final BigDecimal fundingFee;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal liquidAmount;

    @Nullable
    private final BigDecimal liquidPrice;

    @Nullable
    private final String marginMode;

    @Nullable
    private final Long openTime;

    @Nullable
    private final String positionId;

    @Nullable
    private final BigDecimal realisedCost;

    @Nullable
    private final BigDecimal realisedGrossCost;

    @Nullable
    private final BigDecimal roe;

    @Nullable
    private final String side;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    public static /* synthetic */ UnifyProfitRecordEntity copy$default(UnifyProfitRecordEntity unifyProfitRecordEntity, Long l11, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str3, Long l12, String str4, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str5, String str6, BigDecimal bigDecimal9, int i11, Object obj) {
        BigDecimal bigDecimal10;
        String str7;
        Long l13 = (i11 & 1) != 0 ? unifyProfitRecordEntity.closeTime : l11;
        String str8 = (i11 & 2) != 0 ? unifyProfitRecordEntity.closeType : str;
        String str9 = (i11 & 4) != 0 ? unifyProfitRecordEntity.currency : str2;
        BigDecimal bigDecimal11 = (i11 & 8) != 0 ? unifyProfitRecordEntity.dealComm : bigDecimal;
        BigDecimal bigDecimal12 = (i11 & 16) != 0 ? unifyProfitRecordEntity.fundingFee : bigDecimal2;
        BigDecimal bigDecimal13 = (i11 & 32) != 0 ? unifyProfitRecordEntity.leverage : bigDecimal3;
        BigDecimal bigDecimal14 = (i11 & 64) != 0 ? unifyProfitRecordEntity.liquidAmount : bigDecimal4;
        BigDecimal bigDecimal15 = (i11 & 128) != 0 ? unifyProfitRecordEntity.liquidPrice : bigDecimal5;
        String str10 = (i11 & 256) != 0 ? unifyProfitRecordEntity.marginMode : str3;
        Long l14 = (i11 & 512) != 0 ? unifyProfitRecordEntity.openTime : l12;
        String str11 = (i11 & 1024) != 0 ? unifyProfitRecordEntity.positionId : str4;
        BigDecimal bigDecimal16 = (i11 & 2048) != 0 ? unifyProfitRecordEntity.realisedCost : bigDecimal6;
        BigDecimal bigDecimal17 = (i11 & 4096) != 0 ? unifyProfitRecordEntity.realisedGrossCost : bigDecimal7;
        BigDecimal bigDecimal18 = (i11 & 8192) != 0 ? unifyProfitRecordEntity.roe : bigDecimal8;
        Long l15 = l13;
        String str12 = (i11 & 16384) != 0 ? unifyProfitRecordEntity.side : str5;
        String str13 = (i11 & 32768) != 0 ? unifyProfitRecordEntity.symbol : str6;
        if ((i11 & 65536) != 0) {
            str7 = str13;
            bigDecimal10 = unifyProfitRecordEntity.tax;
        } else {
            bigDecimal10 = bigDecimal9;
            str7 = str13;
        }
        return unifyProfitRecordEntity.copy(l15, str8, str9, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, str10, l14, str11, bigDecimal16, bigDecimal17, bigDecimal18, str12, str7, bigDecimal10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyProfitRecordEntity)) {
            return false;
        }
        UnifyProfitRecordEntity unifyProfitRecordEntity = (UnifyProfitRecordEntity) other;
        return Intrinsics.areEqual(this.closeTime, unifyProfitRecordEntity.closeTime) && Intrinsics.areEqual(this.closeType, unifyProfitRecordEntity.closeType) && Intrinsics.areEqual(this.currency, unifyProfitRecordEntity.currency) && Intrinsics.areEqual(this.dealComm, unifyProfitRecordEntity.dealComm) && Intrinsics.areEqual(this.fundingFee, unifyProfitRecordEntity.fundingFee) && Intrinsics.areEqual(this.leverage, unifyProfitRecordEntity.leverage) && Intrinsics.areEqual(this.liquidAmount, unifyProfitRecordEntity.liquidAmount) && Intrinsics.areEqual(this.liquidPrice, unifyProfitRecordEntity.liquidPrice) && Intrinsics.areEqual(this.marginMode, unifyProfitRecordEntity.marginMode) && Intrinsics.areEqual(this.openTime, unifyProfitRecordEntity.openTime) && Intrinsics.areEqual(this.positionId, unifyProfitRecordEntity.positionId) && Intrinsics.areEqual(this.realisedCost, unifyProfitRecordEntity.realisedCost) && Intrinsics.areEqual(this.realisedGrossCost, unifyProfitRecordEntity.realisedGrossCost) && Intrinsics.areEqual(this.roe, unifyProfitRecordEntity.roe) && Intrinsics.areEqual(this.side, unifyProfitRecordEntity.side) && Intrinsics.areEqual(this.symbol, unifyProfitRecordEntity.symbol) && Intrinsics.areEqual(this.tax, unifyProfitRecordEntity.tax);
    }

    public int hashCode() {
        Long l11 = this.closeTime;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.closeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.dealComm;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.fundingFee;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.leverage;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.liquidAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liquidPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str3 = this.marginMode;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.openTime;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.positionId;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.realisedCost;
        int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.realisedGrossCost;
        int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.roe;
        int iHashCode14 = (iHashCode13 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.symbol;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.tax;
        return iHashCode16 + (bigDecimal9 != null ? bigDecimal9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyProfitRecordEntity(closeTime=" + this.closeTime + ", closeType=" + this.closeType + ", currency=" + this.currency + ", dealComm=" + this.dealComm + ", fundingFee=" + this.fundingFee + ", leverage=" + this.leverage + ", liquidAmount=" + this.liquidAmount + ", liquidPrice=" + this.liquidPrice + ", marginMode=" + this.marginMode + ", openTime=" + this.openTime + ", positionId=" + this.positionId + ", realisedCost=" + this.realisedCost + ", realisedGrossCost=" + this.realisedGrossCost + ", roe=" + this.roe + ", side=" + this.side + ", symbol=" + this.symbol + ", tax=" + this.tax + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCloseTime() {
        return this.closeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getRealisedCost() {
        return this.realisedCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getRoe() {
        return this.roe;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLiquidPrice() {
        return this.liquidPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    public final UnifyProfitRecordEntity copy(@Nullable Long closeTime, @Nullable String closeType, @Nullable String currency, @Nullable BigDecimal dealComm, @Nullable BigDecimal fundingFee, @Nullable BigDecimal leverage, @Nullable BigDecimal liquidAmount, @Nullable BigDecimal liquidPrice, @Nullable String marginMode, @Nullable Long openTime, @Nullable String positionId, @Nullable BigDecimal realisedCost, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal roe, @Nullable String side, @Nullable String symbol, @Nullable BigDecimal tax) {
        return new UnifyProfitRecordEntity(closeTime, closeType, currency, dealComm, fundingFee, leverage, liquidAmount, liquidPrice, marginMode, openTime, positionId, realisedCost, realisedGrossCost, roe, side, symbol, tax);
    }

    @Nullable
    public final Long getCloseTime() {
        return this.closeTime;
    }

    @Nullable
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    public final BigDecimal getLiquidPrice() {
        return this.liquidPrice;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final BigDecimal getRealisedCost() {
        return this.realisedCost;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    public final BigDecimal getRoe() {
        return this.roe;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @NotNull
    public final ProfitRecordEntity toProfitRecordEntity() {
        return ((HistoryMapper) C44095a.m97166c(HistoryMapper.class)).toProfitRecordEntity(this);
    }

    public UnifyProfitRecordEntity(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str3, @Nullable Long l12, @Nullable String str4, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable String str5, @Nullable String str6, @Nullable BigDecimal bigDecimal9) {
        this.closeTime = l11;
        this.closeType = str;
        this.currency = str2;
        this.dealComm = bigDecimal;
        this.fundingFee = bigDecimal2;
        this.leverage = bigDecimal3;
        this.liquidAmount = bigDecimal4;
        this.liquidPrice = bigDecimal5;
        this.marginMode = str3;
        this.openTime = l12;
        this.positionId = str4;
        this.realisedCost = bigDecimal6;
        this.realisedGrossCost = bigDecimal7;
        this.roe = bigDecimal8;
        this.side = str5;
        this.symbol = str6;
        this.tax = bigDecimal9;
    }
}
