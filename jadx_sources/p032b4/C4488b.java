package p032b4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: compiled from: TailAppendingInputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4488b extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public final byte[] f3891b;

    /* JADX INFO: renamed from: c */
    public int f3892c;

    /* JADX INFO: renamed from: d */
    public int f3893d;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        return i11 != -1 ? i11 : m4277a();
    }

    /* JADX INFO: renamed from: a */
    public final int m4277a() {
        int i11 = this.f3892c;
        byte[] bArr = this.f3891b;
        if (i11 >= bArr.length) {
            return -1;
        }
        this.f3892c = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i11);
            this.f3893d = this.f3892c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f3892c = this.f3893d;
    }

    public C4488b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f3891b = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        if (i12 == 0) {
            return 0;
        }
        while (i14 < i12) {
            int iM4277a = m4277a();
            if (iM4277a == -1) {
                break;
            }
            bArr[i11 + i14] = (byte) iM4277a;
            i14++;
        }
        if (i14 > 0) {
            return i14;
        }
        return -1;
    }
}
