package com.kubi.mart.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SidebarDataEntity.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010$\u001a\u00020%J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0092\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001d¨\u00067"}, m90084d2 = {"Lcom/kubi/mart/entity/SidebarDataItemEntity;", "", "symbol", "", "last24HourRate", "Ljava/math/BigDecimal;", "lastPrice", "symbolMark", "", "symbolLabel", "tradingEnabled", "", "isolatedEnabled", "marginEnabled", "callAuctionSymbol", "tradingSoonEnabled", "favoritePersonal", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getLast24HourRate", "()Ljava/math/BigDecimal;", "getLastPrice", "getSymbolMark", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSymbolLabel", "getTradingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsolatedEnabled", "getMarginEnabled", "getCallAuctionSymbol", "getTradingSoonEnabled", "getFavoritePersonal", "toTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/mart/entity/SidebarDataItemEntity;", "equals", "other", "hashCode", "toString", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSidebarDataEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SidebarDataEntity.kt\ncom/kubi/mart/entity/SidebarDataItemEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final /* data */ class SidebarDataItemEntity {

    @Nullable
    private final Boolean callAuctionSymbol;

    @SerializedName("favorite_personal")
    @Nullable
    private final Boolean favoritePersonal;

    @Nullable
    private final Boolean isolatedEnabled;

    @Nullable
    private final BigDecimal last24HourRate;

    @Nullable
    private final BigDecimal lastPrice;

    @Nullable
    private final Boolean marginEnabled;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolLabel;

    @Nullable
    private final Integer symbolMark;

    @Nullable
    private final Boolean tradingEnabled;

    @Nullable
    private final Boolean tradingSoonEnabled;

    public SidebarDataItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ SidebarDataItemEntity copy$default(SidebarDataItemEntity sidebarDataItemEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sidebarDataItemEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = sidebarDataItemEntity.last24HourRate;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = sidebarDataItemEntity.lastPrice;
        }
        if ((i11 & 8) != 0) {
            num = sidebarDataItemEntity.symbolMark;
        }
        if ((i11 & 16) != 0) {
            str2 = sidebarDataItemEntity.symbolLabel;
        }
        if ((i11 & 32) != 0) {
            bool = sidebarDataItemEntity.tradingEnabled;
        }
        if ((i11 & 64) != 0) {
            bool2 = sidebarDataItemEntity.isolatedEnabled;
        }
        if ((i11 & 128) != 0) {
            bool3 = sidebarDataItemEntity.marginEnabled;
        }
        if ((i11 & 256) != 0) {
            bool4 = sidebarDataItemEntity.callAuctionSymbol;
        }
        if ((i11 & 512) != 0) {
            bool5 = sidebarDataItemEntity.tradingSoonEnabled;
        }
        if ((i11 & 1024) != 0) {
            bool6 = sidebarDataItemEntity.favoritePersonal;
        }
        Boolean bool7 = bool5;
        Boolean bool8 = bool6;
        Boolean bool9 = bool3;
        Boolean bool10 = bool4;
        Boolean bool11 = bool;
        Boolean bool12 = bool2;
        String str3 = str2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return sidebarDataItemEntity.copy(str, bigDecimal, bigDecimal3, num, str3, bool11, bool12, bool9, bool10, bool7, bool8);
    }

    @NotNull
    public final SidebarDataItemEntity copy(@Nullable String symbol, @Nullable BigDecimal last24HourRate, @Nullable BigDecimal lastPrice, @Nullable Integer symbolMark, @Nullable String symbolLabel, @Nullable Boolean tradingEnabled, @Nullable Boolean isolatedEnabled, @Nullable Boolean marginEnabled, @Nullable Boolean callAuctionSymbol, @Nullable Boolean tradingSoonEnabled, @Nullable Boolean favoritePersonal) {
        return new SidebarDataItemEntity(symbol, last24HourRate, lastPrice, symbolMark, symbolLabel, tradingEnabled, isolatedEnabled, marginEnabled, callAuctionSymbol, tradingSoonEnabled, favoritePersonal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SidebarDataItemEntity)) {
            return false;
        }
        SidebarDataItemEntity sidebarDataItemEntity = (SidebarDataItemEntity) other;
        return Intrinsics.areEqual(this.symbol, sidebarDataItemEntity.symbol) && Intrinsics.areEqual(this.last24HourRate, sidebarDataItemEntity.last24HourRate) && Intrinsics.areEqual(this.lastPrice, sidebarDataItemEntity.lastPrice) && Intrinsics.areEqual(this.symbolMark, sidebarDataItemEntity.symbolMark) && Intrinsics.areEqual(this.symbolLabel, sidebarDataItemEntity.symbolLabel) && Intrinsics.areEqual(this.tradingEnabled, sidebarDataItemEntity.tradingEnabled) && Intrinsics.areEqual(this.isolatedEnabled, sidebarDataItemEntity.isolatedEnabled) && Intrinsics.areEqual(this.marginEnabled, sidebarDataItemEntity.marginEnabled) && Intrinsics.areEqual(this.callAuctionSymbol, sidebarDataItemEntity.callAuctionSymbol) && Intrinsics.areEqual(this.tradingSoonEnabled, sidebarDataItemEntity.tradingSoonEnabled) && Intrinsics.areEqual(this.favoritePersonal, sidebarDataItemEntity.favoritePersonal);
    }

    public SidebarDataItemEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6) {
        this.symbol = str;
        this.last24HourRate = bigDecimal;
        this.lastPrice = bigDecimal2;
        this.symbolMark = num;
        this.symbolLabel = str2;
        this.tradingEnabled = bool;
        this.isolatedEnabled = bool2;
        this.marginEnabled = bool3;
        this.callAuctionSymbol = bool4;
        this.tradingSoonEnabled = bool5;
        this.favoritePersonal = bool6;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getTradingSoonEnabled() {
        return this.tradingSoonEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSymbolMark() {
        return this.symbolMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSymbolLabel() {
        return this.symbolLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getTradingEnabled() {
        return this.tradingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsolatedEnabled() {
        return this.isolatedEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getMarginEnabled() {
        return this.marginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getCallAuctionSymbol() {
        return this.callAuctionSymbol;
    }

    @Nullable
    public final Boolean getCallAuctionSymbol() {
        return this.callAuctionSymbol;
    }

    @Nullable
    public final Boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final Boolean getIsolatedEnabled() {
        return this.isolatedEnabled;
    }

    @Nullable
    public final BigDecimal getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final Boolean getMarginEnabled() {
        return this.marginEnabled;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolLabel() {
        return this.symbolLabel;
    }

    @Nullable
    public final Integer getSymbolMark() {
        return this.symbolMark;
    }

    @Nullable
    public final Boolean getTradingEnabled() {
        return this.tradingEnabled;
    }

    @Nullable
    public final Boolean getTradingSoonEnabled() {
        return this.tradingSoonEnabled;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.last24HourRate;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.lastPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num = this.symbolMark;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.symbolLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.tradingEnabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isolatedEnabled;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.marginEnabled;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.callAuctionSymbol;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.tradingSoonEnabled;
        int iHashCode10 = (iHashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.favoritePersonal;
        return iHashCode10 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SidebarDataItemEntity(symbol=" + this.symbol + ", last24HourRate=" + this.last24HourRate + ", lastPrice=" + this.lastPrice + ", symbolMark=" + this.symbolMark + ", symbolLabel=" + this.symbolLabel + ", tradingEnabled=" + this.tradingEnabled + ", isolatedEnabled=" + this.isolatedEnabled + ", marginEnabled=" + this.marginEnabled + ", callAuctionSymbol=" + this.callAuctionSymbol + ", tradingSoonEnabled=" + this.tradingSoonEnabled + ", favoritePersonal=" + this.favoritePersonal + ')';
    }

    @NotNull
    public final TradeItemBean toTradeItemBean() {
        String strM66668h = C27041f.m66668h(this.symbol);
        TradeItemBean tradeItemBean = new TradeItemBean(strM66668h);
        BigDecimal bigDecimal = this.lastPrice;
        tradeItemBean.setLastDealPrice(bigDecimal != null ? bigDecimal.doubleValue() : 0.0d);
        BigDecimal bigDecimal2 = this.last24HourRate;
        tradeItemBean.setChangeRate(bigDecimal2 != null ? Double.valueOf(bigDecimal2.doubleValue()) : Double.valueOf(0.0d));
        Integer num = this.symbolMark;
        if (num != null) {
            tradeItemBean.setMark(num.intValue());
        }
        String str = this.symbolLabel;
        if (str != null) {
            tradeItemBean.setCoinLabel(str);
        }
        Boolean bool = this.favoritePersonal;
        if (bool != null) {
            tradeItemBean.setFavor(bool.booleanValue());
        }
        Boolean bool2 = this.callAuctionSymbol;
        if (bool2 != null) {
            tradeItemBean.isEnableAuctionTrade = bool2.booleanValue();
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM66668h);
        if (symbolInfoEntityM85601B != null) {
            Boolean bool3 = this.tradingEnabled;
            if (bool3 != null) {
                symbolInfoEntityM85601B.setEnableTrading(bool3.booleanValue());
            }
            Boolean bool4 = this.tradingSoonEnabled;
            if (bool4 != null) {
                symbolInfoEntityM85601B.setPreviewEnableShow(bool4.booleanValue());
            }
            Boolean bool5 = this.marginEnabled;
            if (bool5 != null) {
                symbolInfoEntityM85601B.setMarginEnabled(bool5.booleanValue());
            }
            Boolean bool6 = this.isolatedEnabled;
            if (bool6 != null) {
                symbolInfoEntityM85601B.setIsolatedMarginEnabled(bool6.booleanValue());
            }
            Boolean bool7 = this.callAuctionSymbol;
            if (bool7 != null) {
                symbolInfoEntityM85601B.setEnableAuctionTrade(Boolean.valueOf(bool7.booleanValue()));
            }
            tradeItemBean.setSymbolInfoEntity(symbolInfoEntityM85601B);
        }
        return tradeItemBean;
    }

    public /* synthetic */ SidebarDataItemEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : bool3, (i11 & 256) != 0 ? null : bool4, (i11 & 512) != 0 ? null : bool5, (i11 & 1024) != 0 ? null : bool6);
    }
}
