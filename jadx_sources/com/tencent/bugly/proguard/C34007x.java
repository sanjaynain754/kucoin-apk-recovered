package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34007x {

    /* JADX INFO: renamed from: a */
    public static final String f72470a = "BUGLY_DISABLE";

    /* JADX INFO: renamed from: b */
    public static final String f72471b = "BUGLY_APPID";

    /* JADX INFO: renamed from: c */
    public static final String f72472c = "BUGLY_APP_CHANNEL";

    /* JADX INFO: renamed from: d */
    public static final String f72473d = "BUGLY_APP_VERSION";

    /* JADX INFO: renamed from: e */
    public static final String f72474e = "BUGLY_APP_BUILD_NO";

    /* JADX INFO: renamed from: f */
    public static final String f72475f = "BUGLY_ENABLE_DEBUG";

    /* JADX INFO: renamed from: g */
    public static final String f72476g = "com.tencent.rdm.uuid";

    /* JADX INFO: renamed from: l */
    public static ActivityManager f72481l;

    /* JADX INFO: renamed from: h */
    public static final String f72477h = "@buglyAllChannel@";

    /* JADX INFO: renamed from: j */
    public static final String[] f72479j = f72477h.split(",");

    /* JADX INFO: renamed from: i */
    public static final String f72478i = "@buglyAllChannelPriority@";

    /* JADX INFO: renamed from: k */
    public static final String[] f72480k = f72478i.split(",");

    /* JADX INFO: renamed from: a */
    public static boolean m75408a(Context context, String str) {
        if (context != null && str != null && str.trim().length() > 0) {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str.equals(str2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m75412e(Context context) {
        if (context == null) {
            return false;
        }
        if (f72481l == null) {
            f72481l = (ActivityManager) context.getSystemService("activity");
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            f72481l.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory) {
                return false;
            }
            C34012x4.m75434a("Memory is low.", new Object[0]);
            return true;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m75409b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            HashMap map = new HashMap();
            Object obj = applicationInfo.metaData.get(f72470a);
            if (obj != null) {
                map.put(f72470a, obj.toString());
            }
            Object obj2 = applicationInfo.metaData.get(f72471b);
            if (obj2 != null) {
                map.put(f72471b, obj2.toString());
            }
            Object obj3 = applicationInfo.metaData.get(f72472c);
            if (obj3 != null) {
                map.put(f72472c, obj3.toString());
            }
            Object obj4 = applicationInfo.metaData.get("BUGLY_APP_VERSION");
            if (obj4 != null) {
                map.put("BUGLY_APP_VERSION", obj4.toString());
            }
            Object obj5 = applicationInfo.metaData.get(f72475f);
            if (obj5 != null) {
                map.put(f72475f, obj5.toString());
            }
            Object obj6 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
            if (obj6 != null) {
                map.put("com.tencent.rdm.uuid", obj6.toString());
            }
            Object obj7 = applicationInfo.metaData.get(f72474e);
            if (obj7 != null) {
                map.put(f72474e, obj7.toString());
            }
            return map;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m75411d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return C33864ph.f71456b;
            }
            th2.printStackTrace();
            return C33864ph.f71456b;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m75413f(Context context) {
        if (context == null) {
            return "";
        }
        String strM75414g = m75414g(context);
        return !C33571bi.m72617c(strM75414g) ? strM75414g : m75415h(context);
    }

    /* JADX INFO: renamed from: g */
    public static String m75414g(Context context) {
        String property = "";
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    String string = C33571bi.m72566a("DENGTA_META", context).getString("key_channelpath", "");
                    if (C33571bi.m72617c(string)) {
                        string = "channel.ini";
                    }
                    C34012x4.m75442d("[AppInfo] Beacon channel file path: " + string, new Object[0]);
                    if (!string.equals("")) {
                        inputStreamOpen = context.getAssets().open(string);
                        Properties properties = new Properties();
                        properties.load(inputStreamOpen);
                        property = properties.getProperty("CHANNEL", "");
                        C34012x4.m75431a(LogState.INFO, "[AppInfo] Beacon channel read from assert: " + property, new Object[0]);
                        if (!C33571bi.m72617c(property)) {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                    return property;
                                } catch (IOException e11) {
                                    C34012x4.m75432a(LogState.WARN, e11);
                                }
                            }
                            return property;
                        }
                    }
                    if (inputStreamOpen == null) {
                        return property;
                    }
                    inputStreamOpen.close();
                    return property;
                } catch (Exception unused) {
                    C34012x4.m75444f("[AppInfo] Failed to get get beacon channel", new Object[0]);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return property;
                }
            } catch (IOException e12) {
                C34012x4.m75432a(LogState.WARN, e12);
                return property;
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e13) {
                    C34012x4.m75438b(e13);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static PackageInfo m75410c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m75411d(context), 0);
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m75415h(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("CHANNEL_DENGTA");
            if (obj != null) {
                return obj.toString();
            }
            return "";
        } catch (Throwable unused) {
            C34012x4.m75444f("[AppInfo] Failed to read beacon channel from manifest.", new Object[0]);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m75404a(int i11) {
        FileReader fileReader;
        try {
            fileReader = new FileReader("/proc/" + i11 + "/cmdline");
            try {
                char[] cArr = new char[512];
                fileReader.read(cArr);
                int i12 = 0;
                while (i12 < 512 && cArr[i12] != 0) {
                    i12++;
                }
                String strSubstring = new String(cArr).substring(0, i12);
                try {
                    fileReader.close();
                } catch (Throwable unused) {
                }
                return strSubstring;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C34012x4.m75438b(th)) {
                        th.printStackTrace();
                    }
                    return String.valueOf(i11);
                } finally {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m75405a(Context context) {
        CharSequence applicationLabel;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (packageManager != null && applicationInfo != null && (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) != null) {
                return applicationLabel.toString();
            }
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75407a(ActivityManager activityManager) {
        if (activityManager == null) {
            C34012x4.m75434a("is proc running, ActivityManager is null", new Object[0]);
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            C34012x4.m75434a("running proc info list is empty, my proc not running.", new Object[0]);
            return false;
        }
        int iMyPid = Process.myPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (it.next().pid == iMyPid) {
                C34012x4.m75434a("my proc is running.", new Object[0]);
                return true;
            }
        }
        C34012x4.m75434a("proc not in running proc info list, my proc not running.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m75406a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            String str = map.get(f72470a);
            if (str != null && str.length() != 0) {
                String[] strArrSplit = str.split(",");
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    strArrSplit[i11] = strArrSplit[i11].trim();
                }
                return Arrays.asList(strArrSplit);
            }
            return null;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }
}
