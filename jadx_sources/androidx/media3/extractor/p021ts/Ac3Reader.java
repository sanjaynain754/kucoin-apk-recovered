package androidx.media3.extractor.p021ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Ac3Reader implements ElementaryStreamReader {
    private static final int HEADER_SIZE = 128;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private Format format;
    private String formatId;
    private final ParsableBitArray headerScratchBits;
    private final ParsableByteArray headerScratchBytes;

    @Nullable
    private final String language;
    private boolean lastByteWas0B;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public Ac3Reader() {
        this(null, 0);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.lastByteWas0B = false;
        this.timeUs = C2711C.TIME_UNSET;
    }

    public Ac3Reader(@Nullable String str, int i11) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.headerScratchBits = parsableBitArray;
        this.headerScratchBytes = new ParsableByteArray(parsableBitArray.data);
        this.state = 0;
        this.timeUs = C2711C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i11;
    }

    private void parseHeader() {
        this.headerScratchBits.setPosition(0);
        Ac3Util.SyncFrameInfo ac3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.headerScratchBits);
        Format format = this.format;
        if (format == null || ac3SyncframeInfo.channelCount != format.channelCount || ac3SyncframeInfo.sampleRate != format.sampleRate || !Util.areEqual(ac3SyncframeInfo.mimeType, format.sampleMimeType)) {
            Format.Builder peakBitrate = new Format.Builder().setId(this.formatId).setSampleMimeType(ac3SyncframeInfo.mimeType).setChannelCount(ac3SyncframeInfo.channelCount).setSampleRate(ac3SyncframeInfo.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).setPeakBitrate(ac3SyncframeInfo.bitrate);
            if (MimeTypes.AUDIO_AC3.equals(ac3SyncframeInfo.mimeType)) {
                peakBitrate.setAverageBitrate(ac3SyncframeInfo.bitrate);
            }
            Format formatBuild = peakBitrate.build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        this.sampleSize = ac3SyncframeInfo.frameSize;
        this.sampleDurationUs = (((long) ac3SyncframeInfo.sampleCount) * 1000000) / ((long) this.format.sampleRate);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i11 = this.state;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(parsableByteArray, iMin);
                        int i12 = this.bytesRead + iMin;
                        this.bytesRead = i12;
                        if (i12 == this.sampleSize) {
                            Assertions.checkState(this.timeUs != C2711C.TIME_UNSET);
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = 0;
                        }
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 128)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 128);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
                this.headerScratchBytes.getData()[0] = 11;
                this.headerScratchBytes.getData()[1] = BuiltinOptions.UnsortedSegmentMaxOptions;
                this.bytesRead = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.timeUs = j11;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i11) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i11 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i12 = this.bytesRead + iMin;
        this.bytesRead = i12;
        if (i12 == i11) {
            return true;
        }
        return false;
    }

    private boolean skipToNextSync(ParsableByteArray parsableByteArray) {
        while (true) {
            boolean z11 = false;
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (!this.lastByteWas0B) {
                if (parsableByteArray.readUnsignedByte() == 11) {
                    z11 = true;
                }
                this.lastByteWas0B = z11;
            } else {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.lastByteWas0B = false;
                    return true;
                }
                if (unsignedByte == 11) {
                    z11 = true;
                }
                this.lastByteWas0B = z11;
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
    }
}
