package oh0;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import nh0.C42841b;

/* JADX INFO: renamed from: oh0.a */
/* JADX INFO: compiled from: ConstrainableInputStream.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43091a extends BufferedInputStream {

    /* JADX INFO: renamed from: b */
    public final boolean f95284b;

    /* JADX INFO: renamed from: c */
    public final int f95285c;

    /* JADX INFO: renamed from: d */
    public long f95286d;

    /* JADX INFO: renamed from: e */
    public long f95287e;

    /* JADX INFO: renamed from: f */
    public int f95288f;

    /* JADX INFO: renamed from: g */
    public boolean f95289g;

    /* JADX INFO: renamed from: b */
    public ByteBuffer m94678b(int i11) throws IOException {
        C42841b.m93952d(i11 >= 0, "maxSize must be 0 (unlimited) or larger");
        boolean z11 = i11 > 0;
        int i12 = 32768;
        if (z11 && i11 < 32768) {
            i12 = i11;
        }
        byte[] bArr = new byte[i12];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        while (true) {
            int i13 = read(bArr);
            if (i13 == -1) {
                break;
            }
            if (z11) {
                if (i13 >= i11) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                    break;
                }
                i11 -= i13;
            }
            byteArrayOutputStream.write(bArr, 0, i13);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: g */
    public static C43091a m94676g(InputStream inputStream, int i11, int i12) {
        return inputStream instanceof C43091a ? (C43091a) inputStream : new C43091a(inputStream, i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94677a() {
        return this.f95287e != 0 && System.nanoTime() - this.f95286d > this.f95287e;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        if (this.f95289g || (this.f95284b && this.f95288f <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f95289g = true;
            return -1;
        }
        if (m94677a()) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (this.f95284b && i12 > (i13 = this.f95288f)) {
            i12 = i13;
        }
        try {
            int i14 = super.read(bArr, i11, i12);
            this.f95288f -= i14;
            return i14;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    public C43091a(InputStream inputStream, int i11, int i12) {
        boolean z11;
        super(inputStream, i11);
        this.f95287e = 0L;
        if (i12 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C42841b.m93951c(z11);
        this.f95285c = i12;
        this.f95288f = i12;
        this.f95284b = i12 != 0;
        this.f95286d = System.nanoTime();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f95288f = this.f95285c - ((BufferedInputStream) this).markpos;
    }
}
