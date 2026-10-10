package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DashUtil {
    public static DataSpec buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i11, Map<String, String> map) {
        return new DataSpec.Builder().setUri(rangedUri.resolveUri(str)).setPosition(rangedUri.start).setLength(rangedUri.length).setKey(resolveCacheKey(representation, rangedUri)).setFlags(i11).setHttpRequestHeaders(map).build();
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i11, Representation representation, int i12) throws IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i11, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i12, true);
            return chunkExtractorNewChunkExtractor.getChunkIndex();
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    @Nullable
    public static Format loadFormatWithDrmInitData(DataSource dataSource, Period period) throws IOException {
        int i11 = 2;
        Representation firstRepresentation = getFirstRepresentation(period, 2);
        if (firstRepresentation == null) {
            i11 = 1;
            firstRepresentation = getFirstRepresentation(period, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        Format format = firstRepresentation.format;
        Format formatLoadSampleFormat = loadSampleFormat(dataSource, i11, firstRepresentation);
        return formatLoadSampleFormat == null ? format : formatLoadSampleFormat.withManifestFormatInfo(format);
    }

    private static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, int i11, boolean z11) throws IOException {
        RangedUri rangedUri = (RangedUri) Assertions.checkNotNull(representation.getInitializationUri());
        if (z11) {
            RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return;
            }
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(indexUri, representation.baseUrls.get(i11).url);
            if (rangedUriAttemptMerge == null) {
                loadInitializationData(dataSource, representation, i11, chunkExtractor, rangedUri);
                rangedUri = indexUri;
            } else {
                rangedUri = rangedUriAttemptMerge;
            }
        }
        loadInitializationData(dataSource, representation, i11, chunkExtractor, rangedUri);
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int i11, Representation representation, int i12) throws IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i11, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i12, false);
            return ((Format[]) Assertions.checkStateNotNull(chunkExtractorNewChunkExtractor.getSampleFormats()))[0];
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) throws IOException {
        return (DashManifest) ParsingLoadable.load(dataSource, new DashManifestParser(), uri, 4);
    }

    private static ChunkExtractor newChunkExtractor(int i11, Format format) {
        String str = format.containerMimeType;
        return new BundledChunkExtractor((str == null || !(str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM))) ? new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32) : new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2), i11, format);
    }

    private DashUtil() {
    }

    @Nullable
    private static Representation getFirstRepresentation(Period period, int i11) {
        int adaptationSetIndex = period.getAdaptationSetIndex(i11);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String resolveCacheKey(Representation representation, RangedUri rangedUri) {
        String cacheKey = representation.getCacheKey();
        if (cacheKey != null) {
            return cacheKey;
        }
        return rangedUri.resolveUri(representation.baseUrls.get(0).url).toString();
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, boolean z11) throws IOException {
        loadInitializationData(chunkExtractor, dataSource, representation, 0, z11);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i11, Representation representation) throws IOException {
        return loadChunkIndex(dataSource, i11, representation, 0);
    }

    private static void loadInitializationData(DataSource dataSource, Representation representation, int i11, ChunkExtractor chunkExtractor, RangedUri rangedUri) throws IOException {
        new InitializationChunk(dataSource, buildDataSpec(representation, representation.baseUrls.get(i11).url, rangedUri, 0, ImmutableMap.m13458of()), representation.format, 0, null, chunkExtractor).load();
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int i11, Representation representation) throws IOException {
        return loadSampleFormat(dataSource, i11, representation, 0);
    }

    @Deprecated
    public static DataSpec buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i11) {
        return buildDataSpec(representation, str, rangedUri, i11, ImmutableMap.m13458of());
    }

    @Deprecated
    public static DataSpec buildDataSpec(Representation representation, RangedUri rangedUri, int i11) {
        return buildDataSpec(representation, representation.baseUrls.get(0).url, rangedUri, i11, ImmutableMap.m13458of());
    }
}
