package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, long j11, long j12, long j13, long j14, long j15) {
        super(dataSource, dataSpec, format, i11, obj, j11, j12, j15);
        this.clippedStartTimeUs = j13;
        this.clippedEndTimeUs = j14;
    }

    public final int getFirstSampleIndex(int i11) {
        return ((int[]) Assertions.checkStateNotNull(this.firstSampleIndices))[i11];
    }

    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
