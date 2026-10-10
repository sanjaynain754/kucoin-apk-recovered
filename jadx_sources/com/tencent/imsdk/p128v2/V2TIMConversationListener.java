package com.tencent.imsdk.p128v2;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class V2TIMConversationListener {
    @Deprecated
    public void onConversationsDeletedFromGroup(String str, List<V2TIMConversation> list) {
    }

    public void onConversationsDeletedFromGroup(String str, List<V2TIMConversation> list, int i11) {
    }

    public void onSyncServerFailed() {
    }

    public void onSyncServerFinish() {
    }

    public void onSyncServerStart() {
    }

    public void onConversationChanged(List<V2TIMConversation> list) {
    }

    public void onConversationDeleted(List<String> list) {
    }

    public void onConversationGroupDeleted(String str) {
    }

    public void onNewConversation(List<V2TIMConversation> list) {
    }

    public void onTotalUnreadMessageCountChanged(long j11) {
    }

    public void onConversationGroupCreated(String str, List<V2TIMConversation> list) {
    }

    public void onConversationGroupNameChanged(String str, String str2) {
    }

    public void onConversationsAddedToGroup(String str, List<V2TIMConversation> list) {
    }

    public void onUnreadMessageCountChangedByFilter(V2TIMConversationListFilter v2TIMConversationListFilter, long j11) {
    }
}
