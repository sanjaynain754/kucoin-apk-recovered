package p819z3;

import java.io.IOException;
import java.io.InputStream;
import p006a4.InterfaceC0117h;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: z3.g */
/* JADX INFO: compiled from: PooledByteArrayBufferedInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46678g extends InputStream {

    /* JADX INFO: renamed from: b */
    public final InputStream f104509b;

    /* JADX INFO: renamed from: c */
    public final byte[] f104510c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0117h<byte[]> f104511d;

    /* JADX INFO: renamed from: e */
    public int f104512e = 0;

    /* JADX INFO: renamed from: f */
    public int f104513f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f104514g = false;

    @Override // java.io.InputStream
    public int read() throws IOException {
        C45708h.m100898i(this.f104513f <= this.f104512e);
        m102900b();
        if (!m102899a()) {
            return -1;
        }
        byte[] bArr = this.f104510c;
        int i11 = this.f104513f;
        this.f104513f = i11 + 1;
        return bArr[i11] & 255;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102899a() throws IOException {
        if (this.f104513f < this.f104512e) {
            return true;
        }
        int i11 = this.f104509b.read(this.f104510c);
        if (i11 <= 0) {
            return false;
        }
        this.f104512e = i11;
        this.f104513f = 0;
        return true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        C45708h.m100898i(this.f104513f <= this.f104512e);
        m102900b();
        return (this.f104512e - this.f104513f) + this.f104509b.available();
    }

    /* JADX INFO: renamed from: b */
    public final void m102900b() throws IOException {
        if (this.f104514g) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f104514g) {
            return;
        }
        this.f104514g = true;
        this.f104511d.release(this.f104510c);
        super.close();
    }

    public void finalize() throws Throwable {
        if (!this.f104514g) {
            C45999a.m101507m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        C45708h.m100898i(this.f104513f <= this.f104512e);
        m102900b();
        int i11 = this.f104512e;
        int i12 = this.f104513f;
        long j12 = i11 - i12;
        if (j12 >= j11) {
            this.f104513f = (int) (((long) i12) + j11);
            return j11;
        }
        this.f104513f = i11;
        return j12 + this.f104509b.skip(j11 - j12);
    }

    public C46678g(InputStream inputStream, byte[] bArr, InterfaceC0117h<byte[]> interfaceC0117h) {
        this.f104509b = (InputStream) C45708h.m100896g(inputStream);
        this.f104510c = (byte[]) C45708h.m100896g(bArr);
        this.f104511d = (InterfaceC0117h) C45708h.m100896g(interfaceC0117h);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        C45708h.m100898i(this.f104513f <= this.f104512e);
        m102900b();
        if (!m102899a()) {
            return -1;
        }
        int iMin = Math.min(this.f104512e - this.f104513f, i12);
        System.arraycopy(this.f104510c, this.f104513f, bArr, i11, iMin);
        this.f104513f += iMin;
        return iMin;
    }
}
