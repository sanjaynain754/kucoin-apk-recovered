package androidx.media3.extractor.p021ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.Ints;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DtsReader implements ElementaryStreamReader {
    private static final int CORE_HEADER_SIZE = 18;
    static final int EXTSS_HEADER_SIZE_MAX = 4096;
    static final int FTOC_MAX_HEADER_SIZE = 5408;
    private static final int STATE_FINDING_EXTSS_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_FINDING_UHD_HEADER_SIZE = 4;
    private static final int STATE_READING_CORE_HEADER = 1;
    private static final int STATE_READING_EXTSS_HEADER = 3;
    private static final int STATE_READING_SAMPLE = 6;
    private static final int STATE_READING_UHD_HEADER = 5;
    private int bytesRead;
    private Format format;
    private String formatId;
    private int frameType;
    private final ParsableByteArray headerScratchBytes;

    @Nullable
    private final String language;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int syncBytes;
    private int state = 0;
    private long timeUs = C2711C.TIME_UNSET;
    private final AtomicInteger uhdAudioChunkId = new AtomicInteger();
    private int extensionSubstreamHeaderSize = -1;
    private int uhdHeaderSize = -1;

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = C2711C.TIME_UNSET;
        this.uhdAudioChunkId.set(0);
    }

    private void parseCoreHeader() {
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            Format dtsFormat = DtsUtil.parseDtsFormat(data, this.formatId, this.language, this.roleFlags, null);
            this.format = dtsFormat;
            this.output.format(dtsFormat);
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = Ints.checkedCast(Util.sampleCountToDurationUs(DtsUtil.parseDtsAudioSampleCount(data), this.format.sampleRate));
    }

    private void parseExtensionSubstreamHeader() throws ParserException {
        DtsUtil.DtsHeader dtsHdHeader = DtsUtil.parseDtsHdHeader(this.headerScratchBytes.getData());
        updateFormatWithDtsHeaderInfo(dtsHdHeader);
        this.sampleSize = dtsHdHeader.frameSize;
        long j11 = dtsHdHeader.frameDurationUs;
        if (j11 == C2711C.TIME_UNSET) {
            j11 = 0;
        }
        this.sampleDurationUs = j11;
    }

    private void parseUhdHeader() throws ParserException {
        DtsUtil.DtsHeader dtsUhdHeader = DtsUtil.parseDtsUhdHeader(this.headerScratchBytes.getData(), this.uhdAudioChunkId);
        if (this.frameType == 3) {
            updateFormatWithDtsHeaderInfo(dtsUhdHeader);
        }
        this.sampleSize = dtsUhdHeader.frameSize;
        long j11 = dtsUhdHeader.frameDurationUs;
        if (j11 == C2711C.TIME_UNSET) {
            j11 = 0;
        }
        this.sampleDurationUs = j11;
    }

    private void updateFormatWithDtsHeaderInfo(DtsUtil.DtsHeader dtsHeader) {
        int i11;
        int i12 = dtsHeader.sampleRate;
        if (i12 == -2147483647 || (i11 = dtsHeader.channelCount) == -1) {
            return;
        }
        Format format = this.format;
        if (format != null && i11 == format.channelCount && i12 == format.sampleRate && Util.areEqual(dtsHeader.mimeType, format.sampleMimeType)) {
            return;
        }
        Format format2 = this.format;
        Format formatBuild = (format2 == null ? new Format.Builder() : format2.buildUpon()).setId(this.formatId).setSampleMimeType(dtsHeader.mimeType).setChannelCount(dtsHeader.channelCount).setSampleRate(dtsHeader.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
        this.format = formatBuild;
        this.output.format(formatBuild);
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            switch (this.state) {
                case 0:
                    if (skipToNextSyncWord(parsableByteArray)) {
                        int i11 = this.frameType;
                        if (i11 == 3 || i11 == 4) {
                            this.state = 4;
                        } else if (i11 != 1) {
                            this.state = 2;
                        } else {
                            this.state = 1;
                        }
                    }
                    break;
                case 1:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                        parseCoreHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, 18);
                        this.state = 6;
                    }
                    break;
                case 2:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 7)) {
                        this.extensionSubstreamHeaderSize = DtsUtil.parseDtsHdHeaderSize(this.headerScratchBytes.getData());
                        this.state = 3;
                    }
                    break;
                case 3:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.extensionSubstreamHeaderSize)) {
                        parseExtensionSubstreamHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.extensionSubstreamHeaderSize);
                        this.state = 6;
                    }
                    break;
                case 4:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 6)) {
                        int dtsUhdHeaderSize = DtsUtil.parseDtsUhdHeaderSize(this.headerScratchBytes.getData());
                        this.uhdHeaderSize = dtsUhdHeaderSize;
                        int i12 = this.bytesRead;
                        if (i12 > dtsUhdHeaderSize) {
                            int i13 = i12 - dtsUhdHeaderSize;
                            this.bytesRead = i12 - i13;
                            parsableByteArray.setPosition(parsableByteArray.getPosition() - i13);
                        }
                        this.state = 5;
                    }
                    break;
                case 5:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.uhdHeaderSize)) {
                        parseUhdHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.uhdHeaderSize);
                        this.state = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, iMin);
                    int i14 = this.bytesRead + iMin;
                    this.bytesRead = i14;
                    if (i14 == this.sampleSize) {
                        Assertions.checkState(this.timeUs != C2711C.TIME_UNSET);
                        this.output.sampleMetadata(this.timeUs, this.frameType == 4 ? 0 : 1, this.sampleSize, 0, null);
                        this.timeUs += this.sampleDurationUs;
                        this.state = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.timeUs = j11;
    }

    public DtsReader(@Nullable String str, int i11, int i12) {
        this.headerScratchBytes = new ParsableByteArray(new byte[i12]);
        this.language = str;
        this.roleFlags = i11;
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

    private boolean skipToNextSyncWord(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i11 = this.syncBytes << 8;
            this.syncBytes = i11;
            int unsignedByte = i11 | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            int frameType = DtsUtil.getFrameType(unsignedByte);
            this.frameType = frameType;
            if (frameType != 0) {
                byte[] data = this.headerScratchBytes.getData();
                int i12 = this.syncBytes;
                data[0] = (byte) ((i12 >> 24) & 255);
                data[1] = (byte) ((i12 >> 16) & 255);
                data[2] = (byte) ((i12 >> 8) & 255);
                data[3] = (byte) (i12 & 255);
                this.bytesRead = 4;
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
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
