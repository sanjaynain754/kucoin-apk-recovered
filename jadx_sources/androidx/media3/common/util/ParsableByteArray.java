package androidx.media3.common.util;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CheckReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@CheckReturnValue
@UnstableApi
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};

    /* JADX INFO: renamed from: LF */
    private static final char[] f2889LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.m13492of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i11 = this.position;
        return (char) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i11) {
        readBytes(parsableBitArray.data, 0, i11);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public String readNullTerminatedString(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.position;
        int i13 = (i12 + i11) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i12, (i13 >= this.limit || this.data[i13] != 0) ? i11 : i11 - 1);
        this.position += i11;
        return strFromUtf8Bytes;
    }

    public String readString(int i11) {
        return readString(i11, StandardCharsets.UTF_8);
    }

    public void reset(int i11) {
        reset(capacity() < i11 ? new byte[i11] : this.data, i11);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int findNextLineTerminator(Charset charset) {
        int i11;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i11 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.position;
        while (true) {
            int i13 = this.limit;
            if (i12 >= i13 - (i11 - 1)) {
                return i13;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !Util.isLinebreak(this.data[i12])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.data;
                    if (bArr2[i12] != 0 || !Util.isLinebreak(bArr2[i12 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.data;
                            if (bArr[i12 + 1] != 0 || !Util.isLinebreak(bArr[i12])) {
                            }
                        }
                        i12 += i11;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.data;
                        if (bArr[i12 + 1] != 0) {
                            continue;
                        }
                    }
                    i12 += i11;
                }
            }
            return i12;
        }
    }

    private int peekCharacterAndSize(Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i11 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && bytesLeft() >= 1) {
            bCheckedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i12 = this.position;
                cFromBytes = Chars.fromBytes(bArr[i12], bArr[i12 + 1]);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i13 = this.position;
                cFromBytes = Chars.fromBytes(bArr2[i13 + 1], bArr2[i13]);
            }
            bCheckedCast = (byte) cFromBytes;
            i11 = 2;
        }
        return (Chars.checkedCast(bCheckedCast) << 16) + i11;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, f2889LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.position = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.position = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = ((bArr[i11] & 255) << 24) >> 8;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.position = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.position = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return ((bArr[i14] & 255) << 16) | i15;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        int i15 = i11 + 4;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i11 + 5;
        this.position = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 32);
        int i17 = i11 + 6;
        this.position = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i11 + 7;
        this.position = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 48);
        this.position = i11 + 8;
        return ((((long) bArr[i18]) & 255) << 56) | j17;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        this.position = i11 + 2;
        return (short) (((bArr[i12] & 255) << 8) | i13);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        long j11 = ((long) bArr[i11]) & 255;
        int i13 = i11 + 2;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        int i14 = i11 + 3;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        this.position = i11 + 4;
        return ((((long) bArr[i14]) & 255) << 24) | j13;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return ((bArr[i14] & 255) << 16) | i15;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        this.position = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        long j11 = (((long) bArr[i11]) & 255) << 56;
        int i13 = i11 + 2;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 48);
        int i14 = i11 + 3;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i11 + 4;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i11 + 5;
        this.position = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i11 + 6;
        this.position = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i11 + 7;
        this.position = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 8);
        this.position = i11 + 8;
        return (((long) bArr[i18]) & 255) | j17;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public String readString(int i11, Charset charset) {
        String str = new String(this.data, this.position, i11, charset);
        this.position += i11;
        return str;
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        return bArr[i11] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.position = i11 + 4;
        return i14;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        long j11 = (((long) bArr[i11]) & 255) << 24;
        int i13 = i11 + 2;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i11 + 3;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 8);
        this.position = i11 + 4;
        return (((long) bArr[i14]) & 255) | j13;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public long readUnsignedLeb128ToLong() {
        long j11 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j11 |= (127 & unsignedByte) << (i11 * 7);
            if ((unsignedByte & 128) == 0) {
                return j11;
            }
        }
        return j11;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public long readUtf8EncodedLong() {
        int i11;
        int i12;
        long j11 = this.data[this.position];
        int i13 = 7;
        while (true) {
            if (i13 >= 0) {
                int i14 = 1 << i13;
                if ((((long) i14) & j11) == 0) {
                    if (i13 < 6) {
                        j11 &= (long) (i14 - 1);
                        i12 = 7 - i13;
                        break;
                    }
                    if (i13 == 7) {
                        i12 = 1;
                        break;
                    }
                } else {
                    i13--;
                }
            }
            i12 = 0;
            break;
        }
        if (i12 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j11);
        }
        for (i11 = 1; i11 < i12; i11++) {
            byte b11 = this.data[this.position + i11];
            if ((b11 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j11);
            }
            j11 = (j11 << 6) | ((long) (b11 & 63));
        }
        this.position += i12;
        return j11;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setLimit(int i11) {
        Assertions.checkArgument(i11 >= 0 && i11 <= this.data.length);
        this.limit = i11;
    }

    public void setPosition(int i11) {
        Assertions.checkArgument(i11 >= 0 && i11 <= this.limit);
        this.position = i11;
    }

    public void skipBytes(int i11) {
        setPosition(this.position + i11);
    }

    public ParsableByteArray(int i11) {
        this.data = new byte[i11];
        this.limit = i11;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize != 0) {
            char c11 = (char) (iPeekCharacterAndSize >> 16);
            if (Chars.contains(cArr, c11)) {
                this.position += iPeekCharacterAndSize & 65535;
                return c11;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    public void ensureCapacity(int i11) {
        if (i11 > capacity()) {
            this.data = Arrays.copyOf(this.data, i11);
        }
    }

    public void readBytes(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.data, this.position, bArr, i11, i12);
        this.position += i12;
    }

    @Nullable
    public String readDelimiterTerminatedString(char c11) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i11 = this.position;
        while (i11 < this.limit && this.data[i11] != c11) {
            i11++;
        }
        byte[] bArr = this.data;
        int i12 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i12, i11 - i12);
        this.position = i11;
        if (i11 < this.limit) {
            this.position = i11 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int i11 = readInt();
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalStateException("Top bit not zero: " + i11);
    }

    public int readUnsignedLeb128ToInt() {
        return Ints.checkedCast(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLongToLong() {
        long j11 = readLong();
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalStateException("Top bit not zero: " + j11);
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i11 = this.position;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.position = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() >= 2) {
            byte[] bArr2 = this.data;
            int i12 = this.position;
            byte b11 = bArr2[i12];
            if (b11 == -2 && bArr2[i12 + 1] == -1) {
                this.position = i12 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b11 == -1 && bArr2[i12 + 1] == -2) {
                this.position = i12 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public void reset(byte[] bArr, int i11) {
        this.data = bArr;
        this.limit = i11;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i11) {
        byteBuffer.put(this.data, this.position, i11);
        this.position += i11;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i11) {
        this.data = bArr;
        this.limit = i11;
    }
}
