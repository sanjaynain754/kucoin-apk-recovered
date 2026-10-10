package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMSendCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39854q implements V2TIMSendCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39856r f88581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageInfo f88582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88583c;

    public C39854q(C39856r c39856r, MessageInfo messageInfo, CompletionHandler completionHandler) {
        this.f88581a = c39856r;
        this.f88582b = messageInfo;
        this.f88583c = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageSendFailed", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88581a.f88585a), TuplesKt.m90091to("messageID", this.f88582b.getMsgID())));
        CompletionHandler completionHandler = this.f88583c;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMSendCallback
    public final void onProgress(int i11) {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageSendProgress", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88581a.f88585a), TuplesKt.m90091to("messageID", this.f88582b.getMsgID()), TuplesKt.m90091to("progress", Integer.valueOf(i11))));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88254a("onMessageSendSuccess", MapsKt.mapOf(TuplesKt.m90091to("conversationID", this.f88581a.f88585a), TuplesKt.m90091to("messageID", this.f88582b.getMsgID())));
        CompletionHandler completionHandler = this.f88583c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
