package com.facebook.react.jstasks;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: NoRetryPolicy.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0001H\u0016J\b\u0010\t\u001a\u00020\u0001H\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/jstasks/NoRetryPolicy;", "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "<init>", "()V", "canRetry", "", "getDelay", "", "update", "copy", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NoRetryPolicy implements HeadlessJsTaskRetryPolicy {

    @JvmField
    @NotNull
    public static final NoRetryPolicy INSTANCE = new NoRetryPolicy();

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public boolean canRetry() {
        return false;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public int getDelay() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + canRetry());
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy update() {
        throw new IllegalStateException("Should not update as canRetry is: " + canRetry());
    }

    private NoRetryPolicy() {
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy copy() {
        return this;
    }
}
