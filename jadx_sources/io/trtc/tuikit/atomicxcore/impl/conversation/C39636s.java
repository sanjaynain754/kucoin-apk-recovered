package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39636s implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39606E f88049b;

    public C39636s(CompletionHandler completionHandler, C39606E c39606e) {
        this.f88048a = completionHandler;
        this.f88049b = c39606e;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88048a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        V2TIMConversation v2TIMConversation = (V2TIMConversation) obj;
        if (v2TIMConversation != null) {
            C39606E c39606e = this.f88049b;
            c39606e.f87977e.setValue(CollectionsKt.listOf(AbstractC39619b.m88290a(v2TIMConversation)));
            c39606e.f87978f.setValue(Boolean.FALSE);
            c39606e.f87981i = 0L;
        }
        CompletionHandler completionHandler = this.f88048a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
