package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayRecurringRequest;", "", "name", "", "intervalUnit", "intervalCount", "", "startDate", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getIntervalCount", "()J", "getIntervalUnit", "()Ljava/lang/String;", "getName", "getStartDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeApplePayRecurringRequest {
    private final long intervalCount;

    @NotNull
    private final String intervalUnit;

    @NotNull
    private final String name;

    @Nullable
    private final String startDate;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeApplePayRecurringRequest)) {
            return false;
        }
        KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest = (KCJSApiPaymentFastTradeApplePayRecurringRequest) other;
        return Intrinsics.areEqual(this.name, kCJSApiPaymentFastTradeApplePayRecurringRequest.name) && Intrinsics.areEqual(this.intervalUnit, kCJSApiPaymentFastTradeApplePayRecurringRequest.intervalUnit) && this.intervalCount == kCJSApiPaymentFastTradeApplePayRecurringRequest.intervalCount && Intrinsics.areEqual(this.startDate, kCJSApiPaymentFastTradeApplePayRecurringRequest.startDate);
    }

    public KCJSApiPaymentFastTradeApplePayRecurringRequest(@NotNull String name, @NotNull String intervalUnit, long j11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(intervalUnit, "intervalUnit");
        this.name = name;
        this.intervalUnit = intervalUnit;
        this.intervalCount = j11;
        this.startDate = str;
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeApplePayRecurringRequest copy$default(KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest, String str, String str2, long j11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeApplePayRecurringRequest.name;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeApplePayRecurringRequest.intervalUnit;
        }
        if ((i11 & 4) != 0) {
            j11 = kCJSApiPaymentFastTradeApplePayRecurringRequest.intervalCount;
        }
        if ((i11 & 8) != 0) {
            str3 = kCJSApiPaymentFastTradeApplePayRecurringRequest.startDate;
        }
        String str4 = str3;
        return kCJSApiPaymentFastTradeApplePayRecurringRequest.copy(str, str2, j11, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntervalUnit() {
        return this.intervalUnit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getIntervalCount() {
        return this.intervalCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayRecurringRequest copy(@NotNull String name, @NotNull String intervalUnit, long intervalCount, @Nullable String startDate) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(intervalUnit, "intervalUnit");
        return new KCJSApiPaymentFastTradeApplePayRecurringRequest(name, intervalUnit, intervalCount, startDate);
    }

    public final long getIntervalCount() {
        return this.intervalCount;
    }

    @NotNull
    public final String getIntervalUnit() {
        return this.intervalUnit;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.intervalUnit.hashCode()) * 31) + Long.hashCode(this.intervalCount)) * 31;
        String str = this.startDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeApplePayRecurringRequest(name=" + this.name + ", intervalUnit=" + this.intervalUnit + ", intervalCount=" + this.intervalCount + ", startDate=" + this.startDate + ')';
    }
}
