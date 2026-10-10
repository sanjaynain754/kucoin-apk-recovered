package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJh\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\rR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\rR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b!\u0010\r¨\u0006\""}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "connected", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "invitees", "applicants", "candidates", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getConnected", "getInvitees", "getApplicants", "getCandidates", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CoGuestState {

    @NotNull
    private final InterfaceC41678w<List<LiveUserInfo>> applicants;

    @NotNull
    private final InterfaceC41678w<List<LiveUserInfo>> candidates;

    @NotNull
    private final InterfaceC41678w<List<SeatUserInfo>> connected;

    @NotNull
    private final InterfaceC41678w<List<LiveUserInfo>> invitees;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoGuestState)) {
            return false;
        }
        CoGuestState coGuestState = (CoGuestState) other;
        return Intrinsics.areEqual(this.connected, coGuestState.connected) && Intrinsics.areEqual(this.invitees, coGuestState.invitees) && Intrinsics.areEqual(this.applicants, coGuestState.applicants) && Intrinsics.areEqual(this.candidates, coGuestState.candidates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoGuestState(@NotNull InterfaceC41678w<? extends List<SeatUserInfo>> connected, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> invitees, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> applicants, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> candidates) {
        Intrinsics.checkNotNullParameter(connected, "connected");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        Intrinsics.checkNotNullParameter(applicants, "applicants");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        this.connected = connected;
        this.invitees = invitees;
        this.applicants = applicants;
        this.candidates = candidates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoGuestState copy$default(CoGuestState coGuestState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = coGuestState.connected;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = coGuestState.invitees;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = coGuestState.applicants;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = coGuestState.candidates;
        }
        return coGuestState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4);
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> component1() {
        return this.connected;
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> component2() {
        return this.invitees;
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> component3() {
        return this.applicants;
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> component4() {
        return this.candidates;
    }

    @NotNull
    public final CoGuestState copy(@NotNull InterfaceC41678w<? extends List<SeatUserInfo>> connected, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> invitees, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> applicants, @NotNull InterfaceC41678w<? extends List<LiveUserInfo>> candidates) {
        Intrinsics.checkNotNullParameter(connected, "connected");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        Intrinsics.checkNotNullParameter(applicants, "applicants");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        return new CoGuestState(connected, invitees, applicants, candidates);
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> getApplicants() {
        return this.applicants;
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> getCandidates() {
        return this.candidates;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> getConnected() {
        return this.connected;
    }

    @NotNull
    public final InterfaceC41678w<List<LiveUserInfo>> getInvitees() {
        return this.invitees;
    }

    public int hashCode() {
        return this.candidates.hashCode() + AbstractC39397b.m88226a(this.applicants, AbstractC39397b.m88226a(this.invitees, this.connected.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoGuestState(connected=");
        sb2.append(this.connected);
        sb2.append(", invitees=");
        sb2.append(this.invitees);
        sb2.append(", applicants=");
        sb2.append(this.applicants);
        sb2.append(", candidates=");
        return AbstractC39393c.m88222a(sb2, this.candidates, ')');
    }
}
