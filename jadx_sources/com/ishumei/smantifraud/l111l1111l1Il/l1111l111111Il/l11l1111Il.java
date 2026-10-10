package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.CameraInfo;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class l11l1111Il {
    public static boolean l1111l111111Il = Log.isLoggable("Volley", 5);
    private static String l111l11111I1l = "Volley";
    private static final String l111l11111lIl = "com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111Il";

    public static class l1111l111111Il {
        public static final boolean l1111l111111Il = l11l1111Il.l1111l111111Il;
        private static final long l111l11111lIl = 0;
        private final List<C46976l1111l111111Il> l111l11111I1l = new ArrayList();
        private boolean l111l11111Il = false;

        private long l1111l111111Il() {
            if (this.l111l11111I1l.size() == 0) {
                return 0L;
            }
            long j11 = this.l111l11111I1l.get(0).l111l11111I1l;
            List<C46976l1111l111111Il> list = this.l111l11111I1l;
            return list.get(list.size() - 1).l111l11111I1l - j11;
        }

        /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111Il$l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
        public static class C46976l1111l111111Il {
            public final String l1111l111111Il;
            public final long l111l11111I1l;
            public final long l111l11111lIl;

            public C46976l1111l111111Il(String str, long j11, long j12) {
                this.l1111l111111Il = str;
                this.l111l11111lIl = j11;
                this.l111l11111I1l = j12;
            }
        }

        public final void finalize() {
            if (this.l111l11111Il) {
                return;
            }
            l1111l111111Il("Request on the loose");
            l11l1111Il.l111l11111I1l("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public final synchronized void l1111l111111Il(String str) {
            long j11;
            this.l111l11111Il = true;
            if (this.l111l11111I1l.size() == 0) {
                j11 = 0;
            } else {
                long j12 = this.l111l11111I1l.get(0).l111l11111I1l;
                List<C46976l1111l111111Il> list = this.l111l11111I1l;
                j11 = list.get(list.size() - 1).l111l11111I1l - j12;
            }
            if (j11 <= 0) {
                return;
            }
            long j13 = this.l111l11111I1l.get(0).l111l11111I1l;
            l11l1111Il.l111l11111lIl("(%-4d ms) %s", Long.valueOf(j11), str);
            for (C46976l1111l111111Il c46976l1111l111111Il : this.l111l11111I1l) {
                long j14 = c46976l1111l111111Il.l111l11111I1l;
                l11l1111Il.l111l11111lIl("(+%-4d) [%2d] %s", Long.valueOf(j14 - j13), Long.valueOf(c46976l1111l111111Il.l111l11111lIl), c46976l1111l111111Il.l1111l111111Il);
                j13 = j14;
            }
        }

        public final synchronized void l1111l111111Il(String str, long j11) {
            if (this.l111l11111Il) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.l111l11111I1l.add(new C46976l1111l111111Il(str, j11, SystemClock.elapsedRealtime()));
        }
    }

    private static void l1111l111111Il(String str) {
        l111l11111lIl("Changing log tag to %s", str);
        l111l11111I1l = str;
        l1111l111111Il = Log.isLoggable(str, 2);
    }

    public static void l111l11111lIl(String str, Object... objArr) {
        Log.d(l111l11111I1l, l111l1111l1Il(str, objArr));
    }

    public static void l1111l111111Il(String str, Object... objArr) {
        if (l1111l111111Il) {
            Log.v(l111l11111I1l, l111l1111l1Il(str, objArr));
        }
    }

    public static void l111l11111I1l(String str, Object... objArr) {
        Log.e(l111l11111I1l, l111l1111l1Il(str, objArr));
    }

    public static void l111l11111Il(String str, Object... objArr) {
        Log.wtf(l111l11111I1l, l111l1111l1Il(str, objArr));
    }

    private static void l111l11111lIl(Throwable th2, String str, Object... objArr) {
        Log.wtf(l111l11111I1l, l111l1111l1Il(str, objArr), th2);
    }

    private static String l111l1111l1Il(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i11 = 2; i11 < stackTrace.length; i11++) {
            if (!stackTrace[i11].getClassName().equals(l111l11111lIl)) {
                String className = stackTrace[i11].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + C33978va.f72339h + stackTrace[i11].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void l1111l111111Il(Throwable th2, String str, Object... objArr) {
        Log.e(l111l11111I1l, l111l1111l1Il(str, objArr), th2);
    }
}
