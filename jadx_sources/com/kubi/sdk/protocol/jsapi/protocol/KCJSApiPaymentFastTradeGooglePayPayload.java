package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayPayload;", "", "payToken", "", "googlePayExt", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayBillingAddress;", "(Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayBillingAddress;)V", "getGooglePayExt", "()Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayBillingAddress;", "getPayToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeGooglePayPayload {

    @NotNull
    private final KCJSApiPaymentFastTradeGooglePayBillingAddress googlePayExt;

    @NotNull
    private final String payToken;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeGooglePayPayload)) {
            return false;
        }
        KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload = (KCJSApiPaymentFastTradeGooglePayPayload) other;
        return Intrinsics.areEqual(this.payToken, kCJSApiPaymentFastTradeGooglePayPayload.payToken) && Intrinsics.areEqual(this.googlePayExt, kCJSApiPaymentFastTradeGooglePayPayload.googlePayExt);
    }

    public KCJSApiPaymentFastTradeGooglePayPayload(@NotNull String payToken, @NotNull KCJSApiPaymentFastTradeGooglePayBillingAddress googlePayExt) {
        Intrinsics.checkNotNullParameter(payToken, "payToken");
        Intrinsics.checkNotNullParameter(googlePayExt, "googlePayExt");
        this.payToken = payToken;
        this.googlePayExt = googlePayExt;
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeGooglePayPayload copy$default(KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload, String str, KCJSApiPaymentFastTradeGooglePayBillingAddress kCJSApiPaymentFastTradeGooglePayBillingAddress, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeGooglePayPayload.payToken;
        }
        if ((i11 & 2) != 0) {
            kCJSApiPaymentFastTradeGooglePayBillingAddress = kCJSApiPaymentFastTradeGooglePayPayload.googlePayExt;
        }
        return kCJSApiPaymentFastTradeGooglePayPayload.copy(str, kCJSApiPaymentFastTradeGooglePayBillingAddress);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayToken() {
        return this.payToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KCJSApiPaymentFastTradeGooglePayBillingAddress getGooglePayExt() {
        return this.googlePayExt;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeGooglePayPayload copy(@NotNull String payToken, @NotNull KCJSApiPaymentFastTradeGooglePayBillingAddress googlePayExt) {
        Intrinsics.checkNotNullParameter(payToken, "payToken");
        Intrinsics.checkNotNullParameter(googlePayExt, "googlePayExt");
        return new KCJSApiPaymentFastTradeGooglePayPayload(payToken, googlePayExt);
    }

    @NotNull
    public final KCJSApiPaymentFastTradeGooglePayBillingAddress getGooglePayExt() {
        return this.googlePayExt;
    }

    @NotNull
    public final String getPayToken() {
        return this.payToken;
    }

    public int hashCode() {
        return (this.payToken.hashCode() * 31) + this.googlePayExt.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeGooglePayPayload(payToken=" + this.payToken + ", googlePayExt=" + this.googlePayExt + ')';
    }
}
