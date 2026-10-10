package io.trtc.tuikit.atomicxcore.api.conversation;

import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.conversation.C39606E;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J2\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J$\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J$\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J&\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006#"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListStore;", "", "()V", "conversationListState", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;", "getConversationListState", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;", "clearConversationMessages", "", "conversationID", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "clearConversationUnreadCount", TUIConstants.TUIConversation.METHOD_DELETE_CONVERSATION, "fetchConversationInfo", "fetchConversationList", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;", "fetchMoreConversationList", "getConversationTotalUnreadCount", "markConversation", "conversationIDList", "", "markType", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "muteConversation", "mute", "pinConversation", "pin", "setConversationDraft", "draft", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class ConversationListStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ConversationListStore create() {
            return new C39606E();
        }
    }

    public abstract void clearConversationMessages(@NotNull String conversationID, @Nullable CompletionHandler completion);

    public abstract void clearConversationUnreadCount(@NotNull String conversationID, @Nullable CompletionHandler completion);

    public abstract void deleteConversation(@NotNull String conversationID, @Nullable CompletionHandler completion);

    public abstract void fetchConversationInfo(@NotNull String conversationID, @Nullable CompletionHandler completion);

    public abstract void fetchConversationList(@NotNull ConversationFetchOption option, @Nullable CompletionHandler completion);

    public abstract void fetchMoreConversationList(@Nullable CompletionHandler completion);

    @NotNull
    public abstract ConversationListState getConversationListState();

    public abstract void getConversationTotalUnreadCount(@Nullable CompletionHandler completion);

    public abstract void markConversation(@NotNull List<String> conversationIDList, @NotNull ConversationMarkType markType, boolean enable, @Nullable CompletionHandler completion);

    public abstract void muteConversation(@NotNull String conversationID, boolean mute, @Nullable CompletionHandler completion);

    public abstract void pinConversation(@NotNull String conversationID, boolean pin, @Nullable CompletionHandler completion);

    public abstract void setConversationDraft(@NotNull String conversationID, @Nullable String draft, @Nullable CompletionHandler completion);

    public static /* synthetic */ void clearConversationMessages$default(ConversationListStore conversationListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearConversationMessages");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationListStore.clearConversationMessages(str, completionHandler);
    }

    public static /* synthetic */ void clearConversationUnreadCount$default(ConversationListStore conversationListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearConversationUnreadCount");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationListStore.clearConversationUnreadCount(str, completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final ConversationListStore create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ void deleteConversation$default(ConversationListStore conversationListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteConversation");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationListStore.deleteConversation(str, completionHandler);
    }

    public static /* synthetic */ void fetchConversationInfo$default(ConversationListStore conversationListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchConversationInfo");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationListStore.fetchConversationInfo(str, completionHandler);
    }

    public static /* synthetic */ void fetchConversationList$default(ConversationListStore conversationListStore, ConversationFetchOption conversationFetchOption, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchConversationList");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationListStore.fetchConversationList(conversationFetchOption, completionHandler);
    }

    public static /* synthetic */ void fetchMoreConversationList$default(ConversationListStore conversationListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMoreConversationList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        conversationListStore.fetchMoreConversationList(completionHandler);
    }

    public static /* synthetic */ void getConversationTotalUnreadCount$default(ConversationListStore conversationListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationTotalUnreadCount");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        conversationListStore.getConversationTotalUnreadCount(completionHandler);
    }

    public static /* synthetic */ void markConversation$default(ConversationListStore conversationListStore, List list, ConversationMarkType conversationMarkType, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markConversation");
        }
        if ((i11 & 8) != 0) {
            completionHandler = null;
        }
        conversationListStore.markConversation(list, conversationMarkType, z11, completionHandler);
    }

    public static /* synthetic */ void muteConversation$default(ConversationListStore conversationListStore, String str, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: muteConversation");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationListStore.muteConversation(str, z11, completionHandler);
    }

    public static /* synthetic */ void pinConversation$default(ConversationListStore conversationListStore, String str, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pinConversation");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationListStore.pinConversation(str, z11, completionHandler);
    }

    public static /* synthetic */ void setConversationDraft$default(ConversationListStore conversationListStore, String str, String str2, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConversationDraft");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationListStore.setConversationDraft(str, str2, completionHandler);
    }
}
