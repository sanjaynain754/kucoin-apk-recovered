package com.kubi.tradingbotkit.widget.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RobotWidgetEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\u009c\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0007HÖ\u0001J\t\u0010V\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010&\u001a\u0004\b/\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b0\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+¨\u0006W"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/entity/RobotWidgetEntity;", "", "taskId", "", "userNickName", "", "templateType", "", "currencies", "", "symbols", "profit", "Ljava/math/BigDecimal;", "baseUnitProfit", "profitRate", "profitRateYear", "copyNum", "startTime", "runningSeconds", "hour24ProfitRate", "day7ProfitRate", "direction", "leverage", "profitRateCurves", "Lcom/kubi/tradingbotkit/widget/entity/TaskProfitRateCurve;", "minInvestment", "copyAsset", "maxDrawDown", "compositeScore", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getTaskId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserNickName", "()Ljava/lang/String;", "getTemplateType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrencies", "()Ljava/util/List;", "getSymbols", "getProfit", "()Ljava/math/BigDecimal;", "getBaseUnitProfit", "getProfitRate", "getProfitRateYear", "getCopyNum", "getStartTime", "getRunningSeconds", "getHour24ProfitRate", "getDay7ProfitRate", "getDirection", "getLeverage", "getProfitRateCurves", "getMinInvestment", "getCopyAsset", "getMaxDrawDown", "getCompositeScore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/widget/entity/RobotWidgetEntity;", "equals", "", "other", "hashCode", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RobotWidgetEntity {

    @Nullable
    private final BigDecimal baseUnitProfit;

    @Nullable
    private final BigDecimal compositeScore;

    @Nullable
    private final BigDecimal copyAsset;

    @Nullable
    private final Integer copyNum;

    @Nullable
    private final List<String> currencies;

    @Nullable
    private final BigDecimal day7ProfitRate;

    @Nullable
    private final String direction;

    @Nullable
    private final BigDecimal hour24ProfitRate;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal maxDrawDown;

    @Nullable
    private final BigDecimal minInvestment;

    @Nullable
    private final BigDecimal profit;

    @Nullable
    private final BigDecimal profitRate;

    @Nullable
    private final List<TaskProfitRateCurve> profitRateCurves;

    @Nullable
    private final BigDecimal profitRateYear;

    @Nullable
    private final Long runningSeconds;

    @Nullable
    private final Long startTime;

    @Nullable
    private final List<String> symbols;

    @Nullable
    private final Long taskId;

    @Nullable
    private final Integer templateType;

    @Nullable
    private final String userNickName;

    public RobotWidgetEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RobotWidgetEntity copy$default(RobotWidgetEntity robotWidgetEntity, Long l11, String str, Integer num, List list, List list2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num2, Long l12, Long l13, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str2, BigDecimal bigDecimal7, List list3, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, int i11, Object obj) {
        BigDecimal bigDecimal12;
        BigDecimal bigDecimal13;
        Long l14 = (i11 & 1) != 0 ? robotWidgetEntity.taskId : l11;
        String str3 = (i11 & 2) != 0 ? robotWidgetEntity.userNickName : str;
        Integer num3 = (i11 & 4) != 0 ? robotWidgetEntity.templateType : num;
        List list4 = (i11 & 8) != 0 ? robotWidgetEntity.currencies : list;
        List list5 = (i11 & 16) != 0 ? robotWidgetEntity.symbols : list2;
        BigDecimal bigDecimal14 = (i11 & 32) != 0 ? robotWidgetEntity.profit : bigDecimal;
        BigDecimal bigDecimal15 = (i11 & 64) != 0 ? robotWidgetEntity.baseUnitProfit : bigDecimal2;
        BigDecimal bigDecimal16 = (i11 & 128) != 0 ? robotWidgetEntity.profitRate : bigDecimal3;
        BigDecimal bigDecimal17 = (i11 & 256) != 0 ? robotWidgetEntity.profitRateYear : bigDecimal4;
        Integer num4 = (i11 & 512) != 0 ? robotWidgetEntity.copyNum : num2;
        Long l15 = (i11 & 1024) != 0 ? robotWidgetEntity.startTime : l12;
        Long l16 = (i11 & 2048) != 0 ? robotWidgetEntity.runningSeconds : l13;
        BigDecimal bigDecimal18 = (i11 & 4096) != 0 ? robotWidgetEntity.hour24ProfitRate : bigDecimal5;
        BigDecimal bigDecimal19 = (i11 & 8192) != 0 ? robotWidgetEntity.day7ProfitRate : bigDecimal6;
        Long l17 = l14;
        String str4 = (i11 & 16384) != 0 ? robotWidgetEntity.direction : str2;
        BigDecimal bigDecimal20 = (i11 & 32768) != 0 ? robotWidgetEntity.leverage : bigDecimal7;
        List list6 = (i11 & 65536) != 0 ? robotWidgetEntity.profitRateCurves : list3;
        BigDecimal bigDecimal21 = (i11 & 131072) != 0 ? robotWidgetEntity.minInvestment : bigDecimal8;
        BigDecimal bigDecimal22 = (i11 & 262144) != 0 ? robotWidgetEntity.copyAsset : bigDecimal9;
        BigDecimal bigDecimal23 = (i11 & 524288) != 0 ? robotWidgetEntity.maxDrawDown : bigDecimal10;
        if ((i11 & 1048576) != 0) {
            bigDecimal13 = bigDecimal23;
            bigDecimal12 = robotWidgetEntity.compositeScore;
        } else {
            bigDecimal12 = bigDecimal11;
            bigDecimal13 = bigDecimal23;
        }
        return robotWidgetEntity.copy(l17, str3, num3, list4, list5, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, num4, l15, l16, bigDecimal18, bigDecimal19, str4, bigDecimal20, list6, bigDecimal21, bigDecimal22, bigDecimal13, bigDecimal12);
    }

    @NotNull
    public final RobotWidgetEntity copy(@Nullable Long taskId, @Nullable String userNickName, @Nullable Integer templateType, @Nullable List<String> currencies, @Nullable List<String> symbols, @Nullable BigDecimal profit, @Nullable BigDecimal baseUnitProfit, @Nullable BigDecimal profitRate, @Nullable BigDecimal profitRateYear, @Nullable Integer copyNum, @Nullable Long startTime, @Nullable Long runningSeconds, @Nullable BigDecimal hour24ProfitRate, @Nullable BigDecimal day7ProfitRate, @Nullable String direction, @Nullable BigDecimal leverage, @Nullable List<TaskProfitRateCurve> profitRateCurves, @Nullable BigDecimal minInvestment, @Nullable BigDecimal copyAsset, @Nullable BigDecimal maxDrawDown, @Nullable BigDecimal compositeScore) {
        return new RobotWidgetEntity(taskId, userNickName, templateType, currencies, symbols, profit, baseUnitProfit, profitRate, profitRateYear, copyNum, startTime, runningSeconds, hour24ProfitRate, day7ProfitRate, direction, leverage, profitRateCurves, minInvestment, copyAsset, maxDrawDown, compositeScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobotWidgetEntity)) {
            return false;
        }
        RobotWidgetEntity robotWidgetEntity = (RobotWidgetEntity) other;
        return Intrinsics.areEqual(this.taskId, robotWidgetEntity.taskId) && Intrinsics.areEqual(this.userNickName, robotWidgetEntity.userNickName) && Intrinsics.areEqual(this.templateType, robotWidgetEntity.templateType) && Intrinsics.areEqual(this.currencies, robotWidgetEntity.currencies) && Intrinsics.areEqual(this.symbols, robotWidgetEntity.symbols) && Intrinsics.areEqual(this.profit, robotWidgetEntity.profit) && Intrinsics.areEqual(this.baseUnitProfit, robotWidgetEntity.baseUnitProfit) && Intrinsics.areEqual(this.profitRate, robotWidgetEntity.profitRate) && Intrinsics.areEqual(this.profitRateYear, robotWidgetEntity.profitRateYear) && Intrinsics.areEqual(this.copyNum, robotWidgetEntity.copyNum) && Intrinsics.areEqual(this.startTime, robotWidgetEntity.startTime) && Intrinsics.areEqual(this.runningSeconds, robotWidgetEntity.runningSeconds) && Intrinsics.areEqual(this.hour24ProfitRate, robotWidgetEntity.hour24ProfitRate) && Intrinsics.areEqual(this.day7ProfitRate, robotWidgetEntity.day7ProfitRate) && Intrinsics.areEqual(this.direction, robotWidgetEntity.direction) && Intrinsics.areEqual(this.leverage, robotWidgetEntity.leverage) && Intrinsics.areEqual(this.profitRateCurves, robotWidgetEntity.profitRateCurves) && Intrinsics.areEqual(this.minInvestment, robotWidgetEntity.minInvestment) && Intrinsics.areEqual(this.copyAsset, robotWidgetEntity.copyAsset) && Intrinsics.areEqual(this.maxDrawDown, robotWidgetEntity.maxDrawDown) && Intrinsics.areEqual(this.compositeScore, robotWidgetEntity.compositeScore);
    }

    public RobotWidgetEntity(@Nullable Long l11, @Nullable String str, @Nullable Integer num, @Nullable List<String> list, @Nullable List<String> list2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Integer num2, @Nullable Long l12, @Nullable Long l13, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str2, @Nullable BigDecimal bigDecimal7, @Nullable List<TaskProfitRateCurve> list3, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11) {
        this.taskId = l11;
        this.userNickName = str;
        this.templateType = num;
        this.currencies = list;
        this.symbols = list2;
        this.profit = bigDecimal;
        this.baseUnitProfit = bigDecimal2;
        this.profitRate = bigDecimal3;
        this.profitRateYear = bigDecimal4;
        this.copyNum = num2;
        this.startTime = l12;
        this.runningSeconds = l13;
        this.hour24ProfitRate = bigDecimal5;
        this.day7ProfitRate = bigDecimal6;
        this.direction = str2;
        this.leverage = bigDecimal7;
        this.profitRateCurves = list3;
        this.minInvestment = bigDecimal8;
        this.copyAsset = bigDecimal9;
        this.maxDrawDown = bigDecimal10;
        this.compositeScore = bigDecimal11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCopyNum() {
        return this.copyNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getRunningSeconds() {
        return this.runningSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getHour24ProfitRate() {
        return this.hour24ProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getDay7ProfitRate() {
        return this.day7ProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final List<TaskProfitRateCurve> component17() {
        return this.profitRateCurves;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getMinInvestment() {
        return this.minInvestment;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getCopyAsset() {
        return this.copyAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserNickName() {
        return this.userNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getMaxDrawDown() {
        return this.maxDrawDown;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getCompositeScore() {
        return this.compositeScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public final List<String> component4() {
        return this.currencies;
    }

    @Nullable
    public final List<String> component5() {
        return this.symbols;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getProfit() {
        return this.profit;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getBaseUnitProfit() {
        return this.baseUnitProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getProfitRateYear() {
        return this.profitRateYear;
    }

    @Nullable
    public final BigDecimal getBaseUnitProfit() {
        return this.baseUnitProfit;
    }

    @Nullable
    public final BigDecimal getCompositeScore() {
        return this.compositeScore;
    }

    @Nullable
    public final BigDecimal getCopyAsset() {
        return this.copyAsset;
    }

    @Nullable
    public final Integer getCopyNum() {
        return this.copyNum;
    }

    @Nullable
    public final List<String> getCurrencies() {
        return this.currencies;
    }

    @Nullable
    public final BigDecimal getDay7ProfitRate() {
        return this.day7ProfitRate;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final BigDecimal getHour24ProfitRate() {
        return this.hour24ProfitRate;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getMaxDrawDown() {
        return this.maxDrawDown;
    }

    @Nullable
    public final BigDecimal getMinInvestment() {
        return this.minInvestment;
    }

    @Nullable
    public final BigDecimal getProfit() {
        return this.profit;
    }

    @Nullable
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    public final List<TaskProfitRateCurve> getProfitRateCurves() {
        return this.profitRateCurves;
    }

    @Nullable
    public final BigDecimal getProfitRateYear() {
        return this.profitRateYear;
    }

    @Nullable
    public final Long getRunningSeconds() {
        return this.runningSeconds;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final List<String> getSymbols() {
        return this.symbols;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final Integer getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public final String getUserNickName() {
        return this.userNickName;
    }

    public int hashCode() {
        Long l11 = this.taskId;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.userNickName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.templateType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.currencies;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.symbols;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BigDecimal bigDecimal = this.profit;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.baseUnitProfit;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.profitRate;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.profitRateYear;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Integer num2 = this.copyNum;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.startTime;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.runningSeconds;
        int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.hour24ProfitRate;
        int iHashCode13 = (iHashCode12 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.day7ProfitRate;
        int iHashCode14 = (iHashCode13 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str2 = this.direction;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.leverage;
        int iHashCode16 = (iHashCode15 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        List<TaskProfitRateCurve> list3 = this.profitRateCurves;
        int iHashCode17 = (iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.minInvestment;
        int iHashCode18 = (iHashCode17 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.copyAsset;
        int iHashCode19 = (iHashCode18 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.maxDrawDown;
        int iHashCode20 = (iHashCode19 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.compositeScore;
        return iHashCode20 + (bigDecimal11 != null ? bigDecimal11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RobotWidgetEntity(taskId=" + this.taskId + ", userNickName=" + this.userNickName + ", templateType=" + this.templateType + ", currencies=" + this.currencies + ", symbols=" + this.symbols + ", profit=" + this.profit + ", baseUnitProfit=" + this.baseUnitProfit + ", profitRate=" + this.profitRate + ", profitRateYear=" + this.profitRateYear + ", copyNum=" + this.copyNum + ", startTime=" + this.startTime + ", runningSeconds=" + this.runningSeconds + ", hour24ProfitRate=" + this.hour24ProfitRate + ", day7ProfitRate=" + this.day7ProfitRate + ", direction=" + this.direction + ", leverage=" + this.leverage + ", profitRateCurves=" + this.profitRateCurves + ", minInvestment=" + this.minInvestment + ", copyAsset=" + this.copyAsset + ", maxDrawDown=" + this.maxDrawDown + ", compositeScore=" + this.compositeScore + ')';
    }

    public /* synthetic */ RobotWidgetEntity(Long l11, String str, Integer num, List list, List list2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num2, Long l12, Long l13, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str2, BigDecimal bigDecimal7, List list3, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : list2, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : num2, (i11 & 1024) != 0 ? null : l12, (i11 & 2048) != 0 ? null : l13, (i11 & 4096) != 0 ? null : bigDecimal5, (i11 & 8192) != 0 ? null : bigDecimal6, (i11 & 16384) != 0 ? null : str2, (i11 & 32768) != 0 ? null : bigDecimal7, (i11 & 65536) != 0 ? null : list3, (i11 & 131072) != 0 ? null : bigDecimal8, (i11 & 262144) != 0 ? null : bigDecimal9, (i11 & 524288) != 0 ? null : bigDecimal10, (i11 & 1048576) != 0 ? null : bigDecimal11);
    }
}
