package com.kubi.unify.api.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyHourlyRateEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyId", "", "rate", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyId", "()I", "getRate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyHourlyRateEntity {

    @NotNull
    private final String currency;
    private final int currencyId;

    @NotNull
    private final String rate;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyHourlyRateEntity)) {
            return false;
        }
        UnifyHourlyRateEntity unifyHourlyRateEntity = (UnifyHourlyRateEntity) other;
        return Intrinsics.areEqual(this.currency, unifyHourlyRateEntity.currency) && this.currencyId == unifyHourlyRateEntity.currencyId && Intrinsics.areEqual(this.rate, unifyHourlyRateEntity.rate);
    }

    public UnifyHourlyRateEntity(@NotNull String currency, int i11, @NotNull String rate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.currency = currency;
        this.currencyId = i11;
        this.rate = rate;
    }

    public static /* synthetic */ UnifyHourlyRateEntity copy$default(UnifyHourlyRateEntity unifyHourlyRateEntity, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = unifyHourlyRateEntity.currency;
        }
        if ((i12 & 2) != 0) {
            i11 = unifyHourlyRateEntity.currencyId;
        }
        if ((i12 & 4) != 0) {
            str2 = unifyHourlyRateEntity.rate;
        }
        return unifyHourlyRateEntity.copy(str, i11, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    @NotNull
    public final UnifyHourlyRateEntity copy(@NotNull String currency, int currencyId, @NotNull String rate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        return new UnifyHourlyRateEntity(currency, currencyId, rate);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int getCurrencyId() {
        return this.currencyId;
    }

    @NotNull
    public final String getRate() {
        return this.rate;
    }

    public int hashCode() {
        return (((this.currency.hashCode() * 31) + Integer.hashCode(this.currencyId)) * 31) + this.rate.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnifyHourlyRateEntity(currency=" + this.currency + ", currencyId=" + this.currencyId + ", rate=" + this.rate + ')';
    }
}
