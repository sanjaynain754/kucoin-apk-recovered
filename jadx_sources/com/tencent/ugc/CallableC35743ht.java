package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.ht */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35743ht implements Callable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77202a;

    /* JADX INFO: renamed from: b */
    private final long f77203b;

    /* JADX INFO: renamed from: a */
    public static Callable m79237a(VideoDemuxerFFmpeg videoDemuxerFFmpeg, long j11) {
        return new CallableC35743ht(videoDemuxerFFmpeg, j11);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return VideoDemuxerFFmpeg.lambda$seek$2(this.f77202a, this.f77203b);
    }

    private CallableC35743ht(VideoDemuxerFFmpeg videoDemuxerFFmpeg, long j11) {
        this.f77202a = videoDemuxerFFmpeg;
        this.f77203b = j11;
    }
}
