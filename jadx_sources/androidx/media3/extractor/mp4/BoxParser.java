package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public boolean moveNext() {
            int i11 = this.index + 1;
            this.index = i11;
            if (i11 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i12 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i12;
                this.nextSamplesPerChunkChangeIndex = i12 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z11) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z11;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }
    }

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j11, long j12) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j11;
            this.peakBitrate = j12;
        }
    }

    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    public static final class MdhdData {
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j11, long j12, String str) {
            this.timescale = j11;
            this.mediaDurationUs = j12;
            this.language = str;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasAdditionalViews;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z11, boolean z12, boolean z13, boolean z14) {
            this.hasLeftEyeView = z11;
            this.hasRightEyeView = z12;
            this.eyeViewsReversed = z13;
            this.hasAdditionalViews = z14;
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i11 = this.fixedSampleSize;
            return i11 == -1 ? this.data.readUnsignedIntToInt() : i11;
        }

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.m2961w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i11 = this.fieldSize;
            if (i11 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i11 == 16) {
                return this.data.readUnsignedShort();
            }
            int i12 = this.sampleIndex;
            this.sampleIndex = i12 + 1;
            if (i12 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    public static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id */
        private final int f3524id;
        private final int rotationDegrees;

        public TkhdData(int i11, long j11, int i12) {
            this.f3524id = i11;
            this.duration = j11;
            this.rotationDegrees = i12;
        }
    }

    public static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length - 1;
        return jArr[0] <= j12 && j12 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j13 && j13 <= j11;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, String str, boolean z11, @Nullable DrmInitData drmInitData, StsdData stsdData, int i15) throws ParserException {
        int unsignedShort;
        int i16;
        int i17;
        int unsignedFixedPoint1616;
        int i18;
        int unsignedIntToInt;
        int i19;
        String str2;
        String str3;
        int iIntValue = i11;
        int i21 = i13;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i12 + 16);
        if (z11) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            i16 = 2;
            i17 = 4;
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i18 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
            i19 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            i16 = 2;
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z12 = (unsignedIntToInt3 & 1) != 0;
            boolean z13 = (unsignedIntToInt3 & 2) != 0;
            i17 = 4;
            if (z12) {
                if (unsignedIntToInt2 == 32) {
                    i19 = 4;
                } else {
                    i19 = -1;
                }
            } else if (unsignedIntToInt2 == 8) {
                i19 = 3;
            } else if (unsignedIntToInt2 == 16) {
                i19 = z13 ? 268435456 : 2;
            } else if (unsignedIntToInt2 == 24) {
                i19 = z13 ? C2711C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
            } else if (unsignedIntToInt2 == 32) {
                i19 = z13 ? C2711C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
            } else {
                i19 = -1;
            }
            parsableByteArray.skipBytes(8);
            i18 = 0;
        }
        if (iIntValue == 1767992678) {
            unsignedFixedPoint1616 = -1;
            unsignedIntToInt = -1;
        }
        int position = parsableByteArray.getPosition();
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i21);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i15] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (iIntValue == 1936684916) {
            i19 = i16;
            str2 = MimeTypes.AUDIO_RAW;
        } else if (iIntValue == 1953984371) {
            str2 = MimeTypes.AUDIO_RAW;
            i19 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i19 == -1) {
                i19 = i16;
            }
            str2 = MimeTypes.AUDIO_RAW;
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = MimeTypes.AUDIO_MPEG;
        } else if (iIntValue == 1835557169) {
            str2 = MimeTypes.AUDIO_MPEGH_MHA1;
        } else if (iIntValue == 1835560241) {
            str2 = MimeTypes.AUDIO_MPEGH_MHM1;
        } else if (iIntValue == 1634492771) {
            str2 = MimeTypes.AUDIO_ALAC;
        } else if (iIntValue == 1634492791) {
            str2 = MimeTypes.AUDIO_ALAW;
        } else if (iIntValue == 1970037111) {
            str2 = MimeTypes.AUDIO_MLAW;
        } else if (iIntValue == 1332770163) {
            str2 = MimeTypes.AUDIO_OPUS;
        } else if (iIntValue == 1716281667) {
            str2 = MimeTypes.AUDIO_FLAC;
        } else if (iIntValue == 1835823201) {
            str2 = MimeTypes.AUDIO_TRUEHD;
        } else {
            str2 = iIntValue == 1767992678 ? MimeTypes.AUDIO_IAMF : null;
        }
        String str5 = null;
        List<byte[]> listM13440of = null;
        EsdsData esdsFromParent = null;
        while (position - i12 < i21) {
            parsableByteArray.setPosition(position);
            int i22 = parsableByteArray.readInt();
            int i23 = i19;
            ExtractorUtil.checkContainerInput(i22 > 0, "childAtomSize must be positive");
            int i24 = parsableByteArray.readInt();
            if (i24 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                String str6 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(unsignedByte)) : String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort3];
                parsableByteArray.readBytes(bArr, 0, unsignedShort3);
                listM13440of = listM13440of == null ? ImmutableList.m13440of(bArr) : ImmutableList.m13441of(bArr, listM13440of.get(0));
                str5 = str6;
            } else {
                if (i24 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte2 > 0) {
                        byte[] bArr2 = new byte[unsignedByte2];
                        str3 = str4;
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                        listM13440of = listM13440of == null ? ImmutableList.m13440of(bArr2) : ImmutableList.m13441of(listM13440of.get(0), bArr2);
                    }
                } else {
                    str3 = str4;
                    if (i24 == 1702061171 || (z11 && i24 == 2002876005)) {
                        i17 = i17;
                        int iFindBoxPosition = i24 == 1702061171 ? position : findBoxPosition(parsableByteArray, Mp4Box.TYPE_esds, position, i22);
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str2 = esdsFromParent.mimeType;
                            byte[] bArr3 = esdsFromParent.initializationData;
                            if (bArr3 != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                    listM13440of = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                        int i25 = audioSpecificConfig.sampleRateHz;
                                        unsignedIntToInt = audioSpecificConfig.channelCount;
                                        str5 = audioSpecificConfig.codecs;
                                        unsignedFixedPoint1616 = i25;
                                    }
                                    listM13440of = ImmutableList.m13440of(bArr3);
                                }
                            }
                        }
                    } else {
                        if (i24 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i14), str, drmInitDataCopyWithSchemeType);
                        } else if (i24 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i14), str, drmInitDataCopyWithSchemeType);
                        } else if (i24 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i14), str, drmInitDataCopyWithSchemeType);
                        } else if (i24 == 1684892784) {
                            if (i18 <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i18, null);
                            }
                            unsignedFixedPoint1616 = i18;
                            unsignedIntToInt = i16;
                        } else if (i24 == 1684305011 || i24 == 1969517683) {
                            i17 = i17;
                            stsdData.format = new Format.Builder().setId(i14).setSampleMimeType(str2).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                        } else if (i24 == 1682927731) {
                            int i26 = i22 - 8;
                            byte[] bArr4 = opusMagic;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i26);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i26);
                            listM13440of = OpusUtil.buildInitializationData(bArrCopyOf);
                        } else if (i24 == 1684425825) {
                            byte[] bArr5 = new byte[i22 - 8];
                            bArr5[0] = BuiltinOptions.CumsumOptions;
                            bArr5[1] = BuiltinOptions.SquaredDifferenceOptions;
                            bArr5[i16] = BuiltinOptions.ScatterNdOptions;
                            bArr5[3] = BuiltinOptions.ZerosLikeOptions;
                            parsableByteArray.setPosition(position + 12);
                            i17 = i17;
                            parsableByteArray.readBytes(bArr5, i17, i22 - 12);
                            listM13440of = ImmutableList.m13440of(bArr5);
                        } else {
                            i17 = i17;
                            if (i24 == 1634492771) {
                                int i27 = i22 - 12;
                                byte[] bArr6 = new byte[i27];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i27);
                                Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                listM13440of = ImmutableList.m13440of(bArr6);
                                unsignedFixedPoint1616 = iIntValue2;
                                unsignedIntToInt = iIntValue3;
                            } else if (i24 == 1767990114) {
                                parsableByteArray.setPosition(position + 9);
                                int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                byte[] bArr7 = new byte[unsignedLeb128ToInt];
                                parsableByteArray.readBytes(bArr7, 0, unsignedLeb128ToInt);
                                listM13440of = ImmutableList.m13440of(bArr7);
                            }
                        }
                        i17 = i17;
                    }
                    position += i22;
                    i21 = i13;
                    i17 = i17;
                    i19 = i23;
                    str4 = str3;
                }
                position += i22;
                i21 = i13;
                i17 = i17;
                i19 = i23;
                str4 = str3;
            }
            str3 = str4;
            position += i22;
            i21 = i13;
            i17 = i17;
            i19 = i23;
            str4 = str3;
        }
        int i28 = i19;
        if (stsdData.format != null || str2 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i14).setSampleMimeType(str2).setCodecs(str5).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i28).setInitializationData(listM13440of).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
        if (esdsFromParent != null) {
            language.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = language.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z11;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int i11;
        int i12;
        int i13;
        Track track2;
        long[] jArrCopyOf;
        int[] iArr;
        long[] jArrCopyOf2;
        int i14;
        int[] iArrCopyOf;
        int i15;
        Track track3;
        long[] jArr;
        int i16;
        long j11;
        int[] iArr2;
        int i17;
        int i18;
        Track trackCopyWithFormat = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsz);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, trackCopyWithFormat.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stz2);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(trackCopyWithFormat, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (trackCopyWithFormat.type == 2) {
            long j12 = trackCopyWithFormat.mediaDurationUs;
            if (j12 > 0) {
                trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setFrameRate(sampleCount / (j12 / 1000000.0f)).build());
            }
        }
        Track track4 = trackCopyWithFormat;
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stco);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_co64));
            z11 = true;
        } else {
            z11 = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stts))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z11);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                i11 = 0;
            } else {
                unsignedIntToInt2 = -1;
                i11 = 0;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
            i11 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track4.format.sampleMimeType;
        if (((fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) ? i11 : 1) != 0) {
            int i19 = chunkIterator.length;
            long[] jArr2 = new long[i19];
            int[] iArr3 = new int[i19];
            while (chunkIterator.moveNext()) {
                int i21 = chunkIterator.index;
                jArr2[i21] = chunkIterator.offset;
                iArr3[i21] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr2, iArr3, unsignedIntToInt6);
            long[] jArr3 = resultsRechunk.offsets;
            iArr = resultsRechunk.sizes;
            int i22 = resultsRechunk.maximumSize;
            jArrCopyOf2 = resultsRechunk.timestamps;
            iArrCopyOf = resultsRechunk.flags;
            jArr = jArr3;
            i16 = i22;
            i12 = 1;
            j11 = resultsRechunk.duration;
            track3 = track4;
        } else {
            long[] jArr4 = new long[sampleCount];
            int[] iArr4 = new int[sampleCount];
            long[] jArr5 = new long[sampleCount];
            i12 = 1;
            int[] iArr5 = new int[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
            int i23 = unsignedIntToInt6;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            long j13 = 0;
            long j14 = 0;
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i24 = i11;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int unsignedIntToInt8 = unsignedIntToInt5;
            int i28 = unsignedIntToInt4;
            int i29 = i27;
            while (true) {
                if (i24 >= sampleCount) {
                    i13 = i28;
                    track2 = track4;
                    jArrCopyOf = jArr4;
                    iArr = iArr4;
                    jArrCopyOf2 = jArr5;
                    i14 = i26;
                    iArrCopyOf = iArr5;
                    break;
                }
                long j15 = j14;
                int i31 = i26;
                boolean zMoveNext = true;
                while (i31 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i32 = i28;
                    long j16 = chunkIterator.offset;
                    i31 = chunkIterator.numSamples;
                    j15 = j16;
                    track4 = track4;
                    i28 = i32;
                    sampleCount = sampleCount;
                }
                int i33 = sampleCount;
                i13 = i28;
                track2 = track4;
                if (!zMoveNext) {
                    Log.m2961w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr4, i24);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i24);
                    jArrCopyOf2 = Arrays.copyOf(jArr5, i24);
                    iArrCopyOf = Arrays.copyOf(iArr5, i24);
                    i14 = i31;
                    iArr = iArrCopyOf2;
                    sampleCount = i24;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int unsignedIntToInt9 = i27;
                    while (unsignedIntToInt9 == 0 && unsignedIntToInt > 0) {
                        unsignedIntToInt9 = parsableByteArray6.readUnsignedIntToInt();
                        i25 = parsableByteArray6.readInt();
                        unsignedIntToInt--;
                    }
                    i27 = unsignedIntToInt9 - 1;
                }
                jArr4[i24] = j15;
                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr4[i24] = nextSampleSize;
                if (nextSampleSize > i29) {
                    i29 = nextSampleSize;
                }
                jArr5[i24] = j13 + ((long) i25);
                iArr5[i24] = parsableByteArray7 == null ? 1 : i11;
                if (i24 == unsignedIntToInt7) {
                    iArr5[i24] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j13 += (long) i23;
                unsignedIntToInt8--;
                if (unsignedIntToInt8 != 0 || i13 <= 0) {
                    i28 = i13;
                } else {
                    i28 = i13 - 1;
                    unsignedIntToInt8 = parsableByteArray3.readUnsignedIntToInt();
                    i23 = parsableByteArray3.readInt();
                }
                long j17 = j15 + ((long) iArr4[i24]);
                i26 = i31 - 1;
                i24++;
                track4 = track2;
                j14 = j17;
                sampleCount = i33;
            }
            long j18 = j13 + ((long) i25);
            if (parsableByteArray6 == null) {
                i15 = 1;
                break;
            }
            while (true) {
                if (unsignedIntToInt <= 0) {
                    i15 = 1;
                    break;
                }
                if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                    i15 = i11;
                    break;
                }
                parsableByteArray6.readInt();
                unsignedIntToInt--;
            }
            if (unsignedIntToInt3 == 0 && unsignedIntToInt8 == 0 && i14 == 0 && i13 == 0 && i27 == 0 && i15 != 0) {
                track3 = track2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                track3 = track2;
                sb2.append(track3.f3525id);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(unsignedIntToInt3);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(unsignedIntToInt8);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i14);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i13);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i27);
                sb2.append(i15 == 0 ? ", ctts invalid" : "");
                Log.m2961w(TAG, sb2.toString());
            }
            jArr = jArrCopyOf;
            i16 = i29;
            j11 = j18;
        }
        long[] jArr6 = jArrCopyOf2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j11, 1000000L, track3.timescale);
        long[] jArr7 = track3.editListDurations;
        if (jArr7 == null) {
            Util.scaleLargeTimestampsInPlace(jArr6, 1000000L, track3.timescale);
            return new TrackSampleTable(track3, jArr, iArr, i16, jArr6, iArrCopyOf, jScaleLargeTimestamp);
        }
        Track trackCopyWithFormat2 = track3;
        int[] iArr6 = iArr;
        int[] iArr7 = iArrCopyOf;
        int i34 = i12;
        if (jArr7.length == i34 && trackCopyWithFormat2.type == i34 && jArr6.length >= 2) {
            long j19 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes))[i11];
            long jScaleLargeTimestamp2 = j19 + Util.scaleLargeTimestamp(trackCopyWithFormat2.editListDurations[i11], trackCopyWithFormat2.timescale, trackCopyWithFormat2.movieTimescale);
            if (canApplyEditWithGaplessInfo(jArr6, j11, j19, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j19 - jArr6[i11], trackCopyWithFormat2.format.sampleRate, trackCopyWithFormat2.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j11 - jScaleLargeTimestamp2, trackCopyWithFormat2.format.sampleRate, trackCopyWithFormat2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr6, 1000000L, trackCopyWithFormat2.timescale);
                    return new TrackSampleTable(trackCopyWithFormat2, jArr, iArr6, i16, jArr6, iArr7, Util.scaleLargeTimestamp(trackCopyWithFormat2.editListDurations[i11], 1000000L, trackCopyWithFormat2.movieTimescale));
                }
            }
        }
        long[] jArr8 = trackCopyWithFormat2.editListDurations;
        if (jArr8.length == 1 && jArr8[i11] == 0) {
            long j21 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes))[i11];
            for (int i35 = i11; i35 < jArr6.length; i35++) {
                jArr6[i35] = Util.scaleLargeTimestamp(jArr6[i35] - j21, 1000000L, trackCopyWithFormat2.timescale);
            }
            return new TrackSampleTable(trackCopyWithFormat2, jArr, iArr6, i16, jArr6, iArr7, Util.scaleLargeTimestamp(j11 - j21, 1000000L, trackCopyWithFormat2.timescale));
        }
        boolean z12 = trackCopyWithFormat2.type == 1 ? 1 : i11;
        int[] iArr8 = new int[jArr8.length];
        int[] iArr9 = new int[jArr8.length];
        long[] jArr9 = (long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes);
        int i36 = i11;
        int i37 = i36;
        int i38 = i37;
        int i39 = i38;
        while (true) {
            long[] jArr10 = trackCopyWithFormat2.editListDurations;
            iArr2 = iArr9;
            if (i36 >= jArr10.length) {
                break;
            }
            int[] iArr10 = iArr8;
            long j22 = jArr9[i36];
            if (j22 != -1) {
                long j23 = jArr10[i36];
                i17 = i36;
                int i41 = i37;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j23, trackCopyWithFormat2.timescale, trackCopyWithFormat2.movieTimescale);
                iArr10[i17] = Util.binarySearchFloor(jArr6, j22, true, true);
                while (true) {
                    int i42 = iArr10[i17];
                    if (i42 < 0 || (iArr7[i42] & 1) != 0) {
                        break;
                    }
                    iArr10[i17] = i42 - 1;
                }
                long j24 = j22 + jScaleLargeTimestamp5;
                iArr2[i17] = Util.binarySearchCeil(jArr6, j24, z12, (boolean) i11);
                if (trackCopyWithFormat2.type == 2) {
                    while (true) {
                        int i43 = iArr2[i17];
                        if (i43 >= jArr6.length - 1 || jArr6[i43 + 1] > j24) {
                            break;
                        }
                        iArr2[i17] = i43 + 1;
                    }
                }
                int i44 = iArr2[i17];
                int i45 = iArr10[i17];
                i38 += i44 - i45;
                i18 = i41 | (i39 != i45 ? 1 : 0);
                i39 = i44;
            } else {
                i17 = i36;
                i18 = i37;
            }
            i36 = i17 + 1;
            jArr9 = jArr9;
            i37 = i18;
            iArr9 = iArr2;
            iArr8 = iArr10;
            i11 = 0;
        }
        int[] iArr11 = iArr8;
        int i46 = i37 | (i38 != sampleCount ? 1 : 0);
        long[] jArr11 = i46 != 0 ? new long[i38] : jArr;
        int[] iArr12 = i46 != 0 ? new int[i38] : iArr6;
        if (i46 != 0) {
            i16 = 0;
        }
        int[] iArr13 = i46 != 0 ? new int[i38] : iArr7;
        long[] jArr12 = new long[i38];
        int i47 = i16;
        long j25 = 0;
        int i48 = 0;
        int i49 = 0;
        boolean z13 = false;
        while (i48 < trackCopyWithFormat2.editListDurations.length) {
            long j26 = trackCopyWithFormat2.editListMediaTimes[i48];
            int i51 = iArr11[i48];
            int i52 = iArr2[i48];
            int i53 = i46;
            if (i46 != 0) {
                int i54 = i52 - i51;
                System.arraycopy(jArr, i51, jArr11, i49, i54);
                System.arraycopy(iArr6, i51, iArr12, i49, i54);
                System.arraycopy(iArr7, i51, iArr13, i49, i54);
            }
            int i55 = i47;
            while (i51 < i52) {
                long[] jArr13 = jArr11;
                int[] iArr14 = iArr13;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j25, 1000000L, trackCopyWithFormat2.movieTimescale);
                long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr6[i51] - j26, 1000000L, trackCopyWithFormat2.timescale);
                if (jScaleLargeTimestamp7 < 0) {
                    z13 = true;
                }
                jArr12[i49] = jScaleLargeTimestamp6 + jScaleLargeTimestamp7;
                if (i53 != 0 && iArr12[i49] > i55) {
                    i55 = iArr6[i51];
                }
                i49++;
                i51++;
                iArr13 = iArr14;
                jArr11 = jArr13;
            }
            j25 += trackCopyWithFormat2.editListDurations[i48];
            i48++;
            i47 = i55;
            jArr11 = jArr11;
            i46 = i53;
        }
        long[] jArr14 = jArr11;
        int[] iArr15 = iArr13;
        long jScaleLargeTimestamp8 = Util.scaleLargeTimestamp(j25, 1000000L, trackCopyWithFormat2.movieTimescale);
        if (z13) {
            trackCopyWithFormat2 = trackCopyWithFormat2.copyWithFormat(trackCopyWithFormat2.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(trackCopyWithFormat2, jArr14, iArr12, i47, jArr12, iArr15, jScaleLargeTimestamp8);
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, int i15, @Nullable DrmInitData drmInitData, StsdData stsdData, int i16) throws ParserException {
        String str;
        int i17;
        String str2;
        int i18;
        NalUnitUtil.H265VpsData h265VpsData;
        List<byte[]> list;
        int i19;
        int i21;
        int iIsoColorPrimariesToColorSpace;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i22;
        int i23;
        int i24 = i12;
        int i25 = i13;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i24 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i11;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i24, i25);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i16] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float paspFromParent = 1.0f;
        int i26 = 8;
        int i27 = 8;
        List<byte[]> listM13440of = null;
        String str4 = null;
        byte[] projFromParent = null;
        int i28 = -1;
        int i29 = -1;
        int iIsoColorPrimariesToColorSpace2 = -1;
        int i31 = -1;
        int iIsoTransferCharacteristicsToColorTransfer2 = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsFromParent = null;
        NalUnitUtil.H265VpsData h265VpsData2 = null;
        boolean z11 = false;
        while (position - i24 < i25) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i32 = parsableByteArray.readInt();
            if (i32 == 0 && parsableByteArray.getPosition() - i12 == i25) {
                break;
            }
            ExtractorUtil.checkContainerInput(i32 > 0, "childAtomSize must be positive");
            int i33 = parsableByteArray.readInt();
            if (i33 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List<byte[]> list2 = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z11) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str5 = avcConfig.codecs;
                int i34 = avcConfig.maxNumReorderFrames;
                int i35 = avcConfig.colorSpace;
                int i36 = avcConfig.colorRange;
                listM13440of = list2;
                int i37 = avcConfig.colorTransfer;
                int i38 = avcConfig.bitdepthLuma;
                i17 = position;
                i19 = iIntValue;
                str2 = str3;
                iIsoColorPrimariesToColorSpace2 = i35;
                i18 = i36;
                iIsoTransferCharacteristicsToColorTransfer2 = i37;
                i27 = avcConfig.bitdepthChroma;
                i26 = i38;
                str4 = str5;
                str = "video/avc";
                h265VpsData = h265VpsData2;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                i29 = i34;
            } else {
                i17 = position;
                if (i33 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list3 = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z11) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i39 = hevcConfig.maxNumReorderPics;
                    String str6 = hevcConfig.codecs;
                    int i41 = hevcConfig.stereoMode;
                    if (i41 != -1) {
                        i28 = i41;
                    }
                    int i42 = hevcConfig.colorSpace;
                    int i43 = hevcConfig.colorRange;
                    listM13440of = list3;
                    int i44 = hevcConfig.colorTransfer;
                    int i45 = hevcConfig.bitdepthLuma;
                    int i46 = hevcConfig.bitdepthChroma;
                    h265VpsData = hevcConfig.vpsData;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    i19 = iIntValue;
                    str2 = str3;
                    iIsoColorPrimariesToColorSpace2 = i42;
                    i18 = i43;
                    iIsoTransferCharacteristicsToColorTransfer2 = i44;
                    i26 = i45;
                    i27 = i46;
                    i29 = i39;
                    str4 = str6;
                    str = "video/hevc";
                } else {
                    str2 = str3;
                    if (i33 == 1818785347) {
                        ExtractorUtil.checkContainerInput("video/hevc".equals(str), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                        ExtractorUtil.checkContainerInput(h265VpsData3 != null && h265VpsData3.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig layered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData3));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == layered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i47 = layered.colorSpace;
                        int i48 = iIsoColorPrimariesToColorSpace2;
                        if (i47 != -1) {
                            ExtractorUtil.checkContainerInput(i48 == i47, "colorSpace must be the same for both views");
                        }
                        int i49 = layered.colorRange;
                        int i51 = i31;
                        if (i49 != -1) {
                            ExtractorUtil.checkContainerInput(i51 == i49, "colorRange must be the same for both views");
                        }
                        int i52 = layered.colorTransfer;
                        if (i52 != -1) {
                            int i53 = iIsoTransferCharacteristicsToColorTransfer2;
                            i23 = i53;
                            ExtractorUtil.checkContainerInput(i53 == i52, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iIsoTransferCharacteristicsToColorTransfer2;
                        }
                        ExtractorUtil.checkContainerInput(i26 == layered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i27 == layered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> listBuild = listM13440of;
                        if (listBuild != null) {
                            listBuild = ImmutableList.builder().addAll((Iterable) listBuild).addAll((Iterable) layered.initializationData).build();
                        } else {
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str7 = layered.codecs;
                        str = MimeTypes.VIDEO_MV_HEVC;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        i19 = iIntValue;
                        i18 = i51;
                        iIsoColorPrimariesToColorSpace2 = i48;
                        iIsoTransferCharacteristicsToColorTransfer2 = i23;
                        str4 = str7;
                        h265VpsData = h265VpsData3;
                        listM13440of = listBuild;
                    } else {
                        List<byte[]> listBuildVp9CodecPrivateInitializationData = listM13440of;
                        iIsoColorPrimariesToColorSpace2 = iIsoColorPrimariesToColorSpace2;
                        i18 = i31;
                        iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                        NalUnitUtil.H265VpsData h265VpsData4 = h265VpsData2;
                        if (i33 == 1986361461) {
                            VexuData videoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, i32);
                            if (videoExtendedUsageBox == null || videoExtendedUsageBox.eyesData == null) {
                                i22 = i28;
                                i28 = i22;
                            } else if (h265VpsData4 == null || h265VpsData4.layerInfos.size() < 2) {
                                i22 = i28;
                                if (i22 == -1) {
                                    i28 = videoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                } else {
                                    i28 = i22;
                                }
                            } else {
                                ExtractorUtil.checkContainerInput(videoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                ExtractorUtil.checkContainerInput(!videoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i28;
                                i28 = i22;
                            }
                            h265VpsData = h265VpsData4;
                            listM13440of = listBuildVp9CodecPrivateInitializationData;
                            i19 = iIntValue;
                        } else {
                            int i54 = i28;
                            h265VpsData = h265VpsData4;
                            if (i33 == 1685480259 || i33 == 1685485123) {
                                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                list = listBuildVp9CodecPrivateInitializationData;
                                i19 = iIntValue;
                                i21 = i54;
                                i27 = i27;
                                i26 = i26;
                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace2;
                                iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                                DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                                if (dolbyVisionConfig != null) {
                                    str = "video/dolby-vision";
                                    str4 = dolbyVisionConfig.codecs;
                                }
                            } else {
                                if (i33 == 1987076931) {
                                    ExtractorUtil.checkContainerInput(str == null, null);
                                    String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    parsableByteArray.setPosition(position2 + 12);
                                    byte unsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                    byte unsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                    i26 = unsignedByte3 >> 4;
                                    i19 = iIntValue;
                                    byte b11 = (byte) ((unsignedByte3 >> 1) & 7);
                                    if (str8.equals("video/x-vnd.on2.vp9")) {
                                        listBuildVp9CodecPrivateInitializationData = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i26, b11);
                                    }
                                    boolean z12 = (unsignedByte3 & 1) != 0;
                                    int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                    iIsoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte4);
                                    int i55 = z12 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer2 = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                                    str = str8;
                                    i27 = i26;
                                    i18 = i55;
                                    listM13440of = listBuildVp9CodecPrivateInitializationData;
                                } else {
                                    i19 = iIntValue;
                                    if (i33 == 1635135811) {
                                        int i56 = i32 - 8;
                                        byte[] bArr = new byte[i56];
                                        parsableByteArray.readBytes(bArr, 0, i56);
                                        listM13440of = ImmutableList.m13440of(bArr);
                                        parsableByteArray.setPosition(position2 + 8);
                                        ColorInfo av1c = parseAv1c(parsableByteArray);
                                        int i57 = av1c.lumaBitdepth;
                                        int i58 = av1c.chromaBitdepth;
                                        int i59 = av1c.colorSpace;
                                        int i61 = av1c.colorRange;
                                        iIsoTransferCharacteristicsToColorTransfer2 = av1c.colorTransfer;
                                        i26 = i57;
                                        iIsoColorPrimariesToColorSpace2 = i59;
                                        i18 = i61;
                                        str = "video/av01";
                                        i27 = i58;
                                    } else if (i33 == 1668050025) {
                                        if (byteBufferAllocateHdrStaticInfo == null) {
                                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                        }
                                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                        byteBuffer.position(21);
                                        byteBuffer.putShort(parsableByteArray.readShort());
                                        byteBuffer.putShort(parsableByteArray.readShort());
                                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                                        listM13440of = listBuildVp9CodecPrivateInitializationData;
                                        iIsoColorPrimariesToColorSpace2 = iIsoColorPrimariesToColorSpace2;
                                        iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                                    } else if (i33 == 1835295606) {
                                        if (byteBufferAllocateHdrStaticInfo == null) {
                                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                        short s11 = parsableByteArray.readShort();
                                        short s12 = parsableByteArray.readShort();
                                        short s13 = parsableByteArray.readShort();
                                        short s14 = parsableByteArray.readShort();
                                        int i62 = i27;
                                        short s15 = parsableByteArray.readShort();
                                        int i63 = i26;
                                        short s16 = parsableByteArray.readShort();
                                        short s17 = parsableByteArray.readShort();
                                        short s18 = parsableByteArray.readShort();
                                        long unsignedInt = parsableByteArray.readUnsignedInt();
                                        long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(s15);
                                        byteBuffer2.putShort(s16);
                                        byteBuffer2.putShort(s11);
                                        byteBuffer2.putShort(s12);
                                        byteBuffer2.putShort(s13);
                                        byteBuffer2.putShort(s14);
                                        byteBuffer2.putShort(s17);
                                        byteBuffer2.putShort(s18);
                                        byteBuffer2.putShort((short) (unsignedInt / 10000));
                                        byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                                        byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                        h265VpsData = h265VpsData;
                                        i27 = i62;
                                        i26 = i63;
                                        listM13440of = listBuildVp9CodecPrivateInitializationData;
                                        i28 = i54;
                                    } else {
                                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                        list = listBuildVp9CodecPrivateInitializationData;
                                        i21 = i54;
                                        i27 = i27;
                                        i26 = i26;
                                        if (i33 == 1681012275) {
                                            ExtractorUtil.checkContainerInput(str == null, null);
                                            str = str2;
                                        } else if (i33 == 1702061171) {
                                            ExtractorUtil.checkContainerInput(str == null, null);
                                            esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                            String str9 = esdsFromParent.mimeType;
                                            byte[] bArr2 = esdsFromParent.initializationData;
                                            listM13440of = bArr2 != null ? ImmutableList.m13440of(bArr2) : list;
                                            str = str9;
                                            h265VpsData = h265VpsData;
                                            i27 = i27;
                                            i26 = i26;
                                            i28 = i21;
                                        } else if (i33 == 1885434736) {
                                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                            h265VpsData = h265VpsData;
                                            i27 = i27;
                                            i26 = i26;
                                            iIsoColorPrimariesToColorSpace2 = iIsoColorPrimariesToColorSpace2;
                                            iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                                            listM13440of = list;
                                            i28 = i21;
                                            z11 = true;
                                        } else if (i33 == 1937126244) {
                                            projFromParent = parseProjFromParent(parsableByteArray, position2, i32);
                                        } else if (i33 == 1936995172) {
                                            int unsignedByte6 = parsableByteArray.readUnsignedByte();
                                            parsableByteArray.skipBytes(3);
                                            if (unsignedByte6 == 0) {
                                                int unsignedByte7 = parsableByteArray.readUnsignedByte();
                                                if (unsignedByte7 == 0) {
                                                    i21 = 0;
                                                } else if (unsignedByte7 == 1) {
                                                    i21 = 1;
                                                } else if (unsignedByte7 == 2) {
                                                    i21 = 2;
                                                } else if (unsignedByte7 == 3) {
                                                    i21 = 3;
                                                }
                                            }
                                        } else {
                                            if (i33 == 1668246642) {
                                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace2;
                                                iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                                                if (iIsoColorPrimariesToColorSpace == -1 && iIsoTransferCharacteristicsToColorTransfer == -1) {
                                                    int i64 = parsableByteArray.readInt();
                                                    if (i64 == TYPE_nclx || i64 == TYPE_nclc) {
                                                        int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                        int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                        parsableByteArray.skipBytes(2);
                                                        boolean z13 = i32 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                        int i65 = z13 ? 1 : 2;
                                                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                        i18 = i65;
                                                    } else {
                                                        Log.m2961w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(i64));
                                                    }
                                                }
                                            } else {
                                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace2;
                                                iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                                            }
                                        }
                                        listM13440of = list;
                                        i28 = i21;
                                    }
                                }
                                i28 = i54;
                            }
                            i27 = i27;
                            i26 = i26;
                            listM13440of = list;
                            iIsoColorPrimariesToColorSpace2 = iIsoColorPrimariesToColorSpace;
                            iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer;
                            h265VpsData = h265VpsData;
                            i28 = i21;
                        }
                    }
                }
                position = i17 + i32;
                i25 = i13;
                stsdData2 = stsdData;
                iIntValue = i19;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                str3 = str2;
                i31 = i18;
                h265VpsData2 = h265VpsData;
                i24 = i12;
            }
            position = i17 + i32;
            i25 = i13;
            stsdData2 = stsdData;
            iIntValue = i19;
            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
            str3 = str2;
            i31 = i18;
            h265VpsData2 = h265VpsData;
            i24 = i12;
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        List<byte[]> list4 = listM13440of;
        int i66 = i28;
        int i67 = iIsoColorPrimariesToColorSpace2;
        int i68 = i31;
        int i69 = iIsoTransferCharacteristicsToColorTransfer2;
        int i71 = i27;
        int i72 = i26;
        if (str == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i14).setSampleMimeType(str).setCodecs(str4).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i15).setProjectionData(projFromParent).setStereoMode(i66).setInitializationData(list4).setMaxNumReorderSamples(i29).setDrmInitData(drmInitData2).setColorInfo(new ColorInfo.Builder().setColorSpace(i67).setColorRange(i68).setColorTransfer(i69).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i72).setChromaBitdepth(i71).build());
        if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s11 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s11);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i11) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i11];
        }
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.m2959i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m2959i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.m2959i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.m2959i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m2959i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m2959i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z11 = false;
        for (int i11 = 0; i11 <= bits4; i11++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z11 = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z11 || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        int i13 = i11 + 8;
        int i14 = -1;
        int i15 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i13 - i11 < i12) {
            parsableByteArray.setPosition(i13);
            int i16 = parsableByteArray.readInt();
            int i17 = parsableByteArray.readInt();
            if (i17 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i17 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i17 == 1935894633) {
                i14 = i13;
                i15 = i16;
            }
            i13 += i16;
        }
        if (!C2711C.CENC_TYPE_cenc.equals(string) && !C2711C.CENC_TYPE_cbc1.equals(string) && !C2711C.CENC_TYPE_cens.equals(string) && !C2711C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i14 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i14, i15, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j11 = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j11, unsignedInt > 0 ? unsignedInt : -1L);
    }

    public static int parseFullBoxVersion(int i11) {
        return (i11 >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i11) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j11;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i11 = fullBoxVersion == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            j11 = C2711C.TIME_UNSET;
            if (i12 >= i11) {
                parsableByteArray.skipBytes(i11);
                break;
            }
            if (parsableByteArray.getData()[position + i12] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 == 0) {
                    break;
                }
                long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                unsignedInt = unsignedInt;
                j11 = jScaleLargeTimestamp;
                break;
            }
            i12++;
        }
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return new MdhdData(unsignedInt, j11, "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, StsdData stsdData) {
        parsableByteArray.setPosition(i12 + 16);
        if (i11 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i13).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i11, int i12) {
        int i13 = i11 + 8;
        while (i13 - i11 < i12) {
            parsableByteArray.setPosition(i13);
            int i14 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i13, i14 + i13);
            }
            i13 += i14;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15 = i11 + 8;
        while (true) {
            byte[] bArr = null;
            if (i15 - i11 >= i12) {
                return null;
            }
            parsableByteArray.setPosition(i15);
            int i16 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i14 = 0;
                    i13 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i13 = unsignedByte & 15;
                    i14 = (unsignedByte & 240) >> 4;
                }
                boolean z11 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z11 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z11, str, unsignedByte2, bArr2, i14, i13, bArr);
            }
            i15 += i16;
        }
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int position = parsableByteArray.getPosition();
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int i13 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i13 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8, (unsignedByte & 4) == 4));
            }
            position += i13;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i11, int i12, String str, @Nullable DrmInitData drmInitData, boolean z11) throws ParserException {
        parsableByteArray.setPosition(12);
        int i13 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i13);
        int i14 = 0;
        while (i14 < i13) {
            int position = parsableByteArray.getPosition();
            int i15 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i15 > 0, "childAtomSize must be positive");
            int i16 = parsableByteArray.readInt();
            if (i16 == 1635148593 || i16 == 1635148595 || i16 == 1701733238 || i16 == 1831958048 || i16 == 1836070006 || i16 == 1752589105 || i16 == 1751479857 || i16 == 1932670515 || i16 == 1211250227 || i16 == 1748121139 || i16 == 1987063864 || i16 == 1987063865 || i16 == 1635135537 || i16 == 1685479798 || i16 == 1685479729 || i16 == 1685481573 || i16 == 1685481521) {
                StsdData stsdData2 = stsdData;
                int i17 = i14;
                parseVideoSampleEntry(parsableByteArray, i16, position, i15, i11, i12, drmInitData, stsdData2, i17);
                stsdData = stsdData2;
                i14 = i17;
            } else if (i16 == 1836069985 || i16 == 1701733217 || i16 == 1633889587 || i16 == 1700998451 || i16 == 1633889588 || i16 == 1835823201 || i16 == 1685353315 || i16 == 1685353317 || i16 == 1685353320 || i16 == 1685353324 || i16 == 1685353336 || i16 == 1935764850 || i16 == 1935767394 || i16 == 1819304813 || i16 == 1936684916 || i16 == 1953984371 || i16 == 778924082 || i16 == 778924083 || i16 == 1835557169 || i16 == 1835560241 || i16 == 1634492771 || i16 == 1634492791 || i16 == 1970037111 || i16 == 1332770163 || i16 == 1716281667 || i16 == 1767992678) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i16, position, i15, i11, str, z11, drmInitData, stsdData3, i14);
                stsdData = stsdData3;
            } else if (i16 == 1414810956 || i16 == 1954034535 || i16 == 2004251764 || i16 == 1937010800 || i16 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, i16, position, i15, i11, str, stsdData);
            } else if (i16 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i16, position, i11, stsdData);
            } else if (i16 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i11).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + i15);
            i14++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i12 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListM13440of = null;
        long j11 = Long.MAX_VALUE;
        if (i11 != 1414810956) {
            if (i11 == 1954034535) {
                int i15 = i13 - 16;
                byte[] bArr = new byte[i15];
                parsableByteArray.readBytes(bArr, 0, i15);
                immutableListM13440of = ImmutableList.m13440of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i11 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i11 == 1937010800) {
                j11 = 0;
            } else {
                if (i11 != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = new Format.Builder().setId(i14).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j11).setInitializationData(immutableListM13440of).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j11;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i11 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i12 = fullBoxVersion == 0 ? 4 : 8;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            j11 = C2711C.TIME_UNSET;
            if (i14 >= i12) {
                parsableByteArray.skipBytes(i12);
                break;
            }
            if (parsableByteArray.getData()[position + i14] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j11 = unsignedInt;
                break;
            }
            i14++;
        }
        parsableByteArray.skipBytes(16);
        int i15 = parsableByteArray.readInt();
        int i16 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i17 = parsableByteArray.readInt();
        int i18 = parsableByteArray.readInt();
        if (i15 == 0 && i16 == 65536 && i17 == -65536 && i18 == 0) {
            i13 = 90;
        } else if (i15 == 0 && i16 == -65536 && i17 == 65536 && i18 == 0) {
            i13 = 270;
        } else if (i15 == -65536 && i16 == 0 && i17 == 0 && i18 == -65536) {
            i13 = 180;
        }
        return new TkhdData(i11, j11, i13);
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j11, @Nullable DrmInitData drmInitData, boolean z11, boolean z12) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> edts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd))).data);
        long jScaleLargeTimestamp = C2711C.TIME_UNSET;
        long j12 = j11 == C2711C.TIME_UNSET ? tkhd.duration : j11;
        long j13 = parseMvhd(leafBox.data).timescale;
        if (j12 != C2711C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j12, 1000000L, j13);
        }
        long j14 = jScaleLargeTimestamp;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl));
        MdhdData mdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_mdhd))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafBoxOfType.data, tkhd.f3524id, tkhd.rotationDegrees, mdhd.language, drmInitData, z12);
        if (z11 || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f3524id, trackTypeForHdlr, mdhd.timescale, j13, j14, mdhd.mediaDurationUs, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j11, @Nullable DrmInitData drmInitData, boolean z11, boolean z12, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < containerBox.containerChildren.size(); i11++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i11);
            if (containerBox2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd)), j11, drmInitData, z11, z12))) != null) {
                arrayList.add(parseStbl(trackApply, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia))).getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i11 = parsableByteArray.readInt();
            int i12 = parsableByteArray.readInt();
            if (i12 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i11));
            } else if (i12 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i11));
            } else if (i12 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i11);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i11) {
            int position = parsableByteArray.getPosition();
            int i12 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i12);
            }
            parsableByteArray.setPosition(position + i12);
        }
        return null;
    }

    @Nullable
    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int position = parsableByteArray.getPosition();
        EyesData stereoViewBox = null;
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int i13 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i13 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i13);
            }
            position += i13;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new VexuData(stereoViewBox);
    }

    private BoxParser() {
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i11, int i12, int i13) throws ParserException {
        boolean z11;
        boolean z12;
        int position = parsableByteArray.getPosition();
        if (position >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ExtractorUtil.checkContainerInput(z11, null);
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int i14 = parsableByteArray.readInt();
            if (i14 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ExtractorUtil.checkContainerInput(z12, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i11) {
                return position;
            }
            position += i14;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i11) {
        if (i11 == TYPE_soun) {
            return 1;
        }
        if (i11 == TYPE_vide) {
            return 2;
        }
        if (i11 != TYPE_text && i11 != TYPE_sbtl && i11 != TYPE_subt && i11 != TYPE_clcp) {
            if (i11 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        long unsignedInt;
        long j11;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i11 = 0; i11 < unsignedIntToInt; i11++) {
            if (fullBoxVersion == 1) {
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                unsignedInt = parsableByteArray.readUnsignedInt();
            }
            jArr[i11] = unsignedInt;
            if (fullBoxVersion == 1) {
                j11 = parsableByteArray.readLong();
            } else {
                j11 = parsableByteArray.readInt();
            }
            jArr2[i11] = j11;
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i11 = (i11 << 7) | (unsignedByte & 127);
        }
        return i11;
    }

    public static int parseFullBoxFlags(int i11) {
        return i11 & 16777215;
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i11 = parsableByteArray.readInt();
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i12] = parsableByteArray.readString(i13 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i14 = parsableByteArray2.readInt();
            int i15 = parsableByteArray2.readInt() - 1;
            if (i15 >= 0 && i15 < i11) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i14, strArr[i15]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.m2961w(TAG, "Skipped metadata with unknown key index: " + i15);
            }
            parsableByteArray2.setPosition(position + i14);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        boolean z11;
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int i13 = parsableByteArray.readInt();
            if (i13 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ExtractorUtil.checkContainerInput(z11, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i13)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i13;
        }
        return null;
    }
}
