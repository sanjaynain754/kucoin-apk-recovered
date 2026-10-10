package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C39612K implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f87998a;

    public C39612K(C41716o c41716o) {
        this.f87998a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        this.f87998a.resumeWith(Result.m103844constructorimpl(null));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        this.f87998a.resumeWith(Result.m103844constructorimpl((V2TIMConversationResult) obj));
    }
}
