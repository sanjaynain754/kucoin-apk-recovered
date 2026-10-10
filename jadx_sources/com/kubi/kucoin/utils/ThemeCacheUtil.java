package com.kubi.kucoin.utils;

import com.kubi.utils.DataMapUtil;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.a1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ThemeCacheUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kucoin/utils/ThemeCacheUtil;", "", "<init>", "()V", "CACHENAME_DAYNIGHTTHEME", "", "THEME_CODE_KEY_OLDVERSIONAPP", "THEME_CODE_KEY", "KEY_DAYNIGHTTHEME_FOLLOWSYSTEM", "CAN_TIPDIALOGSHOWED_KEY", "canShowChangeThemeTipDialog", "", "canShowChangeThemeTipDialog$LTheme_googleRelease", "cacheChangeThemeTipDialogShowEd", "Lcom/kubi/utils/storage/MMKVHelper;", "cacheChangeThemeTipDialogShowEd$LTheme_googleRelease", "getFollowSystemStatus", "getFollowSystemStatus$LTheme_googleRelease", "cacheThemeFollowSystemStatus", "", "value", "cacheThemeFollowSystemStatus$LTheme_googleRelease", "getThemeMode", "", "getThemeMode$LTheme_googleRelease", "putThemeMode", "putThemeMode$LTheme_googleRelease", "compatibleOldVersionThemeIsDay", "compatibleOldVersionThemeIsDay$LTheme_googleRelease", "LTheme_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThemeCacheUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ThemeCacheUtil f28556a = new ThemeCacheUtil();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C46396e m33123a() {
        return C46396e.m102354k("DayNightThemeShare", "dayNightTheme_tipDialogshowEd_key", false);
    }

    /* JADX INFO: renamed from: b */
    public final void m33124b(boolean z11) {
        C46396e.m102354k("DayNightThemeShare", "DayNightThemeManager_useSystem", z11);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33125c() {
        return C46396e.m102347d("DayNightThemeShare", "dayNightTheme_tipDialogshowEd_key", true);
    }

    /* JADX INFO: renamed from: d */
    public final void m33126d() {
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        if (dataMapUtil.m66371c("is_dark_key", -1) == 2) {
            dataMapUtil.m66378m("is_dark_key", -1);
            m33124b(false);
            m33129g(2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m33127e() {
        return C46396e.m102347d("DayNightThemeShare", "DayNightThemeManager_useSystem", true);
    }

    /* JADX INFO: renamed from: f */
    public final int m33128f() {
        return C46396e.m102348e("DayNightThemeShare", "is_dayornight_key", 1);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C46396e m33129g(int i11) {
        return C46396e.m102355l("DayNightThemeShare", "is_dayornight_key", i11);
    }
}
