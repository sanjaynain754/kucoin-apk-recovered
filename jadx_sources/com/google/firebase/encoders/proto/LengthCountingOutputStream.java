package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.length++;
    }

    public long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.length += (long) i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
