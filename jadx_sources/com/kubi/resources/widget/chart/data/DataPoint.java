package com.kubi.resources.widget.chart.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataPoint.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bS\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\t\u0010_\u001a\u00020\u0011HÆ\u0003J\t\u0010`\u001a\u00020\u000fHÆ\u0003J\t\u0010a\u001a\u00020\u000fHÆ\u0003J\t\u0010b\u001a\u00020\u0018HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010HJ\t\u0010e\u001a\u00020\u0011HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003Jì\u0001\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\u00072\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020\u0003HÖ\u0001J\t\u0010m\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010%R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010%\"\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010(R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010(R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010%\"\u0004\b-\u0010(R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010%\"\u0004\b.\u0010(R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\"\"\u0004\bE\u0010FR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010FR\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010F¨\u0006n"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/DataPoint;", "", "index", "", "value", "", "isMax", "", "isMin", "needShowTip", "needShowPoint", "needShowSelectLine", "isAnimatedSolidPoint", "isAnimatedPoint", "animationProgress", "", "selectText1", "", "selectOriginalText1", "selectText2", "normalText", "screenPositionX", "screenPositionY", "tipGravity", "Lcom/kubi/resources/widget/chart/data/TipGravity;", "isDepositOrWithdraw", "time", "", "depositOrWithdrawAmount", "period", "periodType", "<init>", "(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;II)V", "getIndex", "()I", "getValue", "()D", "()Z", "getNeedShowTip", "setNeedShowTip", "(Z)V", "getNeedShowPoint", "setNeedShowPoint", "getNeedShowSelectLine", "setNeedShowSelectLine", "setAnimatedSolidPoint", "setAnimatedPoint", "getAnimationProgress", "()F", "setAnimationProgress", "(F)V", "getSelectText1", "()Ljava/lang/String;", "setSelectText1", "(Ljava/lang/String;)V", "getSelectOriginalText1", "setSelectOriginalText1", "getSelectText2", "setSelectText2", "getNormalText", "setNormalText", "getScreenPositionX", "setScreenPositionX", "getScreenPositionY", "setScreenPositionY", "getTipGravity", "()Lcom/kubi/resources/widget/chart/data/TipGravity;", "setTipGravity", "(Lcom/kubi/resources/widget/chart/data/TipGravity;)V", "setDepositOrWithdraw", "(I)V", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDepositOrWithdrawAmount", "setDepositOrWithdrawAmount", "getPeriod", "setPeriod", "getPeriodType", "setPeriodType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;II)Lcom/kubi/resources/widget/chart/data/DataPoint;", "equals", "other", "hashCode", "toString", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DataPoint {
    private float animationProgress;

    @NotNull
    private String depositOrWithdrawAmount;
    private final int index;
    private boolean isAnimatedPoint;
    private boolean isAnimatedSolidPoint;
    private int isDepositOrWithdraw;
    private final boolean isMax;
    private final boolean isMin;
    private boolean needShowPoint;
    private boolean needShowSelectLine;
    private boolean needShowTip;

    @NotNull
    private String normalText;
    private int period;
    private int periodType;
    private float screenPositionX;
    private float screenPositionY;

    @NotNull
    private String selectOriginalText1;

    @NotNull
    private String selectText1;

    @NotNull
    private String selectText2;

    @Nullable
    private Long time;

    @NotNull
    private TipGravity tipGravity;
    private final double value;

    public DataPoint() {
        this(0, 0.0d, false, false, false, false, false, false, false, 0.0f, null, null, null, null, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4194303, null);
    }

    public static /* synthetic */ DataPoint copy$default(DataPoint dataPoint, int i11, double d11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, float f11, String str, String str2, String str3, String str4, float f12, float f13, TipGravity tipGravity, int i12, Long l11, String str5, int i13, int i14, int i15, Object obj) {
        int i16;
        int i17;
        int i18 = (i15 & 1) != 0 ? dataPoint.index : i11;
        double d12 = (i15 & 2) != 0 ? dataPoint.value : d11;
        boolean z18 = (i15 & 4) != 0 ? dataPoint.isMax : z11;
        boolean z19 = (i15 & 8) != 0 ? dataPoint.isMin : z12;
        boolean z21 = (i15 & 16) != 0 ? dataPoint.needShowTip : z13;
        boolean z22 = (i15 & 32) != 0 ? dataPoint.needShowPoint : z14;
        boolean z23 = (i15 & 64) != 0 ? dataPoint.needShowSelectLine : z15;
        boolean z24 = (i15 & 128) != 0 ? dataPoint.isAnimatedSolidPoint : z16;
        boolean z25 = (i15 & 256) != 0 ? dataPoint.isAnimatedPoint : z17;
        float f14 = (i15 & 512) != 0 ? dataPoint.animationProgress : f11;
        String str6 = (i15 & 1024) != 0 ? dataPoint.selectText1 : str;
        String str7 = (i15 & 2048) != 0 ? dataPoint.selectOriginalText1 : str2;
        String str8 = (i15 & 4096) != 0 ? dataPoint.selectText2 : str3;
        int i19 = i18;
        String str9 = (i15 & 8192) != 0 ? dataPoint.normalText : str4;
        float f15 = (i15 & 16384) != 0 ? dataPoint.screenPositionX : f12;
        float f16 = (i15 & 32768) != 0 ? dataPoint.screenPositionY : f13;
        TipGravity tipGravity2 = (i15 & 65536) != 0 ? dataPoint.tipGravity : tipGravity;
        int i21 = (i15 & 131072) != 0 ? dataPoint.isDepositOrWithdraw : i12;
        Long l12 = (i15 & 262144) != 0 ? dataPoint.time : l11;
        String str10 = (i15 & 524288) != 0 ? dataPoint.depositOrWithdrawAmount : str5;
        int i22 = (i15 & 1048576) != 0 ? dataPoint.period : i13;
        if ((i15 & 2097152) != 0) {
            i17 = i22;
            i16 = dataPoint.periodType;
        } else {
            i16 = i14;
            i17 = i22;
        }
        return dataPoint.copy(i19, d12, z18, z19, z21, z22, z23, z24, z25, f14, str6, str7, str8, str9, f15, f16, tipGravity2, i21, l12, str10, i17, i16);
    }

    @NotNull
    public final DataPoint copy(int index, double value, boolean isMax, boolean isMin, boolean needShowTip, boolean needShowPoint, boolean needShowSelectLine, boolean isAnimatedSolidPoint, boolean isAnimatedPoint, float animationProgress, @NotNull String selectText1, @NotNull String selectOriginalText1, @NotNull String selectText2, @NotNull String normalText, float screenPositionX, float screenPositionY, @NotNull TipGravity tipGravity, int isDepositOrWithdraw, @Nullable Long time, @NotNull String depositOrWithdrawAmount, int period, int periodType) {
        Intrinsics.checkNotNullParameter(selectText1, "selectText1");
        Intrinsics.checkNotNullParameter(selectOriginalText1, "selectOriginalText1");
        Intrinsics.checkNotNullParameter(selectText2, "selectText2");
        Intrinsics.checkNotNullParameter(normalText, "normalText");
        Intrinsics.checkNotNullParameter(tipGravity, "tipGravity");
        Intrinsics.checkNotNullParameter(depositOrWithdrawAmount, "depositOrWithdrawAmount");
        return new DataPoint(index, value, isMax, isMin, needShowTip, needShowPoint, needShowSelectLine, isAnimatedSolidPoint, isAnimatedPoint, animationProgress, selectText1, selectOriginalText1, selectText2, normalText, screenPositionX, screenPositionY, tipGravity, isDepositOrWithdraw, time, depositOrWithdrawAmount, period, periodType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPoint)) {
            return false;
        }
        DataPoint dataPoint = (DataPoint) other;
        return this.index == dataPoint.index && Double.compare(this.value, dataPoint.value) == 0 && this.isMax == dataPoint.isMax && this.isMin == dataPoint.isMin && this.needShowTip == dataPoint.needShowTip && this.needShowPoint == dataPoint.needShowPoint && this.needShowSelectLine == dataPoint.needShowSelectLine && this.isAnimatedSolidPoint == dataPoint.isAnimatedSolidPoint && this.isAnimatedPoint == dataPoint.isAnimatedPoint && Float.compare(this.animationProgress, dataPoint.animationProgress) == 0 && Intrinsics.areEqual(this.selectText1, dataPoint.selectText1) && Intrinsics.areEqual(this.selectOriginalText1, dataPoint.selectOriginalText1) && Intrinsics.areEqual(this.selectText2, dataPoint.selectText2) && Intrinsics.areEqual(this.normalText, dataPoint.normalText) && Float.compare(this.screenPositionX, dataPoint.screenPositionX) == 0 && Float.compare(this.screenPositionY, dataPoint.screenPositionY) == 0 && this.tipGravity == dataPoint.tipGravity && this.isDepositOrWithdraw == dataPoint.isDepositOrWithdraw && Intrinsics.areEqual(this.time, dataPoint.time) && Intrinsics.areEqual(this.depositOrWithdrawAmount, dataPoint.depositOrWithdrawAmount) && this.period == dataPoint.period && this.periodType == dataPoint.periodType;
    }

    public DataPoint(int i11, double d11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, float f11, @NotNull String selectText1, @NotNull String selectOriginalText1, @NotNull String selectText2, @NotNull String normalText, float f12, float f13, @NotNull TipGravity tipGravity, int i12, @Nullable Long l11, @NotNull String depositOrWithdrawAmount, int i13, int i14) {
        Intrinsics.checkNotNullParameter(selectText1, "selectText1");
        Intrinsics.checkNotNullParameter(selectOriginalText1, "selectOriginalText1");
        Intrinsics.checkNotNullParameter(selectText2, "selectText2");
        Intrinsics.checkNotNullParameter(normalText, "normalText");
        Intrinsics.checkNotNullParameter(tipGravity, "tipGravity");
        Intrinsics.checkNotNullParameter(depositOrWithdrawAmount, "depositOrWithdrawAmount");
        this.index = i11;
        this.value = d11;
        this.isMax = z11;
        this.isMin = z12;
        this.needShowTip = z13;
        this.needShowPoint = z14;
        this.needShowSelectLine = z15;
        this.isAnimatedSolidPoint = z16;
        this.isAnimatedPoint = z17;
        this.animationProgress = f11;
        this.selectText1 = selectText1;
        this.selectOriginalText1 = selectOriginalText1;
        this.selectText2 = selectText2;
        this.normalText = normalText;
        this.screenPositionX = f12;
        this.screenPositionY = f13;
        this.tipGravity = tipGravity;
        this.isDepositOrWithdraw = i12;
        this.time = l11;
        this.depositOrWithdrawAmount = depositOrWithdrawAmount;
        this.period = i13;
        this.periodType = i14;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getAnimationProgress() {
        return this.animationProgress;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSelectText1() {
        return this.selectText1;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSelectOriginalText1() {
        return this.selectOriginalText1;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSelectText2() {
        return this.selectText2;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNormalText() {
        return this.normalText;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getScreenPositionX() {
        return this.screenPositionX;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getScreenPositionY() {
        return this.screenPositionY;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TipGravity getTipGravity() {
        return this.tipGravity;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getIsDepositOrWithdraw() {
        return this.isDepositOrWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDepositOrWithdrawAmount() {
        return this.depositOrWithdrawAmount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getPeriodType() {
        return this.periodType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMax() {
        return this.isMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMin() {
        return this.isMin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNeedShowTip() {
        return this.needShowTip;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedShowPoint() {
        return this.needShowPoint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNeedShowSelectLine() {
        return this.needShowSelectLine;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsAnimatedSolidPoint() {
        return this.isAnimatedSolidPoint;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAnimatedPoint() {
        return this.isAnimatedPoint;
    }

    public final float getAnimationProgress() {
        return this.animationProgress;
    }

    @NotNull
    public final String getDepositOrWithdrawAmount() {
        return this.depositOrWithdrawAmount;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getNeedShowPoint() {
        return this.needShowPoint;
    }

    public final boolean getNeedShowSelectLine() {
        return this.needShowSelectLine;
    }

    public final boolean getNeedShowTip() {
        return this.needShowTip;
    }

    @NotNull
    public final String getNormalText() {
        return this.normalText;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final int getPeriodType() {
        return this.periodType;
    }

    public final float getScreenPositionX() {
        return this.screenPositionX;
    }

    public final float getScreenPositionY() {
        return this.screenPositionY;
    }

    @NotNull
    public final String getSelectOriginalText1() {
        return this.selectOriginalText1;
    }

    @NotNull
    public final String getSelectText1() {
        return this.selectText1;
    }

    @NotNull
    public final String getSelectText2() {
        return this.selectText2;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final TipGravity getTipGravity() {
        return this.tipGravity;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((Integer.hashCode(this.index) * 31) + Double.hashCode(this.value)) * 31) + Boolean.hashCode(this.isMax)) * 31) + Boolean.hashCode(this.isMin)) * 31) + Boolean.hashCode(this.needShowTip)) * 31) + Boolean.hashCode(this.needShowPoint)) * 31) + Boolean.hashCode(this.needShowSelectLine)) * 31) + Boolean.hashCode(this.isAnimatedSolidPoint)) * 31) + Boolean.hashCode(this.isAnimatedPoint)) * 31) + Float.hashCode(this.animationProgress)) * 31) + this.selectText1.hashCode()) * 31) + this.selectOriginalText1.hashCode()) * 31) + this.selectText2.hashCode()) * 31) + this.normalText.hashCode()) * 31) + Float.hashCode(this.screenPositionX)) * 31) + Float.hashCode(this.screenPositionY)) * 31) + this.tipGravity.hashCode()) * 31) + Integer.hashCode(this.isDepositOrWithdraw)) * 31;
        Long l11 = this.time;
        return ((((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + this.depositOrWithdrawAmount.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + Integer.hashCode(this.periodType);
    }

    public final boolean isAnimatedPoint() {
        return this.isAnimatedPoint;
    }

    public final boolean isAnimatedSolidPoint() {
        return this.isAnimatedSolidPoint;
    }

    public final int isDepositOrWithdraw() {
        return this.isDepositOrWithdraw;
    }

    public final boolean isMax() {
        return this.isMax;
    }

    public final boolean isMin() {
        return this.isMin;
    }

    public final void setAnimatedPoint(boolean z11) {
        this.isAnimatedPoint = z11;
    }

    public final void setAnimatedSolidPoint(boolean z11) {
        this.isAnimatedSolidPoint = z11;
    }

    public final void setAnimationProgress(float f11) {
        this.animationProgress = f11;
    }

    public final void setDepositOrWithdraw(int i11) {
        this.isDepositOrWithdraw = i11;
    }

    public final void setDepositOrWithdrawAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.depositOrWithdrawAmount = str;
    }

    public final void setNeedShowPoint(boolean z11) {
        this.needShowPoint = z11;
    }

    public final void setNeedShowSelectLine(boolean z11) {
        this.needShowSelectLine = z11;
    }

    public final void setNeedShowTip(boolean z11) {
        this.needShowTip = z11;
    }

    public final void setNormalText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.normalText = str;
    }

    public final void setPeriod(int i11) {
        this.period = i11;
    }

    public final void setPeriodType(int i11) {
        this.periodType = i11;
    }

    public final void setScreenPositionX(float f11) {
        this.screenPositionX = f11;
    }

    public final void setScreenPositionY(float f11) {
        this.screenPositionY = f11;
    }

    public final void setSelectOriginalText1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectOriginalText1 = str;
    }

    public final void setSelectText1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectText1 = str;
    }

    public final void setSelectText2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectText2 = str;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    public final void setTipGravity(@NotNull TipGravity tipGravity) {
        Intrinsics.checkNotNullParameter(tipGravity, "<set-?>");
        this.tipGravity = tipGravity;
    }

    @NotNull
    public String toString() {
        return "DataPoint(index=" + this.index + ", value=" + this.value + ", isMax=" + this.isMax + ", isMin=" + this.isMin + ", needShowTip=" + this.needShowTip + ", needShowPoint=" + this.needShowPoint + ", needShowSelectLine=" + this.needShowSelectLine + ", isAnimatedSolidPoint=" + this.isAnimatedSolidPoint + ", isAnimatedPoint=" + this.isAnimatedPoint + ", animationProgress=" + this.animationProgress + ", selectText1=" + this.selectText1 + ", selectOriginalText1=" + this.selectOriginalText1 + ", selectText2=" + this.selectText2 + ", normalText=" + this.normalText + ", screenPositionX=" + this.screenPositionX + ", screenPositionY=" + this.screenPositionY + ", tipGravity=" + this.tipGravity + ", isDepositOrWithdraw=" + this.isDepositOrWithdraw + ", time=" + this.time + ", depositOrWithdrawAmount=" + this.depositOrWithdrawAmount + ", period=" + this.period + ", periodType=" + this.periodType + ')';
    }

    public /* synthetic */ DataPoint(int i11, double d11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, float f11, String str, String str2, String str3, String str4, float f12, float f13, TipGravity tipGravity, int i12, Long l11, String str5, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0.0d : d11, (i15 & 4) != 0 ? false : z11, (i15 & 8) != 0 ? false : z12, (i15 & 16) != 0 ? false : z13, (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? false : z16, (i15 & 256) != 0 ? false : z17, (i15 & 512) != 0 ? 0.0f : f11, (i15 & 1024) != 0 ? "" : str, (i15 & 2048) != 0 ? "" : str2, (i15 & 4096) != 0 ? "" : str3, (i15 & 8192) != 0 ? "" : str4, (i15 & 16384) != 0 ? 0.0f : f12, (i15 & 32768) != 0 ? 0.0f : f13, (i15 & 65536) != 0 ? TipGravity.BOTTOM : tipGravity, (i15 & 131072) != 0 ? 0 : i12, (i15 & 262144) != 0 ? null : l11, (i15 & 524288) == 0 ? str5 : "", (i15 & 1048576) != 0 ? 0 : i13, (i15 & 2097152) != 0 ? 0 : i14);
    }
}
