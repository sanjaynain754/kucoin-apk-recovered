package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39632o implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88043a;

    public C39632o(CompletionHandler completionHandler) {
        this.f88043a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88043a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f88043a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
