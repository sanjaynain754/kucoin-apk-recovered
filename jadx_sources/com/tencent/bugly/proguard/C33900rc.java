package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.base.config.InterfaceC35102c;
import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33900rc {

    /* JADX INFO: renamed from: a */
    public static final String f71632a = "";

    /* JADX INFO: renamed from: b */
    public static final String f71633b = "4.4.7.8";

    /* JADX INFO: renamed from: c */
    public static boolean f71634c = true;

    /* JADX INFO: renamed from: d */
    public static List<AbstractC33575c1> f71635d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static final int f71636e = 100;

    /* JADX INFO: renamed from: f */
    public static final int f71637f = 100;

    /* JADX INFO: renamed from: g */
    public static final int f71638g = 100;

    /* JADX INFO: renamed from: h */
    public static final int f71639h = 100;

    /* JADX INFO: renamed from: i */
    public static boolean f71640i;

    /* JADX INFO: renamed from: j */
    public static C33620e4 f71641j;

    /* JADX INFO: renamed from: k */
    public static boolean f71642k;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.rc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C33791m7.m74045a("CrashModule", InterfaceC35102c.a.LAUNCH);
            C33882qe.a.f71576a.m74695a(new C33819ne());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74822a(C33765l2 c33765l2) {
        List<String> list = c33765l2.f70727S;
        if (list != null && list.contains(C33947u.f72135s)) {
            return true;
        }
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33911s3.f71802h);
        if (abstractC34022xeM77083a == null || !(abstractC34022xeM77083a instanceof C33911s3) || ((C33911s3) abstractC34022xeM77083a).m74908b().booleanValue()) {
            return false;
        }
        C34012x4.m75444f("crash report is disabled, please modify your project's setting", new Object[0]);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m74823b(Context context) {
        m74815a(context);
        m74814a();
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setStage(C33657g.m73094e());
            nativeCrashHandler.setTestLabel(C33655fi.m73087c());
            nativeCrashHandler.setCaseLabel(C33655fi.m73081a());
        }
        C33657g.m73095h().m73099a(new C33629ed());
    }

    /* JADX INFO: renamed from: a */
    public static void m74815a(Context context) {
        C33955u7.m75163c().m75165a(context);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setAppHotPatchNum(C33955u7.m75163c().m75164a());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74814a() {
        String strM73089d = C33655fi.m73089d();
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setAppVersionLabel(strM73089d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74816a(Context context, long j11) {
        m74817a(context, null, j11);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74817a(Context context, C33555b2 c33555b2, long j11) {
        if (f71642k) {
            C34012x4.m75444f("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "[init] context of init() is null, check it.");
            return;
        }
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        f71634c = true;
        if (m74822a(c33765l2M73825a)) {
            f71634c = false;
            return;
        }
        String strM73872e = c33765l2M73825a.m73872e();
        if (strM73872e == null) {
            Log.e(C34012x4.f72492a, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            m74819a(context, strM73872e, c33765l2M73825a.f70742d0, c33555b2, j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74819a(Context context, String str, boolean z11, C33555b2 c33555b2, long j11) {
        if (f71642k) {
            C34012x4.m75444f("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "[init] context is null, check it.");
            return;
        }
        if (str == null) {
            Log.e(C34012x4.f72492a, "init arg 'crashReportAppID' should not be null!");
            return;
        }
        f71642k = true;
        if (z11) {
            f71640i = true;
            Logger.INSTANCE.setLogLevel(LogState.VERBOS);
            C34012x4.m75444f("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
            LogState logState = LogState.ERROR;
            C34012x4.m75431a(logState, "--------------------------------------------------------------------------------------------", new Object[0]);
            LogState logState2 = LogState.WARN;
            C34012x4.m75431a(logState2, "Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
            C34012x4.m75431a(logState2, "[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
            C34012x4.m75431a(logState2, "[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
            C34012x4.m75431a(logState2, "[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
            C34012x4.m75431a(logState, "--------------------------------------------------------------------------------------------", new Object[0]);
            C34012x4.m75431a(LogState.INFO, "[init] Open debug mode of Bugly.", new Object[0]);
        } else {
            C34012x4.m75442d("--------------------------------------------------------------------------------------------", new Object[0]);
            LogState logState3 = LogState.INFO;
            C34012x4.m75431a(logState3, "Bugly 初始化中。 -- Bugly is starting init.", new Object[0]);
            C34012x4.m75431a(logState3, "Bugly Release版本支持打印日志，如需关闭日志，可通过接口调整日志级别。 \n-- Bugly Release version supports printing logs. \n-- If you need to turn off the logs, you can adjust the log level through the interface.", new Object[0]);
            C34012x4.m75431a(logState3, "--------------------------------------------------------------------------------------------", new Object[0]);
        }
        C34012x4.m75442d(" crash report start initializing...", new Object[0]);
        LogState logState4 = LogState.INFO;
        C34012x4.m75431a(logState4, "[init] Bugly start initializing...", new Object[0]);
        C34012x4.m75431a(logState4, "[init] Bugly complete version: v%s", "4.4.7.8");
        Context contextM72565a = C33571bi.m72565a(context);
        C33765l2 c33765l2M73825a = C33765l2.m73825a(contextM72565a);
        C33682h3.m73240a(contextM72565a);
        c33765l2M73825a.m73844Q();
        C33627eb.m72937a(contextM72565a);
        f71641j = C33620e4.m72892a(contextM72565a, f71635d);
        C33905rh.m74872a(contextM72565a);
        C33863pg.m74571a(contextM72565a, f71635d);
        C33871q3 c33871q3M74645a = C33871q3.m74645a(contextM72565a);
        f71634c = true;
        if (m74822a(c33765l2M73825a)) {
            f71634c = false;
            return;
        }
        c33765l2M73825a.m73873e(str);
        C34012x4.m75431a(logState4, "[param] Set APP ID:%s", str);
        m74820a(c33555b2, c33765l2M73825a);
        NetworkWatcher.INSTANCE.init();
        for (int i11 = 0; i11 < f71635d.size(); i11++) {
            try {
                if (c33871q3M74645a.m74658a(f71635d.get(i11).f69317a)) {
                    f71635d.get(i11).mo72633a(contextM72565a, z11, c33555b2);
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75432a(LogState.WARN, th2)) {
                    th2.printStackTrace();
                }
            }
        }
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        boolean zM72617c = C33571bi.m72617c(c33765l2M73827s.f70723O);
        boolean z12 = !zM72617c;
        String str2 = c33765l2M73827s.f70723O;
        if (zM72617c) {
            str2 = "Bugly_Native";
        }
        if (!NativeCrashHandler.getInstance().tryLoadSo(str2, z12)) {
            C34012x4.m75431a(LogState.DEBUG, "Failed to load so: %s", "Bugly_Native");
        } else {
            C34012x4.m75431a(LogState.INFO, "Success to load so: %s", "Bugly_Native");
        }
        C33681h2.m73237b(contextM72565a);
        c33765l2M73825a.m73837J();
        C33922se.m74982a(contextM72565a);
        C33768l5.m73922f().m73927b();
        m74823b(contextM72565a);
        m74818a(contextM72565a, str);
        C33918sa.m74937b(contextM72565a, c33555b2);
        C33863pg.m74576b().m74579a(c33555b2 != null ? c33555b2.m72418c() : 0L);
        C33784m0.m74004c().m74006a(new a());
        C33938ta.m75049a(j11, SystemClock.uptimeMillis(), false);
        C34012x4.m75431a(LogState.INFO, "[init] Bugly initialization finished.", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static void m74818a(Context context, String str) {
        if (C33588ce.m72684b().m72691c()) {
            C34012x4.m75442d("init linkage before.", new Object[0]);
            return;
        }
        try {
            Method declaredMethod = C34018xa.class.getDeclaredMethod("initLinkage", Context.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, context, str);
                C34012x4.m75442d("init linkage success.", new Object[0]);
                return;
            }
            C34012x4.m75442d("init linkage fail for method is null.", new Object[0]);
        } catch (Throwable th2) {
            C34012x4.m75442d("init linkage fail for %s.", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74820a(C33555b2 c33555b2, C33765l2 c33765l2) {
        byte[] bArr;
        if (c33555b2 == null) {
            return;
        }
        String strM72422d = c33555b2.m72422d();
        if (!TextUtils.isEmpty(strM72422d)) {
            if (strM72422d.length() > 100) {
                String strSubstring = strM72422d.substring(0, 100);
                C34012x4.m75444f("appVersion %s length is over limit %d substring to %s", strM72422d, 100, strSubstring);
                strM72422d = strSubstring;
            }
            c33765l2.f70714F = strM72422d;
            C34012x4.m75442d("[param] Set App version: %s", c33555b2.m72422d());
        }
        try {
            if (c33555b2.m72448s()) {
                String strM72413a = c33555b2.m72413a();
                if (!TextUtils.isEmpty(strM72413a)) {
                    if (strM72413a.length() > 100) {
                        String strSubstring2 = strM72413a.substring(0, 100);
                        C34012x4.m75444f("appChannel %s length is over limit %d substring to %s", strM72413a, 100, strSubstring2);
                        strM72413a = strSubstring2;
                    }
                    f71641j.m72912a(C33765l2.f70701D0, "app_channel", strM72413a.getBytes(), (InterfaceC33599d4) null, false);
                    c33765l2.m73869d(strM72413a);
                }
            } else {
                Map<String, byte[]> mapM72907a = f71641j.m72907a(C33765l2.f70701D0, (InterfaceC33599d4) null, true);
                if (mapM72907a != null && (bArr = mapM72907a.get("app_channel")) != null) {
                    c33765l2.m73869d(new String(bArr));
                }
            }
            C34012x4.m75442d("[param] Set App channel: %s", c33765l2.m73868d());
        } catch (Exception e11) {
            if (f71640i) {
                e11.printStackTrace();
            }
        }
        String strM72416b = c33555b2.m72416b();
        if (!TextUtils.isEmpty(strM72416b)) {
            if (strM72416b.length() > 100) {
                String strSubstring3 = strM72416b.substring(0, 100);
                C34012x4.m75444f("appPackageName %s length is over limit %d substring to %s", strM72416b, 100, strSubstring3);
                strM72416b = strSubstring3;
            }
            c33765l2.f70743e = strM72416b;
            C34012x4.m75442d("[param] Set App package: %s", c33555b2.m72416b());
        }
        String strM72432h = c33555b2.m72432h();
        if (strM72432h != null) {
            if (strM72432h.length() > 100) {
                String strSubstring4 = strM72432h.substring(0, 100);
                C34012x4.m75444f("deviceId %s length is over limit %d substring to %s", strM72432h, 100, strSubstring4);
                strM72432h = strSubstring4;
            }
            c33765l2.m73881i(strM72432h);
            C34012x4.m75442d("[param] Set device ID: %s", strM72432h);
        }
        String strM72435i = c33555b2.m72435i();
        if (strM72435i != null) {
            c33765l2.m73883j(strM72435i);
            C34012x4.m75442d("[param] Set device model: %s", strM72435i);
        }
        c33765l2.f70751i = c33555b2.m72449t();
        C33627eb.f69719i = c33555b2.m72441l();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74821a(AbstractC33575c1 abstractC33575c1) {
        if (!f71635d.contains(abstractC33575c1)) {
            f71635d.add(abstractC33575c1);
        }
    }
}
