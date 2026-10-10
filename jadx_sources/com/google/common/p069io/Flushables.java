package com.google.common.p069io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Flushables {
    private static final Logger logger = Logger.getLogger(Flushables.class.getName());

    @Beta
    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e11) {
            logger.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e11);
        }
    }

    private Flushables() {
    }

    public static void flush(Flushable flushable, boolean z11) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e11) {
            if (z11) {
                logger.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e11);
                return;
            }
            throw e11;
        }
    }
}
