package androidx.media3.extractor.p021ts;

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
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.base.Preconditions;
import java.util.Collections;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class H265Reader implements ElementaryStreamReader {
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private long pesTimeUs = C2711C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstPrefixNalUnit;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingPrefix;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;

        public void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.readingSample = false;
            this.readingPrefix = false;
        }

        public void startNalUnit(long j11, int i11, int i12, long j12, boolean z11) {
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.nalUnitTimeUs = j12;
            this.nalUnitBytesRead = 0;
            this.nalUnitPosition = j11;
            if (!isVclBodyNalUnit(i12)) {
                if (this.readingSample && !this.readingPrefix) {
                    if (z11) {
                        outputSample(i11);
                    }
                    this.readingSample = false;
                }
                if (isPrefixNalUnit(i12)) {
                    this.isFirstPrefixNalUnit = !this.readingPrefix;
                    this.readingPrefix = true;
                }
            }
            boolean z12 = i12 >= 16 && i12 <= 21;
            this.nalUnitHasKeyframeData = z12;
            this.lookingForFirstSliceFlag = z12 || i12 <= 9;
        }

        private static boolean isPrefixNalUnit(int i11) {
            return (32 <= i11 && i11 <= 35) || i11 == 39;
        }

        private static boolean isVclBodyNalUnit(int i11) {
            return i11 < 32 || i11 == 40;
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
            this.output.sampleMetadata(j11, z11 ? 1 : 0, (int) (this.nalUnitPosition - this.samplePosition), i11, null);
        }

        public void end(long j11) {
            this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
            outputSample((int) (j11 - this.nalUnitPosition));
            this.samplePosition = this.nalUnitPosition;
            this.nalUnitPosition = j11;
            outputSample(0);
            this.readingSample = false;
        }

        public void endNalUnit(long j11, int i11, boolean z11) {
            if (this.readingPrefix && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingPrefix = false;
            } else if (this.isFirstPrefixNalUnit || this.isFirstSlice) {
                if (z11 && this.readingSample) {
                    outputSample(i11 + ((int) (j11 - this.nalUnitPosition)));
                }
                this.samplePosition = this.nalUnitPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingSample = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i11, int i12) {
            if (this.lookingForFirstSliceFlag) {
                int i13 = this.nalUnitBytesRead;
                int i14 = (i11 + 2) - i13;
                if (i14 >= i12) {
                    this.nalUnitBytesRead = i13 + (i12 - i11);
                } else {
                    this.isFirstSlice = (bArr[i14] & 128) != 0;
                    this.lookingForFirstSliceFlag = false;
                }
            }
        }

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }
    }

    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    private void endNalUnit(long j11, int i11, int i12, long j12) {
        this.sampleReader.endNalUnit(j11, i11, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.endNalUnit(i12);
            this.sps.endNalUnit(i12);
            this.pps.endNalUnit(i12);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                Format mediaFormat = parseMediaFormat(this.formatId, this.vps, this.sps, this.pps);
                this.output.format(mediaFormat);
                Preconditions.checkState(mediaFormat.maxNumReorderSamples != -1);
                this.seiReader.setReorderingQueueSize(mediaFormat.maxNumReorderSamples);
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j12, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j12, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i11, int i12) {
        this.sampleReader.readNalUnitData(bArr, i11, i12);
        if (!this.hasOutputFormat) {
            this.vps.appendToNalUnit(bArr, i11, i12);
            this.sps.appendToNalUnit(bArr, i11, i12);
            this.pps.appendToNalUnit(bArr, i11, i12);
        }
        this.prefixSei.appendToNalUnit(bArr, i11, i12);
        this.suffixSei.appendToNalUnit(bArr, i11, i12);
    }

    private static Format parseMediaFormat(@Nullable String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3) {
        int i11 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i11 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i11);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength, null);
        NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
        return new Format.Builder().setId(str).setSampleMimeType("video/hevc").setCodecs(h265ProfileTierLevel != null ? CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc) : null).setWidth(h265SpsNalUnit.width).setHeight(h265SpsNalUnit.height).setColorInfo(new ColorInfo.Builder().setColorSpace(h265SpsNalUnit.colorSpace).setColorRange(h265SpsNalUnit.colorRange).setColorTransfer(h265SpsNalUnit.colorTransfer).setLumaBitdepth(h265SpsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(h265SpsNalUnit.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(h265SpsNalUnit.pixelWidthHeightRatio).setMaxNumReorderSamples(h265SpsNalUnit.maxNumReorderPics).setInitializationData(Collections.singletonList(bArr)).build();
    }

    private void startNalUnit(long j11, int i11, int i12, long j12) {
        this.sampleReader.startNalUnit(j11, i11, i12, j12, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.startNalUnit(i12);
            this.sps.startNalUnit(i12);
            this.pps.startNalUnit(i12);
        }
        this.prefixSei.startNalUnit(i12);
        this.suffixSei.startNalUnit(i12);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.pesTimeUs = j11;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = C2711C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.seiReader.flush();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i11;
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int iLimit = parsableByteArray.limit();
            byte[] data = parsableByteArray.getData();
            this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
                if (iFindNalUnit == iLimit) {
                    nalUnitData(data, position, iLimit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(data, iFindNalUnit);
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
                startNalUnit(j11, i13, h265NalUnitType, this.pesTimeUs);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new SampleReader(trackOutputTrack);
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
