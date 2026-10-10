package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33768l5 implements InterfaceC34037y9 {

    /* JADX INFO: renamed from: A */
    public static long f70799A = 0;

    /* JADX INFO: renamed from: B */
    public static int f70800B = 0;

    /* JADX INFO: renamed from: C */
    public static boolean f70801C = false;

    /* JADX INFO: renamed from: D */
    public static double f70802D = 0.0d;

    /* JADX INFO: renamed from: E */
    public static volatile C33768l5 f70803E = null;

    /* JADX INFO: renamed from: g */
    public static final int f70804g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f70805h = 5;

    /* JADX INFO: renamed from: i */
    public static final int f70806i = 6;

    /* JADX INFO: renamed from: j */
    public static final int f70807j = 12;

    /* JADX INFO: renamed from: k */
    public static final int f70808k = 9;

    /* JADX INFO: renamed from: l */
    public static final int f70809l = 7;

    /* JADX INFO: renamed from: m */
    public static final int f70810m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f70811n = 8;

    /* JADX INFO: renamed from: o */
    public static final String f70812o = "bugly_exit_info";

    /* JADX INFO: renamed from: p */
    public static final String f70813p = "bugly_exit_data";

    /* JADX INFO: renamed from: q */
    public static final long f70814q = 259200000;

    /* JADX INFO: renamed from: r */
    public static final int f70815r = 30;

    /* JADX INFO: renamed from: s */
    public static final String f70816s = "bugly_stage";

    /* JADX INFO: renamed from: t */
    public static final long f70817t = 86400000;

    /* JADX INFO: renamed from: u */
    public static final int f70818u = 50;

    /* JADX INFO: renamed from: v */
    public static final int f70819v = 10;

    /* JADX INFO: renamed from: w */
    public static final String f70820w = "exit_trace_";

    /* JADX INFO: renamed from: x */
    public static final String f70821x = "exit_tombs_";

    /* JADX INFO: renamed from: y */
    public static final String f70822y = "exit_data_";

    /* JADX INFO: renamed from: z */
    public static long f70823z;

    /* JADX INFO: renamed from: c */
    public String f70825c;

    /* JADX INFO: renamed from: d */
    public String f70826d;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<String, String> f70824b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public boolean f70827e = false;

    /* JADX INFO: renamed from: f */
    public final Object f70828f = new Object();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.l5$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C33768l5.this.f70828f) {
                try {
                    String str = C33768l5.this.f70825c + File.separator + C33768l5.f70822y + C33765l2.f70706I0;
                    C33768l5 c33768l5 = C33768l5.this;
                    FileUtil.writeFile(str, (InputStream) new ByteArrayInputStream(c33768l5.m73924a(c33768l5.f70824b).getBytes("UTF-8")), false);
                } catch (Throwable th2) {
                    C34012x4.m75438b(th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.l5$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C34012x4.m75442d("Check and upload exit info.", new Object[0]);
            if (C33830o4.m74394b() < 30) {
                C34012x4.m75431a(LogState.INFO, "Api level is lower than 30, cannot get app exit info.", new Object[0]);
                return;
            }
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a("application_exit");
            if (abstractC34022xeM77083a instanceof C33726j5) {
                C33726j5 c33726j5 = (C33726j5) abstractC34022xeM77083a;
                boolean unused = C33768l5.f70801C = c33726j5.m73524c();
                C33768l5.f70802D = c33726j5.m73523b();
            }
            try {
                if (!C33768l5.f70801C) {
                    C34012x4.m75431a(LogState.INFO, "App exit info disable.", new Object[0]);
                    return;
                }
                ActivityManager activityManager = (ActivityManager) C33598d3.m72772c().getSystemService("activity");
                Method method = activityManager.getClass().getMethod("setProcessStateSummary", byte[].class);
                if (method != null) {
                    method.invoke(activityManager, C33765l2.f70706I0.getBytes("UTF-8"));
                }
                C33768l5.this.m73934g();
                if (!ProcessUtil.isMainProcess(C33598d3.m72772c())) {
                    C34012x4.m75431a(LogState.INFO, "Not main process, do not check exit info.", new Object[0]);
                } else {
                    C33768l5.this.m73932d();
                    C33768l5.this.m73925a(activityManager);
                    C33768l5.this.m73930c();
                }
            } catch (Throwable th2) {
                C34012x4.m75432a(LogState.WARN, th2);
            }
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static C33768l5 m73922f() {
        if (f70803E == null) {
            synchronized (C33768l5.class) {
                try {
                    if (f70803E == null) {
                        f70803E = new C33768l5();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f70803E;
    }

    /* JADX INFO: renamed from: b */
    public final void m73928b(String str) {
        try {
            FileUtil.deleteFile(this.f70825c + File.separator + f70822y + str);
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73930c() {
        File[] fileArrListFiles;
        if (this.f70825c == null) {
            return;
        }
        File file = new File(this.f70825c);
        try {
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                int length = fileArrListFiles.length > 30 ? fileArrListFiles.length - 30 : 0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C33539a7.m72314a(fileArrListFiles);
                for (File file2 : fileArrListFiles) {
                    if (length > 0) {
                        FileUtil.deleteFile(file2);
                        length--;
                    } else if (jCurrentTimeMillis - file2.lastModified() > 259200000) {
                        FileUtil.deleteFile(file2);
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m73932d() {
        if (this.f70826d == null) {
            return;
        }
        File file = new File(this.f70826d);
        if (!file.exists()) {
            C34012x4.m75434a("make exit info dir, " + file.mkdirs(), new Object[0]);
        }
        ArrayList<File> files = FileUtil.getFiles(this.f70826d, null);
        if (files == null || files.isEmpty()) {
            return;
        }
        Iterator<File> it = files.iterator();
        while (it.hasNext()) {
            FileUtil.deleteFile(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m73933e() {
        if (this.f70825c == null) {
            return;
        }
        File file = new File(this.f70825c);
        if (file.exists() || file.mkdirs()) {
            this.f70827e = true;
        } else {
            C34012x4.m75444f("make exit info data dir failed!", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m73936i() {
        if (f70801C && this.f70827e) {
            try {
                Map<String, String> mapM73880i = C33765l2.m73825a(C33598d3.m72772c()).m73880i();
                if (mapM73880i != null) {
                    this.f70824b.putAll(mapM73880i);
                    m73935h();
                }
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
            }
        }
    }

    public C33768l5() {
        try {
            Context contextM72772c = C33598d3.m72772c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(contextM72772c.getFilesDir().getAbsolutePath());
            String str = File.separator;
            sb2.append(str);
            sb2.append(f70813p);
            this.f70825c = sb2.toString();
            this.f70826d = contextM72772c.getFilesDir().getAbsolutePath() + str + f70812o;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73934g() {
        try {
            m73933e();
            if (this.f70827e) {
                String strM73094e = C33657g.m73094e();
                if (strM73094e != null) {
                    this.f70824b.put(f70816s, strM73094e);
                }
                C33657g.m73095h().m73099a(this);
                m73936i();
                m73935h();
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73935h() {
        C33784m0.m74004c().m74006a(new a());
    }

    /* JADX INFO: renamed from: b */
    public void m73927b() {
        C33784m0.m74004c().m74006a(new b());
    }

    /* JADX INFO: renamed from: a */
    public final void m73926a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        f70823z = sharedPreferences.getLong(C33577c3.f69342P, 0L);
        f70799A = sharedPreferences.getLong(C33577c3.f69341O, 0L);
        f70800B = sharedPreferences.getInt(C33577c3.f69340N, 0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0296 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x016b A[PHI: r23 r24 r25 r26
      0x016b: PHI (r23v5 java.lang.reflect.Method) = (r23v3 java.lang.reflect.Method), (r23v3 java.lang.reflect.Method), (r23v6 java.lang.reflect.Method) binds: [B:104:0x02a6, B:105:0x02a8, B:62:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r24v4 java.lang.reflect.Method) = (r24v2 java.lang.reflect.Method), (r24v2 java.lang.reflect.Method), (r24v5 java.lang.reflect.Method) binds: [B:104:0x02a6, B:105:0x02a8, B:62:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r25v6 java.lang.reflect.Method) = (r25v4 java.lang.reflect.Method), (r25v4 java.lang.reflect.Method), (r25v7 java.lang.reflect.Method) binds: [B:104:0x02a6, B:105:0x02a8, B:62:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r26v4 java.lang.reflect.Method) = (r26v2 java.lang.reflect.Method), (r26v2 java.lang.reflect.Method), (r26v5 java.lang.reflect.Method) binds: [B:104:0x02a6, B:105:0x02a8, B:62:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x016e A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0174 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0187 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0195 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0237  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0290 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x0004, B:14:0x0071, B:16:0x009c, B:19:0x00a4, B:20:0x00aa, B:22:0x00b0, B:26:0x00dc, B:33:0x00f2, B:37:0x0105, B:39:0x0108, B:45:0x011d, B:47:0x0127, B:49:0x012d, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014b, B:59:0x0152, B:61:0x015a, B:64:0x016e, B:66:0x0174, B:68:0x017b, B:93:0x020f, B:97:0x023d, B:99:0x0290, B:101:0x0296, B:106:0x02aa, B:108:0x02d0, B:109:0x02d2, B:96:0x0239, B:72:0x0187, B:75:0x018e, B:77:0x0195, B:79:0x019f, B:81:0x01aa, B:83:0x01cb, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ef, B:113:0x02f7, B:115:0x030a, B:117:0x030e, B:118:0x0317, B:119:0x032a, B:121:0x036a, B:123:0x0373), top: B:127:0x0004 }] */
    /* JADX INFO: renamed from: a */
    public final void m73925a(ActivityManager activityManager) {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        String str;
        String str2;
        String str3;
        int i11;
        InputStream inputStream;
        InputStream inputStream2;
        Integer num;
        Integer num2;
        int iIntValue;
        String str4;
        Map<String, String> mapM73929c;
        try {
            Class<?> cls = activityManager.getClass();
            Class cls2 = Integer.TYPE;
            Method method5 = cls.getMethod("getHistoricalProcessExitReasons", String.class, cls2, cls2);
            Class<?> cls3 = Class.forName("android.app.ApplicationExitInfo");
            int i12 = 0;
            Method method6 = cls3.getMethod("getTimestamp", new Class[0]);
            Method method7 = cls3.getMethod("getReason", new Class[0]);
            Method method8 = cls3.getMethod("getPid", new Class[0]);
            Method method9 = cls3.getMethod("getProcessName", new Class[0]);
            Method method10 = cls3.getMethod("getDescription", new Class[0]);
            Method method11 = cls3.getMethod("getTraceInputStream", new Class[0]);
            Method method12 = cls3.getMethod("getProcessStateSummary", new Class[0]);
            Method method13 = cls3.getMethod("getImportance", new Class[0]);
            if (method5 != null && method6 != null && method7 != null && method8 != null && method9 != null && method10 != null && method11 != null && method12 != null && method13 != null) {
                SharedPreferences sharedPreferences = C33765l2.m73827s().f70760m0;
                m73926a(sharedPreferences);
                C33789m5.m74036a().m74039a(C33598d3.m72772c());
                List list = (List) method5.invoke(activityManager, null, 0, 0);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    int i13 = 0;
                    int i14 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        it = it;
                        Long l11 = (Long) method6.invoke(next, new Object[i12]);
                        Method method14 = method6;
                        Integer num3 = (Integer) method7.invoke(next, new Object[i12]);
                        if (l11 == null || num3 == null) {
                            method = method13;
                            method2 = method8;
                            method3 = method9;
                            method4 = method10;
                            method12 = method12;
                        } else {
                            if (l11.longValue() < f70823z || 50 <= i13 || 10 <= i14) {
                                break;
                            }
                            int i15 = i13 + 1;
                            byte[] bArr = (byte[]) method12.invoke(next, new Object[0]);
                            if (bArr != null) {
                                str = "";
                                if (bArr.length != 0) {
                                    str2 = new String(bArr, "UTF-8");
                                }
                                if (num3.intValue() == 4 && num3.intValue() != 5 && num3.intValue() != 6 && num3.intValue() != 12 && num3.intValue() != 9 && num3.intValue() != 7 && num3.intValue() != 3 && num3.intValue() != 8) {
                                    f70800B++;
                                    m73928b(str2);
                                } else {
                                    if (num3.intValue() == 4 && num3.intValue() != 5 && num3.intValue() != 6) {
                                        i11 = 0;
                                        str3 = null;
                                    } else if (TextUtils.isEmpty(str2)) {
                                        if (num3.intValue() == 6 || Math.random() >= f70802D || (inputStream2 = (InputStream) method11.invoke(next, new Object[0])) == null) {
                                            str3 = null;
                                        } else {
                                            str3 = this.f70826d + File.separator + f70820w + str2;
                                            FileUtil.writeFile(str3, inputStream2, false);
                                        }
                                        if (num3.intValue() == 5 && C33830o4.m74394b() >= 31 && Math.random() < f70802D && (inputStream = (InputStream) method11.invoke(next, new Object[0])) != null) {
                                            str3 = this.f70826d + File.separator + f70821x + str2;
                                            FileUtil.writeFile(str3, inputStream, false);
                                        }
                                        i11 = 0;
                                    }
                                    num = (Integer) method8.invoke(next, new Object[i11]);
                                    method2 = method8;
                                    String str5 = (String) method9.invoke(next, new Object[i11]);
                                    method3 = method9;
                                    String str6 = (String) method10.invoke(next, new Object[i11]);
                                    method4 = method10;
                                    num2 = (Integer) method13.invoke(next, new Object[i11]);
                                    if (num2 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = num2.intValue();
                                    }
                                    Integer numValueOf = Integer.valueOf(iIntValue);
                                    StringBuilder sb2 = new StringBuilder();
                                    method = method13;
                                    sb2.append("exitProcessId:");
                                    sb2.append(num);
                                    sb2.append("; exitProcessName:");
                                    sb2.append(str5);
                                    sb2.append("; exitTime:");
                                    sb2.append(l11);
                                    sb2.append("; exitReason:");
                                    sb2.append(num3);
                                    sb2.append("; exitDescription:");
                                    sb2.append(str6);
                                    sb2.append("; crashIdentify: ");
                                    sb2.append(str2);
                                    sb2.append("; importance = ");
                                    sb2.append(numValueOf);
                                    C34012x4.m75442d(sb2.toString(), new Object[0]);
                                    if (TextUtils.isEmpty(str2)) {
                                        str4 = str;
                                        mapM73929c = null;
                                    } else {
                                        mapM73929c = m73929c(str2);
                                        if (mapM73929c != null) {
                                            str4 = mapM73929c.get(f70816s);
                                            mapM73929c.remove(f70816s);
                                        } else {
                                            str4 = str;
                                        }
                                    }
                                    if (num == null && str5 != null) {
                                        C33747k5 c33747k5 = new C33747k5();
                                        c33747k5.f70548a = num.intValue();
                                        c33747k5.f70549b = str5;
                                        c33747k5.f70550c = l11.longValue();
                                        c33747k5.f70551d = num3.intValue();
                                        c33747k5.f70552e = str6;
                                        c33747k5.f70553f = str3;
                                        c33747k5.f70554g = str2;
                                        c33747k5.f70555h = iIntValue;
                                        c33747k5.f70556i = str4;
                                        if (mapM73929c != null) {
                                            c33747k5.f70557j = mapM73929c;
                                        }
                                        C33789m5.m74036a().m74040a(c33747k5, this.f70826d);
                                        i14++;
                                    }
                                    i13 = i15;
                                }
                                method = method13;
                                method2 = method8;
                                method3 = method9;
                                method4 = method10;
                                i13 = i15;
                            } else {
                                str = "";
                            }
                            str2 = str;
                            if (num3.intValue() == 4) {
                                if (num3.intValue() == 4) {
                                    if (TextUtils.isEmpty(str2)) {
                                        if (num3.intValue() == 6) {
                                            str3 = null;
                                        } else {
                                            str3 = null;
                                        }
                                        if (num3.intValue() == 5) {
                                            str3 = this.f70826d + File.separator + f70821x + str2;
                                            FileUtil.writeFile(str3, inputStream, false);
                                        }
                                        i11 = 0;
                                    } else {
                                        method = method13;
                                        method2 = method8;
                                        method3 = method9;
                                        method4 = method10;
                                    }
                                } else if (TextUtils.isEmpty(str2)) {
                                    method = method13;
                                    method2 = method8;
                                    method3 = method9;
                                    method4 = method10;
                                } else {
                                    if (num3.intValue() == 6) {
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                    }
                                    if (num3.intValue() == 5) {
                                        str3 = this.f70826d + File.separator + f70821x + str2;
                                        FileUtil.writeFile(str3, inputStream, false);
                                    }
                                    i11 = 0;
                                }
                                num = (Integer) method8.invoke(next, new Object[i11]);
                                method2 = method8;
                                String str7 = (String) method9.invoke(next, new Object[i11]);
                                method3 = method9;
                                String str8 = (String) method10.invoke(next, new Object[i11]);
                                method4 = method10;
                                num2 = (Integer) method13.invoke(next, new Object[i11]);
                                if (num2 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = num2.intValue();
                                }
                                Integer numValueOf2 = Integer.valueOf(iIntValue);
                                StringBuilder sb3 = new StringBuilder();
                                method = method13;
                                sb3.append("exitProcessId:");
                                sb3.append(num);
                                sb3.append("; exitProcessName:");
                                sb3.append(str7);
                                sb3.append("; exitTime:");
                                sb3.append(l11);
                                sb3.append("; exitReason:");
                                sb3.append(num3);
                                sb3.append("; exitDescription:");
                                sb3.append(str8);
                                sb3.append("; crashIdentify: ");
                                sb3.append(str2);
                                sb3.append("; importance = ");
                                sb3.append(numValueOf2);
                                C34012x4.m75442d(sb3.toString(), new Object[0]);
                                if (TextUtils.isEmpty(str2)) {
                                    mapM73929c = m73929c(str2);
                                    if (mapM73929c != null) {
                                        str4 = mapM73929c.get(f70816s);
                                        mapM73929c.remove(f70816s);
                                    } else {
                                        str4 = str;
                                    }
                                } else {
                                    str4 = str;
                                    mapM73929c = null;
                                }
                                if (num == null) {
                                }
                            } else {
                                if (num3.intValue() == 4) {
                                    if (TextUtils.isEmpty(str2)) {
                                        method = method13;
                                        method2 = method8;
                                        method3 = method9;
                                        method4 = method10;
                                    } else {
                                        if (num3.intValue() == 6) {
                                            str3 = null;
                                        } else {
                                            str3 = null;
                                        }
                                        if (num3.intValue() == 5) {
                                            str3 = this.f70826d + File.separator + f70821x + str2;
                                            FileUtil.writeFile(str3, inputStream, false);
                                        }
                                        i11 = 0;
                                    }
                                } else if (TextUtils.isEmpty(str2)) {
                                    method = method13;
                                    method2 = method8;
                                    method3 = method9;
                                    method4 = method10;
                                } else {
                                    if (num3.intValue() == 6) {
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                    }
                                    if (num3.intValue() == 5) {
                                        str3 = this.f70826d + File.separator + f70821x + str2;
                                        FileUtil.writeFile(str3, inputStream, false);
                                    }
                                    i11 = 0;
                                }
                                num = (Integer) method8.invoke(next, new Object[i11]);
                                method2 = method8;
                                String str9 = (String) method9.invoke(next, new Object[i11]);
                                method3 = method9;
                                String str10 = (String) method10.invoke(next, new Object[i11]);
                                method4 = method10;
                                num2 = (Integer) method13.invoke(next, new Object[i11]);
                                if (num2 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = num2.intValue();
                                }
                                Integer numValueOf3 = Integer.valueOf(iIntValue);
                                StringBuilder sb4 = new StringBuilder();
                                method = method13;
                                sb4.append("exitProcessId:");
                                sb4.append(num);
                                sb4.append("; exitProcessName:");
                                sb4.append(str9);
                                sb4.append("; exitTime:");
                                sb4.append(l11);
                                sb4.append("; exitReason:");
                                sb4.append(num3);
                                sb4.append("; exitDescription:");
                                sb4.append(str10);
                                sb4.append("; crashIdentify: ");
                                sb4.append(str2);
                                sb4.append("; importance = ");
                                sb4.append(numValueOf3);
                                C34012x4.m75442d(sb4.toString(), new Object[0]);
                                if (TextUtils.isEmpty(str2)) {
                                    mapM73929c = m73929c(str2);
                                    if (mapM73929c != null) {
                                        str4 = mapM73929c.get(f70816s);
                                        mapM73929c.remove(f70816s);
                                    } else {
                                        str4 = str;
                                    }
                                } else {
                                    str4 = str;
                                    mapM73929c = null;
                                }
                                if (num == null) {
                                }
                            }
                            i13 = i15;
                        }
                        method6 = method14;
                        method7 = method7;
                        method12 = method12;
                        sharedPreferences = sharedPreferences;
                        method8 = method2;
                        method9 = method3;
                        method10 = method4;
                        method13 = method;
                        i12 = 0;
                    }
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (86400000 < Math.abs(jCurrentTimeMillis - f70799A)) {
                        if (f70800B != 0) {
                            C33789m5.m74036a().m74038a(f70800B);
                        }
                        f70799A = jCurrentTimeMillis;
                        sharedPreferences2.edit().putLong(C33577c3.f69341O, jCurrentTimeMillis).apply();
                        f70800B = 0;
                    }
                    sharedPreferences2.edit().putInt(C33577c3.f69340N, f70800B).apply();
                    f70823z = jCurrentTimeMillis;
                    sharedPreferences2.edit().putLong(C33577c3.f69342P, f70823z).apply();
                    C34012x4.m75442d("Success handle all info, query exit info: " + i13 + ", exception exit upload: " + i14, new Object[0]);
                    return;
                }
                C34012x4.m75442d("No exit info need to upload.", new Object[0]);
                return;
            }
            C34012x4.m75434a("Failed to get ApplicationExitInfo method.", new Object[0]);
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m73931d(String str) {
        HashMap map = new HashMap();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) {
                String[] strArrSplit = str2.split("\u0000", 2);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else if (strArrSplit.length == 1) {
                    map.put(strArrSplit[0], "");
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m73929c(String str) {
        try {
            ArrayList<File> files = FileUtil.getFiles(this.f70825c, "");
            if (files == null) {
                return null;
            }
            String str2 = f70822y + str;
            for (File file : files) {
                if (file.isFile() && file.getName().equals(str2)) {
                    String outputFromFile = FileUtil.readOutputFromFile(file.getCanonicalPath());
                    FileUtil.deleteFile(file);
                    return m73931d(outputFromFile);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m73924a(ConcurrentMap<String, String> concurrentMap) {
        if (concurrentMap == null || concurrentMap.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : concurrentMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String strM72603b = key == null ? "" : C33571bi.m72603b(key);
            String strM72603b2 = value == null ? "" : C33571bi.m72603b(value);
            sb2.append(strM72603b);
            sb2.append((char) 0);
            sb2.append(strM72603b2);
            sb2.append('\n');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34037y9
    /* JADX INFO: renamed from: a */
    public void mo72960a(String str) {
        if (f70801C && this.f70827e && str != null) {
            try {
                this.f70824b.put(f70816s, str);
                m73935h();
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
            }
        }
    }
}
