package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceCoinEntity;", "", "holdingAmount", "", "investCurrency", "list", "", "Lcom/kubi/assets/entity/ProductChildEntity;", "maxApr", "minApr", "isExpanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getHoldingAmount", "()Ljava/lang/String;", "getInvestCurrency", "getList", "()Ljava/util/List;", "getMaxApr", "getMinApr", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FinanceCoinEntity {

    @Nullable
    private final String holdingAmount;

    @Nullable
    private final String investCurrency;
    private boolean isExpanded;

    @Nullable
    private final List<ProductChildEntity> list;

    @Nullable
    private final String maxApr;

    @Nullable
    private final String minApr;

    public FinanceCoinEntity(@Nullable String str, @Nullable String str2, @Nullable List<ProductChildEntity> list, @Nullable String str3, @Nullable String str4, boolean z11) {
        this.holdingAmount = str;
        this.investCurrency = str2;
        this.list = list;
        this.maxApr = str3;
        this.minApr = str4;
        this.isExpanded = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceCoinEntity)) {
            return false;
        }
        FinanceCoinEntity financeCoinEntity = (FinanceCoinEntity) other;
        return Intrinsics.areEqual(this.holdingAmount, financeCoinEntity.holdingAmount) && Intrinsics.areEqual(this.investCurrency, financeCoinEntity.investCurrency) && Intrinsics.areEqual(this.list, financeCoinEntity.list) && Intrinsics.areEqual(this.maxApr, financeCoinEntity.maxApr) && Intrinsics.areEqual(this.minApr, financeCoinEntity.minApr) && this.isExpanded == financeCoinEntity.isExpanded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceCoinEntity copy$default(FinanceCoinEntity financeCoinEntity, String str, String str2, List list, String str3, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financeCoinEntity.holdingAmount;
        }
        if ((i11 & 2) != 0) {
            str2 = financeCoinEntity.investCurrency;
        }
        if ((i11 & 4) != 0) {
            list = financeCoinEntity.list;
        }
        if ((i11 & 8) != 0) {
            str3 = financeCoinEntity.maxApr;
        }
        if ((i11 & 16) != 0) {
            str4 = financeCoinEntity.minApr;
        }
        if ((i11 & 32) != 0) {
            z11 = financeCoinEntity.isExpanded;
        }
        String str5 = str4;
        boolean z12 = z11;
        return financeCoinEntity.copy(str, str2, list, str3, str5, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHoldingAmount() {
        return this.holdingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInvestCurrency() {
        return this.investCurrency;
    }

    @Nullable
    public final List<ProductChildEntity> component3() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxApr() {
        return this.maxApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinApr() {
        return this.minApr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public final FinanceCoinEntity copy(@Nullable String holdingAmount, @Nullable String investCurrency, @Nullable List<ProductChildEntity> list, @Nullable String maxApr, @Nullable String minApr, boolean isExpanded) {
        return new FinanceCoinEntity(holdingAmount, investCurrency, list, maxApr, minApr, isExpanded);
    }

    @Nullable
    public final String getHoldingAmount() {
        return this.holdingAmount;
    }

    @Nullable
    public final String getInvestCurrency() {
        return this.investCurrency;
    }

    @Nullable
    public final List<ProductChildEntity> getList() {
        return this.list;
    }

    @Nullable
    public final String getMaxApr() {
        return this.maxApr;
    }

    @Nullable
    public final String getMinApr() {
        return this.minApr;
    }

    public int hashCode() {
        String str = this.holdingAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.investCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProductChildEntity> list = this.list;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.maxApr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minApr;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpanded);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z11) {
        this.isExpanded = z11;
    }

    @NotNull
    public String toString() {
        return "FinanceCoinEntity(holdingAmount=" + this.holdingAmount + ", investCurrency=" + this.investCurrency + ", list=" + this.list + ", maxApr=" + this.maxApr + ", minApr=" + this.minApr + ", isExpanded=" + this.isExpanded + ')';
    }

    public /* synthetic */ FinanceCoinEntity(String str, String str2, List list, String str3, String str4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, str4, (i11 & 32) != 0 ? false : z11);
    }
}
