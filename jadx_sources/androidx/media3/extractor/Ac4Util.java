package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    private static final int CHANNEL_MODE_22_2 = 15;
    private static final int CHANNEL_MODE_3_0 = 2;
    private static final int CHANNEL_MODE_5_0 = 3;
    private static final int CHANNEL_MODE_5_1 = 4;
    private static final int CHANNEL_MODE_7_0_322 = 9;
    private static final int CHANNEL_MODE_7_0_34 = 5;
    private static final int CHANNEL_MODE_7_0_4 = 11;
    private static final int CHANNEL_MODE_7_0_52 = 7;
    private static final int CHANNEL_MODE_7_1_322 = 10;
    private static final int CHANNEL_MODE_7_1_34 = 6;
    private static final int CHANNEL_MODE_7_1_4 = 12;
    private static final int CHANNEL_MODE_7_1_52 = 8;
    private static final int CHANNEL_MODE_9_0_4 = 13;
    private static final int CHANNEL_MODE_9_1_4 = 14;
    private static final int CHANNEL_MODE_MONO = 0;
    private static final int CHANNEL_MODE_STEREO = 1;
    private static final int CHANNEL_MODE_UNKNOWN = -1;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, TXVodDownloadDataSource.QUALITY_480P, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class Ac4Presentation {
        public int channelMode;
        public boolean hasBackChannels;
        public boolean isChannelCoded;
        public int level;
        public int numOfUmxObjects;
        public int topChannelPairs;

        private Ac4Presentation() {
            this.isChannelCoded = true;
            this.channelMode = -1;
            this.numOfUmxObjects = -1;
            this.hasBackChannels = true;
            this.topChannelPairs = 2;
            this.level = 0;
        }
    }

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i11, int i12, int i13, int i14, int i15) {
            this.bitstreamVersion = i11;
            this.channelCount = i12;
            this.sampleRate = i13;
            this.frameSize = i14;
            this.sampleCount = i15;
        }
    }

    public static void getAc4SampleHeader(int i11, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i11 >> 16) & 255);
        data[5] = (byte) ((i11 >> 8) & 255);
        data[6] = (byte) (i11 & 255);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i11) {
        int i12 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i13 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i13 == 65535) {
            i13 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i12 = 4;
        }
        if (i11 == 44097) {
            i12 += 2;
        }
        return i13 + i12;
    }

    private static void parseDsiSubstream(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        int bits = parsableBitArray.readBits(5);
        parsableBitArray.skipBits(2);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (bits >= 7 && bits <= 10) {
            parsableBitArray.skipBit();
        }
        if (parsableBitArray.readBit()) {
            int bits2 = parsableBitArray.readBits(3);
            if (ac4Presentation.channelMode == -1 && bits >= 0 && bits <= 15 && (bits2 == 0 || bits2 == 1)) {
                ac4Presentation.channelMode = bits;
            }
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void parseDsiSubstreamGroup(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        parsableBitArray.skipBits(2);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(8);
        for (int i11 = 0; i11 < bits; i11++) {
            parsableBitArray.skipBits(2);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
            }
            if (bit) {
                parsableBitArray.skipBits(24);
            } else {
                if (parsableBitArray.readBit()) {
                    if (!parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(4);
                    }
                    ac4Presentation.numOfUmxObjects = parsableBitArray.readBits(6) + 1;
                }
                parsableBitArray.skipBits(4);
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(3);
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i11) {
        int i12 = 0;
        while (true) {
            int bits = i12 + parsableBitArray.readBits(i11);
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i12 = (bits + 1) << i11;
        }
    }

    private static void skipDsiLanguage(ParsableBitArray parsableBitArray) throws ParserException {
        int bits = parsableBitArray.readBits(6);
        if (bits < 2 || bits > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(bits)));
        }
        parsableBitArray.skipBits(bits * 8);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, @Nullable DrmInitData drmInitData) throws ParserException {
        int adjustedChannelCount;
        boolean bit;
        int bits;
        int bits2;
        int bits3;
        int iBitsLeft;
        boolean z11;
        boolean bit2;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int iBitsLeft2 = parsableBitArray.bitsLeft();
        int bits4 = parsableBitArray.readBits(3);
        if (bits4 > 1) {
            throw ParserException.createForUnsupportedContainerFeature("Unsupported AC-4 DSI version: " + bits4);
        }
        int bits5 = parsableBitArray.readBits(7);
        int i11 = parsableBitArray.readBit() ? 48000 : 44100;
        parsableBitArray.skipBits(4);
        int bits6 = parsableBitArray.readBits(9);
        if (bits5 > 1) {
            if (bits4 == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI version: " + bits4);
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(128);
                }
            }
        }
        if (bits4 == 1) {
            if (!skipDsiBitrate(parsableBitArray)) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI bitrate.");
            }
            parsableBitArray.byteAlign();
        }
        Ac4Presentation ac4Presentation = new Ac4Presentation();
        int i12 = 0;
        while (true) {
            if (i12 < bits6) {
                if (bits4 == 0) {
                    bit = parsableBitArray.readBit();
                    bits = parsableBitArray.readBits(5);
                    bits2 = parsableBitArray.readBits(5);
                    bits3 = 0;
                    iBitsLeft = 0;
                    z11 = false;
                } else {
                    int bits7 = parsableBitArray.readBits(8);
                    bits3 = parsableBitArray.readBits(8);
                    if (bits3 == 255) {
                        bits3 += parsableBitArray.readBits(16);
                    }
                    if (bits7 > 2) {
                        parsableBitArray.skipBits(bits3 * 8);
                        i12++;
                    } else {
                        iBitsLeft = (iBitsLeft2 - parsableBitArray.bitsLeft()) / 8;
                        int bits8 = parsableBitArray.readBits(5);
                        z11 = bits8 == 31;
                        bits2 = bits7;
                        bits = bits8;
                        bit = false;
                    }
                }
                if (bit || z11 || bits != 6) {
                    ac4Presentation.level = parsableBitArray.readBits(3);
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(5);
                    }
                    parsableBitArray.skipBits(2);
                    int i13 = 1;
                    if (bits4 == 1 && (bits2 == 1 || bits2 == 2)) {
                        parsableBitArray.skipBits(2);
                    }
                    parsableBitArray.skipBits(5);
                    parsableBitArray.skipBits(10);
                    if (bits4 == 1) {
                        if (bits2 > 0) {
                            ac4Presentation.isChannelCoded = parsableBitArray.readBit();
                        }
                        if (ac4Presentation.isChannelCoded) {
                            if (bits2 == 1 || bits2 == 2) {
                                int bits9 = parsableBitArray.readBits(5);
                                if (bits9 >= 0 && bits9 <= 15) {
                                    ac4Presentation.channelMode = bits9;
                                }
                                if (bits9 >= 11 && bits9 <= 14) {
                                    ac4Presentation.hasBackChannels = parsableBitArray.readBit();
                                    ac4Presentation.topChannelPairs = parsableBitArray.readBits(2);
                                }
                            }
                            parsableBitArray.skipBits(24);
                            i13 = 1;
                        }
                        if (bits2 == i13 || bits2 == 2) {
                            if (parsableBitArray.readBit() && parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(2);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBit();
                                int i14 = 8;
                                int bits10 = parsableBitArray.readBits(8);
                                int i15 = 0;
                                while (i15 < bits10) {
                                    parsableBitArray.skipBits(i14);
                                    i15++;
                                    i14 = 8;
                                }
                            }
                        }
                    }
                    if (!bit && !z11) {
                        parsableBitArray.skipBit();
                        if (bits == 0 || bits == 1 || bits == 2) {
                            if (bits2 == 0) {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                                }
                            } else {
                                for (int i17 = 0; i17 < 2; i17++) {
                                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                                }
                            }
                        } else if (bits == 3 || bits == 4) {
                            if (bits2 == 0) {
                                for (int i18 = 0; i18 < 3; i18++) {
                                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                                }
                            } else {
                                for (int i19 = 0; i19 < 3; i19++) {
                                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                                }
                            }
                        } else if (bits != 5) {
                            int bits11 = parsableBitArray.readBits(7);
                            for (int i21 = 0; i21 < bits11; i21++) {
                                parsableBitArray.skipBits(8);
                            }
                        } else if (bits2 == 0) {
                            parseDsiSubstream(parsableBitArray, ac4Presentation);
                        } else {
                            int bits12 = parsableBitArray.readBits(3);
                            for (int i22 = 0; i22 < bits12 + 2; i22++) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (bits2 == 0) {
                        parseDsiSubstream(parsableBitArray, ac4Presentation);
                    } else {
                        parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                    }
                    parsableBitArray.skipBit();
                    bit2 = parsableBitArray.readBit();
                } else {
                    bit2 = true;
                }
                if (bit2) {
                    int bits13 = parsableBitArray.readBits(7);
                    for (int i23 = 0; i23 < bits13; i23++) {
                        parsableBitArray.skipBits(15);
                    }
                }
                if (bits2 > 0) {
                    if (parsableBitArray.readBit() && !skipDsiBitrate(parsableBitArray)) {
                        throw ParserException.createForUnsupportedContainerFeature("Can't parse bitrate DSI.");
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.byteAlign();
                        parsableBitArray.skipBytes(parsableBitArray.readBits(16));
                        int bits14 = parsableBitArray.readBits(5);
                        for (int i24 = 0; i24 < bits14; i24++) {
                            parsableBitArray.skipBits(3);
                            parsableBitArray.skipBits(8);
                        }
                    }
                }
                parsableBitArray.byteAlign();
                if (bits4 == 1) {
                    int iBitsLeft3 = ((iBitsLeft2 - parsableBitArray.bitsLeft()) / 8) - iBitsLeft;
                    if (bits3 < iBitsLeft3) {
                        throw ParserException.createForUnsupportedContainerFeature("pres_bytes is smaller than presentation bytes read.");
                    }
                    parsableBitArray.skipBytes(bits3 - iBitsLeft3);
                }
                if (ac4Presentation.isChannelCoded && ac4Presentation.channelMode == -1) {
                    throw ParserException.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i12);
                }
            }
            if (ac4Presentation.isChannelCoded) {
                adjustedChannelCount = getAdjustedChannelCount(ac4Presentation.channelMode, ac4Presentation.hasBackChannels, ac4Presentation.topChannelPairs);
            } else {
                adjustedChannelCount = ac4Presentation.numOfUmxObjects + 1;
                if (ac4Presentation.level == 4 && adjustedChannelCount == 17) {
                    adjustedChannelCount = 21;
                }
            }
            if (adjustedChannelCount > 0) {
                return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(adjustedChannelCount).setSampleRate(i11).setDrmInitData(drmInitData).setLanguage(str2).build();
            }
            throw ParserException.createForUnsupportedContainerFeature("Can't determine channel count of presentation.");
        }
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i11;
        int i12;
        int i13;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i14 = bits2 + i11;
        if (bits == 44097) {
            i14 += 2;
        }
        int i15 = i14;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i16 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i17 = 48000;
        if (!parsableBitArray.readBit()) {
            i17 = 44100;
        }
        int bits5 = parsableBitArray.readBits(4);
        if (i17 != 44100 || bits5 != 13) {
            if (i17 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (bits5 < iArr.length) {
                    int i18 = iArr[bits5];
                    int i19 = bits4 % 5;
                    if (i19 == 1) {
                        if (bits5 != 3 || bits5 == 8) {
                            i12 = i18 + 1;
                        } else {
                            i13 = i18;
                        }
                    } else if (i19 != 2) {
                        if (i19 == 3) {
                            if (bits5 != 3) {
                            }
                            i12 = i18 + 1;
                        } else if (i19 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i12 = i18 + 1;
                        } else {
                            i13 = i18;
                        }
                    } else if (bits5 == 8 || bits5 == 11) {
                        i12 = i18 + 1;
                    } else {
                        i13 = i18;
                    }
                } else {
                    i12 = 0;
                }
            } else {
                i12 = 0;
            }
            return new SyncFrameInfo(i16, 2, i17, i15, i13);
        }
        i12 = SAMPLE_COUNT[bits5];
        i13 = i12;
        return new SyncFrameInfo(i16, 2, i17, i15, i13);
    }

    private Ac4Util() {
    }

    private static int getAdjustedChannelCount(int i11, boolean z11, int i12) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i11);
        if (i11 != 11 && i11 != 12 && i11 != 13 && i11 != 14) {
            return channelCountFromChannelMode;
        }
        if (!z11) {
            channelCountFromChannelMode -= 2;
        }
        if (i12 != 0) {
            if (i12 != 1) {
                return channelCountFromChannelMode;
            }
            return channelCountFromChannelMode - 2;
        }
        return channelCountFromChannelMode - 4;
    }

    private static int getChannelCountFromChannelMode(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    private static boolean skipDsiBitrate(ParsableBitArray parsableBitArray) {
        if (parsableBitArray.bitsLeft() < 66) {
            return false;
        }
        parsableBitArray.skipBits(66);
        return true;
    }
}
