package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C39642y implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConversationListFilter f88062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88063c;

    public C39642y(C39606E c39606e, ConversationListFilter conversationListFilter, CompletionHandler completionHandler) {
        this.f88061a = c39606e;
        this.f88062b = conversationListFilter;
        this.f88063c = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88063c;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C39606E c39606e = this.f88061a;
        c39606e.f87982j = jLongValue;
        c39606e.m88283a();
        C39606E c39606e2 = this.f88061a;
        ConversationListFilter conversationListFilter = this.f88062b;
        c39606e2.getClass();
        V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
        if (conversationListFilter != null) {
            v2TIMConversationListFilter.setConversationType(conversationListFilter.getType().getValue());
            String conversationGroup = conversationListFilter.getConversationGroup();
            if (conversationGroup != null) {
                v2TIMConversationListFilter.setConversationGroup(conversationGroup);
            }
            ConversationMarkType markType = conversationListFilter.getMarkType();
            if (markType != null) {
                v2TIMConversationListFilter.setMarkType(markType.getValue());
            }
            Boolean hasUnreadCount = conversationListFilter.getHasUnreadCount();
            if (hasUnreadCount != null) {
                v2TIMConversationListFilter.setHasUnreadCount(hasUnreadCount.booleanValue());
            }
            Boolean hasGroupAtInfo = conversationListFilter.getHasGroupAtInfo();
            if (hasGroupAtInfo != null) {
                v2TIMConversationListFilter.setHasGroupAtInfo(hasGroupAtInfo.booleanValue());
            }
        }
        c39606e2.f87983k = conversationListFilter;
        V2TIMManager.getConversationManager().subscribeUnreadMessageCountByFilter(v2TIMConversationListFilter);
        CompletionHandler completionHandler = this.f88063c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
