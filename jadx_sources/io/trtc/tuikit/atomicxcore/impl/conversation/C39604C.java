package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C39604C implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f87965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f87968d;

    public C39604C(C39606E c39606e, CompletionHandler completionHandler, String str, boolean z11) {
        this.f87965a = c39606e;
        this.f87966b = completionHandler;
        this.f87967c = str;
        this.f87968d = z11;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87966b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        ArrayList arrayList;
        InterfaceC41669n interfaceC41669n = this.f87965a.f87977e;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        String str = this.f87967c;
        boolean z11 = this.f87968d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            ConversationInfo conversationInfoCopy = (ConversationInfo) it.next();
            if (Intrinsics.areEqual(conversationInfoCopy.getConversationID(), str)) {
                arrayList = arrayList2;
                conversationInfoCopy = conversationInfoCopy.copy((65023 & 1) != 0 ? conversationInfoCopy.conversationID : null, (65023 & 2) != 0 ? conversationInfoCopy.type : null, (65023 & 4) != 0 ? conversationInfoCopy.groupType : null, (65023 & 8) != 0 ? conversationInfoCopy.avatarURL : null, (65023 & 16) != 0 ? conversationInfoCopy.title : null, (65023 & 32) != 0 ? conversationInfoCopy.lastMessage : null, (65023 & 64) != 0 ? conversationInfoCopy.draft : null, (65023 & 128) != 0 ? conversationInfoCopy.timestamp : 0L, (65023 & 256) != 0 ? conversationInfoCopy.unreadCount : 0, (65023 & 512) != 0 ? conversationInfoCopy.isPinned : z11, (65023 & 1024) != 0 ? conversationInfoCopy.orderKey : 0L, (65023 & 2048) != 0 ? conversationInfoCopy.receiveOption : null, (65023 & 4096) != 0 ? conversationInfoCopy.groupAtInfoList : null, (65023 & 8192) != 0 ? conversationInfoCopy.conversationGroupList : null, (65023 & 16384) != 0 ? conversationInfoCopy.markList : null, (65023 & 32768) != 0 ? conversationInfoCopy.rawConversation : null);
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(conversationInfoCopy);
            arrayList2 = arrayList;
        }
        interfaceC41669n.setValue(arrayList2);
        CompletionHandler completionHandler = this.f87966b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
