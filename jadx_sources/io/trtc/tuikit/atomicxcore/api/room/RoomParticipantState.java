package io.trtc.tuikit.atomicxcore.api.room;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\u0002\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\r0\u0002\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\"\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017Jê\u0001\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\u00022\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\r0\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0017R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010\u0017R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b0\u0010\u0017R#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b1\u0010\u0017R)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b2\u0010\u0017R)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\r0\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b3\u0010\u0017R#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b4\u0010\u0017R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b5\u0010\u0017¨\u00066"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "participantList", "", "participantListCursor", "participantListWithVideo", "participantWithScreen", "Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;", "pendingDeviceApplications", "pendingDeviceInvitations", "", "", "speakingUsers", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;", "networkQualities", "pendingParticipantList", "localParticipant", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getParticipantList", "getParticipantListCursor", "getParticipantListWithVideo", "getParticipantWithScreen", "getPendingDeviceApplications", "getPendingDeviceInvitations", "getSpeakingUsers", "getNetworkQualities", "getPendingParticipantList", "getLocalParticipant", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RoomParticipantState {

    @NotNull
    private final InterfaceC41678w<RoomParticipant> localParticipant;

    @NotNull
    private final InterfaceC41678w<Map<String, NetworkInfo>> networkQualities;

    @NotNull
    private final InterfaceC41678w<List<RoomParticipant>> participantList;

    @NotNull
    private final InterfaceC41678w<String> participantListCursor;

    @NotNull
    private final InterfaceC41678w<List<RoomParticipant>> participantListWithVideo;

    @NotNull
    private final InterfaceC41678w<RoomParticipant> participantWithScreen;

    @NotNull
    private final InterfaceC41678w<List<DeviceRequestInfo>> pendingDeviceApplications;

    @NotNull
    private final InterfaceC41678w<List<DeviceRequestInfo>> pendingDeviceInvitations;

    @NotNull
    private final InterfaceC41678w<List<RoomParticipant>> pendingParticipantList;

    @NotNull
    private final InterfaceC41678w<Map<String, Integer>> speakingUsers;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomParticipantState)) {
            return false;
        }
        RoomParticipantState roomParticipantState = (RoomParticipantState) other;
        return Intrinsics.areEqual(this.participantList, roomParticipantState.participantList) && Intrinsics.areEqual(this.participantListCursor, roomParticipantState.participantListCursor) && Intrinsics.areEqual(this.participantListWithVideo, roomParticipantState.participantListWithVideo) && Intrinsics.areEqual(this.participantWithScreen, roomParticipantState.participantWithScreen) && Intrinsics.areEqual(this.pendingDeviceApplications, roomParticipantState.pendingDeviceApplications) && Intrinsics.areEqual(this.pendingDeviceInvitations, roomParticipantState.pendingDeviceInvitations) && Intrinsics.areEqual(this.speakingUsers, roomParticipantState.speakingUsers) && Intrinsics.areEqual(this.networkQualities, roomParticipantState.networkQualities) && Intrinsics.areEqual(this.pendingParticipantList, roomParticipantState.pendingParticipantList) && Intrinsics.areEqual(this.localParticipant, roomParticipantState.localParticipant);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoomParticipantState(@NotNull InterfaceC41678w<? extends List<RoomParticipant>> participantList, @NotNull InterfaceC41678w<String> participantListCursor, @NotNull InterfaceC41678w<? extends List<RoomParticipant>> participantListWithVideo, @NotNull InterfaceC41678w<RoomParticipant> participantWithScreen, @NotNull InterfaceC41678w<? extends List<DeviceRequestInfo>> pendingDeviceApplications, @NotNull InterfaceC41678w<? extends List<DeviceRequestInfo>> pendingDeviceInvitations, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakingUsers, @NotNull InterfaceC41678w<? extends Map<String, NetworkInfo>> networkQualities, @NotNull InterfaceC41678w<? extends List<RoomParticipant>> pendingParticipantList, @NotNull InterfaceC41678w<RoomParticipant> localParticipant) {
        Intrinsics.checkNotNullParameter(participantList, "participantList");
        Intrinsics.checkNotNullParameter(participantListCursor, "participantListCursor");
        Intrinsics.checkNotNullParameter(participantListWithVideo, "participantListWithVideo");
        Intrinsics.checkNotNullParameter(participantWithScreen, "participantWithScreen");
        Intrinsics.checkNotNullParameter(pendingDeviceApplications, "pendingDeviceApplications");
        Intrinsics.checkNotNullParameter(pendingDeviceInvitations, "pendingDeviceInvitations");
        Intrinsics.checkNotNullParameter(speakingUsers, "speakingUsers");
        Intrinsics.checkNotNullParameter(networkQualities, "networkQualities");
        Intrinsics.checkNotNullParameter(pendingParticipantList, "pendingParticipantList");
        Intrinsics.checkNotNullParameter(localParticipant, "localParticipant");
        this.participantList = participantList;
        this.participantListCursor = participantListCursor;
        this.participantListWithVideo = participantListWithVideo;
        this.participantWithScreen = participantWithScreen;
        this.pendingDeviceApplications = pendingDeviceApplications;
        this.pendingDeviceInvitations = pendingDeviceInvitations;
        this.speakingUsers = speakingUsers;
        this.networkQualities = networkQualities;
        this.pendingParticipantList = pendingParticipantList;
        this.localParticipant = localParticipant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomParticipantState copy$default(RoomParticipantState roomParticipantState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, InterfaceC41678w interfaceC41678w8, InterfaceC41678w interfaceC41678w9, InterfaceC41678w interfaceC41678w10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = roomParticipantState.participantList;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = roomParticipantState.participantListCursor;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = roomParticipantState.participantListWithVideo;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = roomParticipantState.participantWithScreen;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = roomParticipantState.pendingDeviceApplications;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = roomParticipantState.pendingDeviceInvitations;
        }
        if ((i11 & 64) != 0) {
            interfaceC41678w7 = roomParticipantState.speakingUsers;
        }
        if ((i11 & 128) != 0) {
            interfaceC41678w8 = roomParticipantState.networkQualities;
        }
        if ((i11 & 256) != 0) {
            interfaceC41678w9 = roomParticipantState.pendingParticipantList;
        }
        if ((i11 & 512) != 0) {
            interfaceC41678w10 = roomParticipantState.localParticipant;
        }
        InterfaceC41678w interfaceC41678w11 = interfaceC41678w9;
        InterfaceC41678w interfaceC41678w12 = interfaceC41678w10;
        InterfaceC41678w interfaceC41678w13 = interfaceC41678w7;
        InterfaceC41678w interfaceC41678w14 = interfaceC41678w8;
        InterfaceC41678w interfaceC41678w15 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w16 = interfaceC41678w6;
        return roomParticipantState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4, interfaceC41678w15, interfaceC41678w16, interfaceC41678w13, interfaceC41678w14, interfaceC41678w11, interfaceC41678w12);
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> component1() {
        return this.participantList;
    }

    @NotNull
    public final InterfaceC41678w<RoomParticipant> component10() {
        return this.localParticipant;
    }

    @NotNull
    public final InterfaceC41678w<String> component2() {
        return this.participantListCursor;
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> component3() {
        return this.participantListWithVideo;
    }

    @NotNull
    public final InterfaceC41678w<RoomParticipant> component4() {
        return this.participantWithScreen;
    }

    @NotNull
    public final InterfaceC41678w<List<DeviceRequestInfo>> component5() {
        return this.pendingDeviceApplications;
    }

    @NotNull
    public final InterfaceC41678w<List<DeviceRequestInfo>> component6() {
        return this.pendingDeviceInvitations;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> component7() {
        return this.speakingUsers;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, NetworkInfo>> component8() {
        return this.networkQualities;
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> component9() {
        return this.pendingParticipantList;
    }

    @NotNull
    public final RoomParticipantState copy(@NotNull InterfaceC41678w<? extends List<RoomParticipant>> participantList, @NotNull InterfaceC41678w<String> participantListCursor, @NotNull InterfaceC41678w<? extends List<RoomParticipant>> participantListWithVideo, @NotNull InterfaceC41678w<RoomParticipant> participantWithScreen, @NotNull InterfaceC41678w<? extends List<DeviceRequestInfo>> pendingDeviceApplications, @NotNull InterfaceC41678w<? extends List<DeviceRequestInfo>> pendingDeviceInvitations, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakingUsers, @NotNull InterfaceC41678w<? extends Map<String, NetworkInfo>> networkQualities, @NotNull InterfaceC41678w<? extends List<RoomParticipant>> pendingParticipantList, @NotNull InterfaceC41678w<RoomParticipant> localParticipant) {
        Intrinsics.checkNotNullParameter(participantList, "participantList");
        Intrinsics.checkNotNullParameter(participantListCursor, "participantListCursor");
        Intrinsics.checkNotNullParameter(participantListWithVideo, "participantListWithVideo");
        Intrinsics.checkNotNullParameter(participantWithScreen, "participantWithScreen");
        Intrinsics.checkNotNullParameter(pendingDeviceApplications, "pendingDeviceApplications");
        Intrinsics.checkNotNullParameter(pendingDeviceInvitations, "pendingDeviceInvitations");
        Intrinsics.checkNotNullParameter(speakingUsers, "speakingUsers");
        Intrinsics.checkNotNullParameter(networkQualities, "networkQualities");
        Intrinsics.checkNotNullParameter(pendingParticipantList, "pendingParticipantList");
        Intrinsics.checkNotNullParameter(localParticipant, "localParticipant");
        return new RoomParticipantState(participantList, participantListCursor, participantListWithVideo, participantWithScreen, pendingDeviceApplications, pendingDeviceInvitations, speakingUsers, networkQualities, pendingParticipantList, localParticipant);
    }

    @NotNull
    public final InterfaceC41678w<RoomParticipant> getLocalParticipant() {
        return this.localParticipant;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, NetworkInfo>> getNetworkQualities() {
        return this.networkQualities;
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> getParticipantList() {
        return this.participantList;
    }

    @NotNull
    public final InterfaceC41678w<String> getParticipantListCursor() {
        return this.participantListCursor;
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> getParticipantListWithVideo() {
        return this.participantListWithVideo;
    }

    @NotNull
    public final InterfaceC41678w<RoomParticipant> getParticipantWithScreen() {
        return this.participantWithScreen;
    }

    @NotNull
    public final InterfaceC41678w<List<DeviceRequestInfo>> getPendingDeviceApplications() {
        return this.pendingDeviceApplications;
    }

    @NotNull
    public final InterfaceC41678w<List<DeviceRequestInfo>> getPendingDeviceInvitations() {
        return this.pendingDeviceInvitations;
    }

    @NotNull
    public final InterfaceC41678w<List<RoomParticipant>> getPendingParticipantList() {
        return this.pendingParticipantList;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> getSpeakingUsers() {
        return this.speakingUsers;
    }

    public int hashCode() {
        return this.localParticipant.hashCode() + AbstractC39397b.m88226a(this.pendingParticipantList, AbstractC39397b.m88226a(this.networkQualities, AbstractC39397b.m88226a(this.speakingUsers, AbstractC39397b.m88226a(this.pendingDeviceInvitations, AbstractC39397b.m88226a(this.pendingDeviceApplications, AbstractC39397b.m88226a(this.participantWithScreen, AbstractC39397b.m88226a(this.participantListWithVideo, AbstractC39397b.m88226a(this.participantListCursor, this.participantList.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoomParticipantState(participantList=");
        sb2.append(this.participantList);
        sb2.append(", participantListCursor=");
        sb2.append(this.participantListCursor);
        sb2.append(", participantListWithVideo=");
        sb2.append(this.participantListWithVideo);
        sb2.append(", participantWithScreen=");
        sb2.append(this.participantWithScreen);
        sb2.append(", pendingDeviceApplications=");
        sb2.append(this.pendingDeviceApplications);
        sb2.append(", pendingDeviceInvitations=");
        sb2.append(this.pendingDeviceInvitations);
        sb2.append(", speakingUsers=");
        sb2.append(this.speakingUsers);
        sb2.append(", networkQualities=");
        sb2.append(this.networkQualities);
        sb2.append(", pendingParticipantList=");
        sb2.append(this.pendingParticipantList);
        sb2.append(", localParticipant=");
        return AbstractC39393c.m88222a(sb2, this.localParticipant, ')');
    }
}
