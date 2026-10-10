package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.base.config.InterfaceC35102c;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33791m7 {

    /* JADX INFO: renamed from: a */
    public static final String f70935a = "Unknown";

    /* JADX INFO: renamed from: b */
    public static final String f70936b = "Debug";

    /* JADX INFO: renamed from: c */
    public static final String f70937c = "Gray";

    /* JADX INFO: renamed from: d */
    public static final String f70938d = "Release";

    /* JADX INFO: renamed from: e */
    public static final String f70939e = "RMonitor_meta";

    /* JADX INFO: renamed from: f */
    public static boolean f70940f;

    /* JADX INFO: renamed from: g */
    public static final UserMeta f70941g = new UserMeta();

    /* JADX INFO: renamed from: h */
    public static boolean f70942h = false;

    /* JADX INFO: renamed from: i */
    public static volatile long f70943i = 0;

    /* JADX INFO: renamed from: j */
    public static volatile long f70944j = 0;

    /* JADX INFO: renamed from: k */
    public static long f70945k = C33536a4.f68797g;

    /* JADX INFO: renamed from: a */
    public static void m74044a(String str) {
        UserMeta userMeta = f70941g;
        C35101b c35101b = C35101b.c.f75199a;
        c35101b.m77087a(userMeta);
        c35101b.m77086a(ThreadManager.getMonitorThreadLooper());
        Logger.INSTANCE.mo77130d(f70939e, "init ConfigFetcher, from: " + str + ", userMeta: " + userMeta);
    }

    /* JADX INFO: renamed from: b */
    public static void m74048b(boolean z11) {
        f70940f = z11;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74051c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f70941g.appKey = str;
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setAppKey, appKey: ", str));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m74053d(String str) {
        String[] strArr = {"Unknown", "Debug", "Gray", "Release"};
        boolean z11 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            if (TextUtils.equals(strArr[i11], str)) {
                f70941g.setAppVersionMode(str);
                z11 = true;
                break;
            }
        }
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setAppVersionMode, appVersionMode: ", str));
        return z11;
    }

    /* JADX INFO: renamed from: e */
    public static UserMeta m74054e() {
        return f70941g;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m74057f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        UserMeta userMeta = f70941g;
        if (TextUtils.equals(str, userMeta.getModel())) {
            return false;
        }
        userMeta.setModel(str);
        C33714ie.m73408k().m73414b(str);
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setDeviceModel, deviceModel: ", str));
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m74059g() {
        return f70940f;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m74061h(String str) {
        if (str == null) {
            str = "";
        }
        UserMeta userMeta = f70941g;
        if (TextUtils.equals(str, userMeta.uin)) {
            return false;
        }
        userMeta.uin = str;
        Logger.INSTANCE.mo77130d(f70939e, "setUserID, userID: ".concat(str));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74049b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f70941g.appId = str;
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setAppID, appID: ", str));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m74055e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        UserMeta userMeta = f70941g;
        if (TextUtils.equals(str, userMeta.getUniqueID())) {
            return false;
        }
        userMeta.setUniqueID(str);
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setDeviceID, deviceID: ", str));
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m74058g(String str) {
        f70941g.appVersion = str == null ? "" : str;
        Logger.INSTANCE.mo77130d(f70939e, C33770l7.m73937a("setProductVersion, productVersion: ", str));
    }

    /* JADX INFO: renamed from: h */
    public static void m74060h() {
        if (f70943i == 0) {
            f70943i = System.currentTimeMillis();
            f70944j = SystemClock.elapsedRealtime();
            Logger.INSTANCE.mo77134w(f70939e, "markAppLaunch");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74045a(String str, InterfaceC35102c.a aVar) {
        m74044a(str);
        C35101b.c.f75199a.m77089a(aVar);
    }

    /* JADX INFO: renamed from: c */
    public static long m74050c() {
        return f70945k;
    }

    /* JADX INFO: renamed from: b */
    public static long m74047b() {
        long jElapsedRealtime = f70944j != 0 ? SystemClock.elapsedRealtime() - f70944j : 0L;
        if (jElapsedRealtime < 0) {
            return 0L;
        }
        return jElapsedRealtime;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m74056f() {
        if (ProcessUtil.isMainProcess(C33598d3.m72772c())) {
            return false;
        }
        return !f70942h;
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m74052d() {
        Context contextM72772c = C33598d3.m72772c();
        if (contextM72772c == null) {
            return null;
        }
        return C33716ig.m73433a().getSharedPreferences(contextM72772c, "BUGLY_COMMON_VALUES", true);
    }

    /* JADX INFO: renamed from: a */
    public static void m74046a(boolean z11) {
        f70942h = z11;
        Logger.INSTANCE.mo77132i(f70939e, "enable sub process fetch config from server: " + z11);
    }

    /* JADX INFO: renamed from: a */
    public static long m74042a() {
        m74060h();
        return f70943i;
    }

    /* JADX INFO: renamed from: a */
    public static void m74043a(long j11) {
        if (j11 <= 0) {
            return;
        }
        f70945k = j11;
        Logger.INSTANCE.mo77132i(f70939e, "setCacheDataInterval, interval: " + j11);
    }
}
