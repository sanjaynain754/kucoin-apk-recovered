package com.google.firebase.perf.logging;

import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AndroidLogger {
    private static volatile AndroidLogger instance;
    private boolean isLogcatEnabled;
    private final LogWrapper logWrapper;

    @VisibleForTesting
    public AndroidLogger(LogWrapper logWrapper) {
        this.isLogcatEnabled = false;
        this.logWrapper = logWrapper == null ? LogWrapper.getInstance() : logWrapper;
    }

    public void debug(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13820d(str);
        }
    }

    public void error(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13821e(str);
        }
    }

    public void info(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13822i(str);
        }
    }

    public void verbose(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13823v(str);
        }
    }

    public void warn(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13824w(str);
        }
    }

    public static AndroidLogger getInstance() {
        if (instance == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (instance == null) {
                        instance = new AndroidLogger();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return instance;
    }

    public boolean isLogcatEnabled() {
        return this.isLogcatEnabled;
    }

    public void setLogcatEnabled(boolean z11) {
        this.isLogcatEnabled = z11;
    }

    public void debug(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13820d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void error(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13821e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void info(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13822i(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void verbose(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13823v(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m13824w(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private AndroidLogger() {
        this(null);
    }
}
