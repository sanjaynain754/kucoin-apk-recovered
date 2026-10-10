package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.p0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39853p0 implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88580a;

    public C39853p0(CompletionHandler completionHandler) {
        this.f88580a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88580a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f88580a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
