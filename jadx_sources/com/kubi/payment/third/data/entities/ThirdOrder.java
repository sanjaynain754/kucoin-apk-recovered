package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u009d\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006X"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdOrder;", "", AppsFlyerProperties.CHANNEL, "", "accountId", "accountReference", "amount", "Ljava/math/BigDecimal;", "createdAt", FirebaseAnalytics.Param.CURRENCY, "fiatAmount", "fiatCurrency", "id", "orderType", "redirectUrl", "walletAddress", "digitalAmount", "digitalCurrency", "paymentId", "quoteId", "cryptoAddress", "localOrderId", "localUserId", "thirdPartyOrderId", "thirdPartyUserId", "mobilumOrder", "Lcom/kubi/payment/third/data/entities/MobilumOrder;", "channelExtra", "Lcom/kubi/payment/third/data/entities/ChannelExtra;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/third/data/entities/MobilumOrder;Lcom/kubi/payment/third/data/entities/ChannelExtra;)V", "getChannel", "()Ljava/lang/String;", "getAccountId", "getAccountReference", "getAmount", "()Ljava/math/BigDecimal;", "getCreatedAt", "getCurrency", "getFiatAmount", "getFiatCurrency", "getId", "getOrderType", "getRedirectUrl", "getWalletAddress", "getDigitalAmount", "getDigitalCurrency", "getPaymentId", "getQuoteId", "getCryptoAddress", "getLocalOrderId", "getLocalUserId", "getThirdPartyOrderId", "getThirdPartyUserId", "getMobilumOrder", "()Lcom/kubi/payment/third/data/entities/MobilumOrder;", "getChannelExtra", "()Lcom/kubi/payment/third/data/entities/ChannelExtra;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdOrder {

    @Nullable
    private final String accountId;

    @Nullable
    private final String accountReference;

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final String channel;

    @SerializedName("channelExtra")
    @Nullable
    private final ChannelExtra channelExtra;

    @Nullable
    private final String createdAt;

    @Nullable
    private final String cryptoAddress;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal digitalAmount;

    @Nullable
    private final String digitalCurrency;

    @Nullable
    private final BigDecimal fiatAmount;

    @Nullable
    private final String fiatCurrency;

    @Nullable
    private final String id;

    @Nullable
    private final String localOrderId;

    @Nullable
    private final String localUserId;

    @Nullable
    private final MobilumOrder mobilumOrder;

    @Nullable
    private final String orderType;

    @Nullable
    private final String paymentId;

    @Nullable
    private final String quoteId;

    @Nullable
    private final String redirectUrl;

    @Nullable
    private final String thirdPartyOrderId;

    @Nullable
    private final String thirdPartyUserId;

    @Nullable
    private final String walletAddress;

    public static /* synthetic */ ThirdOrder copy$default(ThirdOrder thirdOrder, String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, BigDecimal bigDecimal2, String str6, String str7, String str8, String str9, String str10, BigDecimal bigDecimal3, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, MobilumOrder mobilumOrder, ChannelExtra channelExtra, int i11, Object obj) {
        ChannelExtra channelExtra2;
        MobilumOrder mobilumOrder2;
        String str19 = (i11 & 1) != 0 ? thirdOrder.channel : str;
        String str20 = (i11 & 2) != 0 ? thirdOrder.accountId : str2;
        String str21 = (i11 & 4) != 0 ? thirdOrder.accountReference : str3;
        BigDecimal bigDecimal4 = (i11 & 8) != 0 ? thirdOrder.amount : bigDecimal;
        String str22 = (i11 & 16) != 0 ? thirdOrder.createdAt : str4;
        String str23 = (i11 & 32) != 0 ? thirdOrder.currency : str5;
        BigDecimal bigDecimal5 = (i11 & 64) != 0 ? thirdOrder.fiatAmount : bigDecimal2;
        String str24 = (i11 & 128) != 0 ? thirdOrder.fiatCurrency : str6;
        String str25 = (i11 & 256) != 0 ? thirdOrder.id : str7;
        String str26 = (i11 & 512) != 0 ? thirdOrder.orderType : str8;
        String str27 = (i11 & 1024) != 0 ? thirdOrder.redirectUrl : str9;
        String str28 = (i11 & 2048) != 0 ? thirdOrder.walletAddress : str10;
        BigDecimal bigDecimal6 = (i11 & 4096) != 0 ? thirdOrder.digitalAmount : bigDecimal3;
        String str29 = (i11 & 8192) != 0 ? thirdOrder.digitalCurrency : str11;
        String str30 = str19;
        String str31 = (i11 & 16384) != 0 ? thirdOrder.paymentId : str12;
        String str32 = (i11 & 32768) != 0 ? thirdOrder.quoteId : str13;
        String str33 = (i11 & 65536) != 0 ? thirdOrder.cryptoAddress : str14;
        String str34 = (i11 & 131072) != 0 ? thirdOrder.localOrderId : str15;
        String str35 = (i11 & 262144) != 0 ? thirdOrder.localUserId : str16;
        String str36 = (i11 & 524288) != 0 ? thirdOrder.thirdPartyOrderId : str17;
        String str37 = (i11 & 1048576) != 0 ? thirdOrder.thirdPartyUserId : str18;
        MobilumOrder mobilumOrder3 = (i11 & 2097152) != 0 ? thirdOrder.mobilumOrder : mobilumOrder;
        if ((i11 & 4194304) != 0) {
            mobilumOrder2 = mobilumOrder3;
            channelExtra2 = thirdOrder.channelExtra;
        } else {
            channelExtra2 = channelExtra;
            mobilumOrder2 = mobilumOrder3;
        }
        return thirdOrder.copy(str30, str20, str21, bigDecimal4, str22, str23, bigDecimal5, str24, str25, str26, str27, str28, bigDecimal6, str29, str31, str32, str33, str34, str35, str36, str37, mobilumOrder2, channelExtra2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdOrder)) {
            return false;
        }
        ThirdOrder thirdOrder = (ThirdOrder) other;
        return Intrinsics.areEqual(this.channel, thirdOrder.channel) && Intrinsics.areEqual(this.accountId, thirdOrder.accountId) && Intrinsics.areEqual(this.accountReference, thirdOrder.accountReference) && Intrinsics.areEqual(this.amount, thirdOrder.amount) && Intrinsics.areEqual(this.createdAt, thirdOrder.createdAt) && Intrinsics.areEqual(this.currency, thirdOrder.currency) && Intrinsics.areEqual(this.fiatAmount, thirdOrder.fiatAmount) && Intrinsics.areEqual(this.fiatCurrency, thirdOrder.fiatCurrency) && Intrinsics.areEqual(this.id, thirdOrder.id) && Intrinsics.areEqual(this.orderType, thirdOrder.orderType) && Intrinsics.areEqual(this.redirectUrl, thirdOrder.redirectUrl) && Intrinsics.areEqual(this.walletAddress, thirdOrder.walletAddress) && Intrinsics.areEqual(this.digitalAmount, thirdOrder.digitalAmount) && Intrinsics.areEqual(this.digitalCurrency, thirdOrder.digitalCurrency) && Intrinsics.areEqual(this.paymentId, thirdOrder.paymentId) && Intrinsics.areEqual(this.quoteId, thirdOrder.quoteId) && Intrinsics.areEqual(this.cryptoAddress, thirdOrder.cryptoAddress) && Intrinsics.areEqual(this.localOrderId, thirdOrder.localOrderId) && Intrinsics.areEqual(this.localUserId, thirdOrder.localUserId) && Intrinsics.areEqual(this.thirdPartyOrderId, thirdOrder.thirdPartyOrderId) && Intrinsics.areEqual(this.thirdPartyUserId, thirdOrder.thirdPartyUserId) && Intrinsics.areEqual(this.mobilumOrder, thirdOrder.mobilumOrder) && Intrinsics.areEqual(this.channelExtra, thirdOrder.channelExtra);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getDigitalAmount() {
        return this.digitalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDigitalCurrency() {
        return this.digitalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getQuoteId() {
        return this.quoteId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCryptoAddress() {
        return this.cryptoAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getLocalOrderId() {
        return this.localOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getThirdPartyOrderId() {
        return this.thirdPartyOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final MobilumOrder getMobilumOrder() {
        return this.mobilumOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final ChannelExtra getChannelExtra() {
        return this.channelExtra;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountReference() {
        return this.accountReference;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ThirdOrder copy(@Nullable String channel, @Nullable String accountId, @Nullable String accountReference, @Nullable BigDecimal amount, @Nullable String createdAt, @Nullable String currency, @Nullable BigDecimal fiatAmount, @Nullable String fiatCurrency, @Nullable String id2, @Nullable String orderType, @Nullable String redirectUrl, @Nullable String walletAddress, @Nullable BigDecimal digitalAmount, @Nullable String digitalCurrency, @Nullable String paymentId, @Nullable String quoteId, @Nullable String cryptoAddress, @Nullable String localOrderId, @Nullable String localUserId, @Nullable String thirdPartyOrderId, @Nullable String thirdPartyUserId, @Nullable MobilumOrder mobilumOrder, @Nullable ChannelExtra channelExtra) {
        return new ThirdOrder(channel, accountId, accountReference, amount, createdAt, currency, fiatAmount, fiatCurrency, id2, orderType, redirectUrl, walletAddress, digitalAmount, digitalCurrency, paymentId, quoteId, cryptoAddress, localOrderId, localUserId, thirdPartyOrderId, thirdPartyUserId, mobilumOrder, channelExtra);
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountReference() {
        return this.accountReference;
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final ChannelExtra getChannelExtra() {
        return this.channelExtra;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCryptoAddress() {
        return this.cryptoAddress;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDigitalAmount() {
        return this.digitalAmount;
    }

    @Nullable
    public final String getDigitalCurrency() {
        return this.digitalCurrency;
    }

    @Nullable
    public final BigDecimal getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLocalOrderId() {
        return this.localOrderId;
    }

    @Nullable
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @Nullable
    public final MobilumOrder getMobilumOrder() {
        return this.mobilumOrder;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    public final String getQuoteId() {
        return this.quoteId;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final String getThirdPartyOrderId() {
        return this.thirdPartyOrderId;
    }

    @Nullable
    public final String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    @Nullable
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public int hashCode() {
        String str = this.channel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountReference;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.fiatAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.fiatCurrency;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.orderType;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.redirectUrl;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.walletAddress;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.digitalAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str11 = this.digitalCurrency;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentId;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.quoteId;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cryptoAddress;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.localOrderId;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.localUserId;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.thirdPartyOrderId;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.thirdPartyUserId;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        MobilumOrder mobilumOrder = this.mobilumOrder;
        int iHashCode22 = (iHashCode21 + (mobilumOrder == null ? 0 : mobilumOrder.hashCode())) * 31;
        ChannelExtra channelExtra = this.channelExtra;
        return iHashCode22 + (channelExtra != null ? channelExtra.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThirdOrder(channel=" + this.channel + ", accountId=" + this.accountId + ", accountReference=" + this.accountReference + ", amount=" + this.amount + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ", id=" + this.id + ", orderType=" + this.orderType + ", redirectUrl=" + this.redirectUrl + ", walletAddress=" + this.walletAddress + ", digitalAmount=" + this.digitalAmount + ", digitalCurrency=" + this.digitalCurrency + ", paymentId=" + this.paymentId + ", quoteId=" + this.quoteId + ", cryptoAddress=" + this.cryptoAddress + ", localOrderId=" + this.localOrderId + ", localUserId=" + this.localUserId + ", thirdPartyOrderId=" + this.thirdPartyOrderId + ", thirdPartyUserId=" + this.thirdPartyUserId + ", mobilumOrder=" + this.mobilumOrder + ", channelExtra=" + this.channelExtra + ')';
    }

    public ThirdOrder(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal2, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable BigDecimal bigDecimal3, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable MobilumOrder mobilumOrder, @Nullable ChannelExtra channelExtra) {
        this.channel = str;
        this.accountId = str2;
        this.accountReference = str3;
        this.amount = bigDecimal;
        this.createdAt = str4;
        this.currency = str5;
        this.fiatAmount = bigDecimal2;
        this.fiatCurrency = str6;
        this.id = str7;
        this.orderType = str8;
        this.redirectUrl = str9;
        this.walletAddress = str10;
        this.digitalAmount = bigDecimal3;
        this.digitalCurrency = str11;
        this.paymentId = str12;
        this.quoteId = str13;
        this.cryptoAddress = str14;
        this.localOrderId = str15;
        this.localUserId = str16;
        this.thirdPartyOrderId = str17;
        this.thirdPartyUserId = str18;
        this.mobilumOrder = mobilumOrder;
        this.channelExtra = channelExtra;
    }
}
