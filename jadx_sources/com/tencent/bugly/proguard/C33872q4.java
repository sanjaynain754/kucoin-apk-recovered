package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.soloader.MinElf;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33872q4 {

    /* JADX INFO: renamed from: a */
    public static final String f71534a = "DeviceInfoUtil";

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Boolean> f71535b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static final String f71536c = "android.permission.READ_PHONE_STATE";

    /* JADX INFO: renamed from: a */
    public static String m74662a(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return C33864ph.f71456b;
        }
        String str = applicationInfo.nativeLibraryDir;
        if (TextUtils.isEmpty(str)) {
            return C33864ph.f71456b;
        }
        if (str.endsWith("arm")) {
            return MinElf.ISA.ARM;
        }
        if (str.endsWith("arm64")) {
            return MinElf.ISA.AARCH64;
        }
        if (str.endsWith(MinElf.ISA.X86)) {
            return MinElf.ISA.X86;
        }
        return str.endsWith(MinElf.ISA.X86_64) ? MinElf.ISA.X86_64 : C33864ph.f71456b;
    }

    /* JADX INFO: renamed from: a */
    public static long m74661a() {
        BufferedReader bufferedReader;
        long j11 = 0;
        try {
            File file = new File("/proc", "meminfo");
            if (file.exists() && file.canRead()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.startsWith("MemTotal:")) {
                            j11 = Long.parseLong(line.split("\\s+")[1]) * 1024;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Logger.INSTANCE.exception(f71534a, th);
                            return 0L;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th3) {
                                    Logger.INSTANCE.exception(f71534a, th3);
                                }
                            }
                        }
                    }
                }
                try {
                    bufferedReader.close();
                    return j11;
                } catch (Throwable th4) {
                    Logger.INSTANCE.exception(f71534a, th4);
                    return j11;
                }
            }
            return 0L;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74663a(Context context, String str) {
        return m74664a(context, new String[]{str});
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74664a(Context context, String[] strArr) {
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= length) {
                    return true;
                }
                String str = strArr[i11];
                HashMap<String, Boolean> map = f71535b;
                Boolean bool = map.get(str);
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        return false;
                    }
                } else {
                    if (packageManager.checkPermission(str, context.getPackageName()) != 0) {
                        z11 = false;
                    }
                    map.put(str, Boolean.valueOf(z11));
                    if (!z11) {
                        return false;
                    }
                }
                i11++;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71534a, th2);
            return false;
        }
    }
}
