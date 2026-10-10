package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ContainerMediaChunk extends BaseMediaChunk {
    private final int chunkCount;
    private final ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    private void maybeWriteEmptySamples(BaseMediaChunkOutput baseMediaChunkOutput) {
        if (MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            Format format = this.trackFormat;
            int i11 = format.tileCountHorizontal;
            if ((i11 <= 1 && format.tileCountVertical <= 1) || i11 == -1 || format.tileCountVertical == -1) {
                return;
            }
            TrackOutput trackOutputTrack = baseMediaChunkOutput.track(0, 4);
            Format format2 = this.trackFormat;
            int i12 = format2.tileCountHorizontal * format2.tileCountVertical;
            long j11 = (this.endTimeUs - this.startTimeUs) / ((long) i12);
            for (int i13 = 1; i13 < i12; i13++) {
                trackOutputTrack.sampleData(new ParsableByteArray(), 0);
                trackOutputTrack.sampleMetadata(((long) i13) * j11, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + ((long) this.chunkCount);
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, long j11, long j12, long j13, long j14, long j15, int i12, long j16, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i11, obj, j11, j12, j13, j14, j15);
        this.chunkCount = i12;
        this.sampleOffsetUs = j16;
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws IOException {
        long j11;
        BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            ChunkExtractor chunkExtractor = this.chunkExtractor;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j12 = this.clippedStartTimeUs;
            long j13 = C2711C.TIME_UNSET;
            if (j12 == C2711C.TIME_UNSET) {
                j11 = -9223372036854775807L;
            } else {
                j11 = j12 - this.sampleOffsetUs;
            }
            long j14 = this.clippedEndTimeUs;
            if (j14 != C2711C.TIME_UNSET) {
                j13 = j14 - this.sampleOffsetUs;
            }
            chunkExtractor.init(trackOutputProvider, j11, j13);
        }
        try {
            DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    throw th2;
                }
            } while (this.chunkExtractor.read(defaultExtractorInput));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (Throwable th3) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th3;
        }
    }

    public ChunkExtractor.TrackOutputProvider getTrackOutputProvider(BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }
}
