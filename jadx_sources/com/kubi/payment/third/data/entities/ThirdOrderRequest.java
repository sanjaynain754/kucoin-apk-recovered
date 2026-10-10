package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;", "", AppsFlyerProperties.CHANNEL, "", "crypto", "cryptoAmount", "fiat", "fiatAmount", "payMethodId", "isFast", "", "client", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getCrypto", "getCryptoAmount", "getFiat", "getFiatAmount", "getPayMethodId", "()Z", "setFast", "(Z)V", "getClient", "getOrderSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdOrderRequest {

    @NotNull
    private static final String ORDER_COOPERATION = "COOPERATION";

    @NotNull
    private static final String ORDER_DISPATCH = "DISPATCH";

    @NotNull
    private final String channel;

    @NotNull
    private final String client;

    @NotNull
    private final String crypto;

    @NotNull
    private final String cryptoAmount;

    @NotNull
    private final String fiat;

    @NotNull
    private final String fiatAmount;
    private boolean isFast;

    @NotNull
    private final String payMethodId;

    public ThirdOrderRequest(@NotNull String channel, @NotNull String crypto, @NotNull String cryptoAmount, @NotNull String fiat, @NotNull String fiatAmount, @NotNull String payMethodId, boolean z11, @NotNull String client) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(payMethodId, "payMethodId");
        Intrinsics.checkNotNullParameter(client, "client");
        this.channel = channel;
        this.crypto = crypto;
        this.cryptoAmount = cryptoAmount;
        this.fiat = fiat;
        this.fiatAmount = fiatAmount;
        this.payMethodId = payMethodId;
        this.isFast = z11;
        this.client = client;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdOrderRequest)) {
            return false;
        }
        ThirdOrderRequest thirdOrderRequest = (ThirdOrderRequest) other;
        return Intrinsics.areEqual(this.channel, thirdOrderRequest.channel) && Intrinsics.areEqual(this.crypto, thirdOrderRequest.crypto) && Intrinsics.areEqual(this.cryptoAmount, thirdOrderRequest.cryptoAmount) && Intrinsics.areEqual(this.fiat, thirdOrderRequest.fiat) && Intrinsics.areEqual(this.fiatAmount, thirdOrderRequest.fiatAmount) && Intrinsics.areEqual(this.payMethodId, thirdOrderRequest.payMethodId) && this.isFast == thirdOrderRequest.isFast && Intrinsics.areEqual(this.client, thirdOrderRequest.client);
    }

    public static /* synthetic */ ThirdOrderRequest copy$default(ThirdOrderRequest thirdOrderRequest, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdOrderRequest.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = thirdOrderRequest.crypto;
        }
        if ((i11 & 4) != 0) {
            str3 = thirdOrderRequest.cryptoAmount;
        }
        if ((i11 & 8) != 0) {
            str4 = thirdOrderRequest.fiat;
        }
        if ((i11 & 16) != 0) {
            str5 = thirdOrderRequest.fiatAmount;
        }
        if ((i11 & 32) != 0) {
            str6 = thirdOrderRequest.payMethodId;
        }
        if ((i11 & 64) != 0) {
            z11 = thirdOrderRequest.isFast;
        }
        if ((i11 & 128) != 0) {
            str7 = thirdOrderRequest.client;
        }
        boolean z12 = z11;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        return thirdOrderRequest.copy(str, str2, str3, str4, str9, str10, z12, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiat() {
        return this.fiat;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayMethodId() {
        return this.payMethodId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFast() {
        return this.isFast;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getClient() {
        return this.client;
    }

    @NotNull
    public final ThirdOrderRequest copy(@NotNull String channel, @NotNull String crypto, @NotNull String cryptoAmount, @NotNull String fiat, @NotNull String fiatAmount, @NotNull String payMethodId, boolean isFast, @NotNull String client) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(payMethodId, "payMethodId");
        Intrinsics.checkNotNullParameter(client, "client");
        return new ThirdOrderRequest(channel, crypto, cryptoAmount, fiat, fiatAmount, payMethodId, isFast, client);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getClient() {
        return this.client;
    }

    @NotNull
    public final String getCrypto() {
        return this.crypto;
    }

    @NotNull
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @NotNull
    public final String getFiat() {
        return this.fiat;
    }

    @NotNull
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @NotNull
    public final String getOrderSource() {
        return this.isFast ? "DISPATCH" : ORDER_COOPERATION;
    }

    @NotNull
    public final String getPayMethodId() {
        return this.payMethodId;
    }

    public int hashCode() {
        return (((((((((((((this.channel.hashCode() * 31) + this.crypto.hashCode()) * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiat.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.payMethodId.hashCode()) * 31) + Boolean.hashCode(this.isFast)) * 31) + this.client.hashCode();
    }

    public final boolean isFast() {
        return this.isFast;
    }

    public final void setFast(boolean z11) {
        this.isFast = z11;
    }

    @NotNull
    public String toString() {
        return "ThirdOrderRequest(channel=" + this.channel + ", crypto=" + this.crypto + ", cryptoAmount=" + this.cryptoAmount + ", fiat=" + this.fiat + ", fiatAmount=" + this.fiatAmount + ", payMethodId=" + this.payMethodId + ", isFast=" + this.isFast + ", client=" + this.client + ')';
    }

    public /* synthetic */ ThirdOrderRequest(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? "ANDROID" : str7);
    }
}
