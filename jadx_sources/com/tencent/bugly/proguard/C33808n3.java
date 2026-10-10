package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.common.replay.BuglyReplayManager;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.feedback.eup.CrashHandleListener;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.feedback.eup.jni.NativeExceptionHandlerRqdImp;
import com.tencent.feedback.eup.jni.NativeExceptionUpload;
import com.tencent.feedback.upload.UploadHandleListener;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import com.tencent.rmonitor.common.logger.ILogProxy;
import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.custom.C35153a;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33808n3 {

    /* JADX INFO: renamed from: a */
    public static final int f71016a = 1003;

    /* JADX INFO: renamed from: b */
    public static final int f71017b = 3000;

    /* JADX INFO: renamed from: c */
    public static boolean f71018c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f71019d = true;

    /* JADX INFO: renamed from: e */
    public static C33951u3 f71020e;

    /* JADX INFO: renamed from: f */
    public static boolean f71021f;

    /* JADX INFO: renamed from: g */
    public static boolean f71022g;

    /* JADX INFO: renamed from: h */
    public static InterfaceC34063zf f71023h;

    /* JADX INFO: renamed from: i */
    public static InterfaceC33885qh f71024i;

    /* JADX INFO: renamed from: j */
    public static d f71025j = new d();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements InterfaceC34063zf {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CrashHandleListener f71026a;

        @Override // com.tencent.bugly.proguard.InterfaceC34063zf
        /* JADX INFO: renamed from: a */
        public boolean mo74225a(boolean z11, String str, String str2, String str3, String str4, int i11, long j11, String str5, String str6, String str7, String str8, String str9) {
            return this.f71026a.onCrashSaving(z11, str, str2, str3, str4, i11, j11, str5, str6, str7, str8);
        }

        public a(CrashHandleListener crashHandleListener) {
            this.f71026a = crashHandleListener;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC34063zf
        public byte[] getCrashExtraData(boolean z11, String str, String str2, String str3, int i11, long j11) {
            return this.f71026a.getCrashExtraData(z11, str, str2, str3, i11, j11);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC34063zf
        public String getCrashExtraMessage(boolean z11, String str, String str2, String str3, int i11, long j11) {
            return this.f71026a.getCrashExtraMessage(z11, str, str2, str3, i11, j11);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC34063zf
        public boolean onCrashHandleEnd(boolean z11) {
            return this.f71026a.onCrashHandleEnd(z11);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC34063zf
        public void onCrashHandleStart(boolean z11, String str) {
            this.f71026a.onCrashHandleStart(z11, str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements InterfaceC33885qh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UploadHandleListener f71027a;

        public b(UploadHandleListener uploadHandleListener) {
            this.f71027a = uploadHandleListener;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        /* JADX INFO: renamed from: a */
        public void mo74226a(int i11, C33983vf c33983vf, long j11, long j12, boolean z11, String str, String str2, long j13) {
            this.f71027a.onUploadEnd(i11, c33983vf == null ? -1 : c33983vf.f72378r, j11, j12, z11, str, str2, j13);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        public void onUploadStart(int i11) {
            this.f71027a.onUploadStart(i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74204c(boolean z11) {
        try {
            C33745k3 c33745k3M73653l = C33745k3.m73653l();
            if (c33745k3M73653l != null) {
                if (z11) {
                    C34012x4.m75434a("startANRMonitor", new Object[0]);
                    c33745k3M73653l.m73692x();
                } else {
                    C34012x4.m75434a("stopANRMonitor", new Object[0]);
                    c33745k3M73653l.m73673d();
                }
            }
        } catch (Exception e11) {
            C34012x4.m75435a(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74206d(Context context, String str) {
        C33765l2.m73825a(context).m73875f(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m74212e() {
        return f71018c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m74216f() {
        C33745k3 c33745k3;
        if (!f71018c) {
            C34012x4.m75444f("reRegisterHandler failed, please call initCrashReport first", new Object[0]);
            return false;
        }
        if (C33745k3.m73653l() == null) {
            return false;
        }
        synchronized (C33745k3.class) {
            c33745k3 = C33745k3.f70506R;
        }
        c33745k3.m73685q();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m74220g(boolean z11) {
        C33969v1.m75229a(z11);
    }

    /* JADX INFO: renamed from: h */
    public static void m74222h(Context context, String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C34012x4.m75444f("userId %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        C33791m7.m74061h(str);
        if (str.equals(C33765l2.m73825a(context).m73833F())) {
            return;
        }
        C33765l2.m73825a(context).m73891n(str);
        C34012x4.m75443e("[user] set userId : %s", str);
        if (C33918sa.f71844d) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeUserId(str);
            }
            C33918sa.m74955p();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n3$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements C34003wf.a {
        @Override // com.tencent.bugly.proguard.C34003wf.a
        /* JADX INFO: renamed from: a */
        public String mo74227a() {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            if (c33765l2M73827s != null) {
                return c33765l2M73827s.m73900x();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74184a(CrashHandleListener crashHandleListener) {
        if (crashHandleListener == null) {
            return;
        }
        f71023h = new a(crashHandleListener);
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l != null) {
            c33745k3M73653l.m73663a(f71023h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74198b(Context context, String str, String str2) {
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.putKeyValueToNative(str, str2);
        }
        C33765l2.m73825a(context).m73866c(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m74208d(boolean z11) {
        C33911s3.f71805k = z11;
    }

    /* JADX INFO: renamed from: e */
    public static void m74211e(boolean z11) {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l != null) {
            if (z11) {
                c33745k3M73653l.m73694z();
            } else {
                c33745k3M73653l.m73674e();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m74218g(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.length() > 100) {
            String strSubstring = str.substring(0, 100);
            C34012x4.m75444f("appVersion %s length is over limit %d substring to %s", str, 100, strSubstring);
            str = strSubstring;
        }
        C33791m7.m74058g(str);
        f71022g = true;
        C33765l2.m73825a(context).f70714F = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74207d(String str) {
        String strM72603b = C33571bi.m72603b(str);
        C33655fi.m73084a(C35153a.f75233k, strM72603b);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setCaseLabel(strM72603b);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m74224i() {
        CrashReport.triggerUserInfoUpload();
    }

    /* JADX INFO: renamed from: a */
    public static void m74185a(UploadHandleListener uploadHandleListener) {
        if (uploadHandleListener == null) {
            return;
        }
        f71024i = new b(uploadHandleListener);
        C33905rh c33905rhM74876d = C33905rh.m74876d();
        if (c33905rhM74876d != null) {
            c33905rhM74876d.f71762c = f71024i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74197b(Context context, String str) {
        if (context == null) {
            C34012x4.m75444f("removeUserData args context should not be null", new Object[0]);
            return null;
        }
        if (C33571bi.m72617c(str)) {
            return null;
        }
        String strM77156e = C33991w3.m75338a().m77156e(C33770l7.m73937a(C33556b3.f69018Z1, str));
        C34012x4.m75443e("[param] remove user data: %s - %s", str, strM77156e);
        C33765l2.m73825a(context).m73864c(str);
        C33768l5.m73922f().m73936i();
        return strM77156e;
    }

    /* JADX INFO: renamed from: e */
    public static void m74209e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C33791m7.m74055e(str);
        C33765l2.m73825a(context).m73881i(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeDeviceId(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n3$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d extends AbstractC33575c1 {
        @SuppressLint({"SdCardPath"})
        /* JADX INFO: renamed from: a */
        public static void m74228a(Context context, String str) {
            C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
            if (!C33571bi.m72617c(str)) {
                c33765l2M73825a.f70723O = str;
            }
            NativeExceptionUpload.setmHandler(NativeExceptionHandlerRqdImp.getInstance(context));
            C33745k3 c33745k3M73653l = C33745k3.m73653l();
            if (c33745k3M73653l != null) {
                c33745k3M73653l.m73654A();
            }
        }

        @Override // com.tencent.bugly.proguard.AbstractC33575c1
        /* JADX INFO: renamed from: a */
        public void mo72633a(Context context, boolean z11, C33555b2 c33555b2) {
            C33745k3 c33745k3M73647a = C33745k3.m73647a(1003, context, C33900rc.f71640i, null, C33808n3.f71023h, null);
            c33745k3M73647a.m73694z();
            c33745k3M73647a.m73667a(true);
            C33951u3 c33951u3 = C33808n3.f71020e;
            if (c33951u3 != null) {
                c33745k3M73647a.m73659a(c33951u3.m75117a());
                c33745k3M73647a.m73667a(C33808n3.f71020e.m75126b());
                if (!C33808n3.f71020e.m75148m()) {
                    NativeCrashHandler.getInstance().disableCatchAnrTrace();
                } else {
                    NativeCrashHandler.getInstance().enableCatchAnrTrace();
                }
                C33765l2.m73825a(context).m73871d(C33808n3.f71020e.m75150o());
            } else {
                NativeCrashHandler.getInstance().enableCatchAnrTrace();
            }
            c33745k3M73647a.m73670b();
            if (c33555b2 != null && !c33555b2.m72444o()) {
                C34012x4.m75442d("[crash] Closed native crash monitor!", new Object[0]);
                c33745k3M73647a.m73675f();
            } else {
                m74228a(context, c33555b2.m72436j());
            }
            if (c33555b2 != null && !c33555b2.m72442m()) {
                C34012x4.m75442d("[crash] Closed ANR monitor!", new Object[0]);
                c33745k3M73647a.m73673d();
            } else {
                c33745k3M73647a.m73692x();
            }
            C33810n5.m74233a(context);
            C33905rh.m74876d().f71762c = C33808n3.f71024i;
            c33745k3M73647a.m73660a(c33555b2 != null ? c33555b2.m72418c() : 3000L, true);
            try {
                AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33757kf.f70663i);
                if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C33757kf) && ((C33757kf) abstractC34022xeM77083a).m73819d().booleanValue() && AndroidVersion.isOverO()) {
                    BuglyReplayOptions buglyReplayOptions = new BuglyReplayOptions();
                    buglyReplayOptions.setQuality(((C33757kf) abstractC34022xeM77083a).m73818c());
                    buglyReplayOptions.setFrameRate(((C33757kf) abstractC34022xeM77083a).m73817b());
                    BuglyReplayManager.INSTANCE.getInstance(buglyReplayOptions).start();
                }
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        }

        @Override // com.tencent.bugly.proguard.AbstractC33575c1
        /* JADX INFO: renamed from: a */
        public void mo72636a(StrategyBean strategyBean) {
            C33745k3 c33745k3M73653l;
            if (strategyBean == null || (c33745k3M73653l = C33745k3.m73653l()) == null) {
                return;
            }
            c33745k3M73653l.m73661a(strategyBean);
        }

        @Override // com.tencent.bugly.proguard.AbstractC33575c1
        /* JADX INFO: renamed from: a */
        public String[] mo72637a() {
            return new String[]{C33641f4.f69817d};
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m74201c() {
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        if (c33765l2M73827s == null) {
            C34012x4.m75444f("Can not get device id, bugly has not been initialized.", new Object[0]);
            return "";
        }
        return c33765l2M73827s.m73890n();
    }

    /* JADX INFO: renamed from: d */
    public static BuglyReplayOptions m74205d() {
        BuglyReplayManager.Companion companion = BuglyReplayManager.INSTANCE;
        if (companion.getInstance() == null || !companion.getInstance().getInitialize()) {
            return null;
        }
        return companion.getInstance().getOptions();
    }

    /* JADX INFO: renamed from: f */
    public static void m74215f(boolean z11) {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l != null) {
            if (z11) {
                c33745k3M73653l.m73654A();
            } else {
                c33745k3M73653l.m73675f();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74182a(Context context, String str, boolean z11, C33951u3 c33951u3, long j11) {
        String str2;
        C33791m7.m74060h();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (context == null || f71018c) {
            return;
        }
        if (C33791m7.f70940f) {
            Log.w("eup", "init bugly fail for app in standalone mode.");
            return;
        }
        C33791m7.m74049b(str);
        C33745k3.f70515v = 1;
        C33765l2.m73825a(context).f70756k0 = true;
        C33745k3.f70508o = true;
        C33863pg.f71442l = C33918sa.f71848h;
        f71020e = c33951u3;
        C34012x4.f72492a = "eup";
        if (!f71021f) {
            StrategyBean.f68563w = "https://android.rqd.qq.com/analytics/async";
            StrategyBean.f68564x = "https://android.rqd.qq.com/analytics/async";
        }
        C33555b2 c33555b2 = new C33555b2();
        synchronized (c33555b2) {
            c33555b2.f68898d = j11;
        }
        if (c33951u3 != null) {
            m74184a(c33951u3.m75127c());
            m74185a(c33951u3.m75146k());
            C33745k3.f70492D = c33951u3.m75143i() * 86400000;
            C33745k3.f70493E = c33951u3.m75141h();
            C33745k3.f70494F = c33951u3.m75152q();
            C33745k3.f70495G = c33951u3.m75145j();
            C33745k3.f70496H = c33951u3.m75131d();
            C33745k3.f70517x = c33951u3.m75137f();
            C33745k3.f70490B = c33951u3.m75139g();
            C33745k3.f70516w = c33951u3.m75151p();
            C33745k3.f70497I = c33951u3.m75154s();
            c33555b2.m72420c(c33951u3.m75147l());
            c33555b2.m72426e(c33951u3.m75149n());
            c33555b2.m72438k(c33951u3.m75153r());
            c33555b2.m72431g(f71019d);
            c33555b2.m72420c(c33951u3.m75147l());
            C33765l2.m73825a(context).f70751i = c33951u3.m75153r();
        }
        if (!f71022g && (str2 = C33765l2.m73825a(context).f70714F) != null && !C33571bi.m72617c(str2)) {
            int i11 = 0;
            for (char c11 : str2.toCharArray()) {
                if (c11 == '.') {
                    i11++;
                }
            }
            if (i11 < 3) {
                String str3 = str2 + C33978va.f72339h + C33765l2.m73825a(context).f70746f0;
                C33765l2.m73825a(context).f70714F = str3;
                C34012x4.m75431a(LogState.INFO, "rqdp{ RQD version: %s }", str3);
            }
        }
        C33900rc.m74821a(f71025j);
        C33900rc.m74819a(context, str, z11, c33555b2, jUptimeMillis);
        C34003wf.m75383a(new c());
        f71018c = true;
    }

    /* JADX INFO: renamed from: e */
    public static void m74210e(String str) {
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        if (c33765l2M73827s == null) {
            C34012x4.m75444f("Can not set RDM UUID if RQD has not been initialized.", new Object[0]);
            return;
        }
        c33765l2M73827s.f70748g0 = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppBuildNum(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m74213f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C33791m7.m74057f(str);
        C33765l2.m73825a(context).m73883j(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeDeviceModel(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74202c(Context context, String str) {
        if (context == null) {
            Log.w(C34012x4.f72492a, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            return;
        }
        C33765l2.m73825a(context).m73869d(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m74217g() {
        if (!f71018c) {
            Log.e(C34012x4.f72492a, "NativeCrashReport has not been initialed! pls to call method 'initNativeCrashReport' first!");
        } else {
            C34012x4.m75442d("start to create a anr crash for test!", new Object[0]);
            C33745k3.m73653l().m73656C();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74199b(String str) {
        C33791m7.m74051c(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m74221h() {
        if (!f71018c) {
            Log.e(C34012x4.f72492a, "NativeCrashReport has not been initialed! pls to call method 'initNativeCrashReport' first!");
            return;
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    /* JADX INFO: renamed from: b */
    public static void m74200b(boolean z11) {
        C33791m7.m74046a(z11);
    }

    /* JADX INFO: renamed from: c */
    public static void m74203c(String str) {
        C33791m7.m74053d(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m74214f(String str) {
        if (!C33571bi.m72617c(str) && C33571bi.m72620e(str)) {
            f71021f = true;
            C33863pg.m74574a(str);
            StrategyBean.f68563w = str;
            StrategyBean.f68564x = str;
            return;
        }
        C34012x4.m75444f("URL is invalid.", new Object[0]);
    }

    /* JADX INFO: renamed from: g */
    public static void m74219g(String str) {
        String strM72603b = C33571bi.m72603b(str);
        C33655fi.m73084a(C35153a.f75232j, strM72603b);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setTestLabel(strM72603b);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m74223h(boolean z11) {
        C34012x4.m75444f("update standalone mode: %s", Boolean.valueOf(z11));
        C33791m7.m74048b(z11);
    }

    /* JADX INFO: renamed from: a */
    public static void m74191a(boolean z11, long j11) {
        C33918sa.m74931a(z11, j11);
    }

    /* JADX INFO: renamed from: a */
    public static void m74189a(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not post crash caught because bugly is disable.");
        } else {
            C33810n5.m74236c(thread, i11, str, str2, str3, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74193a(Thread thread, Throwable th2, String str, byte[] bArr, boolean z11) {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l != null) {
            c33745k3M73653l.m73664a(thread, th2, false, str, bArr, false, z11);
            return true;
        }
        Log.w(C34012x4.f72492a, "Can not handle catch exception because bugly is disable.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m74183a(Context context, boolean z11, boolean z12) {
        C33765l2.m73825a(context).m73854a(z11, z12);
    }

    /* JADX INFO: renamed from: a */
    public static void m74188a(String str, long j11) {
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setCrashThreadLocalKey(str, j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m74179a(Context context, String str) {
        if (context == null) {
            C34012x4.m75444f("getUserDataValue args context should not be null", new Object[0]);
            return null;
        }
        if (C33571bi.m72617c(str)) {
            return null;
        }
        return C33765l2.m73825a(context).m73847a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m74181a(Context context, String str, String str2) {
        if (context == null) {
            C34012x4.m75444f("putUserData args context should not be null", new Object[0]);
            return;
        }
        if (C33571bi.m72617c(str)) {
            C34012x4.m75444f("putUserData args key should not be null", new Object[0]);
            return;
        }
        if (C33571bi.m72617c(str2)) {
            C34012x4.m75444f("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (!str.matches("[a-zA-Z[0-9]_]+")) {
            C34012x4.m75444f(C33778lf.m73987a("putUserData args key should match [a-zA-Z[0-9]_]+  {", str, "}"), new Object[0]);
            return;
        }
        C34012x4.m75443e("[param] set user ret: %s, data: %s - %s", Boolean.valueOf(C33991w3.m75338a().putUserData(C33556b3.f69018Z1.concat(str), str2)), str, str2);
        int i11 = str.contains("_userParam_") ? TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY : 200;
        if (str2.length() > i11) {
            C34012x4.m75431a(LogState.WARN, "user data value length over limit %d , has been cutted!", Integer.valueOf(i11));
            str2 = str2.substring(0, i11);
        }
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        if (c33765l2M73825a.m73856b().contains(str)) {
            C34012x4.m75431a(LogState.INFO, "[param] replace user data: %s - %s", str, str2);
            m74198b(context, str, str2);
        } else if (c33765l2M73825a.m73834G() >= 500) {
            C34012x4.m75431a(LogState.WARN, "user data size is over limit %d , will drop this new key %s", 50, str);
        } else {
            if (str.length() > 50) {
                C34012x4.m75431a(LogState.WARN, "user data key length over limit %d , will drop this new key %s", 50, str);
                return;
            }
            C34012x4.m75431a(LogState.INFO, "[param] set user data: %s - %s", str, str2);
            m74198b(context, str, str2);
            C33768l5.m73922f().m73936i();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74192a(boolean z11, boolean z12, boolean z13) {
        if (!f71018c) {
            Log.e(C34012x4.f72492a, "NativeCrashReport has not been initialed! pls to call method 'initNativeCrashReport' first!");
        } else {
            C34012x4.m75442d("start to create a native crash for test!", new Object[0]);
            C33745k3.m73653l().m73668a(z11, z12, z13);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74190a(ArrayList<String> arrayList) {
        C33865pi.m74592a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74195a(String[] strArr) {
        if (f71018c && C33900rc.f71634c) {
            if (strArr != null && strArr.length <= 10) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (String str : strArr) {
                    if (!C33571bi.m72617c(str)) {
                        File file = new File(str);
                        if (file.exists() && file.isFile()) {
                            arrayList.add(str);
                        }
                    }
                }
                if (arrayList.size() <= 0) {
                    C34012x4.m75444f("setAdditionalAttachmentPaths failed for all empty files", new Object[0]);
                    return false;
                }
                if (NativeCrashHandler.getInstance() != null) {
                    return NativeCrashHandler.getInstance().setAdditionalAttachmentPaths(arrayList);
                }
                C34012x4.m75444f("setAdditionalAttachmentPaths failed, NativeCrashHandler is null", new Object[0]);
                return false;
            }
            C34012x4.m75444f("setAdditionalAttachmentPaths failed for params check", new Object[0]);
            return false;
        }
        C34012x4.m75444f("setAdditionalAttachmentPaths failed.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74194a(boolean z11) {
        return ThreadSuspend.m77109c().m77112a(z11);
    }

    /* JADX INFO: renamed from: a */
    public static void m74187a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C33955u7.m75163c().m75166a(str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setAppHotPatchNum(C33955u7.m75163c().m75164a());
        }
        C34012x4.m75442d("set app hot patch num: %s", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m74180a(int i11) {
        try {
            Logger.INSTANCE.resetLogLevel(i11);
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeAndroidLogLevel(i11);
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74186a(ILogProxy iLogProxy) {
        Logger.INSTANCE.setLogProxy(iLogProxy);
    }
}
