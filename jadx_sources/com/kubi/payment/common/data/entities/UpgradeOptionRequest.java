package com.kubi.payment.common.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpgradeOption.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;", "", "orderType", "", "fiatCurrency", "cryptoCurrency", "paymentMethodCode", "thirdParty", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderType", "()Ljava/lang/String;", "getFiatCurrency", "getCryptoCurrency", "getPaymentMethodCode", "getThirdParty", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpgradeOptionRequest {

    @NotNull
    public static final String CRYPTO_TRADE = "CRYPTO_TRADE";

    @NotNull
    public static final String FIAT_RECHARGE = "FIAT_RECHARGE";

    @NotNull
    public static final String FIAT_WITHDRAW = "FIAT_WITHDRAW";

    @NotNull
    public static final String POPULAR_PAY = "POPULAR_PAY";

    @NotNull
    public static final String THIRD_PARTY = "THIRD_PARTY";

    @NotNull
    private final String cryptoCurrency;

    @NotNull
    private final String fiatCurrency;

    @NotNull
    private final String orderType;

    @NotNull
    private final String paymentMethodCode;

    @NotNull
    private final String thirdParty;

    public UpgradeOptionRequest(@NotNull String orderType, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String paymentMethodCode, @NotNull String thirdParty) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        this.orderType = orderType;
        this.fiatCurrency = fiatCurrency;
        this.cryptoCurrency = cryptoCurrency;
        this.paymentMethodCode = paymentMethodCode;
        this.thirdParty = thirdParty;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeOptionRequest)) {
            return false;
        }
        UpgradeOptionRequest upgradeOptionRequest = (UpgradeOptionRequest) other;
        return Intrinsics.areEqual(this.orderType, upgradeOptionRequest.orderType) && Intrinsics.areEqual(this.fiatCurrency, upgradeOptionRequest.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, upgradeOptionRequest.cryptoCurrency) && Intrinsics.areEqual(this.paymentMethodCode, upgradeOptionRequest.paymentMethodCode) && Intrinsics.areEqual(this.thirdParty, upgradeOptionRequest.thirdParty);
    }

    public static /* synthetic */ UpgradeOptionRequest copy$default(UpgradeOptionRequest upgradeOptionRequest, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = upgradeOptionRequest.orderType;
        }
        if ((i11 & 2) != 0) {
            str2 = upgradeOptionRequest.fiatCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = upgradeOptionRequest.cryptoCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = upgradeOptionRequest.paymentMethodCode;
        }
        if ((i11 & 16) != 0) {
            str5 = upgradeOptionRequest.thirdParty;
        }
        String str6 = str5;
        String str7 = str3;
        return upgradeOptionRequest.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThirdParty() {
        return this.thirdParty;
    }

    @NotNull
    public final UpgradeOptionRequest copy(@NotNull String orderType, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String paymentMethodCode, @NotNull String thirdParty) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        return new UpgradeOptionRequest(orderType, fiatCurrency, cryptoCurrency, paymentMethodCode, thirdParty);
    }

    @NotNull
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    public final String getThirdParty() {
        return this.thirdParty;
    }

    public int hashCode() {
        return (((((((this.orderType.hashCode() * 31) + this.fiatCurrency.hashCode()) * 31) + this.cryptoCurrency.hashCode()) * 31) + this.paymentMethodCode.hashCode()) * 31) + this.thirdParty.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpgradeOptionRequest(orderType=" + this.orderType + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ", thirdParty=" + this.thirdParty + ')';
    }

    public /* synthetic */ UpgradeOptionRequest(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5);
    }
}
