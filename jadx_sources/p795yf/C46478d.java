package p795yf;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: yf.d */
/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46478d {
    /* JADX INFO: renamed from: e */
    public static int[] m102521e(Context context) {
        int[] iArr = new int[2];
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay();
            int rotation = defaultDisplay.getRotation();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i11 = point.x;
            int i12 = point.y;
            iArr[0] = m102526j(rotation, i11, i12);
            iArr[1] = m102525i(rotation, i11, i12);
            return iArr;
        } catch (Exception unused) {
            if (context.getResources() != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                iArr[0] = displayMetrics.widthPixels;
                iArr[1] = displayMetrics.heightPixels;
            }
            return iArr;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m102531o() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th2) {
            C46481g.m102538a("SA.HasHarmonyOS", th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m102517a(String str) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    }
                    String string = sb2.toString();
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        C46481g.m102538a("SA.Exec", th2.getMessage());
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e11) {
                        C46481g.m102538a("SA.Exec", e11.getMessage());
                    }
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        C46481g.m102538a("SA.Exec", th.getMessage());
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                                C46481g.m102538a("SA.Exec", th4.getMessage());
                            }
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e12) {
                                C46481g.m102538a("SA.Exec", e12.getMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String[] m102519c() {
        return Build.SUPPORTED_ABIS;
    }

    /* JADX INFO: renamed from: d */
    public static String m102520d() {
        try {
            String str = Build.BRAND;
            return str != null ? str.trim().toUpperCase() : "UNKNOWN";
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m102523g() {
        try {
            String str = Build.MANUFACTURER;
            return str != null ? str.trim().toUpperCase() : "UNKNOWN";
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m102524h() {
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? "UNKNOWN" : str.trim();
    }

    /* JADX INFO: renamed from: i */
    public static int m102525i(int i11, int i12, int i13) {
        return (i11 == 0 || i11 == 2) ? i13 : i12;
    }

    /* JADX INFO: renamed from: j */
    public static int m102526j(int i11, int i12, int i13) {
        return (i11 == 0 || i11 == 2) ? i12 : i13;
    }

    /* JADX INFO: renamed from: k */
    public static String m102527k() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "UNKNOWN" : str;
    }

    /* JADX INFO: renamed from: l */
    public static String m102528l(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th2) {
            C46481g.m102538a("SA.SystemProperties", th2.getMessage());
            return str2;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m102529m(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return m102518b(context, memoryInfo.totalMem);
    }

    /* JADX INFO: renamed from: b */
    public static String m102518b(Context context, long j11) {
        return Formatter.formatFileSize(context, j11);
    }

    /* JADX INFO: renamed from: f */
    public static String m102522f() {
        if (m102531o()) {
            String strM102528l = m102528l("hw_sc.build.platform.version", "");
            if (TextUtils.isEmpty(strM102528l)) {
                return m102517a(SensorsDataUtils.COMMAND_HARMONYOS_VERSION);
            }
            return strM102528l;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m102530n(Context context) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return m102518b(context, ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        }
        return "0KB";
    }
}
