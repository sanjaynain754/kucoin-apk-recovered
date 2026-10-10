package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import com.facebook.soloader.observer.ObserverHolder;
import com.facebook.soloader.recovery.DefaultRecoveryStrategyFactory;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.recovery.RecoveryStrategyFactory;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes45.dex */
public class SoLoader {
    static final boolean DEBUG = false;
    public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
    public static final int SOLOADER_DISABLE_BACKUP_SOSOURCE = 8;
    public static final int SOLOADER_DISABLE_FS_SYNC_JOB = 256;

    @Deprecated
    public static final int SOLOADER_DONT_TREAT_AS_SYSTEMAPP = 32;
    public static final int SOLOADER_ENABLE_BACKUP_SOSOURCE_DSONOTFOUND_ERROR_RECOVERY = 2048;
    public static final int SOLOADER_ENABLE_BASE_APK_SPLIT_SOURCE = 1024;

    @Deprecated
    public static final int SOLOADER_ENABLE_DIRECT_SOSOURCE = 64;
    public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
    public static final int SOLOADER_ENABLE_SYSTEMLOAD_WRAPPER_SOSOURCE = 512;
    public static final int SOLOADER_EXPLICITLY_ENABLE_BACKUP_SOSOURCE = 128;
    public static final int SOLOADER_IMPLICIT_DEPENDENCIES_TEST = 4096;
    public static final int SOLOADER_LOOK_IN_ZIP = 4;
    public static final int SOLOADER_SKIP_MERGED_JNI_ONLOAD = 16;
    public static final String SO_STORE_NAME_MAIN = "lib-main";
    public static final String TAG = "SoLoader";
    public static final String VERSION = "0.12.1";
    private static int sFlags;
    static SoFileLoader sSoFileLoader;
    private static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    static Context sApplicationContext = null;
    private static volatile SoSource[] sSoSources = null;
    private static final AtomicInteger sSoSourcesVersion = new AtomicInteger(0);
    private static RecoveryStrategyFactory sRecoveryStrategyFactory = null;
    private static final Set<String> sLoadedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Map<String, Object> sLoadingLibraries = new HashMap();
    private static final Set<String> sLoadedAndJniInvoked = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Map<String, Object> sInvokingJniForLibrary = new HashMap();
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;
    private static boolean isEnabled = true;
    private static int sAppType = 0;
    private static ExternalSoMapping externalSoMapping = null;
    static final boolean SYSTRACE_LIBRARY_LOADING = true;

    public interface AppType {
        public static final int SYSTEM_APP = 2;
        public static final int THIRD_PARTY_APP = 1;
        public static final int UNSET = 0;
        public static final int UPDATED_SYSTEM_APP = 3;
    }

    public static class TestOnlyUtils {
        public static void resetStatus() {
            synchronized (SoLoader.class) {
                SoLoader.sLoadedLibraries.clear();
                SoLoader.sLoadedAndJniInvoked.clear();
                SoLoader.sLoadingLibraries.clear();
                SoLoader.sSoFileLoader = null;
                SoLoader.sApplicationContext = null;
                RecoveryStrategyFactory unused = SoLoader.sRecoveryStrategyFactory = null;
                ObserverHolder.resetObserversForTestsOnly();
            }
            setSoSources(null);
        }

        public static void setContext(Context context) {
            SoLoader.sApplicationContext = context;
        }

        public static void setSoFileLoader(SoFileLoader soFileLoader) {
            SoLoader.sSoFileLoader = soFileLoader;
        }

        public static void setSoSources(SoSource[] soSourceArr) {
            SoLoader.sSoSourcesLock.writeLock().lock();
            try {
                SoSource[] unused = SoLoader.sSoSources = soSourceArr;
                SoLoader.sSoSourcesVersion.getAndIncrement();
            } finally {
                SoLoader.sSoSourcesLock.writeLock().unlock();
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        public WrongAbiError(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.getSupportedAbis()) + " error: " + str);
            initCause(th2);
        }
    }

    public static void deinitForTest() {
        TestOnlyUtils.setSoSources(null);
    }

    public static void init(Context context, int i11) throws IOException {
        init(context, i11, null);
    }

