package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalRetryPolicy
public final class TimeoutRetryPolicy implements RetryPolicy {
    private final RetryPolicy mDelegatePolicy;
    private final long mTimeoutInMillis;

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - retryConfigOnRetryDecisionRequested.getRetryDelayInMillis()) ? retryConfigOnRetryDecisionRequested : RetryPolicy.RetryConfig.NOT_RETRY;
    }

    public TimeoutRetryPolicy(long j11, RetryPolicy retryPolicy) {
        boolean z11;
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Timeout must be non-negative.");
        this.mTimeoutInMillis = j11;
        this.mDelegatePolicy = retryPolicy;
    }
}
