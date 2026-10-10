package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes59.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private int recursionDepth;
    private final BufferedSource source;
    private long pos = 0;
    private long limit = Long.MAX_VALUE;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;

    private void afterPackableScalar(int i11) throws IOException {
        if (this.state == i11) {
            this.state = 6;
            return;
        }
        long j11 = this.pos;
        long j12 = this.limit;
        if (j11 > j12) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j11 != j12) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j11 = this.limit - this.pos;
        this.source.require(j11);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j11;
    }

    private int internalReadVarint32() throws IOException {
        int i11;
        this.source.require(1L);
        this.pos++;
        byte b11 = this.source.readByte();
        if (b11 >= 0) {
            return b11;
        }
        int i12 = b11 & 127;
        this.source.require(1L);
        this.pos++;
        byte b12 = this.source.readByte();
        if (b12 >= 0) {
            i11 = b12 << 7;
        } else {
            i12 |= (b12 & 127) << 7;
            this.source.require(1L);
            this.pos++;
            byte b13 = this.source.readByte();
            if (b13 >= 0) {
                i11 = b13 << 14;
            } else {
                i12 |= (b13 & 127) << 14;
                this.source.require(1L);
                this.pos++;
                byte b14 = this.source.readByte();
                if (b14 < 0) {
                    int i13 = i12 | ((b14 & 127) << 21);
                    this.source.require(1L);
                    this.pos++;
                    byte b15 = this.source.readByte();
                    int i14 = i13 | (b15 << 28);
                    if (b15 < 0) {
                        for (int i15 = 0; i15 < 5; i15++) {
                            this.source.require(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i14;
                }
                i11 = b14 << 21;
            }
        }
        return i12 | i11;
    }

    private void skipGroup(int i11) throws IOException {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i12 = iInternalReadVarint32 >> 3;
            int i13 = iInternalReadVarint32 & 7;
            if (i13 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i13 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i13 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else if (i13 == 3) {
                skipGroup(i12);
            } else if (i13 == 4) {
                if (i12 != i11) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i13 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i13);
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i11 = this.recursionDepth + 1;
        this.recursionDepth = i11;
        if (i11 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j11 = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j11;
    }

    public void endMessage(long j11) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i11 = this.recursionDepth - 1;
        this.recursionDepth = i11;
        if (i11 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i11 == 0) {
            this.limit = j11;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public int nextTag() throws IOException {
        int i11 = this.state;
        if (i11 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i11 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i12 = iInternalReadVarint32 >> 3;
            this.tag = i12;
            int i13 = iInternalReadVarint32 & 7;
            if (i13 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i12;
            }
            if (i13 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i12;
            }
            if (i13 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int iInternalReadVarint33 = internalReadVarint32();
                if (iInternalReadVarint33 < 0) {
                    throw new ProtocolException("Negative length: " + iInternalReadVarint33);
                }
                if (this.pushedLimit != -1) {
                    throw new IllegalStateException();
                }
                long j11 = this.limit;
                this.pushedLimit = j11;
                long j12 = this.pos + ((long) iInternalReadVarint33);
                this.limit = j12;
                if (j12 <= j11) {
                    return this.tag;
                }
                throw new EOFException();
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i13 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i12;
                }
                throw new ProtocolException("Unexpected field encoding: " + i13);
            }
            skipGroup(i12);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public int readFixed32() throws IOException {
        int i11 = this.state;
        if (i11 != 5 && i11 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(4L);
        this.pos += 4;
        int intLe = this.source.readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    public long readFixed64() throws IOException {
        int i11 = this.state;
        if (i11 != 1 && i11 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(8L);
        this.pos += 8;
        long longLe = this.source.readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    public int readVarint32() throws IOException {
        int i11 = this.state;
        if (i11 == 0 || i11 == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public long readVarint64() throws IOException {
        int i11 = this.state;
        if (i11 != 0 && i11 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j11 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            this.source.require(1L);
            this.pos++;
            byte b11 = this.source.readByte();
            j11 |= ((long) (b11 & 127)) << i12;
            if ((b11 & 128) == 0) {
                afterPackableScalar(0);
                return j11;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i11 = this.state;
        if (i11 == 0) {
            readVarint64();
            return;
        }
        if (i11 == 1) {
            readFixed64();
            return;
        }
        if (i11 == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i11 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }

    public ProtoReader(BufferedSource bufferedSource) {
        this.source = bufferedSource;
    }

    public ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readByteString(jBeforeLengthDelimitedScalar);
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readUtf8(jBeforeLengthDelimitedScalar);
    }
}
