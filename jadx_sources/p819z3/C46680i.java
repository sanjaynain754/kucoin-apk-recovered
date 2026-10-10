package p819z3;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import p712w3.C45708h;

/* JADX INFO: renamed from: z3.i */
/* JADX INFO: compiled from: PooledByteBufferInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46680i extends InputStream {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final PooledByteBuffer f104515b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public int f104516c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public int f104517d;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f104515b;
        int i11 = this.f104516c;
        this.f104516c = i11 + 1;
        return pooledByteBuffer.mo733e(i11) & 255;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f104515b.size() - this.f104516c;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f104517d = this.f104516c;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f104516c = this.f104517d;
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        C45708h.m100891b(Boolean.valueOf(j11 >= 0));
        int iMin = Math.min((int) j11, available());
        this.f104516c += iMin;
        return iMin;
    }

    public C46680i(PooledByteBuffer pooledByteBuffer) {
        C45708h.m100891b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f104515b = (PooledByteBuffer) C45708h.m100896g(pooledByteBuffer);
        this.f104516c = 0;
        this.f104517d = 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i12 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i12);
            this.f104515b.mo732d(this.f104516c, bArr, i11, iMin);
            this.f104516c += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i11 + "; regionLength=" + i12);
    }
}