    public static boolean loadLibrary(String str) {
        return isEnabled ? loadLibrary(str, 0) : NativeLoader.loadLibrary(str);
    }

    private static boolean loadLibraryBySoName(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        RecoveryStrategy recoveryStrategyRecover = null;
        while (true) {
            try {
                return loadLibraryBySoNameImpl(str, str2, str3, i11, threadPolicy);
            } catch (UnsatisfiedLinkError e11) {
                recoveryStrategyRecover = recover(str, e11, recoveryStrategyRecover);
            }
        }
    }

    private static void addApplicationSoSource(ArrayList<SoSource> arrayList, int i11) {
        ApplicationSoSource applicationSoSource = new ApplicationSoSource(sApplicationContext, i11);
        LogUtil.m10650d(TAG, "Adding application source: " + applicationSoSource.toString());
        arrayList.add(0, applicationSoSource);
    }

    @SuppressLint({"CatchGeneralException"})
    private static void addBackupSoSource(Context context, ArrayList<SoSource> arrayList, boolean z11) throws IOException {
        if ((sFlags & 8) != 0) {
            return;
        }
        arrayList.add(0, new BackupSoSource(context, SO_STORE_NAME_MAIN, !z11));
    }

    private static void addDirectApkSoSource(Context context, ArrayList<SoSource> arrayList) {
        DirectApkSoSource directApkSoSource = new DirectApkSoSource(context);
        LogUtil.m10650d(TAG, "validating/adding directApk source: " + directApkSoSource.toString());
        if (directApkSoSource.isValid()) {
            arrayList.add(0, directApkSoSource);
        }
    }

    private static void addSystemLoadWrapperSoSource(Context context, ArrayList<SoSource> arrayList) {
        SystemLoadWrapperSoSource systemLoadWrapperSoSource = new SystemLoadWrapperSoSource();
        LogUtil.m10650d(TAG, "adding systemLoadWrapper source: " + systemLoadWrapperSoSource);
        arrayList.add(0, systemLoadWrapperSoSource);
    }

