package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39620c implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88017b;

    public C39620c(C39627j c39627j, CompletionHandler completionHandler) {
        this.f88016a = c39627j;
        this.f88017b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88017b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        C39627j.m88291a(this.f88016a, (List) obj, this.f88017b);
    }
}
