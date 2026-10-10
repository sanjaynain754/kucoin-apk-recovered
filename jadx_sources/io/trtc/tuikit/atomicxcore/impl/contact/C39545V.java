package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.V */
/* JADX INFO: loaded from: classes61.dex */
public final class C39545V extends V2TIMConversationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87822a;

    public C39545V(C39531G0 c39531g0) {
        this.f87822a = c39531g0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationChanged(List conversationList) {
        Object next;
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        C39531G0 c39531g0 = this.f87822a;
        Iterator it = conversationList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((V2TIMConversation) next).getConversationID(), TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX + c39531g0.f87759a));
        V2TIMConversation v2TIMConversation = (V2TIMConversation) next;
        if (v2TIMConversation != null) {
            C39531G0 c39531g1 = this.f87822a;
            c39531g1.f87767i.setValue(Boolean.valueOf(v2TIMConversation.isPinned()));
            c39531g1.f87765g.setValue(Boolean.valueOf(v2TIMConversation.getRecvOpt() == 2));
            c39531g1.f87777s.setValue(ReceiveMessageOpt.INSTANCE.parse(v2TIMConversation.getRecvOpt()));
        }
    }
}
