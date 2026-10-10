package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
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
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Mp4Extractor implements Extractor, SeekMap {

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.g
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.m3532c();
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_READ_EDITABLE_VIDEO_TRACKS = 64;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 32;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private long durationUs;
    private long edvdAtomOffset;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private boolean isSampleDependedOn;
    private ImmutableList<SniffFailure> lastSniffFailures;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private boolean readingEditableVideoTracks;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private long sampleOffsetForEditableVideoTracks;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seekToEdvdAtom;
    private boolean seenFtypAtom;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private final SubtitleParser.Factory subtitleParserFactory;
    private Mp4Track[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Deprecated
    public Mp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 16);
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i11 = 0; i11 < mp4TrackArr.length; i11++) {
            jArr[i11] = new long[mp4TrackArr[i11].sampleTable.sampleCount];
            jArr2[i11] = mp4TrackArr[i11].sampleTable.timestampsUs[0];
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < mp4TrackArr.length) {
            long j12 = Long.MAX_VALUE;
            int i13 = -1;
            for (int i14 = 0; i14 < mp4TrackArr.length; i14++) {
                if (!zArr[i14]) {
                    long j13 = jArr2[i14];
                    if (j13 <= j12) {
                        i13 = i14;
                        j12 = j13;
                    }
                }
            }
            int i15 = iArr[i13];
            long[] jArr3 = jArr[i13];
            jArr3[i15] = j11;
            TrackSampleTable trackSampleTable = mp4TrackArr[i13].sampleTable;
            j11 += (long) trackSampleTable.sizes[i15];
            int i16 = i15 + 1;
            iArr[i13] = i16;
            if (i16 < jArr3.length) {
                jArr2[i13] = trackSampleTable.timestampsUs[i16];
            } else {
                zArr[i13] = true;
                i12++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C2711C.TIME_UNSET));
    }

    private boolean shouldSeekToEdvdAtom(@Nullable Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntryFindMdtaMetadataEntryWithKey;
        if (metadata != null && (this.flags & 64) != 0 && (mdtaMetadataEntryFindMdtaMetadataEntryWithKey = MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_EDITABLE_TRACKS_OFFSET)) != null) {
            long unsignedLongToLong = new ParsableByteArray(mdtaMetadataEntryFindMdtaMetadataEntryWithKey.value).readUnsignedLongToLong();
            if (unsignedLongToLong > 0) {
                this.edvdAtomOffset = unsignedLongToLong;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return getSeekPoints(j11, -1);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        @Nullable
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            TrueHdSampleRechunker trueHdSampleRechunker;
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            if (MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType)) {
                trueHdSampleRechunker = new TrueHdSampleRechunker();
            } else {
                trueHdSampleRechunker = null;
            }
            this.trueHdSampleRechunker = trueHdSampleRechunker;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Extractor[] m3531b(SubtitleParser.Factory factory) {
        return new Extractor[]{new Mp4Extractor(factory)};
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Extractor[] m3532c() {
        return new Extractor[]{new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    private List<Integer> getAuxiliaryTrackTypesForEditableVideoTracks(Metadata metadata) {
        List<Integer> editableTrackTypesFromMap = ((MdtaMetadataEntry) Assertions.checkStateNotNull(MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_EDITABLE_TRACKS_MAP))).getEditableTrackTypesFromMap();
        ArrayList arrayList = new ArrayList(editableTrackTypesFromMap.size());
        for (int i11 = 0; i11 < editableTrackTypesFromMap.size(); i11++) {
            int iIntValue = editableTrackTypesFromMap.get(i11).intValue();
            int i12 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i12 = 3;
                    if (iIntValue != 2) {
                        i12 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i12 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList;
    }

    private int getTrackIndexOfNextReadSample(long j11) {
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        boolean z12 = true;
        long j14 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i13 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i13];
            int i14 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i14 != trackSampleTable.sampleCount) {
                long j15 = trackSampleTable.offsets[i14];
                long j16 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i13][i14];
                long j17 = j15 - j11;
                boolean z13 = j17 < 0 || j17 >= 262144;
                if ((!z13 && z12) || (z13 == z12 && j17 < j14)) {
                    z12 = z13;
                    j13 = j16;
                    i12 = i13;
                    j14 = j17;
                }
                if (j16 < j12) {
                    z11 = z13;
                    j12 = j16;
                    i11 = i13;
                }
            }
            i13++;
        }
        return (j12 == Long.MAX_VALUE || !z11 || j13 < j12 + 10485760) ? i12 : i11;
    }

    private void maybeSetDefaultSampleOffsetForEditableVideoTracks(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntryFindMdtaMetadataEntryWithKey = MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_EDITABLE_TRACKS_SAMPLES_LOCATION);
        if (mdtaMetadataEntryFindMdtaMetadataEntryWithKey == null || mdtaMetadataEntryFindMdtaMetadataEntryWithKey.value[0] != 0) {
            return;
        }
        this.sampleOffsetForEditableVideoTracks = this.edvdAtomOffset + 16;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.e
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return Mp4Extractor.m3531b(factory);
            }
        };
    }

    private void processAtomEnded(long j11) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j11) {
            Mp4Box.ContainerBox containerBoxPop = this.containerAtoms.pop();
            if (containerBoxPop.type == 1836019574) {
                processMoovAtom(containerBoxPop);
                this.containerAtoms.clear();
                if (!this.seekToEdvdAtom) {
                    this.parserState = 2;
                }
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(containerBoxPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Mp4Box.ContainerBox containerBox) throws ParserException {
        List<Integer> list;
        Metadata metadata;
        Metadata metadata2;
        long jMax;
        int i11;
        int i12;
        int i13;
        int i14;
        Mp4Box.ContainerBox containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_meta);
        List<Integer> arrayList = new ArrayList<>();
        if (containerBoxOfType != null) {
            Metadata mdtaFromMeta = BoxParser.parseMdtaFromMeta(containerBoxOfType);
            if (this.readingEditableVideoTracks) {
                Assertions.checkStateNotNull(mdtaFromMeta);
                maybeSetDefaultSampleOffsetForEditableVideoTracks(mdtaFromMeta);
                arrayList = getAuxiliaryTrackTypesForEditableVideoTracks(mdtaFromMeta);
            } else if (shouldSeekToEdvdAtom(mdtaFromMeta)) {
                this.seekToEdvdAtom = true;
                return;
            }
            metadata = mdtaFromMeta;
            list = arrayList;
        } else {
            list = arrayList;
            metadata = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_udta);
        if (leafBoxOfType != null) {
            Metadata udta = BoxParser.parseUdta(leafBoxOfType);
            gaplessInfoHolder.setFromMetadata(udta);
            metadata2 = udta;
        } else {
            metadata2 = null;
        }
        Metadata metadata3 = new Metadata(BoxParser.parseMvhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd))).data));
        List<TrackSampleTable> traks = BoxParser.parseTraks(containerBox, gaplessInfoHolder, C2711C.TIME_UNSET, null, (this.flags & 1) != 0, z11, new Function() { // from class: androidx.media3.extractor.mp4.f
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Mp4Extractor.m3530a((Track) obj);
            }
        });
        if (this.readingEditableVideoTracks) {
            Assertions.checkState(list.size() == traks.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of editable video tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(traks.size())));
        }
        int i15 = 0;
        int i16 = 0;
        long j11 = C2711C.TIME_UNSET;
        int size = -1;
        while (i15 < traks.size()) {
            TrackSampleTable trackSampleTable = traks.get(i15);
            if (trackSampleTable.sampleCount == 0) {
                jMax = j11;
                i12 = i15;
                i11 = i16;
            } else {
                Track track = trackSampleTable.track;
                int i17 = i15;
                long j12 = track.durationUs;
                if (j12 == C2711C.TIME_UNSET) {
                    j12 = trackSampleTable.durationUs;
                }
                jMax = Math.max(j11, j12);
                i11 = i16 + 1;
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i16, track.type));
                int i18 = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? trackSampleTable.maximumSize * 16 : trackSampleTable.maximumSize + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i18);
                if (track.type == 2) {
                    Format format = track.format;
                    int i19 = format.roleFlags;
                    if ((this.flags & 8) != 0) {
                        i13 = i19 | (size == -1 ? 1 : 2);
                    } else {
                        i13 = i19;
                    }
                    if (format.frameRate == -1.0f && j12 > 0 && (i14 = trackSampleTable.sampleCount) > 0) {
                        builderBuildUpon.setFrameRate(i14 / (j12 / 1000000.0f));
                    }
                    if (this.readingEditableVideoTracks) {
                        i13 |= 32768;
                        i12 = i17;
                        builderBuildUpon.setAuxiliaryTrackType(list.get(i12).intValue());
                    } else {
                        i12 = i17;
                    }
                    builderBuildUpon.setRoleFlags(i13);
                } else {
                    i12 = i17;
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, builderBuildUpon);
                MetadataUtil.setFormatMetadata(track.type, metadata, builderBuildUpon, this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries), metadata2, metadata3);
                mp4Track.trackOutput.format(builderBuildUpon.build());
                if (track.type == 2 && size == -1) {
                    size = arrayList2.size();
                }
                arrayList2.add(mp4Track);
            }
            i15 = i12 + 1;
            traks = traks;
            j11 = jMax;
            i16 = i11;
        }
        this.firstVideoTrackIndex = size;
        this.durationUs = j11;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList2.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j11) {
        if (this.atomType == 1836086884) {
            int i11 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j11, C2711C.TIME_UNSET, j11 + ((long) i11), this.atomSize - ((long) i11));
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        Mp4Box.ContainerBox containerBoxPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
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
            if (length == -1 && (containerBoxPeek = this.containerAtoms.peek()) != null) {
                length = containerBoxPeek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j12 = this.atomSize;
            int i11 = this.atomHeaderBytesRead;
            long j13 = (position + j12) - ((long) i11);
            if (j12 != i11 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j13));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j13);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z11;
        long j11 = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j11;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray == null) {
            if (!this.seenFtypAtom && this.atomType == 1835295092) {
                this.fileType = 1;
            }
            if (j11 < 262144) {
                extractorInput.skipFully((int) j11);
            } else {
                positionHolder.position = extractorInput.getPosition() + j11;
                z11 = true;
            }
            processAtomEnded(position);
            if (this.seekToEdvdAtom) {
                this.readingEditableVideoTracks = true;
                positionHolder.position = this.edvdAtomOffset;
                this.seekToEdvdAtom = false;
                z11 = true;
            }
            return (z11 || this.parserState == 2) ? false : true;
        }
        extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j11);
        if (this.atomType == 1718909296) {
            this.seenFtypAtom = true;
            this.fileType = processFtypAtom(parsableByteArray);
        } else if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(new Mp4Box.LeafBox(this.atomType, parsableByteArray));
        }
        z11 = false;
        processAtomEnded(position);
        if (this.seekToEdvdAtom) {
            this.readingEditableVideoTracks = true;
            positionHolder.position = this.edvdAtomOffset;
            this.seekToEdvdAtom = false;
            z11 = true;
        }
        if (z11) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i11;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i12 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j11 = trackSampleTable.offsets[i12] + this.sampleOffsetForEditableVideoTracks;
        int i13 = trackSampleTable.sizes[i12];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j12 = (j11 - position) + ((long) this.sampleBytesRead);
        if (j12 < 0 || j12 >= 262144) {
            positionHolder.position = j11;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j12 += 8;
            i13 -= 8;
        }
        extractorInput.skipFully((int) j12);
        if (!Objects.equals(mp4Track.track.format.sampleMimeType, "video/avc")) {
            this.isSampleDependedOn = true;
        }
        Track track = mp4Track.track;
        Throwable th2 = null;
        if (track.nalUnitLengthFieldLength == 0) {
            if (MimeTypes.AUDIO_AC4.equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i13, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i13 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i14 = this.sampleBytesWritten;
                if (i14 >= i13) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i13 - i14, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i15 = mp4Track.track.nalUnitLengthFieldLength;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.sampleBytesWritten < i13) {
                int i18 = this.sampleCurrentNalBytesRemaining;
                if (i18 == 0) {
                    extractorInput.readFully(data, i17, i16);
                    this.sampleBytesRead += i16;
                    this.nalPrefix.setPosition(0);
                    int i19 = this.nalPrefix.readInt();
                    if (i19 < 1) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th2);
                    }
                    this.sampleCurrentNalBytesRemaining = i19 - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    trackOutput.sampleData(this.nalPrefix, 1);
                    this.sampleBytesWritten += 5;
                    i13 += i17;
                    if (!this.isSampleDependedOn && NalUnitUtil.isH264NalUnitDependedOn(data[4])) {
                        this.isSampleDependedOn = true;
                    }
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i18, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                    th2 = null;
                }
            }
        }
        int i21 = i13;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j13 = trackSampleTable2.timestampsUs[i12];
        int i22 = trackSampleTable2.flags[i12];
        if (!this.isSampleDependedOn) {
            i22 |= 67108864;
        }
        int i23 = i22;
        if (trueHdSampleRechunker != null) {
            i11 = 0;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j13, i23, i21, 0, null);
            if (i12 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
        } else {
            i11 = 0;
            trackOutput.sampleMetadata(j13, i23, i21, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = i11;
        this.sampleBytesWritten = i11;
        this.sampleCurrentNalBytesRemaining = i11;
        this.isSampleDependedOn = (this.flags & 32) != 0 ? i11 : 1;
        return i11;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i11 = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (i11 == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return i11;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j11) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j11);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j11);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    public long[] getSampleTimestampsUs(int i11) {
        Mp4Track[] mp4TrackArr = this.tracks;
        return mp4TrackArr.length <= i11 ? new long[0] : mp4TrackArr[i11].sampleTable.timestampsUs;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    public SeekMap.SeekPoints getSeekPoints(long j11, int i11) {
        long j12;
        long j13;
        long jMaybeAdjustSeekOffset;
        long j14;
        int i12;
        Mp4Track[] mp4TrackArr;
        TrackSampleTable trackSampleTable;
        int indexOfLaterOrEqualSynchronizationSample;
        Mp4Track[] mp4TrackArr2 = this.tracks;
        if (mp4TrackArr2.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i13 = i11 != -1 ? i11 : this.firstVideoTrackIndex;
        if (i13 != -1) {
            TrackSampleTable trackSampleTable2 = mp4TrackArr2[i13].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable2, j11);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            j13 = trackSampleTable2.timestampsUs[synchronizationSampleIndex];
            j12 = trackSampleTable2.offsets[synchronizationSampleIndex];
            if (j13 < j11 && synchronizationSampleIndex < trackSampleTable2.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable2.getIndexOfLaterOrEqualSynchronizationSample(j11)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j14 = trackSampleTable2.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                jMaybeAdjustSeekOffset = trackSampleTable2.offsets[indexOfLaterOrEqualSynchronizationSample];
            }
            if (i11 == -1) {
                i12 = 0;
                while (true) {
                    mp4TrackArr = this.tracks;
                    if (i12 < mp4TrackArr.length) {
                        break;
                    }
                    if (i12 != this.firstVideoTrackIndex) {
                        trackSampleTable = mp4TrackArr[i12].sampleTable;
                        long jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(trackSampleTable, j13, j12);
                        if (j14 != C2711C.TIME_UNSET) {
                            jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable, j14, jMaybeAdjustSeekOffset);
                        }
                        j12 = jMaybeAdjustSeekOffset2;
                    }
                    i12++;
                }
            }
            SeekPoint seekPoint = new SeekPoint(j13, j12);
            return j14 == C2711C.TIME_UNSET ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j14, jMaybeAdjustSeekOffset));
        }
        j12 = Long.MAX_VALUE;
        j13 = j11;
        jMaybeAdjustSeekOffset = -1;
        j14 = -9223372036854775807L;
        if (i11 == -1) {
            i12 = 0;
            while (true) {
                mp4TrackArr = this.tracks;
                if (i12 < mp4TrackArr.length) {
                    break;
                    break;
                }
                if (i12 != this.firstVideoTrackIndex) {
                    trackSampleTable = mp4TrackArr[i12].sampleTable;
                    long jMaybeAdjustSeekOffset3 = maybeAdjustSeekOffset(trackSampleTable, j13, j12);
                    if (j14 != C2711C.TIME_UNSET) {
                        jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable, j14, jMaybeAdjustSeekOffset);
                    }
                    j12 = jMaybeAdjustSeekOffset3;
                }
                i12++;
            }
        }
        SeekPoint seekPoint2 = new SeekPoint(j13, j12);
        if (j14 == C2711C.TIME_UNSET) {
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i11 = this.parserState;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i11 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.isSampleDependedOn = (this.flags & 32) == 0;
        if (j11 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j12);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        SniffFailure sniffFailureSniffUnfragmented = Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
        this.lastSniffFailures = sniffFailureSniffUnfragmented != null ? ImmutableList.m13440of(sniffFailureSniffUnfragmented) : ImmutableList.m13439of();
        return sniffFailureSniffUnfragmented == null;
    }

    @Deprecated
    public Mp4Extractor(int i11) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11);
    }

    private static int brandToFileType(int i11) {
        if (i11 != 1751476579) {
            if (i11 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j11) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j11);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            return trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j11);
        }
        return indexOfEarlierOrEqualSynchronizationSample;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j11, long j12) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j11);
        if (synchronizationSampleIndex == -1) {
            return j12;
        }
        return Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j12);
    }

    private static boolean shouldParseContainerAtom(int i11) {
        if (i11 != 1836019574 && i11 != 1953653099 && i11 != 1835297121 && i11 != 1835626086 && i11 != 1937007212 && i11 != 1701082227 && i11 != 1835365473 && i11 != 1701082724) {
            return false;
        }
        return true;
    }

    private static boolean shouldParseLeafAtom(int i11) {
        if (i11 != 1835296868 && i11 != 1836476516 && i11 != 1751411826 && i11 != 1937011556 && i11 != 1937011827 && i11 != 1937011571 && i11 != 1668576371 && i11 != 1701606260 && i11 != 1937011555 && i11 != 1937011578 && i11 != 1937013298 && i11 != 1937007471 && i11 != 1668232756 && i11 != 1953196132 && i11 != 1718909296 && i11 != 1969517665 && i11 != 1801812339 && i11 != 1768715124) {
            return false;
        }
        return true;
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i11) {
        this.subtitleParserFactory = factory;
        this.flags = i11;
        this.lastSniffFailures = ImmutableList.m13439of();
        this.parserState = (i11 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
        this.isSampleDependedOn = (i11 & 32) == 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Track m3530a(Track track) {
        return track;
    }
}
