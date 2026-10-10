package p523p2;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: p2.d */
/* JADX INFO: compiled from: ExceptionPassthroughInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C43357d extends InputStream {

    /* JADX INFO: renamed from: d */
    @GuardedBy("POOL")
    public static final Queue<C43357d> f95746d = C43364k.m95513f(0);

    /* JADX INFO: renamed from: b */
    public InputStream f95747b;

    /* JADX INFO: renamed from: c */
    public IOException f95748c;

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f95747b.read();
        } catch (IOException e11) {
            this.f95748c = e11;
            throw e11;
        }
    }

    public void release() {
        this.f95748c = null;
        this.f95747b = null;
        Queue<C43357d> queue = f95746d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f95747b.reset();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C43357d m95484b(@NonNull InputStream inputStream) {
        C43357d c43357dPoll;
        Queue<C43357d> queue = f95746d;
        synchronized (queue) {
            c43357dPoll = queue.poll();
        }
        if (c43357dPoll == null) {
            c43357dPoll = new C43357d();
        }
        c43357dPoll.m95486g(inputStream);
        return c43357dPoll;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public IOException m95485a() {
        return this.f95748c;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f95747b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95747b.close();
    }

    /* JADX INFO: renamed from: g */
    public void m95486g(@NonNull InputStream inputStream) {
        this.f95747b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f95747b.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f95747b.markSupported();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        try {
            return this.f95747b.skip(j11);
        } catch (IOException e11) {
            this.f95748c = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f95747b.read(bArr);
        } catch (IOException e11) {
            this.f95748c = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f95747b.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f95748c = e11;
            throw e11;
        }
    }
}
