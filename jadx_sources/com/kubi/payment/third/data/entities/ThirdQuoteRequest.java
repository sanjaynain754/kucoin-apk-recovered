package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;", "", "fiat", "", "crypto", "fiatAmount", "payMethodId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiat", "()Ljava/lang/String;", "getCrypto", "getFiatAmount", "getPayMethodId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdQuoteRequest {

    @NotNull
    private final String crypto;

    @NotNull
    private final String fiat;

    @NotNull
    private final String fiatAmount;

    @NotNull
    private final String payMethodId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdQuoteRequest)) {
            return false;
        }
        ThirdQuoteRequest thirdQuoteRequest = (ThirdQuoteRequest) other;
        return Intrinsics.areEqual(this.fiat, thirdQuoteRequest.fiat) && Intrinsics.areEqual(this.crypto, thirdQuoteRequest.crypto) && Intrinsics.areEqual(this.fiatAmount, thirdQuoteRequest.fiatAmount) && Intrinsics.areEqual(this.payMethodId, thirdQuoteRequest.payMethodId);
    }

    public ThirdQuoteRequest(@NotNull String fiat, @NotNull String crypto, @NotNull String fiatAmount, @NotNull String payMethodId) {
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(payMethodId, "payMethodId");
        this.fiat = fiat;
        this.crypto = crypto;
        this.fiatAmount = fiatAmount;
        this.payMethodId = payMethodId;
    }

    public static /* synthetic */ ThirdQuoteRequest copy$default(ThirdQuoteRequest thirdQuoteRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdQuoteRequest.fiat;
        }
        if ((i11 & 2) != 0) {
            str2 = thirdQuoteRequest.crypto;
        }
        if ((i11 & 4) != 0) {
            str3 = thirdQuoteRequest.fiatAmount;
        }
        if ((i11 & 8) != 0) {
            str4 = thirdQuoteRequest.payMethodId;
        }
        return thirdQuoteRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFiat() {
        return this.fiat;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayMethodId() {
        return this.payMethodId;
    }

    @NotNull
    public final ThirdQuoteRequest copy(@NotNull String fiat, @NotNull String crypto, @NotNull String fiatAmount, @NotNull String payMethodId) {
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(payMethodId, "payMethodId");
        return new ThirdQuoteRequest(fiat, crypto, fiatAmount, payMethodId);
    }

    @NotNull
    public final String getCrypto() {
        return this.crypto;
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
    public final String getPayMethodId() {
        return this.payMethodId;
    }

    public int hashCode() {
        return (((((this.fiat.hashCode() * 31) + this.crypto.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.payMethodId.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThirdQuoteRequest(fiat=" + this.fiat + ", crypto=" + this.crypto + ", fiatAmount=" + this.fiatAmount + ", payMethodId=" + this.payMethodId + ')';
    }
}
