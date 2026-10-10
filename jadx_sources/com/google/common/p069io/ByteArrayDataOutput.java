package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.DataOutput;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i11);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i11, int i12);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z11);

    @Override // java.io.DataOutput
    void writeByte(int i11);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i11);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d11);

    @Override // java.io.DataOutput
    void writeFloat(float f11);

    @Override // java.io.DataOutput
    void writeInt(int i11);

    @Override // java.io.DataOutput
    void writeLong(long j11);

    @Override // java.io.DataOutput
    void writeShort(int i11);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
