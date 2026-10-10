package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    public static final class Exiter implements Thread.UncaughtExceptionHandler {
        private static final LazyLogger logger = new LazyLogger(Exiter.class);
        private final Runtime runtime;

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            try {
                logger.get().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th2);
                this.runtime.exit(1);
            } catch (Throwable th3) {
                try {
                    System.err.println(th2.getMessage());
                    System.err.println(th3.getMessage());
                } finally {
                    this.runtime.exit(1);
                }
            }
        }

        public Exiter(Runtime runtime) {
            this.runtime = runtime;
        }
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }

    private UncaughtExceptionHandlers() {
    }
}
