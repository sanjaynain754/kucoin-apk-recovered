package com.tencent.ugc;

import com.tencent.ugc.encoder.UGCVideoEncoderJNI;

/* JADX INFO: renamed from: com.tencent.ugc.ce */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35559ce implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354702 f76890a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoEncoderJNI.EncoderType f76891b;

    /* JADX INFO: renamed from: c */
    private final UGCVideoEncoderJNI.VideoEncoderError f76892c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79058a(TXVideoEditer.C354702 c354702, UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        return new RunnableC35559ce(c354702, encoderType, videoEncoderError);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354702.m78966a(this.f76890a, this.f76891b, this.f76892c);
    }

    private RunnableC35559ce(TXVideoEditer.C354702 c354702, UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        this.f76890a = c354702;
        this.f76891b = encoderType;
        this.f76892c = videoEncoderError;
    }
}
