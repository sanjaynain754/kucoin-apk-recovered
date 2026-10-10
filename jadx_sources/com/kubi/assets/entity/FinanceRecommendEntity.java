package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jà\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\bHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006G"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceRecommendEntity;", "", "apr", "Ljava/math/BigDecimal;", "category", "", FirebaseAnalytics.Param.CURRENCY, TypedValues.TransitionType.S_DURATION, "", "name", "pol_apr", "product_id", "products", "", "sort_apr", "trial_type", "type", "weight", "strike_currency", "target_currency", "bigCurrencyIcon", "smallCurrencyIcon", "leverage", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getApr", "()Ljava/math/BigDecimal;", "getCategory", "()Ljava/lang/String;", "getCurrency", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getPol_apr", "getProduct_id", "getProducts", "()Ljava/util/List;", "getSort_apr", "getTrial_type", "getType", "getWeight", "getStrike_currency", "getTarget_currency", "getBigCurrencyIcon", "getSmallCurrencyIcon", "getLeverage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/assets/entity/FinanceRecommendEntity;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FinanceRecommendEntity {

    @Nullable
    private final BigDecimal apr;

    @Nullable
    private final String bigCurrencyIcon;

    @Nullable
    private final String category;

    @Nullable
    private final String currency;

    @Nullable
    private final Integer duration;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final String name;

    @Nullable
    private final BigDecimal pol_apr;

    @Nullable
    private final Integer product_id;

    @Nullable
    private final List<Object> products;

    @Nullable
    private final String smallCurrencyIcon;

    @Nullable
    private final String sort_apr;

    @Nullable
    private final String strike_currency;

    @Nullable
    private final String target_currency;

    @Nullable
    private final String trial_type;

    @Nullable
    private final String type;

    @Nullable
    private final Integer weight;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceRecommendEntity)) {
            return false;
        }
        FinanceRecommendEntity financeRecommendEntity = (FinanceRecommendEntity) other;
        return Intrinsics.areEqual(this.apr, financeRecommendEntity.apr) && Intrinsics.areEqual(this.category, financeRecommendEntity.category) && Intrinsics.areEqual(this.currency, financeRecommendEntity.currency) && Intrinsics.areEqual(this.duration, financeRecommendEntity.duration) && Intrinsics.areEqual(this.name, financeRecommendEntity.name) && Intrinsics.areEqual(this.pol_apr, financeRecommendEntity.pol_apr) && Intrinsics.areEqual(this.product_id, financeRecommendEntity.product_id) && Intrinsics.areEqual(this.products, financeRecommendEntity.products) && Intrinsics.areEqual(this.sort_apr, financeRecommendEntity.sort_apr) && Intrinsics.areEqual(this.trial_type, financeRecommendEntity.trial_type) && Intrinsics.areEqual(this.type, financeRecommendEntity.type) && Intrinsics.areEqual(this.weight, financeRecommendEntity.weight) && Intrinsics.areEqual(this.strike_currency, financeRecommendEntity.strike_currency) && Intrinsics.areEqual(this.target_currency, financeRecommendEntity.target_currency) && Intrinsics.areEqual(this.bigCurrencyIcon, financeRecommendEntity.bigCurrencyIcon) && Intrinsics.areEqual(this.smallCurrencyIcon, financeRecommendEntity.smallCurrencyIcon) && Intrinsics.areEqual(this.leverage, financeRecommendEntity.leverage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceRecommendEntity copy$default(FinanceRecommendEntity financeRecommendEntity, BigDecimal bigDecimal, String str, String str2, Integer num, String str3, BigDecimal bigDecimal2, Integer num2, List list, String str4, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, BigDecimal bigDecimal3, int i11, Object obj) {
        BigDecimal bigDecimal4;
        String str11;
        BigDecimal bigDecimal5 = (i11 & 1) != 0 ? financeRecommendEntity.apr : bigDecimal;
        String str12 = (i11 & 2) != 0 ? financeRecommendEntity.category : str;
        String str13 = (i11 & 4) != 0 ? financeRecommendEntity.currency : str2;
        Integer num4 = (i11 & 8) != 0 ? financeRecommendEntity.duration : num;
        String str14 = (i11 & 16) != 0 ? financeRecommendEntity.name : str3;
        BigDecimal bigDecimal6 = (i11 & 32) != 0 ? financeRecommendEntity.pol_apr : bigDecimal2;
        Integer num5 = (i11 & 64) != 0 ? financeRecommendEntity.product_id : num2;
        List list2 = (i11 & 128) != 0 ? financeRecommendEntity.products : list;
        String str15 = (i11 & 256) != 0 ? financeRecommendEntity.sort_apr : str4;
        String str16 = (i11 & 512) != 0 ? financeRecommendEntity.trial_type : str5;
        String str17 = (i11 & 1024) != 0 ? financeRecommendEntity.type : str6;
        Integer num6 = (i11 & 2048) != 0 ? financeRecommendEntity.weight : num3;
        String str18 = (i11 & 4096) != 0 ? financeRecommendEntity.strike_currency : str7;
        String str19 = (i11 & 8192) != 0 ? financeRecommendEntity.target_currency : str8;
        BigDecimal bigDecimal7 = bigDecimal5;
        String str20 = (i11 & 16384) != 0 ? financeRecommendEntity.bigCurrencyIcon : str9;
        String str21 = (i11 & 32768) != 0 ? financeRecommendEntity.smallCurrencyIcon : str10;
        if ((i11 & 65536) != 0) {
            str11 = str21;
            bigDecimal4 = financeRecommendEntity.leverage;
        } else {
            bigDecimal4 = bigDecimal3;
            str11 = str21;
        }
        return financeRecommendEntity.copy(bigDecimal7, str12, str13, num4, str14, bigDecimal6, num5, list2, str15, str16, str17, num6, str18, str19, str20, str11, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getApr() {
        return this.apr;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrial_type() {
        return this.trial_type;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStrike_currency() {
        return this.strike_currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTarget_currency() {
        return this.target_currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBigCurrencyIcon() {
        return this.bigCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSmallCurrencyIcon() {
        return this.smallCurrencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPol_apr() {
        return this.pol_apr;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getProduct_id() {
        return this.product_id;
    }

    @Nullable
    public final List<Object> component8() {
        return this.products;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSort_apr() {
        return this.sort_apr;
    }

    @NotNull
    public final FinanceRecommendEntity copy(@Nullable BigDecimal apr, @Nullable String category, @Nullable String currency, @Nullable Integer duration, @Nullable String name, @Nullable BigDecimal pol_apr, @Nullable Integer product_id, @Nullable List<? extends Object> products, @Nullable String sort_apr, @Nullable String trial_type, @Nullable String type, @Nullable Integer weight, @Nullable String strike_currency, @Nullable String target_currency, @Nullable String bigCurrencyIcon, @Nullable String smallCurrencyIcon, @Nullable BigDecimal leverage) {
        return new FinanceRecommendEntity(apr, category, currency, duration, name, pol_apr, product_id, products, sort_apr, trial_type, type, weight, strike_currency, target_currency, bigCurrencyIcon, smallCurrencyIcon, leverage);
    }

    @Nullable
    public final BigDecimal getApr() {
        return this.apr;
    }

    @Nullable
    public final String getBigCurrencyIcon() {
        return this.bigCurrencyIcon;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final BigDecimal getPol_apr() {
        return this.pol_apr;
    }

    @Nullable
    public final Integer getProduct_id() {
        return this.product_id;
    }

    @Nullable
    public final List<Object> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getSmallCurrencyIcon() {
        return this.smallCurrencyIcon;
    }

    @Nullable
    public final String getSort_apr() {
        return this.sort_apr;
    }

    @Nullable
    public final String getStrike_currency() {
        return this.strike_currency;
    }

    @Nullable
    public final String getTarget_currency() {
        return this.target_currency;
    }

    @Nullable
    public final String getTrial_type() {
        return this.trial_type;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.apr;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.category;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.duration;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.pol_apr;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num2 = this.product_id;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Object> list = this.products;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.sort_apr;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trial_type;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.weight;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.strike_currency;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.target_currency;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bigCurrencyIcon;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.smallCurrencyIcon;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.leverage;
        return iHashCode16 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FinanceRecommendEntity(apr=" + this.apr + ", category=" + this.category + ", currency=" + this.currency + ", duration=" + this.duration + ", name=" + this.name + ", pol_apr=" + this.pol_apr + ", product_id=" + this.product_id + ", products=" + this.products + ", sort_apr=" + this.sort_apr + ", trial_type=" + this.trial_type + ", type=" + this.type + ", weight=" + this.weight + ", strike_currency=" + this.strike_currency + ", target_currency=" + this.target_currency + ", bigCurrencyIcon=" + this.bigCurrencyIcon + ", smallCurrencyIcon=" + this.smallCurrencyIcon + ", leverage=" + this.leverage + ')';
    }

    public FinanceRecommendEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable Integer num2, @Nullable List<? extends Object> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable BigDecimal bigDecimal3) {
        this.apr = bigDecimal;
        this.category = str;
        this.currency = str2;
        this.duration = num;
        this.name = str3;
        this.pol_apr = bigDecimal2;
        this.product_id = num2;
        this.products = list;
        this.sort_apr = str4;
        this.trial_type = str5;
        this.type = str6;
        this.weight = num3;
        this.strike_currency = str7;
        this.target_currency = str8;
        this.bigCurrencyIcon = str9;
        this.smallCurrencyIcon = str10;
        this.leverage = bigDecimal3;
    }
}
