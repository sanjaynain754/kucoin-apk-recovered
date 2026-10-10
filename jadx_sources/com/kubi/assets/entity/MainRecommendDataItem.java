package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0001HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/entity/MainRecommendDataItem;", "", "category", "", FirebaseAnalytics.Param.CURRENCY, "jumpUrl", "productName", "remark", "status", "", "type", "", "yield", "yieldDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZILjava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCurrency", "getJumpUrl", "getProductName", "getRemark", "()Ljava/lang/Object;", "getStatus", "()Z", "getType", "()I", "getYield", "getYieldDesc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MainRecommendDataItem {

    @NotNull
    private final String category;

    @NotNull
    private final String currency;

    @NotNull
    private final String jumpUrl;

    @NotNull
    private final String productName;

    @NotNull
    private final Object remark;
    private final boolean status;
    private final int type;

    @NotNull
    private final String yield;

    @NotNull
    private final String yieldDesc;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainRecommendDataItem)) {
            return false;
        }
        MainRecommendDataItem mainRecommendDataItem = (MainRecommendDataItem) other;
        return Intrinsics.areEqual(this.category, mainRecommendDataItem.category) && Intrinsics.areEqual(this.currency, mainRecommendDataItem.currency) && Intrinsics.areEqual(this.jumpUrl, mainRecommendDataItem.jumpUrl) && Intrinsics.areEqual(this.productName, mainRecommendDataItem.productName) && Intrinsics.areEqual(this.remark, mainRecommendDataItem.remark) && this.status == mainRecommendDataItem.status && this.type == mainRecommendDataItem.type && Intrinsics.areEqual(this.yield, mainRecommendDataItem.yield) && Intrinsics.areEqual(this.yieldDesc, mainRecommendDataItem.yieldDesc);
    }

    public MainRecommendDataItem(@NotNull String category, @NotNull String currency, @NotNull String jumpUrl, @NotNull String productName, @NotNull Object remark, boolean z11, int i11, @NotNull String yield, @NotNull String yieldDesc) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(yield, "yield");
        Intrinsics.checkNotNullParameter(yieldDesc, "yieldDesc");
        this.category = category;
        this.currency = currency;
        this.jumpUrl = jumpUrl;
        this.productName = productName;
        this.remark = remark;
        this.status = z11;
        this.type = i11;
        this.yield = yield;
        this.yieldDesc = yieldDesc;
    }

    public static /* synthetic */ MainRecommendDataItem copy$default(MainRecommendDataItem mainRecommendDataItem, String str, String str2, String str3, String str4, Object obj, boolean z11, int i11, String str5, String str6, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = mainRecommendDataItem.category;
        }
        if ((i12 & 2) != 0) {
            str2 = mainRecommendDataItem.currency;
        }
        if ((i12 & 4) != 0) {
            str3 = mainRecommendDataItem.jumpUrl;
        }
        if ((i12 & 8) != 0) {
            str4 = mainRecommendDataItem.productName;
        }
        if ((i12 & 16) != 0) {
            obj = mainRecommendDataItem.remark;
        }
        if ((i12 & 32) != 0) {
            z11 = mainRecommendDataItem.status;
        }
        if ((i12 & 64) != 0) {
            i11 = mainRecommendDataItem.type;
        }
        if ((i12 & 128) != 0) {
            str5 = mainRecommendDataItem.yield;
        }
        if ((i12 & 256) != 0) {
            str6 = mainRecommendDataItem.yieldDesc;
        }
        String str7 = str5;
        String str8 = str6;
        boolean z12 = z11;
        int i13 = i11;
        Object obj3 = obj;
        String str9 = str3;
        return mainRecommendDataItem.copy(str, str2, str9, str4, obj3, z12, i13, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getYield() {
        return this.yield;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getYieldDesc() {
        return this.yieldDesc;
    }

    @NotNull
    public final MainRecommendDataItem copy(@NotNull String category, @NotNull String currency, @NotNull String jumpUrl, @NotNull String productName, @NotNull Object remark, boolean status, int type, @NotNull String yield, @NotNull String yieldDesc) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(yield, "yield");
        Intrinsics.checkNotNullParameter(yieldDesc, "yieldDesc");
        return new MainRecommendDataItem(category, currency, jumpUrl, productName, remark, status, type, yield, yieldDesc);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    public final Object getRemark() {
        return this.remark;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getYield() {
        return this.yield;
    }

    @NotNull
    public final String getYieldDesc() {
        return this.yieldDesc;
    }

    public int hashCode() {
        return (((((((((((((((this.category.hashCode() * 31) + this.currency.hashCode()) * 31) + this.jumpUrl.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.remark.hashCode()) * 31) + Boolean.hashCode(this.status)) * 31) + Integer.hashCode(this.type)) * 31) + this.yield.hashCode()) * 31) + this.yieldDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "MainRecommendDataItem(category=" + this.category + ", currency=" + this.currency + ", jumpUrl=" + this.jumpUrl + ", productName=" + this.productName + ", remark=" + this.remark + ", status=" + this.status + ", type=" + this.type + ", yield=" + this.yield + ", yieldDesc=" + this.yieldDesc + ')';
    }
}
