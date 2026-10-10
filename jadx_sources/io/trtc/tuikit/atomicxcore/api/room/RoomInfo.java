package io.trtc.tuikit.atomicxcore.api.room;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0014HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J§\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014HÆ\u0001J\u0013\u0010=\u001a\u00020\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\bHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001d¨\u0006A"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;", "", "roomID", "", "roomName", "roomOwner", "Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "participantCount", "", TUIConstantDefine.CREATE_TIME, "", TUIConstants.TUILive.ROOM_STATUS, "Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;", "scheduledStartTime", "scheduledEndTime", "startReminderInSeconds", TUIConstantDefine.SCHEDULE_ATTENDEES, "", "password", "isAllMicrophoneDisabled", "", "isAllCameraDisabled", "isAllMessageDisabled", "isAllScreenShareDisabled", "(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZ)V", "getCreateTime", "()J", "()Z", "getParticipantCount", "()I", "getPassword", "()Ljava/lang/String;", "getRoomID", "getRoomName", "getRoomOwner", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;", "getRoomStatus", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;", "setRoomStatus", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;)V", "getScheduleAttendees", "()Ljava/util/List;", "getScheduledEndTime", "getScheduledStartTime", "getStartReminderInSeconds", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RoomInfo {
    private final long createTime;
    private final boolean isAllCameraDisabled;
    private final boolean isAllMessageDisabled;
    private final boolean isAllMicrophoneDisabled;
    private final boolean isAllScreenShareDisabled;
    private final int participantCount;

    @Nullable
    private final String password;

    @NotNull
    private final String roomID;

    @NotNull
    private final String roomName;

    @NotNull
    private final RoomUser roomOwner;

    @NotNull
    private RoomStatus roomStatus;

    @NotNull
    private final List<RoomUser> scheduleAttendees;
    private final long scheduledEndTime;
    private final long scheduledStartTime;
    private final int startReminderInSeconds;

    public RoomInfo() {
        this(null, null, null, 0, 0L, null, 0L, 0L, 0, null, null, false, false, false, false, 32767, null);
    }

    @NotNull
    public final RoomInfo copy(@NotNull String roomID, @NotNull String roomName, @NotNull RoomUser roomOwner, int participantCount, long createTime, @NotNull RoomStatus roomStatus, long scheduledStartTime, long scheduledEndTime, int startReminderInSeconds, @NotNull List<RoomUser> scheduleAttendees, @Nullable String password, boolean isAllMicrophoneDisabled, boolean isAllCameraDisabled, boolean isAllMessageDisabled, boolean isAllScreenShareDisabled) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomOwner, "roomOwner");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        Intrinsics.checkNotNullParameter(scheduleAttendees, "scheduleAttendees");
        return new RoomInfo(roomID, roomName, roomOwner, participantCount, createTime, roomStatus, scheduledStartTime, scheduledEndTime, startReminderInSeconds, scheduleAttendees, password, isAllMicrophoneDisabled, isAllCameraDisabled, isAllMessageDisabled, isAllScreenShareDisabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) other;
        return Intrinsics.areEqual(this.roomID, roomInfo.roomID) && Intrinsics.areEqual(this.roomName, roomInfo.roomName) && Intrinsics.areEqual(this.roomOwner, roomInfo.roomOwner) && this.participantCount == roomInfo.participantCount && this.createTime == roomInfo.createTime && this.roomStatus == roomInfo.roomStatus && this.scheduledStartTime == roomInfo.scheduledStartTime && this.scheduledEndTime == roomInfo.scheduledEndTime && this.startReminderInSeconds == roomInfo.startReminderInSeconds && Intrinsics.areEqual(this.scheduleAttendees, roomInfo.scheduleAttendees) && Intrinsics.areEqual(this.password, roomInfo.password) && this.isAllMicrophoneDisabled == roomInfo.isAllMicrophoneDisabled && this.isAllCameraDisabled == roomInfo.isAllCameraDisabled && this.isAllMessageDisabled == roomInfo.isAllMessageDisabled && this.isAllScreenShareDisabled == roomInfo.isAllScreenShareDisabled;
    }

    public RoomInfo(@NotNull String roomID, @NotNull String roomName, @NotNull RoomUser roomOwner, int i11, long j11, @NotNull RoomStatus roomStatus, long j12, long j13, int i12, @NotNull List<RoomUser> scheduleAttendees, @Nullable String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomOwner, "roomOwner");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        Intrinsics.checkNotNullParameter(scheduleAttendees, "scheduleAttendees");
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomOwner = roomOwner;
        this.participantCount = i11;
        this.createTime = j11;
        this.roomStatus = roomStatus;
        this.scheduledStartTime = j12;
        this.scheduledEndTime = j13;
        this.startReminderInSeconds = i12;
        this.scheduleAttendees = scheduleAttendees;
        this.password = str;
        this.isAllMicrophoneDisabled = z11;
        this.isAllCameraDisabled = z12;
        this.isAllMessageDisabled = z13;
        this.isAllScreenShareDisabled = z14;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomID() {
        return this.roomID;
    }

    @NotNull
    public final List<RoomUser> component10() {
        return this.scheduleAttendees;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsAllMicrophoneDisabled() {
        return this.isAllMicrophoneDisabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsAllCameraDisabled() {
        return this.isAllCameraDisabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsAllMessageDisabled() {
        return this.isAllMessageDisabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsAllScreenShareDisabled() {
        return this.isAllScreenShareDisabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RoomUser getRoomOwner() {
        return this.roomOwner;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RoomStatus getRoomStatus() {
        return this.roomStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getScheduledEndTime() {
        return this.scheduledEndTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStartReminderInSeconds() {
        return this.startReminderInSeconds;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getRoomID() {
        return this.roomID;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    public final RoomUser getRoomOwner() {
        return this.roomOwner;
    }

    @NotNull
    public final RoomStatus getRoomStatus() {
        return this.roomStatus;
    }

    @NotNull
    public final List<RoomUser> getScheduleAttendees() {
        return this.scheduleAttendees;
    }

    public final long getScheduledEndTime() {
        return this.scheduledEndTime;
    }

    public final long getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public final int getStartReminderInSeconds() {
        return this.startReminderInSeconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = (this.scheduleAttendees.hashCode() + AbstractC39396a.m88225a(this.startReminderInSeconds, (Long.hashCode(this.scheduledEndTime) + ((Long.hashCode(this.scheduledStartTime) + ((this.roomStatus.hashCode() + ((Long.hashCode(this.createTime) + AbstractC39396a.m88225a(this.participantCount, (this.roomOwner.hashCode() + AbstractC39391a.m88220a(this.roomName, this.roomID.hashCode() * 31, 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        String str = this.password;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.isAllMicrophoneDisabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode2 + r11) * 31;
        boolean z12 = this.isAllCameraDisabled;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isAllMessageDisabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isAllScreenShareDisabled;
        return i13 + (z14 ? 1 : z14);
    }

    public final boolean isAllCameraDisabled() {
        return this.isAllCameraDisabled;
    }

    public final boolean isAllMessageDisabled() {
        return this.isAllMessageDisabled;
    }

    public final boolean isAllMicrophoneDisabled() {
        return this.isAllMicrophoneDisabled;
    }

    public final boolean isAllScreenShareDisabled() {
        return this.isAllScreenShareDisabled;
    }

    public final void setRoomStatus(@NotNull RoomStatus roomStatus) {
        Intrinsics.checkNotNullParameter(roomStatus, "<set-?>");
        this.roomStatus = roomStatus;
    }

    @NotNull
    public String toString() {
        return "RoomInfo(roomID=" + this.roomID + ", roomName=" + this.roomName + ", roomOwner=" + this.roomOwner + ", participantCount=" + this.participantCount + ", createTime=" + this.createTime + ", roomStatus=" + this.roomStatus + ", scheduledStartTime=" + this.scheduledStartTime + ", scheduledEndTime=" + this.scheduledEndTime + ", startReminderInSeconds=" + this.startReminderInSeconds + ", scheduleAttendees=" + this.scheduleAttendees + ", password=" + this.password + ", isAllMicrophoneDisabled=" + this.isAllMicrophoneDisabled + ", isAllCameraDisabled=" + this.isAllCameraDisabled + ", isAllMessageDisabled=" + this.isAllMessageDisabled + ", isAllScreenShareDisabled=" + this.isAllScreenShareDisabled + ')';
    }

    public /* synthetic */ RoomInfo(String str, String str2, RoomUser roomUser, int i11, long j11, RoomStatus roomStatus, long j12, long j13, int i12, List list, String str3, boolean z11, boolean z12, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) == 0 ? str2 : "", (i13 & 4) != 0 ? new RoomUser(null, null, null, 7, null) : roomUser, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0L : j11, (i13 & 32) != 0 ? RoomStatus.SCHEDULED : roomStatus, (i13 & 64) != 0 ? 0L : j12, (i13 & 128) == 0 ? j13 : 0L, (i13 & 256) != 0 ? 0 : i12, (i13 & 512) != 0 ? CollectionsKt.emptyList() : list, (i13 & 1024) != 0 ? null : str3, (i13 & 2048) != 0 ? false : z11, (i13 & 4096) != 0 ? false : z12, (i13 & 8192) != 0 ? false : z13, (i13 & 16384) != 0 ? false : z14);
    }
}
