package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jo\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u00069"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "", "changeRate", "Ljava/math/BigDecimal;", "heatValue", "", "name", "iconUrl", FirebaseAnalytics.Param.PRICE, "symbolCode", "jumpLink", "highLights", "", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrencyHighLight;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getChangeRate", "()Ljava/math/BigDecimal;", "setChangeRate", "(Ljava/math/BigDecimal;)V", "getHeatValue", "()Ljava/lang/String;", "setHeatValue", "(Ljava/lang/String;)V", "getName", "setName", "getIconUrl", "setIconUrl", "getPrice", "setPrice", "getSymbolCode", "setSymbolCode", "getJumpLink", "setJumpLink", "getHighLights", "()Ljava/util/List;", "setHighLights", "(Ljava/util/List;)V", "highLightsTextItems", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "getHighLightsTextItems", "setHighLightsTextItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceGemBoxCurrency {

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private String heatValue;

    @Nullable
    private List<ChanceGemBoxCurrencyHighLight> highLights;

    @Nullable
    private List<ChanceGemBoxTextItem> highLightsTextItems;

    @Nullable
    private String iconUrl;

    @Nullable
    private String jumpLink;

    @Nullable
    private String name;

    @Nullable
    private BigDecimal price;

    @Nullable
    private String symbolCode;

    public ChanceGemBoxCurrency() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceGemBoxCurrency)) {
            return false;
        }
        ChanceGemBoxCurrency chanceGemBoxCurrency = (ChanceGemBoxCurrency) other;
        return Intrinsics.areEqual(this.changeRate, chanceGemBoxCurrency.changeRate) && Intrinsics.areEqual(this.heatValue, chanceGemBoxCurrency.heatValue) && Intrinsics.areEqual(this.name, chanceGemBoxCurrency.name) && Intrinsics.areEqual(this.iconUrl, chanceGemBoxCurrency.iconUrl) && Intrinsics.areEqual(this.price, chanceGemBoxCurrency.price) && Intrinsics.areEqual(this.symbolCode, chanceGemBoxCurrency.symbolCode) && Intrinsics.areEqual(this.jumpLink, chanceGemBoxCurrency.jumpLink) && Intrinsics.areEqual(this.highLights, chanceGemBoxCurrency.highLights);
    }

    public ChanceGemBoxCurrency(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable String str4, @Nullable String str5, @Nullable List<ChanceGemBoxCurrencyHighLight> list) {
        this.changeRate = bigDecimal;
        this.heatValue = str;
        this.name = str2;
        this.iconUrl = str3;
        this.price = bigDecimal2;
        this.symbolCode = str4;
        this.jumpLink = str5;
        this.highLights = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChanceGemBoxCurrency copy$default(ChanceGemBoxCurrency chanceGemBoxCurrency, BigDecimal bigDecimal, String str, String str2, String str3, BigDecimal bigDecimal2, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = chanceGemBoxCurrency.changeRate;
        }
        if ((i11 & 2) != 0) {
            str = chanceGemBoxCurrency.heatValue;
        }
        if ((i11 & 4) != 0) {
            str2 = chanceGemBoxCurrency.name;
        }
        if ((i11 & 8) != 0) {
            str3 = chanceGemBoxCurrency.iconUrl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = chanceGemBoxCurrency.price;
        }
        if ((i11 & 32) != 0) {
            str4 = chanceGemBoxCurrency.symbolCode;
        }
        if ((i11 & 64) != 0) {
            str5 = chanceGemBoxCurrency.jumpLink;
        }
        if ((i11 & 128) != 0) {
            list = chanceGemBoxCurrency.highLights;
        }
        String str6 = str5;
        List list2 = list;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str7 = str4;
        return chanceGemBoxCurrency.copy(bigDecimal, str, str2, str3, bigDecimal3, str7, str6, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeatValue() {
        return this.heatValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final List<ChanceGemBoxCurrencyHighLight> component8() {
        return this.highLights;
    }

    @NotNull
    public final ChanceGemBoxCurrency copy(@Nullable BigDecimal changeRate, @Nullable String heatValue, @Nullable String name, @Nullable String iconUrl, @Nullable BigDecimal price, @Nullable String symbolCode, @Nullable String jumpLink, @Nullable List<ChanceGemBoxCurrencyHighLight> highLights) {
        return new ChanceGemBoxCurrency(changeRate, heatValue, name, iconUrl, price, symbolCode, jumpLink, highLights);
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getHeatValue() {
        return this.heatValue;
    }

    @Nullable
    public final List<ChanceGemBoxCurrencyHighLight> getHighLights() {
        return this.highLights;
    }

    @Nullable
    public final List<ChanceGemBoxTextItem> getHighLightsTextItems() {
        return this.highLightsTextItems;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.heatValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str4 = this.symbolCode;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ChanceGemBoxCurrencyHighLight> list = this.highLights;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setHeatValue(@Nullable String str) {
        this.heatValue = str;
    }

    public final void setHighLights(@Nullable List<ChanceGemBoxCurrencyHighLight> list) {
        this.highLights = list;
    }

    public final void setHighLightsTextItems(@Nullable List<ChanceGemBoxTextItem> list) {
        this.highLightsTextItems = list;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setJumpLink(@Nullable String str) {
        this.jumpLink = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    @NotNull
    public String toString() {
        return "ChanceGemBoxCurrency(changeRate=" + this.changeRate + ", heatValue=" + this.heatValue + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", price=" + this.price + ", symbolCode=" + this.symbolCode + ", jumpLink=" + this.jumpLink + ", highLights=" + this.highLights + ')';
    }

    public /* synthetic */ ChanceGemBoxCurrency(BigDecimal bigDecimal, String str, String str2, String str3, BigDecimal bigDecimal2, String str4, String str5, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal2, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? CollectionsKt.emptyList() : list);
    }
}
