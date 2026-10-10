package io.trtc.tuikit.atomicxcore.api.message;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.message.C39857r0;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001f\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b!\u0010\u001cJ9\u0010$\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageListStore;", "", "", "conversationID", "Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;", "messageListType", "<init>", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;)V", "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "completion", "", "fetchMessageList", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;", "direction", "fetchMoreMessageList", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageMediaFileType;", "resourceType", "downloadMessageResource", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MessageMediaFileType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "", "messageList", "sendMessageReadReceipts", "(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "", "maxUserCountPerReaction", "fetchMessageReactions", "(Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "deleteMessages", "Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;", "forwardOption", "forwardMessages", "(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V", "Ljava/lang/String;", "getConversationID", "()Ljava/lang/String;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;", "getMessageListType", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;", "getMessageListState", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;", "messageListState", "Lkotlinx/coroutines/flow/r;", "Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;", "getMessageEventFlow", "()Lkotlinx/coroutines/flow/r;", "messageEventFlow", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MessageListStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String conversationID;

    @NotNull
    private final MessageListType messageListType;

    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageListStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/message/MessageListStore;", "conversationID", "", "messageListType", "Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MessageListStore create(@NotNull String conversationID, @NotNull MessageListType messageListType) {
            Intrinsics.checkNotNullParameter(conversationID, "conversationID");
            Intrinsics.checkNotNullParameter(messageListType, "messageListType");
            return new C39857r0(conversationID, messageListType);
        }
    }

    public abstract void deleteMessages(@NotNull List<MessageInfo> messageList, @Nullable CompletionHandler completion);

    public abstract void downloadMessageResource(@NotNull MessageInfo message, @NotNull MessageMediaFileType resourceType, @Nullable CompletionHandler completion);

    public abstract void fetchMessageList(@NotNull MessageFetchOption option, @Nullable CompletionHandler completion);

    public abstract void fetchMessageReactions(@NotNull List<MessageInfo> messageList, int maxUserCountPerReaction, @Nullable CompletionHandler completion);

    public abstract void fetchMoreMessageList(@NotNull MessageFetchDirection direction, @Nullable CompletionHandler completion);

    public abstract void forwardMessages(@NotNull List<MessageInfo> messageList, @NotNull MessageForwardOption forwardOption, @NotNull String conversationID, @Nullable CompletionHandler completion);

    @NotNull
    public abstract InterfaceC41673r<MessageEvent> getMessageEventFlow();

    @NotNull
    public abstract MessageListState getMessageListState();

    public abstract void sendMessageReadReceipts(@NotNull List<MessageInfo> messageList, @Nullable CompletionHandler completion);

    public MessageListStore(@NotNull String conversationID, @NotNull MessageListType messageListType) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(messageListType, "messageListType");
        this.conversationID = conversationID;
        this.messageListType = messageListType;
    }

    @JvmStatic
    @NotNull
    public static final MessageListStore create(@NotNull String str, @NotNull MessageListType messageListType) {
        return INSTANCE.create(str, messageListType);
    }

    public static /* synthetic */ void deleteMessages$default(MessageListStore messageListStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteMessages");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageListStore.deleteMessages(list, completionHandler);
    }

    public static /* synthetic */ void downloadMessageResource$default(MessageListStore messageListStore, MessageInfo messageInfo, MessageMediaFileType messageMediaFileType, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadMessageResource");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        messageListStore.downloadMessageResource(messageInfo, messageMediaFileType, completionHandler);
    }

    public static /* synthetic */ void fetchMessageList$default(MessageListStore messageListStore, MessageFetchOption messageFetchOption, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageList");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageListStore.fetchMessageList(messageFetchOption, completionHandler);
    }

    public static /* synthetic */ void fetchMessageReactions$default(MessageListStore messageListStore, List list, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageReactions");
        }
        if ((i12 & 4) != 0) {
            completionHandler = null;
        }
        messageListStore.fetchMessageReactions(list, i11, completionHandler);
    }

    public static /* synthetic */ void fetchMoreMessageList$default(MessageListStore messageListStore, MessageFetchDirection messageFetchDirection, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMoreMessageList");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageListStore.fetchMoreMessageList(messageFetchDirection, completionHandler);
    }

    public static /* synthetic */ void forwardMessages$default(MessageListStore messageListStore, List list, MessageForwardOption messageForwardOption, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forwardMessages");
        }
        if ((i11 & 8) != 0) {
            completionHandler = null;
        }
        messageListStore.forwardMessages(list, messageForwardOption, str, completionHandler);
    }

    public static /* synthetic */ void sendMessageReadReceipts$default(MessageListStore messageListStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageReadReceipts");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageListStore.sendMessageReadReceipts(list, completionHandler);
    }

    @NotNull
    public String getConversationID() {
        return this.conversationID;
    }

    @NotNull
    public MessageListType getMessageListType() {
        return this.messageListType;
    }
}
