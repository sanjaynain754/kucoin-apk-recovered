package p545q1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: q1.c */
/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C43579c implements Closeable {

    /* JADX INFO: renamed from: b */
    public final InputStream f96167b;

    /* JADX INFO: renamed from: c */
    public final Charset f96168c;

    /* JADX INFO: renamed from: d */
    public byte[] f96169d;

    /* JADX INFO: renamed from: e */
    public int f96170e;

    /* JADX INFO: renamed from: f */
    public int f96171f;

    /* JADX INFO: renamed from: q1.c$a */
    /* JADX INFO: compiled from: StrictLineReader.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                i11--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, C43579c.this.f96168c.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public C43579c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C43579c(InputStream inputStream, int i11, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C43580d.f96173a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f96167b = inputStream;
        this.f96168c = charset;
        this.f96169d = new byte[i11];
    }

    /* JADX INFO: renamed from: b */
    public final void m95907b() throws IOException {
        InputStream inputStream = this.f96167b;
        byte[] bArr = this.f96169d;
        int i11 = inputStream.read(bArr, 0, bArr.length);
        if (i11 == -1) {
            throw new EOFException();
        }
        this.f96170e = 0;
        this.f96171f = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f96167b) {
            try {
                if (this.f96169d != null) {
                    this.f96169d = null;
                    this.f96167b.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m95908g() {
        return this.f96171f == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: h */
    public String m95909h() throws IOException {
        int i11;
        byte[] bArr;
        int i12;
        synchronized (this.f96167b) {
            try {
                if (this.f96169d == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f96170e >= this.f96171f) {
                    m95907b();
                }
                for (int i13 = this.f96170e; i13 != this.f96171f; i13++) {
                    byte[] bArr2 = this.f96169d;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f96170e;
                        if (i13 != i14) {
                            i12 = i13 - 1;
                            if (bArr2[i12] != 13) {
                                i12 = i13;
                            }
                        } else {
                            i12 = i13;
                        }
                        String str = new String(bArr2, i14, i12 - i14, this.f96168c.name());
                        this.f96170e = i13 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f96171f - this.f96170e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f96169d;
                    int i15 = this.f96170e;
                    aVar.write(bArr3, i15, this.f96171f - i15);
                    this.f96171f = -1;
                    m95907b();
                    i11 = this.f96170e;
                    while (i11 != this.f96171f) {
                        bArr = this.f96169d;
                        if (bArr[i11] == 10) {
                            break loop1;
                        }
                        i11++;
                    }
                }
                int i16 = this.f96170e;
                if (i11 != i16) {
                    aVar.write(bArr, i16, i11 - i16);
                }
                this.f96170e = i11 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
