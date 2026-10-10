package androidx.media3.extractor.p021ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.g
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return TsExtractor.m3545a();
        }
    };
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DTS_HD = 136;
    public static final int TS_STREAM_TYPE_DTS_UHD = 139;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MHAS = 45;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final TsDurationReader durationReader;
    private final int extractorFlags;
    private boolean hasOutputSeekMap;

    @Nullable
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private TsBinarySearchSeeker tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // androidx.media3.extractor.p021ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i11 = 0; i11 < iBytesLeft; i11++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int bits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (bits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int bits2 = this.patScratch.readBits(13);
                        if (TsExtractor.this.tsPayloadReaders.get(bits2) == null) {
                            TsExtractor.this.tsPayloadReaders.put(bits2, new SectionReader(TsExtractor.this.new PmtReader(bits2)));
                            TsExtractor.access$108(TsExtractor.this);
                        }
                    }
                }
                if (TsExtractor.this.mode != 2) {
                    TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.p021ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_HD = 14;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_UHD = 33;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

        public PmtReader(int i11) {
            this.pid = i11;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsableByteArray, int i11) {
            int i12;
            int position = parsableByteArray.getPosition();
            int i13 = position + i11;
            int i14 = -1;
            String str = null;
            ArrayList arrayList = null;
            int unsignedByte = 0;
            while (parsableByteArray.getPosition() < i13) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i13) {
                    break;
                }
                if (unsignedByte2 == 5) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    if (unsignedInt == TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        i14 = 129;
                    } else if (unsignedInt == TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                        i14 = 135;
                    } else if (unsignedInt == TsExtractor.AC4_FORMAT_IDENTIFIER) {
                        i14 = 172;
                    } else if (unsignedInt == TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                        i14 = 36;
                    }
                } else if (unsignedByte2 == 106) {
                    i14 = 129;
                } else if (unsignedByte2 == 122) {
                    i14 = 135;
                } else if (unsignedByte2 == 127) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte3 == 21) {
                        i14 = 172;
                    } else if (unsignedByte3 == 14) {
                        i14 = 136;
                    } else if (unsignedByte3 == 33) {
                        i14 = 139;
                    }
                } else {
                    if (unsignedByte2 == 123) {
                        i12 = 138;
                    } else if (unsignedByte2 == 10) {
                        String strTrim = parsableByteArray.readString(3).trim();
                        unsignedByte = parsableByteArray.readUnsignedByte();
                        str = strTrim;
                    } else if (unsignedByte2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (parsableByteArray.getPosition() < position2) {
                            String strTrim2 = parsableByteArray.readString(3).trim();
                            int unsignedByte4 = parsableByteArray.readUnsignedByte();
                            byte[] bArr = new byte[4];
                            parsableByteArray.readBytes(bArr, 0, 4);
                            arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte4, bArr));
                        }
                        arrayList = arrayList2;
                        i14 = 89;
                    } else if (unsignedByte2 == 111) {
                        i12 = 257;
                    }
                    i14 = i12;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i13);
            return new TsPayloadReader.EsInfo(i14, str, unsignedByte, arrayList, Arrays.copyOfRange(parsableByteArray.getData(), position, i13));
        }

        @Override // androidx.media3.extractor.p021ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.mode == 1 || TsExtractor.this.mode == 2 || TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            int i11 = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            this.pmtScratch.skipBits(3);
            int i12 = 13;
            TsExtractor.this.pcrPid = this.pmtScratch.readBits(13);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i13 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, 0, null, Util.EMPTY_BYTE_ARRAY);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (TsExtractor.this.id3Reader != null) {
                    TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
                }
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int iBytesLeft = parsableByteArray.bytesLeft();
            while (iBytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, 5);
                int bits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(i11);
                int bits2 = this.pmtScratch.readBits(i12);
                this.pmtScratch.skipBits(i13);
                int bits3 = this.pmtScratch.readBits(12);
                TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfo2.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i14 = TsExtractor.this.mode == 2 ? bits : bits2;
                if (!TsExtractor.this.trackIds.get(i14)) {
                    TsPayloadReader tsPayloadReaderCreatePayloadReader = (TsExtractor.this.mode == 2 && bits == 21) ? TsExtractor.this.id3Reader : TsExtractor.this.payloadReaderFactory.createPayloadReader(bits, esInfo2);
                    if (TsExtractor.this.mode != 2 || bits2 < this.trackIdToPidScratch.get(i14, 8192)) {
                        this.trackIdToPidScratch.put(i14, bits2);
                        this.trackIdToReaderScratch.put(i14, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = this.trackIdToPidScratch.keyAt(i15);
                int iValueAt = this.trackIdToPidScratch.valueAt(i15);
                TsExtractor.this.trackIds.put(iKeyAt, true);
                TsExtractor.this.trackPids.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i15);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != TsExtractor.this.id3Reader) {
                        tsPayloadReaderValueAt.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    TsExtractor.this.tsPayloadReaders.put(iValueAt, tsPayloadReaderValueAt);
                }
            }
            if (TsExtractor.this.mode == 2) {
                if (TsExtractor.this.tracksEnded) {
                    return;
                }
                TsExtractor.this.output.endTracks();
                TsExtractor.this.remainingPmts = 0;
                TsExtractor.this.tracksEnded = true;
                return;
            }
            TsExtractor.this.tsPayloadReaders.remove(this.pid);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode == 1 ? 0 : TsExtractor.this.remainingPmts - 1;
            if (TsExtractor.this.remainingPmts == 0) {
                TsExtractor.this.output.endTracks();
                TsExtractor.this.tracksEnded = true;
            }
        }

        @Override // androidx.media3.extractor.p021ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    @Deprecated
    public TsExtractor() {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Extractor[] m3545a() {
        return new Extractor[]{new TsExtractor(1, SubtitleParser.Factory.UNSUPPORTED)};
    }

    public TsExtractor(SubtitleParser.Factory factory) {
        this(1, 0, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i11 = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i11 + 1;
        return i11;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Extractor[] m3546b(SubtitleParser.Factory factory) {
        return new Extractor[]{new TsExtractor(factory)};
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i11 = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i11 == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i11);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int iLimit = this.tsPacketBuffer.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i11 = iFindSyncBytePosition + TS_PACKET_SIZE;
        if (i11 <= iLimit) {
            this.bytesSinceLastSync = 0;
            return i11;
        }
        int i12 = this.bytesSinceLastSync + (iFindSyncBytePosition - position);
        this.bytesSinceLastSync = i12;
        if (this.mode != 2 || i12 <= 376) {
            return i11;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void maybeOutputSeekMap(long j11) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() == C2711C.TIME_UNSET) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
            return;
        }
        TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(this.durationReader.getPcrTimestampAdjuster(), this.durationReader.getDurationUs(), j11, this.pcrPid, this.timestampSearchBytes);
        this.tsBinarySearchSeeker = tsBinarySearchSeeker;
        this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.f
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return TsExtractor.m3546b(factory);
            }
        };
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.tsPayloadReaders.put(sparseArrayCreateInitialPayloadReaders.keyAt(i11), sparseArrayCreateInitialPayloadReaders.valueAt(i11));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }

    private boolean shouldConsumePacketPayload(int i11) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i11, false);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.extractorFlags & 1) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i11;
        long length = extractorInput.getLength();
        boolean z11 = this.mode == 2;
        if (this.tracksEnded) {
            if (length != -1 && !z11 && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            for (int i12 = 0; i12 < this.tsPayloadReaders.size(); i12++) {
                TsPayloadReader tsPayloadReaderValueAt = this.tsPayloadReaders.valueAt(i12);
                if (tsPayloadReaderValueAt instanceof PesReader) {
                    PesReader pesReader = (PesReader) tsPayloadReaderValueAt;
                    if (pesReader.canConsumeSynthesizedEmptyPusi(z11)) {
                        pesReader.consume(new ParsableByteArray(), 1);
                    }
                }
            }
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i13 = this.tsPacketBuffer.readInt();
        if ((8388608 & i13) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i14 = (4194304 & i13) != 0 ? 1 : 0;
        int i15 = (2096896 & i13) >> 8;
        boolean z12 = (i13 & 32) != 0;
        TsPayloadReader tsPayloadReader = (i13 & 16) != 0 ? this.tsPayloadReaders.get(i15) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i16 = i13 & 15;
            i11 = 0;
            int i17 = this.continuityCounters.get(i15, i16 - 1);
            this.continuityCounters.put(i15, i16);
            if (i17 == i16) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i16 != ((i17 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        } else {
            i11 = 0;
        }
        if (z12) {
            int unsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i14 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : i11;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z13 = this.tracksEnded;
        if (shouldConsumePacketPayload(i15)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i14);
            this.tsPacketBuffer.setLimit(iLimit);
        }
        if (this.mode != 2 && !z13 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return i11;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i11 = 0; i11 < size; i11++) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i11);
            boolean z11 = timestampAdjuster.getTimestampOffsetUs() == C2711C.TIME_UNSET;
            if (!z11) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z11 = (firstSampleTimestampUs == C2711C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j12) ? false : true;
            }
            if (z11) {
                timestampAdjuster.reset(j12);
            }
        }
        if (j12 != 0 && (tsBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            tsBinarySearchSeeker.setSeekTargetUs(j12);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i12 = 0; i12 < this.tsPayloadReaders.size(); i12++) {
            this.tsPayloadReaders.valueAt(i12).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 940);
        for (int i11 = 0; i11 < 188; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    extractorInput.skipFully(i11);
                    return true;
                }
                if (data[(i12 * TS_PACKET_SIZE) + i11] != 71) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public TsExtractor(int i11, SubtitleParser.Factory factory) {
        this(1, i11, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11) {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i11), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11, int i12, int i13) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i12), i13);
    }

    @Deprecated
    public TsExtractor(int i11, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i12) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, i12);
    }

    public TsExtractor(int i11, int i12, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory2, int i13) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory2);
        this.timestampSearchBytes = i13;
        this.mode = i11;
        this.extractorFlags = i12;
        this.subtitleParserFactory = factory;
        if (i11 != 1 && i11 != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new TsDurationReader(i13);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
