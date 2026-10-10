package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/KcsRightsBonusEntity;", "", "kcsLevel", "", "kcsBonusApr", "", "rateRatio", "incomeLimit", "incomeLimitCurrency", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKcsLevel", "()Ljava/lang/Integer;", "setKcsLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getKcsBonusApr", "()Ljava/lang/String;", "setKcsBonusApr", "(Ljava/lang/String;)V", "getRateRatio", "getIncomeLimit", "getIncomeLimitCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/KcsRightsBonusEntity;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KcsRightsBonusEntity {

    @Nullable
    private final String incomeLimit;

    @Nullable
    private final String incomeLimitCurrency;

    @Nullable
    private String kcsBonusApr;

    @Nullable
    private Integer kcsLevel;

    @Nullable
    private final String rateRatio;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KcsRightsBonusEntity)) {
            return false;
        }
        KcsRightsBonusEntity kcsRightsBonusEntity = (KcsRightsBonusEntity) other;
        return Intrinsics.areEqual(this.kcsLevel, kcsRightsBonusEntity.kcsLevel) && Intrinsics.areEqual(this.kcsBonusApr, kcsRightsBonusEntity.kcsBonusApr) && Intrinsics.areEqual(this.rateRatio, kcsRightsBonusEntity.rateRatio) && Intrinsics.areEqual(this.incomeLimit, kcsRightsBonusEntity.incomeLimit) && Intrinsics.areEqual(this.incomeLimitCurrency, kcsRightsBonusEntity.incomeLimitCurrency);
    }

    public static /* synthetic */ KcsRightsBonusEntity copy$default(KcsRightsBonusEntity kcsRightsBonusEntity, Integer num, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = kcsRightsBonusEntity.kcsLevel;
        }
        if ((i11 & 2) != 0) {
            str = kcsRightsBonusEntity.kcsBonusApr;
        }
        if ((i11 & 4) != 0) {
            str2 = kcsRightsBonusEntity.rateRatio;
        }
        if ((i11 & 8) != 0) {
            str3 = kcsRightsBonusEntity.incomeLimit;
        }
        if ((i11 & 16) != 0) {
            str4 = kcsRightsBonusEntity.incomeLimitCurrency;
        }
        String str5 = str4;
        String str6 = str2;
        return kcsRightsBonusEntity.copy(num, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getKcsLevel() {
        return this.kcsLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKcsBonusApr() {
        return this.kcsBonusApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRateRatio() {
        return this.rateRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIncomeLimit() {
        return this.incomeLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIncomeLimitCurrency() {
        return this.incomeLimitCurrency;
    }

    @NotNull
    public final KcsRightsBonusEntity copy(@Nullable Integer kcsLevel, @Nullable String kcsBonusApr, @Nullable String rateRatio, @Nullable String incomeLimit, @Nullable String incomeLimitCurrency) {
        return new KcsRightsBonusEntity(kcsLevel, kcsBonusApr, rateRatio, incomeLimit, incomeLimitCurrency);
    }

    @Nullable
    public final String getIncomeLimit() {
        return this.incomeLimit;
    }

    @Nullable
    public final String getIncomeLimitCurrency() {
        return this.incomeLimitCurrency;
    }

    @Nullable
    public final String getKcsBonusApr() {
        return this.kcsBonusApr;
    }

    @Nullable
    public final Integer getKcsLevel() {
        return this.kcsLevel;
    }

    @Nullable
    public final String getRateRatio() {
        return this.rateRatio;
    }

    public int hashCode() {
        Integer num = this.kcsLevel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.kcsBonusApr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rateRatio;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incomeLimit;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.incomeLimitCurrency;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setKcsBonusApr(@Nullable String str) {
        this.kcsBonusApr = str;
    }

    public final void setKcsLevel(@Nullable Integer num) {
        this.kcsLevel = num;
    }

    @NotNull
    public String toString() {
        return "KcsRightsBonusEntity(kcsLevel=" + this.kcsLevel + ", kcsBonusApr=" + this.kcsBonusApr + ", rateRatio=" + this.rateRatio + ", incomeLimit=" + this.incomeLimit + ", incomeLimitCurrency=" + this.incomeLimitCurrency + ')';
    }

    public KcsRightsBonusEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.kcsLevel = num;
        this.kcsBonusApr = str;
        this.rateRatio = str2;
        this.incomeLimit = str3;
        this.incomeLimitCurrency = str4;
    }
}
