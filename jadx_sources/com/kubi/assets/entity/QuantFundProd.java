package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0093\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020 HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/entity/QuantFundProd;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", FirebaseAnalytics.Param.CURRENCY, "", "lockPeriod", "navList", "", "Lcom/kubi/assets/entity/NavItem;", "productId", "productName", "profitRate", "soldStatus", "strategyType", "weight", "jumpUrl", "categoryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getLockPeriod", "getNavList", "()Ljava/util/List;", "getProductId", "getProductName", "getProfitRate", "getSoldStatus", "getStrategyType", "getWeight", "getJumpUrl", "getCategoryText", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QuantFundProd implements MultiItemEntity {

    @Nullable
    private final String categoryText;

    @Nullable
    private final String currency;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String lockPeriod;

    @Nullable
    private final List<NavItem> navList;

    @Nullable
    private final String productId;

    @Nullable
    private final String productName;

    @Nullable
    private final String profitRate;

    @Nullable
    private final String soldStatus;

    @Nullable
    private final String strategyType;

    @Nullable
    private final String weight;

    public QuantFundProd() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantFundProd)) {
            return false;
        }
        QuantFundProd quantFundProd = (QuantFundProd) other;
        return Intrinsics.areEqual(this.currency, quantFundProd.currency) && Intrinsics.areEqual(this.lockPeriod, quantFundProd.lockPeriod) && Intrinsics.areEqual(this.navList, quantFundProd.navList) && Intrinsics.areEqual(this.productId, quantFundProd.productId) && Intrinsics.areEqual(this.productName, quantFundProd.productName) && Intrinsics.areEqual(this.profitRate, quantFundProd.profitRate) && Intrinsics.areEqual(this.soldStatus, quantFundProd.soldStatus) && Intrinsics.areEqual(this.strategyType, quantFundProd.strategyType) && Intrinsics.areEqual(this.weight, quantFundProd.weight) && Intrinsics.areEqual(this.jumpUrl, quantFundProd.jumpUrl) && Intrinsics.areEqual(this.categoryText, quantFundProd.categoryText);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 2;
    }

    public QuantFundProd(@Nullable String str, @Nullable String str2, @Nullable List<NavItem> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.currency = str;
        this.lockPeriod = str2;
        this.navList = list;
        this.productId = str3;
        this.productName = str4;
        this.profitRate = str5;
        this.soldStatus = str6;
        this.strategyType = str7;
        this.weight = str8;
        this.jumpUrl = str9;
        this.categoryText = str10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuantFundProd copy$default(QuantFundProd quantFundProd, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = quantFundProd.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = quantFundProd.lockPeriod;
        }
        if ((i11 & 4) != 0) {
            list = quantFundProd.navList;
        }
        if ((i11 & 8) != 0) {
            str3 = quantFundProd.productId;
        }
        if ((i11 & 16) != 0) {
            str4 = quantFundProd.productName;
        }
        if ((i11 & 32) != 0) {
            str5 = quantFundProd.profitRate;
        }
        if ((i11 & 64) != 0) {
            str6 = quantFundProd.soldStatus;
        }
        if ((i11 & 128) != 0) {
            str7 = quantFundProd.strategyType;
        }
        if ((i11 & 256) != 0) {
            str8 = quantFundProd.weight;
        }
        if ((i11 & 512) != 0) {
            str9 = quantFundProd.jumpUrl;
        }
        if ((i11 & 1024) != 0) {
            str10 = quantFundProd.categoryText;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        List list2 = list;
        return quantFundProd.copy(str, str2, list2, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLockPeriod() {
        return this.lockPeriod;
    }

    @Nullable
    public final List<NavItem> component3() {
        return this.navList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSoldStatus() {
        return this.soldStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStrategyType() {
        return this.strategyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    public final QuantFundProd copy(@Nullable String currency, @Nullable String lockPeriod, @Nullable List<NavItem> navList, @Nullable String productId, @Nullable String productName, @Nullable String profitRate, @Nullable String soldStatus, @Nullable String strategyType, @Nullable String weight, @Nullable String jumpUrl, @Nullable String categoryText) {
        return new QuantFundProd(currency, lockPeriod, navList, productId, productName, profitRate, soldStatus, strategyType, weight, jumpUrl, categoryText);
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getLockPeriod() {
        return this.lockPeriod;
    }

    @Nullable
    public final List<NavItem> getNavList() {
        return this.navList;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    public final String getSoldStatus() {
        return this.soldStatus;
    }

    @Nullable
    public final String getStrategyType() {
        return this.strategyType;
    }

    @Nullable
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lockPeriod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NavItem> list = this.navList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profitRate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.soldStatus;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.strategyType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.weight;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.jumpUrl;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.categoryText;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QuantFundProd(currency=" + this.currency + ", lockPeriod=" + this.lockPeriod + ", navList=" + this.navList + ", productId=" + this.productId + ", productName=" + this.productName + ", profitRate=" + this.profitRate + ", soldStatus=" + this.soldStatus + ", strategyType=" + this.strategyType + ", weight=" + this.weight + ", jumpUrl=" + this.jumpUrl + ", categoryText=" + this.categoryText + ')';
    }

    public /* synthetic */ QuantFundProd(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10);
    }
}
