package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {
    private static final long serialVersionUID = 0;
    final HashFunction[] functions;

    public abstract HashCode makeHash(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.functions.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i11 = 0; i11 < length; i11++) {
            hasherArr[i11] = this.functions[i11].newHasher();
        }
        return fromHashers(hasherArr);
    }

    private Hasher fromHashers(final Hasher[] hasherArr) {
        return new Hasher(this) { // from class: com.google.common.hash.AbstractCompositeHashFunction.1
            final /* synthetic */ AbstractCompositeHashFunction this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                return this.this$0.makeHash(hasherArr);
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBoolean(boolean z11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBoolean(z11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putByte(byte b11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putByte(b11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putChar(char c11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putChar(c11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putDouble(double d11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putDouble(d11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putFloat(float f11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putFloat(f11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putInt(int i11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putInt(i11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putLong(long j11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putLong(j11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public <T> Hasher putObject(@ParametricNullness T t11, Funnel<? super T> funnel) {
                for (Hasher hasher : hasherArr) {
                    hasher.putObject(t11, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putShort(short s11) {
                for (Hasher hasher : hasherArr) {
                    hasher.putShort(s11);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr, int i11, int i12) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr, i11, i12);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(ByteBuffer byteBuffer) {
                int iPosition = byteBuffer.position();
                for (Hasher hasher : hasherArr) {
                    Java8Compatibility.position(byteBuffer, iPosition);
                    hasher.putBytes(byteBuffer);
                }
                return this;
            }
        };
    }

    public AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.functions = hashFunctionArr;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        int length = this.functions.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i12 = 0; i12 < length; i12++) {
            hasherArr[i12] = this.functions[i12].newHasher(i11);
        }
        return fromHashers(hasherArr);
    }
}
