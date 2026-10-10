package com.tencent.feedback.eup;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C33571bi;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33597d2;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33620e4;
import com.tencent.bugly.proguard.C33655fi;
import com.tencent.bugly.proguard.C33745k3;
import com.tencent.bugly.proguard.C33765l2;
import com.tencent.bugly.proguard.C33778lf;
import com.tencent.bugly.proguard.C33779lg;
import com.tencent.bugly.proguard.C33784m0;
import com.tencent.bugly.proguard.C33808n3;
import com.tencent.bugly.proguard.C33891r3;
import com.tencent.bugly.proguard.C33900rc;
import com.tencent.bugly.proguard.C33905rh;
import com.tencent.bugly.proguard.C33918sa;
import com.tencent.bugly.proguard.C33951u3;
import com.tencent.bugly.proguard.C33969v1;
import com.tencent.bugly.proguard.C34012x4;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.rmonitor.common.logger.ILogProxy;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class CrashReport {

    /* JADX INFO: renamed from: a */
    public static final String f73245a = "TestLabel";

    /* JADX INFO: renamed from: b */
    public static final String f73246b = "https://rmonitor.qq.com";

    /* JADX INFO: renamed from: c */
    public static final String f73247c = "https://pro.bugly.qq.com";

    /* JADX INFO: renamed from: d */
    public static final String f73248d = "https://android.bugly.tencent.com";

    /* JADX INFO: renamed from: e */
    public static final String f73249e = "https://t.rmonitor.qq.com";

    /* JADX INFO: renamed from: f */
    public static final String f73250f = "https://t.pro.bugly.qq.com";

    /* JADX INFO: renamed from: g */
    public static final String f73251g = "https://pre.rmonitor.qq.com";

    /* JADX INFO: renamed from: com.tencent.feedback.eup.CrashReport$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface InterfaceC34293a {

        /* JADX INFO: renamed from: a */
        public static final String f73252a = "Unknown";

        /* JADX INFO: renamed from: b */
        public static final String f73253b = "Debug";

        /* JADX INFO: renamed from: c */
        public static final String f73254c = "Gray";

        /* JADX INFO: renamed from: d */
        public static final String f73255d = "Release";
    }

    /* JADX INFO: renamed from: com.tencent.feedback.eup.CrashReport$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface InterfaceC34294b {

        /* JADX INFO: renamed from: a */
        public static final int f73256a = LogState.OFF.getValue();

        /* JADX INFO: renamed from: b */
        public static final int f73257b = LogState.ERROR.getValue();

        /* JADX INFO: renamed from: c */
        public static final int f73258c = LogState.WARN.getValue();

        /* JADX INFO: renamed from: d */
        public static final int f73259d = LogState.INFO.getValue();

        /* JADX INFO: renamed from: e */
        public static final int f73260e = LogState.DEBUG.getValue();

        /* JADX INFO: renamed from: f */
        public static final int f73261f = LogState.VERBOS.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m75843a(Context context, String str, boolean z11) {
        m75844a(context, str, z11, (C33951u3) null);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m75870b(boolean z11) {
        C34012x4.m75442d("sorry, enableNativeSubProcess interface is deprecated, please use native_sub_process config", new Object[0]);
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static byte[] m75876c(Context context) {
        C33745k3 c33745k3;
        if (C33745k3.m73653l() == null) {
            return null;
        }
        synchronized (C33745k3.class) {
            c33745k3 = C33745k3.f70506R;
        }
        return c33745k3.m73669a(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static boolean m75881d() {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l == null) {
            return false;
        }
        c33745k3M73653l.m73660a(0L, false);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static C33951u3 m75883e() {
        return C33808n3.f71020e;
    }

    /* JADX INFO: renamed from: f */
    public static void m75890f(boolean z11) {
        C33808n3.m74215f(z11);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static void m75892g(Context context, String str) {
        C33765l2.m73825a(context).f70747g = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m75897h(boolean z11) {
        C33808n3.m74220g(z11);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static long m75899i() {
        C33905rh c33905rhM74876d = C33905rh.m74876d();
        if (c33905rhM74876d != null) {
            return c33905rhM74876d.m74877a(false);
        }
        return -1L;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static boolean m75905j() {
        return m75863b() > 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m75907k() {
        return C33808n3.m74216f();
    }

    /* JADX INFO: renamed from: l */
    public static void m75909l(Context context, String str) {
        C33808n3.m74222h(context, str);
    }

    /* JADX INFO: renamed from: n */
    public static void m75911n() {
        C33808n3.m74192a(false, true, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m75844a(Context context, String str, boolean z11, C33951u3 c33951u3) {
        C33598d3.m72770a(context);
        C33808n3.m74182a(context, str, z11, c33951u3, 0L);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m75865b(Context context, String str) {
        C33765l2.m73825a(context).m73859b(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static int m75882e(Context context) {
        if (context != null) {
            return C33765l2.m73825a(context).m73835H();
        }
        C34012x4.m75444f("getUserSceneTagId args context should not be null", new Object[0]);
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m75888f(Context context, String str) {
        C33808n3.m74206d(context, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m75893g(String str) {
        C33808n3.m74210e(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m75896h(Context context, String str) {
        C33808n3.m74209e(context, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static void m75903j(Context context, String str) {
        C33891r3.m74778h(context, str);
    }

    /* JADX INFO: renamed from: k */
    public static void m75906k(Context context, String str) {
        C33808n3.m74218g(context, str);
    }

    /* JADX INFO: renamed from: l */
    public static void m75908l() {
        C33808n3.m74217g();
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public static void m75912o() {
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

    @Deprecated
    public static void triggerUserInfoUpload() {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not upload user info because bugly is disable.");
        } else if (!C33808n3.f71018c || C33918sa.f71856p == null) {
            Log.w(C34012x4.f72492a, "Can not upload user info because bugly is not init.");
        } else {
            C34012x4.m75434a("trigger upload user info", new Object[0]);
            C33918sa.f71856p.m75239a(8);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m75863b() {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l != null) {
            return c33745k3M73653l.m73676g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m75880d(boolean z11) {
        C33808n3.m74211e(z11);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static void m75889f(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Set crash stack filter: " + str);
        C33745k3.f70505Q = str;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static void m75894g(boolean z11) {
        C33808n3.f71019d = z11;
    }

    /* JADX INFO: renamed from: h */
    public static String m75895h() {
        try {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            return c33765l2M73827s != null ? c33765l2M73827s.m73900x() : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m75900i(Context context, String str) {
        C33808n3.m74213f(context, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m75904j(String str) {
        C33808n3.m74219g(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m75910m() {
        C33808n3.m74221h();
    }

    /* JADX INFO: renamed from: a */
    public static void m75845a(Context context, String str, boolean z11, C33951u3 c33951u3, long j11) {
        C33598d3.m72770a(context);
        C33808n3.m74182a(context, str, z11, c33951u3, j11);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static void m75878d(Context context, String str) {
        C33765l2.m73825a(context).f70767q = str;
        C34012x4.m75434a("set sha1 %s", str);
    }

    /* JADX INFO: renamed from: e */
    public static void m75886e(boolean z11) {
        C33620e4.f69670c = z11;
    }

    /* JADX INFO: renamed from: g */
    public static BuglyReplayOptions m75891g() {
        if (!C33808n3.m74212e()) {
            Log.i(C34012x4.f72492a, "get replay options failed, pls init bugly first!");
            return null;
        }
        return C33808n3.m74205d();
    }

    /* JADX INFO: renamed from: i */
    public static void m75901i(String str) {
        C33808n3.m74214f(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static String m75864b(Context context) {
        return C33765l2.m73825a(context).m73890n();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m75871c() {
        return m75863b();
    }

    /* JADX INFO: renamed from: e */
    public static void m75884e(Context context, String str) {
        C33808n3.m74202c(context, str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m75898h(String str) {
        return C33597d2.m72767a(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m75902i(boolean z11) {
        C33808n3.m74223h(z11);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m75858a(Context context, String str, String str2, String str3) {
        return C33765l2.m73825a(context).m73855a(str, str2, str3);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m75867b(Context context, List<C33779lg> list) {
        if (context == null) {
            C34012x4.m75444f("setSOFile args context should not be null", new Object[0]);
            return;
        }
        if (list == null || list.size() == 0) {
            return;
        }
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        HashMap map = new HashMap(list.size());
        for (C33779lg c33779lg : list) {
            map.put(RunnableC33958ua.f72250e + c33779lg.f70848c, new PlugInBean(c33779lg.f70846a, c33779lg.f70847b, c33779lg.f70848c));
        }
        c33765l2M73825a.m73861b(map);
    }

    /* JADX INFO: renamed from: c */
    public static String m75872c(Context context, String str) {
        return C33808n3.m74197b(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static int m75877d(Context context) {
        if (context == null) {
            C34012x4.m75444f("getUserDatasSize args context should not be null", new Object[0]);
            return -1;
        }
        return C33765l2.m73825a(context).m73834G();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static void m75885e(String str) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set App package because bugly is disable.");
            return;
        }
        Log.i(C34012x4.f72492a, "Set crash stack filter: " + str);
        C33745k3.f70504P = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m75853a(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        C33808n3.m74189a(thread, i11, str, str2, str3, map);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static void m75873c(Context context, boolean z11) {
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

    /* JADX INFO: renamed from: f */
    public static String m75887f() {
        return C33591ch.m72746d();
    }

    /* JADX INFO: renamed from: a */
    public static void m75839a(int i11, String str, String str2, String str3, Map<String, String> map) {
        C33808n3.m74189a(Thread.currentThread(), i11, str, str2, str3, map);
    }

    /* JADX INFO: renamed from: d */
    public static void m75879d(String str) {
        C33808n3.m74207d(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75848a(Context context, boolean z11, boolean z12) {
        C33808n3.m74183a(context, z11, z12);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75859a(Thread thread, Throwable th2, String str, byte[] bArr) {
        return C33808n3.m74193a(thread, th2, str, bArr, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m75874c(String str) {
        C33808n3.m74203c(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75860a(Thread thread, Throwable th2, String str, byte[] bArr, boolean z11) {
        return C33808n3.m74193a(thread, th2, str, bArr, z11);
    }

    /* JADX INFO: renamed from: c */
    public static void m75875c(boolean z11) {
        C33808n3.m74200b(z11);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75837a() {
        C33905rh c33905rhM74876d = C33905rh.m74876d();
        if (c33905rhM74876d != null) {
            c33905rhM74876d.m74892b();
            c33905rhM74876d.m74878a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m75868b(Context context, boolean z11) {
        C33765l2.m73825a(context).m73850a(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: b */
    public static void m75866b(Context context, String str, String str2) {
        C33808n3.m74181a(context, str, str2);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75855a(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService != null) {
            C33784m0.m74004c().m74005a(scheduledExecutorService);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m75869b(String str) {
        C33808n3.m74199b(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75846a(Context context, List<C33779lg> list) {
        if (context == null) {
            C34012x4.m75444f("addSoFiles args context should not be null", new Object[0]);
            return;
        }
        if (list == null || list.size() == 0) {
            return;
        }
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        HashMap map = new HashMap(list.size());
        for (C33779lg c33779lg : list) {
            map.put(RunnableC33958ua.f72250e + c33779lg.f70848c, new PlugInBean(c33779lg.f70846a, c33779lg.f70847b, c33779lg.f70848c));
        }
        c33765l2M73825a.m73852a(map);
    }

    /* JADX INFO: renamed from: a */
    public static void m75851a(String str, long j11) {
        if (!TextUtils.isEmpty(str) && j11 != 0) {
            C33808n3.m74188a(str, j11);
        } else {
            C34012x4.m75444f("setCrashThreadLocalKey args keyName or key should not be null", new Object[0]);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75840a(Context context, int i11) {
        if (context == null) {
            C34012x4.m75444f("setTag args context should not be null", new Object[0]);
        } else if (i11 <= 0) {
            C34012x4.m75444f("setTag args tagId should > 0", new Object[0]);
        } else {
            C33765l2.m73825a(context).m73857b(i11);
            C34012x4.m75443e("[param] set user scene tag: %d", Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m75835a(Context context, String str) {
        return C33808n3.m74179a(context, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75842a(Context context, String str, String str2) {
        if (context == null) {
            C34012x4.m75444f("putUploadRequestData args context should not be null", new Object[0]);
            return;
        }
        if (C33571bi.m72617c(str)) {
            C34012x4.m75444f("putUploadRequestData args key should not be null", new Object[0]);
            return;
        }
        if (C33571bi.m72617c(str2)) {
            C34012x4.m75444f("putUploadRequestData args value should not be null", new Object[0]);
            return;
        }
        if (!str.matches("[a-zA-Z[0-9]]+")) {
            C34012x4.m75444f(C33778lf.m73987a("putUploadRequestData args key should match [a-zA-Z[0-9]_]+  {", str, "}"), new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            C34012x4.m75444f("upload request data value length over limit %d , has been cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        if (str.length() > 50) {
            C34012x4.m75444f("upload request data key length over limit %d , will drop this new key %s", 50, str);
        } else {
            C33765l2.m73825a(context).m73851a(str, str2, false);
            C34012x4.m75443e("[param] put upload request data: %s - %s", str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m75836a(Context context) {
        if (context == null) {
            C34012x4.m75444f("getAllUserDataKeys args context should not be null", new Object[0]);
            return null;
        }
        return C33765l2.m73825a(context).m73856b();
    }

    /* JADX INFO: renamed from: a */
    public static void m75857a(boolean z11, boolean z12, boolean z13) {
        C33808n3.m74192a(z11, z12, z13);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75847a(Context context, boolean z11) {
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

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m75856a(boolean z11, boolean z12) {
        NativeCrashHandler nativeCrashHandler;
        if (z11 && (nativeCrashHandler = NativeCrashHandler.getInstance()) != null) {
            nativeCrashHandler.filterSigabrtSysLog();
        }
        C33745k3.f70498J = z12;
    }

    /* JADX INFO: renamed from: a */
    public static void m75854a(ArrayList<String> arrayList) {
        C33808n3.m74190a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75862a(String[] strArr) {
        return C33808n3.m74195a(strArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75861a(boolean z11) {
        return C33808n3.m74194a(z11);
    }

    /* JADX INFO: renamed from: a */
    public static void m75852a(String str, String str2) {
        if ("RDelivery".equals(str)) {
            C33655fi.m73086b(str2);
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setAppVersionLabel(str2);
                return;
            }
            return;
        }
        if (f73245a.equals(str)) {
            C33808n3.m74219g(str2);
        } else {
            C34012x4.m75444f("Failed to put reserved request data, key is null or illegal.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75841a(Context context, int i11, boolean z11) {
        if (!C33900rc.f71634c) {
            Log.w(C34012x4.f72492a, "Can not set app fore ground because bugly is disable.");
            return;
        }
        if (context == null) {
            C34012x4.m75444f("Context should not be null.", new Object[0]);
            return;
        }
        C33765l2.m73825a(context).m73853a(z11);
        C34012x4.m75442d("Set app fore ground: " + z11 + ", service hash: " + i11, new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static void m75850a(String str) {
        C33808n3.m74187a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75838a(int i11) {
        if (i11 < InterfaceC34294b.f73256a || i11 > InterfaceC34294b.f73261f) {
            return;
        }
        C33808n3.m74180a(i11);
    }

    /* JADX INFO: renamed from: a */
    public static void m75849a(ILogProxy iLogProxy) {
        C33808n3.m74186a(iLogProxy);
    }
}
