package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34012x4 {

    /* JADX INFO: renamed from: a */
    public static String f72492a = "CrashReport";

    /* JADX INFO: renamed from: a */
    public static boolean m75431a(LogState logState, String str, Object... objArr) {
        Logger logger = Logger.INSTANCE;
        if (logger.getLogLevel().getValue() < logState.getValue()) {
            return false;
        }
        String strM75439c = m75439c(str, objArr);
        int i11 = a.f72493a[logState.ordinal()];
        if (i11 == 1) {
            logger.mo77132i(f72492a, strM75439c);
            return true;
        }
        if (i11 == 2) {
            logger.mo77130d(f72492a, strM75439c);
            return true;
        }
        if (i11 == 3) {
            logger.mo77134w(f72492a, strM75439c);
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        logger.mo77131e(f72492a, strM75439c);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75438b(Throwable th2) {
        return m75432a(LogState.WARN, th2);
    }

    /* JADX INFO: renamed from: c */
    public static String m75439c(String str, Object... objArr) {
        if (str == null) {
            return "null";
        }
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m75442d(String str, Object... objArr) {
        return m75431a(LogState.INFO, str, objArr);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.x4$a */
    /* JADX INFO: compiled from: BUGLY */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72493a;

        static {
            int[] iArr = new int[LogState.values().length];
            f72493a = iArr;
            try {
                iArr[LogState.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72493a[LogState.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72493a[LogState.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72493a[LogState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75437b(String str, Object... objArr) {
        return m75431a(LogState.ERROR, str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m75441d(Class cls, String str, Object... objArr) {
        return m75431a(LogState.WARN, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m75443e(String str, Object... objArr) {
        return m75431a(LogState.INFO, str, objArr);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m75444f(String str, Object... objArr) {
        return m75431a(LogState.WARN, str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75436b(Class cls, String str, Object... objArr) {
        return m75431a(LogState.ERROR, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75440c(Class cls, String str, Object... objArr) {
        return m75431a(LogState.INFO, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75432a(LogState logState, Throwable th2) {
        if (Logger.INSTANCE.getLogLevel().getValue() < logState.getValue()) {
            return false;
        }
        return m75431a(logState, C33571bi.m72605b(th2), new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75434a(String str, Object... objArr) {
        return m75431a(LogState.DEBUG, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75433a(Class cls, String str, Object... objArr) {
        return m75431a(LogState.DEBUG, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75435a(Throwable th2) {
        return m75432a(LogState.ERROR, th2);
    }
}
