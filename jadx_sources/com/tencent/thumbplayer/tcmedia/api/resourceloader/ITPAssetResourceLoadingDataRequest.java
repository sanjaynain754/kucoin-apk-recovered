package com.tencent.thumbplayer.tcmedia.api.resourceloader;

/* JADX INFO: loaded from: classes62.dex */
public interface ITPAssetResourceLoadingDataRequest {
    long getCurrentOffset();

    long getRequestedLength();

    long getRequestedOffset();

    void notifyDataReady(long j11, long j12);

    void respondWithData(byte[] bArr);
}
