package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
class AppendableWriter extends Writer {
    private boolean closed;
    private final Appendable target;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        Appendable appendable = this.target;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) throws IOException {
        checkNotClosed();
        this.target.append(new String(cArr, i11, i12));
    }

    private void checkNotClosed() throws IOException {
        if (this.closed) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    public AppendableWriter(Appendable appendable) {
        this.target = (Appendable) Preconditions.checkNotNull(appendable);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        checkNotClosed();
        Appendable appendable = this.target;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(int i11) throws IOException {
        checkNotClosed();
        this.target.append((char) i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) throws IOException {
        checkNotClosed();
        this.target.append(c11);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        checkNotClosed();
        this.target.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i11, int i12) throws IOException {
        checkNotClosed();
        this.target.append(charSequence, i11, i12);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i11, int i12) throws IOException {
        Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str, i11, i12 + i11);
    }
}
