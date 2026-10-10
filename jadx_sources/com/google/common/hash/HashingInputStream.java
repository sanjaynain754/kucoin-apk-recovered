package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class HashingInputStream extends FilterInputStream {
    private final Hasher hasher;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.hasher.putByte((byte) i11);
        }
        return i11;
    }

    public HashCode hash() {
        return this.hasher.hash();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    public HashingInputStream(HashFunction hashFunction, InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
        this.hasher = (Hasher) Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            this.hasher.putBytes(bArr, i11, i13);
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
    }
}
