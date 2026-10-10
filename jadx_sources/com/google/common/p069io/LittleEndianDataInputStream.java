package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        ByteStreams.readFully(this, bArr);
    }

    private byte readAndCheckByte() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (-1 != i11) {
            return (byte) i11;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        ByteStreams.readFully(this, bArr, i11, i12);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedByte() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 >= 0) {
            return i11;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i11) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i11);
    }

    public LittleEndianDataInputStream(InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public boolean readBoolean() throws IOException {
        if (readUnsignedByte() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readInt() throws IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        return Ints.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public long readLong() throws IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        byte andCheckByte3 = readAndCheckByte();
        byte andCheckByte4 = readAndCheckByte();
        byte andCheckByte5 = readAndCheckByte();
        byte andCheckByte6 = readAndCheckByte();
        return Longs.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte6, andCheckByte5, andCheckByte4, andCheckByte3, andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedShort() throws IOException {
        return Ints.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }
}
