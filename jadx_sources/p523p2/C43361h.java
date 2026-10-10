package p523p2;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: p2.h */
/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43361h extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public int f95758b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        this.f95758b = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m95500a(1L) == -1) {
            return -1;
        }
        int i11 = super.read();
        m95501b(1L);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f95758b = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final long m95500a(long j11) {
        int i11 = this.f95758b;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i11 = this.f95758b;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final void m95501b(long j11) {
        int i11 = this.f95758b;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f95758b = (int) (((long) i11) - j11);
    }

    public C43361h(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f95758b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jM95500a = m95500a(j11);
        if (jM95500a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM95500a);
        m95501b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int iM95500a = (int) m95500a(i12);
        if (iM95500a == -1) {
            return -1;
        }
        int i13 = super.read(bArr, i11, iM95500a);
        m95501b(i13);
        return i13;
    }
}
