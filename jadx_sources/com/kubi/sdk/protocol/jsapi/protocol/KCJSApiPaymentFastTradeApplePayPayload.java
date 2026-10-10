package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayPayload;", "", "paymentSessionId", "", "payToken", "forterMobileUid", "applePayExt", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayExt;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayExt;)V", "getApplePayExt", "()Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayExt;", "getForterMobileUid", "()Ljava/lang/String;", "getPayToken", "getPaymentSessionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeApplePayPayload {

    @NotNull
    private final KCJSApiPaymentFastTradeApplePayExt applePayExt;

    @NotNull
    private final String forterMobileUid;

    @NotNull
    private final String payToken;

    @NotNull
    private final String paymentSessionId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeApplePayPayload)) {
            return false;
        }
        KCJSApiPaymentFastTradeApplePayPayload kCJSApiPaymentFastTradeApplePayPayload = (KCJSApiPaymentFastTradeApplePayPayload) other;
        return Intrinsics.areEqual(this.paymentSessionId, kCJSApiPaymentFastTradeApplePayPayload.paymentSessionId) && Intrinsics.areEqual(this.payToken, kCJSApiPaymentFastTradeApplePayPayload.payToken) && Intrinsics.areEqual(this.forterMobileUid, kCJSApiPaymentFastTradeApplePayPayload.forterMobileUid) && Intrinsics.areEqual(this.applePayExt, kCJSApiPaymentFastTradeApplePayPayload.applePayExt);
    }

    public KCJSApiPaymentFastTradeApplePayPayload(@NotNull String paymentSessionId, @NotNull String payToken, @NotNull String forterMobileUid, @NotNull KCJSApiPaymentFastTradeApplePayExt applePayExt) {
        Intrinsics.checkNotNullParameter(paymentSessionId, "paymentSessionId");
        Intrinsics.checkNotNullParameter(payToken, "payToken");
        Intrinsics.checkNotNullParameter(forterMobileUid, "forterMobileUid");
        Intrinsics.checkNotNullParameter(applePayExt, "applePayExt");
        this.paymentSessionId = paymentSessionId;
        this.payToken = payToken;
        this.forterMobileUid = forterMobileUid;
        this.applePayExt = applePayExt;
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeApplePayPayload copy$default(KCJSApiPaymentFastTradeApplePayPayload kCJSApiPaymentFastTradeApplePayPayload, String str, String str2, String str3, KCJSApiPaymentFastTradeApplePayExt kCJSApiPaymentFastTradeApplePayExt, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeApplePayPayload.paymentSessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeApplePayPayload.payToken;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentFastTradeApplePayPayload.forterMobileUid;
        }
        if ((i11 & 8) != 0) {
            kCJSApiPaymentFastTradeApplePayExt = kCJSApiPaymentFastTradeApplePayPayload.applePayExt;
        }
        return kCJSApiPaymentFastTradeApplePayPayload.copy(str, str2, str3, kCJSApiPaymentFastTradeApplePayExt);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayToken() {
        return this.payToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getForterMobileUid() {
        return this.forterMobileUid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final KCJSApiPaymentFastTradeApplePayExt getApplePayExt() {
        return this.applePayExt;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayPayload copy(@NotNull String paymentSessionId, @NotNull String payToken, @NotNull String forterMobileUid, @NotNull KCJSApiPaymentFastTradeApplePayExt applePayExt) {
        Intrinsics.checkNotNullParameter(paymentSessionId, "paymentSessionId");
        Intrinsics.checkNotNullParameter(payToken, "payToken");
        Intrinsics.checkNotNullParameter(forterMobileUid, "forterMobileUid");
        Intrinsics.checkNotNullParameter(applePayExt, "applePayExt");
        return new KCJSApiPaymentFastTradeApplePayPayload(paymentSessionId, payToken, forterMobileUid, applePayExt);
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayExt getApplePayExt() {
        return this.applePayExt;
    }

    @NotNull
    public final String getForterMobileUid() {
        return this.forterMobileUid;
    }

    @NotNull
    public final String getPayToken() {
        return this.payToken;
    }

    @NotNull
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    public int hashCode() {
        return (((((this.paymentSessionId.hashCode() * 31) + this.payToken.hashCode()) * 31) + this.forterMobileUid.hashCode()) * 31) + this.applePayExt.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeApplePayPayload(paymentSessionId=" + this.paymentSessionId + ", payToken=" + this.payToken + ", forterMobileUid=" + this.forterMobileUid + ", applePayExt=" + this.applePayExt + ')';
    }
}
