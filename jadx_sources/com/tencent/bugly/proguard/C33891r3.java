package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.common.logger.LogState;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33891r3 {

    /* JADX INFO: renamed from: a */
    public static Context f71604a = null;

    /* JADX INFO: renamed from: b */
    public static final int f71605b = 100;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebView f71606a;

        @Override // com.tencent.bugly.proguard.C33891r3.d
        /* JADX INFO: renamed from: a */
        public void mo74791a(boolean z11) {
            WebSettings settings = this.f71606a.getSettings();
            if (settings.getJavaScriptEnabled()) {
                return;
            }
            settings.setJavaScriptEnabled(true);
        }

        public a(WebView webView) {
            this.f71606a = webView;
        }

        @Override // com.tencent.bugly.proguard.C33891r3.d
        /* JADX INFO: renamed from: b */
        public String mo74792b() {
            return this.f71606a.getUrl();
        }

        @Override // com.tencent.bugly.proguard.C33891r3.d
        /* JADX INFO: renamed from: a */
        public void mo74790a(String str) {
            this.f71606a.loadUrl(str);
        }

        @Override // com.tencent.bugly.proguard.C33891r3.d
        /* JADX INFO: renamed from: a */
        public void mo74789a(C33854p7 c33854p7, String str) {
            this.f71606a.addJavascriptInterface(c33854p7, str);
        }

        @Override // com.tencent.bugly.proguard.C33891r3.d
        /* JADX INFO: renamed from: a */
        public CharSequence mo74788a() {
            return this.f71606a.getContentDescription();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r3$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b extends C33555b2.a {
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r3$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c extends C33555b2 {

        /* JADX INFO: renamed from: w */
        public b f71607w;

        @Override // com.tencent.bugly.proguard.C33555b2
        /* JADX INFO: renamed from: a */
        public synchronized void mo72414a(int i11) {
            this.f68914t = i11;
        }

        @Override // com.tencent.bugly.proguard.C33555b2
        /* JADX INFO: renamed from: b */
        public synchronized void mo72417b(boolean z11) {
            this.f68915u = z11;
        }

        @Override // com.tencent.bugly.proguard.C33555b2
        /* JADX INFO: renamed from: e */
        public synchronized int mo72424e() {
            return this.f68914t;
        }

        @Override // com.tencent.bugly.proguard.C33555b2
        /* JADX INFO: renamed from: f */
        public synchronized boolean mo72429f() {
            return this.f68915u;
        }

        @Override // com.tencent.bugly.proguard.C33555b2
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public synchronized b mo72430g() {
            return this.f71607w;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m74793a(b bVar) {
            this.f71607w = bVar;
        }

        public c(Context context) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r3$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        CharSequence mo74788a();

        /* JADX INFO: renamed from: a */
        void mo74789a(C33854p7 c33854p7, String str);

        /* JADX INFO: renamed from: a */
        void mo74790a(String str);

        /* JADX INFO: renamed from: a */
        void mo74791a(boolean z11);

        /* JADX INFO: renamed from: b */
        String mo74792b();
    }

    /* JADX INFO: renamed from: a */
    public static void m74742a(boolean z11) {
        C33900rc.f71634c = z11;
    }

    /* JADX INFO: renamed from: b */
    public static String m74748b(Context context) {
        if (context != null) {
            return C33765l2.m73825a(context).m73902z();
        }
        C34012x4.m75444f("Please call with context.", new Object[0]);
        return "unknown";
    }

    /* JADX INFO: renamed from: c */
    public static void m74756c() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not close native report because bugly is disable.");
        } else if (C33766l3.m73903b().m73905c()) {
            C33745k3.m73653l().m73675f();
        } else {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m74762d() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get App channel because bugly is disable.");
            return "unknown";
        }
        if (C33766l3.m73903b().m73905c()) {
            return C33765l2.m73825a(f71604a).m73868d();
        }
        Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    /* JADX INFO: renamed from: e */
    public static int m74766e(Context context) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C33765l2.m73825a(context).m73834G();
        }
        Log.e(C34012x4.f72492a, "getUserDatasSize args context should not be null");
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m74770f(Context context) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return C33765l2.m73825a(context).m73835H();
        }
        Log.e(C34012x4.f72492a, "getUserSceneTagId args context should not be null");
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static void m74774g(Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (context == null) {
            return;
        }
        f71604a = context;
        C33900rc.m74821a(C33766l3.m73903b());
        synchronized (C33900rc.class) {
            C33900rc.m74817a(context, null, jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Proxy m74776h() {
        return C34035y7.f72550a;
    }

    /* JADX INFO: renamed from: i */
    public static void m74780i(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C34012x4.f72492a, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C34012x4.m75444f("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C34012x4.m75444f("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        if (str.equals(C33765l2.m73825a(context).m73833F())) {
            return;
        }
        C33765l2.m73825a(context).m73891n(str);
        C34012x4.m75443e("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (C33766l3.m73903b().m73905c()) {
            C33918sa.m74955p();
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m74786o() {
        m74743a(true, true, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m74729a(Context context, c cVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (context == null) {
            return;
        }
        f71604a = context;
        C33900rc.m74821a(C33766l3.m73903b());
        C33900rc.m74817a(context, cVar, jUptimeMillis);
    }

    /* JADX INFO: renamed from: h */
    public static void m74777h(Context context) {
        f71604a = context;
    }

    /* JADX INFO: renamed from: j */
    public static String m74781j() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get user ID because bugly is disable.");
            return "unknown";
        }
        if (C33766l3.m73903b().m73905c()) {
            return C33765l2.m73825a(f71604a).m73833F();
        }
        Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    /* JADX INFO: renamed from: k */
    public static boolean m74782k() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (C33766l3.m73903b().m73905c()) {
            return C33745k3.m73653l().m73683o();
        }
        Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m74783l() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not start crash report because bugly is disable.");
        } else if (C33766l3.m73903b().m73905c()) {
            C33745k3.m73653l().m73691w();
        } else {
            Log.w(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m74784m() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not test ANR crash because bugly is disable.");
        } else if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C34012x4.m75442d("start to create a anr crash for test!", new Object[0]);
            C33745k3.m73653l().m73656C();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m74785n() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not test Java crash because bugly is disable.");
        } else {
            if (!C33766l3.m73903b().m73905c()) {
                Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
                return;
            }
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            if (c33765l2M73827s != null) {
                c33765l2M73827s.m73849a(24096);
            }
            throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m74787p() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not upload user info because bugly is disable.");
            return;
        }
        C33969v1 c33969v1 = C33918sa.f71856p;
        if (c33969v1 == null) {
            Log.w(C34012x4.f72492a, "Can not upload user info because bugly is not init.");
        } else {
            c33969v1.m75254c(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m74778h(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(C34012x4.f72492a, "tombstone path is null, will not set");
        } else {
            Log.i(C34012x4.f72492a, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74750b() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not close crash report because bugly is disable.");
        } else if (!C33766l3.m73903b().m73905c()) {
            Log.w(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C33745k3.m73653l().m73672c();
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m74767e() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get App ID because bugly is disable.");
            return "unknown";
        }
        if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return "unknown";
        }
        return C33765l2.m73825a(f71604a).m73872e();
    }

    /* JADX INFO: renamed from: f */
    public static void m74772f(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C33765l2.m73825a(context).m73881i(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeDeviceId(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74731a(Context context, String str, boolean z11) {
        m74732a(context, str, z11, null);
    }

    /* JADX INFO: renamed from: c */
    public static String m74755c(Context context) {
        return C33765l2.m73825a(context).m73890n();
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m74763d(Context context) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            C34012x4.m75444f("Context should not be null.", new Object[0]);
            return null;
        }
        return C33765l2.m73825a(context).f70754j0;
    }

    /* JADX INFO: renamed from: g */
    public static Context m74773g() {
        return f71604a;
    }

    /* JADX INFO: renamed from: a */
    public static void m74732a(Context context, String str, boolean z11, c cVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (context == null) {
            return;
        }
        f71604a = context;
        C33598d3.m72770a(context);
        C33900rc.m74821a(C33766l3.m73903b());
        C33900rc.m74819a(context, str, z11, cVar, jUptimeMillis);
    }

    /* JADX INFO: renamed from: c */
    public static void m74758c(Context context, String str, String str2) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not put SDK extra data because bugly is disable.");
        } else {
            if (context == null || C33571bi.m72617c(str) || C33571bi.m72617c(str2)) {
                return;
            }
            C33765l2.m73825a(context).m73870d(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m74775g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C33765l2.m73825a(context).m73883j(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeDeviceModel(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m74771f() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get app version because bugly is disable.");
            return "unknown";
        }
        if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return "unknown";
        }
        return C33765l2.m73825a(f71604a).f70714F;
    }

    /* JADX INFO: renamed from: b */
    public static void m74751b(Context context, String str, String str2) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            C34012x4.m75444f("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            C34012x4.m75444f("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C34012x4.m75444f("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        if (c33765l2M73825a.m73856b().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            C33765l2.m73825a(context).m73866c(str, str2);
            C34012x4.m75434a("replace KV %s %s", str, str2);
            return;
        }
        if (c33765l2M73825a.m73834G() >= 50) {
            C34012x4.m75444f("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            C34012x4.m75444f("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        C33765l2.m73825a(context).m73866c(str, str2);
        C34012x4.m75443e("[param] set user data: %s - %s", str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m74769e(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set user ID because bugly is disable.");
        } else if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            m74780i(f71604a, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74759c(Context context, boolean z11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            C34012x4.m75444f("Context should not be null.", new Object[0]);
            return;
        }
        if (z11) {
            C34012x4.m75434a("This is a development device.", new Object[0]);
        } else {
            C34012x4.m75434a("This is not a development device.", new Object[0]);
        }
        C33765l2.m73825a(context).f70750h0 = z11;
    }

    /* JADX INFO: renamed from: d */
    public static void m74764d(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C34012x4.f72492a, "App package is null, will not set");
            return;
        }
        C33765l2.m73825a(context).f70743e = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74743a(boolean z11, boolean z12, boolean z13) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not test native crash because bugly is disable.");
        } else if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C34012x4.m75442d("start to create a native crash for test!", new Object[0]);
            C33745k3.m73653l().m73668a(z11, z12, z13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m74768e(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C34012x4.f72492a, "App version is null, will not set");
            return;
        }
        C33765l2.m73825a(context).f70714F = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74757c(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(C34012x4.f72492a, "App channel is null, will not set");
            return;
        }
        C33765l2.m73825a(context).m73869d(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, String> m74779i() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return null;
        }
        return C33765l2.m73825a(f71604a).f70754j0;
    }

    /* JADX INFO: renamed from: a */
    public static void m74737a(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not post crash caught because bugly is disable.");
        } else if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            C33810n5.m74236c(thread, i11, str, str2, str3, map);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74765d(String str) {
        if (!C33571bi.m72617c(str) && C33571bi.m72620e(str)) {
            C33863pg.m74574a(str);
            StrategyBean.f68563w = str;
            StrategyBean.f68564x = str;
            return;
        }
        Log.i(C34012x4.f72492a, "URL is invalid.");
    }

    /* JADX INFO: renamed from: a */
    public static void m74726a(int i11, String str, String str2, String str3, Map<String, String> map) {
        m74737a(Thread.currentThread(), i11, str, str2, str3, map);
    }

    /* JADX INFO: renamed from: a */
    public static void m74738a(Throwable th2) {
        m74740a(th2, Thread.currentThread(), false);
    }

    /* JADX INFO: renamed from: c */
    public static void m74760c(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Set crash stack filter: " + str);
        C33745k3.f70505Q = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m74739a(Throwable th2, Thread thread) {
        m74740a(th2, thread, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m74740a(Throwable th2, Thread thread, boolean z11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!C33766l3.m73903b().m73905c()) {
            Log.e(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th2 == null) {
            C34012x4.m75444f("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        C33745k3.m73653l().m73664a(thread, th2, false, null, null, z11, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m74761c(boolean z11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Should handle native crash in Java profile after handled in native profile: " + z11);
        NativeCrashHandler.setShouldHandleInJava(z11);
    }

    /* JADX INFO: renamed from: a */
    public static void m74734a(Context context, boolean z11, boolean z12) {
        C33765l2.m73825a(context).m73854a(z11, z12);
    }

    /* JADX INFO: renamed from: a */
    public static void m74725a() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!C33766l3.m73903b().m73905c()) {
            Log.w(C34012x4.f72492a, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f71604a == null) {
            return;
        }
        C33989w1 c33989w1M75332b = C33989w1.m75332b();
        if (c33989w1M75332b != null) {
            c33989w1M75332b.m75336b(f71604a);
        }
        m74750b();
        C33918sa.m74936b(f71604a);
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        if (c33784m0M74004c != null) {
            c33784m0M74004c.m74008b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74749b(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not remove user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C34012x4.f72492a, "removeUserData args context should not be null");
            return "unknown";
        }
        if (C33571bi.m72617c(str)) {
            return null;
        }
        C34012x4.m75443e("[param] remove user data: %s", str);
        return C33765l2.m73825a(context).m73864c(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74754b(boolean z11) {
        if (!C33900rc.f71634c) {
            C34012x4.m75444f("Can not enableNativeSubProcess because bugly is disable.", new Object[0]);
            return false;
        }
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler == null) {
            return false;
        }
        C34012x4.m75442d("enableNativeSubProcess: " + z11, new Object[0]);
        return nativeCrashHandler.setNativeEnableSubProcess(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: a */
    public static void m74728a(Context context, int i11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(C34012x4.f72492a, "setTag args context should not be null");
            return;
        }
        if (i11 <= 0) {
            C34012x4.m75444f("setTag args tagId should > 0", new Object[0]);
        }
        C33765l2.m73825a(context).m73857b(i11);
        C34012x4.m75443e("[param] set user scene tag: %d", Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: b */
    public static void m74753b(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Set crash stack filter: " + str);
        C33745k3.f70504P = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m74752b(Context context, boolean z11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set collect privacy info enable because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(C34012x4.f72492a, "setCollectPrivacyInfo args context should not be null");
            return;
        }
        Log.i(C34012x4.f72492a, "setCollectPrivacyInfo: " + z11);
        C33765l2.m73825a(context).m73862b(z11);
    }

    /* JADX INFO: renamed from: a */
    public static String m74723a(Context context, String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(C34012x4.f72492a, "getUserDataValue args context should not be null");
            return "unknown";
        }
        if (C33571bi.m72617c(str)) {
            return null;
        }
        return C33765l2.m73825a(context).m73847a(str);
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m74724a(Context context) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context == null) {
            Log.e(C34012x4.f72492a, "getAllUserDataKeys args context should not be null");
            return new HashSet();
        }
        return C33765l2.m73825a(context).m73856b();
    }

    /* JADX INFO: renamed from: a */
    public static void m74730a(Context context, String str, String str2) {
        if (context == null || C33571bi.m72617c(str) || C33571bi.m72617c(str2)) {
            return;
        }
        String strReplace = str.replace("[a-zA-Z[0-9]]+", "");
        if (strReplace.length() > 100) {
            Log.w(C34012x4.f72492a, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            strReplace = strReplace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(C34012x4.f72492a, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        C33765l2.m73825a(context).m73860b(strReplace, str2);
        C34012x4.m75443e(String.format("[param] putSdkData data: %s - %s", strReplace, str2), new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static void m74727a(long j11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set 'SessionIntervalMills' because bugly is disable.");
        } else {
            C33918sa.m74943d(j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74735a(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set DB name because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Set Bugly DB name: " + str);
        C33641f4.f69814B = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m74733a(Context context, boolean z11) {
        m74752b(context, z11);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74744a(WebView webView, boolean z11) {
        return m74745a(webView, z11, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    public static boolean m74745a(WebView webView, boolean z11, boolean z12) {
        if (webView == null) {
            Log.w(C34012x4.f72492a, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return m74747a(new a(webView), z11, z12);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74746a(d dVar, boolean z11) {
        return m74747a(dVar, z11, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    public static boolean m74747a(d dVar, boolean z11, boolean z12) {
        if (dVar == null) {
            Log.w(C34012x4.f72492a, "WebViewInterface is null.");
            return false;
        }
        if (!C33766l3.m73903b().m73905c()) {
            C34012x4.m75437b("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        C34012x4.m75442d("Set Javascript exception monitor of webview.", new Object[0]);
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        C34012x4.m75431a(LogState.DEBUG, "URL of webview is %s", dVar.mo74792b());
        LogState logState = LogState.INFO;
        C34012x4.m75431a(logState, "Enable the javascript needed by webview monitor.", new Object[0]);
        dVar.mo74791a(true);
        C33854p7 c33854p7M74507a = C33854p7.m74507a(dVar);
        if (c33854p7M74507a != null) {
            C34012x4.m75431a(logState, "Add a secure javascript interface to the webview.", new Object[0]);
            dVar.mo74789a(c33854p7M74507a, "exceptionUploader");
        }
        if (z11) {
            C34012x4.m75431a(logState, "Inject bugly.js(v%s) to the webview.", C33668ga.m73171c());
            String strM73170b = C33668ga.m73170b();
            if (strM73170b == null) {
                C34012x4.m75431a(LogState.ERROR, "Failed to inject Bugly.js.", C33668ga.f69965a);
                return false;
            }
            dVar.mo74790a("javascript:".concat(strM73170b));
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m74736a(String str, int i11) {
        C34035y7.m75487a(str, i11);
    }

    /* JADX INFO: renamed from: a */
    public static void m74741a(InetAddress inetAddress, int i11) {
        C34035y7.m75488a(inetAddress, i11);
    }
}
