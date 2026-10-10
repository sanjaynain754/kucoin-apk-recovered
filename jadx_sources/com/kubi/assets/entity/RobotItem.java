package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\tHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, m90084d2 = {"Lcom/kubi/assets/entity/RobotItem;", "", "id", "", "symbol", "totalCost", "totalProfit", "totalProfitRate", "type", "", "direction", "leverage", "i18nType", "name", "quota", "symbolCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getTotalCost", "getTotalProfit", "getTotalProfitRate", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDirection", "getLeverage", "getI18nType", "getName", "getQuota", "getSymbolCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/RobotItem;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RobotItem {

    @Nullable
    private final String direction;

    @Nullable
    private final String i18nType;

    @Nullable
    private final String id;

    @Nullable
    private final String leverage;

    @Nullable
    private final String name;

    @Nullable
    private final String quota;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final String totalCost;

    @Nullable
    private final String totalProfit;

    @Nullable
    private final String totalProfitRate;

    @Nullable
    private final Integer type;

    public RobotItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobotItem)) {
            return false;
        }
        RobotItem robotItem = (RobotItem) other;
        return Intrinsics.areEqual(this.id, robotItem.id) && Intrinsics.areEqual(this.symbol, robotItem.symbol) && Intrinsics.areEqual(this.totalCost, robotItem.totalCost) && Intrinsics.areEqual(this.totalProfit, robotItem.totalProfit) && Intrinsics.areEqual(this.totalProfitRate, robotItem.totalProfitRate) && Intrinsics.areEqual(this.type, robotItem.type) && Intrinsics.areEqual(this.direction, robotItem.direction) && Intrinsics.areEqual(this.leverage, robotItem.leverage) && Intrinsics.areEqual(this.i18nType, robotItem.i18nType) && Intrinsics.areEqual(this.name, robotItem.name) && Intrinsics.areEqual(this.quota, robotItem.quota) && Intrinsics.areEqual(this.symbolCode, robotItem.symbolCode);
    }

    public RobotItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.id = str;
        this.symbol = str2;
        this.totalCost = str3;
        this.totalProfit = str4;
        this.totalProfitRate = str5;
        this.type = num;
        this.direction = str6;
        this.leverage = str7;
        this.i18nType = str8;
        this.name = str9;
        this.quota = str10;
        this.symbolCode = str11;
    }

    public static /* synthetic */ RobotItem copy$default(RobotItem robotItem, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = robotItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = robotItem.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = robotItem.totalCost;
        }
        if ((i11 & 8) != 0) {
            str4 = robotItem.totalProfit;
        }
        if ((i11 & 16) != 0) {
            str5 = robotItem.totalProfitRate;
        }
        if ((i11 & 32) != 0) {
            num = robotItem.type;
        }
        if ((i11 & 64) != 0) {
            str6 = robotItem.direction;
        }
        if ((i11 & 128) != 0) {
            str7 = robotItem.leverage;
        }
        if ((i11 & 256) != 0) {
            str8 = robotItem.i18nType;
        }
        if ((i11 & 512) != 0) {
            str9 = robotItem.name;
        }
        if ((i11 & 1024) != 0) {
            str10 = robotItem.quota;
        }
        if ((i11 & 2048) != 0) {
            str11 = robotItem.symbolCode;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        Integer num2 = num;
        return robotItem.copy(str, str2, str3, str4, str18, num2, str16, str17, str14, str15, str12, str13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getQuota() {
        return this.quota;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getI18nType() {
        return this.i18nType;
    }

    @NotNull
    public final RobotItem copy(@Nullable String id2, @Nullable String symbol, @Nullable String totalCost, @Nullable String totalProfit, @Nullable String totalProfitRate, @Nullable Integer type, @Nullable String direction, @Nullable String leverage, @Nullable String i18nType, @Nullable String name, @Nullable String quota, @Nullable String symbolCode) {
        return new RobotItem(id2, symbol, totalCost, totalProfit, totalProfitRate, type, direction, leverage, i18nType, name, quota, symbolCode);
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final String getI18nType() {
        return this.i18nType;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getQuota() {
        return this.quota;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    public final String getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalCost;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalProfit;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalProfitRate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.direction;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.leverage;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i18nType;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.name;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.quota;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.symbolCode;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RobotItem(id=" + this.id + ", symbol=" + this.symbol + ", totalCost=" + this.totalCost + ", totalProfit=" + this.totalProfit + ", totalProfitRate=" + this.totalProfitRate + ", type=" + this.type + ", direction=" + this.direction + ", leverage=" + this.leverage + ", i18nType=" + this.i18nType + ", name=" + this.name + ", quota=" + this.quota + ", symbolCode=" + this.symbolCode + ')';
    }

    public /* synthetic */ RobotItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10, (i11 & 2048) != 0 ? null : str11);
    }
}
