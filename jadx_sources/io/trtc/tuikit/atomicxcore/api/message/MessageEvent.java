package io.trtc.tuikit.atomicxcore.api.message;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "", "()V", "DeleteMessages", "FetchMessages", "FetchMoreMessages", "RecvMessage", "SendMessage", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMoreMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$RecvMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$SendMessage;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MessageEvent {

    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "messageList", "", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Ljava/util/List;)V", "getMessageList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class DeleteMessages extends MessageEvent {

        @NotNull
        private final List<MessageInfo> messageList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteMessages) && Intrinsics.areEqual(this.messageList, ((DeleteMessages) other).messageList);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteMessages(@NotNull List<MessageInfo> messageList) {
            super(null);
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            this.messageList = messageList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeleteMessages copy$default(DeleteMessages deleteMessages, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = deleteMessages.messageList;
            }
            return deleteMessages.copy(list);
        }

        @NotNull
        public final List<MessageInfo> component1() {
            return this.messageList;
        }

        @NotNull
        public final DeleteMessages copy(@NotNull List<MessageInfo> messageList) {
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            return new DeleteMessages(messageList);
        }

        @NotNull
        public final List<MessageInfo> getMessageList() {
            return this.messageList;
        }

        public int hashCode() {
            return this.messageList.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeleteMessages(messageList=" + this.messageList + ')';
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "messageList", "", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "direction", "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;", "(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;)V", "getDirection", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;", "getMessageList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class FetchMessages extends MessageEvent {

        @NotNull
        private final MessageFetchDirection direction;

        @NotNull
        private final List<MessageInfo> messageList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchMessages)) {
                return false;
            }
            FetchMessages fetchMessages = (FetchMessages) other;
            return Intrinsics.areEqual(this.messageList, fetchMessages.messageList) && this.direction == fetchMessages.direction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchMessages(@NotNull List<MessageInfo> messageList, @NotNull MessageFetchDirection direction) {
            super(null);
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.messageList = messageList;
            this.direction = direction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FetchMessages copy$default(FetchMessages fetchMessages, List list, MessageFetchDirection messageFetchDirection, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = fetchMessages.messageList;
            }
            if ((i11 & 2) != 0) {
                messageFetchDirection = fetchMessages.direction;
            }
            return fetchMessages.copy(list, messageFetchDirection);
        }

        @NotNull
        public final List<MessageInfo> component1() {
            return this.messageList;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageFetchDirection getDirection() {
            return this.direction;
        }

        @NotNull
        public final FetchMessages copy(@NotNull List<MessageInfo> messageList, @NotNull MessageFetchDirection direction) {
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new FetchMessages(messageList, direction);
        }

        @NotNull
        public final MessageFetchDirection getDirection() {
            return this.direction;
        }

        @NotNull
        public final List<MessageInfo> getMessageList() {
            return this.messageList;
        }

        public int hashCode() {
            return this.direction.hashCode() + (this.messageList.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FetchMessages(messageList=" + this.messageList + ", direction=" + this.direction + ')';
        }
    }

    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMoreMessages;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "messageList", "", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Ljava/util/List;)V", "getMessageList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class FetchMoreMessages extends MessageEvent {

        @NotNull
        private final List<MessageInfo> messageList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchMoreMessages) && Intrinsics.areEqual(this.messageList, ((FetchMoreMessages) other).messageList);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchMoreMessages(@NotNull List<MessageInfo> messageList) {
            super(null);
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            this.messageList = messageList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FetchMoreMessages copy$default(FetchMoreMessages fetchMoreMessages, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = fetchMoreMessages.messageList;
            }
            return fetchMoreMessages.copy(list);
        }

        @NotNull
        public final List<MessageInfo> component1() {
            return this.messageList;
        }

        @NotNull
        public final FetchMoreMessages copy(@NotNull List<MessageInfo> messageList) {
            Intrinsics.checkNotNullParameter(messageList, "messageList");
            return new FetchMoreMessages(messageList);
        }

        @NotNull
        public final List<MessageInfo> getMessageList() {
            return this.messageList;
        }

        public int hashCode() {
            return this.messageList.hashCode();
        }

        @NotNull
        public String toString() {
            return "FetchMoreMessages(messageList=" + this.messageList + ')';
        }
    }

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$RecvMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V", "getMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class RecvMessage extends MessageEvent {

        @NotNull
        private final MessageInfo message;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecvMessage) && Intrinsics.areEqual(this.message, ((RecvMessage) other).message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecvMessage(@NotNull MessageInfo message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ RecvMessage copy$default(RecvMessage recvMessage, MessageInfo messageInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messageInfo = recvMessage.message;
            }
            return recvMessage.copy(messageInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageInfo getMessage() {
            return this.message;
        }

        @NotNull
        public final RecvMessage copy(@NotNull MessageInfo message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new RecvMessage(message);
        }

        @NotNull
        public final MessageInfo getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "RecvMessage(message=" + this.message + ')';
        }
    }

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$SendMessage;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V", "getMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final /* data */ class SendMessage extends MessageEvent {

        @NotNull
        private final MessageInfo message;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendMessage) && Intrinsics.areEqual(this.message, ((SendMessage) other).message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessage(@NotNull MessageInfo message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ SendMessage copy$default(SendMessage sendMessage, MessageInfo messageInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messageInfo = sendMessage.message;
            }
            return sendMessage.copy(messageInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageInfo getMessage() {
            return this.message;
        }

        @NotNull
        public final SendMessage copy(@NotNull MessageInfo message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new SendMessage(message);
        }

        @NotNull
        public final MessageInfo getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "SendMessage(message=" + this.message + ')';
        }
    }

    public /* synthetic */ MessageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessageEvent() {
    }
}
