package com.kubi.spot.entity.callAuction;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CallAuctionConfigEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b$\u0010\u0017¨\u0006:"}, m90084d2 = {"Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;", "", "costPrice", "Ljava/math/BigDecimal;", "firstStageStartTime", "", "priceCeiling", "priceFloor", "remainingTimeFromFirstStageEnd", "remainingTimeFromFirstStageStart", "remainingTimeFromSecondStageEnd", "secondStageEndTime", "secondStageStartTime", "symbolCode", "", "remainingTimeFromThirdStageEnd", "thirdStageStartTime", "thirdStageEndTime", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCostPrice", "()Ljava/math/BigDecimal;", "getFirstStageStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPriceCeiling", "getPriceFloor", "getRemainingTimeFromFirstStageEnd", "getRemainingTimeFromFirstStageStart", "getRemainingTimeFromSecondStageEnd", "getSecondStageEndTime", "getSecondStageStartTime", "getSymbolCode", "()Ljava/lang/String;", "getRemainingTimeFromThirdStageEnd", "getThirdStageStartTime", "getThirdStageEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CallAuctionConfigEntity {

    @Nullable
    private final BigDecimal costPrice;

    @Nullable
    private final Long firstStageStartTime;

    @Nullable
    private final BigDecimal priceCeiling;

    @Nullable
    private final BigDecimal priceFloor;

    @Nullable
    private final Long remainingTimeFromFirstStageEnd;

    @Nullable
    private final Long remainingTimeFromFirstStageStart;

    @Nullable
    private final Long remainingTimeFromSecondStageEnd;

    @Nullable
    private final Long remainingTimeFromThirdStageEnd;

    @Nullable
    private final Long secondStageEndTime;

    @Nullable
    private final Long secondStageStartTime;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final Long thirdStageEndTime;

    @Nullable
    private final Long thirdStageStartTime;

    public CallAuctionConfigEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallAuctionConfigEntity)) {
            return false;
        }
        CallAuctionConfigEntity callAuctionConfigEntity = (CallAuctionConfigEntity) other;
        return Intrinsics.areEqual(this.costPrice, callAuctionConfigEntity.costPrice) && Intrinsics.areEqual(this.firstStageStartTime, callAuctionConfigEntity.firstStageStartTime) && Intrinsics.areEqual(this.priceCeiling, callAuctionConfigEntity.priceCeiling) && Intrinsics.areEqual(this.priceFloor, callAuctionConfigEntity.priceFloor) && Intrinsics.areEqual(this.remainingTimeFromFirstStageEnd, callAuctionConfigEntity.remainingTimeFromFirstStageEnd) && Intrinsics.areEqual(this.remainingTimeFromFirstStageStart, callAuctionConfigEntity.remainingTimeFromFirstStageStart) && Intrinsics.areEqual(this.remainingTimeFromSecondStageEnd, callAuctionConfigEntity.remainingTimeFromSecondStageEnd) && Intrinsics.areEqual(this.secondStageEndTime, callAuctionConfigEntity.secondStageEndTime) && Intrinsics.areEqual(this.secondStageStartTime, callAuctionConfigEntity.secondStageStartTime) && Intrinsics.areEqual(this.symbolCode, callAuctionConfigEntity.symbolCode) && Intrinsics.areEqual(this.remainingTimeFromThirdStageEnd, callAuctionConfigEntity.remainingTimeFromThirdStageEnd) && Intrinsics.areEqual(this.thirdStageStartTime, callAuctionConfigEntity.thirdStageStartTime) && Intrinsics.areEqual(this.thirdStageEndTime, callAuctionConfigEntity.thirdStageEndTime);
    }

    public CallAuctionConfigEntity(@Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable String str, @Nullable Long l17, @Nullable Long l18, @Nullable Long l19) {
        this.costPrice = bigDecimal;
        this.firstStageStartTime = l11;
        this.priceCeiling = bigDecimal2;
        this.priceFloor = bigDecimal3;
        this.remainingTimeFromFirstStageEnd = l12;
        this.remainingTimeFromFirstStageStart = l13;
        this.remainingTimeFromSecondStageEnd = l14;
        this.secondStageEndTime = l15;
        this.secondStageStartTime = l16;
        this.symbolCode = str;
        this.remainingTimeFromThirdStageEnd = l17;
        this.thirdStageStartTime = l18;
        this.thirdStageEndTime = l19;
    }

    public static /* synthetic */ CallAuctionConfigEntity copy$default(CallAuctionConfigEntity callAuctionConfigEntity, BigDecimal bigDecimal, Long l11, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, Long l13, Long l14, Long l15, Long l16, String str, Long l17, Long l18, Long l19, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = callAuctionConfigEntity.costPrice;
        }
        return callAuctionConfigEntity.copy(bigDecimal, (i11 & 2) != 0 ? callAuctionConfigEntity.firstStageStartTime : l11, (i11 & 4) != 0 ? callAuctionConfigEntity.priceCeiling : bigDecimal2, (i11 & 8) != 0 ? callAuctionConfigEntity.priceFloor : bigDecimal3, (i11 & 16) != 0 ? callAuctionConfigEntity.remainingTimeFromFirstStageEnd : l12, (i11 & 32) != 0 ? callAuctionConfigEntity.remainingTimeFromFirstStageStart : l13, (i11 & 64) != 0 ? callAuctionConfigEntity.remainingTimeFromSecondStageEnd : l14, (i11 & 128) != 0 ? callAuctionConfigEntity.secondStageEndTime : l15, (i11 & 256) != 0 ? callAuctionConfigEntity.secondStageStartTime : l16, (i11 & 512) != 0 ? callAuctionConfigEntity.symbolCode : str, (i11 & 1024) != 0 ? callAuctionConfigEntity.remainingTimeFromThirdStageEnd : l17, (i11 & 2048) != 0 ? callAuctionConfigEntity.thirdStageStartTime : l18, (i11 & 4096) != 0 ? callAuctionConfigEntity.thirdStageEndTime : l19);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCostPrice() {
        return this.costPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getRemainingTimeFromThirdStageEnd() {
        return this.remainingTimeFromThirdStageEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getThirdStageStartTime() {
        return this.thirdStageStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getThirdStageEndTime() {
        return this.thirdStageEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getFirstStageStartTime() {
        return this.firstStageStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPriceCeiling() {
        return this.priceCeiling;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPriceFloor() {
        return this.priceFloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRemainingTimeFromFirstStageEnd() {
        return this.remainingTimeFromFirstStageEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getRemainingTimeFromFirstStageStart() {
        return this.remainingTimeFromFirstStageStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getRemainingTimeFromSecondStageEnd() {
        return this.remainingTimeFromSecondStageEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getSecondStageEndTime() {
        return this.secondStageEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getSecondStageStartTime() {
        return this.secondStageStartTime;
    }

    @NotNull
    public final CallAuctionConfigEntity copy(@Nullable BigDecimal costPrice, @Nullable Long firstStageStartTime, @Nullable BigDecimal priceCeiling, @Nullable BigDecimal priceFloor, @Nullable Long remainingTimeFromFirstStageEnd, @Nullable Long remainingTimeFromFirstStageStart, @Nullable Long remainingTimeFromSecondStageEnd, @Nullable Long secondStageEndTime, @Nullable Long secondStageStartTime, @Nullable String symbolCode, @Nullable Long remainingTimeFromThirdStageEnd, @Nullable Long thirdStageStartTime, @Nullable Long thirdStageEndTime) {
        return new CallAuctionConfigEntity(costPrice, firstStageStartTime, priceCeiling, priceFloor, remainingTimeFromFirstStageEnd, remainingTimeFromFirstStageStart, remainingTimeFromSecondStageEnd, secondStageEndTime, secondStageStartTime, symbolCode, remainingTimeFromThirdStageEnd, thirdStageStartTime, thirdStageEndTime);
    }

    @Nullable
    public final BigDecimal getCostPrice() {
        return this.costPrice;
    }

    @Nullable
    public final Long getFirstStageStartTime() {
        return this.firstStageStartTime;
    }

    @Nullable
    public final BigDecimal getPriceCeiling() {
        return this.priceCeiling;
    }

    @Nullable
    public final BigDecimal getPriceFloor() {
        return this.priceFloor;
    }

    @Nullable
    public final Long getRemainingTimeFromFirstStageEnd() {
        return this.remainingTimeFromFirstStageEnd;
    }

    @Nullable
    public final Long getRemainingTimeFromFirstStageStart() {
        return this.remainingTimeFromFirstStageStart;
    }

    @Nullable
    public final Long getRemainingTimeFromSecondStageEnd() {
        return this.remainingTimeFromSecondStageEnd;
    }

    @Nullable
    public final Long getRemainingTimeFromThirdStageEnd() {
        return this.remainingTimeFromThirdStageEnd;
    }

    @Nullable
    public final Long getSecondStageEndTime() {
        return this.secondStageEndTime;
    }

    @Nullable
    public final Long getSecondStageStartTime() {
        return this.secondStageStartTime;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final Long getThirdStageEndTime() {
        return this.thirdStageEndTime;
    }

    @Nullable
    public final Long getThirdStageStartTime() {
        return this.thirdStageStartTime;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.costPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l11 = this.firstStageStartTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceCeiling;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.priceFloor;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l12 = this.remainingTimeFromFirstStageEnd;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.remainingTimeFromFirstStageStart;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.remainingTimeFromSecondStageEnd;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.secondStageEndTime;
        int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.secondStageStartTime;
        int iHashCode9 = (iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str = this.symbolCode;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Long l17 = this.remainingTimeFromThirdStageEnd;
        int iHashCode11 = (iHashCode10 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.thirdStageStartTime;
        int iHashCode12 = (iHashCode11 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.thirdStageEndTime;
        return iHashCode12 + (l19 != null ? l19.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CallAuctionConfigEntity(costPrice=" + this.costPrice + ", firstStageStartTime=" + this.firstStageStartTime + ", priceCeiling=" + this.priceCeiling + ", priceFloor=" + this.priceFloor + ", remainingTimeFromFirstStageEnd=" + this.remainingTimeFromFirstStageEnd + ", remainingTimeFromFirstStageStart=" + this.remainingTimeFromFirstStageStart + ", remainingTimeFromSecondStageEnd=" + this.remainingTimeFromSecondStageEnd + ", secondStageEndTime=" + this.secondStageEndTime + ", secondStageStartTime=" + this.secondStageStartTime + ", symbolCode=" + this.symbolCode + ", remainingTimeFromThirdStageEnd=" + this.remainingTimeFromThirdStageEnd + ", thirdStageStartTime=" + this.thirdStageStartTime + ", thirdStageEndTime=" + this.thirdStageEndTime + ')';
    }

    public /* synthetic */ CallAuctionConfigEntity(BigDecimal bigDecimal, Long l11, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, Long l13, Long l14, Long l15, Long l16, String str, Long l17, Long l18, Long l19, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : l13, (i11 & 64) != 0 ? null : l14, (i11 & 128) != 0 ? null : l15, (i11 & 256) != 0 ? null : l16, (i11 & 512) != 0 ? null : str, (i11 & 1024) != 0 ? null : l17, (i11 & 2048) != 0 ? null : l18, (i11 & 4096) != 0 ? null : l19);
    }
}
