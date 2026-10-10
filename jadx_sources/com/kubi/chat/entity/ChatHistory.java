package com.kubi.chat.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003Jf\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatHistory;", "", "receiverReadSeqId", "", "senderReadSeqId", "receiverLatestSendSeqId", "currentMsgSeqId", "lastSeqId", "", "listMessage", "", "Lcom/kubi/chat/entity/ChatMessages;", "end", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Z)V", "getCurrentMsgSeqId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnd", "()Z", "getLastSeqId", "()Ljava/lang/String;", "getListMessage", "()Ljava/util/List;", "getReceiverLatestSendSeqId", "getReceiverReadSeqId", "getSenderReadSeqId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Z)Lcom/kubi/chat/entity/ChatHistory;", "equals", "other", "hashCode", "", "toString", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ChatHistory {

    @Nullable
    private final Long currentMsgSeqId;
    private final boolean end;

    @Nullable
    private final String lastSeqId;

    @Nullable
    private final List<ChatMessages> listMessage;

    @Nullable
    private final Long receiverLatestSendSeqId;

    @Nullable
    private final Long receiverReadSeqId;

    @Nullable
    private final Long senderReadSeqId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatHistory)) {
            return false;
        }
        ChatHistory chatHistory = (ChatHistory) other;
        return Intrinsics.areEqual(this.receiverReadSeqId, chatHistory.receiverReadSeqId) && Intrinsics.areEqual(this.senderReadSeqId, chatHistory.senderReadSeqId) && Intrinsics.areEqual(this.receiverLatestSendSeqId, chatHistory.receiverLatestSendSeqId) && Intrinsics.areEqual(this.currentMsgSeqId, chatHistory.currentMsgSeqId) && Intrinsics.areEqual(this.lastSeqId, chatHistory.lastSeqId) && Intrinsics.areEqual(this.listMessage, chatHistory.listMessage) && this.end == chatHistory.end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatHistory copy$default(ChatHistory chatHistory, Long l11, Long l12, Long l13, Long l14, String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = chatHistory.receiverReadSeqId;
        }
        if ((i11 & 2) != 0) {
            l12 = chatHistory.senderReadSeqId;
        }
        if ((i11 & 4) != 0) {
            l13 = chatHistory.receiverLatestSendSeqId;
        }
        if ((i11 & 8) != 0) {
            l14 = chatHistory.currentMsgSeqId;
        }
        if ((i11 & 16) != 0) {
            str = chatHistory.lastSeqId;
        }
        if ((i11 & 32) != 0) {
            list = chatHistory.listMessage;
        }
        if ((i11 & 64) != 0) {
            z11 = chatHistory.end;
        }
        List list2 = list;
        boolean z12 = z11;
        String str2 = str;
        Long l15 = l13;
        return chatHistory.copy(l11, l12, l15, l14, str2, list2, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getReceiverReadSeqId() {
        return this.receiverReadSeqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSenderReadSeqId() {
        return this.senderReadSeqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getReceiverLatestSendSeqId() {
        return this.receiverLatestSendSeqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCurrentMsgSeqId() {
        return this.currentMsgSeqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastSeqId() {
        return this.lastSeqId;
    }

    @Nullable
    public final List<ChatMessages> component6() {
        return this.listMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEnd() {
        return this.end;
    }

    @NotNull
    public final ChatHistory copy(@Nullable Long receiverReadSeqId, @Nullable Long senderReadSeqId, @Nullable Long receiverLatestSendSeqId, @Nullable Long currentMsgSeqId, @Nullable String lastSeqId, @Nullable List<ChatMessages> listMessage, boolean end) {
        return new ChatHistory(receiverReadSeqId, senderReadSeqId, receiverLatestSendSeqId, currentMsgSeqId, lastSeqId, listMessage, end);
    }

    @Nullable
    public final Long getCurrentMsgSeqId() {
        return this.currentMsgSeqId;
    }

    public final boolean getEnd() {
        return this.end;
    }

    @Nullable
    public final String getLastSeqId() {
        return this.lastSeqId;
    }

    @Nullable
    public final List<ChatMessages> getListMessage() {
        return this.listMessage;
    }

    @Nullable
    public final Long getReceiverLatestSendSeqId() {
        return this.receiverLatestSendSeqId;
    }

    @Nullable
    public final Long getReceiverReadSeqId() {
        return this.receiverReadSeqId;
    }

    @Nullable
    public final Long getSenderReadSeqId() {
        return this.senderReadSeqId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        Long l11 = this.receiverReadSeqId;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.senderReadSeqId;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.receiverLatestSendSeqId;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.currentMsgSeqId;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.lastSeqId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<ChatMessages> list = this.listMessage;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z11 = this.end;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode6 + r11;
    }

    @NotNull
    public String toString() {
        return "ChatHistory(receiverReadSeqId=" + this.receiverReadSeqId + ", senderReadSeqId=" + this.senderReadSeqId + ", receiverLatestSendSeqId=" + this.receiverLatestSendSeqId + ", currentMsgSeqId=" + this.currentMsgSeqId + ", lastSeqId=" + ((Object) this.lastSeqId) + ", listMessage=" + this.listMessage + ", end=" + this.end + ')';
    }

    public ChatHistory(@Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable String str, @Nullable List<ChatMessages> list, boolean z11) {
        this.receiverReadSeqId = l11;
        this.senderReadSeqId = l12;
        this.receiverLatestSendSeqId = l13;
        this.currentMsgSeqId = l14;
        this.lastSeqId = str;
        this.listMessage = list;
        this.end = z11;
    }
}
