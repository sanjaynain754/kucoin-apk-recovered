package io.trtc.tuikit.atomicxcore.api.contact;

import com.facebook.react.uimanager.ViewProps;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.contact.C39531G0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\"\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J&\u0010\u0017\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\"\u0010\u001d\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010 \u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J$\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J$\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001e\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J8\u00102\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u00067"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingStore;", "", "groupID", "", "(Ljava/lang/String;)V", "getGroupID", "()Ljava/lang/String;", "groupSettingState", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;", "getGroupSettingState", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;", "addGroupMember", "", "userIDList", "", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "changeGroupOwner", "newOwnerID", "deleteGroupMember", "members", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;", "dismissGroup", "fetchGroupAttributes", "keys", "fetchGroupInfo", "fetchGroupMemberList", ViewProps.ROLE, "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;", "fetchGroupMembersInfo", "fetchMoreGroupMemberList", "fetchSelfMemberInfo", "quitGroup", "setGroupInviteOption", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "setGroupJoinOption", "setGroupMemberMuteTime", "userID", "time", "", "setGroupMemberRole", "setMuteAllMembers", "isMuted", "", "setReceiveMessageOpt", "opt", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "setSelfGroupNameCard", TUIConstantDefine.NAME_CARD, "updateGroupProfile", "name", TUIConstants.TUIChat.NOTICE, "avatar", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class GroupSettingStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String groupID;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingStore;", "groupID", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final GroupSettingStore create(@NotNull String groupID) {
            Intrinsics.checkNotNullParameter(groupID, "groupID");
            return new C39531G0(groupID);
        }
    }

    public abstract void addGroupMember(@NotNull List<String> userIDList, @Nullable CompletionHandler completion);

    public abstract void changeGroupOwner(@NotNull String newOwnerID, @Nullable CompletionHandler completion);

    public abstract void deleteGroupMember(@NotNull List<GroupMember> members, @Nullable CompletionHandler completion);

    public abstract void dismissGroup(@Nullable CompletionHandler completion);

    public abstract void fetchGroupAttributes(@Nullable List<String> keys, @Nullable CompletionHandler completion);

    public abstract void fetchGroupInfo(@Nullable CompletionHandler completion);

    public abstract void fetchGroupMemberList(@NotNull GroupMemberRole role, @Nullable CompletionHandler completion);

    public abstract void fetchGroupMembersInfo(@NotNull List<String> userIDList, @Nullable CompletionHandler completion);

    public abstract void fetchMoreGroupMemberList(@Nullable CompletionHandler completion);

    public abstract void fetchSelfMemberInfo(@Nullable CompletionHandler completion);

    @NotNull
    public abstract GroupSettingState getGroupSettingState();

    public abstract void quitGroup(@Nullable CompletionHandler completion);

    public abstract void setGroupInviteOption(@NotNull GroupJoinOption option, @Nullable CompletionHandler completion);

    public abstract void setGroupJoinOption(@NotNull GroupJoinOption option, @Nullable CompletionHandler completion);

    public abstract void setGroupMemberMuteTime(@NotNull String userID, long time, @Nullable CompletionHandler completion);

    public abstract void setGroupMemberRole(@NotNull String userID, @NotNull GroupMemberRole role, @Nullable CompletionHandler completion);

    public abstract void setMuteAllMembers(boolean isMuted, @Nullable CompletionHandler completion);

    public abstract void setReceiveMessageOpt(@NotNull ReceiveMessageOpt opt, @Nullable CompletionHandler completion);

    public abstract void setSelfGroupNameCard(@Nullable String nameCard, @Nullable CompletionHandler completion);

    public abstract void updateGroupProfile(@Nullable String name, @Nullable String notice, @Nullable String avatar, @Nullable CompletionHandler completion);

    public GroupSettingStore(@NotNull String groupID) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        this.groupID = groupID;
    }

    public static /* synthetic */ void addGroupMember$default(GroupSettingStore groupSettingStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addGroupMember");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.addGroupMember(list, completionHandler);
    }

    public static /* synthetic */ void changeGroupOwner$default(GroupSettingStore groupSettingStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeGroupOwner");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.changeGroupOwner(str, completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final GroupSettingStore create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public static /* synthetic */ void deleteGroupMember$default(GroupSettingStore groupSettingStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteGroupMember");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.deleteGroupMember(list, completionHandler);
    }

    public static /* synthetic */ void dismissGroup$default(GroupSettingStore groupSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissGroup");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        groupSettingStore.dismissGroup(completionHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchGroupAttributes$default(GroupSettingStore groupSettingStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupAttributes");
        }
        if ((i11 & 1) != 0) {
            list = null;
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchGroupAttributes(list, completionHandler);
    }

    public static /* synthetic */ void fetchGroupInfo$default(GroupSettingStore groupSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupInfo");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchGroupInfo(completionHandler);
    }

    public static /* synthetic */ void fetchGroupMemberList$default(GroupSettingStore groupSettingStore, GroupMemberRole groupMemberRole, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupMemberList");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchGroupMemberList(groupMemberRole, completionHandler);
    }

    public static /* synthetic */ void fetchGroupMembersInfo$default(GroupSettingStore groupSettingStore, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupMembersInfo");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchGroupMembersInfo(list, completionHandler);
    }

    public static /* synthetic */ void fetchMoreGroupMemberList$default(GroupSettingStore groupSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMoreGroupMemberList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchMoreGroupMemberList(completionHandler);
    }

    public static /* synthetic */ void fetchSelfMemberInfo$default(GroupSettingStore groupSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSelfMemberInfo");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        groupSettingStore.fetchSelfMemberInfo(completionHandler);
    }

    public static /* synthetic */ void quitGroup$default(GroupSettingStore groupSettingStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: quitGroup");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        groupSettingStore.quitGroup(completionHandler);
    }

    public static /* synthetic */ void setGroupInviteOption$default(GroupSettingStore groupSettingStore, GroupJoinOption groupJoinOption, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroupInviteOption");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setGroupInviteOption(groupJoinOption, completionHandler);
    }

    public static /* synthetic */ void setGroupJoinOption$default(GroupSettingStore groupSettingStore, GroupJoinOption groupJoinOption, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroupJoinOption");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setGroupJoinOption(groupJoinOption, completionHandler);
    }

    public static /* synthetic */ void setGroupMemberMuteTime$default(GroupSettingStore groupSettingStore, String str, long j11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroupMemberMuteTime");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setGroupMemberMuteTime(str, j11, completionHandler);
    }

    public static /* synthetic */ void setGroupMemberRole$default(GroupSettingStore groupSettingStore, String str, GroupMemberRole groupMemberRole, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroupMemberRole");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setGroupMemberRole(str, groupMemberRole, completionHandler);
    }

    public static /* synthetic */ void setMuteAllMembers$default(GroupSettingStore groupSettingStore, boolean z11, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMuteAllMembers");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setMuteAllMembers(z11, completionHandler);
    }

    public static /* synthetic */ void setReceiveMessageOpt$default(GroupSettingStore groupSettingStore, ReceiveMessageOpt receiveMessageOpt, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReceiveMessageOpt");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setReceiveMessageOpt(receiveMessageOpt, completionHandler);
    }

    public static /* synthetic */ void setSelfGroupNameCard$default(GroupSettingStore groupSettingStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelfGroupNameCard");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        groupSettingStore.setSelfGroupNameCard(str, completionHandler);
    }

    public static /* synthetic */ void updateGroupProfile$default(GroupSettingStore groupSettingStore, String str, String str2, String str3, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGroupProfile");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            completionHandler = null;
        }
        groupSettingStore.updateGroupProfile(str, str2, str3, completionHandler);
    }

    @NotNull
    public String getGroupID() {
        return this.groupID;
    }
}
