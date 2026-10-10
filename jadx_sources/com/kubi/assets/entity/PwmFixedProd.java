package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33616e0;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00104\u001a\u00020\tH\u0016J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0002\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010M\u001a\u00020\tHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b,\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006O"}, m90084d2 = {"Lcom/kubi/assets/entity/PwmFixedProd;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "apr", "", "category", "categoryText", FirebaseAnalytics.Param.CURRENCY, TypedValues.TransitionType.S_DURATION, "endApplyCountdown", "", "kcsRightsBonus", "", "", "maxCouponApr", "name", "productId", "returnRates", "returnType", "startApplyCountdown", "status", C33616e0.f69644s, "", "totalApr", "type", "unlockPeriod", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApr", "()Ljava/lang/String;", "getCategory", "getCategoryText", "getCurrency", "getDuration", "getEndApplyCountdown", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKcsRightsBonus", "()Ljava/util/Map;", "getMaxCouponApr", "getName", "getProductId", "getReturnRates", "getReturnType", "getStartApplyCountdown", "getStatus", "getTags", "()Ljava/util/List;", "getTotalApr", "getType", "getUnlockPeriod", "getJumpUrl", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/PwmFixedProd;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PwmFixedProd implements MultiItemEntity {

    @Nullable
    private final String apr;

    @Nullable
    private final String category;

    @Nullable
    private final String categoryText;

    @Nullable
    private final String currency;

    @Nullable
    private final String duration;

    @Nullable
    private final Integer endApplyCountdown;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final Map<String, Object> kcsRightsBonus;

    @Nullable
    private final String maxCouponApr;

    @Nullable
    private final String name;

    @Nullable
    private final String productId;

    @Nullable
    private final Map<String, Object> returnRates;

    @Nullable
    private final String returnType;

    @Nullable
    private final Integer startApplyCountdown;

    @Nullable
    private final String status;

    @Nullable
    private final List<String> tags;

    @Nullable
    private final String totalApr;

    @Nullable
    private final String type;

    @Nullable
    private final String unlockPeriod;

    public PwmFixedProd() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PwmFixedProd copy$default(PwmFixedProd pwmFixedProd, String str, String str2, String str3, String str4, String str5, Integer num, Map map, String str6, String str7, String str8, Map map2, String str9, Integer num2, String str10, List list, String str11, String str12, String str13, String str14, int i11, Object obj) {
        String str15;
        String str16;
        String str17 = (i11 & 1) != 0 ? pwmFixedProd.apr : str;
        String str18 = (i11 & 2) != 0 ? pwmFixedProd.category : str2;
        String str19 = (i11 & 4) != 0 ? pwmFixedProd.categoryText : str3;
        String str20 = (i11 & 8) != 0 ? pwmFixedProd.currency : str4;
        String str21 = (i11 & 16) != 0 ? pwmFixedProd.duration : str5;
        Integer num3 = (i11 & 32) != 0 ? pwmFixedProd.endApplyCountdown : num;
        Map map3 = (i11 & 64) != 0 ? pwmFixedProd.kcsRightsBonus : map;
        String str22 = (i11 & 128) != 0 ? pwmFixedProd.maxCouponApr : str6;
        String str23 = (i11 & 256) != 0 ? pwmFixedProd.name : str7;
        String str24 = (i11 & 512) != 0 ? pwmFixedProd.productId : str8;
        Map map4 = (i11 & 1024) != 0 ? pwmFixedProd.returnRates : map2;
        String str25 = (i11 & 2048) != 0 ? pwmFixedProd.returnType : str9;
        Integer num4 = (i11 & 4096) != 0 ? pwmFixedProd.startApplyCountdown : num2;
        String str26 = (i11 & 8192) != 0 ? pwmFixedProd.status : str10;
        String str27 = str17;
        List list2 = (i11 & 16384) != 0 ? pwmFixedProd.tags : list;
        String str28 = (i11 & 32768) != 0 ? pwmFixedProd.totalApr : str11;
        String str29 = (i11 & 65536) != 0 ? pwmFixedProd.type : str12;
        String str30 = (i11 & 131072) != 0 ? pwmFixedProd.unlockPeriod : str13;
        if ((i11 & 262144) != 0) {
            str16 = str30;
            str15 = pwmFixedProd.jumpUrl;
        } else {
            str15 = str14;
            str16 = str30;
        }
        return pwmFixedProd.copy(str27, str18, str19, str20, str21, num3, map3, str22, str23, str24, map4, str25, num4, str26, list2, str28, str29, str16, str15);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PwmFixedProd)) {
            return false;
        }
        PwmFixedProd pwmFixedProd = (PwmFixedProd) other;
        return Intrinsics.areEqual(this.apr, pwmFixedProd.apr) && Intrinsics.areEqual(this.category, pwmFixedProd.category) && Intrinsics.areEqual(this.categoryText, pwmFixedProd.categoryText) && Intrinsics.areEqual(this.currency, pwmFixedProd.currency) && Intrinsics.areEqual(this.duration, pwmFixedProd.duration) && Intrinsics.areEqual(this.endApplyCountdown, pwmFixedProd.endApplyCountdown) && Intrinsics.areEqual(this.kcsRightsBonus, pwmFixedProd.kcsRightsBonus) && Intrinsics.areEqual(this.maxCouponApr, pwmFixedProd.maxCouponApr) && Intrinsics.areEqual(this.name, pwmFixedProd.name) && Intrinsics.areEqual(this.productId, pwmFixedProd.productId) && Intrinsics.areEqual(this.returnRates, pwmFixedProd.returnRates) && Intrinsics.areEqual(this.returnType, pwmFixedProd.returnType) && Intrinsics.areEqual(this.startApplyCountdown, pwmFixedProd.startApplyCountdown) && Intrinsics.areEqual(this.status, pwmFixedProd.status) && Intrinsics.areEqual(this.tags, pwmFixedProd.tags) && Intrinsics.areEqual(this.totalApr, pwmFixedProd.totalApr) && Intrinsics.areEqual(this.type, pwmFixedProd.type) && Intrinsics.areEqual(this.unlockPeriod, pwmFixedProd.unlockPeriod) && Intrinsics.areEqual(this.jumpUrl, pwmFixedProd.jumpUrl);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF17248b() {
        return 1;
    }

    public PwmFixedProd(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Map<String, ? extends Object> map, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Map<String, ? extends Object> map2, @Nullable String str9, @Nullable Integer num2, @Nullable String str10, @Nullable List<String> list, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.apr = str;
        this.category = str2;
        this.categoryText = str3;
        this.currency = str4;
        this.duration = str5;
        this.endApplyCountdown = num;
        this.kcsRightsBonus = map;
        this.maxCouponApr = str6;
        this.name = str7;
        this.productId = str8;
        this.returnRates = map2;
        this.returnType = str9;
        this.startApplyCountdown = num2;
        this.status = str10;
        this.tags = list;
        this.totalApr = str11;
        this.type = str12;
        this.unlockPeriod = str13;
        this.jumpUrl = str14;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final Map<String, Object> component11() {
        return this.returnRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getReturnType() {
        return this.returnType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getStartApplyCountdown() {
        return this.startApplyCountdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> component15() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTotalApr() {
        return this.totalApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUnlockPeriod() {
        return this.unlockPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getEndApplyCountdown() {
        return this.endApplyCountdown;
    }

    @Nullable
    public final Map<String, Object> component7() {
        return this.kcsRightsBonus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaxCouponApr() {
        return this.maxCouponApr;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PwmFixedProd copy(@Nullable String apr, @Nullable String category, @Nullable String categoryText, @Nullable String currency, @Nullable String duration, @Nullable Integer endApplyCountdown, @Nullable Map<String, ? extends Object> kcsRightsBonus, @Nullable String maxCouponApr, @Nullable String name, @Nullable String productId, @Nullable Map<String, ? extends Object> returnRates, @Nullable String returnType, @Nullable Integer startApplyCountdown, @Nullable String status, @Nullable List<String> tags, @Nullable String totalApr, @Nullable String type, @Nullable String unlockPeriod, @Nullable String jumpUrl) {
        return new PwmFixedProd(apr, category, categoryText, currency, duration, endApplyCountdown, kcsRightsBonus, maxCouponApr, name, productId, returnRates, returnType, startApplyCountdown, status, tags, totalApr, type, unlockPeriod, jumpUrl);
    }

    @Nullable
    public final String getApr() {
        return this.apr;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
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
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getEndApplyCountdown() {
        return this.endApplyCountdown;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final Map<String, Object> getKcsRightsBonus() {
        return this.kcsRightsBonus;
    }

    @Nullable
    public final String getMaxCouponApr() {
        return this.maxCouponApr;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final Map<String, Object> getReturnRates() {
        return this.returnRates;
    }

    @Nullable
    public final String getReturnType() {
        return this.returnType;
    }

    @Nullable
    public final Integer getStartApplyCountdown() {
        return this.startApplyCountdown;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTotalApr() {
        return this.totalApr;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUnlockPeriod() {
        return this.unlockPeriod;
    }

    public int hashCode() {
        String str = this.apr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.duration;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.endApplyCountdown;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Object> map = this.kcsRightsBonus;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.maxCouponApr;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, Object> map2 = this.returnRates;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str9 = this.returnType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.startApplyCountdown;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.status;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.totalApr;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.type;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.unlockPeriod;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.jumpUrl;
        return iHashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PwmFixedProd(apr=" + this.apr + ", category=" + this.category + ", categoryText=" + this.categoryText + ", currency=" + this.currency + ", duration=" + this.duration + ", endApplyCountdown=" + this.endApplyCountdown + ", kcsRightsBonus=" + this.kcsRightsBonus + ", maxCouponApr=" + this.maxCouponApr + ", name=" + this.name + ", productId=" + this.productId + ", returnRates=" + this.returnRates + ", returnType=" + this.returnType + ", startApplyCountdown=" + this.startApplyCountdown + ", status=" + this.status + ", tags=" + this.tags + ", totalApr=" + this.totalApr + ", type=" + this.type + ", unlockPeriod=" + this.unlockPeriod + ", jumpUrl=" + this.jumpUrl + ')';
    }

    public /* synthetic */ PwmFixedProd(String str, String str2, String str3, String str4, String str5, Integer num, Map map, String str6, String str7, String str8, Map map2, String str9, Integer num2, String str10, List list, String str11, String str12, String str13, String str14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : map, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : map2, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : num2, (i11 & 8192) != 0 ? null : str10, (i11 & 16384) != 0 ? null : list, (i11 & 32768) != 0 ? null : str11, (i11 & 65536) != 0 ? null : str12, (i11 & 131072) != 0 ? null : str13, (i11 & 262144) != 0 ? null : str14);
    }
}
