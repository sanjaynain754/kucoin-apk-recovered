package io.trtc.tuikit.atomicxcore.api.contact;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014JÂ\u0001\u0010\u001d\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0014R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0014R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0014R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b-\u0010\u0014R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b.\u0010\u0014R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b/\u0010\u0014R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b0\u0010\u0014R\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b1\u0010\u0014R.\u00103\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010!\"\u0004\b6\u00107¨\u00068"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;", "blackList", "friendList", "groupList", "Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;", "friendApplicationList", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;", "groupApplicationList", "", "friendApplicationUnreadCount", "groupApplicationUnreadCount", "addFriendInfo", "joinGroupInfo", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getBlackList", "getFriendList", "getGroupList", "getFriendApplicationList", "getGroupApplicationList", "getFriendApplicationUnreadCount", "getGroupApplicationUnreadCount", "getAddFriendInfo", "getJoinGroupInfo", "<set-?>", "createdGroupID", "Ljava/lang/String;", "getCreatedGroupID", "setCreatedGroupID$atomicxcore_release", "(Ljava/lang/String;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ContactListState {

    @NotNull
    private final InterfaceC41678w<ContactInfo> addFriendInfo;

    @NotNull
    private final InterfaceC41678w<List<ContactInfo>> blackList;

    @Nullable
    private String createdGroupID;

    @NotNull
    private final InterfaceC41678w<List<FriendApplicationInfo>> friendApplicationList;

    @NotNull
    private final InterfaceC41678w<Integer> friendApplicationUnreadCount;

    @NotNull
    private final InterfaceC41678w<List<ContactInfo>> friendList;

    @NotNull
    private final InterfaceC41678w<List<GroupApplicationInfo>> groupApplicationList;

    @NotNull
    private final InterfaceC41678w<Integer> groupApplicationUnreadCount;

    @NotNull
    private final InterfaceC41678w<List<ContactInfo>> groupList;

    @NotNull
    private final InterfaceC41678w<ContactInfo> joinGroupInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactListState)) {
            return false;
        }
        ContactListState contactListState = (ContactListState) other;
        return Intrinsics.areEqual(this.blackList, contactListState.blackList) && Intrinsics.areEqual(this.friendList, contactListState.friendList) && Intrinsics.areEqual(this.groupList, contactListState.groupList) && Intrinsics.areEqual(this.friendApplicationList, contactListState.friendApplicationList) && Intrinsics.areEqual(this.groupApplicationList, contactListState.groupApplicationList) && Intrinsics.areEqual(this.friendApplicationUnreadCount, contactListState.friendApplicationUnreadCount) && Intrinsics.areEqual(this.groupApplicationUnreadCount, contactListState.groupApplicationUnreadCount) && Intrinsics.areEqual(this.addFriendInfo, contactListState.addFriendInfo) && Intrinsics.areEqual(this.joinGroupInfo, contactListState.joinGroupInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactListState(@NotNull InterfaceC41678w<? extends List<ContactInfo>> blackList, @NotNull InterfaceC41678w<? extends List<ContactInfo>> friendList, @NotNull InterfaceC41678w<? extends List<ContactInfo>> groupList, @NotNull InterfaceC41678w<? extends List<FriendApplicationInfo>> friendApplicationList, @NotNull InterfaceC41678w<? extends List<GroupApplicationInfo>> groupApplicationList, @NotNull InterfaceC41678w<Integer> friendApplicationUnreadCount, @NotNull InterfaceC41678w<Integer> groupApplicationUnreadCount, @NotNull InterfaceC41678w<ContactInfo> addFriendInfo, @NotNull InterfaceC41678w<ContactInfo> joinGroupInfo) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(friendList, "friendList");
        Intrinsics.checkNotNullParameter(groupList, "groupList");
        Intrinsics.checkNotNullParameter(friendApplicationList, "friendApplicationList");
        Intrinsics.checkNotNullParameter(groupApplicationList, "groupApplicationList");
        Intrinsics.checkNotNullParameter(friendApplicationUnreadCount, "friendApplicationUnreadCount");
        Intrinsics.checkNotNullParameter(groupApplicationUnreadCount, "groupApplicationUnreadCount");
        Intrinsics.checkNotNullParameter(addFriendInfo, "addFriendInfo");
        Intrinsics.checkNotNullParameter(joinGroupInfo, "joinGroupInfo");
        this.blackList = blackList;
        this.friendList = friendList;
        this.groupList = groupList;
        this.friendApplicationList = friendApplicationList;
        this.groupApplicationList = groupApplicationList;
        this.friendApplicationUnreadCount = friendApplicationUnreadCount;
        this.groupApplicationUnreadCount = groupApplicationUnreadCount;
        this.addFriendInfo = addFriendInfo;
        this.joinGroupInfo = joinGroupInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactListState copy$default(ContactListState contactListState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, InterfaceC41678w interfaceC41678w8, InterfaceC41678w interfaceC41678w9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = contactListState.blackList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = contactListState.friendList;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = contactListState.groupList;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = contactListState.friendApplicationList;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = contactListState.groupApplicationList;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = contactListState.friendApplicationUnreadCount;
        }
        if ((i11 & 64) != 0) {
            interfaceC41678w7 = contactListState.groupApplicationUnreadCount;
        }
        if ((i11 & 128) != 0) {
            interfaceC41678w8 = contactListState.addFriendInfo;
        }
        if ((i11 & 256) != 0) {
            interfaceC41678w9 = contactListState.joinGroupInfo;
        }
        InterfaceC41678w interfaceC41678w10 = interfaceC41678w8;
        InterfaceC41678w interfaceC41678w11 = interfaceC41678w9;
        InterfaceC41678w interfaceC41678w12 = interfaceC41678w6;
        InterfaceC41678w interfaceC41678w13 = interfaceC41678w7;
        InterfaceC41678w interfaceC41678w14 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w15 = interfaceC41678w3;
        return contactListState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w15, interfaceC41678w4, interfaceC41678w14, interfaceC41678w12, interfaceC41678w13, interfaceC41678w10, interfaceC41678w11);
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> component1() {
        return this.blackList;
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> component2() {
        return this.friendList;
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> component3() {
        return this.groupList;
    }

    @NotNull
    public final InterfaceC41678w<List<FriendApplicationInfo>> component4() {
        return this.friendApplicationList;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupApplicationInfo>> component5() {
        return this.groupApplicationList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component6() {
        return this.friendApplicationUnreadCount;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component7() {
        return this.groupApplicationUnreadCount;
    }

    @NotNull
    public final InterfaceC41678w<ContactInfo> component8() {
        return this.addFriendInfo;
    }

    @NotNull
    public final InterfaceC41678w<ContactInfo> component9() {
        return this.joinGroupInfo;
    }

    @NotNull
    public final ContactListState copy(@NotNull InterfaceC41678w<? extends List<ContactInfo>> blackList, @NotNull InterfaceC41678w<? extends List<ContactInfo>> friendList, @NotNull InterfaceC41678w<? extends List<ContactInfo>> groupList, @NotNull InterfaceC41678w<? extends List<FriendApplicationInfo>> friendApplicationList, @NotNull InterfaceC41678w<? extends List<GroupApplicationInfo>> groupApplicationList, @NotNull InterfaceC41678w<Integer> friendApplicationUnreadCount, @NotNull InterfaceC41678w<Integer> groupApplicationUnreadCount, @NotNull InterfaceC41678w<ContactInfo> addFriendInfo, @NotNull InterfaceC41678w<ContactInfo> joinGroupInfo) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(friendList, "friendList");
        Intrinsics.checkNotNullParameter(groupList, "groupList");
        Intrinsics.checkNotNullParameter(friendApplicationList, "friendApplicationList");
        Intrinsics.checkNotNullParameter(groupApplicationList, "groupApplicationList");
        Intrinsics.checkNotNullParameter(friendApplicationUnreadCount, "friendApplicationUnreadCount");
        Intrinsics.checkNotNullParameter(groupApplicationUnreadCount, "groupApplicationUnreadCount");
        Intrinsics.checkNotNullParameter(addFriendInfo, "addFriendInfo");
        Intrinsics.checkNotNullParameter(joinGroupInfo, "joinGroupInfo");
        return new ContactListState(blackList, friendList, groupList, friendApplicationList, groupApplicationList, friendApplicationUnreadCount, groupApplicationUnreadCount, addFriendInfo, joinGroupInfo);
    }

    @NotNull
    public final InterfaceC41678w<ContactInfo> getAddFriendInfo() {
        return this.addFriendInfo;
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> getBlackList() {
        return this.blackList;
    }

    @Nullable
    public final String getCreatedGroupID() {
        return this.createdGroupID;
    }

    @NotNull
    public final InterfaceC41678w<List<FriendApplicationInfo>> getFriendApplicationList() {
        return this.friendApplicationList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getFriendApplicationUnreadCount() {
        return this.friendApplicationUnreadCount;
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> getFriendList() {
        return this.friendList;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupApplicationInfo>> getGroupApplicationList() {
        return this.groupApplicationList;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getGroupApplicationUnreadCount() {
        return this.groupApplicationUnreadCount;
    }

    @NotNull
    public final InterfaceC41678w<List<ContactInfo>> getGroupList() {
        return this.groupList;
    }

    @NotNull
    public final InterfaceC41678w<ContactInfo> getJoinGroupInfo() {
        return this.joinGroupInfo;
    }

    public int hashCode() {
        return this.joinGroupInfo.hashCode() + AbstractC39397b.m88226a(this.addFriendInfo, AbstractC39397b.m88226a(this.groupApplicationUnreadCount, AbstractC39397b.m88226a(this.friendApplicationUnreadCount, AbstractC39397b.m88226a(this.groupApplicationList, AbstractC39397b.m88226a(this.friendApplicationList, AbstractC39397b.m88226a(this.groupList, AbstractC39397b.m88226a(this.friendList, this.blackList.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setCreatedGroupID$atomicxcore_release(@Nullable String str) {
        this.createdGroupID = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContactListState(blackList=");
        sb2.append(this.blackList);
        sb2.append(", friendList=");
        sb2.append(this.friendList);
        sb2.append(", groupList=");
        sb2.append(this.groupList);
        sb2.append(", friendApplicationList=");
        sb2.append(this.friendApplicationList);
        sb2.append(", groupApplicationList=");
        sb2.append(this.groupApplicationList);
        sb2.append(", friendApplicationUnreadCount=");
        sb2.append(this.friendApplicationUnreadCount);
        sb2.append(", groupApplicationUnreadCount=");
        sb2.append(this.groupApplicationUnreadCount);
        sb2.append(", addFriendInfo=");
        sb2.append(this.addFriendInfo);
        sb2.append(", joinGroupInfo=");
        return AbstractC39393c.m88222a(sb2, this.joinGroupInfo, ')');
    }
}
