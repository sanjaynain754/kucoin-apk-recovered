package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J×\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010L\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u0007HÖ\u0001J\t\u0010P\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!¨\u0006Q"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "Lcom/kubi/mvi/state/IState;", "floatingWindowSwitch", "", "themeText", "", "floatingWindowBgAlpha", "", "floatingWindowBgAlphaSeekbarProgress", "dataUpdateIntervalTimeText", "displayModeText", "scrollIntervalLayoutVisible", "pageTurningTimeText", "intervalTime", "Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;", "autoScrollTime", "pagingIntervalLayoutVisible", "pageModeText", "pageSizeText", "pageSize", "actionBarShow", "currencyNameShow", "quoteChangeShow", "priceShow", "tradeList", "", "Lcom/kubi/data/entity/TradeItemBean;", "textSizeModeText", "<init>", "(ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;ZLjava/lang/String;Ljava/lang/String;IZZZZLjava/util/List;Ljava/lang/String;)V", "getFloatingWindowSwitch", "()Z", "getThemeText", "()Ljava/lang/String;", "getFloatingWindowBgAlpha", "()I", "getFloatingWindowBgAlphaSeekbarProgress", "getDataUpdateIntervalTimeText", "getDisplayModeText", "getScrollIntervalLayoutVisible", "getPageTurningTimeText", "getIntervalTime", "()Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;", "getAutoScrollTime", "getPagingIntervalLayoutVisible", "getPageModeText", "getPageSizeText", "getPageSize", "getActionBarShow", "getCurrencyNameShow", "getQuoteChangeShow", "getPriceShow", "getTradeList", "()Ljava/util/List;", "getTextSizeModeText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "", "hashCode", "toString", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {
    private final boolean actionBarShow;

    @NotNull
    private final IntervalTime autoScrollTime;
    private final boolean currencyNameShow;

    @NotNull
    private final String dataUpdateIntervalTimeText;

    @NotNull
    private final String displayModeText;
    private final int floatingWindowBgAlpha;
    private final int floatingWindowBgAlphaSeekbarProgress;
    private final boolean floatingWindowSwitch;

    @NotNull
    private final IntervalTime intervalTime;

    @NotNull
    private final String pageModeText;
    private final int pageSize;

    @NotNull
    private final String pageSizeText;

    @NotNull
    private final String pageTurningTimeText;
    private final boolean pagingIntervalLayoutVisible;
    private final boolean priceShow;
    private final boolean quoteChangeShow;
    private final boolean scrollIntervalLayoutVisible;

    @NotNull
    private final String textSizeModeText;

    @NotNull
    private final String themeText;

    @NotNull
    private final List<TradeItemBean> tradeList;

    public UIState() {
        this(false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, boolean z11, String str, int i11, int i12, String str2, String str3, boolean z12, String str4, IntervalTime intervalTime, IntervalTime intervalTime2, boolean z13, String str5, String str6, int i13, boolean z14, boolean z15, boolean z16, boolean z17, List list, String str7, int i14, Object obj) {
        String str8;
        List list2;
        boolean z18 = (i14 & 1) != 0 ? uIState.floatingWindowSwitch : z11;
        String str9 = (i14 & 2) != 0 ? uIState.themeText : str;
        int i15 = (i14 & 4) != 0 ? uIState.floatingWindowBgAlpha : i11;
        int i16 = (i14 & 8) != 0 ? uIState.floatingWindowBgAlphaSeekbarProgress : i12;
        String str10 = (i14 & 16) != 0 ? uIState.dataUpdateIntervalTimeText : str2;
        String str11 = (i14 & 32) != 0 ? uIState.displayModeText : str3;
        boolean z19 = (i14 & 64) != 0 ? uIState.scrollIntervalLayoutVisible : z12;
        String str12 = (i14 & 128) != 0 ? uIState.pageTurningTimeText : str4;
        IntervalTime intervalTime3 = (i14 & 256) != 0 ? uIState.intervalTime : intervalTime;
        IntervalTime intervalTime4 = (i14 & 512) != 0 ? uIState.autoScrollTime : intervalTime2;
        boolean z21 = (i14 & 1024) != 0 ? uIState.pagingIntervalLayoutVisible : z13;
        String str13 = (i14 & 2048) != 0 ? uIState.pageModeText : str5;
        String str14 = (i14 & 4096) != 0 ? uIState.pageSizeText : str6;
        int i17 = (i14 & 8192) != 0 ? uIState.pageSize : i13;
        boolean z22 = z18;
        boolean z23 = (i14 & 16384) != 0 ? uIState.actionBarShow : z14;
        boolean z24 = (i14 & 32768) != 0 ? uIState.currencyNameShow : z15;
        boolean z25 = (i14 & 65536) != 0 ? uIState.quoteChangeShow : z16;
        boolean z26 = (i14 & 131072) != 0 ? uIState.priceShow : z17;
        List list3 = (i14 & 262144) != 0 ? uIState.tradeList : list;
        if ((i14 & 524288) != 0) {
            list2 = list3;
            str8 = uIState.textSizeModeText;
        } else {
            str8 = str7;
            list2 = list3;
        }
        return uIState.copy(z22, str9, i15, i16, str10, str11, z19, str12, intervalTime3, intervalTime4, z21, str13, str14, i17, z23, z24, z25, z26, list2, str8);
    }

    @NotNull
    public final UIState copy(boolean floatingWindowSwitch, @NotNull String themeText, int floatingWindowBgAlpha, int floatingWindowBgAlphaSeekbarProgress, @NotNull String dataUpdateIntervalTimeText, @NotNull String displayModeText, boolean scrollIntervalLayoutVisible, @NotNull String pageTurningTimeText, @NotNull IntervalTime intervalTime, @NotNull IntervalTime autoScrollTime, boolean pagingIntervalLayoutVisible, @NotNull String pageModeText, @NotNull String pageSizeText, int pageSize, boolean actionBarShow, boolean currencyNameShow, boolean quoteChangeShow, boolean priceShow, @NotNull List<? extends TradeItemBean> tradeList, @NotNull String textSizeModeText) {
        Intrinsics.checkNotNullParameter(themeText, "themeText");
        Intrinsics.checkNotNullParameter(dataUpdateIntervalTimeText, "dataUpdateIntervalTimeText");
        Intrinsics.checkNotNullParameter(displayModeText, "displayModeText");
        Intrinsics.checkNotNullParameter(pageTurningTimeText, "pageTurningTimeText");
        Intrinsics.checkNotNullParameter(intervalTime, "intervalTime");
        Intrinsics.checkNotNullParameter(autoScrollTime, "autoScrollTime");
        Intrinsics.checkNotNullParameter(pageModeText, "pageModeText");
        Intrinsics.checkNotNullParameter(pageSizeText, "pageSizeText");
        Intrinsics.checkNotNullParameter(tradeList, "tradeList");
        Intrinsics.checkNotNullParameter(textSizeModeText, "textSizeModeText");
        return new UIState(floatingWindowSwitch, themeText, floatingWindowBgAlpha, floatingWindowBgAlphaSeekbarProgress, dataUpdateIntervalTimeText, displayModeText, scrollIntervalLayoutVisible, pageTurningTimeText, intervalTime, autoScrollTime, pagingIntervalLayoutVisible, pageModeText, pageSizeText, pageSize, actionBarShow, currencyNameShow, quoteChangeShow, priceShow, tradeList, textSizeModeText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.floatingWindowSwitch == uIState.floatingWindowSwitch && Intrinsics.areEqual(this.themeText, uIState.themeText) && this.floatingWindowBgAlpha == uIState.floatingWindowBgAlpha && this.floatingWindowBgAlphaSeekbarProgress == uIState.floatingWindowBgAlphaSeekbarProgress && Intrinsics.areEqual(this.dataUpdateIntervalTimeText, uIState.dataUpdateIntervalTimeText) && Intrinsics.areEqual(this.displayModeText, uIState.displayModeText) && this.scrollIntervalLayoutVisible == uIState.scrollIntervalLayoutVisible && Intrinsics.areEqual(this.pageTurningTimeText, uIState.pageTurningTimeText) && Intrinsics.areEqual(this.intervalTime, uIState.intervalTime) && Intrinsics.areEqual(this.autoScrollTime, uIState.autoScrollTime) && this.pagingIntervalLayoutVisible == uIState.pagingIntervalLayoutVisible && Intrinsics.areEqual(this.pageModeText, uIState.pageModeText) && Intrinsics.areEqual(this.pageSizeText, uIState.pageSizeText) && this.pageSize == uIState.pageSize && this.actionBarShow == uIState.actionBarShow && this.currencyNameShow == uIState.currencyNameShow && this.quoteChangeShow == uIState.quoteChangeShow && this.priceShow == uIState.priceShow && Intrinsics.areEqual(this.tradeList, uIState.tradeList) && Intrinsics.areEqual(this.textSizeModeText, uIState.textSizeModeText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIState(boolean z11, @NotNull String themeText, int i11, int i12, @NotNull String dataUpdateIntervalTimeText, @NotNull String displayModeText, boolean z12, @NotNull String pageTurningTimeText, @NotNull IntervalTime intervalTime, @NotNull IntervalTime autoScrollTime, boolean z13, @NotNull String pageModeText, @NotNull String pageSizeText, int i13, boolean z14, boolean z15, boolean z16, boolean z17, @NotNull List<? extends TradeItemBean> tradeList, @NotNull String textSizeModeText) {
        Intrinsics.checkNotNullParameter(themeText, "themeText");
        Intrinsics.checkNotNullParameter(dataUpdateIntervalTimeText, "dataUpdateIntervalTimeText");
        Intrinsics.checkNotNullParameter(displayModeText, "displayModeText");
        Intrinsics.checkNotNullParameter(pageTurningTimeText, "pageTurningTimeText");
        Intrinsics.checkNotNullParameter(intervalTime, "intervalTime");
        Intrinsics.checkNotNullParameter(autoScrollTime, "autoScrollTime");
        Intrinsics.checkNotNullParameter(pageModeText, "pageModeText");
        Intrinsics.checkNotNullParameter(pageSizeText, "pageSizeText");
        Intrinsics.checkNotNullParameter(tradeList, "tradeList");
        Intrinsics.checkNotNullParameter(textSizeModeText, "textSizeModeText");
        this.floatingWindowSwitch = z11;
        this.themeText = themeText;
        this.floatingWindowBgAlpha = i11;
        this.floatingWindowBgAlphaSeekbarProgress = i12;
        this.dataUpdateIntervalTimeText = dataUpdateIntervalTimeText;
        this.displayModeText = displayModeText;
        this.scrollIntervalLayoutVisible = z12;
        this.pageTurningTimeText = pageTurningTimeText;
        this.intervalTime = intervalTime;
        this.autoScrollTime = autoScrollTime;
        this.pagingIntervalLayoutVisible = z13;
        this.pageModeText = pageModeText;
        this.pageSizeText = pageSizeText;
        this.pageSize = i13;
        this.actionBarShow = z14;
        this.currencyNameShow = z15;
        this.quoteChangeShow = z16;
        this.priceShow = z17;
        this.tradeList = tradeList;
        this.textSizeModeText = textSizeModeText;
    }

    public final boolean getActionBarShow() {
        return this.actionBarShow;
    }

    @NotNull
    public final IntervalTime getAutoScrollTime() {
        return this.autoScrollTime;
    }

    public final boolean getCurrencyNameShow() {
        return this.currencyNameShow;
    }

    @NotNull
    public final String getDataUpdateIntervalTimeText() {
        return this.dataUpdateIntervalTimeText;
    }

    @NotNull
    public final String getDisplayModeText() {
        return this.displayModeText;
    }

    public final int getFloatingWindowBgAlpha() {
        return this.floatingWindowBgAlpha;
    }

    public final int getFloatingWindowBgAlphaSeekbarProgress() {
        return this.floatingWindowBgAlphaSeekbarProgress;
    }

    public final boolean getFloatingWindowSwitch() {
        return this.floatingWindowSwitch;
    }

    @NotNull
    public final IntervalTime getIntervalTime() {
        return this.intervalTime;
    }

    @NotNull
    public final String getPageModeText() {
        return this.pageModeText;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final String getPageSizeText() {
        return this.pageSizeText;
    }

    public final boolean getPagingIntervalLayoutVisible() {
        return this.pagingIntervalLayoutVisible;
    }

    public final boolean getPriceShow() {
        return this.priceShow;
    }

    public final boolean getQuoteChangeShow() {
        return this.quoteChangeShow;
    }

    public final boolean getScrollIntervalLayoutVisible() {
        return this.scrollIntervalLayoutVisible;
    }

    @NotNull
    public final String getTextSizeModeText() {
        return this.textSizeModeText;
    }

    @NotNull
    public final String getThemeText() {
        return this.themeText;
    }

    @NotNull
    public final List<TradeItemBean> getTradeList() {
        return this.tradeList;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.floatingWindowSwitch) * 31) + this.themeText.hashCode()) * 31) + Integer.hashCode(this.floatingWindowBgAlpha)) * 31) + Integer.hashCode(this.floatingWindowBgAlphaSeekbarProgress)) * 31) + this.dataUpdateIntervalTimeText.hashCode()) * 31) + this.displayModeText.hashCode()) * 31) + Boolean.hashCode(this.scrollIntervalLayoutVisible)) * 31) + this.pageTurningTimeText.hashCode()) * 31) + this.intervalTime.hashCode()) * 31) + this.autoScrollTime.hashCode()) * 31) + Boolean.hashCode(this.pagingIntervalLayoutVisible)) * 31) + this.pageModeText.hashCode()) * 31) + this.pageSizeText.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Boolean.hashCode(this.actionBarShow)) * 31) + Boolean.hashCode(this.currencyNameShow)) * 31) + Boolean.hashCode(this.quoteChangeShow)) * 31) + Boolean.hashCode(this.priceShow)) * 31) + this.tradeList.hashCode()) * 31) + this.textSizeModeText.hashCode();
    }

    @NotNull
    public String toString() {
        return "UIState(floatingWindowSwitch=" + this.floatingWindowSwitch + ", themeText=" + this.themeText + ", floatingWindowBgAlpha=" + this.floatingWindowBgAlpha + ", floatingWindowBgAlphaSeekbarProgress=" + this.floatingWindowBgAlphaSeekbarProgress + ", dataUpdateIntervalTimeText=" + this.dataUpdateIntervalTimeText + ", displayModeText=" + this.displayModeText + ", scrollIntervalLayoutVisible=" + this.scrollIntervalLayoutVisible + ", pageTurningTimeText=" + this.pageTurningTimeText + ", intervalTime=" + this.intervalTime + ", autoScrollTime=" + this.autoScrollTime + ", pagingIntervalLayoutVisible=" + this.pagingIntervalLayoutVisible + ", pageModeText=" + this.pageModeText + ", pageSizeText=" + this.pageSizeText + ", pageSize=" + this.pageSize + ", actionBarShow=" + this.actionBarShow + ", currencyNameShow=" + this.currencyNameShow + ", quoteChangeShow=" + this.quoteChangeShow + ", priceShow=" + this.priceShow + ", tradeList=" + this.tradeList + ", textSizeModeText=" + this.textSizeModeText + ')';
    }

    public /* synthetic */ UIState(boolean z11, String str, int i11, int i12, String str2, String str3, boolean z12, String str4, IntervalTime intervalTime, IntervalTime intervalTime2, boolean z13, String str5, String str6, int i13, boolean z14, boolean z15, boolean z16, boolean z17, List list, String str7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? FloatingWindowConfigManager.f34272a.m40729f() : z11, (i14 & 2) != 0 ? C18686g.m40919h(FloatingWindowConfigManager.f34272a.m40730g().getTheme()) : str, (i14 & 4) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getFloatingWindowBgAlpha() : i11, (i14 & 8) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getFloatingWindowBgAlpha() : i12, (i14 & 16) != 0 ? C18686g.m40920i(FloatingWindowConfigManager.f34272a.m40730g().getDataUpdateIntervalTime()) : str2, (i14 & 32) != 0 ? C18686g.m40913b(FloatingWindowConfigManager.f34272a.m40730g().getDisplayMode()) : str3, (i14 & 64) != 0 ? C18686g.m40917f() : z12, (i14 & 128) != 0 ? String.valueOf(FloatingWindowConfigManager.f34272a.m40730g().getPageTurningTime()) : str4, (i14 & 256) != 0 ? C18686g.m40916e() : intervalTime, (i14 & 512) != 0 ? C18686g.m40912a() : intervalTime2, (i14 & 1024) != 0 ? C18686g.m40914c() : z13, (i14 & 2048) != 0 ? C18686g.m40915d(FloatingWindowConfigManager.f34272a.m40730g().getPagingMode()) : str5, (i14 & 4096) != 0 ? String.valueOf(FloatingWindowConfigManager.f34272a.m40730g().getPageSize()) : str6, (i14 & 8192) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getPageSize() : i13, (i14 & 16384) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getActionBarShow() : z14, (i14 & 32768) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getCurrencyNameShow() : z15, (i14 & 65536) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getQuoteChangeShow() : z16, (i14 & 131072) != 0 ? FloatingWindowConfigManager.f34272a.m40730g().getPriceShow() : z17, (i14 & 262144) != 0 ? CollectionsKt.emptyList() : list, (i14 & 524288) != 0 ? C18686g.m40918g(FloatingWindowConfigManager.f34272a.m40730g().getTextSizeMode()) : str7);
    }
}
