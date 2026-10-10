package cn.jiguang.privates.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* JADX INFO: loaded from: classes34.dex */
public class DeviceUtil {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: cn.jiguang.privates.common.utils.DeviceUtil.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i11 = 3; i11 < name.length(); i11++) {
                if (name.charAt(i11) < '0' || name.charAt(i11) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    private static String CPU_HARDWARE = "";
    private static String CPU_INFO = "";
    private static final String TAG = "JDeviceHelper";

    private static int extractValue(byte[] bArr, int i11) {
        byte b11;
        byte b12;
        while (i11 < bArr.length && (b11 = bArr[i11]) != 10) {
            try {
                if (b11 >= 48 && b11 <= 57) {
                    int i12 = i11 + 1;
                    while (i12 < bArr.length && (b12 = bArr[i12]) >= 48 && b12 <= 57) {
                        i12++;
                    }
                    return Integer.parseInt(new String(bArr, 0, i11, i12 - i11));
                }
                i11++;
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static int getCPUMaxFreqKHz() {
        for (int i11 = 0; i11 < getCpuCoreCount(); i11++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    int i12 = 0;
                    while (true) {
                        byte b11 = bArr[i12];
                        if (b11 < 48 || b11 > 57) {
                            break;
                        }
                        i12++;
                    }
                    int i13 = Integer.parseInt(new String(bArr, 0, i12));
                    fileInputStream.close();
                    return i13;
                }
            } catch (Throwable unused) {
                return -1;
            }
        }
        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
        int fileForValue = parseFileForValue("cpu MHz", fileInputStream2);
        fileInputStream2.close();
        return fileForValue * 1000;
    }

    public static int getCpuCoreCount() {
        File[] fileArrListFiles;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(CPU_FILTER)) != null && fileArrListFiles.length != 0) {
                return fileArrListFiles.length;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getCpuHardwareInfo() {
        if (!TextUtils.isEmpty(CPU_HARDWARE)) {
            return CPU_HARDWARE;
        }
        matchCpuInfo();
        return CPU_HARDWARE;
    }

    public static String getCpuInfo() {
        if (!TextUtils.isEmpty(CPU_INFO)) {
            return CPU_INFO;
        }
        matchCpuInfo();
        return CPU_INFO;
    }

    public static long getRamSize(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            activityManager.getProcessMemoryInfo(new int[]{0});
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String getResolution(Context context) {
        DisplayMetrics displayMetrics;
        try {
            if (context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return "0*0";
            }
            return displayMetrics.widthPixels + ProxyConfig.MATCH_ALL_SCHEMES + displayMetrics.heightPixels;
        } catch (Throwable unused) {
            return "0*0";
        }
    }

    private static void matchCpuInfo() {
        try {
            File file = new File("/proc/cpuinfo");
            if (!file.exists()) {
                return;
            }
            FileReader fileReader = new FileReader(file);
            if (fileReader.equals(null)) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (bufferedReader.equals(null)) {
                return;
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                if (line.contains("Processor")) {
                    StringBuilder sb2 = new StringBuilder();
                    int iIndexOf = line.indexOf(C33844oi.f71346o);
                    if (iIndexOf >= 0 && iIndexOf < line.length() - 1) {
                        sb2.append(line.substring(iIndexOf + 1).trim());
                    }
                    CPU_INFO = sb2.toString();
                }
                if (line.contains("Hardware")) {
                    CPU_HARDWARE = line.substring(line.indexOf(C33844oi.f71346o) + 1).trim();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        try {
            byte[] bArr = new byte[1024];
            int i11 = fileInputStream.read(bArr);
            int i12 = 0;
            while (i12 < i11) {
                byte b11 = bArr[i12];
                if (b11 == 10 || i12 == 0) {
                    if (b11 == 10) {
                        i12++;
                    }
                    for (int i13 = i12; i13 < i11; i13++) {
                        int i14 = i13 - i12;
                        if (bArr[i13] != str.charAt(i14)) {
                            break;
                        }
                        if (i14 == str.length() - 1) {
                            return extractValue(bArr, i13);
                        }
                    }
                }
                i12++;
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static String getCarrier(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long getRomSize(Context context) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static double getScreenSize(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static String getSsid(Context context) {
        try {
            return StringUtil.filterSpecialCharacter(((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID());
        } catch (Throwable unused) {
            return "";
        }
    }
}
