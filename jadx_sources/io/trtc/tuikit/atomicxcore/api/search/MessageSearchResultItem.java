package io.trtc.tuikit.atomicxcore.api.search;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;", "", "conversationID", "", "conversationShowName", "conversationAvatarURL", "messageCount", "", "messageList", "", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getConversationAvatarURL", "()Ljava/lang/String;", "setConversationAvatarURL", "(Ljava/lang/String;)V", "getConversationID", "setConversationID", "getConversationShowName", "setConversationShowName", "getMessageCount", "()I", "setMessageCount", "(I)V", "getMessageList", "()Ljava/util/List;", "setMessageList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageSearchResultItem {

    @NotNull
    private String conversationAvatarURL;

    @NotNull
    private String conversationID;

    @NotNull
    private String conversationShowName;
    private int messageCount;

    @NotNull
    private List<MessageInfo> messageList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSearchResultItem)) {
            return false;
        }
        MessageSearchResultItem messageSearchResultItem = (MessageSearchResultItem) other;
        return Intrinsics.areEqual(this.conversationID, messageSearchResultItem.conversationID) && Intrinsics.areEqual(this.conversationShowName, messageSearchResultItem.conversationShowName) && Intrinsics.areEqual(this.conversationAvatarURL, messageSearchResultItem.conversationAvatarURL) && this.messageCount == messageSearchResultItem.messageCount && Intrinsics.areEqual(this.messageList, messageSearchResultItem.messageList);
    }

    public MessageSearchResultItem(@NotNull String conversationID, @NotNull String conversationShowName, @NotNull String conversationAvatarURL, int i11, @NotNull List<MessageInfo> messageList) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(conversationShowName, "conversationShowName");
        Intrinsics.checkNotNullParameter(conversationAvatarURL, "conversationAvatarURL");
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        this.conversationID = conversationID;
        this.conversationShowName = conversationShowName;
        this.conversationAvatarURL = conversationAvatarURL;
        this.messageCount = i11;
        this.messageList = messageList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageSearchResultItem copy$default(MessageSearchResultItem messageSearchResultItem, String str, String str2, String str3, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = messageSearchResultItem.conversationID;
        }
        if ((i12 & 2) != 0) {
            str2 = messageSearchResultItem.conversationShowName;
        }
        if ((i12 & 4) != 0) {
            str3 = messageSearchResultItem.conversationAvatarURL;
        }
        if ((i12 & 8) != 0) {
            i11 = messageSearchResultItem.messageCount;
        }
        if ((i12 & 16) != 0) {
            list = messageSearchResultItem.messageList;
        }
        List list2 = list;
        String str4 = str3;
        return messageSearchResultItem.copy(str, str2, str4, i11, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationID() {
        return this.conversationID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationShowName() {
        return this.conversationShowName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversationAvatarURL() {
        return this.conversationAvatarURL;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMessageCount() {
        return this.messageCount;
    }

    @NotNull
    public final List<MessageInfo> component5() {
        return this.messageList;
    }

    @NotNull
    public final MessageSearchResultItem copy(@NotNull String conversationID, @NotNull String conversationShowName, @NotNull String conversationAvatarURL, int messageCount, @NotNull List<MessageInfo> messageList) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(conversationShowName, "conversationShowName");
        Intrinsics.checkNotNullParameter(conversationAvatarURL, "conversationAvatarURL");
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        return new MessageSearchResultItem(conversationID, conversationShowName, conversationAvatarURL, messageCount, messageList);
    }

    @NotNull
    public final String getConversationAvatarURL() {
        return this.conversationAvatarURL;
    }

    @NotNull
    public final String getConversationID() {
        return this.conversationID;
    }

    @NotNull
    public final String getConversationShowName() {
        return this.conversationShowName;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    @NotNull
    public final List<MessageInfo> getMessageList() {
        return this.messageList;
    }

    public int hashCode() {
        return this.messageList.hashCode() + AbstractC39396a.m88225a(this.messageCount, AbstractC39391a.m88220a(this.conversationAvatarURL, AbstractC39391a.m88220a(this.conversationShowName, this.conversationID.hashCode() * 31, 31), 31), 31);
    }

    public final void setConversationAvatarURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationAvatarURL = str;
    }

    public final void setConversationID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationID = str;
    }

    public final void setConversationShowName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationShowName = str;
    }

    public final void setMessageCount(int i11) {
        this.messageCount = i11;
    }

    public final void setMessageList(@NotNull List<MessageInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageList = list;
    }

    @NotNull
    public String toString() {
        return "MessageSearchResultItem(conversationID=" + this.conversationID + ", conversationShowName=" + this.conversationShowName + ", conversationAvatarURL=" + this.conversationAvatarURL + ", messageCount=" + this.messageCount + ", messageList=" + this.messageList + ')';
    }
}
