package androidx.media3.extractor.ogg;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;
    private final OggPacket oggPacket = new OggPacket();
    private SetupData setupData = new SetupData();

    public static class SetupData {
        Format format;
        OggSeeker oggSeeker;
    }

    public static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(C2711C.TIME_UNSET);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public void startSeek(long j11) {
        }
    }

    private boolean readHeaders(ExtractorInput extractorInput) throws IOException {
        while (this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            if (!readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData)) {
                return true;
            }
            this.payloadStartPosition = extractorInput.getPosition();
        }
        this.state = 3;
        return false;
    }

    public abstract long preparePayload(ParsableByteArray parsableByteArray);

    public abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j11, SetupData setupData) throws IOException;

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private int readPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long j11 = this.oggSeeker.read(extractorInput);
        if (j11 >= 0) {
            positionHolder.position = j11;
            return 1;
        }
        if (j11 < -1) {
            onSeekEnd(-(j11 + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap((SeekMap) Assertions.checkStateNotNull(this.oggSeeker.createSeekMap()));
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        ParsableByteArray payload = this.oggPacket.getPayload();
        long jPreparePayload = preparePayload(payload);
        if (jPreparePayload >= 0) {
            long j12 = this.currentGranule;
            if (j12 + jPreparePayload >= this.targetGranule) {
                long jConvertGranuleToTime = convertGranuleToTime(j12);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(jConvertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += jPreparePayload;
        return 0;
    }

    public long convertTimeToGranule(long j11) {
        return (((long) this.sampleRate) * j11) / 1000000;
    }

    public void init(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    public void onSeekEnd(long j11) {
        this.currentGranule = j11;
    }

    public void reset(boolean z11) {
        if (z11) {
            this.setupData = new SetupData();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    public final void seek(long j11, long j12) {
        this.oggPacket.reset();
        if (j11 == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = convertTimeToGranule(j12);
            ((OggSeeker) Util.castNonNull(this.oggSeeker)).startSeek(this.targetGranule);
            this.state = 2;
        }
    }

    private int readHeadersAndUpdateState(ExtractorInput extractorInput) throws IOException {
        boolean z11;
        if (!readHeaders(extractorInput)) {
            return -1;
        }
        Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        OggSeeker oggSeeker = this.setupData.oggSeeker;
        if (oggSeeker != null) {
            this.oggSeeker = oggSeeker;
        } else if (extractorInput.getLength() == -1) {
            this.oggSeeker = new UnseekableOggSeeker();
        } else {
            OggPageHeader pageHeader = this.oggPacket.getPageHeader();
            if ((pageHeader.type & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.oggSeeker = new DefaultOggSeeker(this, this.payloadStartPosition, extractorInput.getLength(), pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition, z11);
        }
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    public long convertGranuleToTime(long j11) {
        return (j11 * 1000000) / ((long) this.sampleRate);
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i11 = this.state;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                Util.castNonNull(this.oggSeeker);
                return readPayload(extractorInput, positionHolder);
            }
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        return readHeadersAndUpdateState(extractorInput);
    }
}
