package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C33539a7;
import com.tencent.bugly.proguard.C33545ad;
import com.tencent.bugly.proguard.C33566bd;
import com.tencent.bugly.proguard.C33571bi;
import com.tencent.bugly.proguard.C33608dd;
import com.tencent.bugly.proguard.C33724j3;
import com.tencent.bugly.proguard.C33745k3;
import com.tencent.bugly.proguard.C33765l2;
import com.tencent.bugly.proguard.C33778lf;
import com.tencent.bugly.proguard.C33784m0;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33830o4;
import com.tencent.bugly.proguard.C33863pg;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.bugly.proguard.C33922se;
import com.tencent.bugly.proguard.C33947u;
import com.tencent.bugly.proguard.C34012x4;
import com.tencent.bugly.proguard.InterfaceC33587cd;
import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class NativeCrashHandler implements InterfaceC33587cd, C33545ad.a {

    /* JADX INFO: renamed from: A */
    public static final int f68670A = 17;

    /* JADX INFO: renamed from: B */
    public static final int f68671B = 18;

    /* JADX INFO: renamed from: C */
    public static final int f68672C = 19;

    /* JADX INFO: renamed from: D */
    public static final int f68673D = 20;

    /* JADX INFO: renamed from: E */
    public static final int f68674E = 21;

    /* JADX INFO: renamed from: F */
    public static final int f68675F = 22;

    /* JADX INFO: renamed from: G */
    public static final int f68676G = 23;

    /* JADX INFO: renamed from: H */
    public static final int f68677H = 24;

    /* JADX INFO: renamed from: I */
    public static final int f68678I = 25;

    /* JADX INFO: renamed from: J */
    public static final int f68679J = 26;

    /* JADX INFO: renamed from: K */
    public static final int f68680K = 27;

    /* JADX INFO: renamed from: L */
    public static final int f68681L = 28;

    /* JADX INFO: renamed from: M */
    public static final int f68682M = 29;

    /* JADX INFO: renamed from: N */
    public static final int f68683N = 30;

    /* JADX INFO: renamed from: O */
    public static final int f68684O = 31;

    /* JADX INFO: renamed from: P */
    public static final int f68685P = 32;

    /* JADX INFO: renamed from: Q */
    public static final int f68686Q = 33;

    /* JADX INFO: renamed from: R */
    public static final int f68687R = 34;

    /* JADX INFO: renamed from: S */
    public static final int f68688S = 35;

    /* JADX INFO: renamed from: T */
    public static final int f68689T = 36;

    /* JADX INFO: renamed from: U */
    public static final int f68690U = 37;

    /* JADX INFO: renamed from: V */
    public static final int f68691V = 38;

    /* JADX INFO: renamed from: W */
    public static final int f68692W = 39;

    /* JADX INFO: renamed from: X */
    public static final int f68693X = 40;

    /* JADX INFO: renamed from: Y */
    public static final int f68694Y = 2048;

    /* JADX INFO: renamed from: Z */
    public static final String f68695Z = "native_record_lock";

    /* JADX INFO: renamed from: a0 */
    public static final String f68696a0 = "native_crash_";

    /* JADX INFO: renamed from: b0 */
    public static final long f68697b0 = 10000;

    /* JADX INFO: renamed from: c0 */
    public static final long f68698c0 = 10000;
    public static boolean enableNativeDumpAllThreadStack = false;

    /* JADX INFO: renamed from: k */
    public static NativeCrashHandler f68699k = null;

    /* JADX INFO: renamed from: l */
    public static int f68700l = 1;

    /* JADX INFO: renamed from: m */
    public static String f68701m = null;

    /* JADX INFO: renamed from: n */
    public static boolean f68702n = false;

    /* JADX INFO: renamed from: o */
    public static boolean f68703o = false;

    /* JADX INFO: renamed from: p */
    public static final String f68704p = "com.tencent.feedback.eup.jni.NativeExceptionUpload";

    /* JADX INFO: renamed from: q */
    public static boolean f68705q = true;

    /* JADX INFO: renamed from: r */
    public static final int f68706r = 999;

    /* JADX INFO: renamed from: s */
    public static final int f68707s = 998;

    /* JADX INFO: renamed from: t */
    public static final int f68708t = 10;

    /* JADX INFO: renamed from: u */
    public static final int f68709u = 11;

    /* JADX INFO: renamed from: v */
    public static final int f68710v = 12;

    /* JADX INFO: renamed from: w */
    public static final int f68711w = 13;

    /* JADX INFO: renamed from: x */
    public static final int f68712x = 14;

    /* JADX INFO: renamed from: y */
    public static final int f68713y = 15;

    /* JADX INFO: renamed from: z */
    public static final int f68714z = 16;

    /* JADX INFO: renamed from: a */
    public final Context f68715a;

    /* JADX INFO: renamed from: b */
    public final C33765l2 f68716b;

    /* JADX INFO: renamed from: c */
    public final C33784m0 f68717c;

    /* JADX INFO: renamed from: d */
    public NativeExceptionHandler f68718d;

    /* JADX INFO: renamed from: e */
    public final boolean f68719e;

    /* JADX INFO: renamed from: f */
    public boolean f68720f = false;

    /* JADX INFO: renamed from: g */
    public boolean f68721g = false;

    /* JADX INFO: renamed from: h */
    public boolean f68722h = false;

    /* JADX INFO: renamed from: i */
    public boolean f68723i = false;

    /* JADX INFO: renamed from: j */
    public C33724j3 f68724j;

    public static synchronized NativeCrashHandler getInstance(Context context, C33765l2 c33765l2, C33724j3 c33724j3, C33863pg c33863pg, C33784m0 c33784m0, boolean z11, String str) {
        try {
            if (f68699k == null) {
                f68699k = new NativeCrashHandler(context, c33765l2, c33724j3, c33863pg, c33784m0, z11, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f68699k;
    }

    private native String getSoCpuAbi();

    /* JADX INFO: renamed from: a */
    public void m72187a() {
        try {
            String str = C33922se.m74981a().f71951f;
            C33765l2 c33765l2 = this.f68716b;
            setCrashProcessingInfo(str, c33765l2.f70745f, c33765l2.f70763o);
        } catch (Throwable unused) {
        }
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    /* JADX INFO: renamed from: b */
    public final void m72191b(int i11, String str) {
        if (str == null || str.length() <= 2048) {
            String strM72603b = C33571bi.m72603b(str);
            if (this.f68721g || this.f68720f) {
                if (strM72603b == null) {
                    strM72603b = "";
                }
                m72190a(i11, strM72603b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m72195c() {
        setNativeAppVersion(this.f68716b.f70714F);
        setNativeSdkVersion(this.f68716b.f70755k);
        setNativeAppBuildNum(this.f68716b.f70748g0);
        setNativeDeviceModel(this.f68716b.m73892o());
        setNativeDeviceId(this.f68716b.m73890n());
        setNativeIsFirstInstall(this.f68716b.f70752i0);
        setNativeAppChannel(this.f68716b.m73868d());
        setNativeAppPackage(this.f68716b.f70743e);
        setNativeUserId(this.f68716b.m73833F());
        setNativeIsAppForeground(this.f68716b.m73838K());
        setNativeLaunchTime(this.f68716b.f70739c);
    }

    public void checkSaveRecordCrash() {
        C34012x4.m75442d("[Native] Check local record file and save db.", new Object[0]);
        if (!C33571bi.m72592a(this.f68715a, f68695Z, 10000L)) {
            C34012x4.m75431a(LogState.INFO, "[Native] Failed to lock file for handling native crash record.", new Object[0]);
            return;
        }
        try {
            if (!f68705q) {
                m72190a(999, CredentialEntry.FALSE_STRING);
            }
            m72188a(f68701m);
            File[] fileArrListFiles = new File(f68701m).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith(f68696a0)) {
                        if (System.currentTimeMillis() - file.lastModified() >= 10000) {
                            m72188a(file.getAbsolutePath());
                        }
                    }
                }
            }
            m72192b(f68701m);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m72197d() {
        if (!this.f68722h) {
            C34012x4.m75444f("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
            if (unregist() != null) {
                C34012x4.m75442d("[Native] Successfully closed native crash report.", new Object[0]);
                this.f68722h = false;
                return;
            }
            try {
                C33571bi.m72570a(f68704p, "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
                this.f68722h = false;
                C34012x4.m75442d("[Native] Successfully closed native crash report.", new Object[0]);
                return;
            } catch (Throwable unused) {
                C34012x4.m75434a("[Native] Failed to close native crash report.", new Object[0]);
                this.f68721g = false;
                this.f68720f = false;
                return;
            }
        } catch (Throwable unused2) {
            C34012x4.m75434a("[Native] Failed to close native crash report.", new Object[0]);
        }
        throw th;
    }

    public void disableCatchAnrTrace() {
        f68700l = 1;
    }

    public native String getCrashThreadLocalValue();

    public native void getFd();

    public native String getNativeLog();

    public native void getNativeProcessInfo(String str);

    public native String getProperties(String str);

    public synchronized boolean isUserOpened() {
        return this.f68723i;
    }

    public native void modifyAttachmentState(int i11);

    public void modifyProcessingState(int i11, boolean z11) {
        modifyProcessingState(i11, z11, false);
    }

    public native void modifyProcessingState(int i11, boolean z11, boolean z12);

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z11 = strategyBean.f68568d;
                if (z11 != this.f68722h) {
                    C34012x4.m75444f("server native changed to %b", Boolean.valueOf(z11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z12 = C33863pg.m74576b().m74582c().f68568d && this.f68723i;
        if (z12 != this.f68722h) {
            C34012x4.m75442d("native changed to %b", Boolean.valueOf(z12));
            m72196c(z12);
        }
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native void recordProcessingState(String str, int i11);

    public native String regist(String str, String str2, String str3, String str4, boolean z11, int i11, long j11);

    public native String removeNativeKeyValue(String str);

    public native void saveAdditionalAttachmentPathsNative(String str);

    public boolean setAdditionalAttachmentPaths(ArrayList<String> arrayList) {
        try {
            if (!f68703o || arrayList == null) {
                C34012x4.m75442d("setAdditionalAttachmentPaths failed for sample ratio", new Object[0]);
                return false;
            }
            setAdditionalAttachmentPathsNative((String[]) arrayList.toArray(new String[arrayList.size()]));
            C34012x4.m75442d("setAdditionalAttachmentPaths successful", new Object[0]);
            return true;
        } catch (Throwable th2) {
            if (!C34012x4.m75444f(C33799mf.m74131a("Failed to set additional attachment paths. ", th2), new Object[0])) {
                th2.printStackTrace();
            }
        }
    }

    public native void setAdditionalAttachmentPathsNative(String[] strArr);

    public native void setCrashProcessingInfo(String str, String str2, String str3);

    public native void setNativeInfo(int i11, String str);

    public native void setNativeLogLevel(int i11);

    public synchronized void setUserOpened(boolean z11) {
        try {
            m72189a(z11);
            boolean zIsUserOpened = isUserOpened();
            C33863pg c33863pgM74576b = C33863pg.m74576b();
            if (c33863pgM74576b != null) {
                zIsUserOpened = zIsUserOpened && c33863pgM74576b.m74582c().f68568d;
            }
            if (zIsUserOpened != this.f68722h) {
                C34012x4.m75442d("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m72196c(zIsUserOpened);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f68721g && !this.f68720f) {
                boolean zM72617c = C33571bi.m72617c(this.f68716b.f70723O);
                boolean z11 = !zM72617c;
                if (C33745k3.f70508o) {
                    boolean zTryLoadSo = tryLoadSo(zM72617c ? "Bugly_Native" : this.f68716b.f70723O, z11);
                    this.f68721g = zTryLoadSo;
                    if (!zTryLoadSo && zM72617c) {
                        this.f68720f = tryLoadSo("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    String str2 = this.f68716b.f70723O;
                    if (!zM72617c) {
                        str = str2;
                    }
                    this.f68721g = tryLoadSo(str, z11);
                }
                if (this.f68721g || this.f68720f) {
                    m72193b(this.f68719e);
                    m72195c();
                    m72187a();
                    return;
                }
                return;
            }
            m72193b(this.f68719e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f68721g) {
            testCrash();
        } else {
            C34012x4.m75444f("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public boolean tryLoadSo(String str, boolean z11) {
        boolean z12;
        try {
            C34012x4.m75442d("[Native] Trying to load so: %s", str);
            if (z11) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            try {
                C34012x4.m75431a(LogState.INFO, "[Native] Successfully loaded SO: %s", str);
                return true;
            } catch (Throwable th2) {
                z12 = true;
                th = th2;
                C34012x4.m75444f(th.getMessage(), new Object[0]);
                C34012x4.m75431a(LogState.WARN, "[Native] Failed to load so: %s", str);
                return z12;
            }
        } catch (Throwable th3) {
            th = th3;
            z12 = false;
        }
    }

    public native String unregist();

    /* JADX INFO: renamed from: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$a */
    /* JADX INFO: compiled from: BUGLY */
    public static /* synthetic */ class C33521a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68725a;

        static {
            int[] iArr = new int[LogState.values().length];
            f68725a = iArr;
            try {
                iArr[LogState.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68725a[LogState.VERBOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68725a[LogState.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68725a[LogState.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68725a[LogState.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68725a[LogState.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static synchronized String getDumpFilePath() {
        return f68701m;
    }

    public static boolean isShouldHandleInJava() {
        return f68705q;
    }

    public static void setCustomFileUploadAble(boolean z11) {
        f68703o = z11;
    }

    public static synchronized void setDumpFilePath(String str) {
        if (f68702n) {
            C34012x4.m75442d("setDumpFilePath after register, just return", new Object[0]);
        } else {
            f68701m = str;
        }
    }

    public static void setShouldHandleInJava(boolean z11) {
        f68705q = z11;
        NativeCrashHandler nativeCrashHandler = f68699k;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m72190a(999, "" + z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72188a(String str) {
        CrashDetailBean crashDetailBeanM72831a = C33608dd.m72831a(this.f68715a, str, this.f68718d);
        if (crashDetailBeanM72831a != null) {
            C34012x4.m75442d("[Native] Get crash from native record.", new Object[0]);
            if (!this.f68724j.m73502a(crashDetailBeanM72831a, false)) {
                C34012x4.m75431a(LogState.INFO, "[Native] Native crash record Need to upload.", new Object[0]);
            }
            C33608dd.m72840a(false, str);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33587cd
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f68720f || this.f68721g) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f68721g) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C33571bi.m72570a(f68704p, "appendNativeLog", null, new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public void dumpAnrNativeStack() {
        m72190a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f68700l |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m72190a(998, CredentialEntry.TRUE_STRING);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33587cd
    public String getLogFromNative() {
        if (!this.f68720f && !this.f68721g) {
            return null;
        }
        try {
            return this.f68721g ? getNativeLog() : (String) C33571bi.m72570a(f68704p, "getNativeLog", null, null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f68718d;
    }

    public String getSystemProperty(String str) {
        return (this.f68721g || this.f68720f) ? getProperties(str) : C33864ph.f71456b;
    }

    public boolean isEnableCatchAnrTrace() {
        return (f68700l & 2) == 2;
    }

    @Override // com.tencent.bugly.proguard.C33545ad.a
    public void onSubProcessConfigChanged(boolean z11) {
        C34012x4.m75442d("enableNativeSubProcess: " + z11, new Object[0]);
        setNativeEnableSubProcess(Boolean.valueOf(z11));
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f68720f || this.f68721g) && str != null && str2 != null) {
            try {
                if (this.f68721g) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C33571bi.m72570a(f68704p, "putNativeKeyValue", null, new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public void reRegisterANRHandler(boolean z11) {
        if (this.f68721g || this.f68720f) {
            m72190a(31, z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        }
    }

    public void reRegisterNativeHandler(boolean z11) {
        if (this.f68721g || this.f68720f) {
            m72190a(30, z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        }
    }

    public void removeEmptyNativeRecordFiles() {
        C33608dd.m72845b(f68701m);
    }

    public void resendSigquit() {
        m72190a(20, "");
    }

    public boolean setAppHotPatchNum(String str) {
        return m72190a(28, str);
    }

    public boolean setAppVersionLabel(String str) {
        return m72190a(29, str);
    }

    public void setCaseLabel(String str) {
        m72191b(33, str);
    }

    public boolean setCrashThreadLocalKey(String str, long j11) {
        C33765l2.f70707J0 = str;
        m72190a(39, str);
        m72190a(40, String.valueOf(j11));
        return true;
    }

    public boolean setCrashWhiteListStr(String str) {
        return m72190a(38, str);
    }

    public boolean setEnableCrashWhiteList(boolean z11) {
        return m72190a(37, z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
    }

    public void setNativeAndroidLogLevel(int i11) {
        int i12;
        LogState byValue = LogState.INSTANCE.getByValue(i11);
        if (byValue == null) {
            return;
        }
        switch (C33521a.f68725a[byValue.ordinal()]) {
            case 1:
                i12 = 8;
                break;
            case 2:
                i12 = 2;
                break;
            case 3:
                i12 = 3;
                break;
            case 4:
                i12 = 4;
                break;
            case 5:
                i12 = 5;
                break;
            case 6:
                i12 = 6;
                break;
            default:
                i12 = 0;
                C34012x4.m75444f("Unknown log level state!", new Object[0]);
                break;
        }
        setNativeLogLevel(i12);
    }

    public boolean setNativeAppBuildNum(String str) {
        return m72190a(23, str);
    }

    public boolean setNativeAppChannel(String str) {
        return m72190a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m72190a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m72190a(10, str);
    }

    public boolean setNativeDeviceId(String str) {
        return m72190a(26, str);
    }

    public boolean setNativeDeviceModel(String str) {
        return m72190a(25, str);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33587cd
    public boolean setNativeIsAppForeground(boolean z11) {
        return m72190a(14, z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
    }

    public boolean setNativeIsFirstInstall(boolean z11) {
        return m72190a(27, z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
    }

    public boolean setNativeSdkVersion(String str) {
        return m72190a(24, str);
    }

    public boolean setNativeUserId(String str) {
        return m72190a(11, str);
    }

    public void setStage(String str) {
        m72191b(34, str);
    }

    public void setTestLabel(String str) {
        m72191b(32, str);
    }

    public void unBlockSigquit(boolean z11) {
        if (z11) {
            m72190a(21, CredentialEntry.TRUE_STRING);
        } else {
            m72190a(21, CredentialEntry.FALSE_STRING);
        }
    }

    @SuppressLint({"SdCardPath"})
    public NativeCrashHandler(Context context, C33765l2 c33765l2, C33724j3 c33724j3, C33863pg c33863pg, C33784m0 c33784m0, boolean z11, String str) {
        this.f68715a = C33571bi.m72565a(context);
        if (C33571bi.m72617c(f68701m)) {
            try {
                if (C33571bi.m72617c(str)) {
                    str = context.getDir(C33947u.f72135s, 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = C33778lf.m73987a("/data/data/", C33765l2.m73825a(context).f70743e, "/app_bugly");
            }
            f68701m = str;
        }
        this.f68724j = c33724j3;
        this.f68716b = c33765l2;
        this.f68717c = c33784m0;
        this.f68719e = z11;
        this.f68718d = new C33566bd(context, c33765l2, c33724j3, C33863pg.m74576b());
        C33545ad.m72356b().m72357a(this);
    }

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C34012x4.m75444f("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public void saveAdditionalAttachmentPaths(String str) {
        try {
            saveAdditionalAttachmentPathsNative(str);
        } catch (Throwable th2) {
            if (!C34012x4.m75444f(C33799mf.m74131a("Failed to save additional attachment paths. ", th2), new Object[0])) {
                th2.printStackTrace();
            }
        }
    }

    public boolean setNativeEnableDumpAllThread(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = CredentialEntry.TRUE_STRING;
        } else {
            str = CredentialEntry.FALSE_STRING;
        }
        return m72190a(35, str);
    }

    public boolean setNativeEnableSubProcess(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = CredentialEntry.TRUE_STRING;
        } else {
            str = CredentialEntry.FALSE_STRING;
        }
        return m72190a(22, str);
    }

    public boolean setNativeLaunchTime(long j11) {
        try {
            return m72190a(15, String.valueOf(j11));
        } catch (NumberFormatException e11) {
            if (!C34012x4.m75438b(e11)) {
                e11.printStackTrace();
                return false;
            }
            return false;
        }
    }

    public boolean setSupportLoadBias(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = CredentialEntry.TRUE_STRING;
        } else {
            str = CredentialEntry.FALSE_STRING;
        }
        return m72190a(36, str);
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f68699k;
    }

    public void testNativeCrash(boolean z11, boolean z12, boolean z13) {
        m72190a(16, "" + z11);
        m72190a(17, "" + z12);
        m72190a(18, "" + z13);
        testNativeCrash();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m72193b(boolean z11) throws Throwable {
        Throwable th2;
        NativeCrashHandler nativeCrashHandler;
        try {
            try {
                if (this.f68722h) {
                    try {
                        C34012x4.m75444f("[Native] Native crash report has already registered.", new Object[0]);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    int i11 = 1;
                    if (this.f68721g) {
                        try {
                            nativeCrashHandler = this;
                            try {
                                String strRegist = nativeCrashHandler.regist(this.f68715a.getFilesDir().getAbsolutePath(), f68701m, this.f68715a.getApplicationInfo().nativeLibraryDir, C33765l2.f70706I0, z11, f68700l, C33745k3.f70499K);
                                f68702n = true;
                                setNativeAndroidLogLevel(Logger.INSTANCE.getLogLevel().getValue());
                                setNativeEnableDumpAllThread(Boolean.valueOf(enableNativeDumpAllThreadStack));
                                if (strRegist != null) {
                                    C34012x4.m75442d("[Native] Native Crash Report enable.", new Object[0]);
                                    nativeCrashHandler.f68716b.f70724P = strRegist;
                                    String strConcat = C33820nf.f71144W.concat(strRegist);
                                    if (!C33745k3.f70508o && !nativeCrashHandler.f68716b.f70755k.contains(strConcat)) {
                                        C33765l2 c33765l2 = nativeCrashHandler.f68716b;
                                        c33765l2.f70755k = c33765l2.f70755k.concat(C33820nf.f71144W).concat(nativeCrashHandler.f68716b.f70724P);
                                    }
                                    C34012x4.m75442d("comInfo.sdkVersion %s", nativeCrashHandler.f68716b.f70755k);
                                    nativeCrashHandler.f68722h = true;
                                    String runningCpuAbi = getRunningCpuAbi();
                                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                                        nativeCrashHandler.f68716b.m73877g(runningCpuAbi);
                                    }
                                    return;
                                }
                            } catch (Throwable unused) {
                                C34012x4.m75434a("[Native] Failed to load Bugly SO file.", new Object[0]);
                            }
                        } catch (Throwable unused2) {
                            nativeCrashHandler = this;
                        }
                    } else {
                        nativeCrashHandler = this;
                        if (nativeCrashHandler.f68720f) {
                            try {
                                Class cls = Integer.TYPE;
                                String str = (String) C33571bi.m72570a(f68704p, "registNativeExceptionHandler2", null, new Class[]{String.class, String.class, cls, cls}, new Object[]{f68701m, C33830o4.m74392a(nativeCrashHandler.f68715a, false), Integer.valueOf(z11 ? 1 : 5), 1});
                                if (str == null) {
                                    str = (String) C33571bi.m72570a(f68704p, "registNativeExceptionHandler", null, new Class[]{String.class, String.class, cls}, new Object[]{f68701m, C33830o4.m74392a(nativeCrashHandler.f68715a, false), Integer.valueOf(C33765l2.m73827s().m73863c())});
                                }
                                if (str != null) {
                                    nativeCrashHandler.f68722h = true;
                                    nativeCrashHandler.f68716b.f70724P = str;
                                    C33571bi.m72570a(f68704p, "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                                    if (!z11) {
                                        i11 = 5;
                                    }
                                    C33571bi.m72570a(f68704p, "setLogMode", null, new Class[]{cls}, new Object[]{Integer.valueOf(i11)});
                                    String runningCpuAbi2 = getRunningCpuAbi();
                                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                                        nativeCrashHandler.f68716b.m73877g(runningCpuAbi2);
                                    }
                                    return;
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                    nativeCrashHandler.f68721g = false;
                    nativeCrashHandler.f68720f = false;
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m72189a(boolean z11) {
        if (this.f68723i != z11) {
            C34012x4.m75442d("user change native %b", Boolean.valueOf(z11));
            this.f68723i = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72190a(int i11, String str) {
        if (!this.f68721g) {
            return false;
        }
        try {
            setNativeInfo(i11, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m72196c(boolean z11) {
        try {
            if (z11) {
                startNativeMonitor();
            } else {
                m72197d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72192b(String str) {
        File[] fileArrListFiles;
        long jM72601b = C33571bi.m72601b() - C33745k3.f70492D;
        long jM72601b2 = C33571bi.m72601b() + 86400000;
        File file = new File(str);
        try {
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                C33539a7.m72314a(fileArrListFiles);
                long folderSize = FileUtil.getFolderSize(file);
                for (File file2 : fileArrListFiles) {
                    long jLastModified = file2.lastModified();
                    if (jLastModified <= jM72601b || jLastModified >= jM72601b2 || folderSize > C33745k3.f70491C) {
                        C34012x4.m75434a("[Native] Delete native record: " + file2.getAbsolutePath(), new Object[0]);
                        if (file2.isFile()) {
                            folderSize -= file2.length();
                            file2.delete();
                        } else if (file2.isDirectory()) {
                            folderSize -= FileUtil.getFolderSize(file2);
                            FileUtil.deleteFolder(file2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m72194b() {
        return this.f68722h;
    }
}
