package com.facebook.react.jstasks;

/* JADX INFO: loaded from: classes45.dex */
public interface HeadlessJsTaskRetryPolicy {
    boolean canRetry();

    HeadlessJsTaskRetryPolicy copy();

    int getDelay();

    HeadlessJsTaskRetryPolicy update();
}
