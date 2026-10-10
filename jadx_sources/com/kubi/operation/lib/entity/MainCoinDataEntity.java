package com.kubi.operation.lib.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainCoinDataEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010!¨\u00067"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/MainCoinDataEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "symbol", "coinName", TUIConstants.TUIChat.INPUT_MORE_ICON, FirebaseAnalytics.Param.PRICE, "tag", "changeRate", "volume24h", "displayDataDesc", "trendList", "", "Lcom/kubi/operation/lib/entity/ChartPoint;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "getSymbol", "getCoinName", "getIcon", "getPrice", "getTag", "getChangeRate", "getVolume24h", "getDisplayDataDesc", "getTrendList", "()Ljava/util/List;", "formattedTrendList", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "getFormattedTrendList", "setFormattedTrendList", "(Ljava/util/List;)V", "yLabels", "Lcom/kubi/resources/widget/chart/data/Label;", "getYLabels", "setYLabels", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MainCoinDataEntity {

    @Nullable
    private final String changeRate;

    @Nullable
    private final String coinName;

    @Nullable
    private final String currency;

    @Nullable
    private final String displayDataDesc;

    @Nullable
    private List<DataPoint> formattedTrendList;

    @Nullable
    private final String icon;

    @Nullable
    private final String price;

    @Nullable
    private final String symbol;

    @Nullable
    private final String tag;

    @Nullable
    private final List<ChartPoint> trendList;

    @Nullable
    private final String volume24h;

    @Nullable
    private List<Label> yLabels;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainCoinDataEntity copy$default(MainCoinDataEntity mainCoinDataEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mainCoinDataEntity.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = mainCoinDataEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = mainCoinDataEntity.coinName;
        }
        if ((i11 & 8) != 0) {
            str4 = mainCoinDataEntity.icon;
        }
        if ((i11 & 16) != 0) {
            str5 = mainCoinDataEntity.price;
        }
        if ((i11 & 32) != 0) {
            str6 = mainCoinDataEntity.tag;
        }
        if ((i11 & 64) != 0) {
            str7 = mainCoinDataEntity.changeRate;
        }
        if ((i11 & 128) != 0) {
            str8 = mainCoinDataEntity.volume24h;
        }
        if ((i11 & 256) != 0) {
            str9 = mainCoinDataEntity.displayDataDesc;
        }
        if ((i11 & 512) != 0) {
            list = mainCoinDataEntity.trendList;
        }
        String str10 = str9;
        List list2 = list;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return mainCoinDataEntity.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, list2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainCoinDataEntity)) {
            return false;
        }
        MainCoinDataEntity mainCoinDataEntity = (MainCoinDataEntity) other;
        return Intrinsics.areEqual(this.currency, mainCoinDataEntity.currency) && Intrinsics.areEqual(this.symbol, mainCoinDataEntity.symbol) && Intrinsics.areEqual(this.coinName, mainCoinDataEntity.coinName) && Intrinsics.areEqual(this.icon, mainCoinDataEntity.icon) && Intrinsics.areEqual(this.price, mainCoinDataEntity.price) && Intrinsics.areEqual(this.tag, mainCoinDataEntity.tag) && Intrinsics.areEqual(this.changeRate, mainCoinDataEntity.changeRate) && Intrinsics.areEqual(this.volume24h, mainCoinDataEntity.volume24h) && Intrinsics.areEqual(this.displayDataDesc, mainCoinDataEntity.displayDataDesc) && Intrinsics.areEqual(this.trendList, mainCoinDataEntity.trendList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<ChartPoint> component10() {
        return this.trendList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVolume24h() {
        return this.volume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisplayDataDesc() {
        return this.displayDataDesc;
    }

    @NotNull
    public final MainCoinDataEntity copy(@Nullable String currency, @Nullable String symbol, @Nullable String coinName, @Nullable String icon, @Nullable String price, @Nullable String tag, @Nullable String changeRate, @Nullable String volume24h, @Nullable String displayDataDesc, @Nullable List<ChartPoint> trendList) {
        return new MainCoinDataEntity(currency, symbol, coinName, icon, price, tag, changeRate, volume24h, displayDataDesc, trendList);
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDisplayDataDesc() {
        return this.displayDataDesc;
    }

    @Nullable
    public final List<DataPoint> getFormattedTrendList() {
        return this.formattedTrendList;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final List<ChartPoint> getTrendList() {
        return this.trendList;
    }

    @Nullable
    public final String getVolume24h() {
        return this.volume24h;
    }

    @Nullable
    public final List<Label> getYLabels() {
        return this.yLabels;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coinName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tag;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.changeRate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.volume24h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.displayDataDesc;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<ChartPoint> list = this.trendList;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final void setFormattedTrendList(@Nullable List<DataPoint> list) {
        this.formattedTrendList = list;
    }

    public final void setYLabels(@Nullable List<Label> list) {
        this.yLabels = list;
    }

    @NotNull
    public String toString() {
        return "MainCoinDataEntity(currency=" + this.currency + ", symbol=" + this.symbol + ", coinName=" + this.coinName + ", icon=" + this.icon + ", price=" + this.price + ", tag=" + this.tag + ", changeRate=" + this.changeRate + ", volume24h=" + this.volume24h + ", displayDataDesc=" + this.displayDataDesc + ", trendList=" + this.trendList + ')';
    }

    public MainCoinDataEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<ChartPoint> list) {
        this.currency = str;
        this.symbol = str2;
        this.coinName = str3;
        this.icon = str4;
        this.price = str5;
        this.tag = str6;
        this.changeRate = str7;
        this.volume24h = str8;
        this.displayDataDesc = str9;
        this.trendList = list;
    }
}
