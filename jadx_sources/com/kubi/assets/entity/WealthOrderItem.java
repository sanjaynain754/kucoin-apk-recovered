package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u00100\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J÷\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0011HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b¨\u0006L"}, m90084d2 = {"Lcom/kubi/assets/entity/WealthOrderItem;", "", "amount", "", "apr", FirebaseAnalytics.Param.CURRENCY, "estReturn", "estReturnCurrency", "estValue", "estValueCurrency", "frontDisplayStatus", "orderDetailUrl", "orderID", "productCategory", "productIconUrl", "status", "subscriptionDate", "", "titlePricing", "titleTotalAmount", "titleTotalReturn", "estValueDisplay", "estReturnDisplay", "pricing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getApr", "getCurrency", "getEstReturn", "getEstReturnCurrency", "getEstValue", "getEstValueCurrency", "getFrontDisplayStatus", "getOrderDetailUrl", "getOrderID", "getProductCategory", "getProductIconUrl", "getStatus", "getSubscriptionDate", "()I", "getTitlePricing", "getTitleTotalAmount", "getTitleTotalReturn", "getEstValueDisplay", "getEstReturnDisplay", "getPricing", "getLockAmountPriceStr", "getIncomeReleasePriceStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WealthOrderItem {

    @Nullable
    private final String amount;

    @Nullable
    private final String apr;

    @Nullable
    private final String currency;

    @Nullable
    private final String estReturn;

    @Nullable
    private final String estReturnCurrency;

    @Nullable
    private final String estReturnDisplay;

    @Nullable
    private final String estValue;

    @Nullable
    private final String estValueCurrency;

    @Nullable
    private final String estValueDisplay;

    @Nullable
    private final String frontDisplayStatus;

    @Nullable
    private final String orderDetailUrl;

    @Nullable
    private final String orderID;

    @Nullable
    private final String pricing;

    @Nullable
    private final String productCategory;

    @Nullable
    private final String productIconUrl;

    @Nullable
    private final String status;
    private final int subscriptionDate;

    @Nullable
    private final String titlePricing;

    @Nullable
    private final String titleTotalAmount;

    @Nullable
    private final String titleTotalReturn;

    public static /* synthetic */ WealthOrderItem copy$default(WealthOrderItem wealthOrderItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, String str14, String str15, String str16, String str17, String str18, String str19, int i12, Object obj) {
        String str20;
        String str21;
        String str22 = (i12 & 1) != 0 ? wealthOrderItem.amount : str;
        String str23 = (i12 & 2) != 0 ? wealthOrderItem.apr : str2;
        String str24 = (i12 & 4) != 0 ? wealthOrderItem.currency : str3;
        String str25 = (i12 & 8) != 0 ? wealthOrderItem.estReturn : str4;
        String str26 = (i12 & 16) != 0 ? wealthOrderItem.estReturnCurrency : str5;
        String str27 = (i12 & 32) != 0 ? wealthOrderItem.estValue : str6;
        String str28 = (i12 & 64) != 0 ? wealthOrderItem.estValueCurrency : str7;
        String str29 = (i12 & 128) != 0 ? wealthOrderItem.frontDisplayStatus : str8;
        String str30 = (i12 & 256) != 0 ? wealthOrderItem.orderDetailUrl : str9;
        String str31 = (i12 & 512) != 0 ? wealthOrderItem.orderID : str10;
        String str32 = (i12 & 1024) != 0 ? wealthOrderItem.productCategory : str11;
        String str33 = (i12 & 2048) != 0 ? wealthOrderItem.productIconUrl : str12;
        String str34 = (i12 & 4096) != 0 ? wealthOrderItem.status : str13;
        int i13 = (i12 & 8192) != 0 ? wealthOrderItem.subscriptionDate : i11;
        String str35 = str22;
        String str36 = (i12 & 16384) != 0 ? wealthOrderItem.titlePricing : str14;
        String str37 = (i12 & 32768) != 0 ? wealthOrderItem.titleTotalAmount : str15;
        String str38 = (i12 & 65536) != 0 ? wealthOrderItem.titleTotalReturn : str16;
        String str39 = (i12 & 131072) != 0 ? wealthOrderItem.estValueDisplay : str17;
        String str40 = (i12 & 262144) != 0 ? wealthOrderItem.estReturnDisplay : str18;
        if ((i12 & 524288) != 0) {
            str21 = str40;
            str20 = wealthOrderItem.pricing;
        } else {
            str20 = str19;
            str21 = str40;
        }
        return wealthOrderItem.copy(str35, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, i13, str36, str37, str38, str39, str21, str20);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WealthOrderItem)) {
            return false;
        }
        WealthOrderItem wealthOrderItem = (WealthOrderItem) other;
        return Intrinsics.areEqual(this.amount, wealthOrderItem.amount) && Intrinsics.areEqual(this.apr, wealthOrderItem.apr) && Intrinsics.areEqual(this.currency, wealthOrderItem.currency) && Intrinsics.areEqual(this.estReturn, wealthOrderItem.estReturn) && Intrinsics.areEqual(this.estReturnCurrency, wealthOrderItem.estReturnCurrency) && Intrinsics.areEqual(this.estValue, wealthOrderItem.estValue) && Intrinsics.areEqual(this.estValueCurrency, wealthOrderItem.estValueCurrency) && Intrinsics.areEqual(this.frontDisplayStatus, wealthOrderItem.frontDisplayStatus) && Intrinsics.areEqual(this.orderDetailUrl, wealthOrderItem.orderDetailUrl) && Intrinsics.areEqual(this.orderID, wealthOrderItem.orderID) && Intrinsics.areEqual(this.productCategory, wealthOrderItem.productCategory) && Intrinsics.areEqual(this.productIconUrl, wealthOrderItem.productIconUrl) && Intrinsics.areEqual(this.status, wealthOrderItem.status) && this.subscriptionDate == wealthOrderItem.subscriptionDate && Intrinsics.areEqual(this.titlePricing, wealthOrderItem.titlePricing) && Intrinsics.areEqual(this.titleTotalAmount, wealthOrderItem.titleTotalAmount) && Intrinsics.areEqual(this.titleTotalReturn, wealthOrderItem.titleTotalReturn) && Intrinsics.areEqual(this.estValueDisplay, wealthOrderItem.estValueDisplay) && Intrinsics.areEqual(this.estReturnDisplay, wealthOrderItem.estReturnDisplay) && Intrinsics.areEqual(this.pricing, wealthOrderItem.pricing);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOrderID() {
        return this.orderID;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getProductIconUrl() {
        return this.productIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSubscriptionDate() {
        return this.subscriptionDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTitlePricing() {
        return this.titlePricing;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTitleTotalAmount() {
        return this.titleTotalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTitleTotalReturn() {
        return this.titleTotalReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getEstValueDisplay() {
        return this.estValueDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getEstReturnDisplay() {
        return this.estReturnDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPricing() {
        return this.pricing;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEstReturn() {
        return this.estReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEstReturnCurrency() {
        return this.estReturnCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEstValue() {
        return this.estValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEstValueCurrency() {
        return this.estValueCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFrontDisplayStatus() {
        return this.frontDisplayStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrderDetailUrl() {
        return this.orderDetailUrl;
    }

    @NotNull
    public final WealthOrderItem copy(@Nullable String amount, @Nullable String apr, @Nullable String currency, @Nullable String estReturn, @Nullable String estReturnCurrency, @Nullable String estValue, @Nullable String estValueCurrency, @Nullable String frontDisplayStatus, @Nullable String orderDetailUrl, @Nullable String orderID, @Nullable String productCategory, @Nullable String productIconUrl, @Nullable String status, int subscriptionDate, @Nullable String titlePricing, @Nullable String titleTotalAmount, @Nullable String titleTotalReturn, @Nullable String estValueDisplay, @Nullable String estReturnDisplay, @Nullable String pricing) {
        return new WealthOrderItem(amount, apr, currency, estReturn, estReturnCurrency, estValue, estValueCurrency, frontDisplayStatus, orderDetailUrl, orderID, productCategory, productIconUrl, status, subscriptionDate, titlePricing, titleTotalAmount, titleTotalReturn, estValueDisplay, estReturnDisplay, pricing);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getApr() {
        return this.apr;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getEstReturn() {
        return this.estReturn;
    }

    @Nullable
    public final String getEstReturnCurrency() {
        return this.estReturnCurrency;
    }

    @Nullable
    public final String getEstReturnDisplay() {
        return this.estReturnDisplay;
    }

    @Nullable
    public final String getEstValue() {
        return this.estValue;
    }

    @Nullable
    public final String getEstValueCurrency() {
        return this.estValueCurrency;
    }

    @Nullable
    public final String getEstValueDisplay() {
        return this.estValueDisplay;
    }

    @Nullable
    public final String getFrontDisplayStatus() {
        return this.frontDisplayStatus;
    }

    @NotNull
    public final String getIncomeReleasePriceStr() {
        String str = this.estReturn;
        return C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(str != null ? DowngradeExKt.m66536f(str) : null), this.estReturnCurrency), null, null, 0, false, false, false, true, 63, null), "--");
    }

    @NotNull
    public final String getLockAmountPriceStr() {
        String str = this.estValue;
        return C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(str != null ? DowngradeExKt.m66536f(str) : null), this.estValueCurrency), null, null, 0, false, false, false, true, 63, null), "--");
    }

    @Nullable
    public final String getOrderDetailUrl() {
        return this.orderDetailUrl;
    }

    @Nullable
    public final String getOrderID() {
        return this.orderID;
    }

    @Nullable
    public final String getPricing() {
        return this.pricing;
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
    public final String getStatus() {
        return this.status;
    }

    public final int getSubscriptionDate() {
        return this.subscriptionDate;
    }

    @Nullable
    public final String getTitlePricing() {
        return this.titlePricing;
    }

    @Nullable
    public final String getTitleTotalAmount() {
        return this.titleTotalAmount;
    }

    @Nullable
    public final String getTitleTotalReturn() {
        return this.titleTotalReturn;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.apr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.estReturn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.estReturnCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.estValue;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.estValueCurrency;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.frontDisplayStatus;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.orderDetailUrl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.orderID;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.productCategory;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productIconUrl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.status;
        int iHashCode13 = (((iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.subscriptionDate)) * 31;
        String str14 = this.titlePricing;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.titleTotalAmount;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.titleTotalReturn;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.estValueDisplay;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.estReturnDisplay;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pricing;
        return iHashCode18 + (str19 != null ? str19.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WealthOrderItem(amount=" + this.amount + ", apr=" + this.apr + ", currency=" + this.currency + ", estReturn=" + this.estReturn + ", estReturnCurrency=" + this.estReturnCurrency + ", estValue=" + this.estValue + ", estValueCurrency=" + this.estValueCurrency + ", frontDisplayStatus=" + this.frontDisplayStatus + ", orderDetailUrl=" + this.orderDetailUrl + ", orderID=" + this.orderID + ", productCategory=" + this.productCategory + ", productIconUrl=" + this.productIconUrl + ", status=" + this.status + ", subscriptionDate=" + this.subscriptionDate + ", titlePricing=" + this.titlePricing + ", titleTotalAmount=" + this.titleTotalAmount + ", titleTotalReturn=" + this.titleTotalReturn + ", estValueDisplay=" + this.estValueDisplay + ", estReturnDisplay=" + this.estReturnDisplay + ", pricing=" + this.pricing + ')';
    }

    public WealthOrderItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, int i11, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
        this.amount = str;
        this.apr = str2;
        this.currency = str3;
        this.estReturn = str4;
        this.estReturnCurrency = str5;
        this.estValue = str6;
        this.estValueCurrency = str7;
        this.frontDisplayStatus = str8;
        this.orderDetailUrl = str9;
        this.orderID = str10;
        this.productCategory = str11;
        this.productIconUrl = str12;
        this.status = str13;
        this.subscriptionDate = i11;
        this.titlePricing = str14;
        this.titleTotalAmount = str15;
        this.titleTotalReturn = str16;
        this.estValueDisplay = str17;
        this.estReturnDisplay = str18;
        this.pricing = str19;
    }
}
