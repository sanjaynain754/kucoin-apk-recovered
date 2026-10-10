package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.squareup.picasso.n */
/* JADX INFO: compiled from: MarkableInputStream.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27830n extends InputStream {

    /* JADX INFO: renamed from: b */
    public final InputStream f56780b;

    /* JADX INFO: renamed from: c */
    public long f56781c;

    /* JADX INFO: renamed from: d */
    public long f56782d;

    /* JADX INFO: renamed from: e */
    public long f56783e;

    /* JADX INFO: renamed from: f */
    public long f56784f;

    /* JADX INFO: renamed from: g */
    public boolean f56785g;

    /* JADX INFO: renamed from: h */
    public int f56786h;

    public C27830n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f56785g) {
            long j11 = this.f56781c + 1;
            long j12 = this.f56783e;
            if (j11 > j12) {
                m68882h(j12 + ((long) this.f56786h));
            }
        }
        int i11 = this.f56780b.read();
        if (i11 != -1) {
            this.f56781c++;
        }
        return i11;
    }

    public C27830n(InputStream inputStream, int i11) {
        this(inputStream, i11, 1024);
    }

    /* JADX INFO: renamed from: a */
    public void m68879a(boolean z11) {
        this.f56785g = z11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f56780b.available();
    }

    /* JADX INFO: renamed from: b */
    public void m68880b(long j11) throws IOException {
        if (this.f56781c > this.f56783e || j11 < this.f56782d) {
            throw new IOException("Cannot reset");
        }
        this.f56780b.reset();
        m68883i(this.f56782d, j11);
        this.f56781c = j11;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56780b.close();
    }

    /* JADX INFO: renamed from: g */
    public long m68881g(int i11) {
        long j11 = this.f56781c + ((long) i11);
        if (this.f56783e < j11) {
            m68882h(j11);
        }
        return this.f56781c;
    }

    /* JADX INFO: renamed from: h */
    public final void m68882h(long j11) {
        try {
            long j12 = this.f56782d;
            long j13 = this.f56781c;
            if (j12 >= j13 || j13 > this.f56783e) {
                this.f56782d = j13;
                this.f56780b.mark((int) (j11 - j13));
            } else {
                this.f56780b.reset();
                this.f56780b.mark((int) (j11 - this.f56782d));
                m68883i(this.f56782d, this.f56781c);
            }
            this.f56783e = j11;
        } catch (IOException e11) {
            throw new IllegalStateException("Unable to mark: " + e11);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m68883i(long j11, long j12) throws IOException {
        while (j11 < j12) {
            long jSkip = this.f56780b.skip(j12 - j11);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j11 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f56780b.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        m68880b(this.f56784f);
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        if (!this.f56785g) {
            long j12 = this.f56781c;
            if (j12 + j11 > this.f56783e) {
                m68882h(j12 + j11 + ((long) this.f56786h));
            }
        }
        long jSkip = this.f56780b.skip(j11);
        this.f56781c += jSkip;
        return jSkip;
    }

    public C27830n(InputStream inputStream, int i11, int i12) {
        this.f56784f = -1L;
        this.f56785g = true;
        this.f56786h = -1;
        this.f56780b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i11);
        this.f56786h = i12;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f56784f = m68881g(i11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f56785g) {
            long j11 = this.f56781c;
            if (((long) bArr.length) + j11 > this.f56783e) {
                m68882h(j11 + ((long) bArr.length) + ((long) this.f56786h));
            }
        }
        int i11 = this.f56780b.read(bArr);
        if (i11 != -1) {
            this.f56781c += (long) i11;
        }
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f56785g) {
            long j11 = this.f56781c;
            long j12 = i12;
            if (j11 + j12 > this.f56783e) {
                m68882h(j11 + j12 + ((long) this.f56786h));
            }
        }
        int i13 = this.f56780b.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f56781c += (long) i13;
        }
        return i13;
    }
}
