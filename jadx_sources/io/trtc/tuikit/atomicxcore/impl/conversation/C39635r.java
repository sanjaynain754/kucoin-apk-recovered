package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39635r implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88047c;

    public C39635r(C39606E c39606e, CompletionHandler completionHandler, String str) {
        this.f88045a = c39606e;
        this.f88046b = completionHandler;
        this.f88047c = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88046b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        InterfaceC41669n interfaceC41669n = this.f88045a.f87977e;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        String str = this.f88047c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((ConversationInfo) obj).getConversationID(), str)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        CompletionHandler completionHandler = this.f88046b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
