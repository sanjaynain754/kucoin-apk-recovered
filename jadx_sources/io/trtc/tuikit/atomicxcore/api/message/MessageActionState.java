package io.trtc.tuikit.atomicxcore.api.message;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u0010R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010\u0010¨\u0006("}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;", "readMemberList", "", "hasMoreReadMembers", "unReadMemberList", "hasMoreUnReadMembers", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "reactionUserList", "hasMoreReactionUsers", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getReadMemberList", "getHasMoreReadMembers", "getUnReadMemberList", "getHasMoreUnReadMembers", "getReactionUserList", "getHasMoreReactionUsers", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageActionState {

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreReactionUsers;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreReadMembers;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreUnReadMembers;

    @NotNull
    private final InterfaceC41678w<List<UserProfile>> reactionUserList;

    @NotNull
    private final InterfaceC41678w<List<GroupMember>> readMemberList;

    @NotNull
    private final InterfaceC41678w<List<GroupMember>> unReadMemberList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageActionState)) {
            return false;
        }
        MessageActionState messageActionState = (MessageActionState) other;
        return Intrinsics.areEqual(this.readMemberList, messageActionState.readMemberList) && Intrinsics.areEqual(this.hasMoreReadMembers, messageActionState.hasMoreReadMembers) && Intrinsics.areEqual(this.unReadMemberList, messageActionState.unReadMemberList) && Intrinsics.areEqual(this.hasMoreUnReadMembers, messageActionState.hasMoreUnReadMembers) && Intrinsics.areEqual(this.reactionUserList, messageActionState.reactionUserList) && Intrinsics.areEqual(this.hasMoreReactionUsers, messageActionState.hasMoreReactionUsers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageActionState(@NotNull InterfaceC41678w<? extends List<GroupMember>> readMemberList, @NotNull InterfaceC41678w<Boolean> hasMoreReadMembers, @NotNull InterfaceC41678w<? extends List<GroupMember>> unReadMemberList, @NotNull InterfaceC41678w<Boolean> hasMoreUnReadMembers, @NotNull InterfaceC41678w<? extends List<UserProfile>> reactionUserList, @NotNull InterfaceC41678w<Boolean> hasMoreReactionUsers) {
        Intrinsics.checkNotNullParameter(readMemberList, "readMemberList");
        Intrinsics.checkNotNullParameter(hasMoreReadMembers, "hasMoreReadMembers");
        Intrinsics.checkNotNullParameter(unReadMemberList, "unReadMemberList");
        Intrinsics.checkNotNullParameter(hasMoreUnReadMembers, "hasMoreUnReadMembers");
        Intrinsics.checkNotNullParameter(reactionUserList, "reactionUserList");
        Intrinsics.checkNotNullParameter(hasMoreReactionUsers, "hasMoreReactionUsers");
        this.readMemberList = readMemberList;
        this.hasMoreReadMembers = hasMoreReadMembers;
        this.unReadMemberList = unReadMemberList;
        this.hasMoreUnReadMembers = hasMoreUnReadMembers;
        this.reactionUserList = reactionUserList;
        this.hasMoreReactionUsers = hasMoreReactionUsers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageActionState copy$default(MessageActionState messageActionState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = messageActionState.readMemberList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = messageActionState.hasMoreReadMembers;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = messageActionState.unReadMemberList;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = messageActionState.hasMoreUnReadMembers;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = messageActionState.reactionUserList;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = messageActionState.hasMoreReactionUsers;
        }
        InterfaceC41678w interfaceC41678w7 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w8 = interfaceC41678w6;
        return messageActionState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4, interfaceC41678w7, interfaceC41678w8);
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> component1() {
        return this.readMemberList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component2() {
        return this.hasMoreReadMembers;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> component3() {
        return this.unReadMemberList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component4() {
        return this.hasMoreUnReadMembers;
    }

    @NotNull
    public final InterfaceC41678w<List<UserProfile>> component5() {
        return this.reactionUserList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component6() {
        return this.hasMoreReactionUsers;
    }

    @NotNull
    public final MessageActionState copy(@NotNull InterfaceC41678w<? extends List<GroupMember>> readMemberList, @NotNull InterfaceC41678w<Boolean> hasMoreReadMembers, @NotNull InterfaceC41678w<? extends List<GroupMember>> unReadMemberList, @NotNull InterfaceC41678w<Boolean> hasMoreUnReadMembers, @NotNull InterfaceC41678w<? extends List<UserProfile>> reactionUserList, @NotNull InterfaceC41678w<Boolean> hasMoreReactionUsers) {
        Intrinsics.checkNotNullParameter(readMemberList, "readMemberList");
        Intrinsics.checkNotNullParameter(hasMoreReadMembers, "hasMoreReadMembers");
        Intrinsics.checkNotNullParameter(unReadMemberList, "unReadMemberList");
        Intrinsics.checkNotNullParameter(hasMoreUnReadMembers, "hasMoreUnReadMembers");
        Intrinsics.checkNotNullParameter(reactionUserList, "reactionUserList");
        Intrinsics.checkNotNullParameter(hasMoreReactionUsers, "hasMoreReactionUsers");
        return new MessageActionState(readMemberList, hasMoreReadMembers, unReadMemberList, hasMoreUnReadMembers, reactionUserList, hasMoreReactionUsers);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreReactionUsers() {
        return this.hasMoreReactionUsers;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreReadMembers() {
        return this.hasMoreReadMembers;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreUnReadMembers() {
        return this.hasMoreUnReadMembers;
    }

    @NotNull
    public final InterfaceC41678w<List<UserProfile>> getReactionUserList() {
        return this.reactionUserList;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> getReadMemberList() {
        return this.readMemberList;
    }

    @NotNull
    public final InterfaceC41678w<List<GroupMember>> getUnReadMemberList() {
        return this.unReadMemberList;
    }

    public int hashCode() {
        return this.hasMoreReactionUsers.hashCode() + AbstractC39397b.m88226a(this.reactionUserList, AbstractC39397b.m88226a(this.hasMoreUnReadMembers, AbstractC39397b.m88226a(this.unReadMemberList, AbstractC39397b.m88226a(this.hasMoreReadMembers, this.readMemberList.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageActionState(readMemberList=");
        sb2.append(this.readMemberList);
        sb2.append(", hasMoreReadMembers=");
        sb2.append(this.hasMoreReadMembers);
        sb2.append(", unReadMemberList=");
        sb2.append(this.unReadMemberList);
        sb2.append(", hasMoreUnReadMembers=");
        sb2.append(this.hasMoreUnReadMembers);
        sb2.append(", reactionUserList=");
        sb2.append(this.reactionUserList);
        sb2.append(", hasMoreReactionUsers=");
        return AbstractC39393c.m88222a(sb2, this.hasMoreReactionUsers, ')');
    }
}
