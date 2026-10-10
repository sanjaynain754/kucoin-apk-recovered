package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/copytrading/assets/CopyTradingCopyAssetEntity;", "", "parentUserId", "", "totalAssets", "Ljava/math/BigDecimal;", "totalPnl", "unrealizedPnl", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getParentUserId", "()Ljava/lang/String;", "getTotalAssets", "()Ljava/math/BigDecimal;", "getTotalPnl", "getUnrealizedPnl", "getCurrency", "getNoNullCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingCopyAssetEntity {

    @Nullable
    private final String currency;

    @Nullable
    private final String parentUserId;

    @Nullable
    private final BigDecimal totalAssets;

    @Nullable
    private final BigDecimal totalPnl;

    @Nullable
    private final BigDecimal unrealizedPnl;

    public CopyTradingCopyAssetEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingCopyAssetEntity)) {
            return false;
        }
        CopyTradingCopyAssetEntity copyTradingCopyAssetEntity = (CopyTradingCopyAssetEntity) other;
        return Intrinsics.areEqual(this.parentUserId, copyTradingCopyAssetEntity.parentUserId) && Intrinsics.areEqual(this.totalAssets, copyTradingCopyAssetEntity.totalAssets) && Intrinsics.areEqual(this.totalPnl, copyTradingCopyAssetEntity.totalPnl) && Intrinsics.areEqual(this.unrealizedPnl, copyTradingCopyAssetEntity.unrealizedPnl) && Intrinsics.areEqual(this.currency, copyTradingCopyAssetEntity.currency);
    }

    public CopyTradingCopyAssetEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str2) {
        this.parentUserId = str;
        this.totalAssets = bigDecimal;
        this.totalPnl = bigDecimal2;
        this.unrealizedPnl = bigDecimal3;
        this.currency = str2;
    }

    public static /* synthetic */ CopyTradingCopyAssetEntity copy$default(CopyTradingCopyAssetEntity copyTradingCopyAssetEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyTradingCopyAssetEntity.parentUserId;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = copyTradingCopyAssetEntity.totalAssets;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = copyTradingCopyAssetEntity.totalPnl;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = copyTradingCopyAssetEntity.unrealizedPnl;
        }
        if ((i11 & 16) != 0) {
            str2 = copyTradingCopyAssetEntity.currency;
        }
        String str3 = str2;
        BigDecimal bigDecimal4 = bigDecimal2;
        return copyTradingCopyAssetEntity.copy(str, bigDecimal, bigDecimal4, bigDecimal3, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParentUserId() {
        return this.parentUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final CopyTradingCopyAssetEntity copy(@Nullable String parentUserId, @Nullable BigDecimal totalAssets, @Nullable BigDecimal totalPnl, @Nullable BigDecimal unrealizedPnl, @Nullable String currency) {
        return new CopyTradingCopyAssetEntity(parentUserId, totalAssets, totalPnl, unrealizedPnl, currency);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getNoNullCurrency() {
        return C11449b.m20668b(this.currency);
    }

    @Nullable
    public final String getParentUserId() {
        return this.parentUserId;
    }

    @Nullable
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    @Nullable
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    public final BigDecimal getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    public int hashCode() {
        String str = this.parentUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.totalAssets;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalPnl;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.unrealizedPnl;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.currency;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingCopyAssetEntity(parentUserId=" + this.parentUserId + ", totalAssets=" + this.totalAssets + ", totalPnl=" + this.totalPnl + ", unrealizedPnl=" + this.unrealizedPnl + ", currency=" + this.currency + ')';
    }

    public /* synthetic */ CopyTradingCopyAssetEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : str2);
    }
}
