package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;

    @GuardedBy("lock")
    private static int logLevel = 0;

    @GuardedBy("lock")
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();

    @GuardedBy("lock")
    private static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: d */
            public void mo2963d(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: e */
            public void mo2964e(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: i */
            public void mo2965i(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: w */
            public void mo2966w(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th2));
            }
        };

        /* JADX INFO: renamed from: d */
        void mo2963d(String str, String str2, @Nullable Throwable th2);

        /* JADX INFO: renamed from: e */
        void mo2964e(String str, String str2, @Nullable Throwable th2);

        /* JADX INFO: renamed from: i */
        void mo2965i(String str, String str2, @Nullable Throwable th2);

        /* JADX INFO: renamed from: w */
        void mo2966w(String str, String str2, @Nullable Throwable th2);
    }

    /* JADX INFO: renamed from: d */
    public static void m2955d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.mo2963d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2957e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.mo2964e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2959i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.mo2965i(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2961w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.mo2966w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int getLogLevel() {
        int i11;
        synchronized (lock) {
            i11 = logLevel;
        }
        return i11;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (lock) {
            try {
                if (isCausedByUnknownHostException(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i11) {
        synchronized (lock) {
            logLevel = i11;
        }
    }

    public static void setLogStackTraces(boolean z11) {
        synchronized (lock) {
            logStackTraces = z11;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    private Log() {
    }

    public static String appendThrowableString(String str, @Nullable Throwable th2) {
        String throwableString = getThrowableString(th2);
        if (!TextUtils.isEmpty(throwableString)) {
            return str + "\n  " + throwableString.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static void m2956d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.mo2963d(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2958e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.mo2964e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2960i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.mo2965i(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2962w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.mo2966w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
