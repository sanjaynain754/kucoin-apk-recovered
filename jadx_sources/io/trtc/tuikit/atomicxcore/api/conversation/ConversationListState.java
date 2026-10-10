package io.trtc.tuikit.atomicxcore.api.conversation;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJF\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;", "conversationList", "", "hasMoreConversation", "", TUIConstants.TUIConversation.TOTAL_UNREAD_COUNT, "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getConversationList", "getHasMoreConversation", TUIConstants.TUIConversation.METHOD_GET_TOTAL_UNREAD_COUNT, "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ConversationListState {

    @NotNull
    private final InterfaceC41678w<List<ConversationInfo>> conversationList;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreConversation;

    @NotNull
    private final InterfaceC41678w<Long> totalUnreadCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationListState)) {
            return false;
        }
        ConversationListState conversationListState = (ConversationListState) other;
        return Intrinsics.areEqual(this.conversationList, conversationListState.conversationList) && Intrinsics.areEqual(this.hasMoreConversation, conversationListState.hasMoreConversation) && Intrinsics.areEqual(this.totalUnreadCount, conversationListState.totalUnreadCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationListState(@NotNull InterfaceC41678w<? extends List<ConversationInfo>> conversationList, @NotNull InterfaceC41678w<Boolean> hasMoreConversation, @NotNull InterfaceC41678w<Long> totalUnreadCount) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        Intrinsics.checkNotNullParameter(hasMoreConversation, "hasMoreConversation");
        Intrinsics.checkNotNullParameter(totalUnreadCount, "totalUnreadCount");
        this.conversationList = conversationList;
        this.hasMoreConversation = hasMoreConversation;
        this.totalUnreadCount = totalUnreadCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationListState copy$default(ConversationListState conversationListState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = conversationListState.conversationList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = conversationListState.hasMoreConversation;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = conversationListState.totalUnreadCount;
        }
        return conversationListState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3);
    }

    @NotNull
    public final InterfaceC41678w<List<ConversationInfo>> component1() {
        return this.conversationList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component2() {
        return this.hasMoreConversation;
    }

    @NotNull
    public final InterfaceC41678w<Long> component3() {
        return this.totalUnreadCount;
    }

    @NotNull
    public final ConversationListState copy(@NotNull InterfaceC41678w<? extends List<ConversationInfo>> conversationList, @NotNull InterfaceC41678w<Boolean> hasMoreConversation, @NotNull InterfaceC41678w<Long> totalUnreadCount) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        Intrinsics.checkNotNullParameter(hasMoreConversation, "hasMoreConversation");
        Intrinsics.checkNotNullParameter(totalUnreadCount, "totalUnreadCount");
        return new ConversationListState(conversationList, hasMoreConversation, totalUnreadCount);
    }

    @NotNull
    public final InterfaceC41678w<List<ConversationInfo>> getConversationList() {
        return this.conversationList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreConversation() {
        return this.hasMoreConversation;
    }

    @NotNull
    public final InterfaceC41678w<Long> getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    public int hashCode() {
        return this.totalUnreadCount.hashCode() + AbstractC39397b.m88226a(this.hasMoreConversation, this.conversationList.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationListState(conversationList=");
        sb2.append(this.conversationList);
        sb2.append(", hasMoreConversation=");
        sb2.append(this.hasMoreConversation);
        sb2.append(", totalUnreadCount=");
        return AbstractC39393c.m88222a(sb2, this.totalUnreadCount, ')');
    }
}
