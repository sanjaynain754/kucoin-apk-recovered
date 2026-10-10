package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AuUserCategoryVO.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;", "", "userType", "", "restrictCategory", "maxLeverage", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getUserType", "()Ljava/lang/String;", "getRestrictCategory", "getMaxLeverage", "()Ljava/math/BigDecimal;", "isRetail", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AuUserCategoryVO {

    @NotNull
    public static final String USER_TYPE_OTHER = "other";

    @NotNull
    public static final String USER_TYPE_RETAIL = "retail";

    @NotNull
    public static final String USER_TYPE_WHOLESALE = "wholesale";

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final String restrictCategory;

    @Nullable
    private final String userType;

    public AuUserCategoryVO() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuUserCategoryVO)) {
            return false;
        }
        AuUserCategoryVO auUserCategoryVO = (AuUserCategoryVO) other;
        return Intrinsics.areEqual(this.userType, auUserCategoryVO.userType) && Intrinsics.areEqual(this.restrictCategory, auUserCategoryVO.restrictCategory) && Intrinsics.areEqual(this.maxLeverage, auUserCategoryVO.maxLeverage);
    }

    public AuUserCategoryVO(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal) {
        this.userType = str;
        this.restrictCategory = str2;
        this.maxLeverage = bigDecimal;
    }

    public static /* synthetic */ AuUserCategoryVO copy$default(AuUserCategoryVO auUserCategoryVO, String str, String str2, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = auUserCategoryVO.userType;
        }
        if ((i11 & 2) != 0) {
            str2 = auUserCategoryVO.restrictCategory;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = auUserCategoryVO.maxLeverage;
        }
        return auUserCategoryVO.copy(str, str2, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRestrictCategory() {
        return this.restrictCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @NotNull
    public final AuUserCategoryVO copy(@Nullable String userType, @Nullable String restrictCategory, @Nullable BigDecimal maxLeverage) {
        return new AuUserCategoryVO(userType, restrictCategory, maxLeverage);
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getRestrictCategory() {
        return this.restrictCategory;
    }

    @Nullable
    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        String str = this.userType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.restrictCategory;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.maxLeverage;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public final boolean isRetail() {
        return Intrinsics.areEqual(this.userType, USER_TYPE_RETAIL);
    }

    @NotNull
    public String toString() {
        return "AuUserCategoryVO(userType=" + this.userType + ", restrictCategory=" + this.restrictCategory + ", maxLeverage=" + this.maxLeverage + ')';
    }

    public /* synthetic */ AuUserCategoryVO(String str, String str2, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal);
    }
}
