package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C39535K implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87790a;

    public C39535K(CompletionHandler completionHandler) {
        this.f87790a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87790a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Join group failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f87790a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
