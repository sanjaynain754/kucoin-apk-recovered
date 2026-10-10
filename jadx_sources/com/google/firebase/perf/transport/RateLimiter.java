package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.p070v1.PerfMetric;
import com.google.firebase.perf.p070v1.PerfSession;
import com.google.firebase.perf.p070v1.SessionVerbosity;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class RateLimiter {
    private final ConfigResolver configResolver;
    private final double fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final double samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public static class RateLimiterImpl {
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private double tokenCount;
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private static final long MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1);

        public synchronized void changeRate(boolean z11) {
            try {
                this.rate = z11 ? this.foregroundRate : this.backgroundRate;
                this.capacity = z11 ? this.foregroundCapacity : this.backgroundCapacity;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean check(@NonNull PerfMetric perfMetric) {
            try {
                Timer time = this.clock.getTime();
                double durationMicros = (this.lastTimeTokenReplenished.getDurationMicros(time) * this.rate.getTokensPerSeconds()) / MICROS_IN_A_SECOND;
                if (durationMicros > 0.0d) {
                    this.tokenCount = Math.min(this.tokenCount + durationMicros, this.capacity);
                    this.lastTimeTokenReplenished = time;
                }
                double d11 = this.tokenCount;
                if (d11 >= 1.0d) {
                    this.tokenCount = d11 - 1.0d;
                    return true;
                }
                if (this.isLogcatEnabled) {
                    logger.warn("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountBackground() : configResolver.getNetworkEventCountBackground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountForeground() : configResolver.getNetworkEventCountForeground();
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        @VisibleForTesting
        public long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        @VisibleForTesting
        public Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        @VisibleForTesting
        public long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        @VisibleForTesting
        public Rate getForegroundRate() {
            return this.foregroundRate;
        }

        @VisibleForTesting
        public Rate getRate() {
            return this.rate;
        }

        @VisibleForTesting
        public void setRate(Rate rate) {
            this.rate = rate;
        }

        public RateLimiterImpl(Rate rate, long j11, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z11) {
            this.clock = clock;
            this.capacity = j11;
            this.rate = rate;
            this.tokenCount = j11;
            this.lastTimeTokenReplenished = clock.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z11);
            this.isLogcatEnabled = z11;
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z11) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(flimitEvents, flimitSec, timeUnit);
            this.foregroundRate = rate;
            this.foregroundCapacity = flimitEvents;
            if (z11) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate2 = new Rate(blimitEvents, blimitSec, timeUnit);
            this.backgroundRate = rate2;
            this.backgroundCapacity = blimitEvents;
            if (z11) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(blimitEvents));
            }
        }
    }

    public RateLimiter(@NonNull Context context, Rate rate, long j11) {
        this(rate, j11, new Clock(), getSamplingBucketId(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }

    @VisibleForTesting
    public static double getSamplingBucketId() {
        return new Random().nextDouble();
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        return this.fragmentBucketId < this.configResolver.getFragmentSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    public void changeRate(boolean z11) {
        this.traceLimiter.changeRate(z11);
        this.networkLimiter.changeRate(z11);
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        if (list.size() <= 0 || list.get(0).getSessionVerbosityCount() <= 0 || list.get(0).getSessionVerbosity(0) != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return isDeviceAllowedToSendFragmentScreenTraces();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    public boolean isEventRateLimited(PerfMetric perfMetric) {
        if (!isRateLimitApplicable(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.networkLimiter.check(perfMetric);
        }
        if (!perfMetric.hasTraceMetric()) {
            return true;
        }
        return !this.traceLimiter.check(perfMetric);
    }

    public boolean isEventSampled(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !isDeviceAllowedToSendTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (isFragmentScreenTrace(perfMetric) && !isDeviceAllowedToSendFragmentScreenTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric() && !isDeviceAllowedToSendNetworkEvents() && !hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList())) {
            return false;
        }
        return true;
    }

    public boolean isFragmentScreenTrace(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY)) {
            return true;
        }
        return false;
    }

    public boolean isRateLimitApplicable(@NonNull PerfMetric perfMetric) {
        if ((perfMetric.hasTraceMetric() && ((perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) && perfMetric.getTraceMetric().getCountersCount() > 0)) || perfMetric.hasGaugeMetric()) {
            return false;
        }
        return true;
    }

    public RateLimiter(Rate rate, long j11, Clock clock, double d11, double d12, ConfigResolver configResolver) {
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z11 = false;
        this.isLogcatEnabled = false;
        Utils.checkArgument(0.0d <= d11 && d11 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d12 && d12 < 1.0d) {
            z11 = true;
        }
        Utils.checkArgument(z11, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.samplingBucketId = d11;
        this.fragmentBucketId = d12;
        this.configResolver = configResolver;
        this.traceLimiter = new RateLimiterImpl(rate, j11, clock, configResolver, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate, j11, clock, configResolver, "Network", this.isLogcatEnabled);
    }
}
