package com.kubi.tradingbotkit.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TrialCouponItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/TrialCouponItemModel;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "remainder", "", "getRemainder", "()Ljava/lang/Long;", "setRemainder", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "title", "getTitle", "setTitle", "content", "getContent", "setContent", "expirationMessage", "getExpirationMessage", "setExpirationMessage", "amount", "getAmount", "setAmount", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TrialCouponItemModel {

    @Nullable
    private String amount;

    @Nullable
    private String content;

    @Nullable
    private String currency;

    @Nullable
    private String expirationMessage;

    @Nullable
    private String id;

    @Nullable
    private Long remainder;

    @Nullable
    private String title;

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getExpirationMessage() {
        return this.expirationMessage;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getRemainder() {
        return this.remainder;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAmount(@Nullable String str) {
        this.amount = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setExpirationMessage(@Nullable String str) {
        this.expirationMessage = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setRemainder(@Nullable Long l11) {
        this.remainder = l11;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
