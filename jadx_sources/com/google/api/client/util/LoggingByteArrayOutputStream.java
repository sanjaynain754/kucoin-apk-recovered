package com.google.api.client.util;

import com.tencent.bugly.proguard.C33627eb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
public class LoggingByteArrayOutputStream extends ByteArrayOutputStream {
    private int bytesWritten;
    private boolean closed;
    private final Logger logger;
    private final Level loggingLevel;
    private final int maximumBytesToLog;

    private static void appendBytes(StringBuilder sb2, int i11) {
        if (i11 == 1) {
            sb2.append("1 byte");
        } else {
            sb2.append(NumberFormat.getInstance().format(i11));
            sb2.append(" bytes");
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (!this.closed) {
                if (this.bytesWritten != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Total: ");
                    appendBytes(sb2, this.bytesWritten);
                    int i11 = ((ByteArrayOutputStream) this).count;
                    if (i11 != 0 && i11 < this.bytesWritten) {
                        sb2.append(" (logging first ");
                        appendBytes(sb2, ((ByteArrayOutputStream) this).count);
                        sb2.append(")");
                    }
                    this.logger.config(sb2.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.logger.log(this.loggingLevel, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", C33627eb.f69716f));
                    }
                }
                this.closed = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized int getBytesWritten() {
        return this.bytesWritten;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i11) {
        Preconditions.checkArgument(!this.closed);
        this.bytesWritten++;
        if (((ByteArrayOutputStream) this).count < this.maximumBytesToLog) {
            super.write(i11);
        }
    }

    public final int getMaximumBytesToLog() {
        return this.maximumBytesToLog;
    }

    public LoggingByteArrayOutputStream(Logger logger, Level level, int i11) {
        boolean z11;
        this.logger = (Logger) Preconditions.checkNotNull(logger);
        this.loggingLevel = (Level) Preconditions.checkNotNull(level);
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.maximumBytesToLog = i11;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i11, int i12) {
        Preconditions.checkArgument(!this.closed);
        this.bytesWritten += i12;
        int i13 = ((ByteArrayOutputStream) this).count;
        int i14 = this.maximumBytesToLog;
        if (i13 < i14) {
            int i15 = i13 + i12;
            if (i15 > i14) {
                i12 += i14 - i15;
            }
            super.write(bArr, i11, i12);
        }
    }
}
