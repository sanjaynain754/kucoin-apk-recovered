package androidx.media3.exoplayer.dash;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface DashChunkSource extends ChunkSource {
    void updateManifest(DashManifest dashManifest, int i11);

    void updateTrackSelection(ExoTrackSelection exoTrackSelection);

    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i11, int[] iArr, ExoTrackSelection exoTrackSelection, int i12, long j11, boolean z11, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration);

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
