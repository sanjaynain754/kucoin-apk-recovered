package com.kubi.otc.entity;

import androidx.annotation.Keep;
import com.kubi.otc.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006;"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcOpTraderInfo;", "", "adSide", "", "createdAtDesc", "isKyc", "kycStatus", "", "kycLevel", "", "otcDealNumber", "otcDealRate", "otcPayCoinSec", "Ljava/math/BigDecimal;", "otcPayMoneySec", "tradeDealAmountDesc", "tradeLatestAtDesc", "tradeTimesDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdSide", "()Ljava/lang/String;", "getCreatedAtDesc", "getKycStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKycLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOtcDealNumber", "getOtcDealRate", "getOtcPayCoinSec", "()Ljava/math/BigDecimal;", "getOtcPayMoneySec", "getTradeDealAmountDesc", "getTradeLatestAtDesc", "getTradeTimesDesc", "getKyc", "getAverageLabel", "getAverageValue", "getOtcNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/OtcOpTraderInfo;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtcOpTraderInfo {

    @Nullable
    private final String adSide;

    @Nullable
    private final String createdAtDesc;

    @Nullable
    private final String isKyc;

    @Nullable
    private final Integer kycLevel;

    @Nullable
    private final Boolean kycStatus;

    @Nullable
    private final String otcDealNumber;

    @Nullable
    private final String otcDealRate;

    @Nullable
    private final BigDecimal otcPayCoinSec;

    @Nullable
    private final BigDecimal otcPayMoneySec;

    @Nullable
    private final String tradeDealAmountDesc;

    @Nullable
    private final String tradeLatestAtDesc;

    @Nullable
    private final String tradeTimesDesc;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcOpTraderInfo)) {
            return false;
        }
        OtcOpTraderInfo otcOpTraderInfo = (OtcOpTraderInfo) other;
        return Intrinsics.areEqual(this.adSide, otcOpTraderInfo.adSide) && Intrinsics.areEqual(this.createdAtDesc, otcOpTraderInfo.createdAtDesc) && Intrinsics.areEqual(this.isKyc, otcOpTraderInfo.isKyc) && Intrinsics.areEqual(this.kycStatus, otcOpTraderInfo.kycStatus) && Intrinsics.areEqual(this.kycLevel, otcOpTraderInfo.kycLevel) && Intrinsics.areEqual(this.otcDealNumber, otcOpTraderInfo.otcDealNumber) && Intrinsics.areEqual(this.otcDealRate, otcOpTraderInfo.otcDealRate) && Intrinsics.areEqual(this.otcPayCoinSec, otcOpTraderInfo.otcPayCoinSec) && Intrinsics.areEqual(this.otcPayMoneySec, otcOpTraderInfo.otcPayMoneySec) && Intrinsics.areEqual(this.tradeDealAmountDesc, otcOpTraderInfo.tradeDealAmountDesc) && Intrinsics.areEqual(this.tradeLatestAtDesc, otcOpTraderInfo.tradeLatestAtDesc) && Intrinsics.areEqual(this.tradeTimesDesc, otcOpTraderInfo.tradeTimesDesc);
    }

    public static /* synthetic */ OtcOpTraderInfo copy$default(OtcOpTraderInfo otcOpTraderInfo, String str, String str2, String str3, Boolean bool, Integer num, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otcOpTraderInfo.adSide;
        }
        if ((i11 & 2) != 0) {
            str2 = otcOpTraderInfo.createdAtDesc;
        }
        if ((i11 & 4) != 0) {
            str3 = otcOpTraderInfo.isKyc;
        }
        if ((i11 & 8) != 0) {
            bool = otcOpTraderInfo.kycStatus;
        }
        if ((i11 & 16) != 0) {
            num = otcOpTraderInfo.kycLevel;
        }
        if ((i11 & 32) != 0) {
            str4 = otcOpTraderInfo.otcDealNumber;
        }
        if ((i11 & 64) != 0) {
            str5 = otcOpTraderInfo.otcDealRate;
        }
        if ((i11 & 128) != 0) {
            bigDecimal = otcOpTraderInfo.otcPayCoinSec;
        }
        if ((i11 & 256) != 0) {
            bigDecimal2 = otcOpTraderInfo.otcPayMoneySec;
        }
        if ((i11 & 512) != 0) {
            str6 = otcOpTraderInfo.tradeDealAmountDesc;
        }
        if ((i11 & 1024) != 0) {
            str7 = otcOpTraderInfo.tradeLatestAtDesc;
        }
        if ((i11 & 2048) != 0) {
            str8 = otcOpTraderInfo.tradeTimesDesc;
        }
        String str9 = str7;
        String str10 = str8;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str11 = str6;
        String str12 = str5;
        BigDecimal bigDecimal4 = bigDecimal;
        Integer num2 = num;
        String str13 = str4;
        return otcOpTraderInfo.copy(str, str2, str3, bool, num2, str13, str12, bigDecimal4, bigDecimal3, str11, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdSide() {
        return this.adSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTradeDealAmountDesc() {
        return this.tradeDealAmountDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTradeLatestAtDesc() {
        return this.tradeLatestAtDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTradeTimesDesc() {
        return this.tradeTimesDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAtDesc() {
        return this.createdAtDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIsKyc() {
        return this.isKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getKycStatus() {
        return this.kycStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOtcDealNumber() {
        return this.otcDealNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOtcDealRate() {
        return this.otcDealRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getOtcPayCoinSec() {
        return this.otcPayCoinSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getOtcPayMoneySec() {
        return this.otcPayMoneySec;
    }

    @NotNull
    public final OtcOpTraderInfo copy(@Nullable String adSide, @Nullable String createdAtDesc, @Nullable String isKyc, @Nullable Boolean kycStatus, @Nullable Integer kycLevel, @Nullable String otcDealNumber, @Nullable String otcDealRate, @Nullable BigDecimal otcPayCoinSec, @Nullable BigDecimal otcPayMoneySec, @Nullable String tradeDealAmountDesc, @Nullable String tradeLatestAtDesc, @Nullable String tradeTimesDesc) {
        return new OtcOpTraderInfo(adSide, createdAtDesc, isKyc, kycStatus, kycLevel, otcDealNumber, otcDealRate, otcPayCoinSec, otcPayMoneySec, tradeDealAmountDesc, tradeLatestAtDesc, tradeTimesDesc);
    }

    @Nullable
    public final String getAdSide() {
        return this.adSide;
    }

    @NotNull
    public final String getAverageLabel() {
        return Intrinsics.areEqual(this.adSide, "BUY") ? C27017c.f54310a.m66516f(R$string.average_pay_coin_time, new Object[0]) : C27017c.f54310a.m66516f(R$string.average_pay_time, new Object[0]);
    }

    @NotNull
    public final String getAverageValue() {
        if (Intrinsics.areEqual(this.adSide, "BUY")) {
            BigDecimal bigDecimal = this.otcPayCoinSec;
            if (bigDecimal == null) {
                return C33820nf.f71144W;
            }
            String strM66430q = TimeUtils.m66430q(bigDecimal.intValue());
            Intrinsics.checkNotNull(strM66430q);
            return strM66430q;
        }
        BigDecimal bigDecimal2 = this.otcPayMoneySec;
        if (bigDecimal2 == null) {
            return C33820nf.f71144W;
        }
        String strM66430q2 = TimeUtils.m66430q(bigDecimal2.intValue());
        Intrinsics.checkNotNull(strM66430q2);
        return strM66430q2;
    }

    @Nullable
    public final String getCreatedAtDesc() {
        return this.createdAtDesc;
    }

    @NotNull
    public final String getKyc() {
        Integer num = this.kycLevel;
        if (num != null && num.intValue() == 1) {
            return C27017c.f54310a.m66516f(R$string.kyc_primary, new Object[0]);
        }
        return (num != null && num.intValue() == 2) ? C27017c.f54310a.m66516f(R$string.kyc_senior, new Object[0]) : C27017c.f54310a.m66516f(R$string.kyc_unverify, new Object[0]);
    }

    @Nullable
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final Boolean getKycStatus() {
        return this.kycStatus;
    }

    @Nullable
    public final String getOtcDealNumber() {
        return this.otcDealNumber;
    }

    @Nullable
    public final String getOtcDealRate() {
        return this.otcDealRate;
    }

    @NotNull
    public final String getOtcNumber() {
        String str = this.otcDealNumber;
        return (str == null || str.length() == 0) ? C33820nf.f71144W : C27017c.f54310a.m66516f(R$string.quantifier, this.otcDealNumber);
    }

    @Nullable
    public final BigDecimal getOtcPayCoinSec() {
        return this.otcPayCoinSec;
    }

    @Nullable
    public final BigDecimal getOtcPayMoneySec() {
        return this.otcPayMoneySec;
    }

    @Nullable
    public final String getTradeDealAmountDesc() {
        return this.tradeDealAmountDesc;
    }

    @Nullable
    public final String getTradeLatestAtDesc() {
        return this.tradeLatestAtDesc;
    }

    @Nullable
    public final String getTradeTimesDesc() {
        return this.tradeTimesDesc;
    }

    public int hashCode() {
        String str = this.adSide;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAtDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isKyc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.kycStatus;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.kycLevel;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.otcDealNumber;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.otcDealRate;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.otcPayCoinSec;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.otcPayMoneySec;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.tradeDealAmountDesc;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tradeLatestAtDesc;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tradeTimesDesc;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final String isKyc() {
        return this.isKyc;
    }

    @NotNull
    public String toString() {
        return "OtcOpTraderInfo(adSide=" + this.adSide + ", createdAtDesc=" + this.createdAtDesc + ", isKyc=" + this.isKyc + ", kycStatus=" + this.kycStatus + ", kycLevel=" + this.kycLevel + ", otcDealNumber=" + this.otcDealNumber + ", otcDealRate=" + this.otcDealRate + ", otcPayCoinSec=" + this.otcPayCoinSec + ", otcPayMoneySec=" + this.otcPayMoneySec + ", tradeDealAmountDesc=" + this.tradeDealAmountDesc + ", tradeLatestAtDesc=" + this.tradeLatestAtDesc + ", tradeTimesDesc=" + this.tradeTimesDesc + ')';
    }

    public OtcOpTraderInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.adSide = str;
        this.createdAtDesc = str2;
        this.isKyc = str3;
        this.kycStatus = bool;
        this.kycLevel = num;
        this.otcDealNumber = str4;
        this.otcDealRate = str5;
        this.otcPayCoinSec = bigDecimal;
        this.otcPayMoneySec = bigDecimal2;
        this.tradeDealAmountDesc = str6;
        this.tradeLatestAtDesc = str7;
        this.tradeTimesDesc = str8;
    }
}
