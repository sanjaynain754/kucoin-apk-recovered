package com.tencent.imsdk.message;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class DownloadProgressInfo implements Serializable {
    private long currentSize;
    private long totalSize;

    public long getCurrentSize() {
        return this.currentSize;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public DownloadProgressInfo(long j11, long j12) {
        this.currentSize = j11;
        this.totalSize = j12;
    }
}
