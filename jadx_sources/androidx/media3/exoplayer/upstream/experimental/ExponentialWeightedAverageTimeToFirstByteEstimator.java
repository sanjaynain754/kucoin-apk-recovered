package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private long estimateUs;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private final double smoothingFactor;

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, Clock.DEFAULT);
    }

    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i11) {
            this.maxSize = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            if (size() > this.maxSize) {
                return true;
            }
            return false;
        }
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d11) {
        this(d11, Clock.DEFAULT);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, Long.valueOf(Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(DataSpec dataSpec) {
        Long lRemove = this.initializedDataSpecs.remove(dataSpec);
        if (lRemove == null) {
            return;
        }
        long jMsToUs = Util.msToUs(this.clock.elapsedRealtime()) - lRemove.longValue();
        long j11 = this.estimateUs;
        if (j11 == C2711C.TIME_UNSET) {
            this.estimateUs = jMsToUs;
        } else {
            double d11 = this.smoothingFactor;
            this.estimateUs = (long) ((j11 * d11) + ((1.0d - d11) * jMsToUs));
        }
    }

    @VisibleForTesting
    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d11, Clock clock) {
        this.smoothingFactor = d11;
        this.clock = clock;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.estimateUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = C2711C.TIME_UNSET;
    }
}
