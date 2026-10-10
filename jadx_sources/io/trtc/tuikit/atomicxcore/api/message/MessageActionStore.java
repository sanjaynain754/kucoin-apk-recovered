package io.trtc.tuikit.atomicxcore.api.message;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.message.C39850o;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J$\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J$\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\"\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\"\u0010$\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00162\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J4\u0010'\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\b\u0010)\u001a\u0004\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006,"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageActionStore;", "", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V", "getMessage", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "messageActionState", "Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;", "getMessageActionState", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;", "addMessageReaction", "", "reactionID", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "convertVoiceToText", "language", "deleteMessage", "deleteMessageExtensions", "keys", "", "fetchMessageReactionUsers", "count", "", "fetchMessageReadMembers", "fetchMessageUnreadMembers", "fetchMoreMessageMembers", "isRead", "", "fetchMoreMessageReactionUsers", "pinMessage", "isPinned", "recallMessage", "removeMessageReaction", "setMessageExtensions", "extensions", "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;", "translateText", "sourceTextList", "sourceLanguage", "targetLanguage", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MessageActionStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageInfo message;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageActionStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/message/MessageActionStore;", "message", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MessageActionStore create(@NotNull MessageInfo message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new C39850o(message);
        }
    }

    public abstract void addMessageReaction(@NotNull String reactionID, @Nullable CompletionHandler completion);

    public abstract void convertVoiceToText(@NotNull String language, @Nullable CompletionHandler completion);

    public abstract void deleteMessage(@Nullable CompletionHandler completion);

    public abstract void deleteMessageExtensions(@Nullable List<String> keys, @Nullable CompletionHandler completion);

    public abstract void fetchMessageReactionUsers(@NotNull String reactionID, int count, @Nullable CompletionHandler completion);

    public abstract void fetchMessageReadMembers(int count, @Nullable CompletionHandler completion);

    public abstract void fetchMessageUnreadMembers(int count, @Nullable CompletionHandler completion);

    public abstract void fetchMoreMessageMembers(boolean isRead, @Nullable CompletionHandler completion);

    public abstract void fetchMoreMessageReactionUsers(@Nullable CompletionHandler completion);

    @NotNull
    public abstract MessageActionState getMessageActionState();

    public abstract void pinMessage(boolean isPinned, @Nullable CompletionHandler completion);

    public abstract void recallMessage(@Nullable CompletionHandler completion);

    public abstract void removeMessageReaction(@NotNull String reactionID, @Nullable CompletionHandler completion);

    public abstract void setMessageExtensions(@NotNull List<MessageExtension> extensions, @Nullable CompletionHandler completion);

    public abstract void translateText(@NotNull List<String> sourceTextList, @Nullable String sourceLanguage, @NotNull String targetLanguage, @Nullable CompletionHandler completion);

    public MessageActionStore(@NotNull MessageInfo message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public static /* synthetic */ void addMessageReaction$default(MessageActionStore messageActionStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMessageReaction");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.addMessageReaction(str, completionHandler);
    }

    public static /* synthetic */ void convertVoiceToText$default(MessageActionStore messageActionStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertVoiceToText");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.convertVoiceToText(str, completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final MessageActionStore create(@NotNull MessageInfo messageInfo) {
        return INSTANCE.create(messageInfo);
    }

    public static /* synthetic */ void deleteMessage$default(MessageActionStore messageActionStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteMessage");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        messageActionStore.deleteMessage(completionHandler);
    }

    public static /* synthetic */ void deleteMessageExtensions$default(MessageActionStore messageActionStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteMessageExtensions");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.deleteMessageExtensions(list, completionHandler);
    }

    public static /* synthetic */ void fetchMessageReactionUsers$default(MessageActionStore messageActionStore, String str, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageReactionUsers");
        }
        if ((i12 & 4) != 0) {
            completionHandler = null;
        }
        messageActionStore.fetchMessageReactionUsers(str, i11, completionHandler);
    }

    public static /* synthetic */ void fetchMessageReadMembers$default(MessageActionStore messageActionStore, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageReadMembers");
        }
        if ((i12 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.fetchMessageReadMembers(i11, completionHandler);
    }

    public static /* synthetic */ void fetchMessageUnreadMembers$default(MessageActionStore messageActionStore, int i11, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageUnreadMembers");
        }
        if ((i12 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.fetchMessageUnreadMembers(i11, completionHandler);
    }

    public static /* synthetic */ void fetchMoreMessageMembers$default(MessageActionStore messageActionStore, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMoreMessageMembers");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.fetchMoreMessageMembers(z11, completionHandler);
    }

    public static /* synthetic */ void fetchMoreMessageReactionUsers$default(MessageActionStore messageActionStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMoreMessageReactionUsers");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        messageActionStore.fetchMoreMessageReactionUsers(completionHandler);
    }

    public static /* synthetic */ void pinMessage$default(MessageActionStore messageActionStore, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pinMessage");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.pinMessage(z11, completionHandler);
    }

    public static /* synthetic */ void recallMessage$default(MessageActionStore messageActionStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recallMessage");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        messageActionStore.recallMessage(completionHandler);
    }

    public static /* synthetic */ void removeMessageReaction$default(MessageActionStore messageActionStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeMessageReaction");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.removeMessageReaction(str, completionHandler);
    }

    public static /* synthetic */ void setMessageExtensions$default(MessageActionStore messageActionStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMessageExtensions");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        messageActionStore.setMessageExtensions(list, completionHandler);
    }

    public static /* synthetic */ void translateText$default(MessageActionStore messageActionStore, List list, String str, String str2, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateText");
        }
        if ((i11 & 8) != 0) {
            completionHandler = null;
        }
        messageActionStore.translateText(list, str, str2, completionHandler);
    }

    @NotNull
    public MessageInfo getMessage() {
        return this.message;
    }
}
