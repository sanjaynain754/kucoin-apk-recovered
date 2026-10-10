package io.trtc.tuikit.atomicxcore.api.search;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00065"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;", "", "groupID", "", TUIConstants.TUIChat.GROUP_TYPE, "Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", "groupName", TUIConstants.TUIChat.MEMBER_COUNT, "", "groupAvatarURL", "introduction", "joinGroupApprovalType", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "inviteToGroupApprovalType", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V", "getGroupAvatarURL", "()Ljava/lang/String;", "setGroupAvatarURL", "(Ljava/lang/String;)V", "getGroupID", "setGroupID", "getGroupName", "setGroupName", "getGroupType", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", "setGroupType", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;)V", "getIntroduction", "setIntroduction", "getInviteToGroupApprovalType", "()Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "setInviteToGroupApprovalType", "(Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V", "getJoinGroupApprovalType", "setJoinGroupApprovalType", "getMemberCount", "()I", "setMemberCount", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupSearchInfo {

    @NotNull
    private String groupAvatarURL;

    @NotNull
    private String groupID;

    @NotNull
    private String groupName;

    @NotNull
    private GroupType groupType;

    @NotNull
    private String introduction;

    @NotNull
    private GroupJoinOption inviteToGroupApprovalType;

    @NotNull
    private GroupJoinOption joinGroupApprovalType;
    private int memberCount;

    public GroupSearchInfo(@NotNull String groupID, @NotNull GroupType groupType, @NotNull String groupName, int i11, @NotNull String groupAvatarURL, @NotNull String introduction, @NotNull GroupJoinOption joinGroupApprovalType, @NotNull GroupJoinOption inviteToGroupApprovalType) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(groupAvatarURL, "groupAvatarURL");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(joinGroupApprovalType, "joinGroupApprovalType");
        Intrinsics.checkNotNullParameter(inviteToGroupApprovalType, "inviteToGroupApprovalType");
        this.groupID = groupID;
        this.groupType = groupType;
        this.groupName = groupName;
        this.memberCount = i11;
        this.groupAvatarURL = groupAvatarURL;
        this.introduction = introduction;
        this.joinGroupApprovalType = joinGroupApprovalType;
        this.inviteToGroupApprovalType = inviteToGroupApprovalType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSearchInfo)) {
            return false;
        }
        GroupSearchInfo groupSearchInfo = (GroupSearchInfo) other;
        return Intrinsics.areEqual(this.groupID, groupSearchInfo.groupID) && this.groupType == groupSearchInfo.groupType && Intrinsics.areEqual(this.groupName, groupSearchInfo.groupName) && this.memberCount == groupSearchInfo.memberCount && Intrinsics.areEqual(this.groupAvatarURL, groupSearchInfo.groupAvatarURL) && Intrinsics.areEqual(this.introduction, groupSearchInfo.introduction) && this.joinGroupApprovalType == groupSearchInfo.joinGroupApprovalType && this.inviteToGroupApprovalType == groupSearchInfo.inviteToGroupApprovalType;
    }

    public static /* synthetic */ GroupSearchInfo copy$default(GroupSearchInfo groupSearchInfo, String str, GroupType groupType, String str2, int i11, String str3, String str4, GroupJoinOption groupJoinOption, GroupJoinOption groupJoinOption2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = groupSearchInfo.groupID;
        }
        if ((i12 & 2) != 0) {
            groupType = groupSearchInfo.groupType;
        }
        if ((i12 & 4) != 0) {
            str2 = groupSearchInfo.groupName;
        }
        if ((i12 & 8) != 0) {
            i11 = groupSearchInfo.memberCount;
        }
        if ((i12 & 16) != 0) {
            str3 = groupSearchInfo.groupAvatarURL;
        }
        if ((i12 & 32) != 0) {
            str4 = groupSearchInfo.introduction;
        }
        if ((i12 & 64) != 0) {
            groupJoinOption = groupSearchInfo.joinGroupApprovalType;
        }
        if ((i12 & 128) != 0) {
            groupJoinOption2 = groupSearchInfo.inviteToGroupApprovalType;
        }
        GroupJoinOption groupJoinOption3 = groupJoinOption;
        GroupJoinOption groupJoinOption4 = groupJoinOption2;
        String str5 = str3;
        String str6 = str4;
        return groupSearchInfo.copy(str, groupType, str2, i11, str5, str6, groupJoinOption3, groupJoinOption4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroupID() {
        return this.groupID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroupType getGroupType() {
        return this.groupType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupAvatarURL() {
        return this.groupAvatarURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GroupJoinOption getJoinGroupApprovalType() {
        return this.joinGroupApprovalType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GroupJoinOption getInviteToGroupApprovalType() {
        return this.inviteToGroupApprovalType;
    }

    @NotNull
    public final GroupSearchInfo copy(@NotNull String groupID, @NotNull GroupType groupType, @NotNull String groupName, int memberCount, @NotNull String groupAvatarURL, @NotNull String introduction, @NotNull GroupJoinOption joinGroupApprovalType, @NotNull GroupJoinOption inviteToGroupApprovalType) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(groupAvatarURL, "groupAvatarURL");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(joinGroupApprovalType, "joinGroupApprovalType");
        Intrinsics.checkNotNullParameter(inviteToGroupApprovalType, "inviteToGroupApprovalType");
        return new GroupSearchInfo(groupID, groupType, groupName, memberCount, groupAvatarURL, introduction, joinGroupApprovalType, inviteToGroupApprovalType);
    }

    @NotNull
    public final String getGroupAvatarURL() {
        return this.groupAvatarURL;
    }

    @NotNull
    public final String getGroupID() {
        return this.groupID;
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final GroupType getGroupType() {
        return this.groupType;
    }

    @NotNull
    public final String getIntroduction() {
        return this.introduction;
    }

    @NotNull
    public final GroupJoinOption getInviteToGroupApprovalType() {
        return this.inviteToGroupApprovalType;
    }

    @NotNull
    public final GroupJoinOption getJoinGroupApprovalType() {
        return this.joinGroupApprovalType;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public int hashCode() {
        return this.inviteToGroupApprovalType.hashCode() + ((this.joinGroupApprovalType.hashCode() + AbstractC39391a.m88220a(this.introduction, AbstractC39391a.m88220a(this.groupAvatarURL, AbstractC39396a.m88225a(this.memberCount, AbstractC39391a.m88220a(this.groupName, (this.groupType.hashCode() + (this.groupID.hashCode() * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final void setGroupAvatarURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupAvatarURL = str;
    }

    public final void setGroupID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupID = str;
    }

    public final void setGroupName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupName = str;
    }

    public final void setGroupType(@NotNull GroupType groupType) {
        Intrinsics.checkNotNullParameter(groupType, "<set-?>");
        this.groupType = groupType;
    }

    public final void setIntroduction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.introduction = str;
    }

    public final void setInviteToGroupApprovalType(@NotNull GroupJoinOption groupJoinOption) {
        Intrinsics.checkNotNullParameter(groupJoinOption, "<set-?>");
        this.inviteToGroupApprovalType = groupJoinOption;
    }

    public final void setJoinGroupApprovalType(@NotNull GroupJoinOption groupJoinOption) {
        Intrinsics.checkNotNullParameter(groupJoinOption, "<set-?>");
        this.joinGroupApprovalType = groupJoinOption;
    }

    public final void setMemberCount(int i11) {
        this.memberCount = i11;
    }

    @NotNull
    public String toString() {
        return "GroupSearchInfo(groupID=" + this.groupID + ", groupType=" + this.groupType + ", groupName=" + this.groupName + ", memberCount=" + this.memberCount + ", groupAvatarURL=" + this.groupAvatarURL + ", introduction=" + this.introduction + ", joinGroupApprovalType=" + this.joinGroupApprovalType + ", inviteToGroupApprovalType=" + this.inviteToGroupApprovalType + ')';
    }

    public /* synthetic */ GroupSearchInfo(String str, GroupType groupType, String str2, int i11, String str3, String str4, GroupJoinOption groupJoinOption, GroupJoinOption groupJoinOption2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? GroupType.WORK : groupType, str2, (i12 & 8) != 0 ? 0 : i11, str3, str4, (i12 & 64) != 0 ? GroupJoinOption.FORBID : groupJoinOption, (i12 & 128) != 0 ? GroupJoinOption.FORBID : groupJoinOption2);
    }
}
