package com.tencent.imsdk.conversation;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class ConversationListener {
    public void onSyncServerFailed() {
    }

    public void onSyncServerFinish() {
    }

    public void onSyncServerStart() {
    }

    public void onConversationChanged(List<Conversation> list) {
    }

    public void onConversationDeleted(List<String> list) {
    }

    public void onConversationGroupDeleted(String str) {
    }

    public void onConversationGroupOrderDataChanged(String str) {
    }

    public void onNewConversation(List<Conversation> list) {
    }

    public void onUnreadMessageCountChanged(UnreadMessageCountResult unreadMessageCountResult) {
    }

    public void onConversationGroupCreated(String str, List<Conversation> list) {
    }

    public void onConversationGroupNameChanged(String str, String str2) {
    }

    public void onConversationsAddedToGroup(String str, List<Conversation> list) {
    }

    public void onConversationsDeletedFromGroup(String str, List<Conversation> list, int i11) {
    }
}
