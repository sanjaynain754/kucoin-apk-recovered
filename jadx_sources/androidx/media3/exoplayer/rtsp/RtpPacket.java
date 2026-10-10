package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = new byte[0];
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    public static final class Builder {
        private boolean marker;
        private boolean padding;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;
        private byte[] csrc = RtpPacket.EMPTY;
        private byte[] payloadData = RtpPacket.EMPTY;

        public RtpPacket build() {
            return new RtpPacket(this);
        }

        @CanIgnoreReturnValue
        public Builder setMarker(boolean z11) {
            this.marker = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPadding(boolean z11) {
            this.padding = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPayloadType(byte b11) {
            this.payloadType = b11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSsrc(int i11) {
            this.ssrc = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTimestamp(long j11) {
            this.timestamp = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCsrc(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.csrc = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPayloadData(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.payloadData = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSequenceNumber(int i11) {
            boolean z11;
            if (i11 >= 0 && i11 <= 65535) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkArgument(z11);
            this.sequenceNumber = i11 & 65535;
            return this;
        }
    }

    @Nullable
    public static RtpPacket parse(ParsableByteArray parsableByteArray) {
        byte[] bArr;
        if (parsableByteArray.bytesLeft() < 12) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        byte b11 = (byte) (unsignedByte >> 6);
        boolean z11 = ((unsignedByte >> 5) & 1) == 1;
        byte b12 = (byte) (unsignedByte & 15);
        boolean z12 = ((unsignedByte >> 4) & 1) == 1;
        if (b11 != 2) {
            return null;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        boolean z13 = ((unsignedByte2 >> 7) & 1) == 1;
        byte b13 = (byte) (unsignedByte2 & 127);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i11 = parsableByteArray.readInt();
        if (b12 > 0) {
            bArr = new byte[b12 * 4];
            for (int i12 = 0; i12 < b12; i12++) {
                parsableByteArray.readBytes(bArr, i12 * 4, 4);
            }
        } else {
            bArr = EMPTY;
        }
        if (z12) {
            parsableByteArray.skipBytes(2);
            short s11 = parsableByteArray.readShort();
            if (s11 != 0) {
                parsableByteArray.skipBytes(s11 * 4);
            }
        }
        byte[] bArr2 = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr2, 0, parsableByteArray.bytesLeft());
        return new Builder().setPadding(z11).setMarker(z13).setPayloadType(b13).setSequenceNumber(unsignedShort).setTimestamp(unsignedInt).setSsrc(i11).setCsrc(bArr).setPayloadData(bArr2).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RtpPacket.class == obj.getClass()) {
            RtpPacket rtpPacket = (RtpPacket) obj;
            if (this.payloadType == rtpPacket.payloadType && this.sequenceNumber == rtpPacket.sequenceNumber && this.marker == rtpPacket.marker && this.timestamp == rtpPacket.timestamp && this.ssrc == rtpPacket.ssrc) {
                return true;
            }
        }
        return false;
    }

    private RtpPacket(Builder builder) {
        this.version = (byte) 2;
        this.padding = builder.padding;
        this.extension = false;
        this.marker = builder.marker;
        this.payloadType = builder.payloadType;
        this.sequenceNumber = builder.sequenceNumber;
        this.timestamp = builder.timestamp;
        this.ssrc = builder.ssrc;
        byte[] bArr = builder.csrc;
        this.csrc = bArr;
        this.csrcCount = (byte) (bArr.length / 4);
        this.payloadData = builder.payloadData;
    }

    public static int getNextSequenceNumber(int i11) {
        return IntMath.mod(i11 + 1, 65536);
    }

    public static int getPreviousSequenceNumber(int i11) {
        return IntMath.mod(i11 - 1, 65536);
    }

    public int hashCode() {
        int i11 = (((((527 + this.payloadType) * 31) + this.sequenceNumber) * 31) + (this.marker ? 1 : 0)) * 31;
        long j11 = this.timestamp;
        return ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.ssrc;
    }

    public String toString() {
        return Util.formatInvariant("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.payloadType), Integer.valueOf(this.sequenceNumber), Long.valueOf(this.timestamp), Integer.valueOf(this.ssrc), Boolean.valueOf(this.marker));
    }

    public int writeToBuffer(byte[] bArr, int i11, int i12) {
        int length = (this.csrcCount * 4) + 12 + this.payloadData.length;
        if (i12 < length || bArr.length - i11 < length) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i11, i12);
        byte b11 = (byte) (((this.padding ? 1 : 0) << 5) | 128 | ((this.extension ? 1 : 0) << 4) | (this.csrcCount & 15));
        byteBufferWrap.put(b11).put((byte) (((this.marker ? 1 : 0) << 7) | (this.payloadType & 127))).putShort((short) this.sequenceNumber).putInt((int) this.timestamp).putInt(this.ssrc).put(this.csrc).put(this.payloadData);
        return length;
    }

    @Nullable
    public static RtpPacket parse(byte[] bArr, int i11) {
        return parse(new ParsableByteArray(bArr, i11));
    }
}
