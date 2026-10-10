package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C39640w implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88056b;

    public C39640w(C39606E c39606e, CompletionHandler completionHandler) {
        this.f88055a = c39606e;
        this.f88056b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        this.f88055a.f87979g.setValue(0L);
        CompletionHandler completionHandler = this.f88056b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C39606E c39606e = this.f88055a;
        c39606e.f87982j = jLongValue;
        c39606e.m88283a();
        CompletionHandler completionHandler = this.f88056b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
