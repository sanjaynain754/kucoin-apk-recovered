package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011Jh\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0011R)\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010\u0011R#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b#\u0010\u0011¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "seatList", "Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;", "canvas", "", "", "", "speakingUsers", "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;", "avStatistics", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getSeatList", "getCanvas", "getSpeakingUsers", "getAvStatistics", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LiveSeatState {

    @NotNull
    private final InterfaceC41678w<List<AVStatistics>> avStatistics;

    @NotNull
    private final InterfaceC41678w<LiveCanvas> canvas;

    @NotNull
    private final InterfaceC41678w<List<SeatInfo>> seatList;

    @NotNull
    private final InterfaceC41678w<Map<String, Integer>> speakingUsers;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSeatState)) {
            return false;
        }
        LiveSeatState liveSeatState = (LiveSeatState) other;
        return Intrinsics.areEqual(this.seatList, liveSeatState.seatList) && Intrinsics.areEqual(this.canvas, liveSeatState.canvas) && Intrinsics.areEqual(this.speakingUsers, liveSeatState.speakingUsers) && Intrinsics.areEqual(this.avStatistics, liveSeatState.avStatistics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSeatState(@NotNull InterfaceC41678w<? extends List<SeatInfo>> seatList, @NotNull InterfaceC41678w<LiveCanvas> canvas, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakingUsers, @NotNull InterfaceC41678w<? extends List<AVStatistics>> avStatistics) {
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(speakingUsers, "speakingUsers");
        Intrinsics.checkNotNullParameter(avStatistics, "avStatistics");
        this.seatList = seatList;
        this.canvas = canvas;
        this.speakingUsers = speakingUsers;
        this.avStatistics = avStatistics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSeatState copy$default(LiveSeatState liveSeatState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = liveSeatState.seatList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = liveSeatState.canvas;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = liveSeatState.speakingUsers;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = liveSeatState.avStatistics;
        }
        return liveSeatState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4);
    }

    @NotNull
    public final InterfaceC41678w<List<SeatInfo>> component1() {
        return this.seatList;
    }

    @NotNull
    public final InterfaceC41678w<LiveCanvas> component2() {
        return this.canvas;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> component3() {
        return this.speakingUsers;
    }

    @NotNull
    public final InterfaceC41678w<List<AVStatistics>> component4() {
        return this.avStatistics;
    }

    @NotNull
    public final LiveSeatState copy(@NotNull InterfaceC41678w<? extends List<SeatInfo>> seatList, @NotNull InterfaceC41678w<LiveCanvas> canvas, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakingUsers, @NotNull InterfaceC41678w<? extends List<AVStatistics>> avStatistics) {
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(speakingUsers, "speakingUsers");
        Intrinsics.checkNotNullParameter(avStatistics, "avStatistics");
        return new LiveSeatState(seatList, canvas, speakingUsers, avStatistics);
    }

    @NotNull
    public final InterfaceC41678w<List<AVStatistics>> getAvStatistics() {
        return this.avStatistics;
    }

    @NotNull
    public final InterfaceC41678w<LiveCanvas> getCanvas() {
        return this.canvas;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatInfo>> getSeatList() {
        return this.seatList;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> getSpeakingUsers() {
        return this.speakingUsers;
    }

    public int hashCode() {
        return this.avStatistics.hashCode() + AbstractC39397b.m88226a(this.speakingUsers, AbstractC39397b.m88226a(this.canvas, this.seatList.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveSeatState(seatList=");
        sb2.append(this.seatList);
        sb2.append(", canvas=");
        sb2.append(this.canvas);
        sb2.append(", speakingUsers=");
        sb2.append(this.speakingUsers);
        sb2.append(", avStatistics=");
        return AbstractC39393c.m88222a(sb2, this.avStatistics, ')');
    }
}
