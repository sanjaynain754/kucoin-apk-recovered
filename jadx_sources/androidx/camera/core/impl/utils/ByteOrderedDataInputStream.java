package androidx.camera.core.impl.utils;

import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes23.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    public ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.mPosition + i12;
        this.mPosition = i13;
        if (i13 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, i11, i12) != i12) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.mLength = iAvailable;
        this.mPosition = 0;
        dataInputStream.mark(iAvailable);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i11);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i11 = this.mPosition + 1;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int i12 = this.mDataInputStream.read();
        if (i12 >= 0) {
            return (byte) i12;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i11 = this.mPosition + 4;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        int i14 = this.mDataInputStream.read();
        int i15 = this.mDataInputStream.read();
        if ((i12 | i13 | i14 | i15) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i15 << 24) + (i14 << 16) + (i13 << 8) + i12;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i12 << 24) + (i13 << 16) + (i14 << 8) + i15;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i11 = this.mPosition + 8;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        int i14 = this.mDataInputStream.read();
        int i15 = this.mDataInputStream.read();
        int i16 = this.mDataInputStream.read();
        int i17 = this.mDataInputStream.read();
        int i18 = this.mDataInputStream.read();
        int i19 = this.mDataInputStream.read();
        if ((i12 | i13 | i14 | i15 | i16 | i17 | i18 | i19) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (((long) i19) << 56) + (((long) i18) << 48) + (((long) i17) << 40) + (((long) i16) << 32) + (((long) i15) << 24) + (((long) i14) << 16) + (((long) i13) << 8) + ((long) i12);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (((long) i12) << 56) + (((long) i13) << 48) + (((long) i14) << 40) + (((long) i15) << 32) + (((long) i16) << 24) + (((long) i17) << 16) + (((long) i18) << 8) + ((long) i19);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i11 = this.mPosition + 2;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        if ((i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((i13 << 8) + i12);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((i12 << 8) + i13);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i11 = this.mPosition + 2;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        if ((i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i13 << 8) + i12;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public void seek(long j11) throws IOException {
        int i11 = this.mPosition;
        if (i11 > j11) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j11 -= (long) i11;
        }
        int i12 = (int) j11;
        if (skipBytes(i12) != i12) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i11) throws IOException {
        int iMin = Math.min(i11, this.mLength - this.mPosition);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.mDataInputStream.skipBytes(iMin - iSkipBytes);
        }
        this.mPosition += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.mDataInputStream.read(bArr, i11, i12);
        this.mPosition += i13;
        return i13;
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public long readUnsignedInt() throws IOException {
        return ((long) readInt()) & KeyboardMap.kValueMask;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length <= this.mLength) {
            if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
