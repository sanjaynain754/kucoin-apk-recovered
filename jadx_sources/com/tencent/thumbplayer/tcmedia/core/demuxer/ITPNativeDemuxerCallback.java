package com.tencent.thumbplayer.tcmedia.core.demuxer;

/* JADX INFO: loaded from: classes63.dex */
public interface ITPNativeDemuxerCallback {
    void onDurationUpdated();

    TPNativeRemoteSdpInfo onSdpExchange(String str, int i11);
}
