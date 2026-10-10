package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {
    private Format currentFormat;

    @Nullable
    private SubtitleParser currentSubtitleParser;
    private final TrackOutput delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final CueEncoder cueEncoder = new CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray parsableScratch = new ParsableByteArray();

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i11, z11, i12);
        }
        ensureSampleDataCapacity(i11);
        int i13 = dataReader.read(this.sampleData, this.sampleDataEnd, i11);
        if (i13 != -1) {
            this.sampleDataEnd += i13;
            return i13;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    private void ensureSampleDataCapacity(int i11) {
        int length = this.sampleData.length;
        int i12 = this.sampleDataEnd;
        if (length - i12 >= i11) {
            return;
        }
        int i13 = i12 - this.sampleDataStart;
        int iMax = Math.max(i13 * 2, i11 + i13);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i13);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i13;
        this.sampleData = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void outputSample(CuesWithTiming cuesWithTiming, long j11, int i11) {
        Assertions.checkStateNotNull(this.currentFormat);
        byte[] bArrEncode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(bArrEncode);
        this.delegate.sampleData(this.parsableScratch, bArrEncode.length);
        long j12 = cuesWithTiming.startTimeUs;
        if (j12 == C2711C.TIME_UNSET) {
            Assertions.checkState(this.currentFormat.subsampleOffsetUs == Long.MAX_VALUE);
        } else {
            long j13 = this.currentFormat.subsampleOffsetUs;
            j11 = j13 == Long.MAX_VALUE ? j11 + j12 : j12 + j13;
        }
        this.delegate.sampleMetadata(j11, i11, bArrEncode.length, 0, null);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        Assertions.checkNotNull(format.sampleMimeType);
        Assertions.checkArgument(MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        if (this.currentSubtitleParser == null) {
            this.delegate.format(format);
        } else {
            this.delegate.format(format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).build());
        }
    }

    public void resetSubtitleParser() {
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(final long j11, final int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleMetadata(j11, i11, i12, i13, cryptoData);
            return;
        }
        Assertions.checkArgument(cryptoData == null, "DRM on subtitles is not supported");
        int i14 = (this.sampleDataEnd - i13) - i12;
        this.currentSubtitleParser.parse(this.sampleData, i14, i12, SubtitleParser.OutputOptions.allCues(), new Consumer() { // from class: androidx.media3.extractor.text.e
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                this.f3536a.outputSample((CuesWithTiming) obj, j11, i11);
            }
        });
        int i15 = i14 + i12;
        this.sampleDataStart = i15;
        if (i15 == this.sampleDataEnd) {
            this.sampleDataStart = 0;
            this.sampleDataEnd = 0;
        }
    }

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i11, i12);
            return;
        }
        ensureSampleDataCapacity(i11);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i11);
        this.sampleDataEnd += i11;
    }
}
