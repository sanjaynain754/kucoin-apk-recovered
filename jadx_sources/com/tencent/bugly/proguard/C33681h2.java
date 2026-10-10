package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33681h2 {

    /* JADX INFO: renamed from: a */
    public static final int f70048a = 86400000;

    /* JADX INFO: renamed from: b */
    public static final int f70049b = 259200000;

    /* JADX INFO: renamed from: c */
    public static int f70050c;

    /* JADX INFO: renamed from: d */
    public static StringBuilder f70051d = new StringBuilder();

    /* JADX INFO: renamed from: e */
    public static String[] f70052e = {"mumu"};

    /* JADX INFO: renamed from: f */
    public static String[] f70053f = {"/system/lib,vbox,ko", "/sys/bus,virtio", "/sys/class/misc,vbox"};

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.h2$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f70054b;

        public a(Context context) {
            this.f70054b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33765l2 c33765l2;
            try {
                C34012x4.m75442d("Start to check emulator.", new Object[0]);
                long j11 = C33765l2.m73827s().f70760m0.getLong(C33577c3.f69339M, -1L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j11 == -1 || jCurrentTimeMillis - 259200000 >= j11) {
                    AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C34052z4.f72600l);
                    if (abstractC34022xeM77083a instanceof C34052z4) {
                        C33681h2.m73235a(((C34052z4) abstractC34022xeM77083a).m75588c(), ((C34052z4) abstractC34022xeM77083a).m75587b());
                    }
                    C33681h2.m73239c(this.f70054b);
                    synchronized (C33765l2.class) {
                        c33765l2 = C33765l2.f70700C0;
                    }
                    c33765l2.f70760m0.edit().putLong(C33577c3.f69339M, jCurrentTimeMillis).apply();
                    C33765l2.m73827s().f70760m0.edit().putInt(C33577c3.f69337K, C33681h2.f70050c).apply();
                    C33571bi.m72616c(C33577c3.f69338L, C33681h2.f70051d.toString());
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m73238c() {
        if (NativeCrashHandler.getInstance().getProperties("ro.product.cpu.abi").contains(MinElf.ISA.X86)) {
            f70051d.append("cpu: x86;");
            f70050c += 10;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73233a(Context context) {
        String lowerCase = C33765l2.m73825a(context).m73892o().toLowerCase();
        for (String str : f70052e) {
            if (lowerCase.contains(str)) {
                f70051d.append(C33778lf.m73987a("model: ", str, ";"));
                f70050c += 10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73237b(Context context) {
        C33784m0.m74004c().m74006a(new a(context));
    }

    /* JADX INFO: renamed from: c */
    public static void m73239c(Context context) {
        m73233a(context);
        m73238c();
        for (String str : f70053f) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            File file = new File(str2);
            if (file.exists()) {
                m73234a(file, strArrSplit);
            } else {
                C34012x4.m75434a(C33770l7.m73937a("Failed to get path: ", str2), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73234a(File file, String[] strArr) {
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file.listFiles();
        C34012x4.m75442d(C33770l7.m73937a("Check file path: ", absolutePath), new Object[0]);
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                for (int i11 = 1; i11 < strArr.length; i11++) {
                    String lowerCase = strArr[i11].toLowerCase();
                    if (name.contains(lowerCase)) {
                        f70051d.append("file: " + file2.getAbsolutePath() + ", " + lowerCase + ";");
                        f70050c = f70050c + 5;
                    }
                }
            }
            return;
        }
        C34012x4.m75431a(LogState.DEBUG, C33770l7.m73937a("File list is zero or null in dir: ", absolutePath), new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static void m73235a(String str, String str2) {
        C34012x4.m75442d("Start to parse emulator feature from config.", new Object[0]);
        if (str != null) {
            C34012x4.m75431a(LogState.INFO, "Get emulator model feature from config, feature: ".concat(str), new Object[0]);
            f70052e = str.split("%");
        } else {
            C34012x4.m75431a(LogState.DEBUG, "No emulator model feature in config.", new Object[0]);
        }
        if (str2 != null) {
            C34012x4.m75431a(LogState.INFO, "Get emulator files feature from config, feature: ".concat(str2), new Object[0]);
            f70053f = str2.split("%");
        } else {
            C34012x4.m75431a(LogState.DEBUG, "No emulator files feature in config", new Object[0]);
        }
    }
}
