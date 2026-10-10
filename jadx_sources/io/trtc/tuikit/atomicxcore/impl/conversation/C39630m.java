package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C39630m implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88040b;

    public C39630m(String str, CompletionHandler completionHandler) {
        this.f88039a = str;
        this.f88040b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        CompletionHandler completionHandler = this.f88040b;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onConversationHistoryMessageCleared", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88039a)));
        CompletionHandler completionHandler = this.f88040b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
