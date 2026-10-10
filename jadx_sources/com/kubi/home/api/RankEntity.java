package com.kubi.home.api;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RankEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/home/api/RankEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "value", "changeRate", FirebaseAnalytics.Param.PRICE, "symbol", "coinLabel", "newCurrencyListResponse", "Lcom/kubi/home/api/RankNewCoin;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/home/api/RankNewCoin;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getValue", "setValue", "getChangeRate", "setChangeRate", "getPrice", "setPrice", "getSymbol", "setSymbol", "getCoinLabel", "setCoinLabel", "getNewCurrencyListResponse", "()Lcom/kubi/home/api/RankNewCoin;", "setNewCurrencyListResponse", "(Lcom/kubi/home/api/RankNewCoin;)V", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankEntity {

    @Nullable
    private String changeRate;

    @Nullable
    private String coinLabel;

    @Nullable
    private String currency;

    @Nullable
    private RankNewCoin newCurrencyListResponse;

    @Nullable
    private String price;

    @Nullable
    private String symbol;

    @Nullable
    private String value;

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final RankNewCoin getNewCurrencyListResponse() {
        return this.newCurrencyListResponse;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setChangeRate(@Nullable String str) {
        this.changeRate = str;
    }

    public final void setCoinLabel(@Nullable String str) {
        this.coinLabel = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setNewCurrencyListResponse(@Nullable RankNewCoin rankNewCoin) {
        this.newCurrencyListResponse = rankNewCoin;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public RankEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable RankNewCoin rankNewCoin) {
        this.currency = str;
        this.value = str2;
        this.changeRate = str3;
        this.price = str4;
        this.symbol = str5;
        this.coinLabel = str6;
        this.newCurrencyListResponse = rankNewCoin;
    }
}
