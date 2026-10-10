package com.facebook.react.jstasks;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: LinearCountingRetryPolicy.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;", "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "retryAttempts", "", "delayBetweenAttemptsInMs", "<init>", "(II)V", "canRetry", "", "getDelay", "update", "copy", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LinearCountingRetryPolicy implements HeadlessJsTaskRetryPolicy {
    private final int delayBetweenAttemptsInMs;
    private final int retryAttempts;

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public boolean canRetry() {
        return this.retryAttempts > 0;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy copy() {
        return new LinearCountingRetryPolicy(this.retryAttempts, this.delayBetweenAttemptsInMs);
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    /* JADX INFO: renamed from: getDelay, reason: from getter */
    public int getDelayBetweenAttemptsInMs() {
        return this.delayBetweenAttemptsInMs;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy update() {
        int i11 = this.retryAttempts - 1;
        return i11 > 0 ? new LinearCountingRetryPolicy(i11, this.delayBetweenAttemptsInMs) : NoRetryPolicy.INSTANCE;
    }

    public LinearCountingRetryPolicy(int i11, int i12) {
        this.retryAttempts = i11;
        this.delayBetweenAttemptsInMs = i12;
    }
}
