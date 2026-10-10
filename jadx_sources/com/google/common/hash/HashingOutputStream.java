package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class HashingOutputStream extends FilterOutputStream {
    private final Hasher hasher;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        this.hasher.putByte((byte) i11);
        ((FilterOutputStream) this).out.write(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public HashCode hash() {
        return this.hasher.hash();
    }

    public HashingOutputStream(HashFunction hashFunction, OutputStream outputStream) {
        super((OutputStream) Preconditions.checkNotNull(outputStream));
        this.hasher = (Hasher) Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.hasher.putBytes(bArr, i11, i12);
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
    }
}
