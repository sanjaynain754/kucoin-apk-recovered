package p032b4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: compiled from: LimitedInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4487a extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public int f3889b;

    /* JADX INFO: renamed from: c */
    public int f3890c;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f3889b == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f3889b--;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f3889b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i11);
            this.f3890c = this.f3889b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f3890c == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f3889b = this.f3890c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f3889b));
        this.f3889b = (int) (((long) this.f3889b) - jSkip);
        return jSkip;
    }

    public C4487a(InputStream inputStream, int i11) {
        super(inputStream);
        inputStream.getClass();
        if (i11 >= 0) {
            this.f3889b = i11;
            this.f3890c = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f3889b;
        if (i13 == 0) {
            return -1;
        }
        int i14 = ((FilterInputStream) this).in.read(bArr, i11, Math.min(i12, i13));
        if (i14 > 0) {
            this.f3889b -= i14;
        }
        return i14;
    }
}
