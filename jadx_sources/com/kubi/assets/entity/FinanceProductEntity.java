package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003Ju\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010 \"\u0004\b!\u0010\"¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceProductEntity;", "", "categoryGroup", "", "categoryGroupText", "list", "", "Lcom/kubi/assets/entity/ProductChildEntity;", "maxApr", "minApr", "totalAmount", "Ljava/math/BigDecimal;", "totalPrice", "isShowCategory", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZZ)V", "getCategoryGroup", "()Ljava/lang/String;", "getCategoryGroupText", "getList", "()Ljava/util/List;", "getMaxApr", "getMinApr", "getTotalAmount", "()Ljava/math/BigDecimal;", "setTotalAmount", "(Ljava/math/BigDecimal;)V", "getTotalPrice", "setTotalPrice", "(Ljava/lang/String;)V", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FinanceProductEntity {

    @Nullable
    private final String categoryGroup;

    @Nullable
    private final String categoryGroupText;
    private boolean isExpanded;
    private final boolean isShowCategory;

    @Nullable
    private final List<ProductChildEntity> list;

    @Nullable
    private final String maxApr;

    @Nullable
    private final String minApr;

    @NotNull
    private BigDecimal totalAmount;

    @NotNull
    private String totalPrice;

    public FinanceProductEntity(@Nullable String str, @Nullable String str2, @Nullable List<ProductChildEntity> list, @Nullable String str3, @Nullable String str4, @NotNull BigDecimal totalAmount, @NotNull String totalPrice, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        this.categoryGroup = str;
        this.categoryGroupText = str2;
        this.list = list;
        this.maxApr = str3;
        this.minApr = str4;
        this.totalAmount = totalAmount;
        this.totalPrice = totalPrice;
        this.isShowCategory = z11;
        this.isExpanded = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceProductEntity)) {
            return false;
        }
        FinanceProductEntity financeProductEntity = (FinanceProductEntity) other;
        return Intrinsics.areEqual(this.categoryGroup, financeProductEntity.categoryGroup) && Intrinsics.areEqual(this.categoryGroupText, financeProductEntity.categoryGroupText) && Intrinsics.areEqual(this.list, financeProductEntity.list) && Intrinsics.areEqual(this.maxApr, financeProductEntity.maxApr) && Intrinsics.areEqual(this.minApr, financeProductEntity.minApr) && Intrinsics.areEqual(this.totalAmount, financeProductEntity.totalAmount) && Intrinsics.areEqual(this.totalPrice, financeProductEntity.totalPrice) && this.isShowCategory == financeProductEntity.isShowCategory && this.isExpanded == financeProductEntity.isExpanded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceProductEntity copy$default(FinanceProductEntity financeProductEntity, String str, String str2, List list, String str3, String str4, BigDecimal bigDecimal, String str5, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financeProductEntity.categoryGroup;
        }
        if ((i11 & 2) != 0) {
            str2 = financeProductEntity.categoryGroupText;
        }
        if ((i11 & 4) != 0) {
            list = financeProductEntity.list;
        }
        if ((i11 & 8) != 0) {
            str3 = financeProductEntity.maxApr;
        }
        if ((i11 & 16) != 0) {
            str4 = financeProductEntity.minApr;
        }
        if ((i11 & 32) != 0) {
            bigDecimal = financeProductEntity.totalAmount;
        }
        if ((i11 & 64) != 0) {
            str5 = financeProductEntity.totalPrice;
        }
        if ((i11 & 128) != 0) {
            z11 = financeProductEntity.isShowCategory;
        }
        if ((i11 & 256) != 0) {
            z12 = financeProductEntity.isExpanded;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        BigDecimal bigDecimal2 = bigDecimal;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return financeProductEntity.copy(str, str2, list2, str3, str7, bigDecimal2, str6, z13, z14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategoryGroup() {
        return this.categoryGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryGroupText() {
        return this.categoryGroupText;
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

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsShowCategory() {
        return this.isShowCategory;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public final FinanceProductEntity copy(@Nullable String categoryGroup, @Nullable String categoryGroupText, @Nullable List<ProductChildEntity> list, @Nullable String maxApr, @Nullable String minApr, @NotNull BigDecimal totalAmount, @NotNull String totalPrice, boolean isShowCategory, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        return new FinanceProductEntity(categoryGroup, categoryGroupText, list, maxApr, minApr, totalAmount, totalPrice, isShowCategory, isExpanded);
    }

    @Nullable
    public final String getCategoryGroup() {
        return this.categoryGroup;
    }

    @Nullable
    public final String getCategoryGroupText() {
        return this.categoryGroupText;
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

    @NotNull
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        String str = this.categoryGroup;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryGroupText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProductChildEntity> list = this.list;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.maxApr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minApr;
        return ((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.totalAmount.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + Boolean.hashCode(this.isShowCategory)) * 31) + Boolean.hashCode(this.isExpanded);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isShowCategory() {
        return this.isShowCategory;
    }

    public final void setExpanded(boolean z11) {
        this.isExpanded = z11;
    }

    public final void setTotalAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.totalAmount = bigDecimal;
    }

    public final void setTotalPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalPrice = str;
    }

    @NotNull
    public String toString() {
        return "FinanceProductEntity(categoryGroup=" + this.categoryGroup + ", categoryGroupText=" + this.categoryGroupText + ", list=" + this.list + ", maxApr=" + this.maxApr + ", minApr=" + this.minApr + ", totalAmount=" + this.totalAmount + ", totalPrice=" + this.totalPrice + ", isShowCategory=" + this.isShowCategory + ", isExpanded=" + this.isExpanded + ')';
    }

    public /* synthetic */ FinanceProductEntity(String str, String str2, List list, String str3, String str4, BigDecimal bigDecimal, String str5, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, str4, bigDecimal, str5, z11, (i11 & 256) != 0 ? false : z12);
    }
}
