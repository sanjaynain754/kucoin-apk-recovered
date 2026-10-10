package com.kubi.kucoin.utils;

import android.app.UiModeManager;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentManager;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseApplication;
import com.kubi.theme.R$string;
import com.kubi.utils.C27063n;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p835zk.C46884c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DayNightThemeManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005J\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\fJ\b\u0010(\u001a\u00020 H\u0002J\u0006\u0010)\u001a\u00020 J\r\u0010*\u001a\u00020\u0010H\u0000¢\u0006\u0002\b+R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006,"}, m90084d2 = {"Lcom/kubi/kucoin/utils/DayNightThemeManager;", "", "<init>", "()V", "isFristDynamicChangeThemeMode", "", "()Z", "setFristDynamicChangeThemeMode", "(Z)V", "isChangeThemeModeIng", "setChangeThemeModeIng", "APP_THEME_MODE_FOLLOW_SYSTEM", "", "APP_THEME_MODE_DAY", "APP_THEME_MODE_NIGHT", "init", "", "isToggleThem", "setToggleThem", "changeDatNightTheme", "manager", "Landroidx/fragment/app/FragmentManager;", "changeThemeMode", "setThemeFollowSystem", "homePageFollowSystemDynamicChange", "walletPageFollowSystemDynamicChange", "followSystemDynamicChange", "isRestart", "isDayTheme", "isUpGreen", "setTheme", "mode", "", "setTheme$LTheme_googleRelease", "getThemeMode", "isUseFollowSystem", "currentSystemIsDayMode", "getCurrentThemeModeText", "getAppThemeModeKey", "setAppThemeByMode", "getCurrentThemeMode", "getTheModeForFlutter", "restart", "restart$LTheme_googleRelease", "LTheme_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DayNightThemeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DayNightThemeManager f28592a = new DayNightThemeManager();

    /* JADX INFO: renamed from: b */
    public static boolean f28593b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f28594c;

    /* JADX INFO: renamed from: d */
    public static boolean f28595d;

    /* JADX INFO: renamed from: n */
    public final boolean m33189n() {
        return C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m33176a(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (C46884c.f104713a.m103225g(manager)) {
            return;
        }
        m33177b();
        m33191p();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33178c() {
        try {
            Result.Companion companion = Result.INSTANCE;
            return ((UiModeManager) BaseApplication.INSTANCE.get().getSystemService(UiModeManager.class)).getNightMode() != 2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            Boolean bool = Boolean.TRUE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            return ((Boolean) objM103844constructorimpl).booleanValue();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m33182g() {
        Resources resources = BaseApplication.INSTANCE.get().getResources();
        if (m33190o()) {
            String string = resources.getString(R$string.daynighttheme_modetext_useFollowSystem);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (m33187l()) {
            String string2 = resources.getString(R$string.daynighttheme_modetext_day);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(R$string.daynighttheme_modetext_night);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: renamed from: i */
    public final int m33184i() {
        return ThemeCacheUtil.f28556a.m33128f();
    }

    /* JADX INFO: renamed from: j */
    public final void m33185j() {
        if (f28593b) {
            f28593b = false;
            return;
        }
        if (!m33190o() || GlobalDialogManager.f43651a.m54344i() || f28594c) {
            return;
        }
        f28594c = true;
        m33179d(true);
        f28594c = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m33186k() {
        ThemeCacheUtil.f28556a.m33126d();
        int iM33181f = m33181f();
        C43846g.m96571f("THEME", String.valueOf(iM33181f));
        AppCompatDelegate.setDefaultNightMode(iM33181f);
        ToastThemeManager.m33149a();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m33188m() {
        return f28595d;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33190o() {
        return ThemeCacheUtil.f28556a.m33127e();
    }

    /* JADX INFO: renamed from: p */
    public final void m33191p() {
        Router.f46192a.m56184f("home").m4038a("data", Boolean.TRUE).m4048k();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m33192q(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int iHashCode = mode.hashCode();
        if (iHashCode != 99228) {
            if (iHashCode != 104817688) {
                if (iHashCode == 1911902528 && mode.equals("followSystem")) {
                    m33194s();
                    return true;
                }
            } else if (mode.equals("night")) {
                ThemeCacheUtil themeCacheUtil = ThemeCacheUtil.f28556a;
                themeCacheUtil.m33123a();
                themeCacheUtil.m33124b(false);
                m33193r(2);
                m33191p();
                return true;
            }
        } else if (mode.equals(JPushConstants.NotificationTime.KEY_DAYS)) {
            ThemeCacheUtil themeCacheUtil2 = ThemeCacheUtil.f28556a;
            themeCacheUtil2.m33123a();
            themeCacheUtil2.m33124b(false);
            m33193r(1);
            m33191p();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m33193r(int i11) {
        ThemeCacheUtil.f28556a.m33129g(i11);
        if (AppCompatDelegate.getDefaultNightMode() != i11) {
            f28595d = true;
            C43846g.m96571f("THEME", String.valueOf(i11));
            AppCompatDelegate.setDefaultNightMode(i11);
            ToastThemeManager.m33149a();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m33194s() {
        ThemeCacheUtil.f28556a.m33124b(true);
        m33193r(m33181f());
        m33191p();
    }

    /* JADX INFO: renamed from: t */
    public final void m33195t(boolean z11) {
        f28595d = z11;
    }

    /* JADX INFO: renamed from: b */
    public final void m33177b() {
        int i11;
        if (m33187l()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        ThemeCacheUtil.f28556a.m33124b(false);
        m33193r(i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m33179d(boolean z11) {
        boolean zM33178c;
        int i11;
        if (m33190o() && (zM33178c = m33178c()) != m33187l()) {
            if (zM33178c) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            m33193r(i11);
            if (z11) {
                m33191p();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m33180e() {
        if (m33190o()) {
            return "followSystem";
        }
        if (m33187l()) {
            return JPushConstants.NotificationTime.KEY_DAYS;
        }
        return "night";
    }

    /* JADX INFO: renamed from: f */
    public final int m33181f() {
        int i11;
        if (m33190o()) {
            if (m33178c()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            ThemeCacheUtil.f28556a.m33129g(i11);
            return i11;
        }
        return ThemeCacheUtil.f28556a.m33128f();
    }

    /* JADX INFO: renamed from: h */
    public final int m33183h() {
        return m33181f();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m33187l() {
        if (AppCompatDelegate.getDefaultNightMode() != 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m33196u() {
        if (!m33190o() || f28594c) {
            return;
        }
        f28594c = true;
        m33179d(false);
        f28594c = false;
    }
}
