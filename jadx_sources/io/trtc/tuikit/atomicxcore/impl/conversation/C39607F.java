package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C39607F extends V2TIMConversationListener {
    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationChanged(List conversationList) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        ArrayList<ConversationInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(conversationList, 10));
        Iterator it = conversationList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
        }
        C39617P c39617p = C39617P.f88005a;
        if (C39617P.f88012h) {
            C39617P.m88288b(arrayList);
            return;
        }
        for (ConversationInfo conversationInfo : arrayList) {
            C39617P.f88011g.put(conversationInfo.getConversationID(), conversationInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationDeleted(List conversationIDList) {
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        C39617P.m88286a(conversationIDList);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onNewConversation(List conversationList) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        ArrayList<ConversationInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(conversationList, 10));
        Iterator it = conversationList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
        }
        C39617P c39617p = C39617P.f88005a;
        if (C39617P.f88012h) {
            C39617P.m88288b(arrayList);
            return;
        }
        for (ConversationInfo conversationInfo : arrayList) {
            C39617P.f88011g.put(conversationInfo.getConversationID(), conversationInfo);
        }
    }
}
