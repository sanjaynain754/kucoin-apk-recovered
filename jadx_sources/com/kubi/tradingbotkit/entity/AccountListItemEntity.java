package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AccountListItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006%"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/AccountListItemEntity;", "", "<init>", "()V", "accountType", "", "getAccountType", "()Ljava/lang/String;", "setAccountType", "(Ljava/lang/String;)V", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "setAvailableBalance", "(Ljava/math/BigDecimal;)V", "baseCurrency", "getBaseCurrency", "setBaseCurrency", "baseCurrencyAmount", "getBaseCurrencyAmount", "setBaseCurrencyAmount", "baseCurrencyAvailableAmount", "getBaseCurrencyAvailableAmount", "setBaseCurrencyAvailableAmount", "baseCurrencyPrice", "getBaseCurrencyPrice", "setBaseCurrencyPrice", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", "holdBalance", "getHoldBalance", "setHoldBalance", "totalBalance", "getTotalBalance", "setTotalBalance", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountListItemEntity {

    @Nullable
    private String accountType = "";

    @Nullable
    private BigDecimal availableBalance;

    @Nullable
    private String baseCurrency;

    @Nullable
    private BigDecimal baseCurrencyAmount;

    @Nullable
    private BigDecimal baseCurrencyAvailableAmount;

    @Nullable
    private BigDecimal baseCurrencyPrice;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final BigDecimal getBaseCurrencyAmount() {
        return this.baseCurrencyAmount;
    }

    @Nullable
    public final BigDecimal getBaseCurrencyAvailableAmount() {
        return this.baseCurrencyAvailableAmount;
    }

    @Nullable
    public final BigDecimal getBaseCurrencyPrice() {
        return this.baseCurrencyPrice;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public final void setAccountType(@Nullable String str) {
        this.accountType = str;
    }

    public final void setAvailableBalance(@Nullable BigDecimal bigDecimal) {
        this.availableBalance = bigDecimal;
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setBaseCurrencyAmount(@Nullable BigDecimal bigDecimal) {
        this.baseCurrencyAmount = bigDecimal;
    }

    public final void setBaseCurrencyAvailableAmount(@Nullable BigDecimal bigDecimal) {
        this.baseCurrencyAvailableAmount = bigDecimal;
    }

    public final void setBaseCurrencyPrice(@Nullable BigDecimal bigDecimal) {
        this.baseCurrencyPrice = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    public AccountListItemEntity() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.availableBalance = bigDecimal;
        this.baseCurrency = "";
        this.baseCurrencyAmount = bigDecimal;
        this.baseCurrencyAvailableAmount = bigDecimal;
        this.baseCurrencyPrice = bigDecimal;
        this.currency = "";
        this.holdBalance = bigDecimal;
        this.totalBalance = bigDecimal;
    }
}
