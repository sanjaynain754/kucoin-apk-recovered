package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
public class LoggingInputStream extends FilterInputStream {
    private final LoggingByteArrayOutputStream logStream;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = super.read();
        this.logStream.write(i11);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.logStream.close();
        super.close();
    }

    public final LoggingByteArrayOutputStream getLogStream() {
        return this.logStream;
    }

    public LoggingInputStream(InputStream inputStream, Logger logger, Level level, int i11) {
        super(inputStream);
        this.logStream = new LoggingByteArrayOutputStream(logger, level, i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        if (i13 > 0) {
            this.logStream.write(bArr, i11, i13);
        }
        return i13;
    }
}
