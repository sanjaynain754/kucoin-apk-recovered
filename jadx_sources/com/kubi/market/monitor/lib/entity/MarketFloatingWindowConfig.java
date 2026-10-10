package com.kubi.market.monitor.lib.entity;

import androidx.annotation.Keep;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MarketFloatingWindowConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00067"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;", "", "isShow", "", BaseActivity.THEME, "", "floatingWindowBgAlpha", "dataUpdateIntervalTime", "displayMode", "autoScrollTime", "pageTurningTime", "pagingMode", "pageSize", "actionBarShow", "currencyNameShow", "quoteChangeShow", "priceShow", "textSizeMode", "<init>", "(ZIIIIIIIIZZZZI)V", "()Z", "getTheme", "()I", "getFloatingWindowBgAlpha", "getDataUpdateIntervalTime", "getDisplayMode", "getAutoScrollTime", "getPageTurningTime", "getPagingMode", "getPageSize", "getActionBarShow", "getCurrencyNameShow", "getQuoteChangeShow", "getPriceShow", "getTextSizeMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketFloatingWindowConfig {
    private final boolean actionBarShow;
    private final int autoScrollTime;
    private final boolean currencyNameShow;
    private final int dataUpdateIntervalTime;
    private final int displayMode;
    private final int floatingWindowBgAlpha;
    private final boolean isShow;
    private final int pageSize;
    private final int pageTurningTime;
    private final int pagingMode;
    private final boolean priceShow;
    private final boolean quoteChangeShow;
    private final int textSizeMode;
    private final int theme;

    public MarketFloatingWindowConfig() {
        this(false, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 16383, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketFloatingWindowConfig)) {
            return false;
        }
        MarketFloatingWindowConfig marketFloatingWindowConfig = (MarketFloatingWindowConfig) other;
        return this.isShow == marketFloatingWindowConfig.isShow && this.theme == marketFloatingWindowConfig.theme && this.floatingWindowBgAlpha == marketFloatingWindowConfig.floatingWindowBgAlpha && this.dataUpdateIntervalTime == marketFloatingWindowConfig.dataUpdateIntervalTime && this.displayMode == marketFloatingWindowConfig.displayMode && this.autoScrollTime == marketFloatingWindowConfig.autoScrollTime && this.pageTurningTime == marketFloatingWindowConfig.pageTurningTime && this.pagingMode == marketFloatingWindowConfig.pagingMode && this.pageSize == marketFloatingWindowConfig.pageSize && this.actionBarShow == marketFloatingWindowConfig.actionBarShow && this.currencyNameShow == marketFloatingWindowConfig.currencyNameShow && this.quoteChangeShow == marketFloatingWindowConfig.quoteChangeShow && this.priceShow == marketFloatingWindowConfig.priceShow && this.textSizeMode == marketFloatingWindowConfig.textSizeMode;
    }

    public MarketFloatingWindowConfig(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z12, boolean z13, boolean z14, boolean z15, int i19) {
        this.isShow = z11;
        this.theme = i11;
        this.floatingWindowBgAlpha = i12;
        this.dataUpdateIntervalTime = i13;
        this.displayMode = i14;
        this.autoScrollTime = i15;
        this.pageTurningTime = i16;
        this.pagingMode = i17;
        this.pageSize = i18;
        this.actionBarShow = z12;
        this.currencyNameShow = z13;
        this.quoteChangeShow = z14;
        this.priceShow = z15;
        this.textSizeMode = i19;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getActionBarShow() {
        return this.actionBarShow;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCurrencyNameShow() {
        return this.currencyNameShow;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getQuoteChangeShow() {
        return this.quoteChangeShow;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPriceShow() {
        return this.priceShow;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getTextSizeMode() {
        return this.textSizeMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFloatingWindowBgAlpha() {
        return this.floatingWindowBgAlpha;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDataUpdateIntervalTime() {
        return this.dataUpdateIntervalTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDisplayMode() {
        return this.displayMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAutoScrollTime() {
        return this.autoScrollTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPageTurningTime() {
        return this.pageTurningTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPagingMode() {
        return this.pagingMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final MarketFloatingWindowConfig copy(boolean isShow, int theme, int floatingWindowBgAlpha, int dataUpdateIntervalTime, int displayMode, int autoScrollTime, int pageTurningTime, int pagingMode, int pageSize, boolean actionBarShow, boolean currencyNameShow, boolean quoteChangeShow, boolean priceShow, int textSizeMode) {
        return new MarketFloatingWindowConfig(isShow, theme, floatingWindowBgAlpha, dataUpdateIntervalTime, displayMode, autoScrollTime, pageTurningTime, pagingMode, pageSize, actionBarShow, currencyNameShow, quoteChangeShow, priceShow, textSizeMode);
    }

    public final boolean getActionBarShow() {
        return this.actionBarShow;
    }

    public final int getAutoScrollTime() {
        return this.autoScrollTime;
    }

    public final boolean getCurrencyNameShow() {
        return this.currencyNameShow;
    }

    public final int getDataUpdateIntervalTime() {
        return this.dataUpdateIntervalTime;
    }

    public final int getDisplayMode() {
        return this.displayMode;
    }

    public final int getFloatingWindowBgAlpha() {
        return this.floatingWindowBgAlpha;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getPageTurningTime() {
        return this.pageTurningTime;
    }

    public final int getPagingMode() {
        return this.pagingMode;
    }

    public final boolean getPriceShow() {
        return this.priceShow;
    }

    public final boolean getQuoteChangeShow() {
        return this.quoteChangeShow;
    }

    public final int getTextSizeMode() {
        return this.textSizeMode;
    }

    public final int getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.isShow) * 31) + Integer.hashCode(this.theme)) * 31) + Integer.hashCode(this.floatingWindowBgAlpha)) * 31) + Integer.hashCode(this.dataUpdateIntervalTime)) * 31) + Integer.hashCode(this.displayMode)) * 31) + Integer.hashCode(this.autoScrollTime)) * 31) + Integer.hashCode(this.pageTurningTime)) * 31) + Integer.hashCode(this.pagingMode)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Boolean.hashCode(this.actionBarShow)) * 31) + Boolean.hashCode(this.currencyNameShow)) * 31) + Boolean.hashCode(this.quoteChangeShow)) * 31) + Boolean.hashCode(this.priceShow)) * 31) + Integer.hashCode(this.textSizeMode);
    }

    public final boolean isShow() {
        return this.isShow;
    }

    @NotNull
    public String toString() {
        return "MarketFloatingWindowConfig(isShow=" + this.isShow + ", theme=" + this.theme + ", floatingWindowBgAlpha=" + this.floatingWindowBgAlpha + ", dataUpdateIntervalTime=" + this.dataUpdateIntervalTime + ", displayMode=" + this.displayMode + ", autoScrollTime=" + this.autoScrollTime + ", pageTurningTime=" + this.pageTurningTime + ", pagingMode=" + this.pagingMode + ", pageSize=" + this.pageSize + ", actionBarShow=" + this.actionBarShow + ", currencyNameShow=" + this.currencyNameShow + ", quoteChangeShow=" + this.quoteChangeShow + ", priceShow=" + this.priceShow + ", textSizeMode=" + this.textSizeMode + ')';
    }

    public /* synthetic */ MarketFloatingWindowConfig(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z12, boolean z13, boolean z14, boolean z15, int i19, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? FloatingWindowConfigManager.f34272a.m40733j() : z11, (i21 & 2) != 0 ? 0 : i11, (i21 & 4) != 0 ? 75 : i12, (i21 & 8) != 0 ? 3 : i13, (i21 & 16) != 0 ? 0 : i14, (i21 & 32) != 0 ? 5 : i15, (i21 & 64) != 0 ? 5 : i16, (i21 & 128) != 0 ? 8 : i17, (i21 & 256) == 0 ? i18 : 5, (i21 & 512) != 0 ? true : z12, (i21 & 1024) == 0 ? z13 : true, (i21 & 2048) != 0 ? false : z14, (i21 & 4096) == 0 ? z15 : false, (i21 & 8192) != 0 ? 2 : i19);
    }
}
