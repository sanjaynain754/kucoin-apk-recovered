package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayExt;", "", "billingAddress", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayBillingAddress;", "encryptedBillingAddress", "(Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayBillingAddress;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayBillingAddress;)V", "getBillingAddress", "()Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayBillingAddress;", "getEncryptedBillingAddress", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeApplePayExt {

    @NotNull
    private final KCJSApiPaymentFastTradeApplePayBillingAddress billingAddress;

    @NotNull
    private final KCJSApiPaymentFastTradeApplePayBillingAddress encryptedBillingAddress;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeApplePayExt)) {
            return false;
        }
        KCJSApiPaymentFastTradeApplePayExt kCJSApiPaymentFastTradeApplePayExt = (KCJSApiPaymentFastTradeApplePayExt) other;
        return Intrinsics.areEqual(this.billingAddress, kCJSApiPaymentFastTradeApplePayExt.billingAddress) && Intrinsics.areEqual(this.encryptedBillingAddress, kCJSApiPaymentFastTradeApplePayExt.encryptedBillingAddress);
    }

    public KCJSApiPaymentFastTradeApplePayExt(@NotNull KCJSApiPaymentFastTradeApplePayBillingAddress billingAddress, @NotNull KCJSApiPaymentFastTradeApplePayBillingAddress encryptedBillingAddress) {
        Intrinsics.checkNotNullParameter(billingAddress, "billingAddress");
        Intrinsics.checkNotNullParameter(encryptedBillingAddress, "encryptedBillingAddress");
        this.billingAddress = billingAddress;
        this.encryptedBillingAddress = encryptedBillingAddress;
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeApplePayExt copy$default(KCJSApiPaymentFastTradeApplePayExt kCJSApiPaymentFastTradeApplePayExt, KCJSApiPaymentFastTradeApplePayBillingAddress kCJSApiPaymentFastTradeApplePayBillingAddress, KCJSApiPaymentFastTradeApplePayBillingAddress kCJSApiPaymentFastTradeApplePayBillingAddress2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kCJSApiPaymentFastTradeApplePayBillingAddress = kCJSApiPaymentFastTradeApplePayExt.billingAddress;
        }
        if ((i11 & 2) != 0) {
            kCJSApiPaymentFastTradeApplePayBillingAddress2 = kCJSApiPaymentFastTradeApplePayExt.encryptedBillingAddress;
        }
        return kCJSApiPaymentFastTradeApplePayExt.copy(kCJSApiPaymentFastTradeApplePayBillingAddress, kCJSApiPaymentFastTradeApplePayBillingAddress2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KCJSApiPaymentFastTradeApplePayBillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KCJSApiPaymentFastTradeApplePayBillingAddress getEncryptedBillingAddress() {
        return this.encryptedBillingAddress;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayExt copy(@NotNull KCJSApiPaymentFastTradeApplePayBillingAddress billingAddress, @NotNull KCJSApiPaymentFastTradeApplePayBillingAddress encryptedBillingAddress) {
        Intrinsics.checkNotNullParameter(billingAddress, "billingAddress");
        Intrinsics.checkNotNullParameter(encryptedBillingAddress, "encryptedBillingAddress");
        return new KCJSApiPaymentFastTradeApplePayExt(billingAddress, encryptedBillingAddress);
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayBillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayBillingAddress getEncryptedBillingAddress() {
        return this.encryptedBillingAddress;
    }

    public int hashCode() {
        return (this.billingAddress.hashCode() * 31) + this.encryptedBillingAddress.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeApplePayExt(billingAddress=" + this.billingAddress + ", encryptedBillingAddress=" + this.encryptedBillingAddress + ')';
    }
}
