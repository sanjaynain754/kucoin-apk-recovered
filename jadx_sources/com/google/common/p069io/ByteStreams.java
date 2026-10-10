package com.google.common.p069io;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        @Override // java.io.OutputStream
        public void write(int i11) {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i11, i12 + i11, bArr.length);
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e11) {
                throw new IllegalStateException(e11);
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i11) {
            try {
                return this.input.skipBytes(i11);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        public ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.p069io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) {
            try {
                this.input.readFully(bArr, i11, i12);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i11) {
            try {
                this.output.write(i11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z11) {
            try {
                this.output.writeBoolean(z11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i11) {
            try {
                this.output.writeByte(i11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i11) {
            try {
                this.output.writeChar(i11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d11) {
            try {
                this.output.writeDouble(d11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f11) {
            try {
                this.output.writeFloat(f11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i11) {
            try {
                this.output.writeInt(i11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j11) {
            try {
                this.output.writeLong(j11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i11) {
            try {
                this.output.writeShort(i11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        public ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.p069io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i11, int i12) {
            try {
                this.output.write(bArr, i11, i12);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 != -1) {
                this.left--;
            }
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j11) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.left));
            this.left -= jSkip;
            return jSkip;
        }

        public LimitedInputStream(InputStream inputStream, long j11) {
            boolean z11;
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            if (j11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "limit must be non-negative");
            this.left = j11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            long j11 = this.left;
            if (j11 == 0) {
                return -1;
            }
            int i13 = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
            if (i13 != -1) {
                this.left -= (long) i13;
            }
            return i13;
        }
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArrCreateBuffer = createBuffer();
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArrCreateBuffer);
            if (i11 == -1) {
                return j11;
            }
            outputStream.write(bArrCreateBuffer, 0, i11);
            j11 += (long) i11;
        }
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long j11) {
        return new LimitedInputStream(inputStream, j11);
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr, int i11) {
        Preconditions.checkPositionIndex(i11, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i11, bArr.length - i11));
    }

    public static ByteArrayDataOutput newDataOutput(int i11) {
        if (i11 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i11));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i11)));
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = read(inputStream, bArr, i11, i12);
        if (i13 == i12) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + i13 + " bytes; " + i12 + " bytes expected");
    }

    public static long skipUpTo(InputStream inputStream, long j11) throws IOException {
        byte[] bArr = null;
        long j12 = 0;
        while (j12 < j11) {
            long j13 = j11 - j12;
            long jSkipSafely = skipSafely(inputStream, j13);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j13, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = inputStream.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j12 += jSkipSafely;
        }
        return j12;
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i11) {
            return bArrRemove;
        }
        int length = i11 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i11);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i11 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    @CanIgnoreReturnValue
    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] bArrCreateBuffer = createBuffer();
        long j11 = 0;
        while (true) {
            long j12 = inputStream.read(bArrCreateBuffer);
            if (j12 != -1) {
                j11 += j12;
            } else {
                return j11;
            }
        }
    }

    @CanIgnoreReturnValue
    public static int read(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i12 >= 0) {
            Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
            int i13 = 0;
            while (i13 < i12) {
                int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
                if (i14 == -1) {
                    break;
                }
                i13 += i14;
            }
            return i13;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i12)));
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int i11;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] bArrCreateBuffer = createBuffer();
        do {
            i11 = inputStream.read(bArrCreateBuffer);
            if (i11 == -1) {
                break;
            }
        } while (byteProcessor.processBytes(bArrCreateBuffer, 0, i11));
        return byteProcessor.getResult();
    }

    public static void skipFully(InputStream inputStream, long j11) throws IOException {
        long jSkipUpTo = skipUpTo(inputStream, j11);
        if (jSkipUpTo >= j11) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jSkipUpTo + " bytes; " + j11 + " bytes expected");
    }

    private static long skipSafely(InputStream inputStream, long j11) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j11));
    }

    public static byte[] toByteArray(InputStream inputStream, long j11) throws IOException {
        Preconditions.checkArgument(j11 >= 0, "expectedSize (%s) must be non-negative", j11);
        if (j11 <= 2147483639) {
            int i11 = (int) j11;
            byte[] bArr = new byte[i11];
            int i12 = i11;
            while (i12 > 0) {
                int i13 = i11 - i12;
                int i14 = inputStream.read(bArr, i13, i12);
                if (i14 == -1) {
                    return Arrays.copyOf(bArr, i13);
                }
                i12 -= i14;
            }
            int i15 = inputStream.read();
            if (i15 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) i15});
            return toByteArrayInternal(inputStream, arrayDeque, i11 + 1);
        }
        throw new OutOfMemoryError(j11 + " bytes is too large to fit in a byte array");
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i11) throws IOException {
        int i12;
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i11) * 2));
        while (i11 < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - i11);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i13 = 0;
            while (i13 < iMin2) {
                int i14 = inputStream.read(bArr, i13, iMin2 - i13);
                if (i14 == -1) {
                    return combineBuffers(queue, i11);
                }
                i13 += i14;
                i11 += i14;
            }
            if (iMin < 4096) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            iMin = IntMath.saturatedMultiply(iMin, i12);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j11 = jPosition;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long jTransferTo = fileChannel.transferTo(j11, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel2);
                j11 += jTransferTo;
                fileChannel.position(j11);
                if (jTransferTo <= 0 && j11 >= fileChannel.size()) {
                    return j11 - jPosition;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                Java8Compatibility.flip(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                Java8Compatibility.clear(byteBufferWrap);
            }
            return jWrite;
        }
    }
}
