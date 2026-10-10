package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39558e extends V2TIMConversationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39586s f87851a;

    public C39558e(C39586s c39586s) {
        this.f87851a = c39586s;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationChanged(List conversationList) {
        Object next;
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        C39586s c39586s = this.f87851a;
        Iterator it = conversationList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((V2TIMConversation) next).getConversationID(), TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX + c39586s.f87908a));
        V2TIMConversation v2TIMConversation = (V2TIMConversation) next;
        if (v2TIMConversation != null) {
            C39586s c39586s2 = this.f87851a;
            c39586s2.f87915h.setValue(Boolean.valueOf(v2TIMConversation.isPinned()));
            c39586s2.f87914g.setValue(Boolean.valueOf(v2TIMConversation.getRecvOpt() == 2));
        }
    }
}
