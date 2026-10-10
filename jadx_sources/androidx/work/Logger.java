package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG_PREFIX = "WM-";
    private static final Object sLock = new Object();
    private static volatile Logger sLogger;

    public abstract void debug(@NonNull String str, @NonNull String str2);

    public abstract void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void error(@NonNull String str, @NonNull String str2);

    public abstract void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void info(@NonNull String str, @NonNull String str2);

    public abstract void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void verbose(@NonNull String str, @NonNull String str2);

    public abstract void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void warning(@NonNull String str, @NonNull String str2);

    public abstract void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public static class LogcatLogger extends Logger {
        private final int mLoggingLevel;

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2);
            }
        }

        public LogcatLogger(int i11) {
            super(i11);
            this.mLoggingLevel = i11;
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2, th2);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    @NonNull
    public static Logger get() {
        Logger logger;
        synchronized (sLock) {
            try {
                if (sLogger == null) {
                    sLogger = new LogcatLogger(3);
                }
                logger = sLogger;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return logger;
    }

    public static void setLogger(@NonNull Logger logger) {
        synchronized (sLock) {
            sLogger = logger;
        }
    }

    public Logger(int i11) {
    }

    @NonNull
    public static String tagWithPrefix(@NonNull String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(TAG_PREFIX);
        int i11 = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
