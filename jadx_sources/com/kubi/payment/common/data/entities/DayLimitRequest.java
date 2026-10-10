package com.kubi.payment.common.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DayLimit.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/common/data/entities/DayLimitRequest;", "", FirebaseAnalytics.Param.CURRENCY, "", "dayLimitTradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDayLimitTradeType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DayLimitRequest {

    @Nullable
    private String currency;

    @Nullable
    private final String dayLimitTradeType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayLimitRequest)) {
            return false;
        }
        DayLimitRequest dayLimitRequest = (DayLimitRequest) other;
        return Intrinsics.areEqual(this.currency, dayLimitRequest.currency) && Intrinsics.areEqual(this.dayLimitTradeType, dayLimitRequest.dayLimitTradeType);
    }

    public static /* synthetic */ DayLimitRequest copy$default(DayLimitRequest dayLimitRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dayLimitRequest.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = dayLimitRequest.dayLimitTradeType;
        }
        return dayLimitRequest.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDayLimitTradeType() {
        return this.dayLimitTradeType;
    }

    @NotNull
    public final DayLimitRequest copy(@Nullable String currency, @Nullable String dayLimitTradeType) {
        return new DayLimitRequest(currency, dayLimitTradeType);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDayLimitTradeType() {
        return this.dayLimitTradeType;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dayLimitTradeType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    @NotNull
    public String toString() {
        return "DayLimitRequest(currency=" + this.currency + ", dayLimitTradeType=" + this.dayLimitTradeType + ')';
    }

    public DayLimitRequest(@Nullable String str, @Nullable String str2) {
        this.currency = str;
        this.dayLimitTradeType = str2;
    }
}
