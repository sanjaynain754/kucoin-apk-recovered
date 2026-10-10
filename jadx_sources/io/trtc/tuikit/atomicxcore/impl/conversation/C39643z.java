package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.z */
/* JADX INFO: loaded from: classes61.dex */
public final class C39643z implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88064a;

    public C39643z(CompletionHandler completionHandler) {
        this.f88064a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88064a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        CompletionHandler completionHandler = this.f88064a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
