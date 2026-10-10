package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalRetryPolicy
public interface RetryPolicyInternal extends RetryPolicy {
    RetryPolicy copy(long j11);
}
