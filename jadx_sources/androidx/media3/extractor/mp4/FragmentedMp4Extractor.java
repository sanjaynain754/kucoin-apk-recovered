package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class FragmentedMp4Extractor implements Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 64;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";

    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;

    @Nullable
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private boolean isSampleDependedOn;
    private ImmutableList<SniffFailure> lastSniffFailures;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private final ReorderingSeiMessageQueue reorderingSeiMessageQueue;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;

    @Nullable
    private final Track sideloadedTrack;
    private final SubtitleParser.Factory subtitleParserFactory;

    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.b
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.m3529c();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, BuiltinOptions.ArgMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, -101, BuiltinOptions.SplitVOptions, 20, -94, BuiltinOptions.FillOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SegmentSumOptions, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public int getCurrentSampleFlags() {
            int i11;
            if (this.currentlyInFragment) {
                i11 = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            } else {
                i11 = this.moovSampleTable.flags[this.currentSampleIndex];
            }
            return getEncryptionBoxIfEncrypted() != null ? i11 | 1073741824 : i11;
        }

        public long getCurrentSampleOffset() {
            return !this.currentlyInFragment ? this.moovSampleTable.offsets[this.currentSampleIndex] : this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.currentlyInFragment ? this.moovSampleTable.timestampsUs[this.currentSampleIndex] : this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public int getCurrentSampleSize() {
            return !this.currentlyInFragment ? this.moovSampleTable.sizes[this.currentSampleIndex] : this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        @Nullable
        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            int i11 = ((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i11);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i11 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i11;
            int[] iArr = this.fragment.trunLength;
            int i12 = this.currentTrackRunIndex;
            if (i11 != iArr[i12]) {
                return true;
            }
            this.currentTrackRunIndex = i12 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.output.format(trackSampleTable.track.format);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j11) {
            int i11 = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i11 >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i11) > j11) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i11]) {
                    this.firstSampleToOutputIndex = i11;
                }
                i11++;
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            reset(trackSampleTable, defaultSampleValues);
        }

        public int outputSampleEncryptionData(int i11, int i12) {
            ParsableByteArray parsableByteArray;
            boolean z11;
            int i13;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.perSampleIvSize;
            if (length != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            if (!zSampleHasSubsampleEncryptionTable && i12 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            byte[] data = this.encryptionSignalByte.getData();
            if (z11) {
                i13 = 128;
            } else {
                i13 = 0;
            }
            data[0] = (byte) (i13 | length);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, length, 1);
            if (!z11) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data2 = this.scratch.getData();
                data2[0] = 0;
                data2[1] = 1;
                data2[2] = (byte) ((i12 >> 8) & 255);
                data2[3] = (byte) (i12 & 255);
                data2[4] = (byte) ((i11 >> 24) & 255);
                data2[5] = (byte) ((i11 >> 16) & 255);
                data2[6] = (byte) ((i11 >> 8) & 255);
                data2[7] = (byte) (i11 & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return length + 9;
            }
            ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
            int unsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i14 = (unsignedShort * 6) + 2;
            if (i12 != 0) {
                this.scratch.reset(i14);
                byte[] data3 = this.scratch.getData();
                parsableByteArray3.readBytes(data3, 0, i14);
                int i15 = (((data3[2] & 255) << 8) | (data3[3] & 255)) + i12;
                data3[2] = (byte) ((i15 >> 8) & 255);
                data3[3] = (byte) (i15 & 255);
                parsableByteArray3 = this.scratch;
            }
            this.output.sampleData(parsableByteArray3, i14, 1);
            return length + 1 + i14;
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted != null) {
                ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
                int i11 = encryptionBoxIfEncrypted.perSampleIvSize;
                if (i11 != 0) {
                    parsableByteArray.skipBytes(i11);
                }
                if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                    parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
                }
            }
        }
    }

    @Deprecated
    public FragmentedMp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 32, null, null, ImmutableList.m13439of(), null);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private void initExtraTracks() {
        int i11;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i12 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i11] = this.extractorOutput.track(100, 5);
            i13 = 101;
            i11++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i11);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i12 < this.ceaTrackOutputs.length) {
            TrackOutput trackOutputTrack = this.extractorOutput.track(i13, 3);
            trackOutputTrack.format(this.closedCaptionFormats.get(i12));
            this.ceaTrackOutputs[i12] = trackOutputTrack;
            i12++;
            i13++;
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    public static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j11, boolean z11, int i11) {
            this.sampleTimeUs = j11;
            this.sampleTimeIsRelative = z11;
            this.size = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Extractor[] m3528b(SubtitleParser.Factory factory) {
        return new Extractor[]{new FragmentedMp4Extractor(factory)};
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Extractor[] m3529c() {
        return new Extractor[]{new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    private static int checkNonNegative(int i11) throws ParserException {
        if (i11 >= 0) {
            return i11;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i11, null);
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        long[] jArr = track.editListDurations;
        if (jArr != null && jArr.length == 1 && track.editListMediaTimes != null) {
            long j11 = jArr[0];
            if (j11 == 0 || Util.scaleLargeTimestamp(j11, 1000000L, track.movieTimescale) + Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000000L, track.timescale) >= track.durationUs) {
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.c
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return FragmentedMp4Extractor.m3528b(factory);
            }
        };
    }

    private void onContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        int i11 = containerBox.type;
        if (i11 == 1836019574) {
            onMoovContainerAtomRead(containerBox);
        } else if (i11 == 1836019558) {
            onMoofContainerAtomRead(containerBox);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerBox);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        String str;
        String str2;
        long jScaleLargeTimestamp;
        long jScaleLargeTimestamp2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (fullBoxVersion == 0) {
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt2);
            long j11 = this.segmentIndexEarliestPresentationTimeUs;
            long j12 = j11 != C2711C.TIME_UNSET ? j11 + jScaleLargeTimestamp : -9223372036854775807L;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt2);
            unsignedInt = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = j12;
        } else {
            if (fullBoxVersion != 1) {
                Log.m2961w(TAG, "Skipping unsupported emsg version: " + fullBoxVersion);
                return;
            }
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str3, str4, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == C2711C.TIME_UNSET) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jScaleLargeTimestamp, true, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
        if (timestampAdjuster2 != null) {
            jAdjustSampleTimestamp = timestampAdjuster2.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        long j13 = jAdjustSampleTimestamp;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j13, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Mp4Box.LeafBox leafBox, long j11) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafBox);
            return;
        }
        int i11 = leafBox.type;
        if (i11 != 1936286840) {
            if (i11 == 1701671783) {
                onEmsgLeafAtomRead(leafBox.data);
            }
        } else {
            Pair<Long, ChunkIndex> sidx = parseSidx(leafBox.data, j11);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) sidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) sidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        parseMoof(containerBox, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.trackBundles.valueAt(i11).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C2711C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.trackBundles.valueAt(i12).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C2711C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        int i11 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mvex));
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerBox2.leafChildren.size();
        long mehd = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            Mp4Box.LeafBox leafBox = containerBox2.leafChildren.get(i12);
            int i13 = leafBox.type;
            if (i13 == 1953654136) {
                Pair<Integer, DefaultSampleValues> trex = parseTrex(leafBox.data);
                sparseArray.put(((Integer) trex.first).intValue(), (DefaultSampleValues) trex.second);
            } else if (i13 == 1835362404) {
                mehd = parseMehd(leafBox.data);
            }
        }
        List<TrackSampleTable> traks = BoxParser.parseTraks(containerBox, new GaplessInfoHolder(), mehd, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new Function() { // from class: androidx.media3.extractor.mp4.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return this.f3526b.modifyTrack((Track) obj);
            }
        });
        int size2 = traks.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size2);
            while (i11 < size2) {
                TrackSampleTable trackSampleTable = traks.get(i11);
                Track track = trackSampleTable.track;
                this.trackBundles.get(track.f3525id).reset(trackSampleTable, getDefaultSampleValues(sparseArray, track.f3525id));
                i11++;
            }
            return;
        }
        while (i11 < size2) {
            TrackSampleTable trackSampleTable2 = traks.get(i11);
            Track track2 = trackSampleTable2.track;
            this.trackBundles.put(track2.f3525id, new TrackBundle(this.extractorOutput.track(i11, track2.type), trackSampleTable2, getDefaultSampleValues(sparseArray, track2.f3525id)));
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i11++;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j11) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo metadataSampleInfoRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= metadataSampleInfoRemoveFirst.size;
            long jAdjustSampleTimestamp = metadataSampleInfoRemoveFirst.sampleTimeUs;
            if (metadataSampleInfoRemoveFirst.sampleTimeIsRelative) {
                jAdjustSampleTimestamp += j11;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            long j12 = jAdjustSampleTimestamp;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j12, 1, metadataSampleInfoRemoveFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        int size = containerBox.containerChildren.size();
        for (int i12 = 0; i12 < size; i12++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i12);
            if (containerBox2.type == 1953653094) {
                parseTraf(containerBox2, sparseArray, z11, i11, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int i11 = parsableByteArray.readInt();
        if ((BoxParser.parseFullBoxFlags(i11) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            trackFragment.auxiliaryDataPosition += BoxParser.parseFullBoxVersion(i11) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i11;
        int i12 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((BoxParser.parseFullBoxFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt > trackFragment.sampleCount) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + trackFragment.sampleCount, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i11 = 0;
            for (int i13 = 0; i13 < unsignedIntToInt; i13++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i11 += unsignedByte2;
                zArr[i13] = unsignedByte2 > i12;
            }
        } else {
            i11 = unsignedByte * unsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, unsignedByte > i12);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, unsignedIntToInt, trackFragment.sampleCount, false);
        if (i11 > 0) {
            trackFragment.initEncryptionData(i11);
        }
    }

    private static void parseSampleGroups(Mp4Box.ContainerBox containerBox, @Nullable String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i11 = 0; i11 < containerBox.leafChildren.size(); i11++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i11);
            ParsableByteArray parsableByteArray3 = leafBox.data;
            int i12 = leafBox.type;
            if (i12 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i12 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (fullBoxVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int fullBoxVersion2 = BoxParser.parseFullBoxVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (fullBoxVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullBoxVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i13 = (unsignedByte & 240) >> 4;
        int i14 = unsignedByte & 15;
        boolean z11 = parsableByteArray2.readUnsignedByte() == 1;
        if (z11) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z11, str, unsignedByte2, bArr2, i13, i14, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i11, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if ((fullBoxFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (fullBoxFlags & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        if (unsignedIntToInt == trackFragment.sampleCount) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, z11);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + trackFragment.sampleCount, null);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j11) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (fullBoxVersion == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j12 = j11 + unsignedLongToLong2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j13 = j12;
        long jScaleLargeTimestamp2 = jScaleLargeTimestamp;
        int i11 = 0;
        while (i11 < unsignedShort) {
            int i12 = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & i12) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i11] = i12 & Integer.MAX_VALUE;
            jArr[i11] = j13;
            jArr3[i11] = jScaleLargeTimestamp2;
            unsignedLongToLong += unsignedInt2;
            long[] jArr4 = jArr3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
            jArr2[i11] = jScaleLargeTimestamp2 - jArr4[i11];
            parsableByteArray.skipBytes(4);
            j13 += (long) iArr[i11];
            i11++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    @Nullable
    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray, boolean z11) {
        parsableByteArray.setPosition(8);
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        TrackBundle trackBundleValueAt = z11 ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (trackBundleValueAt == null) {
            return null;
        }
        if ((fullBoxFlags & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = trackBundleValueAt.fragment;
            trackFragment.dataPosition = unsignedLongToLong;
            trackFragment.auxiliaryDataPosition = unsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundleValueAt.defaultSampleValues;
        trackBundleValueAt.fragment.header = new DefaultSampleValues((fullBoxFlags & 2) != 0 ? parsableByteArray.readInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (fullBoxFlags & 8) != 0 ? parsableByteArray.readInt() : defaultSampleValues.duration, (fullBoxFlags & 16) != 0 ? parsableByteArray.readInt() : defaultSampleValues.size, (fullBoxFlags & 32) != 0 ? parsableByteArray.readInt() : defaultSampleValues.flags);
        return trackBundleValueAt;
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(TrackBundle trackBundle, int i11, int i12, ParsableByteArray parsableByteArray, int i13) throws ParserException {
        int i14;
        parsableByteArray.setPosition(8);
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        Track track = trackBundle.moovSampleTable.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = (DefaultSampleValues) Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i11] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j11 = trackFragment.dataPosition;
        jArr[i11] = j11;
        if ((fullBoxFlags & 1) != 0) {
            jArr[i11] = j11 + ((long) parsableByteArray.readInt());
        }
        boolean z11 = (fullBoxFlags & 4) != 0;
        int i15 = defaultSampleValues.flags;
        if (z11) {
            i15 = parsableByteArray.readInt();
        }
        boolean z12 = (fullBoxFlags & 256) != 0;
        boolean z13 = (fullBoxFlags & 512) != 0;
        boolean z14 = (fullBoxFlags & 1024) != 0;
        boolean z15 = (fullBoxFlags & 2048) != 0;
        long j12 = isEdtsListDurationForEntireMediaTimeline(track) ? ((long[]) Util.castNonNull(track.editListMediaTimes))[0] : 0L;
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        boolean z16 = z15;
        boolean z17 = track.type == 2 && (i12 & 1) != 0;
        int i16 = i13 + trackFragment.trunLength[i11];
        boolean z18 = z11;
        long j13 = track.timescale;
        long j14 = trackFragment.nextFragmentDecodeTime;
        int i17 = i13;
        while (i17 < i16) {
            int iCheckNonNegative = checkNonNegative(z12 ? parsableByteArray.readInt() : defaultSampleValues.duration);
            int iCheckNonNegative2 = checkNonNegative(z13 ? parsableByteArray.readInt() : defaultSampleValues.size);
            if (z14) {
                i14 = parsableByteArray.readInt();
            } else {
                i14 = (i17 == 0 && z18) ? i15 : defaultSampleValues.flags;
            }
            int i18 = i17;
            long jScaleLargeTimestamp = Util.scaleLargeTimestamp((((long) (z16 ? parsableByteArray.readInt() : 0)) + j14) - j12, 1000000L, j13);
            jArr2[i18] = jScaleLargeTimestamp;
            if (!trackFragment.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i18] = jScaleLargeTimestamp + trackBundle.moovSampleTable.durationUs;
            }
            iArr[i18] = iCheckNonNegative2;
            zArr[i18] = ((i14 >> 16) & 1) == 0 && (!z17 || i18 == 0);
            j14 += (long) iCheckNonNegative;
            i17 = i18 + 1;
            i16 = i16;
            z17 = z17;
        }
        int i19 = i16;
        trackFragment.nextFragmentDecodeTime = j14;
        return i19;
    }

    private static void parseTruns(Mp4Box.ContainerBox containerBox, TrackBundle trackBundle, int i11) throws ParserException {
        List<Mp4Box.LeafBox> list = containerBox.leafChildren;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Mp4Box.LeafBox leafBox = list.get(i14);
            if (leafBox.type == 1953658222) {
                ParsableByteArray parsableByteArray = leafBox.data;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i13 += unsignedIntToInt;
                    i12++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i12, i13);
        int i15 = 0;
        int trun = 0;
        for (int i16 = 0; i16 < size; i16++) {
            Mp4Box.LeafBox leafBox2 = list.get(i16);
            if (leafBox2.type == 1953658222) {
                trun = parseTrun(trackBundle, i15, i11, leafBox2.data, trun);
                i15++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j11) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j11) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j11 = this.atomSize;
        if (j11 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j11 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.atomHeaderBytesRead);
        int i11 = this.atomType;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i12 = 0; i12 < size; i12++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i12).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i13 = this.atomType;
        if (i13 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i13)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException {
        int i11 = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i11);
            onLeafAtomRead(new Mp4Box.LeafBox(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i11);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException {
        int size = this.trackBundles.size();
        long j11 = Long.MAX_VALUE;
        TrackBundle trackBundleValueAt = null;
        for (int i11 = 0; i11 < size; i11++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i11).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j12 = trackFragment.auxiliaryDataPosition;
                if (j12 < j11) {
                    trackBundleValueAt = this.trackBundles.valueAt(i11);
                    j11 = j12;
                }
            }
        }
        if (trackBundleValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j11 - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundleValueAt.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    private boolean readSample(ExtractorInput extractorInput) throws IOException {
        boolean z11;
        int i11;
        boolean z12;
        int iSampleData;
        TrackBundle nextTrackBundle = this.currentTrackBundle;
        int i12 = 0;
        if (nextTrackBundle == null) {
            nextTrackBundle = getNextTrackBundle(this.trackBundles);
            if (nextTrackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (nextTrackBundle.getCurrentSampleOffset() - extractorInput.getPosition());
            if (currentSampleOffset < 0) {
                Log.m2961w(TAG, "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            extractorInput.skipFully(currentSampleOffset);
            this.currentTrackBundle = nextTrackBundle;
        }
        int i13 = 4;
        ?? r11 = 1;
        if (this.parserState == 3) {
            this.sampleSize = nextTrackBundle.getCurrentSampleSize();
            this.isSampleDependedOn = (this.flags & 64) == 0 || !Objects.equals(nextTrackBundle.moovSampleTable.track.format.sampleMimeType, "video/avc");
            if (nextTrackBundle.currentSampleIndex < nextTrackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(this.sampleSize);
                nextTrackBundle.skipSampleEncryptionData();
                if (!nextTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (nextTrackBundle.moovSampleTable.track.sampleTransformation == 1) {
                this.sampleSize -= 8;
                extractorInput.skipFully(8);
            }
            if (MimeTypes.AUDIO_AC4.equals(nextTrackBundle.moovSampleTable.track.format.sampleMimeType)) {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 7);
                Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                nextTrackBundle.output.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        Track track = nextTrackBundle.moovSampleTable.track;
        TrackOutput trackOutput = nextTrackBundle.output;
        long currentSamplePresentationTimeUs = nextTrackBundle.getCurrentSamplePresentationTimeUs();
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            currentSamplePresentationTimeUs = timestampAdjuster.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        if (track.nalUnitLengthFieldLength == 0) {
            z11 = true;
            while (true) {
                int i14 = this.sampleBytesWritten;
                int i15 = this.sampleSize;
                if (i14 >= i15) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((DataReader) extractorInput, i15 - i14, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i16 = track.nalUnitLengthFieldLength;
            int i17 = i16 + 1;
            int i18 = 4 - i16;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i19 = this.sampleCurrentNalBytesRemaining;
                if (i19 == 0) {
                    extractorInput.readFully(data, i18, i17);
                    this.nalPrefix.setPosition(i12);
                    int i21 = this.nalPrefix.readInt();
                    if (i21 < r11) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i21 - 1;
                    this.nalStartCode.setPosition(i12);
                    trackOutput.sampleData(this.nalStartCode, i13);
                    trackOutput.sampleData(this.nalPrefix, r11 == true ? 1 : 0);
                    this.processSeiNalUnitPayload = (this.ceaTrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format, data[i13])) ? i12 : r11 == true ? 1 : 0;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i18;
                    if (!this.isSampleDependedOn && Objects.equals(nextTrackBundle.moovSampleTable.track.format.sampleMimeType, "video/avc") && NalUnitUtil.isH264NalUnitDependedOn(data[i13])) {
                        this.isSampleDependedOn = r11;
                    }
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i19);
                        extractorInput.readFully(this.nalBuffer.getData(), i12, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        iSampleData = this.sampleCurrentNalBytesRemaining;
                        i11 = i13;
                        int iUnescapeStream = NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        ParsableByteArray parsableByteArray = this.nalBuffer;
                        boolean z13 = r11 == true ? 1 : 0;
                        parsableByteArray.setPosition((Objects.equals(track.format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(track.format.codecs, "video/hevc")) ? z13 ? 1 : 0 : 0);
                        this.nalBuffer.setLimit(iUnescapeStream);
                        if (track.format.maxNumReorderSamples != -1) {
                            int maxSize = this.reorderingSeiMessageQueue.getMaxSize();
                            int i22 = track.format.maxNumReorderSamples;
                            if (maxSize != i22) {
                                this.reorderingSeiMessageQueue.setMaxSize(i22);
                            }
                        } else if (this.reorderingSeiMessageQueue.getMaxSize() != 0) {
                            this.reorderingSeiMessageQueue.setMaxSize(0);
                        }
                        this.reorderingSeiMessageQueue.add(currentSamplePresentationTimeUs, this.nalBuffer);
                        z12 = z13;
                        if ((nextTrackBundle.getCurrentSampleFlags() & 4) != 0) {
                            this.reorderingSeiMessageQueue.flush();
                            z12 = z13;
                        }
                    } else {
                        i11 = i13;
                        z12 = r11 == true ? 1 : 0;
                        iSampleData = trackOutput.sampleData((DataReader) extractorInput, i19, (boolean) i12);
                    }
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    i13 = i11;
                    r11 = z12;
                    i12 = 0;
                }
            }
            z11 = r11 == true ? 1 : 0;
        }
        int currentSampleFlags = nextTrackBundle.getCurrentSampleFlags();
        if ((this.flags & 64) != 0 && !this.isSampleDependedOn) {
            currentSampleFlags |= 67108864;
        }
        int i23 = currentSampleFlags;
        TrackEncryptionBox encryptionBoxIfEncrypted = nextTrackBundle.getEncryptionBoxIfEncrypted();
        trackOutput.sampleMetadata(currentSamplePresentationTimeUs, i23, this.sampleSize, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.cryptoData : null);
        outputPendingMetadataSamples(currentSamplePresentationTimeUs);
        if (!nextTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return z11;
    }

    @Override // androidx.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 32) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new TrackBundle(this.extractorOutput.track(0, track.type), new TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i11 = this.parserState;
            if (i11 != 0) {
                if (i11 == 1) {
                    readAtomPayload(extractorInput);
                } else if (i11 == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                this.reorderingSeiMessageQueue.flush();
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        int size = this.trackBundles.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.trackBundles.valueAt(i11).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.reorderingSeiMessageQueue.flush();
        this.pendingSeekTimeUs = j12;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i11) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i11));
    }

    @Nullable
    private static DrmInitData getDrmInitDataFromAtoms(List<Mp4Box.LeafBox> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            Mp4Box.LeafBox leafBox = list.get(i11);
            if (leafBox.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = leafBox.data.getData();
                UUID uuid = PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    Log.m2961w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            TrackBundle trackBundleValueAt = sparseArray.valueAt(i11);
            if ((trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentSampleIndex != trackBundleValueAt.moovSampleTable.sampleCount) && (!trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentTrackRunIndex != trackBundleValueAt.fragment.trunCount)) {
                long currentSampleOffset = trackBundleValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j11) {
                    trackBundle = trackBundleValueAt;
                    j11 = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private static void parseTraf(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        String str;
        TrackBundle tfhd = parseTfhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfhd))).data, sparseArray, z11);
        if (tfhd != null) {
            TrackFragment trackFragment = tfhd.fragment;
            long j11 = trackFragment.nextFragmentDecodeTime;
            boolean z12 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
            tfhd.resetFragmentInfo();
            tfhd.currentlyInFragment = true;
            Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfdt);
            if (leafBoxOfType != null && (i11 & 2) == 0) {
                trackFragment.nextFragmentDecodeTime = parseTfdt(leafBoxOfType.data);
                trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
            } else {
                trackFragment.nextFragmentDecodeTime = j11;
                trackFragment.nextFragmentDecodeTimeIncludesMoov = z12;
            }
            parseTruns(containerBox, tfhd, i11);
            TrackEncryptionBox sampleDescriptionEncryptionBox = tfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Assertions.checkNotNull(trackFragment.header)).sampleDescriptionIndex);
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saiz);
            if (leafBoxOfType2 != null) {
                parseSaiz((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafBoxOfType2.data, trackFragment);
            }
            Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saio);
            if (leafBoxOfType3 != null) {
                parseSaio(leafBoxOfType3.data, trackFragment);
            }
            Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_senc);
            if (leafBoxOfType4 != null) {
                parseSenc(leafBoxOfType4.data, trackFragment);
            }
            if (sampleDescriptionEncryptionBox != null) {
                str = sampleDescriptionEncryptionBox.schemeType;
            } else {
                str = null;
            }
            parseSampleGroups(containerBox, str, trackFragment);
            int size = containerBox.leafChildren.size();
            for (int i12 = 0; i12 < size; i12++) {
                Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i12);
                if (leafBox.type == 1970628964) {
                    parseUuid(leafBox.data, trackFragment, bArr);
                }
            }
        }
    }

    private static boolean shouldParseContainerAtom(int i11) {
        if (i11 != 1836019574 && i11 != 1953653099 && i11 != 1835297121 && i11 != 1835626086 && i11 != 1937007212 && i11 != 1836019558 && i11 != 1953653094 && i11 != 1836475768 && i11 != 1701082227) {
            return false;
        }
        return true;
    }

    private static boolean shouldParseLeafAtom(int i11) {
        if (i11 != 1751411826 && i11 != 1835296868 && i11 != 1836476516 && i11 != 1936286840 && i11 != 1937011556 && i11 != 1937011827 && i11 != 1668576371 && i11 != 1937011555 && i11 != 1937011578 && i11 != 1937013298 && i11 != 1937007471 && i11 != 1668232756 && i11 != 1937011571 && i11 != 1952867444 && i11 != 1952868452 && i11 != 1953196132 && i11 != 1953654136 && i11 != 1953658222 && i11 != 1886614376 && i11 != 1935763834 && i11 != 1935763823 && i11 != 1936027235 && i11 != 1970628964 && i11 != 1935828848 && i11 != 1936158820 && i11 != 1701606260 && i11 != 1835362404 && i11 != 1701671783) {
            return false;
        }
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        ImmutableList<SniffFailure> immutableListM13439of;
        SniffFailure sniffFailureSniffFragmented = Sniffer.sniffFragmented(extractorInput);
        if (sniffFailureSniffFragmented != null) {
            immutableListM13439of = ImmutableList.m13440of(sniffFailureSniffFragmented);
        } else {
            immutableListM13439of = ImmutableList.m13439of();
        }
        this.lastSniffFailures = immutableListM13439of;
        if (sniffFailureSniffFragmented == null) {
            return true;
        }
        return false;
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0, null, null, ImmutableList.m13439of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, null, null, ImmutableList.m13439of(), null);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i11) {
        this(factory, i11, null, null, ImmutableList.m13439of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, null, ImmutableList.m13439of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, ImmutableList.m13439of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, list, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, list, trackOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i11;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.lastSniffFailures = ImmutableList.m13439of();
        this.durationUs = C2711C.TIME_UNSET;
        this.pendingSeekTimeUs = C2711C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C2711C.TIME_UNSET;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
        this.reorderingSeiMessageQueue = new ReorderingSeiMessageQueue(new ReorderingSeiMessageQueue.SeiConsumer() { // from class: androidx.media3.extractor.mp4.d
            @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
            public final void consume(long j11, ParsableByteArray parsableByteArray) {
                CeaUtil.consume(j11, parsableByteArray, this.f3528a.ceaTrackOutputs);
            }
        });
    }

    @Nullable
    public Track modifyTrack(@Nullable Track track) {
        return track;
    }
}
