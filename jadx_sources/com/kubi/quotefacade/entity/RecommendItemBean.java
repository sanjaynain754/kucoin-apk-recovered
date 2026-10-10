package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.kubi.quotefacade.R$color;
import com.kubi.resources.C22890g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27039d;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendItemBean.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u00108\u001a\u00020\u0003J\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020\u000fJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u009e\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u000fHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b\f\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006M"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RecommendItemBean;", "", "symbolCode", "", "symbolName", "baseCurrency", "baseCurrencyName", "quoteCurrency", "quoteCurrencyName", "lastDealPrice", "Ljava/math/BigDecimal;", "changeRate", "isSelected", "", "collectType", "", "iconUrl", "alphaItemEntity", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "getSymbolCode", "()Ljava/lang/String;", "setSymbolCode", "(Ljava/lang/String;)V", "getSymbolName", "setSymbolName", "getBaseCurrency", "setBaseCurrency", "getBaseCurrencyName", "setBaseCurrencyName", "getQuoteCurrency", "setQuoteCurrency", "getQuoteCurrencyName", "setQuoteCurrencyName", "getLastDealPrice", "()Ljava/math/BigDecimal;", "setLastDealPrice", "(Ljava/math/BigDecimal;)V", "getChangeRate", "setChangeRate", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCollectType", "()Ljava/lang/Integer;", "setCollectType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconUrl", "setIconUrl", "getAlphaItemEntity", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "setAlphaItemEntity", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "lastDealPriceShow", "changeRateShow", "changeRateColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)Lcom/kubi/quotefacade/entity/RecommendItemBean;", "equals", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendItemBean {

    @Nullable
    private AlphaItemEntity alphaItemEntity;

    @Nullable
    private String baseCurrency;

    @Nullable
    private String baseCurrencyName;

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private Integer collectType;

    @Nullable
    private String iconUrl;

    @Nullable
    private Boolean isSelected;

    @Nullable
    private BigDecimal lastDealPrice;

    @Nullable
    private String quoteCurrency;

    @Nullable
    private String quoteCurrencyName;

    @Nullable
    private String symbolCode;

    @Nullable
    private String symbolName;

    public RecommendItemBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendItemBean)) {
            return false;
        }
        RecommendItemBean recommendItemBean = (RecommendItemBean) other;
        return Intrinsics.areEqual(this.symbolCode, recommendItemBean.symbolCode) && Intrinsics.areEqual(this.symbolName, recommendItemBean.symbolName) && Intrinsics.areEqual(this.baseCurrency, recommendItemBean.baseCurrency) && Intrinsics.areEqual(this.baseCurrencyName, recommendItemBean.baseCurrencyName) && Intrinsics.areEqual(this.quoteCurrency, recommendItemBean.quoteCurrency) && Intrinsics.areEqual(this.quoteCurrencyName, recommendItemBean.quoteCurrencyName) && Intrinsics.areEqual(this.lastDealPrice, recommendItemBean.lastDealPrice) && Intrinsics.areEqual(this.changeRate, recommendItemBean.changeRate) && Intrinsics.areEqual(this.isSelected, recommendItemBean.isSelected) && Intrinsics.areEqual(this.collectType, recommendItemBean.collectType) && Intrinsics.areEqual(this.iconUrl, recommendItemBean.iconUrl) && Intrinsics.areEqual(this.alphaItemEntity, recommendItemBean.alphaItemEntity);
    }

    public RecommendItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str7, @Nullable AlphaItemEntity alphaItemEntity) {
        this.symbolCode = str;
        this.symbolName = str2;
        this.baseCurrency = str3;
        this.baseCurrencyName = str4;
        this.quoteCurrency = str5;
        this.quoteCurrencyName = str6;
        this.lastDealPrice = bigDecimal;
        this.changeRate = bigDecimal2;
        this.isSelected = bool;
        this.collectType = num;
        this.iconUrl = str7;
        this.alphaItemEntity = alphaItemEntity;
    }

    public static /* synthetic */ RecommendItemBean copy$default(RecommendItemBean recommendItemBean, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Integer num, String str7, AlphaItemEntity alphaItemEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendItemBean.symbolCode;
        }
        if ((i11 & 2) != 0) {
            str2 = recommendItemBean.symbolName;
        }
        if ((i11 & 4) != 0) {
            str3 = recommendItemBean.baseCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = recommendItemBean.baseCurrencyName;
        }
        if ((i11 & 16) != 0) {
            str5 = recommendItemBean.quoteCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = recommendItemBean.quoteCurrencyName;
        }
        if ((i11 & 64) != 0) {
            bigDecimal = recommendItemBean.lastDealPrice;
        }
        if ((i11 & 128) != 0) {
            bigDecimal2 = recommendItemBean.changeRate;
        }
        if ((i11 & 256) != 0) {
            bool = recommendItemBean.isSelected;
        }
        if ((i11 & 512) != 0) {
            num = recommendItemBean.collectType;
        }
        if ((i11 & 1024) != 0) {
            str7 = recommendItemBean.iconUrl;
        }
        if ((i11 & 2048) != 0) {
            alphaItemEntity = recommendItemBean.alphaItemEntity;
        }
        String str8 = str7;
        AlphaItemEntity alphaItemEntity2 = alphaItemEntity;
        Boolean bool2 = bool;
        Integer num2 = num;
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str9 = str5;
        String str10 = str6;
        return recommendItemBean.copy(str, str2, str3, str4, str9, str10, bigDecimal3, bigDecimal4, bool2, num2, str8, alphaItemEntity2);
    }

    public final int changeRateColor() {
        return C22890g.m54278c(C27059l.f54343a.m66757a(), C27039d.m66647g(this.changeRate), R$color.emphasis40);
    }

    @NotNull
    public final String changeRateShow() {
        BigDecimal bigDecimal = this.changeRate;
        return bigDecimal == null ? "--" : C42180b.m92647l(C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null))));
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final AlphaItemEntity getAlphaItemEntity() {
        return this.alphaItemEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLastDealPrice() {
        return this.lastDealPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final RecommendItemBean copy(@Nullable String symbolCode, @Nullable String symbolName, @Nullable String baseCurrency, @Nullable String baseCurrencyName, @Nullable String quoteCurrency, @Nullable String quoteCurrencyName, @Nullable BigDecimal lastDealPrice, @Nullable BigDecimal changeRate, @Nullable Boolean isSelected, @Nullable Integer collectType, @Nullable String iconUrl, @Nullable AlphaItemEntity alphaItemEntity) {
        return new RecommendItemBean(symbolCode, symbolName, baseCurrency, baseCurrencyName, quoteCurrency, quoteCurrencyName, lastDealPrice, changeRate, isSelected, collectType, iconUrl, alphaItemEntity);
    }

    @Nullable
    public final AlphaItemEntity getAlphaItemEntity() {
        return this.alphaItemEntity;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final BigDecimal getLastDealPrice() {
        return this.lastDealPrice;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    public int hashCode() {
        String str = this.symbolCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrencyName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.quoteCurrencyName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal = this.lastDealPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.changeRate;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.collectType;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.iconUrl;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AlphaItemEntity alphaItemEntity = this.alphaItemEntity;
        return iHashCode11 + (alphaItemEntity != null ? alphaItemEntity.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public final String lastDealPriceShow() {
        String strM85579c;
        BigDecimal bigDecimal = this.lastDealPrice;
        return (bigDecimal == null || (strM85579c = C37886j.m85579c(bigDecimal, this.symbolCode, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) ? "--" : strM85579c;
    }

    public final void setAlphaItemEntity(@Nullable AlphaItemEntity alphaItemEntity) {
        this.alphaItemEntity = alphaItemEntity;
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setBaseCurrencyName(@Nullable String str) {
        this.baseCurrencyName = str;
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setCollectType(@Nullable Integer num) {
        this.collectType = num;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setLastDealPrice(@Nullable BigDecimal bigDecimal) {
        this.lastDealPrice = bigDecimal;
    }

    public final void setQuoteCurrency(@Nullable String str) {
        this.quoteCurrency = str;
    }

    public final void setQuoteCurrencyName(@Nullable String str) {
        this.quoteCurrencyName = str;
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.isSelected = bool;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    @NotNull
    public String toString() {
        return "RecommendItemBean(symbolCode=" + this.symbolCode + ", symbolName=" + this.symbolName + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyName=" + this.baseCurrencyName + ", quoteCurrency=" + this.quoteCurrency + ", quoteCurrencyName=" + this.quoteCurrencyName + ", lastDealPrice=" + this.lastDealPrice + ", changeRate=" + this.changeRate + ", isSelected=" + this.isSelected + ", collectType=" + this.collectType + ", iconUrl=" + this.iconUrl + ", alphaItemEntity=" + this.alphaItemEntity + ')';
    }

    public /* synthetic */ RecommendItemBean(String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Integer num, String str7, AlphaItemEntity alphaItemEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? Boolean.TRUE : bool, (i11 & 512) != 0 ? 1 : num, (i11 & 1024) != 0 ? "" : str7, (i11 & 2048) != 0 ? null : alphaItemEntity);
    }
}
