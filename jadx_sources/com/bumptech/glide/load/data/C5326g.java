package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.g */
/* JADX INFO: compiled from: ExifOrientationStream.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5326g extends FilterInputStream {

    /* JADX INFO: renamed from: d */
    public static final byte[] f6756d;

    /* JADX INFO: renamed from: e */
    public static final int f6757e;

    /* JADX INFO: renamed from: f */
    public static final int f6758f;

    /* JADX INFO: renamed from: b */
    public final byte f6759b;

    /* JADX INFO: renamed from: c */
    public int f6760c;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11;
        int i12;
        int i13 = this.f6760c;
        if (i13 < 2 || i13 > (i12 = f6758f)) {
            i11 = super.read();
        } else {
            i11 = i13 == i12 ? this.f6759b : f6756d[i13 - 2] & 255;
        }
        if (i11 != -1) {
            this.f6760c++;
        }
        return i11;
    }

    static {
        byte[] bArr = {-1, -31, 0, 28, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, 0, 0, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MirrorPadOptions, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f6756d = bArr;
        int length = bArr.length;
        f6757e = length;
        f6758f = length + 2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public C5326g(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 >= -1 && i11 <= 8) {
            this.f6759b = (byte) i11;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = super.skip(j11);
        if (jSkip > 0) {
            this.f6760c = (int) (((long) this.f6760c) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f6760c;
        int i15 = f6758f;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f6759b;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int iMin = Math.min(i15 - i14, i12);
            System.arraycopy(f6756d, this.f6760c - 2, bArr, i11, iMin);
            i13 = iMin;
        }
        if (i13 > 0) {
            this.f6760c += i13;
        }
        return i13;
    }
}
