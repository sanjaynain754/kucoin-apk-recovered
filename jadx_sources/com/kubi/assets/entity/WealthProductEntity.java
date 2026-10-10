package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/entity/WealthProductEntity;", "", "products", "", "Lcom/kubi/assets/entity/Product;", "subTitle", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getSubTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WealthProductEntity {

    @Nullable
    private final List<Product> products;

    @Nullable
    private final String subTitle;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WealthProductEntity)) {
            return false;
        }
        WealthProductEntity wealthProductEntity = (WealthProductEntity) other;
        return Intrinsics.areEqual(this.products, wealthProductEntity.products) && Intrinsics.areEqual(this.subTitle, wealthProductEntity.subTitle) && Intrinsics.areEqual(this.title, wealthProductEntity.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WealthProductEntity copy$default(WealthProductEntity wealthProductEntity, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wealthProductEntity.products;
        }
        if ((i11 & 2) != 0) {
            str = wealthProductEntity.subTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = wealthProductEntity.title;
        }
        return wealthProductEntity.copy(list, str, str2);
    }

    @Nullable
    public final List<Product> component1() {
        return this.products;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final WealthProductEntity copy(@Nullable List<Product> products, @Nullable String subTitle, @Nullable String title) {
        return new WealthProductEntity(products, subTitle, title);
    }

    @Nullable
    public final List<Product> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<Product> list = this.products;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.subTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WealthProductEntity(products=" + this.products + ", subTitle=" + this.subTitle + ", title=" + this.title + ')';
    }

    public WealthProductEntity(@Nullable List<Product> list, @Nullable String str, @Nullable String str2) {
        this.products = list;
        this.subTitle = str;
        this.title = str2;
    }
}
