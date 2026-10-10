package com.tencent.bugly.proguard;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ye */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34042ye implements InterfaceC33568bf {

    /* JADX INFO: renamed from: Y */
    public static final String f72560Y = "RMonitor_manager_sdk";

    /* JADX INFO: renamed from: Z */
    public static InterfaceC33683h4 f72561Z;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ye$a */
    /* JADX INFO: compiled from: BUGLY */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Deprecated
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final String f72562a = "force_refresh_config";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75507a(int i11, String str) {
        return C33652ff.m73064a(i11, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m75516b(String str, int i11) {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", C33778lf.m73987a("endScene sceneName[", str, "] fail for "), C33673gf.m73203d());
            return false;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_manager_sdk", String.format("endScene, sceneName: %s, mode: %s", str, Integer.valueOf(i11)));
        }
        C33657g.m73095h().m73105c(str);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75520c(int i11, @Nullable Object obj) {
        return C33652ff.m73074c(i11, obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Deprecated
    /* JADX INFO: renamed from: d */
    public static void m75521d() {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "stopDisabledPlugins fail for ", C33673gf.m73203d());
        } else {
            Logger.INSTANCE.mo77132i("RMonitor_manager_sdk", "stopDisabledPlugins");
            C33795mb.m74116b();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m75525e(String str) {
        if (!C33673gf.m73198a()) {
            return false;
        }
        QAPMMonitorPlugin qAPMMonitorPluginM74112a = C33795mb.m74112a(str, false);
        if (qAPMMonitorPluginM74112a instanceof AbstractC33610df) {
            return ((AbstractC33610df) qAPMMonitorPluginM74112a).isRunning();
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static void m75526f(int i11) {
        C33652ff.m73073c(C33609de.m72856b(i11));
    }

    /* JADX INFO: renamed from: h */
    public static void m75529h(String str) {
        QAPMMonitorPlugin qAPMMonitorPluginM74112a = C33795mb.m74112a(str, false);
        if (qAPMMonitorPluginM74112a instanceof AbstractC33610df) {
            ((AbstractC33610df) qAPMMonitorPluginM74112a).resume();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75506a(int i11, Object obj) {
        return C33652ff.m73063a(i11, obj);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75519c() {
        return C33673gf.m73198a();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m75508a(String str, int i11) {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", C33778lf.m73987a("beginScene sceneName[", str, "] fail for "), C33673gf.m73203d());
            return false;
        }
        Logger.INSTANCE.mo77130d("RMonitor_manager_sdk", String.format("beginScene, sceneName: %s, mode: %s", str, Integer.valueOf(i11)));
        C33657g.m73095h().m73104b(str);
        String strM72855a = C33609de.m72855a(i11);
        if (!"looper_metric".equals(strM72855a) || C34045yh.m75539c().m75542a(strM72855a)) {
            return true;
        }
        C33652ff.m73069b((List<String>) Collections.singletonList(strM72855a));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static String m75517c(String str) {
        return C33991w3.m75338a().getUserData(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m75527f(String str) {
        QAPMMonitorPlugin qAPMMonitorPluginM74112a = C33795mb.m74112a(str, false);
        if (qAPMMonitorPluginM74112a instanceof AbstractC33610df) {
            ((AbstractC33610df) qAPMMonitorPluginM74112a).pause();
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m75528g(String str) {
        return C33991w3.m75338a().m77156e(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m75530i(String str) {
        C33652ff.m73069b((List<String>) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: j */
    public static void m75531j(String str) {
        C33652ff.m73073c((List<String>) Collections.singletonList(str));
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static void m75518c(int i11) {
        m75527f(C33609de.m72855a(i11));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m75523d(String str) {
        QAPMMonitorPlugin qAPMMonitorPluginM74112a = C33795mb.m74112a(str, false);
        if (qAPMMonitorPluginM74112a instanceof AbstractC33610df) {
            return ((AbstractC33610df) qAPMMonitorPluginM74112a).isResume();
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static void m75524e(int i11) {
        C33652ff.m73069b(C33609de.m72856b(i11));
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static void m75522d(int i11) {
        m75529h(C33609de.m72855a(i11));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75515b(int i11, Object obj) {
        return C33652ff.m73070b(i11, obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m75513b(List<String> list) {
        C33652ff.m73073c(list);
    }

    /* JADX INFO: renamed from: b */
    public static void m75512b(String str) {
        C33657g.m73095h().m73105c(str);
    }

    /* JADX INFO: renamed from: b */
    public static ICustomDataEditor m75511b() {
        return C33991w3.m75338a();
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m75514b(int i11) {
        return m75525e(C34041yd.m75500a(i11));
    }

    /* JADX INFO: renamed from: a */
    public static void m75504a(List<String> list) {
        C33652ff.m73069b(list);
    }

    /* JADX INFO: renamed from: a */
    public static void m75503a(String str) {
        C33657g.m73095h().m73104b(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m75505a(int i11) {
        return m75523d(C33609de.m72855a(i11));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75509a(String str, String str2) {
        return C33991w3.m75338a().putUserData(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m75502a() {
        C33652ff.m73059a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75510a(boolean z11) {
        return C33673gf.m73199a(z11);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC33683h4 m75501a(Activity activity) {
        if (!C33704i4.m73339b(activity)) {
            return null;
        }
        if (f72561Z == null) {
            f72561Z = new C33704i4();
        }
        return f72561Z;
    }
}
