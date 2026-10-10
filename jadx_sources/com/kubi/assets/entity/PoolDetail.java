package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/entity/PoolDetail;", "", "lockAmount", "", "incomeReleaseAmount", "incomeCurrency", "totalReturn", "minReturn", "maxReturn", "lockEndTime", "name", "category", "categoryText", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLockAmount", "()Ljava/lang/String;", "getIncomeReleaseAmount", "getIncomeCurrency", "getTotalReturn", "getMinReturn", "getMaxReturn", "getLockEndTime", "getName", "getCategory", "getCategoryText", "getJumpUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PoolDetail {

    @Nullable
    private final String category;

    @Nullable
    private final String categoryText;

    @Nullable
    private final String incomeCurrency;

    @Nullable
    private final String incomeReleaseAmount;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String lockAmount;

    @Nullable
    private final String lockEndTime;

    @Nullable
    private final String maxReturn;

    @Nullable
    private final String minReturn;

    @Nullable
    private final String name;

    @Nullable
    private final String totalReturn;

    public PoolDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolDetail)) {
            return false;
        }
        PoolDetail poolDetail = (PoolDetail) other;
        return Intrinsics.areEqual(this.lockAmount, poolDetail.lockAmount) && Intrinsics.areEqual(this.incomeReleaseAmount, poolDetail.incomeReleaseAmount) && Intrinsics.areEqual(this.incomeCurrency, poolDetail.incomeCurrency) && Intrinsics.areEqual(this.totalReturn, poolDetail.totalReturn) && Intrinsics.areEqual(this.minReturn, poolDetail.minReturn) && Intrinsics.areEqual(this.maxReturn, poolDetail.maxReturn) && Intrinsics.areEqual(this.lockEndTime, poolDetail.lockEndTime) && Intrinsics.areEqual(this.name, poolDetail.name) && Intrinsics.areEqual(this.category, poolDetail.category) && Intrinsics.areEqual(this.categoryText, poolDetail.categoryText) && Intrinsics.areEqual(this.jumpUrl, poolDetail.jumpUrl);
    }

    public PoolDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.lockAmount = str;
        this.incomeReleaseAmount = str2;
        this.incomeCurrency = str3;
        this.totalReturn = str4;
        this.minReturn = str5;
        this.maxReturn = str6;
        this.lockEndTime = str7;
        this.name = str8;
        this.category = str9;
        this.categoryText = str10;
        this.jumpUrl = str11;
    }

    public static /* synthetic */ PoolDetail copy$default(PoolDetail poolDetail, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = poolDetail.lockAmount;
        }
        if ((i11 & 2) != 0) {
            str2 = poolDetail.incomeReleaseAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = poolDetail.incomeCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = poolDetail.totalReturn;
        }
        if ((i11 & 16) != 0) {
            str5 = poolDetail.minReturn;
        }
        if ((i11 & 32) != 0) {
            str6 = poolDetail.maxReturn;
        }
        if ((i11 & 64) != 0) {
            str7 = poolDetail.lockEndTime;
        }
        if ((i11 & 128) != 0) {
            str8 = poolDetail.name;
        }
        if ((i11 & 256) != 0) {
            str9 = poolDetail.category;
        }
        if ((i11 & 512) != 0) {
            str10 = poolDetail.categoryText;
        }
        if ((i11 & 1024) != 0) {
            str11 = poolDetail.jumpUrl;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return poolDetail.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinReturn() {
        return this.minReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final PoolDetail copy(@Nullable String lockAmount, @Nullable String incomeReleaseAmount, @Nullable String incomeCurrency, @Nullable String totalReturn, @Nullable String minReturn, @Nullable String maxReturn, @Nullable String lockEndTime, @Nullable String name, @Nullable String category, @Nullable String categoryText, @Nullable String jumpUrl) {
        return new PoolDetail(lockAmount, incomeReleaseAmount, incomeCurrency, totalReturn, minReturn, maxReturn, lockEndTime, name, category, categoryText, jumpUrl);
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final String getIncomeCurrency() {
        return this.incomeCurrency;
    }

    @Nullable
    public final String getIncomeReleaseAmount() {
        return this.incomeReleaseAmount;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    public final String getLockEndTime() {
        return this.lockEndTime;
    }

    @Nullable
    public final String getMaxReturn() {
        return this.maxReturn;
    }

    @Nullable
    public final String getMinReturn() {
        return this.minReturn;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    public int hashCode() {
        String str = this.lockAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.incomeReleaseAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incomeCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalReturn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minReturn;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxReturn;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lockEndTime;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.name;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.category;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.categoryText;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.jumpUrl;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PoolDetail(lockAmount=" + this.lockAmount + ", incomeReleaseAmount=" + this.incomeReleaseAmount + ", incomeCurrency=" + this.incomeCurrency + ", totalReturn=" + this.totalReturn + ", minReturn=" + this.minReturn + ", maxReturn=" + this.maxReturn + ", lockEndTime=" + this.lockEndTime + ", name=" + this.name + ", category=" + this.category + ", categoryText=" + this.categoryText + ", jumpUrl=" + this.jumpUrl + ')';
    }

    public /* synthetic */ PoolDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11);
    }
}
