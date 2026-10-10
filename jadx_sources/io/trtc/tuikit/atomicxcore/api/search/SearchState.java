package io.trtc.tuikit.atomicxcore.api.search;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00120\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ(\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00120\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u001c\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJª\u0002\u0010.\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00022 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00120\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b:\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b;\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b<\u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b=\u0010\u001fR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b>\u0010\u001fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b?\u0010\u001fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b@\u0010\u001fR/\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00120\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\bA\u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\bB\u0010\u001fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\bC\u0010\u001fR#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\bD\u0010\u001fR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\bE\u0010\u001fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\bF\u0010\u001f¨\u0006G"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/SearchState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "userList", "", "userTotalCount", "", "hasMoreUserList", "Lio/trtc/tuikit/atomicxcore/api/search/FriendSearchInfo;", "friendList", "friendTotalCount", "hasMoreFriendList", "Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;", "groupList", "groupTotalCount", "hasMoreGroupList", "", "", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;", "groupMemberList", "groupMemberTotalCount", "hasMoreGroupMemberList", "Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;", "messageResults", "messageResultTotalCount", "hasMoreMessageResults", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/search/SearchState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getUserList", "getUserTotalCount", "getHasMoreUserList", "getFriendList", "getFriendTotalCount", "getHasMoreFriendList", "getGroupList", "getGroupTotalCount", "getHasMoreGroupList", "getGroupMemberList", "getGroupMemberTotalCount", "getHasMoreGroupMemberList", "getMessageResults", "getMessageResultTotalCount", "getHasMoreMessageResults", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class SearchState {

    @NotNull
    private final InterfaceC41678w<List<FriendSearchInfo>> friendList;

    @NotNull
    private final InterfaceC41678w<Integer> friendTotalCount;

    @NotNull
    private final InterfaceC41678w<List<GroupSearchInfo>> groupList;

    @NotNull
    private final InterfaceC41678w<Map<String, List<GroupMember>>> groupMemberList;

    @NotNull
    private final InterfaceC41678w<Integer> groupMemberTotalCount;

    @NotNull
    private final InterfaceC41678w<Integer> groupTotalCount;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreFriendList;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreGroupList;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreGroupMemberList;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreMessageResults;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreUserList;

    @NotNull
    private final InterfaceC41678w<Integer> messageResultTotalCount;

    @NotNull
    private final InterfaceC41678w<List<MessageSearchResultItem>> messageResults;

    @NotNull
    private final InterfaceC41678w<List<UserProfile>> userList;

    @NotNull
    private final InterfaceC41678w<Integer> userTotalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchState(@NotNull InterfaceC41678w<? extends List<UserProfile>> userList, @NotNull InterfaceC41678w<Integer> userTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreUserList, @NotNull InterfaceC41678w<? extends List<FriendSearchInfo>> friendList, @NotNull InterfaceC41678w<Integer> friendTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreFriendList, @NotNull InterfaceC41678w<? extends List<GroupSearchInfo>> groupList, @NotNull InterfaceC41678w<Integer> groupTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreGroupList, @NotNull InterfaceC41678w<? extends Map<String, ? extends List<GroupMember>>> groupMemberList, @NotNull InterfaceC41678w<Integer> groupMemberTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreGroupMemberList, @NotNull InterfaceC41678w<? extends List<MessageSearchResultItem>> messageResults, @NotNull InterfaceC41678w<Integer> messageResultTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreMessageResults) {
        Intrinsics.checkNotNullParameter(userList, "userList");
        Intrinsics.checkNotNullParameter(userTotalCount, "userTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreUserList, "hasMoreUserList");
        Intrinsics.checkNotNullParameter(friendList, "friendList");
        Intrinsics.checkNotNullParameter(friendTotalCount, "friendTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreFriendList, "hasMoreFriendList");
        Intrinsics.checkNotNullParameter(groupList, "groupList");
        Intrinsics.checkNotNullParameter(groupTotalCount, "groupTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreGroupList, "hasMoreGroupList");
        Intrinsics.checkNotNullParameter(groupMemberList, "groupMemberList");
        Intrinsics.checkNotNullParameter(groupMemberTotalCount, "groupMemberTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreGroupMemberList, "hasMoreGroupMemberList");
        Intrinsics.checkNotNullParameter(messageResults, "messageResults");
        Intrinsics.checkNotNullParameter(messageResultTotalCount, "messageResultTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreMessageResults, "hasMoreMessageResults");
        this.userList = userList;
        this.userTotalCount = userTotalCount;
        this.hasMoreUserList = hasMoreUserList;
        this.friendList = friendList;
        this.friendTotalCount = friendTotalCount;
        this.hasMoreFriendList = hasMoreFriendList;
        this.groupList = groupList;
        this.groupTotalCount = groupTotalCount;
        this.hasMoreGroupList = hasMoreGroupList;
        this.groupMemberList = groupMemberList;
        this.groupMemberTotalCount = groupMemberTotalCount;
        this.hasMoreGroupMemberList = hasMoreGroupMemberList;
        this.messageResults = messageResults;
        this.messageResultTotalCount = messageResultTotalCount;
        this.hasMoreMessageResults = hasMoreMessageResults;
    }

    @NotNull
    public final SearchState copy(@NotNull InterfaceC41678w<? extends List<UserProfile>> userList, @NotNull InterfaceC41678w<Integer> userTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreUserList, @NotNull InterfaceC41678w<? extends List<FriendSearchInfo>> friendList, @NotNull InterfaceC41678w<Integer> friendTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreFriendList, @NotNull InterfaceC41678w<? extends List<GroupSearchInfo>> groupList, @NotNull InterfaceC41678w<Integer> groupTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreGroupList, @NotNull InterfaceC41678w<? extends Map<String, ? extends List<GroupMember>>> groupMemberList, @NotNull InterfaceC41678w<Integer> groupMemberTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreGroupMemberList, @NotNull InterfaceC41678w<? extends List<MessageSearchResultItem>> messageResults, @NotNull InterfaceC41678w<Integer> messageResultTotalCount, @NotNull InterfaceC41678w<Boolean> hasMoreMessageResults) {
        Intrinsics.checkNotNullParameter(userList, "userList");
        Intrinsics.checkNotNullParameter(userTotalCount, "userTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreUserList, "hasMoreUserList");
        Intrinsics.checkNotNullParameter(friendList, "friendList");
        Intrinsics.checkNotNullParameter(friendTotalCount, "friendTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreFriendList, "hasMoreFriendList");
        Intrinsics.checkNotNullParameter(groupList, "groupList");
        Intrinsics.checkNotNullParameter(groupTotalCount, "groupTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreGroupList, "hasMoreGroupList");
        Intrinsics.checkNotNullParameter(groupMemberList, "groupMemberList");
        Intrinsics.checkNotNullParameter(groupMemberTotalCount, "groupMemberTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreGroupMemberList, "hasMoreGroupMemberList");
        Intrinsics.checkNotNullParameter(messageResults, "messageResults");
        Intrinsics.checkNotNullParameter(messageResultTotalCount, "messageResultTotalCount");
        Intrinsics.checkNotNullParameter(hasMoreMessageResults, "hasMoreMessageResults");
        return new SearchState(userList, userTotalCount, hasMoreUserList, friendList, friendTotalCount, hasMoreFriendList, groupList, groupTotalCount, hasMoreGroupList, groupMemberList, groupMemberTotalCount, hasMoreGroupMemberList, messageResults, messageResultTotalCount, hasMoreMessageResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) other;
        return Intrinsics.areEqual(this.userList, searchState.userList) && Intrinsics.areEqual(this.userTotalCount, searchState.userTotalCount) && Intrinsics.areEqual(this.hasMoreUserList, searchState.hasMoreUserList) && Intrinsics.areEqual(this.friendList, searchState.friendList) && Intrinsics.areEqual(this.friendTotalCount, searchState.friendTotalCount) && Intrinsics.areEqual(this.hasMoreFriendList, searchState.hasMoreFriendList) && Intrinsics.areEqual(this.groupList, searchState.groupList) && Intrinsics.areEqual(this.groupTotalCount, searchState.groupTotalCount) && Intrinsics.areEqual(this.hasMoreGroupList, searchState.hasMoreGroupList) && Intrinsics.areEqual(this.groupMemberList, searchState.groupMemberList) && Intrinsics.areEqual(this.groupMemberTotalCount, searchState.groupMemberTotalCount) && Intrinsics.areEqual(this.hasMoreGroupMemberList, searchState.hasMoreGroupMemberList) && Intrinsics.areEqual(this.messageResults, searchState.messageResults) && Intrinsics.areEqual(this.messageResultTotalCount, searchState.messageResultTotalCount) && Intrinsics.areEqual(this.hasMoreMessageResults, searchState.hasMoreMessageResults);
    }

    @NotNull
    public final InterfaceC41678w<List<UserProfile>> component1() {
        return this.userList;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, List<GroupMember>>> component10() {
        return this.groupMemberList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component11() {
        return this.groupMemberTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component12() {
        return this.hasMoreGroupMemberList;
    }

    @NotNull
    public final InterfaceC41678w<List<MessageSearchResultItem>> component13() {
        return this.messageResults;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component14() {
        return this.messageResultTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component15() {
        return this.hasMoreMessageResults;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component2() {
        return this.userTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component3() {
        return this.hasMoreUserList;
    }

    @NotNull
    public final InterfaceC41678w<List<FriendSearchInfo>> component4() {
        return this.friendList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component5() {
        return this.friendTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component6() {
        return this.hasMoreFriendList;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupSearchInfo>> component7() {
        return this.groupList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component8() {
        return this.groupTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component9() {
        return this.hasMoreGroupList;
    }

    @NotNull
    public final InterfaceC41678w<List<FriendSearchInfo>> getFriendList() {
        return this.friendList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getFriendTotalCount() {
        return this.friendTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupSearchInfo>> getGroupList() {
        return this.groupList;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, List<GroupMember>>> getGroupMemberList() {
        return this.groupMemberList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getGroupMemberTotalCount() {
        return this.groupMemberTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getGroupTotalCount() {
        return this.groupTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreFriendList() {
        return this.hasMoreFriendList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreGroupList() {
        return this.hasMoreGroupList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreGroupMemberList() {
        return this.hasMoreGroupMemberList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreMessageResults() {
        return this.hasMoreMessageResults;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreUserList() {
        return this.hasMoreUserList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getMessageResultTotalCount() {
        return this.messageResultTotalCount;
    }

    @NotNull
    public final InterfaceC41678w<List<MessageSearchResultItem>> getMessageResults() {
        return this.messageResults;
    }

    @NotNull
    public final InterfaceC41678w<List<UserProfile>> getUserList() {
        return this.userList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getUserTotalCount() {
        return this.userTotalCount;
    }

    public int hashCode() {
        return this.hasMoreMessageResults.hashCode() + AbstractC39397b.m88226a(this.messageResultTotalCount, AbstractC39397b.m88226a(this.messageResults, AbstractC39397b.m88226a(this.hasMoreGroupMemberList, AbstractC39397b.m88226a(this.groupMemberTotalCount, AbstractC39397b.m88226a(this.groupMemberList, AbstractC39397b.m88226a(this.hasMoreGroupList, AbstractC39397b.m88226a(this.groupTotalCount, AbstractC39397b.m88226a(this.groupList, AbstractC39397b.m88226a(this.hasMoreFriendList, AbstractC39397b.m88226a(this.friendTotalCount, AbstractC39397b.m88226a(this.friendList, AbstractC39397b.m88226a(this.hasMoreUserList, AbstractC39397b.m88226a(this.userTotalCount, this.userList.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "SearchState(userList=" + this.userList + ", userTotalCount=" + this.userTotalCount + ", hasMoreUserList=" + this.hasMoreUserList + ", friendList=" + this.friendList + ", friendTotalCount=" + this.friendTotalCount + ", hasMoreFriendList=" + this.hasMoreFriendList + ", groupList=" + this.groupList + ", groupTotalCount=" + this.groupTotalCount + ", hasMoreGroupList=" + this.hasMoreGroupList + ", groupMemberList=" + this.groupMemberList + ", groupMemberTotalCount=" + this.groupMemberTotalCount + ", hasMoreGroupMemberList=" + this.hasMoreGroupMemberList + ", messageResults=" + this.messageResults + ", messageResultTotalCount=" + this.messageResultTotalCount + ", hasMoreMessageResults=" + this.hasMoreMessageResults + ')';
    }
}
