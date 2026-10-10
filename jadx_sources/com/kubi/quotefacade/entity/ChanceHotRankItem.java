package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.tencent.bugly.proguard.C33616e0;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u00104\u001a\u00020\u0005J\b\u00105\u001a\u0004\u0018\u00010\u0005J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0092\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00102\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006G"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceHotRankItem;", "", "changeRate", "Ljava/math/BigDecimal;", "name", "", FirebaseAnalytics.Param.PRICE, "symbolCode", C33616e0.f69644s, "", "Lcom/kubi/quotefacade/entity/ChanceHotRankItemTag;", "operationTags", "Lcom/kubi/quotefacade/entity/ChanceHotRankItemOperationTag;", "volValue", "iconUrl", "holding", "", "symbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getChangeRate", "()Ljava/math/BigDecimal;", "setChangeRate", "(Ljava/math/BigDecimal;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPrice", "setPrice", "getSymbolCode", "setSymbolCode", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getOperationTags", "setOperationTags", "getVolValue", "setVolValue", "getIconUrl", "setIconUrl", "getHolding", "()Ljava/lang/Boolean;", "setHolding", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSymbol", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "setSymbol", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getFormatChangeRate", "getQuoteCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/quotefacade/entity/ChanceHotRankItem;", "equals", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceHotRankItem {

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private Boolean holding;

    @Nullable
    private String iconUrl;

    @Nullable
    private String name;

    @Nullable
    private List<ChanceHotRankItemOperationTag> operationTags;

    @Nullable
    private BigDecimal price;

    @Nullable
    private SymbolInfoEntity symbol;

    @Nullable
    private String symbolCode;

    @Nullable
    private List<ChanceHotRankItemTag> tags;

    @Nullable
    private BigDecimal volValue;

    public ChanceHotRankItem() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceHotRankItem)) {
            return false;
        }
        ChanceHotRankItem chanceHotRankItem = (ChanceHotRankItem) other;
        return Intrinsics.areEqual(this.changeRate, chanceHotRankItem.changeRate) && Intrinsics.areEqual(this.name, chanceHotRankItem.name) && Intrinsics.areEqual(this.price, chanceHotRankItem.price) && Intrinsics.areEqual(this.symbolCode, chanceHotRankItem.symbolCode) && Intrinsics.areEqual(this.tags, chanceHotRankItem.tags) && Intrinsics.areEqual(this.operationTags, chanceHotRankItem.operationTags) && Intrinsics.areEqual(this.volValue, chanceHotRankItem.volValue) && Intrinsics.areEqual(this.iconUrl, chanceHotRankItem.iconUrl) && Intrinsics.areEqual(this.holding, chanceHotRankItem.holding) && Intrinsics.areEqual(this.symbol, chanceHotRankItem.symbol);
    }

    public ChanceHotRankItem(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable List<ChanceHotRankItemTag> list, @Nullable List<ChanceHotRankItemOperationTag> list2, @Nullable BigDecimal bigDecimal3, @Nullable String str3, @Nullable Boolean bool, @Nullable SymbolInfoEntity symbolInfoEntity) {
        this.changeRate = bigDecimal;
        this.name = str;
        this.price = bigDecimal2;
        this.symbolCode = str2;
        this.tags = list;
        this.operationTags = list2;
        this.volValue = bigDecimal3;
        this.iconUrl = str3;
        this.holding = bool;
        this.symbol = symbolInfoEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChanceHotRankItem copy$default(ChanceHotRankItem chanceHotRankItem, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, List list, List list2, BigDecimal bigDecimal3, String str3, Boolean bool, SymbolInfoEntity symbolInfoEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = chanceHotRankItem.changeRate;
        }
        if ((i11 & 2) != 0) {
            str = chanceHotRankItem.name;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = chanceHotRankItem.price;
        }
        if ((i11 & 8) != 0) {
            str2 = chanceHotRankItem.symbolCode;
        }
        if ((i11 & 16) != 0) {
            list = chanceHotRankItem.tags;
        }
        if ((i11 & 32) != 0) {
            list2 = chanceHotRankItem.operationTags;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = chanceHotRankItem.volValue;
        }
        if ((i11 & 128) != 0) {
            str3 = chanceHotRankItem.iconUrl;
        }
        if ((i11 & 256) != 0) {
            bool = chanceHotRankItem.holding;
        }
        if ((i11 & 512) != 0) {
            symbolInfoEntity = chanceHotRankItem.symbol;
        }
        Boolean bool2 = bool;
        SymbolInfoEntity symbolInfoEntity2 = symbolInfoEntity;
        BigDecimal bigDecimal4 = bigDecimal3;
        String str4 = str3;
        List list3 = list;
        List list4 = list2;
        return chanceHotRankItem.copy(bigDecimal, str, bigDecimal2, str2, list3, list4, bigDecimal4, str4, bool2, symbolInfoEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SymbolInfoEntity getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final List<ChanceHotRankItemTag> component5() {
        return this.tags;
    }

    @Nullable
    public final List<ChanceHotRankItemOperationTag> component6() {
        return this.operationTags;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHolding() {
        return this.holding;
    }

    @NotNull
    public final ChanceHotRankItem copy(@Nullable BigDecimal changeRate, @Nullable String name, @Nullable BigDecimal price, @Nullable String symbolCode, @Nullable List<ChanceHotRankItemTag> tags, @Nullable List<ChanceHotRankItemOperationTag> operationTags, @Nullable BigDecimal volValue, @Nullable String iconUrl, @Nullable Boolean holding, @Nullable SymbolInfoEntity symbol) {
        return new ChanceHotRankItem(changeRate, name, price, symbolCode, tags, operationTags, volValue, iconUrl, holding, symbol);
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @NotNull
    public final String getFormatChangeRate() {
        BigDecimal bigDecimal = this.changeRate;
        return C42180b.m92649n(bigDecimal != null ? C42180b.m92642g(bigDecimal, null, null, 0, true, false, false, 55, null) : null);
    }

    @Nullable
    public final Boolean getHolding() {
        return this.holding;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ChanceHotRankItemOperationTag> getOperationTags() {
        return this.operationTags;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getQuoteCurrency() {
        if (this.symbol == null) {
            this.symbol = C37890n.f85269a.m85601B(this.symbolCode);
        }
        SymbolInfoEntity symbolInfoEntity = this.symbol;
        if (symbolInfoEntity != null) {
            return symbolInfoEntity.getQuoteCurrency();
        }
        return null;
    }

    @Nullable
    public final SymbolInfoEntity getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final List<ChanceHotRankItemTag> getTags() {
        return this.tags;
    }

    @Nullable
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ChanceHotRankItemTag> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<ChanceHotRankItemOperationTag> list2 = this.operationTags;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.volValue;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.holding;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        SymbolInfoEntity symbolInfoEntity = this.symbol;
        return iHashCode9 + (symbolInfoEntity != null ? symbolInfoEntity.hashCode() : 0);
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setHolding(@Nullable Boolean bool) {
        this.holding = bool;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOperationTags(@Nullable List<ChanceHotRankItemOperationTag> list) {
        this.operationTags = list;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSymbol(@Nullable SymbolInfoEntity symbolInfoEntity) {
        this.symbol = symbolInfoEntity;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setTags(@Nullable List<ChanceHotRankItemTag> list) {
        this.tags = list;
    }

    public final void setVolValue(@Nullable BigDecimal bigDecimal) {
        this.volValue = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "ChanceHotRankItem(changeRate=" + this.changeRate + ", name=" + this.name + ", price=" + this.price + ", symbolCode=" + this.symbolCode + ", tags=" + this.tags + ", operationTags=" + this.operationTags + ", volValue=" + this.volValue + ", iconUrl=" + this.iconUrl + ", holding=" + this.holding + ", symbol=" + this.symbol + ')';
    }

    public /* synthetic */ ChanceHotRankItem(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, List list, List list2, BigDecimal bigDecimal3, String str3, Boolean bool, SymbolInfoEntity symbolInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : list2, (i11 & 64) != 0 ? null : bigDecimal3, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : symbolInfoEntity);
    }
}
