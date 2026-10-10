package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalRetryPolicy
public final class CameraProviderInitRetryPolicy implements RetryPolicyInternal {
    private final RetryPolicy mDelegatePolicy;

    public static final class Legacy implements RetryPolicyInternal {
        private final RetryPolicy mBasePolicy;

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public RetryPolicy copy(long j11) {
            return new Legacy(j11);
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return this.mBasePolicy.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.RetryPolicy
        public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            if (this.mBasePolicy.onRetryDecisionRequested(executionState).shouldRetry()) {
                return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
            Throwable cause = executionState.getCause();
            if (cause instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.m1868e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                    return RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                }
            }
            return RetryPolicy.RetryConfig.NOT_RETRY;
        }

        public Legacy(long j11) {
            this.mBasePolicy = new CameraProviderInitRetryPolicy(j11);
        }
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public RetryPolicy copy(long j11) {
        return new CameraProviderInitRetryPolicy(j11);
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mDelegatePolicy.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.RetryPolicy
    public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return this.mDelegatePolicy.onRetryDecisionRequested(executionState);
    }

    public CameraProviderInitRetryPolicy(final long j11) {
        this.mDelegatePolicy = new TimeoutRetryPolicy(j11, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j11;
            }

            @Override // androidx.camera.core.RetryPolicy
            public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
                if (executionState.getStatus() == 1) {
                    return RetryPolicy.RetryConfig.NOT_RETRY;
                }
                return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
        });
    }
}
