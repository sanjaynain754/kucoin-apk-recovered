package p852kotlin.p407io.encoding;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes61.dex */
@ExperimentalEncodingApi
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m90084d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "isClosed", "", "isEOF", "singleByteBuffer", "", "symbolBuffer", "byteBuffer", "byteBufferStartIndex", "", "byteBufferEndIndex", "byteBufferLength", "getByteBufferLength", "()I", "read", FirebaseAnalytics.Param.DESTINATION, TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "close", "", "decodeSymbolBufferInto", "dst", "dstOffset", "dstEndIndex", "symbolBufferLength", "copyByteBufferInto", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "handlePaddingSymbol", "readNextSymbol", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class DecodeInputStream extends InputStream {

    @NotNull
    private final Base64 base64;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;

    @NotNull
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;

    @NotNull
    private final byte[] singleByteBuffer;

    @NotNull
    private final byte[] symbolBuffer;

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i11 = this.byteBufferStartIndex;
        if (i11 < this.byteBufferEndIndex) {
            int i12 = this.byteBuffer[i11] & 255;
            this.byteBufferStartIndex = i11 + 1;
            resetByteBufferIfEmpty();
            return i12;
        }
        int i13 = read(this.singleByteBuffer, 0, 1);
        if (i13 == -1) {
            return -1;
        }
        if (i13 == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        byte[] bArr = this.byteBuffer;
        int i11 = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr, dst, dstOffset, i11, i11 + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        int i11 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i11 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i11, 0, symbolBufferLength);
        int iMin = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int symbolBufferLength) throws IOException {
        this.symbolBuffer[symbolBufferLength] = 61;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) nextSymbol;
        }
        return symbolBufferLength + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i11;
        if (!this.base64.getIsMimeScheme()) {
            return this.input.read();
        }
        do {
            i11 = this.input.read();
            if (i11 == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(i11));
        return i11;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i11 = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i11) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i11);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int offset, int length) throws IOException {
        int i11;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset >= 0 && length >= 0 && (i11 = offset + length) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (length == 0) {
                    return 0;
                }
                if (getByteBufferLength() >= length) {
                    copyByteBufferInto(destination, offset, length);
                    return length;
                }
                int byteBufferLength = (((length - getByteBufferLength()) + 2) / 3) * 4;
                int iDecodeSymbolBufferInto = offset;
                while (true) {
                    z11 = this.isEOF;
                    if (z11 || byteBufferLength <= 0) {
                        break;
                    }
                    int iMin = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int iHandlePaddingSymbol = 0;
                    while (true) {
                        z12 = this.isEOF;
                        if (z12 || iHandlePaddingSymbol >= iMin) {
                            break;
                        }
                        int nextSymbol = readNextSymbol();
                        if (nextSymbol == -1) {
                            this.isEOF = true;
                        } else if (nextSymbol != 61) {
                            this.symbolBuffer[iHandlePaddingSymbol] = (byte) nextSymbol;
                            iHandlePaddingSymbol++;
                        } else {
                            iHandlePaddingSymbol = handlePaddingSymbol(iHandlePaddingSymbol);
                            this.isEOF = true;
                        }
                    }
                    if (!z12 && iHandlePaddingSymbol != iMin) {
                        throw new IllegalStateException("Check failed.");
                    }
                    byteBufferLength -= iHandlePaddingSymbol;
                    iDecodeSymbolBufferInto += decodeSymbolBufferInto(destination, iDecodeSymbolBufferInto, i11, iHandlePaddingSymbol);
                }
                if (iDecodeSymbolBufferInto == offset && z11) {
                    return -1;
                }
                return iDecodeSymbolBufferInto - offset;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
    }
}
