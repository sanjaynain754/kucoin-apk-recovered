package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class ReaderInputStream extends InputStream {
    private ByteBuffer byteBuffer;
    private CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final CharsetEncoder encoder;
    private boolean endOfInput;
    private final Reader reader;
    private final byte[] singleByte;

    /* JADX WARN: Illegal instructions before constructor call */
    public ReaderInputStream(Reader reader, Charset charset, int i11) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), i11);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.singleByte) == 1) {
            return UnsignedBytes.toInt(this.singleByte[0]);
        }
        return -1;
    }

    private int drain(byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, this.byteBuffer.remaining());
        this.byteBuffer.get(bArr, i11, iMin);
        return iMin;
    }

    private void readMoreChars() throws IOException {
        if (availableCapacity(this.charBuffer) == 0) {
            if (this.charBuffer.position() > 0) {
                Java8Compatibility.flip(this.charBuffer.compact());
            } else {
                this.charBuffer = grow(this.charBuffer);
            }
        }
        int iLimit = this.charBuffer.limit();
        int i11 = this.reader.read(this.charBuffer.array(), iLimit, availableCapacity(this.charBuffer));
        if (i11 == -1) {
            this.endOfInput = true;
        } else {
            Java8Compatibility.limit(this.charBuffer, iLimit + i11);
        }
    }

    private void startDraining(boolean z11) {
        Java8Compatibility.flip(this.byteBuffer);
        if (z11 && this.byteBuffer.remaining() == 0) {
            this.byteBuffer = ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
        } else {
            this.draining = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        CoderResult coderResultFlush;
        Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
        if (i12 == 0) {
            return 0;
        }
        boolean z11 = this.endOfInput;
        int iDrain = 0;
        while (true) {
            if (this.draining) {
                iDrain += drain(bArr, i11 + iDrain, i12 - iDrain);
                if (iDrain == i12 || this.doneFlushing) {
                    break;
                }
                this.draining = false;
                Java8Compatibility.clear(this.byteBuffer);
            }
            while (true) {
                if (this.doneFlushing) {
                    coderResultFlush = CoderResult.UNDERFLOW;
                } else {
                    coderResultFlush = z11 ? this.encoder.flush(this.byteBuffer) : this.encoder.encode(this.charBuffer, this.byteBuffer, this.endOfInput);
                }
                if (coderResultFlush.isOverflow()) {
                    startDraining(true);
                    break;
                }
                if (coderResultFlush.isUnderflow()) {
                    if (z11) {
                        this.doneFlushing = true;
                        startDraining(false);
                        break;
                    }
                    if (this.endOfInput) {
                        z11 = true;
                    } else {
                        readMoreChars();
                    }
                } else if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                    return 0;
                }
            }
        }
        if (iDrain > 0) {
            return iDrain;
        }
        return -1;
    }

    private static int availableCapacity(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private static CharBuffer grow(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        Java8Compatibility.position(charBufferWrap, charBuffer.position());
        Java8Compatibility.limit(charBufferWrap, charBuffer.limit());
        return charBufferWrap;
    }

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i11) {
        this.singleByte = new byte[1];
        this.reader = (Reader) Preconditions.checkNotNull(reader);
        this.encoder = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i11 > 0, "bufferSize must be positive: %s", i11);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i11);
        this.charBuffer = charBufferAllocate;
        Java8Compatibility.flip(charBufferAllocate);
        this.byteBuffer = ByteBuffer.allocate(i11);
    }
}
