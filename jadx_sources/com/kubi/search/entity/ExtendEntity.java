package com.kubi.search.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.search.utils.EarnProductCategory;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchRecommendEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\f\u0010>\u001a\u00020\u0005*\u00020?H\u0002J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010R\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0016HÆ\u0003J \u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00162\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\t\u0010\\\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0017\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006]"}, m90084d2 = {"Lcom/kubi/search/entity/ExtendEntity;", "", TypedValues.TransitionType.S_DURATION, "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "jumpUrl", "maxPrt", "minPrt", "name", "productCategory", "productCategoryItemStr", "productCategoryStr", "prt", "chainIcon", "chainName", "fullName", FirebaseAnalytics.Param.PRICE, "priceChangePercent24H", InterfaceC33826o0.f71244p, "aveChainName", "supportFavorite", "", "isSupportDeposit", "depositUrl", "otcUrl", "tokenBridgeId", "favoritePersonal", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIcon", "()Ljava/lang/String;", "getJumpUrl", "getMaxPrt", "getMinPrt", "getName", "getProductCategory", "getProductCategoryItemStr", "getProductCategoryStr", "getPrt", "getChainIcon", "getChainName", "getFullName", "getPrice", "getPriceChangePercent24H", "getToken", "getAveChainName", "getSupportFavorite", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDepositUrl", "getOtcUrl", "getTokenBridgeId", "getFavoritePersonal", "()Z", "setFavoritePersonal", "(Z)V", "showName", "formatPrtStr", "percentStr", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/search/entity/ExtendEntity;", "equals", "other", "hashCode", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchRecommendEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRecommendEntity.kt\ncom/kubi/search/entity/ExtendEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final /* data */ class ExtendEntity {

    @Nullable
    private final String aveChainName;

    @Nullable
    private final String chainIcon;

    @Nullable
    private final String chainName;

    @Nullable
    private final String depositUrl;

    @Nullable
    private final Integer duration;
    private boolean favoritePersonal;

    @Nullable
    private final String fullName;

    @Nullable
    private final String icon;

    @Nullable
    private final Boolean isSupportDeposit;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String maxPrt;

    @Nullable
    private final String minPrt;

    @Nullable
    private final String name;

    @Nullable
    private final String otcUrl;

    @Nullable
    private final String price;

    @Nullable
    private final String priceChangePercent24H;

    @Nullable
    private final String productCategory;

    @Nullable
    private final String productCategoryItemStr;

    @Nullable
    private final String productCategoryStr;

    @Nullable
    private final String prt;

    @Nullable
    private final Boolean supportFavorite;

    @Nullable
    private final String token;

    @Nullable
    private final String tokenBridgeId;

    public ExtendEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str17, @Nullable String str18, @Nullable String str19, boolean z11) {
        this.duration = num;
        this.icon = str;
        this.jumpUrl = str2;
        this.maxPrt = str3;
        this.minPrt = str4;
        this.name = str5;
        this.productCategory = str6;
        this.productCategoryItemStr = str7;
        this.productCategoryStr = str8;
        this.prt = str9;
        this.chainIcon = str10;
        this.chainName = str11;
        this.fullName = str12;
        this.price = str13;
        this.priceChangePercent24H = str14;
        this.token = str15;
        this.aveChainName = str16;
        this.supportFavorite = bool;
        this.isSupportDeposit = bool2;
        this.depositUrl = str17;
        this.otcUrl = str18;
        this.tokenBridgeId = str19;
        this.favoritePersonal = z11;
    }

    public static /* synthetic */ ExtendEntity copy$default(ExtendEntity extendEntity, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, Boolean bool2, String str17, String str18, String str19, boolean z11, int i11, Object obj) {
        boolean z12;
        String str20;
        Integer num2 = (i11 & 1) != 0 ? extendEntity.duration : num;
        String str21 = (i11 & 2) != 0 ? extendEntity.icon : str;
        String str22 = (i11 & 4) != 0 ? extendEntity.jumpUrl : str2;
        String str23 = (i11 & 8) != 0 ? extendEntity.maxPrt : str3;
        String str24 = (i11 & 16) != 0 ? extendEntity.minPrt : str4;
        String str25 = (i11 & 32) != 0 ? extendEntity.name : str5;
        String str26 = (i11 & 64) != 0 ? extendEntity.productCategory : str6;
        String str27 = (i11 & 128) != 0 ? extendEntity.productCategoryItemStr : str7;
        String str28 = (i11 & 256) != 0 ? extendEntity.productCategoryStr : str8;
        String str29 = (i11 & 512) != 0 ? extendEntity.prt : str9;
        String str30 = (i11 & 1024) != 0 ? extendEntity.chainIcon : str10;
        String str31 = (i11 & 2048) != 0 ? extendEntity.chainName : str11;
        String str32 = (i11 & 4096) != 0 ? extendEntity.fullName : str12;
        String str33 = (i11 & 8192) != 0 ? extendEntity.price : str13;
        Integer num3 = num2;
        String str34 = (i11 & 16384) != 0 ? extendEntity.priceChangePercent24H : str14;
        String str35 = (i11 & 32768) != 0 ? extendEntity.token : str15;
        String str36 = (i11 & 65536) != 0 ? extendEntity.aveChainName : str16;
        Boolean bool3 = (i11 & 131072) != 0 ? extendEntity.supportFavorite : bool;
        Boolean bool4 = (i11 & 262144) != 0 ? extendEntity.isSupportDeposit : bool2;
        String str37 = (i11 & 524288) != 0 ? extendEntity.depositUrl : str17;
        String str38 = (i11 & 1048576) != 0 ? extendEntity.otcUrl : str18;
        String str39 = (i11 & 2097152) != 0 ? extendEntity.tokenBridgeId : str19;
        if ((i11 & 4194304) != 0) {
            str20 = str39;
            z12 = extendEntity.favoritePersonal;
        } else {
            z12 = z11;
            str20 = str39;
        }
        return extendEntity.copy(num3, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, bool3, bool4, str37, str38, str20, z12);
    }

    @NotNull
    public final ExtendEntity copy(@Nullable Integer duration, @Nullable String icon, @Nullable String jumpUrl, @Nullable String maxPrt, @Nullable String minPrt, @Nullable String name, @Nullable String productCategory, @Nullable String productCategoryItemStr, @Nullable String productCategoryStr, @Nullable String prt, @Nullable String chainIcon, @Nullable String chainName, @Nullable String fullName, @Nullable String price, @Nullable String priceChangePercent24H, @Nullable String token, @Nullable String aveChainName, @Nullable Boolean supportFavorite, @Nullable Boolean isSupportDeposit, @Nullable String depositUrl, @Nullable String otcUrl, @Nullable String tokenBridgeId, boolean favoritePersonal) {
        return new ExtendEntity(duration, icon, jumpUrl, maxPrt, minPrt, name, productCategory, productCategoryItemStr, productCategoryStr, prt, chainIcon, chainName, fullName, price, priceChangePercent24H, token, aveChainName, supportFavorite, isSupportDeposit, depositUrl, otcUrl, tokenBridgeId, favoritePersonal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendEntity)) {
            return false;
        }
        ExtendEntity extendEntity = (ExtendEntity) other;
        return Intrinsics.areEqual(this.duration, extendEntity.duration) && Intrinsics.areEqual(this.icon, extendEntity.icon) && Intrinsics.areEqual(this.jumpUrl, extendEntity.jumpUrl) && Intrinsics.areEqual(this.maxPrt, extendEntity.maxPrt) && Intrinsics.areEqual(this.minPrt, extendEntity.minPrt) && Intrinsics.areEqual(this.name, extendEntity.name) && Intrinsics.areEqual(this.productCategory, extendEntity.productCategory) && Intrinsics.areEqual(this.productCategoryItemStr, extendEntity.productCategoryItemStr) && Intrinsics.areEqual(this.productCategoryStr, extendEntity.productCategoryStr) && Intrinsics.areEqual(this.prt, extendEntity.prt) && Intrinsics.areEqual(this.chainIcon, extendEntity.chainIcon) && Intrinsics.areEqual(this.chainName, extendEntity.chainName) && Intrinsics.areEqual(this.fullName, extendEntity.fullName) && Intrinsics.areEqual(this.price, extendEntity.price) && Intrinsics.areEqual(this.priceChangePercent24H, extendEntity.priceChangePercent24H) && Intrinsics.areEqual(this.token, extendEntity.token) && Intrinsics.areEqual(this.aveChainName, extendEntity.aveChainName) && Intrinsics.areEqual(this.supportFavorite, extendEntity.supportFavorite) && Intrinsics.areEqual(this.isSupportDeposit, extendEntity.isSupportDeposit) && Intrinsics.areEqual(this.depositUrl, extendEntity.depositUrl) && Intrinsics.areEqual(this.otcUrl, extendEntity.otcUrl) && Intrinsics.areEqual(this.tokenBridgeId, extendEntity.tokenBridgeId) && this.favoritePersonal == extendEntity.favoritePersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrt() {
        return this.prt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPriceChangePercent24H() {
        return this.priceChangePercent24H;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAveChainName() {
        return this.aveChainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getSupportFavorite() {
        return this.supportFavorite;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsSupportDeposit() {
        return this.isSupportDeposit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDepositUrl() {
        return this.depositUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOtcUrl() {
        return this.otcUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxPrt() {
        return this.maxPrt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinPrt() {
        return this.minPrt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProductCategoryItemStr() {
        return this.productCategoryItemStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProductCategoryStr() {
        return this.productCategoryStr;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    @NotNull
    public final String formatPrtStr() {
        String str;
        BigDecimal scale;
        String str2;
        String str3 = this.maxPrt;
        String strPercentStr = null;
        if (str3 == null || str3.length() == 0 || (str2 = this.minPrt) == null || str2.length() == 0) {
            str = null;
        } else {
            BigDecimal bigDecimalM66671k = C27041f.m66671k(this.maxPrt);
            BigDecimal scale2 = bigDecimalM66671k != null ? bigDecimalM66671k.setScale(2, RoundingMode.DOWN) : null;
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k(this.minPrt);
            BigDecimal scale3 = bigDecimalM66671k2 != null ? bigDecimalM66671k2.setScale(2, RoundingMode.DOWN) : null;
            if (!EarnProductCategory.DUAL.nameEqual(this.productCategory) || scale2 == null || scale3 == null || scale2.compareTo(scale3) == 0) {
                str = null;
            } else {
                str = percentStr(scale3) + '-' + percentStr(scale2);
            }
        }
        if (str != null) {
            return str;
        }
        String str4 = this.prt;
        if (str4 != null && str4.length() != 0) {
            BigDecimal bigDecimalM66671k3 = C27041f.m66671k(this.prt);
            if (bigDecimalM66671k3 != null && (scale = bigDecimalM66671k3.setScale(2, RoundingMode.DOWN)) != null) {
                strPercentStr = percentStr(scale);
            }
            str = strPercentStr;
        }
        return str == null ? "--" : str;
    }

    @Nullable
    public final String getAveChainName() {
        return this.aveChainName;
    }

    @Nullable
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getDepositUrl() {
        return this.depositUrl;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getMaxPrt() {
        return this.maxPrt;
    }

    @Nullable
    public final String getMinPrt() {
        return this.minPrt;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOtcUrl() {
        return this.otcUrl;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPriceChangePercent24H() {
        return this.priceChangePercent24H;
    }

    @Nullable
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    public final String getProductCategoryItemStr() {
        return this.productCategoryItemStr;
    }

    @Nullable
    public final String getProductCategoryStr() {
        return this.productCategoryStr;
    }

    @Nullable
    public final String getPrt() {
        return this.prt;
    }

    @Nullable
    public final Boolean getSupportFavorite() {
        return this.supportFavorite;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    public int hashCode() {
        Integer num = this.duration;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jumpUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxPrt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minPrt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productCategory;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productCategoryItemStr;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productCategoryStr;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.prt;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chainIcon;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chainName;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fullName;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.price;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.priceChangePercent24H;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.token;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.aveChainName;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.supportFavorite;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSupportDeposit;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str17 = this.depositUrl;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.otcUrl;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.tokenBridgeId;
        return ((iHashCode21 + (str19 != null ? str19.hashCode() : 0)) * 31) + Boolean.hashCode(this.favoritePersonal);
    }

    @Nullable
    public final Boolean isSupportDeposit() {
        return this.isSupportDeposit;
    }

    public final void setFavoritePersonal(boolean z11) {
        this.favoritePersonal = z11;
    }

    @NotNull
    public final String showName() {
        return C27041f.m66668h(this.name) + " - " + C27041f.m66668h(this.productCategoryStr);
    }

    @NotNull
    public String toString() {
        return "ExtendEntity(duration=" + this.duration + ", icon=" + this.icon + ", jumpUrl=" + this.jumpUrl + ", maxPrt=" + this.maxPrt + ", minPrt=" + this.minPrt + ", name=" + this.name + ", productCategory=" + this.productCategory + ", productCategoryItemStr=" + this.productCategoryItemStr + ", productCategoryStr=" + this.productCategoryStr + ", prt=" + this.prt + ", chainIcon=" + this.chainIcon + ", chainName=" + this.chainName + ", fullName=" + this.fullName + ", price=" + this.price + ", priceChangePercent24H=" + this.priceChangePercent24H + ", token=" + this.token + ", aveChainName=" + this.aveChainName + ", supportFavorite=" + this.supportFavorite + ", isSupportDeposit=" + this.isSupportDeposit + ", depositUrl=" + this.depositUrl + ", otcUrl=" + this.otcUrl + ", tokenBridgeId=" + this.tokenBridgeId + ", favoritePersonal=" + this.favoritePersonal + ')';
    }

    private final String percentStr(BigDecimal bigDecimal) {
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C27039d.m66654n(bigDecimal));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C42180b.m92642g(bigDecimalM11724a, null, null, 0, false, false, false, 31, null);
    }

    public /* synthetic */ ExtendEntity(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, Boolean bool2, String str17, String str18, String str19, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool, bool2, str17, str18, str19, (i11 & 4194304) != 0 ? false : z11);
    }
}
