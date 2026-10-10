package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.u */
/* JADX INFO: loaded from: classes61.dex */
public final class C39638u implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88053b;

    public C39638u(C39606E c39606e, CompletionHandler completionHandler) {
        this.f88052a = c39606e;
        this.f88053b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88053b;
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
            C39606E c39606e = this.f88052a;
            CompletionHandler completionHandler = this.f88053b;
            List<V2TIMConversation> v2List = v2TIMConversationResult.getConversationList();
            Intrinsics.checkNotNullExpressionValue(v2List, "getConversationList(...)");
            Intrinsics.checkNotNullParameter(v2List, "v2List");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v2List, 10));
            Iterator<T> it = v2List.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new C39618a());
            InterfaceC41669n interfaceC41669n = c39606e.f87977e;
            interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) listSortedWith));
            c39606e.f87978f.setValue(Boolean.valueOf(!v2TIMConversationResult.isFinished()));
            c39606e.f87981i = v2TIMConversationResult.getNextSeq();
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        }
    }
}
