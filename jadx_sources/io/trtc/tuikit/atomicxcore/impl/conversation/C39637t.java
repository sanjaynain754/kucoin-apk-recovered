package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C39637t implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88051b;

    public C39637t(C39606E c39606e, CompletionHandler completionHandler) {
        this.f88050a = c39606e;
        this.f88051b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88051b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        V2TIMConversationResult v2TIMConversationResult = (V2TIMConversationResult) obj;
        if (v2TIMConversationResult != null) {
            C39606E c39606e = this.f88050a;
            CompletionHandler completionHandler = this.f88051b;
            List<V2TIMConversation> v2List = v2TIMConversationResult.getConversationList();
            Intrinsics.checkNotNullExpressionValue(v2List, "getConversationList(...)");
            Intrinsics.checkNotNullParameter(v2List, "v2List");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v2List, 10));
            Iterator<T> it = v2List.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
            }
            c39606e.f87977e.setValue(CollectionsKt.sortedWith(arrayList, new C39618a()));
            c39606e.f87978f.setValue(Boolean.valueOf(!v2TIMConversationResult.isFinished()));
            c39606e.f87981i = v2TIMConversationResult.getNextSeq();
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        }
    }
}
