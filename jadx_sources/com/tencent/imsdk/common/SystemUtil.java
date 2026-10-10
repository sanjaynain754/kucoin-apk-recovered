package com.tencent.imsdk.common;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.C2711C;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes59.dex */
public class SystemUtil {
    private static final String DEVICE_ID = "DeviceID";
    private static final String DEVICE_INFO = "DeviceInfo";
    private static final String TAG = "SystemUtil";
    private static final int TIME_INTERVAL = 15000;
    private static String buildBrand = "";
    private static String buildManufacturer = "";
    private static String buildModel = "";
    private static String buildVersionRelease = "";
    private static int buildVersionSDKInt = 0;
    private static String currentProcessName = "";
    private static float lastAppCpu = 0.0f;
    private static long lastAppCpuTime = 0;
    private static long lastMemCheckTimeStamps = 0;
    private static int lastMemUsage = 0;
    private static float lastSysCpu = 0.0f;
    private static long lastSysCpuTime = 0;
    private static boolean mFirstTimeRun = true;
    private static CpuUsageMeasurer sCpuUsageMeasurer;
    private static boolean sIsLoadAdvancedEncryptionLibrarySuccess;
    private static boolean sIsLoadLibrarySuccess;
    private static boolean sIsLoadQuicLibrarySuccess;
    private static boolean sRunningMemCheck;

    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: IOException -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x00ac, blocks: (B:35:0x00a8, B:46:0x00bb), top: B:60:0x002b }] */
    public static String[] getFileSHA1AndMD5(String str) throws Throwable {
        String[] strArr = {"", ""};
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream = null;
                try {
                    try {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            while (true) {
                                try {
                                    int i11 = fileInputStream2.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    }
                                    messageDigest.update(bArr, 0, i11);
                                    messageDigest2.update(bArr, 0, i11);
                                } catch (IOException e11) {
                                    e = e11;
                                    fileInputStream = fileInputStream2;
                                    e.printStackTrace();
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    return strArr;
                                } catch (NoSuchAlgorithmException e12) {
                                    e = e12;
                                    fileInputStream = fileInputStream2;
                                    e.printStackTrace();
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    return strArr;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e13) {
                                            e13.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            byte[] bArrDigest = messageDigest.digest();
                            for (byte b11 : bArrDigest) {
                                String hexString = Integer.toHexString(b11 & 255);
                                if (hexString.length() == 1) {
                                    sb2.append('0');
                                }
                                sb2.append(hexString);
                            }
                            strArr[0] = sb2.toString();
                            StringBuilder sb3 = new StringBuilder();
                            for (byte b12 : messageDigest2.digest()) {
                                String hexString2 = Integer.toHexString(b12 & 255);
                                if (hexString2.length() == 1) {
                                    sb3.append('0');
                                }
                                sb3.append(hexString2);
                            }
                            strArr[1] = sb3.toString();
                            fileInputStream2.close();
                            return strArr;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e14) {
                        e = e14;
                    } catch (NoSuchAlgorithmException e15) {
                        e = e15;
                    }
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
        }
        return strArr;
    }

    public static boolean loadIMLibrary() {
        return loadIMLibrary(null);
    }

    private static boolean loadPluginLibrary(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str2);
            return ((Boolean) cls.getMethod("load", String.class).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), str)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private static String getBuildBrand() {
        if (TextUtils.isEmpty(buildBrand)) {
            buildBrand = Build.BRAND;
        }
        return buildBrand;
    }

    private static String getBuildManufacturer() {
        if (TextUtils.isEmpty(buildManufacturer)) {
            buildManufacturer = Build.MANUFACTURER;
        }
        return buildManufacturer;
    }

    public static String getCurrentProcessName() {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            currentProcessName = processName;
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                currentProcessName = (String) objInvoke;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return currentProcessName;
    }

    public static String getDeviceType() {
        if (TextUtils.isEmpty(buildModel)) {
            buildModel = Build.MODEL;
        }
        return buildModel;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getFileMD5(String str) throws Throwable {
        int i11;
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream2 = new FileInputStream(file);
                while (true) {
                    try {
                        int i12 = fileInputStream2.read(bArr);
                        if (i12 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i12);
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        return "";
                    } catch (NoSuchAlgorithmException e13) {
                        e = e13;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : bArrDigest) {
                    String hexString = Integer.toHexString(b11 & 255);
                    if (hexString.length() == 1) {
                        sb2.append('0');
                    }
                    sb2.append(hexString);
                }
                String string = sb2.toString();
                try {
                    fileInputStream2.close();
                    return string;
                } catch (IOException e15) {
                    e15.printStackTrace();
                    return string;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e16) {
            e = e16;
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
        }
    }

    public static int[] getProcessCPURate() {
        if (sCpuUsageMeasurer == null) {
            sCpuUsageMeasurer = new CpuUsageMeasurer();
        }
        if (!mFirstTimeRun) {
            return sCpuUsageMeasurer.getCpuUsage();
        }
        mFirstTimeRun = false;
        sCpuUsageMeasurer.getCpuUsage();
        return new int[]{0, 0};
    }

    public static int getSDKVersion() {
        if (buildVersionSDKInt == 0) {
            buildVersionSDKInt = Build.VERSION.SDK_INT;
        }
        return buildVersionSDKInt;
    }

    public static String getSystemVersion() {
        if (TextUtils.isEmpty(buildVersionRelease)) {
            buildVersionRelease = Build.VERSION.RELEASE;
        }
        return buildVersionRelease;
    }

    public static boolean isQuicPluginLibraryLoaded() {
        return sIsLoadQuicLibrarySuccess;
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean loadIMLibrary(String str) {
        if (!sIsLoadLibrarySuccess) {
            sIsLoadLibrarySuccess = loadIMSDKLibrary(str);
        }
        if (!sIsLoadQuicLibrarySuccess) {
            sIsLoadQuicLibrarySuccess = loadPluginLibrary(str, "com.tencent.imsdk.timquicplugin.QuicPluginLoader");
        }
        if (!sIsLoadAdvancedEncryptionLibrarySuccess) {
            sIsLoadAdvancedEncryptionLibrarySuccess = loadPluginLibrary(str, "com.tencent.imsdk.timadvancedencryptionplugin.AdvancedEncryptionPluginLoader");
        }
        return sIsLoadLibrarySuccess;
    }

    public static void setBuildBrand(String str) {
        buildBrand = str;
    }

    public static void setBuildManufacturer(String str) {
        buildManufacturer = str;
    }

    public static void setBuildModel(String str) {
        buildModel = str;
    }

    public static void setBuildVersionRelease(String str) {
        buildVersionRelease = str;
    }

    public static void setBuildVersionSDKInt(int i11) {
        buildVersionSDKInt = i11;
    }

    public static boolean uncompressFile(String str, String str2) {
        byte[] bArr = new byte[1024];
        try {
            String canonicalPath = new File(str2).getCanonicalPath();
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(zipEntryNextElement.getName());
                String string = sb2.toString();
                if (zipEntryNextElement.isDirectory()) {
                    new File(string).mkdirs();
                } else {
                    File file = new File(string);
                    if (!file.getCanonicalPath().startsWith(canonicalPath + str3)) {
                        throw new ZipException("Entry is outside of the target dir: " + zipEntryNextElement.getName());
                    }
                    File parentFile = file.getParentFile();
                    if (!parentFile.isDirectory()) {
                        parentFile.mkdirs();
                    }
                    try {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        FileOutputStream fileOutputStream = new FileOutputStream(string);
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i11);
                        }
                        inputStream.close();
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return false;
                    }
                }
            }
            zipFile.close();
            return true;
        } catch (IOException e12) {
            e12.printStackTrace();
            return false;
        }
    }

    public static boolean createDirectory(String str) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "createDirectory: empty path");
            return false;
        }
        try {
            File file = new File(str);
            if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            IMLog.m75914e(TAG, "createDirectory exception|path=" + str + "|exClass=" + th2.getClass().getName() + "|msg=" + th2.getMessage());
            return false;
        }
    }

    public static boolean deleteDirectory(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                deleteDirectory(file2.getAbsolutePath());
            }
        }
        return file.delete();
    }

    public static float getAppCpuUsage() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastAppCpuTime < C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            return lastAppCpu;
        }
        float f11 = (getProcessCPURate()[0] / 10) / 100.0f;
        lastAppCpu = f11;
        lastAppCpuTime = jCurrentTimeMillis;
        return f11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public static float getAppMemory() {
        int i11;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (!sRunningMemCheck) {
            long j11 = lastMemCheckTimeStamps;
            if (j11 == 0 || jCurrentTimeMillis - j11 >= C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                sRunningMemCheck = true;
                AsyncTask.execute(new Runnable() { // from class: com.tencent.imsdk.common.SystemUtil.1
                    @Override // java.lang.Runnable
                    public void run() {
                        System.currentTimeMillis();
                        boolean unused = SystemUtil.sRunningMemCheck = false;
                        try {
                            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                            Debug.getMemoryInfo(memoryInfo);
                            int totalPss = memoryInfo.getTotalPss();
                            long unused2 = SystemUtil.lastMemCheckTimeStamps = jCurrentTimeMillis;
                            int unused3 = SystemUtil.lastMemUsage = totalPss / 1024;
                        } catch (Exception unused4) {
                        }
                    }
                });
                i11 = lastMemUsage;
            } else {
                i11 = lastMemUsage;
            }
        } else {
            i11 = lastMemUsage;
        }
        return i11;
    }

    public static String getAppName() {
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
            packageManager.getApplicationLabel(applicationInfo);
            CharSequence charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
            if (charSequenceLoadLabel != null && charSequenceLoadLabel.length() > 0) {
                return charSequenceLoadLabel.toString();
            }
            return "";
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e(TAG, "getAppName exception:" + e11.getMessage());
            return "";
        }
    }

    public static String getDeviceID() {
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("DeviceInfo", 0);
        if (!sharedPreferences.contains(DEVICE_ID)) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString(DEVICE_ID, "");
        if (Pattern.matches("\\w{8}(-\\w{4}){3}-\\w{12}", string) && !TextUtils.isEmpty(string)) {
            return string;
        }
        return UUID.randomUUID().toString();
    }

    public static int getInstanceType() {
        if (isBrandXiaoMi()) {
            return 2000;
        }
        if (isBrandNewHonor()) {
            return 2006;
        }
        if (isBrandHuawei()) {
            return 2001;
        }
        if (isBrandMeizu()) {
            return 2003;
        }
        if (isBrandOppo()) {
            return 2004;
        }
        if (isBrandVivo()) {
            return 2005;
        }
        if (isBrandNIO()) {
            return 2007;
        }
        return 2002;
    }

    public static String getSDKInitPath() {
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        String string = applicationContext.getFilesDir().toString();
        String packageName = applicationContext.getPackageName();
        String currentProcessName2 = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName2) && !packageName.equals(currentProcessName2)) {
            try {
                int iLastIndexOf = currentProcessName2.lastIndexOf(C33844oi.f71346o);
                if (iLastIndexOf < 0) {
                    iLastIndexOf = currentProcessName2.lastIndexOf(C33978va.f72339h);
                }
                if (iLastIndexOf >= 0) {
                    currentProcessName2 = currentProcessName2.substring(iLastIndexOf + 1);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                String str = File.separator;
                sb2.append(str);
                sb2.append(currentProcessName2);
                sb2.append(str);
                string = sb2.toString();
            } catch (Exception e11) {
                Log.e(TAG, "getSDKInitPath exception = " + e11);
            }
        }
        Log.d(TAG, "SDK Init Path: " + string);
        return string;
    }

    public static String getSDKLogPath() {
        boolean zMkdirs;
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        File file = new File("/sdcard/Android/data/" + applicationContext.getPackageName() + "/files/log/tencent/imsdk");
        if (!file.exists()) {
            zMkdirs = file.mkdirs();
        } else {
            zMkdirs = true;
        }
        if (!zMkdirs && (file = applicationContext.getExternalFilesDir(null)) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getAbsolutePath());
            String str = File.separator;
            sb2.append(str);
            sb2.append("log");
            sb2.append(str);
            sb2.append("tencent");
            sb2.append(str);
            sb2.append("imsdk");
            file = new File(sb2.toString());
            if (!file.exists()) {
                zMkdirs = file.mkdirs();
            } else {
                zMkdirs = true;
            }
        }
        if (!zMkdirs) {
            file = applicationContext.getFilesDir();
            Log.w(TAG, "create log folder failed");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb3.append(str2);
        String string = sb3.toString();
        String packageName = applicationContext.getPackageName();
        String currentProcessName2 = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName2) && !packageName.equals(currentProcessName2)) {
            try {
                int iLastIndexOf = currentProcessName2.lastIndexOf(C33844oi.f71346o);
                if (iLastIndexOf < 0) {
                    iLastIndexOf = currentProcessName2.lastIndexOf(C33978va.f72339h);
                }
                if (iLastIndexOf >= 0) {
                    currentProcessName2 = currentProcessName2.substring(iLastIndexOf + 1);
                }
                string = string + currentProcessName2 + str2;
            } catch (Exception e11) {
                Log.e(TAG, "getSDKLogPath exception = " + e11);
            }
        }
        Log.d(TAG, "SDK LOG Path: " + string);
        return string;
    }

    public static String getStringMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b11 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static float getSysCpuUsage() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastSysCpuTime < C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            return lastSysCpu;
        }
        float f11 = (getProcessCPURate()[1] / 10) / 100.0f;
        lastSysCpu = f11;
        lastSysCpuTime = jCurrentTimeMillis;
        return f11;
    }

    public static boolean isBrandHuawei() {
        if (!JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(getBuildManufacturer()) && !JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getBuildBrand())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandMeizu() {
        if (!JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(getBuildManufacturer())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandNIO() {
        if ("nio".equalsIgnoreCase(getBuildBrand()) && "nio".equalsIgnoreCase(getBuildManufacturer())) {
            return true;
        }
        return false;
    }

    public static boolean isBrandNewHonor() {
        if (JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getBuildBrand()) && JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(getBuildManufacturer())) {
            return true;
        }
        return false;
    }

    public static boolean isBrandOppo() {
        if (!JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(getBuildManufacturer()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(getBuildManufacturer()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(getBuildManufacturer())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandVivo() {
        if (!JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(getBuildManufacturer()) && !"iQOO".equalsIgnoreCase(getBuildBrand()) && !"iQOO".equalsIgnoreCase(getBuildManufacturer())) {
            return false;
        }
        return true;
    }

    public static boolean isBrandXiaoMi() {
        if (!JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(getBuildBrand()) && !JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(getBuildManufacturer()) && !"Redmi".equalsIgnoreCase(getBuildBrand()) && !"Redmi".equalsIgnoreCase(getBuildManufacturer())) {
            return false;
        }
        return true;
    }

    private static boolean loadIMSDKLibrary(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String str2 = str + File.separator + "libImSDK.so";
                System.load(str2);
                Log.i(TAG, "system load so library success: " + str2);
                return true;
            }
            System.loadLibrary("ImSDK");
            Log.i(TAG, "system load so library success, libImSDK.so");
            return true;
        } catch (Exception e11) {
            Log.e(TAG, "system load so library failed, " + e11.getMessage());
            return false;
        } catch (UnsatisfiedLinkError e12) {
            Log.e(TAG, "system load so library failed, " + e12.getMessage());
            return false;
        }
    }
}
