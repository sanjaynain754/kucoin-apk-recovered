package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface ChunkExtractor {

    public interface TrackOutputProvider {
        TrackOutput track(int i11, int i12);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j11, long j12);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();

    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i11, Format format, boolean z11, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);

        @CanIgnoreReturnValue
        default Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            return this;
        }

        default Format getOutputTextFormat(Format format) {
            return format;
        }

        @CanIgnoreReturnValue
        default Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }
}
