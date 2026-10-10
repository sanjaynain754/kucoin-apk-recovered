package com.kubi.kucoin.startup;

import android.app.Application;
import android.os.Build;
import androidx.media3.common.MimeTypes;
import com.appsflyer.AppsFlyerProperties;
import com.blankj.utilcode.util.C5276j;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.tencent.bugly.proguard.C33556b3;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p624sq.C44536b;
import p624sq.InterfaceC44537c;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppTrackerClsStartupTask.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kucoin/startup/AppTrackerClsStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "Lcom/kubi/monitor/cls/AppTrackerContextProxy;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "commonTrackerContent", "", "", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "app_tracker_cls", priority = 200, stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Main)
public final class AppTrackerClsStartupTask implements IStartupTask, InterfaceC44537c {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.AppTrackerClsStartupTask$a */
    /* JADX INFO: compiled from: AppTrackerClsStartupTask.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15597a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserInfo.LoginState.values().length];
            try {
                iArr[UserInfo.LoginState.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserInfo.LoginState.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p624sq.InterfaceC44537c
    @NotNull
    public Map<String, Object> commonTrackerContent() {
        String str;
        Pair pairM90091to = TuplesKt.m90091to(C33556b3.f69078o2, KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        Pair pairM90091to2 = TuplesKt.m90091to("os_version", Build.VERSION.RELEASE);
        Pair pairM90091to3 = TuplesKt.m90091to("model", Build.MODEL);
        String property = System.getProperty("http.proxyHost");
        Pair pairM90091to4 = TuplesKt.m90091to("is_proxy", Boolean.valueOf(!(property == null || StringsKt.isBlank(property))));
        C45590s c45590s = C45590s.f102687a;
        Pair pairM90091to5 = TuplesKt.m90091to("app_version", c45590s.m100675Z());
        Pair pairM90091to6 = TuplesKt.m90091to("app_build", c45590s.m100673X());
        Pair pairM90091to7 = TuplesKt.m90091to(AppsFlyerProperties.CHANNEL, c45590s.m100665P());
        UserInfo userInfo = UserInfo.a;
        Pair pairM90091to8 = TuplesKt.m90091to("distinct_id", userInfo.h());
        String strM6247f = C5276j.m6247f();
        if (strM6247f == null) {
            strM6247f = "";
        }
        Pair pairM90091to9 = TuplesKt.m90091to("x_device_no", strM6247f);
        Pair pairM90091to10 = TuplesKt.m90091to("site_type", SiteType.INSTANCE.getCurrentSiteType());
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        String str2 = "followSystem";
        if (!dayNightThemeManager.m33190o()) {
            if (!dayNightThemeManager.m33190o() && dayNightThemeManager.m33184i() == 1) {
                str2 = "light";
            } else if (!dayNightThemeManager.m33190o() && dayNightThemeManager.m33184i() == 2) {
                str2 = "dark";
            }
        }
        Pair pairM90091to11 = TuplesKt.m90091to("follow_system_theme", str2);
        int i11 = C15597a.$EnumSwitchMapping$0[userInfo.d().ordinal()];
        if (i11 == 1) {
            str = "FULLY_LOGGED_IN";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "NOT_LOGGED_IN";
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, pairM90091to8, pairM90091to9, pairM90091to10, pairM90091to11, TuplesKt.m90091to("login_status", str));
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C44536b.m98548b(application, this);
    }
}
