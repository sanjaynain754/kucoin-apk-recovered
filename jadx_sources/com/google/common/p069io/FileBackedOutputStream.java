package com.google.common.p069io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
public final class FileBackedOutputStream extends OutputStream {

    @GuardedBy("this")
    private File file;
    private final int fileThreshold;

    @GuardedBy("this")
    private MemoryOutput memory;

    @GuardedBy("this")
    private OutputStream out;
    private final boolean resetOnFinalize;
    private final ByteSource source;

    public static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public FileBackedOutputStream(int i11) {
        this(i11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream openInputStream() throws IOException {
        if (this.file != null) {
            return new FileInputStream(this.file);
        }
        Objects.requireNonNull(this.memory);
        return new ByteArrayInputStream(this.memory.getBuffer(), 0, this.memory.getCount());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.out.flush();
    }

    @VisibleForTesting
    public synchronized File getFile() {
        return this.file;
    }

    public synchronized void reset() throws IOException {
        try {
            try {
                close();
                MemoryOutput memoryOutput = this.memory;
                if (memoryOutput == null) {
                    this.memory = new MemoryOutput();
                } else {
                    memoryOutput.reset();
                }
                this.out = this.memory;
                File file = this.file;
                if (file != null) {
                    this.file = null;
                    if (!file.delete()) {
                        throw new IOException("Could not delete: " + file);
                    }
                }
            } catch (Throwable th2) {
                if (this.memory == null) {
                    this.memory = new MemoryOutput();
                } else {
                    this.memory.reset();
                }
                this.out = this.memory;
                File file2 = this.file;
                if (file2 != null) {
                    this.file = null;
                    if (!file2.delete()) {
                        throw new IOException("Could not delete: " + file2);
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i11) throws IOException {
        update(1);
        this.out.write(i11);
    }

    public FileBackedOutputStream(int i11, boolean z11) {
        Preconditions.checkArgument(i11 >= 0, "fileThreshold must be non-negative, but was %s", i11);
        this.fileThreshold = i11;
        this.resetOnFinalize = z11;
        MemoryOutput memoryOutput = new MemoryOutput();
        this.memory = memoryOutput;
        this.out = memoryOutput;
        if (z11) {
            this.source = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.1
                public void finalize() {
                    try {
                        FileBackedOutputStream.this.reset();
                    } catch (Throwable th2) {
                        th2.printStackTrace(System.err);
                    }
                }

                @Override // com.google.common.p069io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.openInputStream();
                }
            };
        } else {
            this.source = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.2
                @Override // com.google.common.p069io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.openInputStream();
                }
            };
        }
    }

    @GuardedBy("this")
    private void update(int i11) throws IOException {
        MemoryOutput memoryOutput = this.memory;
        if (memoryOutput == null || memoryOutput.getCount() + i11 <= this.fileThreshold) {
            return;
        }
        File fileCreateTempFile = TempFileCreator.INSTANCE.createTempFile("FileBackedOutputStream");
        if (this.resetOnFinalize) {
            fileCreateTempFile.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(this.memory.getBuffer(), 0, this.memory.getCount());
            fileOutputStream.flush();
            this.out = fileOutputStream;
            this.file = fileCreateTempFile;
            this.memory = null;
        } catch (IOException e11) {
            fileCreateTempFile.delete();
            throw e11;
        }
    }

    public ByteSource asByteSource() {
        return this.source;
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i11, int i12) throws IOException {
        update(i12);
        this.out.write(bArr, i11, i12);
    }
}
