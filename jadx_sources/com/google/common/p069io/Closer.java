package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Closer implements Closeable {
    private static final Suppressor SUPPRESSING_SUPPRESSOR = new Suppressor() { // from class: com.google.common.io.a
        @Override // com.google.common.io.Closer.Suppressor
        public final void suppress(Closeable closeable, Throwable th2, Throwable th3) {
            Closer.m13610a(closeable, th2, th3);
        }
    };
    private final Deque<Closeable> stack = new ArrayDeque(4);

    @VisibleForTesting
    final Suppressor suppressor;
    private Throwable thrown;

    @VisibleForTesting
    public interface Suppressor {
        void suppress(Closeable closeable, Throwable th2, Throwable th3);
    }

    public RuntimeException rethrow(Throwable th2) throws Throwable {
        Preconditions.checkNotNull(th2);
        this.thrown = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13610a(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            Closeables.logger.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    public static Closer create() {
        return new Closer(SUPPRESSING_SUPPRESSOR);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th2 = this.thrown;
        while (!this.stack.isEmpty()) {
            Closeable closeableRemoveFirst = this.stack.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.suppressor.suppress(closeableRemoveFirst, th2, th3);
                }
            }
        }
        if (this.thrown != null || th2 == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfUnchecked(th2);
        throw new AssertionError(th2);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c11) {
        if (c11 != null) {
            this.stack.addFirst(c11);
        }
        return c11;
    }

    @VisibleForTesting
    public Closer(Suppressor suppressor) {
        this.suppressor = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th2, Class<X> cls) throws Exception {
        Preconditions.checkNotNull(th2);
        this.thrown = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Exception {
        Preconditions.checkNotNull(th2);
        this.thrown = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfInstanceOf(th2, cls2);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }
}
