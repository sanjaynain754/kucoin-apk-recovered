package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C39605D implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f87969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87972d;

    public C39605D(C39606E c39606e, CompletionHandler completionHandler, String str, String str2) {
        this.f87969a = c39606e;
        this.f87970b = completionHandler;
        this.f87971c = str;
        this.f87972d = str2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87970b;
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
        InterfaceC41669n interfaceC41669n = this.f87969a.f87977e;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        String str = this.f87971c;
        String str2 = this.f87972d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            ConversationInfo conversationInfoCopy = (ConversationInfo) it.next();
            if (Intrinsics.areEqual(conversationInfoCopy.getConversationID(), str)) {
                arrayList = arrayList2;
                conversationInfoCopy = conversationInfoCopy.copy((65023 & 1) != 0 ? conversationInfoCopy.conversationID : null, (65023 & 2) != 0 ? conversationInfoCopy.type : null, (65023 & 4) != 0 ? conversationInfoCopy.groupType : null, (65023 & 8) != 0 ? conversationInfoCopy.avatarURL : null, (65023 & 16) != 0 ? conversationInfoCopy.title : null, (65023 & 32) != 0 ? conversationInfoCopy.lastMessage : null, (65023 & 64) != 0 ? conversationInfoCopy.draft : str2, (65023 & 128) != 0 ? conversationInfoCopy.timestamp : 0L, (65023 & 256) != 0 ? conversationInfoCopy.unreadCount : 0, (65023 & 512) != 0 ? conversationInfoCopy.isPinned : false, (65023 & 1024) != 0 ? conversationInfoCopy.orderKey : 0L, (65023 & 2048) != 0 ? conversationInfoCopy.receiveOption : null, (65023 & 4096) != 0 ? conversationInfoCopy.groupAtInfoList : null, (65023 & 8192) != 0 ? conversationInfoCopy.conversationGroupList : null, (65023 & 16384) != 0 ? conversationInfoCopy.markList : null, (65023 & 32768) != 0 ? conversationInfoCopy.rawConversation : null);
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(conversationInfoCopy);
            arrayList2 = arrayList;
        }
        interfaceC41669n.setValue(arrayList2);
        CompletionHandler completionHandler = this.f87970b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
