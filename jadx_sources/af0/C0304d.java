package af0;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: af0.d */
/* JADX INFO: compiled from: ProgressOutputStream.java */
/* JADX INFO: loaded from: classes60.dex */
public class C0304d extends OutputStream {

    /* JADX INFO: renamed from: b */
    public final OutputStream f804b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0301a f805c;

    /* JADX INFO: renamed from: d */
    public long f806d;

    /* JADX INFO: renamed from: e */
    public long f807e;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f804b.write(bArr, i11, i12);
        long j11 = this.f806d;
        if (j11 < 0) {
            this.f805c.mo1049a(-1L, -1L, -1.0f);
            return;
        }
        if (i12 < bArr.length) {
            this.f807e += (long) i12;
        } else {
            this.f807e += (long) bArr.length;
        }
        InterfaceC0301a interfaceC0301a = this.f805c;
        long j12 = this.f807e;
        interfaceC0301a.mo1049a(j12, j11, (j12 * 1.0f) / j11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f804b;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f804b;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public C0304d(OutputStream outputStream, InterfaceC0301a interfaceC0301a, long j11) {
        this.f804b = outputStream;
        this.f805c = interfaceC0301a;
        this.f806d = j11;
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        this.f804b.write(i11);
        long j11 = this.f806d;
        if (j11 < 0) {
            this.f805c.mo1049a(-1L, -1L, -1.0f);
            return;
        }
        long j12 = 1 + this.f807e;
        this.f807e = j12;
        this.f805c.mo1049a(j12, j11, (j12 * 1.0f) / j11);
    }
}
