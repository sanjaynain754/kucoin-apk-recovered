package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.P2PPlaceBuyOrder$Request, reason: from toString */
/* JADX INFO: compiled from: P2PPlaceBuyOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;", "", "quoteId", "", "businessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuoteId", "()Ljava/lang/String;", "getBusinessType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Request {

    @SerializedName("businessType")
    @Nullable
    private final String businessType;

    @SerializedName("quoteId")
    @Nullable
    private final String quoteId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return Intrinsics.areEqual(this.quoteId, request.quoteId) && Intrinsics.areEqual(this.businessType, request.businessType);
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = request.quoteId;
        }
        if ((i11 & 2) != 0) {
            str2 = request.businessType;
        }
        return request.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuoteId() {
        return this.quoteId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final Request copy(@Nullable String quoteId, @Nullable String businessType) {
        return new Request(quoteId, businessType);
    }

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getQuoteId() {
        return this.quoteId;
    }

    public int hashCode() {
        String str = this.quoteId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Request(quoteId=" + this.quoteId + ", businessType=" + this.businessType + ')';
    }

    public Request(@Nullable String str, @Nullable String str2) {
        this.quoteId = str;
        this.businessType = str2;
    }
}
