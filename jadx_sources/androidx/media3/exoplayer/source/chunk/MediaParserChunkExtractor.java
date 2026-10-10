package androidx.media3.exoplayer.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.C3359k;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(30)
@UnstableApi
public final class MediaParserChunkExtractor implements ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = new Factory();
    private static final String TAG = "MediaPrsrChunkExtractor";
    private final DiscardingTrackOutput discardingTrackOutput;
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;

    @Nullable
    private Format[] sampleFormats;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final TrackOutputProviderAdapter trackOutputProviderAdapter;

    public static class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @Nullable
        public ChunkExtractor createProgressiveMediaExtractor(int i11, Format format, boolean z11, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId) {
            if (!MimeTypes.isText(format.containerMimeType)) {
                return new MediaParserChunkExtractor(i11, format, list, playerId);
            }
            if (this.parseSubtitlesDuringExtraction) {
                return new BundledChunkExtractor(new SubtitleExtractor(this.subtitleParserFactory.create(format), format), i11, format);
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @CanIgnoreReturnValue
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
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

    public class TrackOutputProviderAdapter implements ExtractorOutput {
        private TrackOutputProviderAdapter() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaParserChunkExtractor mediaParserChunkExtractor = MediaParserChunkExtractor.this;
            mediaParserChunkExtractor.sampleFormats = mediaParserChunkExtractor.outputConsumerAdapter.getSampleFormats();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i11, int i12) {
            return MediaParserChunkExtractor.this.trackOutputProvider != null ? MediaParserChunkExtractor.this.trackOutputProvider.track(i11, i12) : MediaParserChunkExtractor.this.discardingTrackOutput;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }
    }

    private void maybeExecutePendingSeek() {
        MediaParser.SeekMap dummySeekMap = this.outputConsumerAdapter.getDummySeekMap();
        long j11 = this.pendingSeekUs;
        if (j11 == C2711C.TIME_UNSET || dummySeekMap == null) {
            return;
        }
        this.mediaParser.seek(C3359k.m3415a(dummySeekMap.getSeekPoints(j11).first));
        this.pendingSeekUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.outputConsumerAdapter.getChunkIndex();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j11, long j12) {
        this.trackOutputProvider = trackOutputProvider;
        this.outputConsumerAdapter.setSampleTimestampUpperLimitFilterUs(j12);
        this.outputConsumerAdapter.setExtractorOutput(this.trackOutputProviderAdapter);
        this.pendingSeekUs = j11;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.mediaParser.release();
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int i11, Format format, List<Format> list, PlayerId playerId) {
        String str;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(format, i11, true);
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        if (MimeTypes.isMatroska((String) Assertions.checkNotNull(format.containerMimeType))) {
            str = "android.media.mediaparser.MatroskaParser";
        } else {
            str = "android.media.mediaparser.FragmentedMp4Parser";
        }
        outputConsumerAdapterV30.setSelectedParserName(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, outputConsumerAdapterV30);
        this.mediaParser = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_DUMMY_SEEK_MAP, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, bool);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(MediaParserUtil.toCaptionsMediaFormat(list.get(i12)));
        }
        this.mediaParser.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, arrayList);
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
        this.outputConsumerAdapter.setMuxedCaptionFormats(list);
        this.trackOutputProviderAdapter = new TrackOutputProviderAdapter();
        this.discardingTrackOutput = new DiscardingTrackOutput();
        this.pendingSeekUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        maybeExecutePendingSeek();
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }
}
