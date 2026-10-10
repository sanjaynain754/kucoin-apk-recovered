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
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/common/data/entities/DayLimit;", "", "dayLimitUsd", "", "leftAmountUsd", FirebaseAnalytics.Param.CURRENCY, "dayLimitCurrency", "leftAmountCurrency", "dayLimitWhiteUser", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDayLimitUsd", "()Ljava/lang/String;", "getLeftAmountUsd", "getCurrency", "getDayLimitCurrency", "getLeftAmountCurrency", "getDayLimitWhiteUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/common/data/entities/DayLimit;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DayLimit {

    @Nullable
    private final String currency;

    @Nullable
    private final String dayLimitCurrency;

    @Nullable
    private final String dayLimitUsd;

    @Nullable
    private final Boolean dayLimitWhiteUser;

    @Nullable
    private final String leftAmountCurrency;

    @Nullable
    private final String leftAmountUsd;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayLimit)) {
            return false;
        }
        DayLimit dayLimit = (DayLimit) other;
        return Intrinsics.areEqual(this.dayLimitUsd, dayLimit.dayLimitUsd) && Intrinsics.areEqual(this.leftAmountUsd, dayLimit.leftAmountUsd) && Intrinsics.areEqual(this.currency, dayLimit.currency) && Intrinsics.areEqual(this.dayLimitCurrency, dayLimit.dayLimitCurrency) && Intrinsics.areEqual(this.leftAmountCurrency, dayLimit.leftAmountCurrency) && Intrinsics.areEqual(this.dayLimitWhiteUser, dayLimit.dayLimitWhiteUser);
    }

    public static /* synthetic */ DayLimit copy$default(DayLimit dayLimit, String str, String str2, String str3, String str4, String str5, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dayLimit.dayLimitUsd;
        }
        if ((i11 & 2) != 0) {
            str2 = dayLimit.leftAmountUsd;
        }
        if ((i11 & 4) != 0) {
            str3 = dayLimit.currency;
        }
        if ((i11 & 8) != 0) {
            str4 = dayLimit.dayLimitCurrency;
        }
        if ((i11 & 16) != 0) {
            str5 = dayLimit.leftAmountCurrency;
        }
        if ((i11 & 32) != 0) {
            bool = dayLimit.dayLimitWhiteUser;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        return dayLimit.copy(str, str2, str3, str4, str6, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDayLimitUsd() {
        return this.dayLimitUsd;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftAmountUsd() {
        return this.leftAmountUsd;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDayLimitCurrency() {
        return this.dayLimitCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeftAmountCurrency() {
        return this.leftAmountCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDayLimitWhiteUser() {
        return this.dayLimitWhiteUser;
    }

    @NotNull
    public final DayLimit copy(@Nullable String dayLimitUsd, @Nullable String leftAmountUsd, @Nullable String currency, @Nullable String dayLimitCurrency, @Nullable String leftAmountCurrency, @Nullable Boolean dayLimitWhiteUser) {
        return new DayLimit(dayLimitUsd, leftAmountUsd, currency, dayLimitCurrency, leftAmountCurrency, dayLimitWhiteUser);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDayLimitCurrency() {
        return this.dayLimitCurrency;
    }

    @Nullable
    public final String getDayLimitUsd() {
        return this.dayLimitUsd;
    }

    @Nullable
    public final Boolean getDayLimitWhiteUser() {
        return this.dayLimitWhiteUser;
    }

    @Nullable
    public final String getLeftAmountCurrency() {
        return this.leftAmountCurrency;
    }

    @Nullable
    public final String getLeftAmountUsd() {
        return this.leftAmountUsd;
    }

    public int hashCode() {
        String str = this.dayLimitUsd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftAmountUsd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dayLimitCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leftAmountCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.dayLimitWhiteUser;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DayLimit(dayLimitUsd=" + this.dayLimitUsd + ", leftAmountUsd=" + this.leftAmountUsd + ", currency=" + this.currency + ", dayLimitCurrency=" + this.dayLimitCurrency + ", leftAmountCurrency=" + this.leftAmountCurrency + ", dayLimitWhiteUser=" + this.dayLimitWhiteUser + ')';
    }

    public DayLimit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool) {
        this.dayLimitUsd = str;
        this.leftAmountUsd = str2;
        this.currency = str3;
        this.dayLimitCurrency = str4;
        this.leftAmountCurrency = str5;
        this.dayLimitWhiteUser = bool;
    }
}
