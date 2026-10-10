package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final ImmutableSupplier<? extends Checksum> checksumSupplier;
    private final String toString;

    public final class ChecksumHasher extends AbstractByteHasher {
        private final Checksum checksum;

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b11) {
            this.checksum.update(b11);
        }

        private ChecksumHasher(Checksum checksum) {
            this.checksum = (Checksum) Preconditions.checkNotNull(checksum);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.checksum.getValue();
            return ChecksumHashFunction.this.bits == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i11, int i12) {
            this.checksum.update(bArr, i11, i12);
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new ChecksumHasher(this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }

    public ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i11, String str) {
        boolean z11;
        this.checksumSupplier = (ImmutableSupplier) Preconditions.checkNotNull(immutableSupplier);
        if (i11 != 32 && i11 != 64) {
            z11 = false;
        } else {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "bits (%s) must be either 32 or 64", i11);
        this.bits = i11;
        this.toString = (String) Preconditions.checkNotNull(str);
    }
}
