package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes45.dex */
public final class SysUtil {
    private static final long APK_DEP_BLOCK_METADATA_LENGTH = 20;
    private static final byte APK_SIGNATURE_VERSION = 1;
    private static final String TAG = "SysUtil";

    @DoNotOptimize
    @TargetApi(21)
    public static final class LollipopSysdeps {
        @DoNotOptimize
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j11) throws IOException {
            int i11;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j11);
            } catch (ErrnoException e11) {
                if (e11.errno != OsConstants.EOPNOTSUPP && (i11 = e11.errno) != OsConstants.ENOSYS && i11 != OsConstants.EINVAL) {
                    throw new IOException(e11.toString(), e11);
                }
            }
        }

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(MinElf.ISA.AARCH64);
                    treeSet.add(MinElf.ISA.X86_64);
                } else {
                    treeSet.add(MinElf.ISA.ARM);
                    treeSet.add(MinElf.ISA.X86);
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e11) {
                LogUtil.m10652e(SysUtil.TAG, String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e11.errno), e11.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @DoNotOptimize
        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }

        private LollipopSysdeps() {
        }
    }

    @DoNotOptimize
    @TargetApi(23)
    public static final class MarshmallowSysdeps {
        public static boolean isSupportedDirectLoad(Context context, int i11) {
            if (i11 == 2) {
                return true;
            }
            return isDisabledExtractNativeLibs(context);
        }

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(MinElf.ISA.AARCH64);
                treeSet.add(MinElf.ISA.X86_64);
            } else {
                treeSet.add(MinElf.ISA.ARM);
                treeSet.add(MinElf.ISA.X86);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        private static boolean isApkUncompressedDso(Context context) throws IOException {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (true) {
                    if (!enumerationEntries.hasMoreElements()) {
                        zipFile.close();
                        return false;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getName().contains("/lib") && !zipEntryNextElement.getName().startsWith("assets/")) {
                        boolean z11 = zipEntryNextElement.getMethod() == 0;
                        zipFile.close();
                        return z11;
                    }
                }
            } catch (Throwable th2) {
                try {
                    zipFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public static boolean isDisabledExtractNativeLibs(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        private MarshmallowSysdeps() {
        }

        @DoNotOptimize
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static int copyBytes(RandomAccessFile randomAccessFile, InputStream inputStream, int i11, byte[] bArr) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, 0, Math.min(bArr.length, i11 - i12));
            if (i13 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, i13);
            i12 += i13;
        }
        return i12;
    }

    public static int findAbiScore(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (str2 != null && str.equals(str2)) {
                return i11;
            }
        }
        return -1;
    }

    public static void dumbDelete(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                deleteOrThrow(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            deleteOrThrow((File) arrayList.get(size));
        }
    }

    public static void fsyncAll(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    LogUtil.m10652e(TAG, "Syncing failed for " + file2 + ": " + e11.getMessage());
                }
            }
        }
    }

    public static String getBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    @DoNotOptimize
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e11) {
                LogUtil.m10653e(TAG, "Cannot call getLdLibraryPath", e11);
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    @DoNotOptimize
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e11) {
            LogUtil.m10659w(TAG, "Cannot get nativeLoad method", e11);
            return null;
        }
    }

    public static FileLocker getOrCreateLockOnDir(File file, File file2) throws Throwable {
        boolean z11;
        try {
            return getFileLocker(file2);
        } catch (FileNotFoundException e11) {
            z11 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e11;
                }
                FileLocker fileLocker = getFileLocker(file2);
                if (!file.setWritable(false)) {
                    LogUtil.m10658w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                return fileLocker;
            } catch (Throwable th2) {
                th = th2;
                if (z11 && !file.setWritable(false)) {
                    LogUtil.m10658w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
            if (z11) {
                LogUtil.m10658w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    private static long getParcelPadSize(long j11) {
        return j11 + ((4 - (j11 % 4)) % 4);
    }

    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(C33844oi.f71346o);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(C33844oi.f71346o, arrayList);
    }

    public static void deleteOrThrow(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            LogUtil.m10652e(TAG, "Enable write permission failed: " + parentFile);
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j11) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j11);
    }

    public static long getApkDepBlockLength(File file) throws IOException {
        return getParcelPadSize(((long) (file.getCanonicalFile().getPath().length() + 1)) * 2) + 20;
    }

    public static int getAppVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static FileLocker getFileLocker(File file) throws IOException {
        return FileLocker.lock(file);
    }

    public static String[] getSupportedAbis() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean is64Bit() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean isDisabledExtractNativeLibs(Context context) {
        return MarshmallowSysdeps.isDisabledExtractNativeLibs(context);
    }

    public static boolean isSupportedDirectLoad(Context context, int i11) {
        return MarshmallowSysdeps.isSupportedDirectLoad(context, i11);
    }

    public static byte[] makeApkDepBlock(File file, Context context) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(getAppVersionCode(context));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static void mkdirOrThrow(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
    }
}
