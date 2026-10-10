package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33830o4 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<c> f71290a = new a();

    /* JADX INFO: renamed from: b */
    public static final Map<Integer, String> f71291b = new b();

    /* JADX INFO: renamed from: c */
    public static final String[] f71292c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* JADX INFO: renamed from: d */
    public static final int f71293d = 1024;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$c */
    /* JADX INFO: compiled from: BUGLY */
    public static abstract class c {
        public c() {
        }

        /* JADX INFO: renamed from: a */
        public abstract String mo74414a(Context context);

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d extends c {
        public d() {
            super(null);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.gn.gnromvernumber");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "amigo/" + strM72576a + "/" + C33571bi.m72576a(context, "ro.build.display.id");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$e */
    /* JADX INFO: compiled from: BUGLY */
    public static class e extends c {
        public e() {
            super(null);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            return C33571bi.m72576a(context, "ro.build.fingerprint") + "/" + C33571bi.m72576a(context, "ro.build.rom.id");
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$f */
    /* JADX INFO: compiled from: BUGLY */
    public static class f extends c {
        public f() {
            super(null);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.build.tyd.kbstyle_version");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "dido/".concat(strM72576a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$g */
    /* JADX INFO: compiled from: BUGLY */
    public static class g extends c {
        public g() {
            super(null);
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.aa.romver");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "htc/" + strM72576a + "/" + C33571bi.m72576a(context, "ro.build.description");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$h */
    /* JADX INFO: compiled from: BUGLY */
    public static class h extends c {
        public h() {
            super(null);
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.build.version.emui");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "HuaWei/EMOTION/".concat(strM72576a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$i */
    /* JADX INFO: compiled from: BUGLY */
    public static class i extends c {
        public i() {
            super(null);
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.lenovo.series");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return C33770l7.m73937a("Lenovo/VIBE/", C33571bi.m72576a(context, "ro.build.version.incremental"));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$j */
    /* JADX INFO: compiled from: BUGLY */
    public static class j extends c {
        public j() {
            super(null);
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.meizu.product.model");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "Meizu/FLYME/" + C33571bi.m72576a(context, "ro.build.display.id");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$k */
    /* JADX INFO: compiled from: BUGLY */
    public static class k extends c {
        public k() {
            super(null);
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.build.version.opporom");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "Oppo/COLOROS/".concat(strM72576a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$l */
    /* JADX INFO: compiled from: BUGLY */
    public static class l extends c {
        public l() {
            super(null);
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.lewa.version");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "tcl/" + strM72576a + "/" + C33571bi.m72576a(context, "ro.build.display.id");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$m */
    /* JADX INFO: compiled from: BUGLY */
    public static class m extends c {
        public m() {
            super(null);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.vivo.os.build.display.id");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "vivo/FUNTOUCH/".concat(strM72576a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$n */
    /* JADX INFO: compiled from: BUGLY */
    public static class n extends c {
        public n() {
            super(null);
        }

        public /* synthetic */ n(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.miui.ui.version.name");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "XiaoMi/MIUI/".concat(strM72576a);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$o */
    /* JADX INFO: compiled from: BUGLY */
    public static class o extends c {
        public o() {
            super(null);
        }

        public /* synthetic */ o(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33830o4.c
        /* JADX INFO: renamed from: a */
        public String mo74414a(Context context) {
            String strM72576a = C33571bi.m72576a(context, "ro.build.nubia.rom.name");
            if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                return "Zte/NUBIA/" + strM72576a + "_" + C33571bi.m72576a(context, "ro.build.nubia.rom.code");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74393a() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m74394b() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return -1;
            }
            th2.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m74396c() {
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static String m74398d() {
        try {
            return Build.MODEL;
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return C33864ph.f71456b;
            }
            th2.printStackTrace();
            return C33864ph.f71456b;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m74400e() {
        if (!m74393a()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(C33598d3.m72772c().getExternalCacheDir().getAbsolutePath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return -2L;
            }
            th2.printStackTrace();
            return -2L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m74402f() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* JADX INFO: renamed from: i */
    public static long m74406i() {
        BufferedReader bufferedReaderM72568a = null;
        try {
            try {
                bufferedReaderM72568a = C33571bi.m72568a("/proc", "meminfo");
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                while (true) {
                    String line = bufferedReaderM72568a.readLine();
                    if (line == null || (j11 != 0 && j12 != 0 && j13 != 0)) {
                        break;
                        break;
                    }
                    if (line.startsWith("MemFree:")) {
                        j11 = Long.parseLong(line.split("\\s+")[1]) * 1024;
                    } else if (line.startsWith("Buffers:")) {
                        j12 = Long.parseLong(line.split("\\s+")[1]) * 1024;
                    } else if (line.startsWith("Cached:")) {
                        j13 = Long.parseLong(line.split("\\s+")[1]) * 1024;
                    }
                }
                long j14 = j11 + j12 + j13;
                try {
                    bufferedReaderM72568a.close();
                    return j14;
                } catch (IOException e11) {
                    if (!C34012x4.m75438b(e11)) {
                        e11.printStackTrace();
                    }
                    return j14;
                }
            } catch (Exception e12) {
                C34012x4.m75435a(e12);
                if (bufferedReaderM72568a == null) {
                    return -2L;
                }
                try {
                    bufferedReaderM72568a.close();
                    return -2L;
                } catch (IOException e13) {
                    if (C34012x4.m75432a(LogState.WARN, e13)) {
                        return -2L;
                    }
                    e13.printStackTrace();
                    return -2L;
                }
            }
        } catch (Throwable th2) {
            if (bufferedReaderM72568a != null) {
                try {
                    bufferedReaderM72568a.close();
                } catch (IOException e14) {
                    if (!C34012x4.m75438b(e14)) {
                        e14.printStackTrace();
                    }
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static long m74407j() {
        long j11;
        BufferedReader bufferedReaderM72568a = null;
        try {
            try {
                bufferedReaderM72568a = C33571bi.m72568a("/proc", "meminfo");
                while (true) {
                    String line = bufferedReaderM72568a.readLine();
                    if (line == null) {
                        j11 = 0;
                        break;
                    }
                    if (line.startsWith("MemTotal:")) {
                        j11 = Long.parseLong(line.split("\\s+")[1]) * 1024;
                        break;
                    }
                    if (bufferedReaderM72568a != null) {
                        try {
                            bufferedReaderM72568a.close();
                        } catch (IOException e11) {
                            if (!C34012x4.m75438b(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    throw th;
                }
                try {
                    bufferedReaderM72568a.close();
                    return j11;
                } catch (IOException e12) {
                    if (!C34012x4.m75438b(e12)) {
                        e12.printStackTrace();
                    }
                    return j11;
                }
            } catch (Exception e13) {
                C34012x4.m75435a(e13);
                if (bufferedReaderM72568a == null) {
                    return -2L;
                }
                try {
                    bufferedReaderM72568a.close();
                    return -2L;
                } catch (IOException e14) {
                    if (C34012x4.m75432a(LogState.WARN, e14)) {
                        return -2L;
                    }
                    e14.printStackTrace();
                    return -2L;
                }
            }
        } catch (Throwable th2) {
            if (bufferedReaderM72568a != null) {
                bufferedReaderM72568a.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends ArrayList<c> {
        public a() {
            a aVar = null;
            add(new n(aVar));
            add(new h(aVar));
            add(new i(aVar));
            add(new o(aVar));
            add(new j(aVar));
            add(new k(aVar));
            add(new m(aVar));
            add(new g(aVar));
            add(new l(aVar));
            add(new d(aVar));
            add(new f(aVar));
            add(new e(aVar));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o4$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b extends HashMap<Integer, String> {
        public b() {
            put(1, "GPRS");
            put(2, "EDGE");
            put(3, "UMTS");
            put(8, "HSDPA");
            put(9, "HSUPA");
            put(10, "HSPA");
            put(4, "CDMA");
            put(5, "EVDO_0");
            put(6, "EVDO_A");
            put(7, "1xRTT");
            put(11, "iDen");
            put(12, "EVDO_B");
            put(13, "LTE");
            put(14, "eHRPD");
            put(15, "HSPA+");
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m74397c(Context context) {
        Iterator<c> it = f71290a.iterator();
        while (it.hasNext()) {
            String strMo74414a = it.next().mo74414a(context);
            if (!TextUtils.isEmpty(strMo74414a)) {
                return strMo74414a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m74403f(Context context) {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f11 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f12 = fMaxMemory - f11;
        C34012x4.m75434a("maxMemory : %f", Float.valueOf(fMaxMemory));
        Object[] objArr = {Float.valueOf(f11)};
        LogState logState = LogState.DEBUG;
        C34012x4.m75431a(logState, "totalMemory : %f", objArr);
        C34012x4.m75431a(logState, "freeMemory : %f", Float.valueOf(f12));
        return f12 < 10.0f;
    }

    /* JADX INFO: renamed from: n */
    public static String m74411n() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return C33864ph.f71456b;
            }
            th2.printStackTrace();
            return C33864ph.f71456b;
        }
    }

    /* JADX INFO: renamed from: o */
    public static long m74412o() {
        BufferedReader bufferedReader;
        Throwable th2;
        long j11 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        if (line.startsWith("VmSize")) {
                            j11 = Long.parseLong(line.replaceAll("[^\\d]", ""));
                            break;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        C34012x4.m75438b(th2);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return j11 * 1024;
                    } catch (Throwable th4) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        } catch (Throwable th7) {
            bufferedReader = null;
            th2 = th7;
        }
        return j11 * 1024;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m74413p() {
        boolean z11;
        String[] strArr = f71292c;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            if (new File(strArr[i11]).exists()) {
                z11 = true;
                break;
            }
            i11++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z11;
    }

    /* JADX INFO: renamed from: g */
    public static long m74404g() {
        return Runtime.getRuntime().totalMemory();
    }

    /* JADX INFO: renamed from: h */
    public static long m74405h() {
        return Runtime.getRuntime().maxMemory();
    }

    /* JADX INFO: renamed from: k */
    public static long m74408k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
                return -1L;
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    public static long m74409l() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
                return -1L;
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m74410m() {
        if (!m74393a()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(C33598d3.m72772c().getExternalCacheDir().getAbsolutePath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
                return -2L;
            }
            return -2L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m74392a(Context context, boolean z11) {
        String property = null;
        if (z11) {
            try {
                String strM72576a = C33571bi.m72576a(context, "ro.product.cpu.abilist");
                if (C33571bi.m72617c(strM72576a) || strM72576a.equals(C33864ph.f71456b)) {
                    strM72576a = C33571bi.m72576a(context, "ro.product.cpu.abi");
                }
                if (!C33571bi.m72617c(strM72576a) && !strM72576a.equals(C33864ph.f71456b)) {
                    C34012x4.m75433a(C33830o4.class, "ABI list: ".concat(strM72576a), new Object[0]);
                    property = strM72576a.split(",")[0];
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
                return C33864ph.f71456b;
            }
        }
        if (property == null) {
            property = System.getProperty("os.arch");
        }
        return "" + property;
    }

    /* JADX INFO: renamed from: b */
    public static long m74395b(Context context) {
        long pss;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0L;
            }
            pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        return pss * 1024;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m74399d(Context context) {
        return !TextUtils.isEmpty(new k().mo74414a(context));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m74401e(Context context) {
        return !TextUtils.isEmpty(new m().mo74414a(context));
    }

    /* JADX INFO: renamed from: a */
    public static String m74391a(Context context) {
        TelephonyManager telephonyManager;
        int networkType;
        String str;
        String str2 = "unknown";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
                return "unknown";
            }
            if (!C33872q4.m74663a(context, C33872q4.f71536c)) {
                networkType = 0;
                str = "unknown";
            } else {
                networkType = telephonyManager.getNetworkType();
                str = f71291b.get(Integer.valueOf(networkType));
            }
            if (str != null) {
                try {
                    if (!str.equals("unknown")) {
                        return str;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str2 = str;
                }
            }
            return "MOBILE(" + networkType + ")";
        } catch (Exception e12) {
            e = e12;
        }
        if (!C34012x4.m75438b(e)) {
            e.printStackTrace();
        }
        return str2;
    }
}
