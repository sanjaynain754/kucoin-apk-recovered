package com.kubi.tradingbotkit.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CurrencyBalanceModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u0004\u0018\u00010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/CurrencyBalanceModel;", "", "<init>", "()V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "currencyName", "getCurrencyName", "setCurrencyName", "totalBalance", "Ljava/math/BigDecimal;", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "holdBalance", "getHoldBalance", "setHoldBalance", "markPrice", "getMarkPrice", "setMarkPrice", "liability", "getLiability", "setLiability", "liabilityInterest", "getLiabilityInterest", "setLiabilityInterest", "liabilityPrincipal", "getLiabilityPrincipal", "setLiabilityPrincipal", "getAvailableBalance", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CurrencyBalanceModel {

    @Nullable
    private String currency;

    @Nullable
    private String currencyName;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal liabilityInterest;

    @Nullable
    private BigDecimal liabilityPrincipal;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    public final BigDecimal getAvailableBalance() {
        BigDecimal bigDecimal = this.totalBalance;
        if (bigDecimal != null) {
            return bigDecimal.subtract(C41014a.m89922G(this.holdBalance, null, 1, null));
        }
        return null;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setLiabilityInterest(@Nullable BigDecimal bigDecimal) {
        this.liabilityInterest = bigDecimal;
    }

    public final void setLiabilityPrincipal(@Nullable BigDecimal bigDecimal) {
        this.liabilityPrincipal = bigDecimal;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }
}
