package com.tencent.imsdk.conversation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class ConversationListFilter implements Serializable {
    public static final int TIM_CONVERSATION_FILTER_TYPE_CONVERSATION_GROUP = 2;
    public static final int TIM_CONVERSATION_FILTER_TYPE_CONVERSATION_MARK = 1;
    public static final int TIM_CONVERSATION_FILTER_TYPE_HAS_GROUP_AT_INFO = 8;
    public static final int TIM_CONVERSATION_FILTER_TYPE_HAS_UNREAD_COUNT = 4;
    public static final int TIM_CONVERSATION_FILTER_TYPE_NONE = 0;
    private String conversationGroup;
    private boolean hasGroupAtInfo;
    private boolean hasUnreadCount;
    private int conversationType = 0;
    private int filterType = 0;
    private long markType = 0;

    public String getConversationGroup() {
        return this.conversationGroup;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public boolean getHasGroupAtInfo() {
        return this.hasGroupAtInfo;
    }

    public boolean getHasUnreadCount() {
        return this.hasUnreadCount;
    }

    public long getMarkType() {
        return this.markType;
    }

    public boolean isNull() {
        return this.conversationType == 0 && this.filterType == 0;
    }

    public void setConversationGroup(String str) {
        this.conversationGroup = str;
        this.filterType |= 2;
    }

    public void setConversationType(int i11) {
        this.conversationType = i11;
    }

    public void setFilterType(int i11) {
        this.filterType = i11;
    }

    public void setHasGroupAtInfo(boolean z11) {
        this.hasGroupAtInfo = z11;
        this.filterType |= 8;
    }

    public void setHasUnreadCount(boolean z11) {
        this.hasUnreadCount = z11;
        this.filterType |= 4;
    }

    public void setMarkType(long j11) {
        this.markType = j11;
        this.filterType |= 1;
    }
}
