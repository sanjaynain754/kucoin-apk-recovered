package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.StrictMode;
import com.facebook.soloader.observer.ObserverHolder;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes45.dex */
public final class NativeDeps {
    private static final float HASHMAP_LOAD_FACTOR = 1.0f;
    private static final int INITIAL_HASH = 5381;
    private static final int LIB_PREFIX_LEN = 3;
    private static final int LIB_SUFFIX_LEN = 3;
    private static final String LOG_TAG = "NativeDeps";
    private static final int WAITING_THREADS_WARNING_THRESHOLD = 3;
    private static byte[] sEncodedDeps;
    private static volatile boolean sInitialized;
    private static Map<Integer, List<Integer>> sPrecomputedDeps;
    private static List<Integer> sPrecomputedLibs;
    private static volatile boolean sUseDepsFileAsync;
    private static final int LIB_PREFIX_SUFFIX_LEN = 3 + 3;
    private static final ReentrantReadWriteLock sWaitForDepsFileLock = new ReentrantReadWriteLock();
    private static final HashSet<String> STANDARD_SYSTEM_LIBS = new HashSet<String>() { // from class: com.facebook.soloader.NativeDeps.1
        {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    };

    private static int findNextLine(byte[] bArr, int i11) {
        while (i11 < bArr.length && bArr[i11] != 10) {
            i11++;
        }
        return i11 < bArr.length ? i11 + 1 : i11;
    }

    private static void indexDepsBytes(byte[] bArr, int i11) {
        int i12;
        byte b11;
        boolean z11 = true;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (z11) {
                i13 = INITIAL_HASH;
                i12 = i11;
                while (true) {
                    try {
                        b11 = bArr[i12];
                        if (b11 <= 32) {
                            break;
                        }
                        i13 = (i13 << 5) + i13 + b11;
                        i12++;
                    } catch (IndexOutOfBoundsException unused) {
                        if (z11 || i11 == bArr.length) {
                            return;
                        }
                        indexLib(i13, i11);
                        return;
                    }
                }
                indexLib(i13, i11);
                z11 = b11 != 32;
            } else {
                while (bArr[i11] != 10) {
                    try {
                        i11++;
                    } catch (IndexOutOfBoundsException unused2) {
                        i11 = i14;
                        if (z11) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i15 = i14;
                i12 = i11;
                i11 = i15;
            }
            int i16 = i12 + 1;
            i14 = i11;
            i11 = i16;
        }
    }

    public static boolean processDepsBytes(byte[] bArr, byte[] bArr2) throws IOException {
        int iVerifyBytesAndGetOffset;
        int libCount;
        if (bArr != null) {
            iVerifyBytesAndGetOffset = verifyBytesAndGetOffset(bArr, bArr2);
            if (iVerifyBytesAndGetOffset == -1) {
                return false;
            }
        } else {
            iVerifyBytesAndGetOffset = 0;
        }
        int iFindNextLine = findNextLine(bArr2, iVerifyBytesAndGetOffset);
        if (iFindNextLine >= bArr2.length || (libCount = parseLibCount(bArr2, iVerifyBytesAndGetOffset, (iFindNextLine - iVerifyBytesAndGetOffset) - 1)) <= 0) {
            return false;
        }
        sPrecomputedDeps = new HashMap(((int) (libCount / 1.0f)) + 1, 1.0f);
        sPrecomputedLibs = new ArrayList(libCount);
        indexDepsBytes(bArr2, iFindNextLine);
        if (sPrecomputedLibs.size() != libCount) {
            return false;
        }
        sEncodedDeps = bArr2;
        sInitialized = true;
        return true;
    }

    private static int verifyBytesAndGetOffset(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2.length < bArr.length + 4) {
            return -1;
        }
        if (bArr2.length != bArr.length + 4 + ByteBuffer.wrap(bArr2, bArr.length, 4).getInt()) {
            return -1;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return -1;
            }
        }
        return bArr.length + 4;
    }

