package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
@Deprecated
public final class SingleSampleMediaChunk extends BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final Format sampleFormat;
    private final int trackType;

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws IOException {
        BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        TrackOutput trackOutputTrack = output.track(0, this.trackType);
        trackOutputTrack.format(this.sampleFormat);
        try {
            long jOpen = this.dataSource.open(this.dataSpec.subrange(this.nextLoadPosition));
            if (jOpen != -1) {
                jOpen += this.nextLoadPosition;
            }
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.dataSource, this.nextLoadPosition, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = trackOutputTrack.sampleData((DataReader) defaultExtractorInput, Integer.MAX_VALUE, true)) {
                this.nextLoadPosition += (long) iSampleData;
            }
            trackOutputTrack.sampleMetadata(this.startTimeUs, 1, (int) this.nextLoadPosition, 0, null);
            DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = true;
        } catch (Throwable th2) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }

    public SingleSampleMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, long j11, long j12, long j13, int i12, Format format2) {
        super(dataSource, dataSpec, format, i11, obj, j11, j12, C2711C.TIME_UNSET, C2711C.TIME_UNSET, j13);
        this.trackType = i12;
        this.sampleFormat = format2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
    }
}