    public static boolean areSoSourcesAbisSupported() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                for (SoSource soSource : sSoSources) {
                    for (String str : soSource.getSoSourceAbis()) {
                        boolean zEquals = false;
                        for (int i11 = 0; i11 < supportedAbis.length && !zEquals; i11++) {
                            zEquals = str.equals(supportedAbis[i11]);
                        }
                        if (!zEquals) {
                            LogUtil.m10652e(TAG, "abi not supported: " + str);
                            reentrantReadWriteLock = sSoSourcesLock;
                        }
                    }
                }
                sSoSourcesLock.readLock().unlock();
                return true;
            }
            reentrantReadWriteLock.readLock().unlock();
            return false;
        } catch (Throwable th2) {
            sSoSourcesLock.readLock().unlock();
            throw th2;
        }
    }

    public static SoSource[] cloneSoSources() {
        sSoSourcesLock.readLock().lock();
        try {
            return sSoSources == null ? new SoSource[0] : (SoSource[]) sSoSources.clone();
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static void doLoadLibraryBySoName(String str, String str2, int i11, StrictMode.ThreadPolicy threadPolicy) throws UnsatisfiedLinkError {
        boolean z11;
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                LogUtil.m10652e(TAG, "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z11 = true;
            } else {
                z11 = false;
            }
            if (SYSTRACE_LIBRARY_LOADING) {
                if (str2 != null) {
                    Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (SoSource soSource : sSoSources) {
                            if (loadLibraryFromSoSource(soSource, str, i11, threadPolicy)) {
                                sSoSourcesLock.readLock().unlock();
                                if (SYSTRACE_LIBRARY_LOADING) {
                                    if (str2 != null) {
                                        Api18TraceUtils.endSection();
                                    }
                                    Api18TraceUtils.endSection();
                                }
                                if (z11) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw SoLoaderDSONotFoundError.create(str, sApplicationContext, sSoSources);
                    } catch (IOException e11) {
                        SoLoaderULError soLoaderULError = new SoLoaderULError(str, e11.toString());
                        soLoaderULError.initCause(e11);
                        throw soLoaderULError;
                    }
                } catch (Throwable th2) {
                    sSoSourcesLock.readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (SYSTRACE_LIBRARY_LOADING) {
                    if (str2 != null) {
                        Api18TraceUtils.endSection();
                    }
                    Api18TraceUtils.endSection();
                }
                if (z11) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            sSoSourcesLock.readLock().unlock();
            throw th4;
        }
    }

    private static int getAppType(Context context) {
        int i11 = sAppType;
        if (i11 != 0) {
            return i11;
        }
        int i12 = 1;
        if (context == null) {
            LogUtil.m10650d(TAG, "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i13 = applicationInfo.flags;
        if ((i13 & 1) != 0) {
            i12 = (i13 & 128) != 0 ? 3 : 2;
        }
        LogUtil.m10650d(TAG, "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    private static int getApplicationSoSourceFlags() {
        int i11 = sAppType;
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2 || i11 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static String[] getLibraryDependencies(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String[] libraryDependencies = null;
            if (sSoSources != null) {
                for (int i11 = 0; libraryDependencies == null && i11 < sSoSources.length; i11++) {
                    libraryDependencies = sSoSources[i11].getLibraryDependencies(str);
                }
            }
            return libraryDependencies;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static String getLibraryPath(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String libraryPath = null;
            if (sSoSources != null) {
                for (int i11 = 0; libraryPath == null && i11 < sSoSources.length; i11++) {
                    libraryPath = sSoSources[i11].getLibraryPath(str);
                }
            }
            return libraryPath;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static int getLoadedLibrariesCount() {
        return sLoadedLibraries.size();
    }

    private static synchronized RecoveryStrategy getRecoveryStrategy() {
        RecoveryStrategyFactory recoveryStrategyFactory;
        recoveryStrategyFactory = sRecoveryStrategyFactory;
        return recoveryStrategyFactory == null ? null : recoveryStrategyFactory.get();
    }

    public static File getSoFile(String str) {
        ExternalSoMapping externalSoMapping2 = externalSoMapping;
        String strMapLibName = externalSoMapping2 != null ? externalSoMapping2.mapLibName(str) : MergedSoMapping.mapLibName(str);
        if (strMapLibName != null) {
            str = strMapLibName;
        }
        String strMapLibraryName = System.mapLibraryName(str);
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                for (int i11 = 0; i11 < sSoSources.length; i11++) {
                    try {
                        File soFileByName = sSoSources[i11].getSoFileByName(strMapLibraryName);
                        if (soFileByName != null) {
                            sSoSourcesLock.readLock().unlock();
                            return soFileByName;
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            sSoSourcesLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            sSoSourcesLock.readLock().unlock();
            throw th2;
        }
    }

    public static int getSoSourcesVersion() {
        return sSoSourcesVersion.get();
    }

    public static void init(Context context, int i11, SoFileLoader soFileLoader) throws IOException {
        if (isInitialized()) {
            LogUtil.m10658w(TAG, "SoLoader already initialized");
            return;
        }
        LogUtil.m10658w(TAG, "Initializing SoLoader: " + i11);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zInitEnableConfig = initEnableConfig(context);
            isEnabled = zInitEnableConfig;
            if (zInitEnableConfig) {
                int appType = getAppType(context);
                sAppType = appType;
                if ((i11 & 128) == 0 && SysUtil.isSupportedDirectLoad(context, appType)) {
                    i11 |= 8;
                }
                initSoLoader(context, soFileLoader, i11);
                initSoSources(context, i11);
                LogUtil.m10656v(TAG, "Init SoLoader delegate");
                NativeLoader.initIfUninitialized(new NativeLoaderToSoLoaderDelegate());
            } else {
                initDummySoSource();
                LogUtil.m10656v(TAG, "Init System Loader delegate");
                NativeLoader.initIfUninitialized(new SystemDelegate());
            }
            LogUtil.m10658w(TAG, "SoLoader initialized: " + i11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    private static void initDummySoSource() {
        if (sSoSources != null) {
            return;
        }
        sSoSourcesLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                sSoSources = new SoSource[0];
            }
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    private static boolean initEnableConfig(Context context) {
        String packageName;
        if (externalSoMapping != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            } catch (Exception e11) {
                e = e11;
                LogUtil.m10659w(TAG, "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e12) {
            e = e12;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void initSoLoader(Context context, SoFileLoader soFileLoader, int i11) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    LogUtil.m10658w(TAG, "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                sApplicationContext = context;
                sRecoveryStrategyFactory = new DefaultRecoveryStrategyFactory(context, makeRecoveryFlags(i11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (soFileLoader != null || sSoFileLoader == null) {
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
            } else {
                sSoFileLoader = new InstrumentedSoFileLoader(new SoFileLoaderImpl());
            }
        }
    }

    private static void initSoSources(Context context, int i11) throws IOException {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (sSoSources != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (sSoSources != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                sFlags = i11;
                ArrayList arrayList = new ArrayList();
                boolean z11 = true;
                boolean z12 = (i11 & 512) != 0;
                boolean z13 = (i11 & 1024) != 0;
                if (z12) {
                    addSystemLoadWrapperSoSource(context, arrayList);
                } else if (z13) {
                    addSystemLibSoSource(arrayList);
                    arrayList.add(0, new DirectSplitSoSource(TtmlNode.RUBY_BASE));
                } else {
                    addSystemLibSoSource(arrayList);
                    if (context != null) {
                        if ((i11 & 1) != 0) {
                            addApplicationSoSource(arrayList, getApplicationSoSourceFlags());
                            LogUtil.m10650d(TAG, "Adding exo package source: lib-main");
                            arrayList.add(0, new ExoSoSource(context, SO_STORE_NAME_MAIN));
                        } else {
                            if (SysUtil.isSupportedDirectLoad(context, sAppType)) {
                                addDirectApkSoSource(context, arrayList);
                            }
                            addApplicationSoSource(arrayList, getApplicationSoSourceFlags());
                            if ((i11 & 4096) == 0) {
                                z11 = false;
                            }
                            addBackupSoSource(context, arrayList, z11);
                        }
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int iMakePrepareFlags = makePrepareFlags();
                int length = soSourceArr.length;
                while (true) {
                    int i12 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    LogUtil.m10654i(TAG, "Preparing SO source: " + soSourceArr[i12]);
                    boolean z14 = SYSTRACE_LIBRARY_LOADING;
                    if (z14) {
                        Api18TraceUtils.beginTraceSection(TAG, "_", soSourceArr[i12].getClass().getSimpleName());
                    }
                    soSourceArr[i12].prepare(iMakePrepareFlags);
                    if (z14) {
                        Api18TraceUtils.endSection();
                    }
                    length = i12;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion.getAndIncrement();
                LogUtil.m10654i(TAG, "init finish: " + sSoSources.length + " SO sources prepared");
                writeLock = sSoSourcesLock.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            sSoSourcesLock.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean isInitialized() {
        if (sSoSources != null) {
            return true;
        }
        sSoSourcesLock.readLock().lock();
        try {
            return sSoSources != null;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static boolean loadLibrary(String str, int i11) throws UnsatisfiedLinkError {
        SystemLoadLibraryWrapper systemLoadLibraryWrapper;
        Boolean boolLoadLibraryOnNonAndroid = loadLibraryOnNonAndroid(str);
        if (boolLoadLibraryOnNonAndroid != null) {
            return boolLoadLibraryOnNonAndroid.booleanValue();
        }
        if (!isEnabled) {
            return NativeLoader.loadLibrary(str);
        }
        int i12 = sAppType;
        if ((i12 != 2 && i12 != 3) || (systemLoadLibraryWrapper = sSystemLoadLibraryWrapper) == null) {
            return loadLibraryOnAndroid(str, i11);
        }
        systemLoadLibraryWrapper.loadLibrary(str);
        return true;
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    private static boolean loadLibraryOnAndroid(String str, int i11) {
        ExternalSoMapping externalSoMapping2 = externalSoMapping;
        String strMapLibName = externalSoMapping2 != null ? externalSoMapping2.mapLibName(str) : MergedSoMapping.mapLibName(str);
        String str2 = strMapLibName != null ? strMapLibName : str;
        ObserverHolder.onLoadLibraryStart(str, strMapLibName, i11);
        try {
            boolean zLoadLibraryBySoName = loadLibraryBySoName(System.mapLibraryName(str2), str, strMapLibName, i11, null);
            ObserverHolder.onLoadLibraryEnd(null, zLoadLibraryBySoName);
            return zLoadLibraryBySoName;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onLoadLibraryEnd(th2, false);
                throw th3;
            }
        }
    }

    private static Boolean loadLibraryOnNonAndroid(String str) {
        Boolean boolValueOf;
        if (sSoSources != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = sLoadedLibraries.contains(str);
                            boolean z11 = !zContains;
                            if (!zContains) {
                                SystemLoadLibraryWrapper systemLoadLibraryWrapper = sSystemLoadLibraryWrapper;
                                if (systemLoadLibraryWrapper != null) {
                                    systemLoadLibraryWrapper.loadLibrary(str);
                                } else {
                                    System.loadLibrary(str);
                                }
                            }
                            boolValueOf = Boolean.valueOf(z11);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                assertInitialized();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th3) {
            sSoSourcesLock.readLock().unlock();
            throw th3;
        }
    }

    public static String makeLdLibraryPath() {
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            SoSource[] soSourceArr = sSoSources;
            if (soSourceArr != null) {
                for (SoSource soSource : soSourceArr) {
                    soSource.addToLdLibraryPath(arrayList);
                }
            }
            String strJoin = TextUtils.join(C33844oi.f71346o, arrayList);
            LogUtil.m10650d(TAG, "makeLdLibraryPath final path: " + strJoin);
            return strJoin;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static int makePrepareFlags() {
        sSoSourcesLock.writeLock().lock();
        try {
            int i11 = sFlags;
            int i12 = (i11 & 2) != 0 ? 1 : 0;
            if ((i11 & 256) != 0) {
                i12 |= 4;
            }
            if ((i11 & 128) == 0) {
                i12 |= 8;
            }
            return i12;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    private static int makeRecoveryFlags(int i11) {
        return (i11 & 2048) != 0 ? 1 : 0;
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        sSoSourcesLock.writeLock().lock();
        try {
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[sSoSources.length + 1];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion.getAndIncrement();
            LogUtil.m10650d(TAG, "Prepended to SO sources: " + soSource);
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private static RecoveryStrategy recover(String str, UnsatisfiedLinkError unsatisfiedLinkError, RecoveryStrategy recoveryStrategy) {
        LogUtil.m10658w(TAG, "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (recoveryStrategy == null) {
                try {
                    recoveryStrategy = getRecoveryStrategy();
                    if (recoveryStrategy == null) {
                        LogUtil.m10658w(TAG, "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (NoBaseApkException e11) {
                    LogUtil.m10653e(TAG, "Base APK not found during recovery", e11);
                    throw e11;
                } catch (Exception e12) {
                    LogUtil.m10653e(TAG, "Got an exception during recovery, will throw the initial error instead", e12);
                    throw unsatisfiedLinkError;
                }
            }
            if (recoverLocked(unsatisfiedLinkError, recoveryStrategy)) {
                sSoSourcesVersion.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return recoveryStrategy;
            }
            reentrantReadWriteLock.writeLock().unlock();
            LogUtil.m10658w(TAG, "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th2) {
            sSoSourcesLock.writeLock().unlock();
            throw th2;
        }
    }

    public static void setInTestMode() {
        TestOnlyUtils.setSoSources(new SoSource[]{new NoopSoSource()});
    }

    public static synchronized void setRecoveryStrategyFactory(RecoveryStrategyFactory recoveryStrategyFactory) {
        sRecoveryStrategyFactory = recoveryStrategyFactory;
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            for (SoSource soSource : sSoSources) {
                File fileUnpackLibrary = soSource.unpackLibrary(str);
                if (fileUnpackLibrary != null) {
                    return fileUnpackLibrary;
                }
            }
            throw new FileNotFoundException(str);
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static void addSystemLibSoSource(ArrayList<SoSource> arrayList) {
        String str;
        if (SysUtil.is64Bit()) {
            str = "/system/lib64:/vendor/lib64";
        } else {
            str = "/system/lib:/vendor/lib";
        }
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + C33844oi.f71346o + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(C33844oi.f71346o)))) {
            LogUtil.m10650d(TAG, "adding system library source: " + str3);
            arrayList.add(new DirectorySoSource(new File(str3), 2));
        }
    }

    private static void assertInitialized() {
        if (isInitialized()) {
        } else {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static void loadDependency(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        ObserverHolder.onLoadDependencyStart(str, i11);
        try {
            ObserverHolder.onLoadDependencyEnd(null, loadLibraryBySoNameImpl(str, null, null, i11 | 1, threadPolicy));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onLoadDependencyEnd(th2, false);
                throw th3;
            }
        }
    }

    private static boolean loadLibraryBySoNameImpl(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && sLoadedAndJniInvoked.contains(str2)) {
            return false;
        }
        Set<String> set = sLoadedLibraries;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (set.contains(str)) {
                    if (str3 == null) {
                        return false;
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                Map<String, Object> map = sLoadingLibraries;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map<String, Object> map2 = sInvokingJniForLibrary;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z11) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z11 = true;
                            }
                            if (!z11) {
                                try {
                                    LogUtil.m10650d(TAG, "About to load: " + str);
                                    doLoadLibraryBySoName(str, str2, i11, threadPolicy);
                                    LogUtil.m10650d(TAG, "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e11) {
                                    String message = e11.getMessage();
                                    if (message != null && message.contains("unexpected e_machine:")) {
                                        throw new WrongAbiError(e11, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                    }
                                    throw e11;
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i11 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !sLoadedAndJniInvoked.contains(str2)) {
                                        boolean z12 = SYSTRACE_LIBRARY_LOADING;
                                        if (z12 && externalSoMapping == null) {
                                            Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            try {
                                                LogUtil.m10650d(TAG, "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                ExternalSoMapping externalSoMapping2 = externalSoMapping;
                                                if (externalSoMapping2 != null) {
                                                    externalSoMapping2.invokeJniOnload(str2);
                                                } else {
                                                    MergedSoMapping.invokeJniOnload(str2);
                                                }
                                                sLoadedAndJniInvoked.add(str2);
                                                if (z12 && externalSoMapping == null) {
                                                    Api18TraceUtils.endSection();
                                                }
                                            } catch (UnsatisfiedLinkError e12) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e12);
                                            }
                                        } catch (Throwable th2) {
                                            if (SYSTRACE_LIBRARY_LOADING && externalSoMapping == null) {
                                                Api18TraceUtils.endSection();
                                            }
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z11;
                    }
                } catch (Throwable th4) {
                    sSoSourcesLock.readLock().unlock();
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock", "MissingSoLoaderLibrary"})
    private static boolean loadLibraryFromSoSource(SoSource soSource, String str, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z11;
        ObserverHolder.onSoSourceLoadLibraryStart(soSource);
        try {
            if (soSource.loadLibrary(str, i11, threadPolicy) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ObserverHolder.onSoSourceLoadLibraryEnd(null);
            return z11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onSoSourceLoadLibraryEnd(th2);
                throw th3;
            }
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    private static boolean recoverLocked(UnsatisfiedLinkError unsatisfiedLinkError, RecoveryStrategy recoveryStrategy) {
        ObserverHolder.onRecoveryStart(recoveryStrategy);
        try {
            boolean zRecover = recoveryStrategy.recover(unsatisfiedLinkError, sSoSources);
            ObserverHolder.onRecoveryEnd(null);
            return zRecover;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onRecoveryEnd(th2);
                throw th3;
            }
        }
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static boolean useDepsFile(Context context, boolean z11, boolean z12) {
        return NativeDeps.useDepsFile(context, z11, z12);
    }

    public static void init(Context context, boolean z11) {
        try {
            init(context, z11 ? 1 : 0, null);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static void init(Context context, ExternalSoMapping externalSoMapping2) throws IOException {
        synchronized (SoLoader.class) {
            externalSoMapping = externalSoMapping2;
        }
        init(context, 0);
    }
}
