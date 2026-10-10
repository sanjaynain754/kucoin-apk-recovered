package androidx.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final Factory FACTORY = new Factory();
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs = new SparseArray<>();
    private long endTimeUs;
    private final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public static final class BindingTrackOutput implements TrackOutput {
        private long endTimeUs;
        private final DiscardingTrackOutput fakeTrackOutput = new DiscardingTrackOutput();

        /* JADX INFO: renamed from: id */
        private final int f3346id;

        @Nullable
        private final Format manifestFormat;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
            return ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(dataReader, i11, z11);
        }

        public void bind(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j11) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j11;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.f3346id, this.type);
            this.trackOutput = trackOutputTrack;
            Format format = this.sampleFormat;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            ((TrackOutput) Util.castNonNull(this.trackOutput)).format(this.sampleFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(parsableByteArray, i11);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            long j12 = this.endTimeUs;
            if (j12 != C2711C.TIME_UNSET && j11 >= j12) {
                this.trackOutput = this.fakeTrackOutput;
            }
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(j11, i11, i12, i13, cryptoData);
        }

        public BindingTrackOutput(int i11, int i12, @Nullable Format format) {
            this.f3346id = i11;
            this.type = i12;
            this.manifestFormat = format;
        }
    }

    public static final class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private boolean parseWithinGopSampleDependencies;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @Nullable
        public ChunkExtractor createProgressiveMediaExtractor(int i11, Format format, boolean z11, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId) {
            Extractor fragmentedMp4Extractor;
            String str = format.containerMimeType;
            if (!MimeTypes.isText(str)) {
                if (MimeTypes.isMatroska(str)) {
                    fragmentedMp4Extractor = new MatroskaExtractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    fragmentedMp4Extractor = new JpegExtractor(1);
                } else if (Objects.equals(str, "image/png")) {
                    fragmentedMp4Extractor = new PngExtractor();
                } else {
                    int i12 = z11 ? 4 : 0;
                    if (!this.parseSubtitlesDuringExtraction) {
                        i12 |= 32;
                    }
                    if (this.parseWithinGopSampleDependencies) {
                        i12 |= 64;
                    }
                    fragmentedMp4Extractor = new FragmentedMp4Extractor(this.subtitleParserFactory, i12, null, null, list, trackOutput);
                }
            } else {
                if (!this.parseSubtitlesDuringExtraction) {
                    return null;
                }
                fragmentedMp4Extractor = new SubtitleExtractor(this.subtitleParserFactory.create(format), format);
            }
            return new BundledChunkExtractor(fragmentedMp4Extractor, i11, format);
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @CanIgnoreReturnValue
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory experimentalParseWithinGopSampleDependencies(boolean z11) {
            this.parseWithinGopSampleDependencies = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Format getOutputTextFormat(Format format) {
            String str;
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
                return format;
            }
            Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format.sampleMimeType);
            if (format.codecs != null) {
                str = C33627eb.f69716f + format.codecs;
            } else {
                str = "";
            }
            sb2.append(str);
            return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
            return this;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i11 = 0; i11 < this.bindingTrackOutputs.size(); i11++) {
            formatArr[i11] = (Format) Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i11).sampleFormat);
        }
        this.sampleFormats = formatArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.seekMap;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j11, long j12) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j12;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j11 != C2711C.TIME_UNSET) {
                this.extractor.seek(0L, j11);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j11 == C2711C.TIME_UNSET) {
            j11 = 0;
        }
        extractor.seek(0L, j11);
        for (int i11 = 0; i11 < this.bindingTrackOutputs.size(); i11++) {
            this.bindingTrackOutputs.valueAt(i11).bind(trackOutputProvider, j12);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        int i11 = this.extractor.read(extractorInput, POSITION_HOLDER);
        Assertions.checkState(i11 != 1);
        return i11 == 0;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i11);
        if (bindingTrackOutput == null) {
            Assertions.checkState(this.sampleFormats == null);
            bindingTrackOutput = new BindingTrackOutput(i11, i12, i12 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            bindingTrackOutput.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i11, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }

    public BundledChunkExtractor(Extractor extractor, int i11, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i11;
        this.primaryTrackManifestFormat = format;
    }
}
