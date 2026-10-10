package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C39603B implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f87963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f87964c;

    public C39603B(CompletionHandler completionHandler, String str, boolean z11) {
        this.f87962a = completionHandler;
        this.f87963b = str;
        this.f87964c = z11;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87962a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        String str = this.f87963b;
        boolean z11 = this.f87964c;
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onConversationMutedChanged", MapsKt.mapOf(TuplesKt.m90091to("conversationID", str), TuplesKt.m90091to("mute", Boolean.valueOf(z11))));
        CompletionHandler completionHandler = this.f87962a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
