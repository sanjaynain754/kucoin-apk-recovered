package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTrialDetailsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "realisedPNL", "Ljava/math/BigDecimal;", "trialFundBalance", "code", "status", "prizeType", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getRealisedPNL", "()Ljava/math/BigDecimal;", "getTrialFundBalance", "getCode", "getStatus", "getPrizeType", "setPrizeType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTrialDetailsEntity {

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private String prizeType;

    @Nullable
    private final BigDecimal realisedPNL;

    @Nullable
    private final String status;

    @Nullable
    private final BigDecimal trialFundBalance;

    public FuturesTrialDetailsEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTrialDetailsEntity)) {
            return false;
        }
        FuturesTrialDetailsEntity futuresTrialDetailsEntity = (FuturesTrialDetailsEntity) other;
        return Intrinsics.areEqual(this.currency, futuresTrialDetailsEntity.currency) && Intrinsics.areEqual(this.realisedPNL, futuresTrialDetailsEntity.realisedPNL) && Intrinsics.areEqual(this.trialFundBalance, futuresTrialDetailsEntity.trialFundBalance) && Intrinsics.areEqual(this.code, futuresTrialDetailsEntity.code) && Intrinsics.areEqual(this.status, futuresTrialDetailsEntity.status) && Intrinsics.areEqual(this.prizeType, futuresTrialDetailsEntity.prizeType);
    }

    public FuturesTrialDetailsEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.currency = str;
        this.realisedPNL = bigDecimal;
        this.trialFundBalance = bigDecimal2;
        this.code = str2;
        this.status = str3;
        this.prizeType = str4;
    }

    public static /* synthetic */ FuturesTrialDetailsEntity copy$default(FuturesTrialDetailsEntity futuresTrialDetailsEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresTrialDetailsEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = futuresTrialDetailsEntity.realisedPNL;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = futuresTrialDetailsEntity.trialFundBalance;
        }
        if ((i11 & 8) != 0) {
            str2 = futuresTrialDetailsEntity.code;
        }
        if ((i11 & 16) != 0) {
            str3 = futuresTrialDetailsEntity.status;
        }
        if ((i11 & 32) != 0) {
            str4 = futuresTrialDetailsEntity.prizeType;
        }
        String str5 = str3;
        String str6 = str4;
        return futuresTrialDetailsEntity.copy(str, bigDecimal, bigDecimal2, str2, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    public final FuturesTrialDetailsEntity copy(@Nullable String currency, @Nullable BigDecimal realisedPNL, @Nullable BigDecimal trialFundBalance, @Nullable String code, @Nullable String status, @Nullable String prizeType) {
        return new FuturesTrialDetailsEntity(currency, realisedPNL, trialFundBalance, code, status, prizeType);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.realisedPNL;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.trialFundBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.code;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prizeType;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    @NotNull
    public String toString() {
        return "FuturesTrialDetailsEntity(currency=" + this.currency + ", realisedPNL=" + this.realisedPNL + ", trialFundBalance=" + this.trialFundBalance + ", code=" + this.code + ", status=" + this.status + ", prizeType=" + this.prizeType + ')';
    }

    public /* synthetic */ FuturesTrialDetailsEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4);
    }
}
