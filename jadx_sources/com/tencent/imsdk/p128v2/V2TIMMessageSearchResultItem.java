package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.MessageSearchResultItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageSearchResultItem implements Serializable {
    private MessageSearchResultItem messageSearchResultItem;

    public String getConversationID() {
        MessageSearchResultItem messageSearchResultItem = this.messageSearchResultItem;
        if (messageSearchResultItem == null) {
            return "";
        }
        if (messageSearchResultItem.getMessageType() == Message.MESSAGE_TYPE_C2C) {
            return TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX + this.messageSearchResultItem.getConversationID();
        }
        if (this.messageSearchResultItem.getMessageType() != Message.MESSAGE_TYPE_GROUP) {
            return "";
        }
        return TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX + this.messageSearchResultItem.getConversationID();
    }

    public int getMessageCount() {
        MessageSearchResultItem messageSearchResultItem = this.messageSearchResultItem;
        if (messageSearchResultItem != null) {
            return messageSearchResultItem.getMessageCount();
        }
        return 0;
    }

    public List<V2TIMMessage> getMessageList() {
        MessageSearchResultItem messageSearchResultItem = this.messageSearchResultItem;
        if (messageSearchResultItem == null) {
            return null;
        }
        List<Message> messageList = messageSearchResultItem.getMessageList();
        ArrayList arrayList = new ArrayList();
        for (Message message : messageList) {
            V2TIMMessage v2TIMMessage = new V2TIMMessage();
            v2TIMMessage.setMessage(message);
            arrayList.add(v2TIMMessage);
        }
        return arrayList;
    }

    public void setMessageSearchResultItem(MessageSearchResultItem messageSearchResultItem) {
        this.messageSearchResultItem = messageSearchResultItem;
    }
}
