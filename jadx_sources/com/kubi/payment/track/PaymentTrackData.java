package com.kubi.payment.track;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PaymentTrackData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/track/PaymentTrackData;", "", "<init>", "()V", "fiatCurrency", "", "getFiatCurrency", "()Ljava/lang/String;", "setFiatCurrency", "(Ljava/lang/String;)V", "cryptoCurrency", "getCryptoCurrency", "setCryptoCurrency", "paymentMethodCode", "getPaymentMethodCode", "setPaymentMethodCode", "channelId", "getChannelId", "setChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class PaymentTrackData {

    @Nullable
    private String channelId;

    @Nullable
    private String cryptoCurrency;

    @Nullable
    private String fiatCurrency;

    @Nullable
    private String paymentMethodCode;

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    public final void setChannelId(@Nullable String str) {
        this.channelId = str;
    }

    public final void setCryptoCurrency(@Nullable String str) {
        this.cryptoCurrency = str;
    }

    public final void setFiatCurrency(@Nullable String str) {
        this.fiatCurrency = str;
    }

    public final void setPaymentMethodCode(@Nullable String str) {
        this.paymentMethodCode = str;
    }
}
