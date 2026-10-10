package io.trtc.tuikit.atomicxcore.api.message;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;", "messageList", "", "hasMoreOlderMessage", "hasMoreNewerMessage", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getMessageList", "getHasMoreOlderMessage", "getHasMoreNewerMessage", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageListState {

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreNewerMessage;

    @NotNull
    private final InterfaceC41678w<Boolean> hasMoreOlderMessage;

    @NotNull
    private final InterfaceC41678w<List<MessageInfo>> messageList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListState)) {
            return false;
        }
        MessageListState messageListState = (MessageListState) other;
        return Intrinsics.areEqual(this.messageList, messageListState.messageList) && Intrinsics.areEqual(this.hasMoreOlderMessage, messageListState.hasMoreOlderMessage) && Intrinsics.areEqual(this.hasMoreNewerMessage, messageListState.hasMoreNewerMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageListState(@NotNull InterfaceC41678w<? extends List<MessageInfo>> messageList, @NotNull InterfaceC41678w<Boolean> hasMoreOlderMessage, @NotNull InterfaceC41678w<Boolean> hasMoreNewerMessage) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        Intrinsics.checkNotNullParameter(hasMoreOlderMessage, "hasMoreOlderMessage");
        Intrinsics.checkNotNullParameter(hasMoreNewerMessage, "hasMoreNewerMessage");
        this.messageList = messageList;
        this.hasMoreOlderMessage = hasMoreOlderMessage;
        this.hasMoreNewerMessage = hasMoreNewerMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListState copy$default(MessageListState messageListState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = messageListState.messageList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = messageListState.hasMoreOlderMessage;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = messageListState.hasMoreNewerMessage;
        }
        return messageListState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3);
    }

    @NotNull
    public final InterfaceC41678w<List<MessageInfo>> component1() {
        return this.messageList;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component2() {
        return this.hasMoreOlderMessage;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component3() {
        return this.hasMoreNewerMessage;
    }

    @NotNull
    public final MessageListState copy(@NotNull InterfaceC41678w<? extends List<MessageInfo>> messageList, @NotNull InterfaceC41678w<Boolean> hasMoreOlderMessage, @NotNull InterfaceC41678w<Boolean> hasMoreNewerMessage) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        Intrinsics.checkNotNullParameter(hasMoreOlderMessage, "hasMoreOlderMessage");
        Intrinsics.checkNotNullParameter(hasMoreNewerMessage, "hasMoreNewerMessage");
        return new MessageListState(messageList, hasMoreOlderMessage, hasMoreNewerMessage);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreNewerMessage() {
        return this.hasMoreNewerMessage;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> getHasMoreOlderMessage() {
        return this.hasMoreOlderMessage;
    }

    @NotNull
    public final InterfaceC41678w<List<MessageInfo>> getMessageList() {
        return this.messageList;
    }

    public int hashCode() {
        return this.hasMoreNewerMessage.hashCode() + AbstractC39397b.m88226a(this.hasMoreOlderMessage, this.messageList.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageListState(messageList=");
        sb2.append(this.messageList);
        sb2.append(", hasMoreOlderMessage=");
        sb2.append(this.hasMoreOlderMessage);
        sb2.append(", hasMoreNewerMessage=");
        return AbstractC39393c.m88222a(sb2, this.hasMoreNewerMessage, ')');
    }
}
