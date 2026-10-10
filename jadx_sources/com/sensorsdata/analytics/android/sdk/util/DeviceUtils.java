package com.sensorsdata.analytics.android.sdk.util;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes23.dex */
public class DeviceUtils {
    public static int[] getDeviceSize(Context context) {
        int[] iArr = new int[2];
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay();
            int rotation = defaultDisplay.getRotation();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i11 = point.x;
            int i12 = point.y;
            iArr[0] = getNaturalWidth(rotation, i11, i12);
            iArr[1] = getNaturalHeight(rotation, i11, i12);
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

    private static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th2) {
            SALog.m68589i("SA.HasHarmonyOS", th2.getMessage());
            return false;
        }
    }

    public static String exec(String str) {
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
                        SALog.m68589i("SA.Exec", th2.getMessage());
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e11) {
                        SALog.m68589i("SA.Exec", e11.getMessage());
                    }
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        SALog.m68589i("SA.Exec", th.getMessage());
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                                SALog.m68589i("SA.Exec", th4.getMessage());
                            }
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e12) {
                                SALog.m68589i("SA.Exec", e12.getMessage());
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

    public static String getBrand() {
        try {
            String str = Build.BRAND;
            return str != null ? str.trim().toUpperCase() : "UNKNOWN";
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "UNKNOWN";
        }
    }

    public static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            return str != null ? str.trim().toUpperCase() : "UNKNOWN";
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "UNKNOWN";
        }
    }

    public static String getModel() {
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? "UNKNOWN" : str.trim();
    }

    private static int getNaturalHeight(int i11, int i12, int i13) {
        return (i11 == 0 || i11 == 2) ? i13 : i12;
    }

    private static int getNaturalWidth(int i11, int i12, int i13) {
        return (i11 == 0 || i11 == 2) ? i12 : i13;
    }

    public static String getOS() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "UNKNOWN" : str;
    }

    private static String getProp(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th2) {
            SALog.m68589i("SA.SystemProperties", th2.getMessage());
            return str2;
        }
    }

    public static String getHarmonyOSVersion() {
        if (isHarmonyOs()) {
            String prop = getProp("hw_sc.build.platform.version", "");
            if (TextUtils.isEmpty(prop)) {
                return exec(SensorsDataUtils.COMMAND_HARMONYOS_VERSION);
            }
            return prop;
        }
        return null;
    }
}
