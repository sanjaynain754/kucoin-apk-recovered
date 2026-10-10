package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface BandwidthStatistic {
    void addSample(long j11, long j12);

    long getBandwidthEstimate();

    void reset();
}
