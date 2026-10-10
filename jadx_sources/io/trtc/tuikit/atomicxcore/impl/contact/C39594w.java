package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C39594w implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87941b;

    public C39594w(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87940a = c39539o;
        this.f87941b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87941b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Clear friend application unread failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f87940a.f87803f.setValue(0);
        CompletionHandler completionHandler = this.f87941b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
