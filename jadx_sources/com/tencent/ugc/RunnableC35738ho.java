package com.tencent.ugc;

import com.tencent.ugc.encoder.UGCVideoEncoderJNI;

/* JADX INFO: renamed from: com.tencent.ugc.ho */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35738ho implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor.C35486b f77188a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoEncoderJNI.VideoEncoderError f77189b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79232a(UGCVideoProcessor.C35486b c35486b, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        return new RunnableC35738ho(c35486b, videoEncoderError);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.C35486b.m78987a(this.f77188a, this.f77189b);
    }

    private RunnableC35738ho(UGCVideoProcessor.C35486b c35486b, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        this.f77188a = c35486b;
        this.f77189b = videoEncoderError;
    }
}
