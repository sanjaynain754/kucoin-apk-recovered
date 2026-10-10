package com.kubi.futures.data.trial;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ITrialApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015HÆ\u0003JÈ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\tHÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006D"}, m90084d2 = {"Lcom/kubi/futures/data/trial/CopyTradingTrialDetailsEntity;", "", "id", "", "rewardId", "", "amount", "Ljava/math/BigDecimal;", "useDurition", "", "status", "trialFundType", "claimTime", "expireTime", "withdrawThresholdProfit", "withdrawThresholdTrade", "maxWithdrawAmount", "maxLeverage", "profitAmount", "tradeAmount", "supportContract", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRewardId", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getUseDurition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getTrialFundType", "getClaimTime", "getExpireTime", "getWithdrawThresholdProfit", "getWithdrawThresholdTrade", "getMaxWithdrawAmount", "getMaxLeverage", "getProfitAmount", "getTradeAmount", "getSupportContract", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)Lcom/kubi/futures/data/trial/CopyTradingTrialDetailsEntity;", "equals", "", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingTrialDetailsEntity {

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final String claimTime;

    @Nullable
    private final Long expireTime;

    @Nullable
    private final Long id;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal maxWithdrawAmount;

    @Nullable
    private final BigDecimal profitAmount;

    @Nullable
    private final String rewardId;

    @Nullable
    private final String status;

    @Nullable
    private final List<String> supportContract;

    @Nullable
    private final BigDecimal tradeAmount;

    @Nullable
    private final String trialFundType;

    @Nullable
    private final Integer useDurition;

    @Nullable
    private final BigDecimal withdrawThresholdProfit;

    @Nullable
    private final BigDecimal withdrawThresholdTrade;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingTrialDetailsEntity)) {
            return false;
        }
        CopyTradingTrialDetailsEntity copyTradingTrialDetailsEntity = (CopyTradingTrialDetailsEntity) other;
        return Intrinsics.areEqual(this.id, copyTradingTrialDetailsEntity.id) && Intrinsics.areEqual(this.rewardId, copyTradingTrialDetailsEntity.rewardId) && Intrinsics.areEqual(this.amount, copyTradingTrialDetailsEntity.amount) && Intrinsics.areEqual(this.useDurition, copyTradingTrialDetailsEntity.useDurition) && Intrinsics.areEqual(this.status, copyTradingTrialDetailsEntity.status) && Intrinsics.areEqual(this.trialFundType, copyTradingTrialDetailsEntity.trialFundType) && Intrinsics.areEqual(this.claimTime, copyTradingTrialDetailsEntity.claimTime) && Intrinsics.areEqual(this.expireTime, copyTradingTrialDetailsEntity.expireTime) && Intrinsics.areEqual(this.withdrawThresholdProfit, copyTradingTrialDetailsEntity.withdrawThresholdProfit) && Intrinsics.areEqual(this.withdrawThresholdTrade, copyTradingTrialDetailsEntity.withdrawThresholdTrade) && Intrinsics.areEqual(this.maxWithdrawAmount, copyTradingTrialDetailsEntity.maxWithdrawAmount) && Intrinsics.areEqual(this.maxLeverage, copyTradingTrialDetailsEntity.maxLeverage) && Intrinsics.areEqual(this.profitAmount, copyTradingTrialDetailsEntity.profitAmount) && Intrinsics.areEqual(this.tradeAmount, copyTradingTrialDetailsEntity.tradeAmount) && Intrinsics.areEqual(this.supportContract, copyTradingTrialDetailsEntity.supportContract);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getWithdrawThresholdTrade() {
        return this.withdrawThresholdTrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMaxWithdrawAmount() {
        return this.maxWithdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getProfitAmount() {
        return this.profitAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTradeAmount() {
        return this.tradeAmount;
    }

    @Nullable
    public final List<String> component15() {
        return this.supportContract;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRewardId() {
        return this.rewardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrialFundType() {
        return this.trialFundType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getClaimTime() {
        return this.claimTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getWithdrawThresholdProfit() {
        return this.withdrawThresholdProfit;
    }

    @NotNull
    public final CopyTradingTrialDetailsEntity copy(@Nullable Long id2, @Nullable String rewardId, @Nullable BigDecimal amount, @Nullable Integer useDurition, @Nullable String status, @Nullable String trialFundType, @Nullable String claimTime, @Nullable Long expireTime, @Nullable BigDecimal withdrawThresholdProfit, @Nullable BigDecimal withdrawThresholdTrade, @Nullable BigDecimal maxWithdrawAmount, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal profitAmount, @Nullable BigDecimal tradeAmount, @Nullable List<String> supportContract) {
        return new CopyTradingTrialDetailsEntity(id2, rewardId, amount, useDurition, status, trialFundType, claimTime, expireTime, withdrawThresholdProfit, withdrawThresholdTrade, maxWithdrawAmount, maxLeverage, profitAmount, tradeAmount, supportContract);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getClaimTime() {
        return this.claimTime;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMaxWithdrawAmount() {
        return this.maxWithdrawAmount;
    }

    @Nullable
    public final BigDecimal getProfitAmount() {
        return this.profitAmount;
    }

    @Nullable
    public final String getRewardId() {
        return this.rewardId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getSupportContract() {
        return this.supportContract;
    }

    @Nullable
    public final BigDecimal getTradeAmount() {
        return this.tradeAmount;
    }

    @Nullable
    public final String getTrialFundType() {
        return this.trialFundType;
    }

    @Nullable
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    public final BigDecimal getWithdrawThresholdProfit() {
        return this.withdrawThresholdProfit;
    }

    @Nullable
    public final BigDecimal getWithdrawThresholdTrade() {
        return this.withdrawThresholdTrade;
    }

    public int hashCode() {
        Long l11 = this.id;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.rewardId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.useDurition;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trialFundType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.claimTime;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.expireTime;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.withdrawThresholdProfit;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.withdrawThresholdTrade;
        int iHashCode10 = (iHashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.maxWithdrawAmount;
        int iHashCode11 = (iHashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.maxLeverage;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.profitAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.tradeAmount;
        int iHashCode14 = (iHashCode13 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        List<String> list = this.supportContract;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingTrialDetailsEntity(id=" + this.id + ", rewardId=" + this.rewardId + ", amount=" + this.amount + ", useDurition=" + this.useDurition + ", status=" + this.status + ", trialFundType=" + this.trialFundType + ", claimTime=" + this.claimTime + ", expireTime=" + this.expireTime + ", withdrawThresholdProfit=" + this.withdrawThresholdProfit + ", withdrawThresholdTrade=" + this.withdrawThresholdTrade + ", maxWithdrawAmount=" + this.maxWithdrawAmount + ", maxLeverage=" + this.maxLeverage + ", profitAmount=" + this.profitAmount + ", tradeAmount=" + this.tradeAmount + ", supportContract=" + this.supportContract + ')';
    }

    public CopyTradingTrialDetailsEntity(@Nullable Long l11, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l12, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable List<String> list) {
        this.id = l11;
        this.rewardId = str;
        this.amount = bigDecimal;
        this.useDurition = num;
        this.status = str2;
        this.trialFundType = str3;
        this.claimTime = str4;
        this.expireTime = l12;
        this.withdrawThresholdProfit = bigDecimal2;
        this.withdrawThresholdTrade = bigDecimal3;
        this.maxWithdrawAmount = bigDecimal4;
        this.maxLeverage = bigDecimal5;
        this.profitAmount = bigDecimal6;
        this.tradeAmount = bigDecimal7;
        this.supportContract = list;
    }
}
