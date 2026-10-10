package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/entity/Product;", "", "detailUrl", "", "longDescription", "number", "productCategory", "productIconUrl", "shortDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailUrl", "()Ljava/lang/String;", "getLongDescription", "getNumber", "getProductCategory", "getProductIconUrl", "getShortDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Product {

    @Nullable
    private final String detailUrl;

    @Nullable
    private final String longDescription;

    @Nullable
    private final String number;

    @Nullable
    private final String productCategory;

    @Nullable
    private final String productIconUrl;

    @Nullable
    private final String shortDescription;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return Intrinsics.areEqual(this.detailUrl, product.detailUrl) && Intrinsics.areEqual(this.longDescription, product.longDescription) && Intrinsics.areEqual(this.number, product.number) && Intrinsics.areEqual(this.productCategory, product.productCategory) && Intrinsics.areEqual(this.productIconUrl, product.productIconUrl) && Intrinsics.areEqual(this.shortDescription, product.shortDescription);
    }

    public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = product.detailUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = product.longDescription;
        }
        if ((i11 & 4) != 0) {
            str3 = product.number;
        }
        if ((i11 & 8) != 0) {
            str4 = product.productCategory;
        }
        if ((i11 & 16) != 0) {
            str5 = product.productIconUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = product.shortDescription;
        }
        String str7 = str5;
        String str8 = str6;
        return product.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLongDescription() {
        return this.longDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductIconUrl() {
        return this.productIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    @NotNull
    public final Product copy(@Nullable String detailUrl, @Nullable String longDescription, @Nullable String number, @Nullable String productCategory, @Nullable String productIconUrl, @Nullable String shortDescription) {
        return new Product(detailUrl, longDescription, number, productCategory, productIconUrl, shortDescription);
    }

    @Nullable
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @Nullable
    public final String getLongDescription() {
        return this.longDescription;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    public final String getProductIconUrl() {
        return this.productIconUrl;
    }

    @Nullable
    public final String getShortDescription() {
        return this.shortDescription;
    }

    public int hashCode() {
        String str = this.detailUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.longDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.number;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productCategory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productIconUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shortDescription;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Product(detailUrl=" + this.detailUrl + ", longDescription=" + this.longDescription + ", number=" + this.number + ", productCategory=" + this.productCategory + ", productIconUrl=" + this.productIconUrl + ", shortDescription=" + this.shortDescription + ')';
    }

    public Product(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.detailUrl = str;
        this.longDescription = str2;
        this.number = str3;
        this.productCategory = str4;
        this.productIconUrl = str5;
        this.shortDescription = str6;
    }
}
