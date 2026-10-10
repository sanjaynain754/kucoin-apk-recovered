package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39631n implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88042b;

    public C39631n(String str, CompletionHandler completionHandler) {
        this.f88041a = str;
        this.f88042b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        CompletionHandler completionHandler = this.f88042b;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onConversationHistoryMessageCleared", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88041a)));
        CompletionHandler completionHandler = this.f88042b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
