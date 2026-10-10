package io.trtc.tuikit.atomicxcore.api.search;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JM\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006'"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;", "", "conversationID", "", "searchTimePosition", "", "searchTimePeriod", "senderUserIDList", "", "messageTypeList", "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "(Ljava/lang/String;IILjava/util/List;Ljava/util/List;)V", "getConversationID", "()Ljava/lang/String;", "setConversationID", "(Ljava/lang/String;)V", "getMessageTypeList", "()Ljava/util/List;", "setMessageTypeList", "(Ljava/util/List;)V", "getSearchTimePeriod", "()I", "setSearchTimePeriod", "(I)V", "getSearchTimePosition", "setSearchTimePosition", "getSenderUserIDList", "setSenderUserIDList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageSearchFilter {

    @Nullable
    private String conversationID;

    @Nullable
    private List<? extends MessageType> messageTypeList;
    private int searchTimePeriod;
    private int searchTimePosition;

    @Nullable
    private List<String> senderUserIDList;

    public MessageSearchFilter() {
        this(null, 0, 0, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSearchFilter)) {
            return false;
        }
        MessageSearchFilter messageSearchFilter = (MessageSearchFilter) other;
        return Intrinsics.areEqual(this.conversationID, messageSearchFilter.conversationID) && this.searchTimePosition == messageSearchFilter.searchTimePosition && this.searchTimePeriod == messageSearchFilter.searchTimePeriod && Intrinsics.areEqual(this.senderUserIDList, messageSearchFilter.senderUserIDList) && Intrinsics.areEqual(this.messageTypeList, messageSearchFilter.messageTypeList);
    }

    public MessageSearchFilter(@Nullable String str, int i11, int i12, @Nullable List<String> list, @Nullable List<? extends MessageType> list2) {
        this.conversationID = str;
        this.searchTimePosition = i11;
        this.searchTimePeriod = i12;
        this.senderUserIDList = list;
        this.messageTypeList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageSearchFilter copy$default(MessageSearchFilter messageSearchFilter, String str, int i11, int i12, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageSearchFilter.conversationID;
        }
        if ((i13 & 2) != 0) {
            i11 = messageSearchFilter.searchTimePosition;
        }
        if ((i13 & 4) != 0) {
            i12 = messageSearchFilter.searchTimePeriod;
        }
        if ((i13 & 8) != 0) {
            list = messageSearchFilter.senderUserIDList;
        }
        if ((i13 & 16) != 0) {
            list2 = messageSearchFilter.messageTypeList;
        }
        List list3 = list2;
        int i14 = i12;
        return messageSearchFilter.copy(str, i11, i14, list, list3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationID() {
        return this.conversationID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSearchTimePosition() {
        return this.searchTimePosition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSearchTimePeriod() {
        return this.searchTimePeriod;
    }

    @Nullable
    public final List<String> component4() {
        return this.senderUserIDList;
    }

    @Nullable
    public final List<MessageType> component5() {
        return this.messageTypeList;
    }

    @NotNull
    public final MessageSearchFilter copy(@Nullable String conversationID, int searchTimePosition, int searchTimePeriod, @Nullable List<String> senderUserIDList, @Nullable List<? extends MessageType> messageTypeList) {
        return new MessageSearchFilter(conversationID, searchTimePosition, searchTimePeriod, senderUserIDList, messageTypeList);
    }

    @Nullable
    public final String getConversationID() {
        return this.conversationID;
    }

    @Nullable
    public final List<MessageType> getMessageTypeList() {
        return this.messageTypeList;
    }

    public final int getSearchTimePeriod() {
        return this.searchTimePeriod;
    }

    public final int getSearchTimePosition() {
        return this.searchTimePosition;
    }

    @Nullable
    public final List<String> getSenderUserIDList() {
        return this.senderUserIDList;
    }

    public int hashCode() {
        String str = this.conversationID;
        int iM88225a = AbstractC39396a.m88225a(this.searchTimePeriod, AbstractC39396a.m88225a(this.searchTimePosition, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        List<String> list = this.senderUserIDList;
        int iHashCode = (iM88225a + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends MessageType> list2 = this.messageTypeList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setConversationID(@Nullable String str) {
        this.conversationID = str;
    }

    public final void setMessageTypeList(@Nullable List<? extends MessageType> list) {
        this.messageTypeList = list;
    }

    public final void setSearchTimePeriod(int i11) {
        this.searchTimePeriod = i11;
    }

    public final void setSearchTimePosition(int i11) {
        this.searchTimePosition = i11;
    }

    public final void setSenderUserIDList(@Nullable List<String> list) {
        this.senderUserIDList = list;
    }

    @NotNull
    public String toString() {
        return "MessageSearchFilter(conversationID=" + this.conversationID + ", searchTimePosition=" + this.searchTimePosition + ", searchTimePeriod=" + this.searchTimePeriod + ", senderUserIDList=" + this.senderUserIDList + ", messageTypeList=" + this.messageTypeList + ')';
    }

    public /* synthetic */ MessageSearchFilter(String str, int i11, int i12, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : list2);
    }
}
