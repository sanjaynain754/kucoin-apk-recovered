package io.trtc.tuikit.atomicxcore.api.conversation;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.conversation.C39627j;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J*\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001c\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0014\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J$\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupStore;", "", "()V", "conversationGroupState", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;", "getConversationGroupState", "()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;", "addConversationsToGroup", "", "groupName", "", "conversationIDList", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "createGroup", "deleteConversationsFromGroup", "deleteGroup", "fetchGroupList", "renameGroup", "oldName", "newName", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class ConversationGroupStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ConversationGroupStore create() {
            return new C39627j();
        }
    }

    public abstract void addConversationsToGroup(@NotNull String groupName, @NotNull List<String> conversationIDList, @Nullable CompletionHandler completion);

    public abstract void createGroup(@NotNull String groupName, @NotNull List<String> conversationIDList, @Nullable CompletionHandler completion);

    public abstract void deleteConversationsFromGroup(@NotNull String groupName, @NotNull List<String> conversationIDList, @Nullable CompletionHandler completion);

    public abstract void deleteGroup(@NotNull String groupName, @Nullable CompletionHandler completion);

    public abstract void fetchGroupList(@Nullable CompletionHandler completion);

    @NotNull
    public abstract ConversationGroupState getConversationGroupState();

    public abstract void renameGroup(@NotNull String oldName, @NotNull String newName, @Nullable CompletionHandler completion);

    public static /* synthetic */ void addConversationsToGroup$default(ConversationGroupStore conversationGroupStore, String str, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addConversationsToGroup");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.addConversationsToGroup(str, list, completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final ConversationGroupStore create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ void createGroup$default(ConversationGroupStore conversationGroupStore, String str, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGroup");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.createGroup(str, list, completionHandler);
    }

    public static /* synthetic */ void deleteConversationsFromGroup$default(ConversationGroupStore conversationGroupStore, String str, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteConversationsFromGroup");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.deleteConversationsFromGroup(str, list, completionHandler);
    }

    public static /* synthetic */ void deleteGroup$default(ConversationGroupStore conversationGroupStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteGroup");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.deleteGroup(str, completionHandler);
    }

    public static /* synthetic */ void fetchGroupList$default(ConversationGroupStore conversationGroupStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.fetchGroupList(completionHandler);
    }

    public static /* synthetic */ void renameGroup$default(ConversationGroupStore conversationGroupStore, String str, String str2, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renameGroup");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        conversationGroupStore.renameGroup(str, str2, completionHandler);
    }
}
