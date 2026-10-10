package com.tencent.ugc.decoder;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.h */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35599h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final MediaCodecOutputOESTextureDecoder f76954a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f76955b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79096a(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) {
        return new RunnableC35599h(mediaCodecOutputOESTextureDecoder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCodecOutputOESTextureDecoder.lambda$onFrameAvailable$0(this.f76954a, this.f76955b);
    }

    private RunnableC35599h(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) {
        this.f76954a = mediaCodecOutputOESTextureDecoder;
        this.f76955b = surfaceTexture;
    }
}
