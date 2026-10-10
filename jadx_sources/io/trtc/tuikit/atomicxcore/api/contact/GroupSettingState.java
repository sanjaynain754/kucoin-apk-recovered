package io.trtc.tuikit.atomicxcore.api.contact;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u0002\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001b0\u0002\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0018\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u001c\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\"\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001b0\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"JÌ\u0002\u00104\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00022\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00022\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001b0\u00022\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bA\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b\n\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b\u000b\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b\f\u0010\"R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bB\u0010\"R#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bC\u0010\"R#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bD\u0010\"R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\bE\u0010\"R\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\bF\u0010\"R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\bG\u0010\"R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\bH\u0010\"R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\bI\u0010\"R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\bJ\u0010\"R)\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001b0\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\bK\u0010\"R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010=\u001a\u0004\bL\u0010\"¨\u0006M"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;", TUIConstants.TUIChat.GROUP_TYPE, "", "groupName", "avatarURL", TUIConstants.TUIChat.NOTICE, "", "isNotDisturb", "isAllMuted", "isPinned", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;", TUIConstants.TUIContact.GROUP_OWNER, "", "allMembers", "membersInfo", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;", "currentUserRole", "selfNameCard", "", TUIConstants.TUIChat.MEMBER_COUNT, "Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;", "joinGroupApprovalType", "inviteToGroupApprovalType", "hasMoreGroupMembers", "", "groupAttributes", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "receiveMessageOpt", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getGroupType", "getGroupName", "getAvatarURL", "getNotice", "getGroupOwner", "getAllMembers", "getMembersInfo", "getCurrentUserRole", "getSelfNameCard", "getMemberCount", "getJoinGroupApprovalType", "getInviteToGroupApprovalType", "getHasMoreGroupMembers", "getGroupAttributes", "getReceiveMessageOpt", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GroupSettingState {

    @NotNull
    private final InterfaceC41678w<List<GroupMember>> allMembers;

    @NotNull
    private final InterfaceC41678w<String> avatarURL;

    @NotNull
    private final InterfaceC41678w<GroupMemberRole> currentUserRole;

    @NotNull
    private final InterfaceC41678w<Map<String, String>> groupAttributes;

    @NotNull
    private final InterfaceC41678w<String> groupName;

    @NotNull
    private final InterfaceC41678w<GroupMember> groupOwner;

    @NotNull
    private final InterfaceC41678w<GroupType> groupType;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreGroupMembers;

    @NotNull
    private final InterfaceC41678w<GroupJoinOption> inviteToGroupApprovalType;

    @NotNull
    private final InterfaceC41678w<Boolean> isAllMuted;

    @NotNull
    private final InterfaceC41678w<Boolean> isNotDisturb;

    @NotNull
    private final InterfaceC41678w<Boolean> isPinned;

    @NotNull
    private final InterfaceC41678w<GroupJoinOption> joinGroupApprovalType;

    @NotNull
    private final InterfaceC41678w<Integer> memberCount;

    @NotNull
    private final InterfaceC41678w<List<GroupMember>> membersInfo;

    @NotNull
    private final InterfaceC41678w<String> notice;

    @NotNull
    private final InterfaceC41678w<ReceiveMessageOpt> receiveMessageOpt;

    @NotNull
    private final InterfaceC41678w<String> selfNameCard;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupSettingState(@NotNull InterfaceC41678w<? extends GroupType> groupType, @NotNull InterfaceC41678w<String> groupName, @NotNull InterfaceC41678w<String> avatarURL, @NotNull InterfaceC41678w<String> notice, @NotNull InterfaceC41678w<Boolean> isNotDisturb, @NotNull InterfaceC41678w<Boolean> isAllMuted, @NotNull InterfaceC41678w<Boolean> isPinned, @NotNull InterfaceC41678w<GroupMember> groupOwner, @NotNull InterfaceC41678w<? extends List<GroupMember>> allMembers, @NotNull InterfaceC41678w<? extends List<GroupMember>> membersInfo, @NotNull InterfaceC41678w<? extends GroupMemberRole> currentUserRole, @NotNull InterfaceC41678w<String> selfNameCard, @NotNull InterfaceC41678w<Integer> memberCount, @NotNull InterfaceC41678w<? extends GroupJoinOption> joinGroupApprovalType, @NotNull InterfaceC41678w<? extends GroupJoinOption> inviteToGroupApprovalType, @NotNull InterfaceC41678w<Boolean> hasMoreGroupMembers, @NotNull InterfaceC41678w<? extends Map<String, String>> groupAttributes, @NotNull InterfaceC41678w<? extends ReceiveMessageOpt> receiveMessageOpt) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(isNotDisturb, "isNotDisturb");
        Intrinsics.checkNotNullParameter(isAllMuted, "isAllMuted");
        Intrinsics.checkNotNullParameter(isPinned, "isPinned");
        Intrinsics.checkNotNullParameter(groupOwner, "groupOwner");
        Intrinsics.checkNotNullParameter(allMembers, "allMembers");
        Intrinsics.checkNotNullParameter(membersInfo, "membersInfo");
        Intrinsics.checkNotNullParameter(currentUserRole, "currentUserRole");
        Intrinsics.checkNotNullParameter(selfNameCard, "selfNameCard");
        Intrinsics.checkNotNullParameter(memberCount, "memberCount");
        Intrinsics.checkNotNullParameter(joinGroupApprovalType, "joinGroupApprovalType");
        Intrinsics.checkNotNullParameter(inviteToGroupApprovalType, "inviteToGroupApprovalType");
        Intrinsics.checkNotNullParameter(hasMoreGroupMembers, "hasMoreGroupMembers");
        Intrinsics.checkNotNullParameter(groupAttributes, "groupAttributes");
        Intrinsics.checkNotNullParameter(receiveMessageOpt, "receiveMessageOpt");
        this.groupType = groupType;
        this.groupName = groupName;
        this.avatarURL = avatarURL;
        this.notice = notice;
        this.isNotDisturb = isNotDisturb;
        this.isAllMuted = isAllMuted;
        this.isPinned = isPinned;
        this.groupOwner = groupOwner;
        this.allMembers = allMembers;
        this.membersInfo = membersInfo;
        this.currentUserRole = currentUserRole;
        this.selfNameCard = selfNameCard;
        this.memberCount = memberCount;
        this.joinGroupApprovalType = joinGroupApprovalType;
        this.inviteToGroupApprovalType = inviteToGroupApprovalType;
        this.hasMoreGroupMembers = hasMoreGroupMembers;
        this.groupAttributes = groupAttributes;
        this.receiveMessageOpt = receiveMessageOpt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupSettingState copy$default(GroupSettingState groupSettingState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, InterfaceC41678w interfaceC41678w8, InterfaceC41678w interfaceC41678w9, InterfaceC41678w interfaceC41678w10, InterfaceC41678w interfaceC41678w11, InterfaceC41678w interfaceC41678w12, InterfaceC41678w interfaceC41678w13, InterfaceC41678w interfaceC41678w14, InterfaceC41678w interfaceC41678w15, InterfaceC41678w interfaceC41678w16, InterfaceC41678w interfaceC41678w17, InterfaceC41678w interfaceC41678w18, int i11, Object obj) {
        InterfaceC41678w interfaceC41678w19;
        InterfaceC41678w interfaceC41678w20;
        InterfaceC41678w interfaceC41678w21 = (i11 & 1) != 0 ? groupSettingState.groupType : interfaceC41678w;
        InterfaceC41678w interfaceC41678w22 = (i11 & 2) != 0 ? groupSettingState.groupName : interfaceC41678w2;
        InterfaceC41678w interfaceC41678w23 = (i11 & 4) != 0 ? groupSettingState.avatarURL : interfaceC41678w3;
        InterfaceC41678w interfaceC41678w24 = (i11 & 8) != 0 ? groupSettingState.notice : interfaceC41678w4;
        InterfaceC41678w interfaceC41678w25 = (i11 & 16) != 0 ? groupSettingState.isNotDisturb : interfaceC41678w5;
        InterfaceC41678w interfaceC41678w26 = (i11 & 32) != 0 ? groupSettingState.isAllMuted : interfaceC41678w6;
        InterfaceC41678w interfaceC41678w27 = (i11 & 64) != 0 ? groupSettingState.isPinned : interfaceC41678w7;
        InterfaceC41678w interfaceC41678w28 = (i11 & 128) != 0 ? groupSettingState.groupOwner : interfaceC41678w8;
        InterfaceC41678w interfaceC41678w29 = (i11 & 256) != 0 ? groupSettingState.allMembers : interfaceC41678w9;
        InterfaceC41678w interfaceC41678w30 = (i11 & 512) != 0 ? groupSettingState.membersInfo : interfaceC41678w10;
        InterfaceC41678w interfaceC41678w31 = (i11 & 1024) != 0 ? groupSettingState.currentUserRole : interfaceC41678w11;
        InterfaceC41678w interfaceC41678w32 = (i11 & 2048) != 0 ? groupSettingState.selfNameCard : interfaceC41678w12;
        InterfaceC41678w interfaceC41678w33 = (i11 & 4096) != 0 ? groupSettingState.memberCount : interfaceC41678w13;
        InterfaceC41678w interfaceC41678w34 = (i11 & 8192) != 0 ? groupSettingState.joinGroupApprovalType : interfaceC41678w14;
        InterfaceC41678w interfaceC41678w35 = interfaceC41678w21;
        InterfaceC41678w interfaceC41678w36 = (i11 & 16384) != 0 ? groupSettingState.inviteToGroupApprovalType : interfaceC41678w15;
        InterfaceC41678w interfaceC41678w37 = (i11 & 32768) != 0 ? groupSettingState.hasMoreGroupMembers : interfaceC41678w16;
        InterfaceC41678w interfaceC41678w38 = (i11 & 65536) != 0 ? groupSettingState.groupAttributes : interfaceC41678w17;
        if ((i11 & 131072) != 0) {
            interfaceC41678w20 = interfaceC41678w38;
            interfaceC41678w19 = groupSettingState.receiveMessageOpt;
        } else {
            interfaceC41678w19 = interfaceC41678w18;
            interfaceC41678w20 = interfaceC41678w38;
        }
        return groupSettingState.copy(interfaceC41678w35, interfaceC41678w22, interfaceC41678w23, interfaceC41678w24, interfaceC41678w25, interfaceC41678w26, interfaceC41678w27, interfaceC41678w28, interfaceC41678w29, interfaceC41678w30, interfaceC41678w31, interfaceC41678w32, interfaceC41678w33, interfaceC41678w34, interfaceC41678w36, interfaceC41678w37, interfaceC41678w20, interfaceC41678w19);
    }

    @NotNull
    public final GroupSettingState copy(@NotNull InterfaceC41678w<? extends GroupType> groupType, @NotNull InterfaceC41678w<String> groupName, @NotNull InterfaceC41678w<String> avatarURL, @NotNull InterfaceC41678w<String> notice, @NotNull InterfaceC41678w<Boolean> isNotDisturb, @NotNull InterfaceC41678w<Boolean> isAllMuted, @NotNull InterfaceC41678w<Boolean> isPinned, @NotNull InterfaceC41678w<GroupMember> groupOwner, @NotNull InterfaceC41678w<? extends List<GroupMember>> allMembers, @NotNull InterfaceC41678w<? extends List<GroupMember>> membersInfo, @NotNull InterfaceC41678w<? extends GroupMemberRole> currentUserRole, @NotNull InterfaceC41678w<String> selfNameCard, @NotNull InterfaceC41678w<Integer> memberCount, @NotNull InterfaceC41678w<? extends GroupJoinOption> joinGroupApprovalType, @NotNull InterfaceC41678w<? extends GroupJoinOption> inviteToGroupApprovalType, @NotNull InterfaceC41678w<Boolean> hasMoreGroupMembers, @NotNull InterfaceC41678w<? extends Map<String, String>> groupAttributes, @NotNull InterfaceC41678w<? extends ReceiveMessageOpt> receiveMessageOpt) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(isNotDisturb, "isNotDisturb");
        Intrinsics.checkNotNullParameter(isAllMuted, "isAllMuted");
        Intrinsics.checkNotNullParameter(isPinned, "isPinned");
        Intrinsics.checkNotNullParameter(groupOwner, "groupOwner");
        Intrinsics.checkNotNullParameter(allMembers, "allMembers");
        Intrinsics.checkNotNullParameter(membersInfo, "membersInfo");
        Intrinsics.checkNotNullParameter(currentUserRole, "currentUserRole");
        Intrinsics.checkNotNullParameter(selfNameCard, "selfNameCard");
        Intrinsics.checkNotNullParameter(memberCount, "memberCount");
        Intrinsics.checkNotNullParameter(joinGroupApprovalType, "joinGroupApprovalType");
        Intrinsics.checkNotNullParameter(inviteToGroupApprovalType, "inviteToGroupApprovalType");
        Intrinsics.checkNotNullParameter(hasMoreGroupMembers, "hasMoreGroupMembers");
        Intrinsics.checkNotNullParameter(groupAttributes, "groupAttributes");
        Intrinsics.checkNotNullParameter(receiveMessageOpt, "receiveMessageOpt");
        return new GroupSettingState(groupType, groupName, avatarURL, notice, isNotDisturb, isAllMuted, isPinned, groupOwner, allMembers, membersInfo, currentUserRole, selfNameCard, memberCount, joinGroupApprovalType, inviteToGroupApprovalType, hasMoreGroupMembers, groupAttributes, receiveMessageOpt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSettingState)) {
            return false;
        }
        GroupSettingState groupSettingState = (GroupSettingState) other;
        return Intrinsics.areEqual(this.groupType, groupSettingState.groupType) && Intrinsics.areEqual(this.groupName, groupSettingState.groupName) && Intrinsics.areEqual(this.avatarURL, groupSettingState.avatarURL) && Intrinsics.areEqual(this.notice, groupSettingState.notice) && Intrinsics.areEqual(this.isNotDisturb, groupSettingState.isNotDisturb) && Intrinsics.areEqual(this.isAllMuted, groupSettingState.isAllMuted) && Intrinsics.areEqual(this.isPinned, groupSettingState.isPinned) && Intrinsics.areEqual(this.groupOwner, groupSettingState.groupOwner) && Intrinsics.areEqual(this.allMembers, groupSettingState.allMembers) && Intrinsics.areEqual(this.membersInfo, groupSettingState.membersInfo) && Intrinsics.areEqual(this.currentUserRole, groupSettingState.currentUserRole) && Intrinsics.areEqual(this.selfNameCard, groupSettingState.selfNameCard) && Intrinsics.areEqual(this.memberCount, groupSettingState.memberCount) && Intrinsics.areEqual(this.joinGroupApprovalType, groupSettingState.joinGroupApprovalType) && Intrinsics.areEqual(this.inviteToGroupApprovalType, groupSettingState.inviteToGroupApprovalType) && Intrinsics.areEqual(this.hasMoreGroupMembers, groupSettingState.hasMoreGroupMembers) && Intrinsics.areEqual(this.groupAttributes, groupSettingState.groupAttributes) && Intrinsics.areEqual(this.receiveMessageOpt, groupSettingState.receiveMessageOpt);
    }

    @NotNull
    public final InterfaceC41678w<GroupType> component1() {
        return this.groupType;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> component10() {
        return this.membersInfo;
    }

    @NotNull
    public final InterfaceC41678w<GroupMemberRole> component11() {
        return this.currentUserRole;
    }

    @NotNull
    public final InterfaceC41678w<String> component12() {
        return this.selfNameCard;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component13() {
        return this.memberCount;
    }

    @NotNull
    public final InterfaceC41678w<GroupJoinOption> component14() {
        return this.joinGroupApprovalType;
    }

    @NotNull
    public final InterfaceC41678w<GroupJoinOption> component15() {
        return this.inviteToGroupApprovalType;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component16() {
        return this.hasMoreGroupMembers;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, String>> component17() {
        return this.groupAttributes;
    }

    @NotNull
    public final InterfaceC41678w<ReceiveMessageOpt> component18() {
        return this.receiveMessageOpt;
    }

    @NotNull
    public final InterfaceC41678w<String> component2() {
        return this.groupName;
    }

    @NotNull
    public final InterfaceC41678w<String> component3() {
        return this.avatarURL;
    }

    @NotNull
    public final InterfaceC41678w<String> component4() {
        return this.notice;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component5() {
        return this.isNotDisturb;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component6() {
        return this.isAllMuted;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component7() {
        return this.isPinned;
    }

    @NotNull
    public final InterfaceC41678w<GroupMember> component8() {
        return this.groupOwner;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> component9() {
        return this.allMembers;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> getAllMembers() {
        return this.allMembers;
    }

    @NotNull
    public final InterfaceC41678w<String> getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final InterfaceC41678w<GroupMemberRole> getCurrentUserRole() {
        return this.currentUserRole;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, String>> getGroupAttributes() {
        return this.groupAttributes;
    }

    @NotNull
    public final InterfaceC41678w<String> getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final InterfaceC41678w<GroupMember> getGroupOwner() {
        return this.groupOwner;
    }

    @NotNull
    public final InterfaceC41678w<GroupType> getGroupType() {
        return this.groupType;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreGroupMembers() {
        return this.hasMoreGroupMembers;
    }

    @NotNull
    public final InterfaceC41678w<GroupJoinOption> getInviteToGroupApprovalType() {
        return this.inviteToGroupApprovalType;
    }

    @NotNull
    public final InterfaceC41678w<GroupJoinOption> getJoinGroupApprovalType() {
        return this.joinGroupApprovalType;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getMemberCount() {
        return this.memberCount;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> getMembersInfo() {
        return this.membersInfo;
    }

    @NotNull
    public final InterfaceC41678w<String> getNotice() {
        return this.notice;
    }

    @NotNull
    public final InterfaceC41678w<ReceiveMessageOpt> getReceiveMessageOpt() {
        return this.receiveMessageOpt;
    }

    @NotNull
    public final InterfaceC41678w<String> getSelfNameCard() {
        return this.selfNameCard;
    }

    public int hashCode() {
        return this.receiveMessageOpt.hashCode() + AbstractC39397b.m88226a(this.groupAttributes, AbstractC39397b.m88226a(this.hasMoreGroupMembers, AbstractC39397b.m88226a(this.inviteToGroupApprovalType, AbstractC39397b.m88226a(this.joinGroupApprovalType, AbstractC39397b.m88226a(this.memberCount, AbstractC39397b.m88226a(this.selfNameCard, AbstractC39397b.m88226a(this.currentUserRole, AbstractC39397b.m88226a(this.membersInfo, AbstractC39397b.m88226a(this.allMembers, AbstractC39397b.m88226a(this.groupOwner, AbstractC39397b.m88226a(this.isPinned, AbstractC39397b.m88226a(this.isAllMuted, AbstractC39397b.m88226a(this.isNotDisturb, AbstractC39397b.m88226a(this.notice, AbstractC39397b.m88226a(this.avatarURL, AbstractC39397b.m88226a(this.groupName, this.groupType.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isAllMuted() {
        return this.isAllMuted;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isNotDisturb() {
        return this.isNotDisturb;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        return "GroupSettingState(groupType=" + this.groupType + ", groupName=" + this.groupName + ", avatarURL=" + this.avatarURL + ", notice=" + this.notice + ", isNotDisturb=" + this.isNotDisturb + ", isAllMuted=" + this.isAllMuted + ", isPinned=" + this.isPinned + ", groupOwner=" + this.groupOwner + ", allMembers=" + this.allMembers + ", membersInfo=" + this.membersInfo + ", currentUserRole=" + this.currentUserRole + ", selfNameCard=" + this.selfNameCard + ", memberCount=" + this.memberCount + ", joinGroupApprovalType=" + this.joinGroupApprovalType + ", inviteToGroupApprovalType=" + this.inviteToGroupApprovalType + ", hasMoreGroupMembers=" + this.hasMoreGroupMembers + ", groupAttributes=" + this.groupAttributes + ", receiveMessageOpt=" + this.receiveMessageOpt + ')';
    }
}
