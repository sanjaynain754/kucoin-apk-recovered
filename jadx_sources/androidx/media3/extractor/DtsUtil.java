package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.material.internal.ViewUtils;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, C33556b3.f69051i, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i11, int i12, int i13, long j11, int i14) {
            this.mimeType = str;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.frameDurationUs = j11;
            this.bitrate = i14;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] bArr) {
        int i11;
        byte b11;
        int i12;
        int i13;
        byte b12;
        boolean z11 = false;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i13 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b12 = bArr[9];
            } else if (b13 != 31) {
                i11 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[7];
            } else {
                i13 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b12 = bArr[8];
            }
            i12 = (((b12 & BuiltinOptions.LogicalOrOptions) >> 2) | i13) + 1;
            z11 = true;
            if (z11) {
                return (i12 * 16) / 14;
            }
            return i12;
        }
        i11 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b11 = bArr[6];
        i12 = (((b11 & 240) >> 4) | i11) + 1;
        if (z11) {
            return (i12 * 16) / 14;
        }
        return i12;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b11 = bArr[0];
        if (b11 == 127 || b11 == 100 || b11 == 64 || b11 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i11 = 0; i11 < bArrCopyOf.length - 1; i11 += 2) {
                byte b12 = bArrCopyOf[i11];
                int i12 = i11 + 1;
                bArrCopyOf[i11] = bArrCopyOf[i12];
                bArrCopyOf[i12] = b12;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b11 = bArr[0];
        return b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b11 = bArr[5];
            } else {
                i11 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            i12 = b12 & BuiltinOptions.LogicalOrOptions;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b11 = bArr[4];
        i12 = b11 & C33556b3.f69091s;
        return (((i12 >> 2) | i11) + 1) * 32;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z11) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 3 && parsableBitArray.readBit(); i13++) {
            i12++;
        }
        if (z11) {
            int i14 = 0;
            while (i11 < i12) {
                i14 += 1 << iArr[i11];
                i11++;
            }
            i11 = i14;
        }
        return i11 + parsableBitArray.readBits(iArr[i12]);
    }

    private static void checkCrc(byte[] bArr, int i11) throws ParserException {
        int i12 = i11 - 2;
        if (((bArr[i11 - 1] & 255) | ((bArr[i12] << 8) & 65535)) != Util.crc16(bArr, 0, i12, 65535)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    private DtsUtil() {
    }

    public static int getFrameType(int i11) {
        if (i11 != SYNC_VALUE_BE && i11 != SYNC_VALUE_LE && i11 != SYNC_VALUE_14B_BE && i11 != SYNC_VALUE_14B_LE) {
            if (i11 != SYNC_VALUE_EXTSS_BE && i11 != SYNC_VALUE_EXTSS_LE) {
                if (i11 != SYNC_VALUE_UHD_FTOC_SYNC_BE && i11 != SYNC_VALUE_UHD_FTOC_SYNC_LE) {
                    if (i11 != SYNC_VALUE_UHD_FTOC_NONSYNC_BE && i11 != SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static Format parseDtsFormat(byte[] bArr, @Nullable String str, @Nullable String str2, int i11, @Nullable DrmInitData drmInitData) {
        int i12;
        int i13;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i14 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i15 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        if (bits >= iArr.length) {
            i12 = -1;
        } else {
            i12 = (iArr[bits] * 1000) / 2;
        }
        normalizedFrame.skipBits(10);
        if (normalizedFrame.readBits(2) > 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i12).setChannelCount(i14 + i13).setSampleRate(i15).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i11).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        int i11;
        int i12;
        int bits;
        int i13;
        long jScaleLargeTimestamp;
        int i14;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits2 = normalizedFrame.readBits(2);
        if (!normalizedFrame.readBit()) {
            i11 = 16;
            i12 = 8;
        } else {
            i11 = 20;
            i12 = 12;
        }
        normalizedFrame.skipBits(i12);
        int bits3 = normalizedFrame.readBits(i11) + 1;
        boolean bit = normalizedFrame.readBit();
        int bits4 = -1;
        int i15 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 == 1 && bits7 == 1) {
                int i16 = bits2 + 1;
                int bits8 = normalizedFrame.readBits(i16);
                for (int i17 = 0; i17 < i16; i17++) {
                    if (((bits8 >> i17) & 1) == 1) {
                        normalizedFrame.skipBits(8);
                    }
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(2);
                    int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                    int bits10 = normalizedFrame.readBits(2) + 1;
                    while (i15 < bits10) {
                        normalizedFrame.skipBits(bits9);
                        i15++;
                    }
                }
                i15 = bits5;
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i11);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            i13 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            bits4 = normalizedFrame.readBits(8) + 1;
        } else {
            i13 = C2711C.RATE_UNSET_INT;
        }
        int i18 = i13;
        if (bit) {
            if (bits != 0) {
                if (bits != 1) {
                    if (bits == 2) {
                        i14 = 48000;
                    } else {
                        throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                    }
                } else {
                    i14 = 44100;
                }
            } else {
                i14 = 32000;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i15, 1000000L, i14);
        } else {
            jScaleLargeTimestamp = C2711C.TIME_UNSET;
        }
        return new DtsHeader(MimeTypes.AUDIO_DTS_EXPRESS, bits4, i18, bits3, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        int i11;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        if (normalizedFrame.readBit()) {
            i11 = 12;
        } else {
            i11 = 8;
        }
        return normalizedFrame.readBits(i11) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int i11;
        int bits;
        long jScaleLargeTimestamp;
        AtomicInteger atomicInteger2;
        int i12;
        int i13;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int unsignedVarInt = 0;
        if (normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int unsignedVarInt2 = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i11 != 0) {
            if (normalizedFrame.readBit()) {
                checkCrc(bArr, unsignedVarInt2);
                int bits2 = normalizedFrame.readBits(2);
                if (bits2 != 0) {
                    if (bits2 != 1) {
                        if (bits2 == 2) {
                            i12 = RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                        }
                    } else {
                        i12 = TXVodDownloadDataSource.QUALITY_480P;
                    }
                } else {
                    i12 = 512;
                }
                int bits3 = i12 * (normalizedFrame.readBits(3) + 1);
                int bits4 = normalizedFrame.readBits(2);
                if (bits4 != 0) {
                    if (bits4 != 1) {
                        if (bits4 == 2) {
                            i13 = 48000;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                        }
                    } else {
                        i13 = 44100;
                    }
                } else {
                    i13 = 32000;
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(36);
                }
                bits = (1 << normalizedFrame.readBits(2)) * i13;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(bits3, 1000000L, i13);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
        } else {
            bits = C2711C.RATE_UNSET_INT;
            jScaleLargeTimestamp = C2711C.TIME_UNSET;
        }
        int i14 = bits;
        long j11 = jScaleLargeTimestamp;
        int unsignedVarInt3 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            unsignedVarInt3 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i11 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        if (atomicInteger2.get() != 0) {
            unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        return new DtsHeader(MimeTypes.AUDIO_DTS_X, 2, i14, unsignedVarInt2 + unsignedVarInt3 + unsignedVarInt, j11, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b13 = byteBuffer.get(iPosition);
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b12 = byteBuffer.get(iPosition + 7);
            } else if (b13 != 31) {
                i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b11 = byteBuffer.get(iPosition + 5);
            } else {
                i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b12 = byteBuffer.get(iPosition + 6);
            }
            i12 = b12 & BuiltinOptions.LogicalOrOptions;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b11 = byteBuffer.get(iPosition + 4);
        i12 = b11 & C33556b3.f69091s;
        return (((i12 >> 2) | i11) + 1) * 32;
    }
}
