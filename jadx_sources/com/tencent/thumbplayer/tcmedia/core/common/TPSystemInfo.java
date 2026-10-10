package com.tencent.thumbplayer.tcmedia.core.common;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.soloader.MinElf;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes63.dex */
public class TPSystemInfo {
    public static final int CHIP_ARM_AARCH64 = 7;
    public static final int CHIP_ARM_LATER = 50;
    public static final int CHIP_ARM_V5 = 3;
    public static final int CHIP_ARM_V6 = 4;
    public static final int CHIP_ARM_V7_NENO = 6;
    public static final int CHIP_ARM_V7_NO_NENO = 5;
    public static final int CHIP_MIPS = 2;
    public static final int CHIP_UNKNOW = 0;
    public static final int CHIP_X86 = 1;
    public static final int CPU_HW_HISI = 2;
    public static final int CPU_HW_MTK = 1;
    public static final int CPU_HW_OTHER = -1;
    public static final int CPU_HW_QUALCOMM = 0;
    public static final int CPU_HW_SAMSUNG = 3;
    public static final String KEY_PROPERTY_BOARD = "ro.product.board";
    public static final String KEY_PROPERTY_DEVICE = "ro.product.device";
    public static final String KEY_PROPERTY_MANUFACTURER = "ro.product.manufacturer";
    public static final String KEY_PROPERTY_MODEL = "ro.product.model";
    public static final String KEY_PROPERTY_VERSION_RELEASE = "ro.build.version.release";
    public static final int SDK_INT;
    private static long sAppInstallTime = 0;
    private static int sAudioBestFramesPerBust = 0;
    private static int sAudioBestSampleRate = 0;
    private static int sCpuArchitecture = 0;
    private static int sCpuHWProductIdx = -1;
    private static int sCpuHWProducter = -1;
    private static String sCpuHardware = "";
    private static String sDeviceManufacturer = "";
    private static String sDeviceName = "";
    private static String sFeature = "";
    private static String sOSVersion = "";
    private static String sProcessorName = "N/A";
    private static String sProductBoard = "";
    private static String sProductDevice = "";
    public static int sScreenHeight;
    public static int sScreenWidth;
    private static final String[][] sCpuPerfList = {new String[]{"MSM7227", "MSM7627", "MSM7227T", "MSM7627T", "MSM7227A", "MSM7627A", "QSD8250", "QSD8650", "MSM7230", "MSM7630", "APQ8055", "MSM8255", "MSM8655", "MSM8255T", "MSM8655T", "MSM8225", "MSM8625", "MSM8260", "MSM8660", "MSM8x25Q", "MSM8x26", "MSM8x10", "MSM8x12", "MSM8x30", "MSM8260A", "MSM8660A", "MSM8960", "MSM8208", "MSM8916", "MSM8960T", "MSM8909", "MSM8916v2", "MSM8936", "MSM8909v2", "MSM8917", "APQ8064", "APQ8064T", "MSM8920", "MSM8939", "MSM8937", "MSM8939v2", "MSM8940", "MSM8952", "MSM8974", "MSM8x74AA", "MSM8x74AB", "MSM8x74AC", "MSM8953", "APQ8084", "MSM8953Pro", "MSM8992", "MSM8956", "MSM8976", "MSM8976Pro", "MSM8994", "MSM8996", "MSM8996Pro", "MSM8998", "SDM845", "SM8150", "SM8250", "SM8250-AB", "SM8250-AC", "SM8350", "SM8350-AC", "SM8450"}, new String[]{"MT6516", "MT6513", "MT6573", "MT6515M", "MT6515", "MT6575", "MT6572", "MT6577", "MT6589", "MT6582", "MT6592", "MT6595", "MT6735", "MT6750", "MT6753", "MT6752", "MT6755", "MT6755", "MT6755T", "MT6795", "MT6757", "MT675x", "MT6797", "MT6797T", "MT6797X", "MT6771V", "MT6799", "MT6769Z", "MT6785T", "MT6853V", "MT6853V", "MT6873", "MT6874", "MT6875", "MT6877", "MT6885", "MT6889V", "MT6889Z", "MT6891Z", "MT6893", "MT6983"}, new String[]{"K3V2", "K3V2E", "K3V2+", "Kirin910", "Kirin920", "Kirin925", "Kirin928", "Kirin620", "Kirin650", "Kirin655", "Kirin930", "Kirin935", "Kirin950", "Kirin955", "Kirin960", "Kirin970", "Kirin810", "Kirin980", "Kirin820", "Kirin985", "Kirin990", "Kirin9000E", "Kirin9000"}, new String[]{"S5L8900", "S5PC100", "Exynos3110", "Exynos3475", "Exynos4210", "Exynos4212", "SMDK4x12", "Exynos4412", "Exynos5250", "Exynos5260", "Exynos5410", "Exynos5420", "Exynos5422", "Exynos5430", "Exynos5800", "Exynos5433", "Exynos7580", "Exynos7870", "Exynos7870", "Exynos7420", "Exynos8890", "Exynos890", "Exynos8895", "Exynos9810", "Exynos9820", "Exynos9825", "Exynos990", "Exynos1080", "Exynos2100", "Exynos2200"}};
    private static long sMaxCpuFreq = -1;
    private static long sCurrentCpuFreq = -1;
    private static int sNumOfCores = -1;
    private static int sCpuArch = -1;
    private static int sOpenGLVersion = 0;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 25) {
            String str = Build.VERSION.CODENAME;
            if (!TextUtils.isEmpty(str) && str.charAt(0) == 'O') {
                i11 = 26;
            }
        }
        SDK_INT = i11;
    }

    public static int getCpuHWProductIndex(int i11, String str) {
        if (i11 >= 0) {
            String[][] strArr = sCpuPerfList;
            if (i11 >= strArr.length || TextUtils.isEmpty(str)) {
                return -1;
            }
            String[] strArr2 = strArr[i11];
            for (int i12 = 0; i12 < strArr2.length; i12++) {
                if (TextUtils.equals(str, strArr2[i12])) {
                    return i12;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[Catch: IOException -> 0x004d, TRY_LEAVE, TryCatch #4 {IOException -> 0x004d, blocks: (B:25:0x0049, B:29:0x0051), top: B:41:0x0049 }] */
    public static void getCpuInfo() {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream("/proc/cpuinfo"), "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader2);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                inputStreamReader2.close();
                                bufferedReader.close();
                                return;
                            }
                            parseCpuInfoLine(line);
                        } catch (Throwable unused) {
                            inputStreamReader = inputStreamReader2;
                            try {
                                sCpuHardware = "Unknown";
                                sCpuArchitecture = 0;
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                    } catch (IOException e11) {
                                        TPNativeLog.printLog(4, e11.getMessage());
                                        throw th2;
                                    }
                                } else if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (Throwable unused3) {
                bufferedReader = null;
            }
        } catch (IOException e12) {
            TPNativeLog.printLog(4, e12.getMessage());
        }
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        int i11 = sScreenHeight;
        if (i11 != 0) {
            return i11;
        }
        try {
            sScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            sScreenHeight = 0;
        }
        return sScreenHeight;
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        int i11 = sScreenWidth;
        if (i11 != 0) {
            return i11;
        }
        try {
            sScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            sScreenWidth = 0;
        }
        return sScreenWidth;
    }

    public static long getSystemIdleTime(String[] strArr) {
        try {
            return Long.parseLong(strArr[4]);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return -1L;
        }
    }

    private static boolean hasMarshmallow() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String readStringFromFile(File file) throws Throwable {
        BufferedReader bufferedReader;
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    if (file.length() <= 2147483647L) {
                        char[] cArr = new char[(int) file.length()];
                        if (bufferedReader.read(cArr, 0, (int) file.length()) > 0) {
                            str = new String(cArr);
                        }
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e11) {
                    e = e11;
                    bufferedReader2 = bufferedReader;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        th.printStackTrace();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return str;
                    } catch (Throwable th5) {
                        th = th5;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        } catch (FileNotFoundException e12) {
            e = e12;
        } catch (Throwable th7) {
            th = th7;
            bufferedReader = null;
        }
        return str;
    }

    public static String readSystemStat() {
        RandomAccessFile randomAccessFile;
        String line = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile("/proc/stat", "r");
                try {
                    line = randomAccessFile.readLine();
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        return line;
                    } catch (Throwable th3) {
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable th4) {
                                TPNativeLog.printLog(4, th4.getMessage());
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                TPNativeLog.printLog(4, th5.getMessage());
            }
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
        return line;
    }

    public static boolean supportInDeviceDolbyAudioEffect() {
        boolean z11;
        Exception e11;
        try {
            z11 = false;
            for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
                try {
                    if (descriptor.implementor.contains("Dolby Laboratories")) {
                        z11 = true;
                    }
                } catch (Exception e12) {
                    e11 = e12;
                    TPNativeLog.printLog(4, e11.getMessage());
                    return z11;
                }
            }
            return z11;
        } catch (Exception e13) {
            z11 = false;
            e11 = e13;
        }
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static int getBestAudioFramesPerBust() {
        return sAudioBestFramesPerBust;
    }

    public static int getBestAudioSampleRate() {
        return sAudioBestSampleRate;
    }

    public static int getCpuArchFromId(int i11) {
        if (i11 == 64) {
            return 7;
        }
        switch (i11) {
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 6;
            case 8:
            case 9:
            case 10:
                return 7;
            default:
                return 0;
        }
    }

    public static int getCpuArchitecture() {
        int cpuArchFromId;
        int i11 = sCpuArch;
        if (-1 != i11) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder("getCpuArchitecture Build.CPU_ABI: ");
        String str = Build.CPU_ABI;
        sb2.append(str);
        TPNativeLog.printLog(2, sb2.toString());
        if (str.contains(MinElf.ISA.AARCH64)) {
            sCpuArch = 7;
            return 7;
        }
        if (str == null || !(str.contains(MinElf.ISA.X86) || str.contains("X86"))) {
            if (str == null || !(str.contains("mips") || str.contains("Mips"))) {
                if (sCpuArchitecture == 0) {
                    getCpuInfo();
                }
                TPNativeLog.printLog(2, "getCpuArchitecture mCpuArchitecture:" + sCpuArchitecture);
                if (!TextUtils.isEmpty(sCpuHardware) && sCpuHardware.contains("MSM8994")) {
                    sCpuArch = 7;
                    return 7;
                }
                if (isARMV5Whitelist()) {
                    sCpuArch = 3;
                    return 3;
                }
                if (!TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("ARMv6")) {
                    sCpuArch = 4;
                    return 4;
                }
                if (!TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("AArch64")) {
                    sCpuArch = 7;
                    return 7;
                }
                if (sCpuArchitecture == 7 && !TextUtils.isEmpty(sFeature) && !sFeature.contains("neon") && !sFeature.contains("asimd")) {
                    sCpuArch = 4;
                    return 4;
                }
                cpuArchFromId = getCpuArchFromId(sCpuArchitecture);
            } else {
                sCpuArch = 2;
            }
            return sCpuArch;
        }
        cpuArchFromId = 1;
        sCpuArch = cpuArchFromId;
        return sCpuArch;
    }

    public static int getCpuHWProductIndex(String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        int i11 = sCpuHWProducter;
        if (i11 >= 0 && sCpuHWProductIdx < 0) {
            String[] strArr = sCpuPerfList[i11];
            int i12 = -1;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (str.contains(strArr[i13]) && (-1 == i12 || strArr[i13].length() > strArr[i12].length())) {
                    i12 = i13;
                }
            }
            sCpuHWProductIdx = i12;
        }
        return sCpuHWProductIdx;
    }

    public static int getCpuHWProducter(String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        return sCpuHWProducter;
    }

    public static String getCpuHarewareName() {
        if (TextUtils.isEmpty(sCpuHardware)) {
            getCpuInfo();
        }
        return sCpuHardware;
    }

    public static long getCurrentCpuFreq() {
        InputStreamReader inputStreamReader;
        Throwable th2;
        BufferedReader bufferedReader;
        Exception e11;
        IOException e12;
        FileNotFoundException e13;
        long j11 = sCurrentCpuFreq;
        if (j11 > 0) {
            return j11;
        }
        try {
            try {
                try {
                    inputStreamReader = new InputStreamReader(new FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"), "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                inputStreamReader.close();
                                bufferedReader.close();
                                inputStreamReader.close();
                                bufferedReader.close();
                                return 0L;
                            }
                            String strTrim = line.trim();
                            long j12 = strTrim.length() > 0 ? Long.parseLong(strTrim) : 1024000L;
                            sCurrentCpuFreq = j12;
                            inputStreamReader.close();
                            bufferedReader.close();
                            return j12;
                        } catch (FileNotFoundException e14) {
                            e13 = e14;
                            TPNativeLog.printLog(4, e13.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return 1024000L;
                        } catch (IOException e15) {
                            e12 = e15;
                            TPNativeLog.printLog(4, e12.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return 1024000L;
                        } catch (Exception e16) {
                            e11 = e16;
                            TPNativeLog.printLog(4, e11.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return 1024000L;
                        } catch (Throwable th3) {
                            th2 = th3;
                            TPNativeLog.printLog(4, th2.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return 1024000L;
                        }
                    } catch (FileNotFoundException e17) {
                        bufferedReader = null;
                        e13 = e17;
                    } catch (IOException e18) {
                        bufferedReader = null;
                        e12 = e18;
                    } catch (Exception e19) {
                        bufferedReader = null;
                        e11 = e19;
                    } catch (Throwable th4) {
                        bufferedReader = null;
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    TPNativeLog.printLog(4, th5.getMessage());
                    return 0L;
                }
            } catch (FileNotFoundException e21) {
                inputStreamReader = null;
                e13 = e21;
                bufferedReader = null;
            } catch (IOException e22) {
                inputStreamReader = null;
                e12 = e22;
                bufferedReader = null;
            } catch (Exception e23) {
                inputStreamReader = null;
                e11 = e23;
                bufferedReader = null;
            } catch (Throwable th6) {
                inputStreamReader = null;
                th2 = th6;
                bufferedReader = null;
            }
        } catch (Throwable th7) {
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th7;
        }
    }

    public static String getDeviceManufacturer() {
        if (TextUtils.isEmpty(sDeviceManufacturer)) {
            sDeviceManufacturer = Build.MANUFACTURER;
        }
        return sDeviceManufacturer;
    }

    public static synchronized String getDeviceName() {
        try {
            if (TextUtils.isEmpty(sDeviceName)) {
                sDeviceName = Build.MODEL;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sDeviceName;
    }

    public static long getMaxCpuFreq() {
        BufferedReader bufferedReader;
        long j11 = sMaxCpuFreq;
        if (-1 != j11) {
            return j11;
        }
        InputStreamReader inputStreamReader = null;
        long j12 = 0;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"), "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader2);
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            inputStreamReader2.close();
                            bufferedReader.close();
                            try {
                                inputStreamReader2.close();
                                bufferedReader.close();
                            } catch (IOException e11) {
                                TPNativeLog.printLog(4, e11.getMessage());
                            }
                            return 0L;
                        }
                        String strTrim = line.trim();
                        j12 = strTrim.length() > 0 ? Long.parseLong(strTrim) : 0L;
                        inputStreamReader2.close();
                        bufferedReader.close();
                        sMaxCpuFreq = j12;
                        TPNativeLog.printLog(2, "MaxCpuFreq " + sMaxCpuFreq);
                        return j12;
                    } catch (IOException unused) {
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    } catch (Throwable unused2) {
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable unused4) {
                    bufferedReader = null;
                }
            } catch (IOException e12) {
                TPNativeLog.printLog(4, e12.getMessage());
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable unused6) {
            bufferedReader = null;
        }
    }

    public static int getNumCores() {
        int i11 = sNumOfCores;
        if (-1 != i11) {
            return i11;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            if (fileArrListFiles == null) {
                sNumOfCores = 1;
                return 1;
            }
            sNumOfCores = fileArrListFiles.length;
            TPNativeLog.printLog(2, "core num " + sNumOfCores);
            return sNumOfCores;
        } catch (Exception e11) {
            TPNativeLog.printLog(4, e11.getMessage());
            sNumOfCores = 1;
            return 1;
        }
    }

    public static int getOpenGLSupportVersion(Context context) {
        if (sOpenGLVersion == 0) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
                if (activityManager == null) {
                    return sOpenGLVersion;
                }
                sOpenGLVersion = activityManager.getDeviceConfigurationInfo().reqGlEsVersion;
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
            }
        }
        return sOpenGLVersion;
    }

    public static String getOsVersion() {
        if (TextUtils.isEmpty(sOSVersion)) {
            sOSVersion = Build.VERSION.RELEASE;
        }
        return sOSVersion;
    }

    public static String getProductBoard() {
        if (TextUtils.isEmpty(sProductBoard)) {
            sProductBoard = Build.BOARD;
        }
        return sProductBoard;
    }

    public static String getProductDevice() {
        if (TextUtils.isEmpty(sProductDevice)) {
            sProductDevice = Build.DEVICE;
        }
        return sProductDevice;
    }

    public static int getSystemCpuUsage(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        float f11 = -1.0f;
        try {
            String[] strArrSplit = str.trim().split("\\s+");
            long systemIdleTime = getSystemIdleTime(strArrSplit);
            long systemUptime = getSystemUptime(strArrSplit);
            String[] strArrSplit2 = str2.trim().split("\\s+");
            long systemIdleTime2 = getSystemIdleTime(strArrSplit2);
            long systemUptime2 = getSystemUptime(strArrSplit2);
            if (systemIdleTime >= 0 && systemUptime >= 0 && systemIdleTime2 >= 0 && systemUptime2 >= 0) {
                long j11 = systemIdleTime2 + systemUptime2;
                long j12 = systemIdleTime + systemUptime;
                if (j11 > j12 && systemUptime2 >= systemUptime) {
                    f11 = ((systemUptime2 - systemUptime) / (j11 - j12)) * 100.0f;
                }
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
        return (int) f11;
    }

    public static long getSystemUptime(String[] strArr) {
        long j11 = 0;
        for (int i11 = 1; i11 < strArr.length; i11++) {
            if (4 != i11) {
                try {
                    j11 += Long.parseLong(strArr[i11]);
                } catch (Throwable unused) {
                    return -1L;
                }
            }
        }
        return j11;
    }

    public static synchronized void initAudioBestSettings(Context context) {
        if (context != null) {
            if (sAudioBestSampleRate <= 0) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
                try {
                    sAudioBestSampleRate = Integer.parseInt(property);
                    sAudioBestFramesPerBust = Integer.parseInt(property2);
                } catch (NumberFormatException e11) {
                    TPNativeLog.printLog(4, e11.getMessage());
                }
            }
        }
    }

    private static void parseCpuInfoLine(String str) {
        int iIndexOf;
        int iIndexOf2;
        if (str.contains("aarch64") || str.contains("AArch64")) {
            sCpuArchitecture = 64;
        }
        if (str.startsWith("Processor")) {
            int iIndexOf3 = str.indexOf(58);
            if (iIndexOf3 > 1) {
                String strSubstring = str.substring(iIndexOf3 + 1, str.length());
                sProcessorName = strSubstring;
                sProcessorName = strSubstring.trim();
                return;
            }
            return;
        }
        if (str.startsWith("CPU architecture")) {
            if (sCpuArchitecture != 0 || (iIndexOf2 = str.indexOf(58)) <= 1) {
                return;
            }
            String strTrim = str.substring(iIndexOf2 + 1, str.length()).trim();
            if (strTrim.length() > 0 && strTrim.length() < 2) {
                sCpuArchitecture = (int) Long.parseLong(strTrim);
                return;
            } else {
                if (strTrim.length() > 1) {
                    sCpuArchitecture = (int) Long.parseLong(strTrim.substring(0, 1));
                    return;
                }
                return;
            }
        }
        if (str.startsWith("Features")) {
            int iIndexOf4 = str.indexOf(58);
            if (iIndexOf4 > 1) {
                sFeature = str.substring(iIndexOf4 + 1, str.length()).trim();
                return;
            }
            return;
        }
        if (!str.startsWith("Hardware") || (iIndexOf = str.indexOf(58)) <= 1) {
            return;
        }
        sCpuHardware = str.substring(iIndexOf + 1, str.length()).trim().replace(C33627eb.f69716f, "");
        TPNativeLog.printLog(2, "hardware " + sCpuHardware);
        getCpuHWProductIndex(sCpuHardware);
    }

    public static synchronized void setDeviceName(String str) {
        sDeviceName = str;
    }

    public static void setProperty(String str, String str2) {
        if (TextUtils.equals(str, KEY_PROPERTY_MODEL)) {
            sDeviceName = str2;
            return;
        }
        if (TextUtils.equals(str, KEY_PROPERTY_MANUFACTURER)) {
            sDeviceManufacturer = str2;
            return;
        }
        if (TextUtils.equals(str, KEY_PROPERTY_VERSION_RELEASE)) {
            sOSVersion = str2;
        } else if (TextUtils.equals(str, KEY_PROPERTY_DEVICE)) {
            sProductDevice = str2;
        } else if (TextUtils.equals(str, KEY_PROPERTY_BOARD)) {
            sProductBoard = str2;
        }
    }

    private static void writeStringToFile(String str, String str2) {
        FileWriter fileWriter;
        try {
            File file = new File(str);
            if (!file.exists() && file.createNewFile()) {
                return;
            }
            fileWriter = new FileWriter(file, false);
            try {
                fileWriter.write(str2);
                fileWriter.flush();
                fileWriter.close();
                return;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileWriter = null;
        }
        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    private static int getCpuHWProducer(String str) {
        if (str.isEmpty()) {
            return -1;
        }
        if (!str.contains("Exynos") && !str.contains("SMDK") && !str.contains("S5L8900") && !str.contains("S5PC100")) {
            if (!str.contains("Kirin") && !str.contains("K3V")) {
                if (!str.contains("MSM") && !str.contains("APQ") && !str.contains("QSD") && !str.contains("SDM") && !str.contains("SM")) {
                    if (!str.contains("MT6")) {
                        return -1;
                    }
                    return 1;
                }
                return 0;
            }
            return 2;
        }
        return 3;
    }

    public static boolean isARMV5Whitelist() {
        if (!getDeviceName().equals("XT882") && !getDeviceName().equals("ME860") && !getDeviceName().equals("MB860") && !getDeviceName().equals("Lenovo P70") && !getDeviceName().equals("Lenovo A60") && !getDeviceName().equals("Lenovo A366t")) {
            return false;
        }
        return true;
    }
}
