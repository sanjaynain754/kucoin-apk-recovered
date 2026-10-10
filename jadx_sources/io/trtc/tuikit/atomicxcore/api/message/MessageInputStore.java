package io.trtc.tuikit.atomicxcore.api.message;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.message.C39856r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;", "", "conversationID", "", "(Ljava/lang/String;)V", "getConversationID", "()Ljava/lang/String;", TUIConstants.TUIChat.METHOD_SEND_MESSAGE, "", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MessageInputStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String conversationID;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;", "conversationID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MessageInputStore create(@NotNull String conversationID) {
            Intrinsics.checkNotNullParameter(conversationID, "conversationID");
            return new C39856r(conversationID);
        }
    }

    public abstract void sendMessage(@NotNull MessageInfo message, @Nullable CompletionHandler completion);

    public MessageInputStore(@NotNull String conversationID) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        this.conversationID = conversationID;
    }

    @JvmStatic
    @NotNull
    public static final MessageInputStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public static /* synthetic */ void sendMessage$default(MessageInputStore messageInputStore, MessageInfo messageInfo, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageInputStore.sendMessage(messageInfo, completionHandler);
    }

    @NotNull
    public String getConversationID() {
        return this.conversationID;
    }
}
