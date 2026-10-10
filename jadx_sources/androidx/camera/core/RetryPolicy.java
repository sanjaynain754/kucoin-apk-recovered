package androidx.camera.core;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.camera.core.impl.RetryPolicyInternal;
import androidx.camera.core.impl.TimeoutRetryPolicy;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalRetryPolicy
public interface RetryPolicy {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;
    public static final RetryPolicy NEVER = new RetryPolicy() { // from class: androidx.camera.core.q0
        @Override // androidx.camera.core.RetryPolicy
        public final RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            return RetryPolicy.RetryConfig.NOT_RETRY;
        }
    };
    public static final RetryPolicy DEFAULT = new CameraProviderInitRetryPolicy.Legacy(getDefaultRetryTimeoutInMillis());
    public static final RetryPolicy RETRY_UNAVAILABLE_CAMERA = new CameraProviderInitRetryPolicy(getDefaultRetryTimeoutInMillis());

    @ExperimentalRetryPolicy
    public static final class Builder {
        private final RetryPolicy mBasePolicy;
        private long mTimeoutInMillis;

        public RetryPolicy build() {
            RetryPolicy retryPolicy = this.mBasePolicy;
            return retryPolicy instanceof RetryPolicyInternal ? ((RetryPolicyInternal) retryPolicy).copy(this.mTimeoutInMillis) : new TimeoutRetryPolicy(this.mTimeoutInMillis, this.mBasePolicy);
        }

        public Builder setTimeoutInMillis(long j11) {
            this.mTimeoutInMillis = j11;
            return this;
        }

        public Builder(RetryPolicy retryPolicy) {
            this.mBasePolicy = retryPolicy;
            this.mTimeoutInMillis = retryPolicy.getTimeoutInMillis();
        }
    }

    @ExperimentalRetryPolicy
    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface Status {
        }

        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    @ExperimentalRetryPolicy
    public static final class RetryConfig {
        private static final long DEFAULT_DELAY_MILLIS = 500;
        private final boolean mCompleteWithoutFailure;
        private final long mDelayInMillis;
        private final boolean mShouldRetry;
        public static final RetryConfig NOT_RETRY = new RetryConfig(false, 0);
        public static final RetryConfig DEFAULT_DELAY_RETRY = new RetryConfig(true);
        private static final long MINI_DELAY_MILLIS = 100;
        public static final RetryConfig MINI_DELAY_RETRY = new RetryConfig(true, MINI_DELAY_MILLIS);

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static RetryConfig COMPLETE_WITHOUT_FAILURE = new RetryConfig(false, 0L, true);

        @ExperimentalRetryPolicy
        public static final class Builder {
            private boolean mShouldRetry = true;
            private long mTimeoutInMillis = RetryConfig.getDefaultRetryDelayInMillis();

            public RetryConfig build() {
                return new RetryConfig(this.mShouldRetry, this.mTimeoutInMillis);
            }

            public Builder setRetryDelayInMillis(@IntRange(from = RetryConfig.MINI_DELAY_MILLIS, m1553to = 2000) long j11) {
                this.mTimeoutInMillis = j11;
                return this;
            }

            public Builder setShouldRetry(boolean z11) {
                this.mShouldRetry = z11;
                return this;
            }
        }

        private RetryConfig(boolean z11) {
            this(z11, getDefaultRetryDelayInMillis());
        }

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        public long getRetryDelayInMillis() {
            return this.mDelayInMillis;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public boolean shouldCompleteWithoutFailure() {
            return this.mCompleteWithoutFailure;
        }

        public boolean shouldRetry() {
            return this.mShouldRetry;
        }

        private RetryConfig(boolean z11, long j11) {
            this(z11, j11, false);
        }

        private RetryConfig(boolean z11, long j11, boolean z12) {
            this.mShouldRetry = z11;
            this.mDelayInMillis = j11;
            if (z12) {
                Preconditions.checkArgument(!z11, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.mCompleteWithoutFailure = z12;
        }
    }

    RetryConfig onRetryDecisionRequested(ExecutionState executionState);

    static long getDefaultRetryTimeoutInMillis() {
        return DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }
}
