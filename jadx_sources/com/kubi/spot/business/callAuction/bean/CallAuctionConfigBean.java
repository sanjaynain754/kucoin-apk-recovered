package com.kubi.spot.business.callAuction.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$Phase;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CallAuctionConfigBean.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u009e\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102¨\u0006I"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", "", "openingTime", "", "issuePrice", "countdown", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;", "firstStageStartTime", "firstStageEndTime", "secondStageEndTime", "secondStageStartTime", "thirdStageEndTime", "thirdStageStartTime", "priceCeiling", "Ljava/math/BigDecimal;", "priceFloor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOpeningTime", "()Ljava/lang/String;", "setOpeningTime", "(Ljava/lang/String;)V", "getIssuePrice", "setIssuePrice", "getCountdown", "()Ljava/lang/Long;", "setCountdown", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPhase", "()Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;", "setPhase", "(Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;)V", "getFirstStageStartTime", "setFirstStageStartTime", "getFirstStageEndTime", "setFirstStageEndTime", "getSecondStageEndTime", "setSecondStageEndTime", "getSecondStageStartTime", "setSecondStageStartTime", "getThirdStageEndTime", "setThirdStageEndTime", "getThirdStageStartTime", "setThirdStageStartTime", "getPriceCeiling", "()Ljava/math/BigDecimal;", "setPriceCeiling", "(Ljava/math/BigDecimal;)V", "getPriceFloor", "setPriceFloor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CallAuctionConfigBean {

    @Nullable
    private Long countdown;

    @Nullable
    private String firstStageEndTime;

    @Nullable
    private String firstStageStartTime;

    @Nullable
    private String issuePrice;

    @Nullable
    private String openingTime;

    @Nullable
    private CallAuctionContract$Phase phase;

    @Nullable
    private BigDecimal priceCeiling;

    @Nullable
    private BigDecimal priceFloor;

    @Nullable
    private String secondStageEndTime;

    @Nullable
    private String secondStageStartTime;

    @Nullable
    private String thirdStageEndTime;

    @Nullable
    private String thirdStageStartTime;

    public CallAuctionConfigBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallAuctionConfigBean)) {
            return false;
        }
        CallAuctionConfigBean callAuctionConfigBean = (CallAuctionConfigBean) other;
        return Intrinsics.areEqual(this.openingTime, callAuctionConfigBean.openingTime) && Intrinsics.areEqual(this.issuePrice, callAuctionConfigBean.issuePrice) && Intrinsics.areEqual(this.countdown, callAuctionConfigBean.countdown) && this.phase == callAuctionConfigBean.phase && Intrinsics.areEqual(this.firstStageStartTime, callAuctionConfigBean.firstStageStartTime) && Intrinsics.areEqual(this.firstStageEndTime, callAuctionConfigBean.firstStageEndTime) && Intrinsics.areEqual(this.secondStageEndTime, callAuctionConfigBean.secondStageEndTime) && Intrinsics.areEqual(this.secondStageStartTime, callAuctionConfigBean.secondStageStartTime) && Intrinsics.areEqual(this.thirdStageEndTime, callAuctionConfigBean.thirdStageEndTime) && Intrinsics.areEqual(this.thirdStageStartTime, callAuctionConfigBean.thirdStageStartTime) && Intrinsics.areEqual(this.priceCeiling, callAuctionConfigBean.priceCeiling) && Intrinsics.areEqual(this.priceFloor, callAuctionConfigBean.priceFloor);
    }

    public CallAuctionConfigBean(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable CallAuctionContract$Phase callAuctionContract$Phase, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.openingTime = str;
        this.issuePrice = str2;
        this.countdown = l11;
        this.phase = callAuctionContract$Phase;
        this.firstStageStartTime = str3;
        this.firstStageEndTime = str4;
        this.secondStageEndTime = str5;
        this.secondStageStartTime = str6;
        this.thirdStageEndTime = str7;
        this.thirdStageStartTime = str8;
        this.priceCeiling = bigDecimal;
        this.priceFloor = bigDecimal2;
    }

    public static /* synthetic */ CallAuctionConfigBean copy$default(CallAuctionConfigBean callAuctionConfigBean, String str, String str2, Long l11, CallAuctionContract$Phase callAuctionContract$Phase, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = callAuctionConfigBean.openingTime;
        }
        if ((i11 & 2) != 0) {
            str2 = callAuctionConfigBean.issuePrice;
        }
        if ((i11 & 4) != 0) {
            l11 = callAuctionConfigBean.countdown;
        }
        if ((i11 & 8) != 0) {
            callAuctionContract$Phase = callAuctionConfigBean.phase;
        }
        if ((i11 & 16) != 0) {
            str3 = callAuctionConfigBean.firstStageStartTime;
        }
        if ((i11 & 32) != 0) {
            str4 = callAuctionConfigBean.firstStageEndTime;
        }
        if ((i11 & 64) != 0) {
            str5 = callAuctionConfigBean.secondStageEndTime;
        }
        if ((i11 & 128) != 0) {
            str6 = callAuctionConfigBean.secondStageStartTime;
        }
        if ((i11 & 256) != 0) {
            str7 = callAuctionConfigBean.thirdStageEndTime;
        }
        if ((i11 & 512) != 0) {
            str8 = callAuctionConfigBean.thirdStageStartTime;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal = callAuctionConfigBean.priceCeiling;
        }
        if ((i11 & 2048) != 0) {
            bigDecimal2 = callAuctionConfigBean.priceFloor;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str3;
        String str14 = str4;
        return callAuctionConfigBean.copy(str, str2, l11, callAuctionContract$Phase, str13, str14, str11, str12, str9, str10, bigDecimal3, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThirdStageStartTime() {
        return this.thirdStageStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getPriceCeiling() {
        return this.priceCeiling;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getPriceFloor() {
        return this.priceFloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuePrice() {
        return this.issuePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCountdown() {
        return this.countdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CallAuctionContract$Phase getPhase() {
        return this.phase;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirstStageStartTime() {
        return this.firstStageStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirstStageEndTime() {
        return this.firstStageEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondStageEndTime() {
        return this.secondStageEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondStageStartTime() {
        return this.secondStageStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getThirdStageEndTime() {
        return this.thirdStageEndTime;
    }

    @NotNull
    public final CallAuctionConfigBean copy(@Nullable String openingTime, @Nullable String issuePrice, @Nullable Long countdown, @Nullable CallAuctionContract$Phase phase, @Nullable String firstStageStartTime, @Nullable String firstStageEndTime, @Nullable String secondStageEndTime, @Nullable String secondStageStartTime, @Nullable String thirdStageEndTime, @Nullable String thirdStageStartTime, @Nullable BigDecimal priceCeiling, @Nullable BigDecimal priceFloor) {
        return new CallAuctionConfigBean(openingTime, issuePrice, countdown, phase, firstStageStartTime, firstStageEndTime, secondStageEndTime, secondStageStartTime, thirdStageEndTime, thirdStageStartTime, priceCeiling, priceFloor);
    }

    @Nullable
    public final Long getCountdown() {
        return this.countdown;
    }

    @Nullable
    public final String getFirstStageEndTime() {
        return this.firstStageEndTime;
    }

    @Nullable
    public final String getFirstStageStartTime() {
        return this.firstStageStartTime;
    }

    @Nullable
    public final String getIssuePrice() {
        return this.issuePrice;
    }

    @Nullable
    public final String getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final CallAuctionContract$Phase getPhase() {
        return this.phase;
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
    public final String getSecondStageEndTime() {
        return this.secondStageEndTime;
    }

    @Nullable
    public final String getSecondStageStartTime() {
        return this.secondStageStartTime;
    }

    @Nullable
    public final String getThirdStageEndTime() {
        return this.thirdStageEndTime;
    }

    @Nullable
    public final String getThirdStageStartTime() {
        return this.thirdStageStartTime;
    }

    public int hashCode() {
        String str = this.openingTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issuePrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.countdown;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        CallAuctionContract$Phase callAuctionContract$Phase = this.phase;
        int iHashCode4 = (iHashCode3 + (callAuctionContract$Phase == null ? 0 : callAuctionContract$Phase.hashCode())) * 31;
        String str3 = this.firstStageStartTime;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstStageEndTime;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondStageEndTime;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondStageStartTime;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.thirdStageEndTime;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thirdStageStartTime;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal = this.priceCeiling;
        int iHashCode11 = (iHashCode10 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceFloor;
        return iHashCode11 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public final void setCountdown(@Nullable Long l11) {
        this.countdown = l11;
    }

    public final void setFirstStageEndTime(@Nullable String str) {
        this.firstStageEndTime = str;
    }

    public final void setFirstStageStartTime(@Nullable String str) {
        this.firstStageStartTime = str;
    }

    public final void setIssuePrice(@Nullable String str) {
        this.issuePrice = str;
    }

    public final void setOpeningTime(@Nullable String str) {
        this.openingTime = str;
    }

    public final void setPhase(@Nullable CallAuctionContract$Phase callAuctionContract$Phase) {
        this.phase = callAuctionContract$Phase;
    }

    public final void setPriceCeiling(@Nullable BigDecimal bigDecimal) {
        this.priceCeiling = bigDecimal;
    }

    public final void setPriceFloor(@Nullable BigDecimal bigDecimal) {
        this.priceFloor = bigDecimal;
    }

    public final void setSecondStageEndTime(@Nullable String str) {
        this.secondStageEndTime = str;
    }

    public final void setSecondStageStartTime(@Nullable String str) {
        this.secondStageStartTime = str;
    }

    public final void setThirdStageEndTime(@Nullable String str) {
        this.thirdStageEndTime = str;
    }

    public final void setThirdStageStartTime(@Nullable String str) {
        this.thirdStageStartTime = str;
    }

    @NotNull
    public String toString() {
        return "CallAuctionConfigBean(openingTime=" + this.openingTime + ", issuePrice=" + this.issuePrice + ", countdown=" + this.countdown + ", phase=" + this.phase + ", firstStageStartTime=" + this.firstStageStartTime + ", firstStageEndTime=" + this.firstStageEndTime + ", secondStageEndTime=" + this.secondStageEndTime + ", secondStageStartTime=" + this.secondStageStartTime + ", thirdStageEndTime=" + this.thirdStageEndTime + ", thirdStageStartTime=" + this.thirdStageStartTime + ", priceCeiling=" + this.priceCeiling + ", priceFloor=" + this.priceFloor + ')';
    }

    public /* synthetic */ CallAuctionConfigBean(String str, String str2, Long l11, CallAuctionContract$Phase callAuctionContract$Phase, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : callAuctionContract$Phase, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : bigDecimal, (i11 & 2048) != 0 ? null : bigDecimal2);
    }
}
