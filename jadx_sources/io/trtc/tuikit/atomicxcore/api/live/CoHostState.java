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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u0010R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010\u0010R#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010\u0010¨\u0006("}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostStatus;", "coHostStatus", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "connected", "invitees", "applicant", "", "candidatesCursor", "candidates", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getCoHostStatus", "getConnected", "getInvitees", "getApplicant", "getCandidatesCursor", "getCandidates", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CoHostState {

    @NotNull
    private final InterfaceC41678w<SeatUserInfo> applicant;

    @NotNull
    private final InterfaceC41678w<List<SeatUserInfo>> candidates;

    @NotNull
    private final InterfaceC41678w<String> candidatesCursor;

    @NotNull
    private final InterfaceC41678w<CoHostStatus> coHostStatus;

    @NotNull
    private final InterfaceC41678w<List<SeatUserInfo>> connected;

    @NotNull
    private final InterfaceC41678w<List<SeatUserInfo>> invitees;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoHostState)) {
            return false;
        }
        CoHostState coHostState = (CoHostState) other;
        return Intrinsics.areEqual(this.coHostStatus, coHostState.coHostStatus) && Intrinsics.areEqual(this.connected, coHostState.connected) && Intrinsics.areEqual(this.invitees, coHostState.invitees) && Intrinsics.areEqual(this.applicant, coHostState.applicant) && Intrinsics.areEqual(this.candidatesCursor, coHostState.candidatesCursor) && Intrinsics.areEqual(this.candidates, coHostState.candidates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoHostState(@NotNull InterfaceC41678w<? extends CoHostStatus> coHostStatus, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> connected, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> invitees, @NotNull InterfaceC41678w<SeatUserInfo> applicant, @NotNull InterfaceC41678w<String> candidatesCursor, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> candidates) {
        Intrinsics.checkNotNullParameter(coHostStatus, "coHostStatus");
        Intrinsics.checkNotNullParameter(connected, "connected");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        Intrinsics.checkNotNullParameter(applicant, "applicant");
        Intrinsics.checkNotNullParameter(candidatesCursor, "candidatesCursor");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        this.coHostStatus = coHostStatus;
        this.connected = connected;
        this.invitees = invitees;
        this.applicant = applicant;
        this.candidatesCursor = candidatesCursor;
        this.candidates = candidates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoHostState copy$default(CoHostState coHostState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = coHostState.coHostStatus;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = coHostState.connected;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = coHostState.invitees;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = coHostState.applicant;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = coHostState.candidatesCursor;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = coHostState.candidates;
        }
        InterfaceC41678w interfaceC41678w7 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w8 = interfaceC41678w6;
        return coHostState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4, interfaceC41678w7, interfaceC41678w8);
    }

    @NotNull
    public final InterfaceC41678w<CoHostStatus> component1() {
        return this.coHostStatus;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> component2() {
        return this.connected;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> component3() {
        return this.invitees;
    }

    @NotNull
    public final InterfaceC41678w<SeatUserInfo> component4() {
        return this.applicant;
    }

    @NotNull
    public final InterfaceC41678w<String> component5() {
        return this.candidatesCursor;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> component6() {
        return this.candidates;
    }

    @NotNull
    public final CoHostState copy(@NotNull InterfaceC41678w<? extends CoHostStatus> coHostStatus, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> connected, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> invitees, @NotNull InterfaceC41678w<SeatUserInfo> applicant, @NotNull InterfaceC41678w<String> candidatesCursor, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> candidates) {
        Intrinsics.checkNotNullParameter(coHostStatus, "coHostStatus");
        Intrinsics.checkNotNullParameter(connected, "connected");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        Intrinsics.checkNotNullParameter(applicant, "applicant");
        Intrinsics.checkNotNullParameter(candidatesCursor, "candidatesCursor");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        return new CoHostState(coHostStatus, connected, invitees, applicant, candidatesCursor, candidates);
    }

    @NotNull
    public final InterfaceC41678w<SeatUserInfo> getApplicant() {
        return this.applicant;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> getCandidates() {
        return this.candidates;
    }

    @NotNull
    public final InterfaceC41678w<String> getCandidatesCursor() {
        return this.candidatesCursor;
    }

    @NotNull
    public final InterfaceC41678w<CoHostStatus> getCoHostStatus() {
        return this.coHostStatus;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> getConnected() {
        return this.connected;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> getInvitees() {
        return this.invitees;
    }

    public int hashCode() {
        return this.candidates.hashCode() + AbstractC39397b.m88226a(this.candidatesCursor, AbstractC39397b.m88226a(this.applicant, AbstractC39397b.m88226a(this.invitees, AbstractC39397b.m88226a(this.connected, this.coHostStatus.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoHostState(coHostStatus=");
        sb2.append(this.coHostStatus);
        sb2.append(", connected=");
        sb2.append(this.connected);
        sb2.append(", invitees=");
        sb2.append(this.invitees);
        sb2.append(", applicant=");
        sb2.append(this.applicant);
        sb2.append(", candidatesCursor=");
        sb2.append(this.candidatesCursor);
        sb2.append(", candidates=");
        return AbstractC39393c.m88222a(sb2, this.candidates, ')');
    }
}
