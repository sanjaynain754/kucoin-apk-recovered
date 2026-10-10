package com.tencent.ugc;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.ugc.he */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35728he implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77164a;

    /* JADX INFO: renamed from: a */
    public static Handler.Callback m79222a(UGCVideoProcessor uGCVideoProcessor) {
        return new C35728he(uGCVideoProcessor);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return this.f77164a.handleMessage(message);
    }

    private C35728he(UGCVideoProcessor uGCVideoProcessor) {
        this.f77164a = uGCVideoProcessor;
    }
}
