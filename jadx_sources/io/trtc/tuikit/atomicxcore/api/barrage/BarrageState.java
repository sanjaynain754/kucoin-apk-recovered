package io.trtc.tuikit.atomicxcore.api.barrage;

import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ6\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "messageList", "", "allowSendMessage", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component2", "()Lkotlinx/coroutines/flow/w;", "component1", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getMessageList", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class BarrageState {

    @NotNull
    private final InterfaceC41678w<Boolean> allowSendMessage;

    @NotNull
    private final InterfaceC41678w<List<Barrage>> messageList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarrageState)) {
            return false;
        }
        BarrageState barrageState = (BarrageState) other;
        return Intrinsics.areEqual(this.messageList, barrageState.messageList) && Intrinsics.areEqual(this.allowSendMessage, barrageState.allowSendMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarrageState(@NotNull InterfaceC41678w<? extends List<Barrage>> messageList, @NotNull InterfaceC41678w<Boolean> allowSendMessage) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        Intrinsics.checkNotNullParameter(allowSendMessage, "allowSendMessage");
        this.messageList = messageList;
        this.allowSendMessage = allowSendMessage;
    }

    private final InterfaceC41678w<Boolean> component2() {
        return this.allowSendMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarrageState copy$default(BarrageState barrageState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = barrageState.messageList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = barrageState.allowSendMessage;
        }
        return barrageState.copy(interfaceC41678w, interfaceC41678w2);
    }

    @NotNull
    public final InterfaceC41678w<List<Barrage>> component1() {
        return this.messageList;
    }

    @NotNull
    public final BarrageState copy(@NotNull InterfaceC41678w<? extends List<Barrage>> messageList, @NotNull InterfaceC41678w<Boolean> allowSendMessage) {
        Intrinsics.checkNotNullParameter(messageList, "messageList");
        Intrinsics.checkNotNullParameter(allowSendMessage, "allowSendMessage");
        return new BarrageState(messageList, allowSendMessage);
    }

    @NotNull
    public final InterfaceC41678w<List<Barrage>> getMessageList() {
        return this.messageList;
    }

    public int hashCode() {
        return this.allowSendMessage.hashCode() + (this.messageList.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BarrageState(messageList=");
        sb2.append(this.messageList);
        sb2.append(", allowSendMessage=");
        return AbstractC39393c.m88222a(sb2, this.allowSendMessage, ')');
    }
}
