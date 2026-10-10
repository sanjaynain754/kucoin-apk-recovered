package io.trtc.tuikit.atomicxcore.api.contact;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.contact.C39539O;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J0\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&JN\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010 \u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010!\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\"\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010#\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J&\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010'\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006*"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/ContactListStore;", "", "()V", "contactListState", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;", "getContactListState", "()Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;", "acceptFriendApplication", "", "info", "Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;", "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "acceptGroupApplication", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;", TUIConstants.TUIContact.Method.AddFriend.METHOD_NAME, "userID", "", "remark", "addWording", "clearFriendApplicationUnreadCount", "clearGroupApplicationUnreadCount", "createGroup", TUIConstants.TUIChat.GROUP_TYPE, "groupName", "groupID", "avatarURL", "memberList", "", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;", "fetchBlackList", "fetchFriendApplicationList", "fetchFriendList", "fetchGroupApplicationList", "fetchGroupInfo", "fetchJoinedGroupList", "fetchUserInfo", "joinGroup", "message", "refuseFriendApplication", "refuseGroupApplication", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class ContactListStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/ContactListStore$Companion;", "", "()V", "create", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactListStore;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ContactListStore create() {
            return new C39539O();
        }
    }

    public abstract void acceptFriendApplication(@NotNull FriendApplicationInfo info, @Nullable CompletionHandler completion);

    public abstract void acceptGroupApplication(@NotNull GroupApplicationInfo info, @Nullable CompletionHandler completion);

    public abstract void addFriend(@NotNull String userID, @Nullable String remark, @Nullable String addWording, @Nullable CompletionHandler completion);

    public abstract void clearFriendApplicationUnreadCount(@Nullable CompletionHandler completion);

    public abstract void clearGroupApplicationUnreadCount(@Nullable CompletionHandler completion);

    public abstract void createGroup(@NotNull String groupType, @NotNull String groupName, @Nullable String groupID, @Nullable String avatarURL, @Nullable List<ContactInfo> memberList, @Nullable CompletionHandler completion);

    public abstract void fetchBlackList(@Nullable CompletionHandler completion);

    public abstract void fetchFriendApplicationList(@Nullable CompletionHandler completion);

    public abstract void fetchFriendList(@Nullable CompletionHandler completion);

    public abstract void fetchGroupApplicationList(@Nullable CompletionHandler completion);

    public abstract void fetchGroupInfo(@NotNull String groupID, @Nullable CompletionHandler completion);

    public abstract void fetchJoinedGroupList(@Nullable CompletionHandler completion);

    public abstract void fetchUserInfo(@NotNull String userID, @Nullable CompletionHandler completion);

    @NotNull
    public abstract ContactListState getContactListState();

    public abstract void joinGroup(@NotNull String groupID, @Nullable String message, @Nullable CompletionHandler completion);

    public abstract void refuseFriendApplication(@NotNull FriendApplicationInfo info, @Nullable CompletionHandler completion);

    public abstract void refuseGroupApplication(@NotNull GroupApplicationInfo info, @Nullable CompletionHandler completion);

    public static /* synthetic */ void acceptFriendApplication$default(ContactListStore contactListStore, FriendApplicationInfo friendApplicationInfo, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptFriendApplication");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.acceptFriendApplication(friendApplicationInfo, completionHandler);
    }

    public static /* synthetic */ void acceptGroupApplication$default(ContactListStore contactListStore, GroupApplicationInfo groupApplicationInfo, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptGroupApplication");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.acceptGroupApplication(groupApplicationInfo, completionHandler);
    }

    public static /* synthetic */ void addFriend$default(ContactListStore contactListStore, String str, String str2, String str3, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFriend");
        }
        if ((i11 & 8) != 0) {
            completionHandler = null;
        }
        contactListStore.addFriend(str, str2, str3, completionHandler);
    }

    public static /* synthetic */ void clearFriendApplicationUnreadCount$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFriendApplicationUnreadCount");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.clearFriendApplicationUnreadCount(completionHandler);
    }

    public static /* synthetic */ void clearGroupApplicationUnreadCount$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearGroupApplicationUnreadCount");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.clearGroupApplicationUnreadCount(completionHandler);
    }

    @JvmStatic
    @NotNull
    public static final ContactListStore create() {
        return INSTANCE.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createGroup$default(ContactListStore contactListStore, String str, String str2, String str3, String str4, List list, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGroup");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            list = null;
        }
        if ((i11 & 32) != 0) {
            completionHandler = null;
        }
        contactListStore.createGroup(str, str2, str3, str4, list, completionHandler);
    }

    public static /* synthetic */ void fetchBlackList$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBlackList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchBlackList(completionHandler);
    }

    public static /* synthetic */ void fetchFriendApplicationList$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFriendApplicationList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchFriendApplicationList(completionHandler);
    }

    public static /* synthetic */ void fetchFriendList$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFriendList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchFriendList(completionHandler);
    }

    public static /* synthetic */ void fetchGroupApplicationList$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupApplicationList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchGroupApplicationList(completionHandler);
    }

    public static /* synthetic */ void fetchGroupInfo$default(ContactListStore contactListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchGroupInfo");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchGroupInfo(str, completionHandler);
    }

    public static /* synthetic */ void fetchJoinedGroupList$default(ContactListStore contactListStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchJoinedGroupList");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchJoinedGroupList(completionHandler);
    }

    public static /* synthetic */ void fetchUserInfo$default(ContactListStore contactListStore, String str, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUserInfo");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.fetchUserInfo(str, completionHandler);
    }

    public static /* synthetic */ void joinGroup$default(ContactListStore contactListStore, String str, String str2, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinGroup");
        }
        if ((i11 & 4) != 0) {
            completionHandler = null;
        }
        contactListStore.joinGroup(str, str2, completionHandler);
    }

    public static /* synthetic */ void refuseFriendApplication$default(ContactListStore contactListStore, FriendApplicationInfo friendApplicationInfo, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseFriendApplication");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.refuseFriendApplication(friendApplicationInfo, completionHandler);
    }

    public static /* synthetic */ void refuseGroupApplication$default(ContactListStore contactListStore, GroupApplicationInfo groupApplicationInfo, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refuseGroupApplication");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        contactListStore.refuseGroupApplication(groupApplicationInfo, completionHandler);
    }
}
