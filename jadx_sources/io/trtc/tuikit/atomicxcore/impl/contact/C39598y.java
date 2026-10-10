package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C39598y implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87951b;

    public C39598y(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87950a = c39539o;
        this.f87951b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87951b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Create group failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        this.f87950a.f87810m.setCreatedGroupID$atomicxcore_release((String) obj);
        CompletionHandler completionHandler = this.f87951b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
