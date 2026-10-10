package com.facebook.react.bridge;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes45.dex */
public class JavaScriptContextHolder {

    @GuardedBy("this")
    private long mContext;

    public synchronized void clear() {
        this.mContext = 0L;
    }

    @GuardedBy("this")
    public long get() {
        return this.mContext;
    }

    public JavaScriptContextHolder(long j11) {
        this.mContext = j11;
    }
}
