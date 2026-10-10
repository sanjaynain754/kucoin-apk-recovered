package androidx.media3.extractor.p021ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = C2711C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    public static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        public static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;

            @Nullable
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                int i11;
                int i12;
                int i13;
                boolean z11;
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.spsData);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(sliceHeaderData.spsData);
                return (this.frameNum == sliceHeaderData.frameNum && this.picParameterSetId == sliceHeaderData.picParameterSetId && this.fieldPicFlag == sliceHeaderData.fieldPicFlag && (!this.bottomFieldFlagPresent || !sliceHeaderData.bottomFieldFlagPresent || this.bottomFieldFlag == sliceHeaderData.bottomFieldFlag) && (((i11 = this.nalRefIdc) == (i12 = sliceHeaderData.nalRefIdc) || (i11 != 0 && i12 != 0)) && (((i13 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.picOrderCntLsb == sliceHeaderData.picOrderCntLsb && this.deltaPicOrderCntBottom == sliceHeaderData.deltaPicOrderCntBottom)) && ((i13 != 1 || spsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == sliceHeaderData.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == sliceHeaderData.deltaPicOrderCnt1)) && (z11 = this.idrPicFlag) == sliceHeaderData.idrPicFlag && (!z11 || this.idrPicId == sliceHeaderData.idrPicId))))) ? false : true;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i11 = this.sliceType;
                return i11 == 7 || i11 == 2;
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.spsData = spsData;
                this.nalRefIdc = i11;
                this.sliceType = i12;
                this.frameNum = i13;
                this.picParameterSetId = i14;
                this.fieldPicFlag = z11;
                this.bottomFieldFlagPresent = z12;
                this.bottomFieldFlag = z13;
                this.idrPicFlag = z14;
                this.idrPicId = i15;
                this.picOrderCntLsb = i16;
                this.deltaPicOrderCntBottom = i17;
                this.deltaPicOrderCnt0 = i18;
                this.deltaPicOrderCnt1 = i19;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i11) {
                this.sliceType = i11;
                this.hasSliceType = true;
            }
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void outputSample(int i11) {
            long j11 = this.sampleTimeUs;
            if (j11 == C2711C.TIME_UNSET) {
                return;
            }
            boolean z11 = this.sampleIsKeyframe;
            this.output.sampleMetadata(j11, z11 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i11, null);
        }

        private void setSampleIsKeyframe() {
            boolean zIsISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z11 = this.sampleIsKeyframe;
            int i11 = this.nalUnitType;
            boolean z12 = true;
            if (i11 != 5 && (!zIsISlice || i11 != 1)) {
                z12 = false;
            }
            this.sampleIsKeyframe = z11 | z12;
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0109  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0110  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:63:0x0129  */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0161  */
        public void appendToNalUnit(byte[] bArr, int i11, int i12) {
            boolean z11;
            boolean z12;
            boolean bit;
            boolean z13;
            int unsignedExpGolombCodedInt;
            int i13;
            int i14;
            int signedExpGolombCodedInt;
            int i15;
            int signedExpGolombCodedInt2;
            int bits;
            if (this.isFilling) {
                int i16 = i12 - i11;
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i17 = this.bufferLength;
                if (length < i17 + i16) {
                    this.buffer = Arrays.copyOf(bArr2, (i17 + i16) * 2);
                }
                System.arraycopy(bArr, i11, this.buffer, this.bufferLength, i16);
                int i18 = this.bufferLength + i16;
                this.bufferLength = i18;
                this.bitArray.reset(this.buffer, 0, i18);
                if (this.bitArray.canReadBits(8)) {
                    this.bitArray.skipBit();
                    int bits2 = this.bitArray.readBits(2);
                    this.bitArray.skipBits(5);
                    if (this.bitArray.canReadExpGolombCodedNum()) {
                        this.bitArray.readUnsignedExpGolombCodedInt();
                        if (this.bitArray.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.bitArray.readUnsignedExpGolombCodedInt();
                            if (!this.detectAccessUnits) {
                                this.isFilling = false;
                                this.sliceHeader.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.bitArray.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.bitArray.readUnsignedExpGolombCodedInt();
                                if (this.pps.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.isFilling = false;
                                    return;
                                }
                                NalUnitUtil.PpsData ppsData = this.pps.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil.SpsData spsData = this.sps.get(ppsData.seqParameterSetId);
                                if (spsData.separateColorPlaneFlag) {
                                    if (!this.bitArray.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.bitArray.skipBits(2);
                                    }
                                }
                                if (this.bitArray.canReadBits(spsData.frameNumLength)) {
                                    int bits3 = this.bitArray.readBits(spsData.frameNumLength);
                                    if (!spsData.frameMbsOnlyFlag) {
                                        if (this.bitArray.canReadBits(1)) {
                                            boolean bit2 = this.bitArray.readBit();
                                            if (!bit2) {
                                                z11 = bit2;
                                                z12 = false;
                                            } else {
                                                if (!this.bitArray.canReadBits(1)) {
                                                    return;
                                                }
                                                z11 = bit2;
                                                z12 = true;
                                                bit = this.bitArray.readBit();
                                            }
                                            if (this.nalUnitType == 5) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                unsignedExpGolombCodedInt = 0;
                                            } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                return;
                                            } else {
                                                unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                            }
                                            i13 = spsData.picOrderCountType;
                                            if (i13 != 0) {
                                                if (this.bitArray.canReadBits(spsData.picOrderCntLsbLength)) {
                                                    bits = this.bitArray.readBits(spsData.picOrderCntLsbLength);
                                                    if (ppsData.bottomFieldPicOrderInFramePresentFlag || z11) {
                                                        i14 = bits;
                                                        signedExpGolombCodedInt = 0;
                                                    } else {
                                                        if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                            return;
                                                        }
                                                        signedExpGolombCodedInt = this.bitArray.readSignedExpGolombCodedInt();
                                                        i14 = bits;
                                                        i15 = 0;
                                                    }
                                                    signedExpGolombCodedInt2 = i15;
                                                    this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z11, z12, bit, z13, unsignedExpGolombCodedInt, i14, signedExpGolombCodedInt, i15, signedExpGolombCodedInt2);
                                                    this.isFilling = false;
                                                }
                                                return;
                                            }
                                            if (i13 == 1 || spsData.deltaPicOrderAlwaysZeroFlag) {
                                                i14 = 0;
                                                signedExpGolombCodedInt = 0;
                                            } else {
                                                if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                    return;
                                                }
                                                int signedExpGolombCodedInt3 = this.bitArray.readSignedExpGolombCodedInt();
                                                if (!ppsData.bottomFieldPicOrderInFramePresentFlag || z11) {
                                                    i15 = signedExpGolombCodedInt3;
                                                    i14 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                } else {
                                                    if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                        return;
                                                    }
                                                    signedExpGolombCodedInt2 = this.bitArray.readSignedExpGolombCodedInt();
                                                    i15 = signedExpGolombCodedInt3;
                                                    i14 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                            }
                                            this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z11, z12, bit, z13, unsignedExpGolombCodedInt, i14, signedExpGolombCodedInt, i15, signedExpGolombCodedInt2);
                                            this.isFilling = false;
                                            i15 = signedExpGolombCodedInt;
                                            signedExpGolombCodedInt2 = i15;
                                            this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z11, z12, bit, z13, unsignedExpGolombCodedInt, i14, signedExpGolombCodedInt, i15, signedExpGolombCodedInt2);
                                            this.isFilling = false;
                                        }
                                        return;
                                    }
                                    z11 = false;
                                    z12 = false;
                                    bit = z12;
                                    if (this.nalUnitType == 5) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        unsignedExpGolombCodedInt = 0;
                                    } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                        return;
                                    } else {
                                        unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                    }
                                    i13 = spsData.picOrderCountType;
                                    if (i13 != 0) {
                                        if (i13 == 1) {
                                        }
                                        i14 = 0;
                                        signedExpGolombCodedInt = 0;
                                    } else {
                                        if (this.bitArray.canReadBits(spsData.picOrderCntLsbLength)) {
                                            return;
                                        }
                                        bits = this.bitArray.readBits(spsData.picOrderCntLsbLength);
                                        if (ppsData.bottomFieldPicOrderInFramePresentFlag) {
                                        }
                                        i14 = bits;
                                        signedExpGolombCodedInt = 0;
                                    }
                                    i15 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i15;
                                    this.sliceHeader.setAll(spsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z11, z12, bit, z13, unsignedExpGolombCodedInt, i14, signedExpGolombCodedInt, i15, signedExpGolombCodedInt2);
                                    this.isFilling = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean endNalUnit(long j11, int i11, boolean z11) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z11 && this.readingSample) {
                    outputSample(i11 + ((int) (j11 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void startNalUnit(long j11, int i11, long j12, boolean z11) {
            this.nalUnitType = i11;
            this.nalUnitTimeUs = j12;
            this.nalUnitStartPosition = j11;
            this.randomAccessIndicator = z11;
            if (!this.allowNonIdrKeyframes || i11 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }

        public SampleReader(TrackOutput trackOutput, boolean z11, boolean z12) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z11;
            this.detectAccessUnits = z12;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        public void end(long j11) {
            setSampleIsKeyframe();
            this.nalUnitStartPosition = j11;
            outputSample(0);
            this.readingSample = false;
        }
    }

    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    private void endNalUnit(long j11, int i11, int i12, long j12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i12);
            this.pps.endNalUnit(i12);
            if (this.hasOutputFormat) {
                if (this.sps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
                    NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer.nalData, 3, nalUnitTargetBuffer.nalLength);
                    this.seiReader.setReorderingQueueSize(spsNalUnit.maxNumReorderFrames);
                    this.sampleReader.putSps(spsNalUnit);
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength));
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer3.nalData, nalUnitTargetBuffer3.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer4 = this.pps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.nalData, nalUnitTargetBuffer4.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.sps;
                NalUnitUtil.SpsData spsNalUnit2 = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer5.nalData, 3, nalUnitTargetBuffer5.nalLength);
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.pps;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength);
                this.output.format(new Format.Builder().setId(this.formatId).setSampleMimeType("video/avc").setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit2.profileIdc, spsNalUnit2.constraintsFlagsAndReservedZero2Bits, spsNalUnit2.levelIdc)).setWidth(spsNalUnit2.width).setHeight(spsNalUnit2.height).setColorInfo(new ColorInfo.Builder().setColorSpace(spsNalUnit2.colorSpace).setColorRange(spsNalUnit2.colorRange).setColorTransfer(spsNalUnit2.colorTransfer).setLumaBitdepth(spsNalUnit2.bitDepthLumaMinus8 + 8).setChromaBitdepth(spsNalUnit2.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(spsNalUnit2.pixelWidthHeightRatio).setInitializationData(arrayList).setMaxNumReorderSamples(spsNalUnit2.maxNumReorderFrames).build());
                this.hasOutputFormat = true;
                this.seiReader.setReorderingQueueSize(spsNalUnit2.maxNumReorderFrames);
                this.sampleReader.putSps(spsNalUnit2);
                this.sampleReader.putPps(ppsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer7.nalData, nalUnitTargetBuffer7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j12, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j11, i11, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    private void nalUnitData(byte[] bArr, int i11, int i12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i11, i12);
            this.pps.appendToNalUnit(bArr, i11, i12);
        }
        this.sei.appendToNalUnit(bArr, i11, i12);
        this.sampleReader.appendToNalUnit(bArr, i11, i12);
    }

    private void startNalUnit(long j11, int i11, long j12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i11);
            this.pps.startNalUnit(i11);
        }
        this.sei.startNalUnit(i11);
        this.sampleReader.startNalUnit(j11, i11, j12, this.randomAccessIndicator);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.pesTimeUs = j11;
        this.randomAccessIndicator |= (i11 & 2) != 0;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = C2711C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.flush();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    public H264Reader(SeiReader seiReader, boolean z11, boolean z12) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z11;
        this.detectAccessUnits = z12;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i11;
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, iFindNalUnit);
            int i12 = iFindNalUnit - position;
            if (i12 > 0) {
                nalUnitData(data, position, iFindNalUnit);
            }
            int i13 = iLimit - iFindNalUnit;
            long j11 = this.totalBytesWritten - ((long) i13);
            if (i12 < 0) {
                i11 = -i12;
            } else {
                i11 = 0;
            }
            endNalUnit(j11, i13, i11, this.pesTimeUs);
            startNalUnit(j11, nalUnitType, this.pesTimeUs);
            position = iFindNalUnit + 3;
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new SampleReader(trackOutputTrack, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        assertTracksCreated();
        if (z11) {
            this.seiReader.flush();
            this.sampleReader.end(this.totalBytesWritten);
        }
    }
}
