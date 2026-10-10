package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
public class LoggingOutputStream extends FilterOutputStream {
    private final LoggingByteArrayOutputStream logStream;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        this.logStream.write(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.logStream.close();
        super.close();
    }

    public final LoggingByteArrayOutputStream getLogStream() {
        return this.logStream;
    }

    public LoggingOutputStream(OutputStream outputStream, Logger logger, Level level, int i11) {
        super(outputStream);
        this.logStream = new LoggingByteArrayOutputStream(logger, level, i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.logStream.write(bArr, i11, i12);
    }
}
