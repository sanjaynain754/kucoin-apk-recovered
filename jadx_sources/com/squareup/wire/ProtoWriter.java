package com.squareup.wire;

import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes59.dex */
public final class ProtoWriter {
    private final BufferedSink sink;

    public static long decodeZigZag64(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static long encodeZigZag64(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static int decodeZigZag32(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static int encodeZigZag32(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static int int32Size(int i11) {
        if (i11 >= 0) {
            return varint32Size(i11);
        }
        return 10;
    }

    private static int makeTag(int i11, FieldEncoding fieldEncoding) {
        return (i11 << 3) | fieldEncoding.value;
    }

    public static int tagSize(int i11) {
        return varint32Size(makeTag(i11, FieldEncoding.VARINT));
    }

    public static int varint32Size(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int varint64Size(long j11) {
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (((-16384) & j11) == 0) {
            return 2;
        }
        if (((-2097152) & j11) == 0) {
            return 3;
        }
        if (((-268435456) & j11) == 0) {
            return 4;
        }
        if (((-34359738368L) & j11) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j11) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j11) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j11) == 0) {
            return 8;
        }
        return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void writeBytes(ByteString byteString) throws IOException {
        this.sink.write(byteString);
    }

    public void writeFixed32(int i11) throws IOException {
        this.sink.writeIntLe(i11);
    }

    public void writeFixed64(long j11) throws IOException {
        this.sink.writeLongLe(j11);
    }

    public void writeSignedVarint32(int i11) throws IOException {
        if (i11 >= 0) {
            writeVarint32(i11);
        } else {
            writeVarint64(i11);
        }
    }

    public void writeString(String str) throws IOException {
        this.sink.writeUtf8(str);
    }

    public void writeVarint32(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.sink.writeByte((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.sink.writeByte(i11);
    }

    public void writeVarint64(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.sink.writeByte((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.sink.writeByte((int) j11);
    }

    public ProtoWriter(BufferedSink bufferedSink) {
        this.sink = bufferedSink;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public static int utf8Length(String str) {
        int i11;
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                i13++;
            } else if (cCharAt < 2048) {
                i13 += 2;
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319 || (i11 = i12 + 1) >= length || str.charAt(i11) < 56320 || str.charAt(i11) > 57343) {
                    i13++;
                } else {
                    i13 += 4;
                    i12 = i11;
                }
            } else {
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public void writeTag(int i11, FieldEncoding fieldEncoding) throws IOException {
        writeVarint32(makeTag(i11, fieldEncoding));
    }
}
