package io.trtc.tuikit.atomicxcore.api.room;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;", "", "caller", "Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "callee", "status", "Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;)V", "getCallee", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "setCallee", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;)V", "getCaller", "setCaller", "getStatus", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;", "setStatus", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomCallStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RoomCall {

    @NotNull
    private RoomUser callee;

    @NotNull
    private RoomUser caller;

    @NotNull
    private RoomCallStatus status;

    public RoomCall() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomCall)) {
            return false;
        }
        RoomCall roomCall = (RoomCall) other;
        return Intrinsics.areEqual(this.caller, roomCall.caller) && Intrinsics.areEqual(this.callee, roomCall.callee) && this.status == roomCall.status;
    }

    public RoomCall(@NotNull RoomUser caller, @NotNull RoomUser callee, @NotNull RoomCallStatus status) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(callee, "callee");
        Intrinsics.checkNotNullParameter(status, "status");
        this.caller = caller;
        this.callee = callee;
        this.status = status;
    }

    public static /* synthetic */ RoomCall copy$default(RoomCall roomCall, RoomUser roomUser, RoomUser roomUser2, RoomCallStatus roomCallStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            roomUser = roomCall.caller;
        }
        if ((i11 & 2) != 0) {
            roomUser2 = roomCall.callee;
        }
        if ((i11 & 4) != 0) {
            roomCallStatus = roomCall.status;
        }
        return roomCall.copy(roomUser, roomUser2, roomCallStatus);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RoomUser getCaller() {
        return this.caller;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RoomUser getCallee() {
        return this.callee;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RoomCallStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final RoomCall copy(@NotNull RoomUser caller, @NotNull RoomUser callee, @NotNull RoomCallStatus status) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(callee, "callee");
        Intrinsics.checkNotNullParameter(status, "status");
        return new RoomCall(caller, callee, status);
    }

    @NotNull
    public final RoomUser getCallee() {
        return this.callee;
    }

    @NotNull
    public final RoomUser getCaller() {
        return this.caller;
    }

    @NotNull
    public final RoomCallStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + ((this.callee.hashCode() + (this.caller.hashCode() * 31)) * 31);
    }

    public final void setCallee(@NotNull RoomUser roomUser) {
        Intrinsics.checkNotNullParameter(roomUser, "<set-?>");
        this.callee = roomUser;
    }

    public final void setCaller(@NotNull RoomUser roomUser) {
        Intrinsics.checkNotNullParameter(roomUser, "<set-?>");
        this.caller = roomUser;
    }

    public final void setStatus(@NotNull RoomCallStatus roomCallStatus) {
        Intrinsics.checkNotNullParameter(roomCallStatus, "<set-?>");
        this.status = roomCallStatus;
    }

    @NotNull
    public String toString() {
        return "RoomCall(caller=" + this.caller + ", callee=" + this.callee + ", status=" + this.status + ')';
    }

    public /* synthetic */ RoomCall(RoomUser roomUser, RoomUser roomUser2, RoomCallStatus roomCallStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new RoomUser(null, null, null, 7, null) : roomUser, (i11 & 2) != 0 ? new RoomUser(null, null, null, 7, null) : roomUser2, (i11 & 4) != 0 ? RoomCallStatus.NONE : roomCallStatus);
    }
}
