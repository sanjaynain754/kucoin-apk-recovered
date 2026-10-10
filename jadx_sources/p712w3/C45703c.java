package p712w3;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: w3.c */
/* JADX INFO: compiled from: CountingOutputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45703c extends FilterOutputStream {

    /* JADX INFO: renamed from: b */
    public long f103043b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.f103043b += (long) i12;
    }

    /* JADX INFO: renamed from: a */
    public long m100882a() {
        return this.f103043b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public C45703c(OutputStream outputStream) {
        super(outputStream);
        this.f103043b = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        this.f103043b++;
    }
}
