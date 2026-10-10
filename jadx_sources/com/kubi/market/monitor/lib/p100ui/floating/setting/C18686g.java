package com.kubi.market.monitor.lib.p100ui.floating.setting;

import aq.C4373b;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.g */
/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0001\u001a\b\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\b\u0010\u001d\u001a\u00020\u001cH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"TYPE_DATA_UPDATE_INTERVAL", "", "TYPE_DISPLAY_MODE", "TYPE_PAGING", "TYPE_TEXT_SIZE", "TYPE_THEME", "EVENT_REMOVE_SYMBOL", "", "EVENT_TOP_SYMBOL", "EVENT_UPDATE_DISPLAY_MODE", "EVENT_UPDATE_ACTIONBAR", "TYPE_DRAG", "TYPE_UP", "PAGE_ID_B4MORESHOWSETTING", "createThemeText", BaseActivity.THEME, "createDisplayModeText", "displayMode", "createPagingModeText", "pagingMode", "createTextSizeModeText", "textSizeMode", "createPagingTime", "Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;", "createAutoScrollTime", "createUpdateIntervalTimeText", "time", "createPagingIntervalLayoutVisible", "", "createScrollIntervalLayoutVisible", "MarketMonitorLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18686g {
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m40918g(int i11) {
        if (i11 == 1) {
            return C4373b.m3901c(R$string.floating_window_small_font);
        }
        if (i11 != 2) {
            return i11 != 3 ? C4373b.m3901c(R$string.floating_window_small_font) : C4373b.m3901c(R$string.floating_window_large_font);
        }
        return C4373b.m3901c(R$string.floating_window_medium_font);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IntervalTime m40912a() {
        String str;
        boolean z11;
        int i11 = R$string.floating_window_interval_second;
        String strM3902d = C4373b.m3902d(i11, 3);
        String strM3902d2 = C4373b.m3902d(i11, 5);
        String strM3902d3 = C4373b.m3902d(i11, 10);
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        boolean z12 = 3 == floatingWindowConfigManager.m40730g().getAutoScrollTime();
        boolean z13 = 5 == floatingWindowConfigManager.m40730g().getAutoScrollTime();
        if (10 == floatingWindowConfigManager.m40730g().getAutoScrollTime()) {
            str = strM3902d;
            z11 = true;
        } else {
            str = strM3902d;
            z11 = false;
        }
        return new IntervalTime(str, strM3902d2, strM3902d3, z12, z13, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m40913b(int i11) {
        return C4373b.m3901c(i11 == 0 ? R$string.floating_window_expand : R$string.floating_window_scroll);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m40914c() {
        return FloatingWindowConfigManager.f34272a.m40730g().getPagingMode() == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m40915d(int i11) {
        return C4373b.m3901c(i11 == 0 ? R$string.floating_window_auto_paging : R$string.floating_window_manual_paging);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final IntervalTime m40916e() {
        String str;
        boolean z11;
        int i11 = R$string.floating_window_interval_second;
        String strM3902d = C4373b.m3902d(i11, 3);
        String strM3902d2 = C4373b.m3902d(i11, 5);
        String strM3902d3 = C4373b.m3902d(i11, 10);
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        boolean z12 = 3 == floatingWindowConfigManager.m40730g().getPageTurningTime();
        boolean z13 = 5 == floatingWindowConfigManager.m40730g().getPageTurningTime();
        if (10 == floatingWindowConfigManager.m40730g().getPageTurningTime()) {
            str = strM3902d;
            z11 = true;
        } else {
            str = strM3902d;
            z11 = false;
        }
        return new IntervalTime(str, strM3902d2, strM3902d3, z12, z13, z11);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m40917f() {
        return FloatingWindowConfigManager.f34272a.m40730g().getDisplayMode() == 8;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m40919h(int i11) {
        return C4373b.m3901c(i11 == 0 ? R$string.floating_window_theme_dark : R$string.floating_window_theme_light);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m40920i(int i11) {
        return i11 >= 60 ? C4373b.m3902d(R$string.floating_window_minute, Integer.valueOf(i11 / 60)) : C4373b.m3902d(R$string.floating_window_second, Integer.valueOf(i11));
    }
}
