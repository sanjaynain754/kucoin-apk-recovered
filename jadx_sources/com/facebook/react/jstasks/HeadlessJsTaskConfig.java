package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes45.dex */
public class HeadlessJsTaskConfig {
    private final boolean mAllowedInForeground;
    private final WritableMap mData;
    private final HeadlessJsTaskRetryPolicy mRetryPolicy;
    private final String mTaskKey;
    private final long mTimeout;

    public HeadlessJsTaskConfig(String str, WritableMap writableMap) {
        this(str, writableMap, 0L, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j11) {
        this(str, writableMap, j11, false);
    }

    public WritableMap getData() {
        return this.mData;
    }

    public HeadlessJsTaskRetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public String getTaskKey() {
        return this.mTaskKey;
    }

    public long getTimeout() {
        return this.mTimeout;
    }

    public boolean isAllowedInForeground() {
        return this.mAllowedInForeground;
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j11, boolean z11) {
        this(str, writableMap, j11, z11, NoRetryPolicy.INSTANCE);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j11, boolean z11, HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy) {
        this.mTaskKey = str;
        this.mData = writableMap;
        this.mTimeout = j11;
        this.mAllowedInForeground = z11;
        this.mRetryPolicy = headlessJsTaskRetryPolicy;
    }

    public HeadlessJsTaskConfig(HeadlessJsTaskConfig headlessJsTaskConfig) {
        this.mTaskKey = headlessJsTaskConfig.mTaskKey;
        this.mData = headlessJsTaskConfig.mData.copy();
        this.mTimeout = headlessJsTaskConfig.mTimeout;
        this.mAllowedInForeground = headlessJsTaskConfig.mAllowedInForeground;
        HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy = headlessJsTaskConfig.mRetryPolicy;
        if (headlessJsTaskRetryPolicy != null) {
            this.mRetryPolicy = headlessJsTaskRetryPolicy.copy();
        } else {
            this.mRetryPolicy = null;
        }
    }
}
