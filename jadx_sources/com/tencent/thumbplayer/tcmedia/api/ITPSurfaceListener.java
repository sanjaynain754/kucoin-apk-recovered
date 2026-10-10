package com.tencent.thumbplayer.tcmedia.api;

/* JADX INFO: loaded from: classes62.dex */
public interface ITPSurfaceListener {
    void onFlush();

    void onRenderInfo(TPSurfaceRenderInfo tPSurfaceRenderInfo);

    void onVideoPacket(TPVideoPacketBuffer tPVideoPacketBuffer);
}
