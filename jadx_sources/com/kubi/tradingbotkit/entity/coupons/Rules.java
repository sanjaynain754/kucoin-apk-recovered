package com.kubi.tradingbotkit.entity.coupons;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AllCouponsItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tRF\u0010\u0019\u001a.\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b\u0018\u00010\u001aj\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b\u0018\u0001`\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/coupons/Rules;", "", "<init>", "()V", "maxReward", "Ljava/math/BigDecimal;", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "minTotalInvestments", "getMinTotalInvestments", "setMinTotalInvestments", "rewardCurrency", "", "getRewardCurrency", "()Ljava/lang/String;", "setRewardCurrency", "(Ljava/lang/String;)V", "rewardPercent", "getRewardPercent", "setRewardPercent", "rewardSeconds", "getRewardSeconds", "setRewardSeconds", "scope", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getScope", "()Ljava/util/LinkedHashMap;", "setScope", "(Ljava/util/LinkedHashMap;)V", "strategyNames", "", "getStrategyNames", "()Ljava/util/Map;", "setStrategyNames", "(Ljava/util/Map;)V", "validPeriodSeconds", "", "getValidPeriodSeconds", "()Ljava/lang/Long;", "setValidPeriodSeconds", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Rules {

    @Nullable
    private BigDecimal maxReward;

    @Nullable
    private BigDecimal minTotalInvestments;

    @Nullable
    private String rewardCurrency;

    @Nullable
    private BigDecimal rewardPercent;

    @Nullable
    private BigDecimal rewardSeconds;

    @Nullable
    private LinkedHashMap<String, List<String>> scope;

    @Nullable
    private Map<String, String> strategyNames;

    @Nullable
    private Long validPeriodSeconds;

    @Nullable
    public final BigDecimal getMaxReward() {
        return this.maxReward;
    }

    @Nullable
    public final BigDecimal getMinTotalInvestments() {
        return this.minTotalInvestments;
    }

    @Nullable
    public final String getRewardCurrency() {
        return this.rewardCurrency;
    }

    @Nullable
    public final BigDecimal getRewardPercent() {
        return this.rewardPercent;
    }

    @Nullable
    public final BigDecimal getRewardSeconds() {
        return this.rewardSeconds;
    }

    @Nullable
    public final LinkedHashMap<String, List<String>> getScope() {
        return this.scope;
    }

    @Nullable
    public final Map<String, String> getStrategyNames() {
        return this.strategyNames;
    }

    @Nullable
    public final Long getValidPeriodSeconds() {
        return this.validPeriodSeconds;
    }

    public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
        this.maxReward = bigDecimal;
    }

    public final void setMinTotalInvestments(@Nullable BigDecimal bigDecimal) {
        this.minTotalInvestments = bigDecimal;
    }

    public final void setRewardCurrency(@Nullable String str) {
        this.rewardCurrency = str;
    }

    public final void setRewardPercent(@Nullable BigDecimal bigDecimal) {
        this.rewardPercent = bigDecimal;
    }

    public final void setRewardSeconds(@Nullable BigDecimal bigDecimal) {
        this.rewardSeconds = bigDecimal;
    }

    public final void setScope(@Nullable LinkedHashMap<String, List<String>> linkedHashMap) {
        this.scope = linkedHashMap;
    }

    public final void setStrategyNames(@Nullable Map<String, String> map) {
        this.strategyNames = map;
    }

    public final void setValidPeriodSeconds(@Nullable Long l11) {
        this.validPeriodSeconds = l11;
    }
}
