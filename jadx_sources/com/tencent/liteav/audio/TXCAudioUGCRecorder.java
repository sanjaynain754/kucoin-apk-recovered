package com.tencent.liteav.audio;

import android.content.Context;

/* JADX INFO: loaded from: classes59.dex */
public class TXCAudioUGCRecorder {
    private static final TXCAudioUGCRecorder INSTANCE = new TXCAudioUGCRecorder();

    public synchronized boolean getIsMute() {
        return false;
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    private TXCAudioUGCRecorder() {
    }

    public void setAECType(int i11, Context context) {
    }
}
