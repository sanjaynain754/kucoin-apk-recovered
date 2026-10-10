package com.tencent.ugc;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: renamed from: com.tencent.ugc.cc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35557cc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354702 f76887a;

    /* JADX INFO: renamed from: b */
    private final EncodedVideoFrame f76888b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79056a(TXVideoEditer.C354702 c354702, EncodedVideoFrame encodedVideoFrame) {
        return new RunnableC35557cc(c354702, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354702.m78967a(this.f76887a, this.f76888b);
    }

    private RunnableC35557cc(TXVideoEditer.C354702 c354702, EncodedVideoFrame encodedVideoFrame) {
        this.f76887a = c354702;
        this.f76888b = encodedVideoFrame;
    }
}
