package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    public ExponentialWeightedAverageStatistic(double d11) {
        this.smoothingFactor = d11;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j11, long j12) {
        long j13 = (8000000 * j11) / j12;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j13;
        } else {
            double dPow = Math.pow(this.smoothingFactor, Math.sqrt(j11));
            this.bitrateEstimate = (long) ((this.bitrateEstimate * dPow) + ((1.0d - dPow) * j13));
        }
    }
}
