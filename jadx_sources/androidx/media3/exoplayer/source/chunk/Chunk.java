package androidx.media3.exoplayer.source.chunk;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class Chunk implements Loader.Loadable {
    protected final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long endTimeUs;
    public final long loadTaskId = LoadEventInfo.getNewId();
    public final long startTimeUs;
    public final Format trackFormat;

    @Nullable
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public final long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    public final long getDurationUs() {
        return this.endTimeUs - this.startTimeUs;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    public Chunk(DataSource dataSource, DataSpec dataSpec, int i11, Format format, int i12, @Nullable Object obj, long j11, long j12) {
        this.dataSource = new StatsDataSource(dataSource);
        this.dataSpec = (DataSpec) Assertions.checkNotNull(dataSpec);
        this.type = i11;
        this.trackFormat = format;
        this.trackSelectionReason = i12;
        this.trackSelectionData = obj;
        this.startTimeUs = j11;
        this.endTimeUs = j12;
    }
}
