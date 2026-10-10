package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBoolean(boolean z11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putByte(byte b11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr, int i11, int i12);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putChar(char c11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putDouble(double d11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putFloat(float f11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putInt(int i11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putLong(long j11);

    @CanIgnoreReturnValue
    <T> Hasher putObject(@ParametricNullness T t11, Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putShort(short s11);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putUnencodedChars(CharSequence charSequence);
}
