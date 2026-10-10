package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C39596x implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87948b;

    public C39596x(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87947a = c39539o;
        this.f87948b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87948b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Clear group application unread failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f87947a.f87804g.setValue(0);
        AbstractC39512t.m88254a("groupApplicationUnreadCountCleared", "");
        CompletionHandler completionHandler = this.f87948b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
