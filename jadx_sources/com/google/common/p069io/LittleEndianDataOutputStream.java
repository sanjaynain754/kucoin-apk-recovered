package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i11 = 0; i11 < str.length(); i11++) {
            writeChar(str.charAt(i11));
        }
    }

    public LittleEndianDataOutputStream(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z11);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i11);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeInt(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11 & 255);
        ((FilterOutputStream) this).out.write((i11 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i11 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i11 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11 & 255);
        ((FilterOutputStream) this).out.write((i11 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i11) throws IOException {
        writeShort(i11);
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d11) throws IOException {
        writeLong(Double.doubleToLongBits(d11));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f11) throws IOException {
        writeInt(Float.floatToIntBits(f11));
    }

    @Override // java.io.DataOutput
    public void writeLong(long j11) throws IOException {
        byte[] byteArray = Longs.toByteArray(Long.reverseBytes(j11));
        write(byteArray, 0, byteArray.length);
    }
}
