package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class SplitParallelSampleBandwidthEstimator implements BandwidthEstimator {
    private long bandwidthEstimate;
    private final BandwidthStatistic bandwidthStatistic;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private long lastReportedBandwidthEstimate;
    private final long minBytesTransferred;
    private final int minSamples;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private int streamCount;
    private long totalBytesTransferred;
    private int totalSamplesAdded;

    public static class Builder {
        private BandwidthStatistic bandwidthStatistic = new SlidingWeightedAverageBandwidthStatistic();
        private Clock clock = Clock.DEFAULT;
        private long minBytesTransferred;
        private int minSamples;

        public SplitParallelSampleBandwidthEstimator build() {
            return new SplitParallelSampleBandwidthEstimator(this);
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinBytesTransferred(long j11) {
            Assertions.checkArgument(j11 >= 0);
            this.minBytesTransferred = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinSamples(int i11) {
            Assertions.checkArgument(i11 >= 0);
            this.minSamples = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthStatistic(BandwidthStatistic bandwidthStatistic) {
            Assertions.checkNotNull(bandwidthStatistic);
            this.bandwidthStatistic = bandwidthStatistic;
            return this;
        }
    }

    private SplitParallelSampleBandwidthEstimator(Builder builder) {
        this.bandwidthStatistic = builder.bandwidthStatistic;
        this.minSamples = builder.minSamples;
        this.minBytesTransferred = builder.minBytesTransferred;
        this.clock = builder.clock;
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.lastReportedBandwidthEstimate = Long.MIN_VALUE;
    }

    private void maybeNotifyBandwidthSample(int i11, long j11, long j12) {
        if (j12 != Long.MIN_VALUE) {
            if (i11 == 0 && j11 == 0 && j12 == this.lastReportedBandwidthEstimate) {
                return;
            }
            this.lastReportedBandwidthEstimate = j12;
            this.eventDispatcher.bandwidthSample(i11, j11, j12);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onBytesTransferred(DataSource dataSource, int i11) {
        long j11 = i11;
        this.sampleBytesTransferred += j11;
        this.totalBytesTransferred += j11;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onNetworkTypeChange(long j11) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, j11);
        this.bandwidthStatistic.reset();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.sampleStartTimeMs = jElapsedRealtime;
        this.sampleBytesTransferred = 0L;
        this.totalSamplesAdded = 0;
        this.totalBytesTransferred = 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferEnd(DataSource dataSource) {
        Assertions.checkState(this.streamCount > 0);
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long j11 = (int) (jElapsedRealtime - this.sampleStartTimeMs);
        if (j11 > 0) {
            this.bandwidthStatistic.addSample(this.sampleBytesTransferred, 1000 * j11);
            int i11 = this.totalSamplesAdded + 1;
            this.totalSamplesAdded = i11;
            if (i11 > this.minSamples && this.totalBytesTransferred > this.minBytesTransferred) {
                this.bandwidthEstimate = this.bandwidthStatistic.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) j11, this.sampleBytesTransferred, this.bandwidthEstimate);
            this.sampleStartTimeMs = jElapsedRealtime;
            this.sampleBytesTransferred = 0L;
        }
        this.streamCount--;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferStart(DataSource dataSource) {
        if (this.streamCount == 0) {
            this.sampleStartTimeMs = this.clock.elapsedRealtime();
        }
        this.streamCount++;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferInitializing(DataSource dataSource) {
    }
}