    private static String[] awaitGetDepsFromPrecomputedDeps(String str) {
        if (sInitialized) {
            return tryGetDepsFromPrecomputedDeps(str);
        }
        if (!sUseDepsFileAsync) {
            return null;
        }
        sWaitForDepsFileLock.readLock().lock();
        try {
            return tryGetDepsFromPrecomputedDeps(str);
        } finally {
            sWaitForDepsFileLock.readLock().unlock();
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static String[] getDependencies(String str, ElfByteChannel elfByteChannel) throws IOException {
        boolean z11 = SoLoader.SYSTRACE_LIBRARY_LOADING;
        if (z11) {
            Api18TraceUtils.beginTraceSection("soloader.NativeDeps.getDependencies[", str, "]");
        }
        ObserverHolder.onGetDependenciesStart();
        try {
            try {
                try {
                    String[] strArrAwaitGetDepsFromPrecomputedDeps = awaitGetDepsFromPrecomputedDeps(str);
                    if (strArrAwaitGetDepsFromPrecomputedDeps != null) {
                        ObserverHolder.onGetDependenciesEnd(null);
                        if (z11) {
                            Api18TraceUtils.endSection();
                        }
                        return strArrAwaitGetDepsFromPrecomputedDeps;
                    }
                    String[] strArrExtract_DT_NEEDED = MinElf.extract_DT_NEEDED(elfByteChannel);
                    ObserverHolder.onGetDependenciesEnd(null);
                    if (z11) {
                        Api18TraceUtils.endSection();
                    }
                    return strArrExtract_DT_NEEDED;
                } catch (Error | RuntimeException e11) {
                    throw e11;
                }
            } catch (MinElf.ElfError e12) {
                throw SoLoaderULErrorFactory.create(str, e12);
            }
        } catch (Throwable th2) {
            ObserverHolder.onGetDependenciesEnd(null);
            if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
                Api18TraceUtils.endSection();
            }
            throw th2;
        }
    }

    private static String[] getDepsForLibAtOffset(int i11, int i12) {
        byte b11;
        ArrayList arrayList = new ArrayList();
        int i13 = (i11 + i12) - LIB_PREFIX_SUFFIX_LEN;
        int i14 = 0;
        boolean z11 = false;
        while (true) {
            byte[] bArr = sEncodedDeps;
            if (i13 >= bArr.length || (b11 = bArr[i13]) == 10) {
                break;
            }
            if (b11 == 32) {
                if (z11) {
                    String libString = getLibString(i14);
                    if (libString == null) {
                        return null;
                    }
                    arrayList.add(libString);
                    i14 = 0;
                    z11 = false;
                } else {
                    continue;
                }
            } else {
                if (b11 < 48 || b11 > 57) {
                    return null;
                }
                i14 = (i14 * 10) + (b11 - 48);
                z11 = true;
            }
            i13++;
        }
        if (z11) {
            String libString2 = getLibString(i14);
            if (libString2 == null) {
                return null;
            }
            arrayList.add(libString2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String getLibString(int i11) {
        if (i11 >= sPrecomputedLibs.size()) {
            return null;
        }
        int iIntValue = sPrecomputedLibs.get(i11).intValue();
        int i12 = iIntValue;
        while (true) {
            byte[] bArr = sEncodedDeps;
            if (i12 >= bArr.length || bArr[i12] <= 32) {
                break;
            }
            i12++;
        }
        int i13 = (i12 - iIntValue) + LIB_PREFIX_SUFFIX_LEN;
        char[] cArr = new char[i13];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i14 = 0; i14 < i13 - LIB_PREFIX_SUFFIX_LEN; i14++) {
            cArr[LIB_PREFIX_LEN + i14] = (char) sEncodedDeps[iIntValue + i14];
        }
        cArr[i13 - 3] = '.';
        cArr[i13 - 2] = 's';
        cArr[i13 - 1] = 'o';
        return new String(cArr);
    }

    private static int hashLib(String str) {
        int iCodePointAt = INITIAL_HASH;
        for (int i11 = LIB_PREFIX_LEN; i11 < str.length() - LIB_SUFFIX_LEN; i11++) {
            iCodePointAt = str.codePointAt(i11) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static void indexLib(int i11, int i12) {
        sPrecomputedLibs.add(Integer.valueOf(i12));
        List<Integer> arrayList = sPrecomputedDeps.get(Integer.valueOf(i11));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            sPrecomputedDeps.put(Integer.valueOf(i11), arrayList);
        }
        arrayList.add(Integer.valueOf(i12));
    }

    private static boolean libIsAtOffset(String str, int i11) {
        int i12;
        int i13 = LIB_PREFIX_LEN;
        while (true) {
            int length = str.length();
            i12 = LIB_SUFFIX_LEN;
            if (i13 >= length - i12 || i11 >= sEncodedDeps.length || (str.codePointAt(i13) & 255) != sEncodedDeps[i11]) {
                break;
            }
            i13++;
            i11++;
        }
        return i13 == str.length() - i12;
    }

    private static int parseLibCount(byte[] bArr, int i11, int i12) {
        try {
            return Integer.parseInt(new String(bArr, i11, i12));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String[] tryGetDepsFromPrecomputedDeps(String str) {
        int offsetForLib;
        if (sInitialized && str.length() > LIB_PREFIX_SUFFIX_LEN && (offsetForLib = getOffsetForLib(str)) != -1) {
            return getDepsForLibAtOffset(offsetForLib, str.length());
        }
        return null;
    }

    public static boolean useDepsFile(final Context context, boolean z11, final boolean z12) {
        if (!z11) {
            return useDepsFileFromApkSync(context, z12);
        }
        new Thread(new Runnable() { // from class: com.facebook.soloader.NativeDeps.2
            @Override // java.lang.Runnable
            public void run() {
                NativeDeps.sWaitForDepsFileLock.writeLock().lock();
                boolean unused = NativeDeps.sUseDepsFileAsync = true;
                try {
                    NativeDeps.useDepsFileFromApkSync(context, z12);
                } finally {
                    int readLockCount = NativeDeps.sWaitForDepsFileLock.getReadLockCount();
                    if (readLockCount >= 3) {
                        LogUtil.m10658w(NativeDeps.LOG_TAG, "NativeDeps initialization finished with " + Integer.toString(readLockCount) + " threads waiting.");
                    }
                    NativeDeps.sWaitForDepsFileLock.writeLock().unlock();
                    boolean unused2 = NativeDeps.sUseDepsFileAsync = false;
                }
            }
        }, "soloader-nativedeps-init").start();
        return true;
    }

    private static void verifyUninitialized() {
        if (sInitialized) {
            synchronized (NativeDeps.class) {
                try {
                    if (sInitialized) {
                        throw new IllegalStateException("Trying to initialize NativeDeps but it was already initialized");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static int getOffsetForLib(String str) {
        List<Integer> list = sPrecomputedDeps.get(Integer.valueOf(hashLib(str)));
        if (list == null) {
            return -1;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (libIsAtOffset(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static boolean initDeps(Context context, boolean z11) throws IOException {
        byte[] nativeDepsFromApk;
        byte[] bArrMakeApkDepBlock;
        verifyUninitialized();
        if (z11) {
            bArrMakeApkDepBlock = SysUtil.makeApkDepBlock(new File(context.getApplicationInfo().sourceDir), context);
            nativeDepsFromApk = NativeDepsUnpacker.readNativeDepsFromDisk(context);
        } else {
            nativeDepsFromApk = NativeDepsUnpacker.readNativeDepsFromApk(context);
            bArrMakeApkDepBlock = null;
        }
        return processDepsBytes(bArrMakeApkDepBlock, nativeDepsFromApk);
    }

    public static void loadDependencies(String str, ElfByteChannel elfByteChannel, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] dependencies = getDependencies(str, elfByteChannel);
        LogUtil.m10650d(SoLoader.TAG, "Loading " + str + "'s dependencies: " + Arrays.toString(dependencies));
        for (String str2 : dependencies) {
            if (!str2.startsWith("/") && !STANDARD_SYSTEM_LIBS.contains(str2)) {
                SoLoader.loadDependency(str2, i11, threadPolicy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean useDepsFileFromApkSync(Context context, boolean z11) throws Throwable {
        boolean zInitDeps;
        try {
            zInitDeps = initDeps(context, z11);
        } catch (IOException unused) {
            zInitDeps = false;
        }
        if (!zInitDeps && z11) {
            try {
                NativeDepsUnpacker.ensureNativeDepsAvailable(context);
                zInitDeps = initDeps(context, z11);
            } catch (IOException unused2) {
            }
        }
        if (!zInitDeps) {
            LogUtil.m10658w(LOG_TAG, "Failed to extract native deps from APK, falling back to using MinElf to get library dependencies.");
        }
        return zInitDeps;
    }
}
