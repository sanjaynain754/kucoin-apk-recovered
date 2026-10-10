package io.trtc.tuikit.atomicxcore.api.room;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001:\u0001;Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003Js\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)¨\u0006<"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;", "", "roomName", "", "password", TUIConstantDefine.SCHEDULE_START_TIME, "", TUIConstantDefine.SCHEDULE_END_TIME, TUIConstantDefine.REMINDER_SECONDS_BEFORE_START, "", TUIConstantDefine.SCHEDULE_ATTENDEES, "", "isAllMicrophoneDisabled", "", "isAllCameraDisabled", "isAllScreenShareDisabled", "isAllMessageDisabled", "(Ljava/lang/String;Ljava/lang/String;JJILjava/util/List;ZZZZ)V", "()Z", "setAllCameraDisabled", "(Z)V", "setAllMessageDisabled", "setAllMicrophoneDisabled", "setAllScreenShareDisabled", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getReminderSecondsBeforeStart", "()I", "setReminderSecondsBeforeStart", "(I)V", "getRoomName", "setRoomName", "getScheduleAttendees", "()Ljava/util/List;", "setScheduleAttendees", "(Ljava/util/List;)V", "getScheduleEndTime", "()J", "setScheduleEndTime", "(J)V", "getScheduleStartTime", "setScheduleStartTime", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ModifyFlag", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ScheduleRoomOptions {
    private boolean isAllCameraDisabled;
    private boolean isAllMessageDisabled;
    private boolean isAllMicrophoneDisabled;
    private boolean isAllScreenShareDisabled;

    @NotNull
    private String password;
    private int reminderSecondsBeforeStart;

    @NotNull
    private String roomName;

    @NotNull
    private List<String> scheduleAttendees;
    private long scheduleEndTime;
    private long scheduleStartTime;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0012\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;", "", "value", "Lkotlin/UInt;", "(Ljava/lang/String;II)V", "getValue-pVg5ArA", "()I", "I", "ROOM_NAME", "SCHEDULE_START_TIME", "SCHEDULE_END_TIME", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public enum ModifyFlag {
        ROOM_NAME(UInt.m103939constructorimpl(1)),
        SCHEDULE_START_TIME(UInt.m103939constructorimpl(2)),
        SCHEDULE_END_TIME(UInt.m103939constructorimpl(4));

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int value;

        @NotNull
        public static EnumEntries<ModifyFlag> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name and from getter */
        public final int getValue() {
            return this.value;
        }

        ModifyFlag(int i11) {
            this.value = i11;
        }
    }

    public ScheduleRoomOptions() {
        this(null, null, 0L, 0L, 0, null, false, false, false, false, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleRoomOptions)) {
            return false;
        }
        ScheduleRoomOptions scheduleRoomOptions = (ScheduleRoomOptions) other;
        return Intrinsics.areEqual(this.roomName, scheduleRoomOptions.roomName) && Intrinsics.areEqual(this.password, scheduleRoomOptions.password) && this.scheduleStartTime == scheduleRoomOptions.scheduleStartTime && this.scheduleEndTime == scheduleRoomOptions.scheduleEndTime && this.reminderSecondsBeforeStart == scheduleRoomOptions.reminderSecondsBeforeStart && Intrinsics.areEqual(this.scheduleAttendees, scheduleRoomOptions.scheduleAttendees) && this.isAllMicrophoneDisabled == scheduleRoomOptions.isAllMicrophoneDisabled && this.isAllCameraDisabled == scheduleRoomOptions.isAllCameraDisabled && this.isAllScreenShareDisabled == scheduleRoomOptions.isAllScreenShareDisabled && this.isAllMessageDisabled == scheduleRoomOptions.isAllMessageDisabled;
    }

    public ScheduleRoomOptions(@NotNull String roomName, @NotNull String password, long j11, long j12, int i11, @NotNull List<String> scheduleAttendees, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(scheduleAttendees, "scheduleAttendees");
        this.roomName = roomName;
        this.password = password;
        this.scheduleStartTime = j11;
        this.scheduleEndTime = j12;
        this.reminderSecondsBeforeStart = i11;
        this.scheduleAttendees = scheduleAttendees;
        this.isAllMicrophoneDisabled = z11;
        this.isAllCameraDisabled = z12;
        this.isAllScreenShareDisabled = z13;
        this.isAllMessageDisabled = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScheduleRoomOptions copy$default(ScheduleRoomOptions scheduleRoomOptions, String str, String str2, long j11, long j12, int i11, List list, boolean z11, boolean z12, boolean z13, boolean z14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = scheduleRoomOptions.roomName;
        }
        if ((i12 & 2) != 0) {
            str2 = scheduleRoomOptions.password;
        }
        if ((i12 & 4) != 0) {
            j11 = scheduleRoomOptions.scheduleStartTime;
        }
        if ((i12 & 8) != 0) {
            j12 = scheduleRoomOptions.scheduleEndTime;
        }
        if ((i12 & 16) != 0) {
            i11 = scheduleRoomOptions.reminderSecondsBeforeStart;
        }
        if ((i12 & 32) != 0) {
            list = scheduleRoomOptions.scheduleAttendees;
        }
        if ((i12 & 64) != 0) {
            z11 = scheduleRoomOptions.isAllMicrophoneDisabled;
        }
        if ((i12 & 128) != 0) {
            z12 = scheduleRoomOptions.isAllCameraDisabled;
        }
        if ((i12 & 256) != 0) {
            z13 = scheduleRoomOptions.isAllScreenShareDisabled;
        }
        if ((i12 & 512) != 0) {
            z14 = scheduleRoomOptions.isAllMessageDisabled;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        long j13 = j12;
        long j14 = j11;
        return scheduleRoomOptions.copy(str, str2, j14, j13, i11, list, z11, z12, z15, z16);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsAllMessageDisabled() {
        return this.isAllMessageDisabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getReminderSecondsBeforeStart() {
        return this.reminderSecondsBeforeStart;
    }

    @NotNull
    public final List<String> component6() {
        return this.scheduleAttendees;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsAllMicrophoneDisabled() {
        return this.isAllMicrophoneDisabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsAllCameraDisabled() {
        return this.isAllCameraDisabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAllScreenShareDisabled() {
        return this.isAllScreenShareDisabled;
    }

    @NotNull
    public final ScheduleRoomOptions copy(@NotNull String roomName, @NotNull String password, long scheduleStartTime, long scheduleEndTime, int reminderSecondsBeforeStart, @NotNull List<String> scheduleAttendees, boolean isAllMicrophoneDisabled, boolean isAllCameraDisabled, boolean isAllScreenShareDisabled, boolean isAllMessageDisabled) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(scheduleAttendees, "scheduleAttendees");
        return new ScheduleRoomOptions(roomName, password, scheduleStartTime, scheduleEndTime, reminderSecondsBeforeStart, scheduleAttendees, isAllMicrophoneDisabled, isAllCameraDisabled, isAllScreenShareDisabled, isAllMessageDisabled);
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public final int getReminderSecondsBeforeStart() {
        return this.reminderSecondsBeforeStart;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    public final List<String> getScheduleAttendees() {
        return this.scheduleAttendees;
    }

    public final long getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    public final long getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = (this.scheduleAttendees.hashCode() + AbstractC39396a.m88225a(this.reminderSecondsBeforeStart, (Long.hashCode(this.scheduleEndTime) + ((Long.hashCode(this.scheduleStartTime) + AbstractC39391a.m88220a(this.password, this.roomName.hashCode() * 31, 31)) * 31)) * 31, 31)) * 31;
        boolean z11 = this.isAllMicrophoneDisabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isAllCameraDisabled;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isAllScreenShareDisabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isAllMessageDisabled;
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

    public final void setAllCameraDisabled(boolean z11) {
        this.isAllCameraDisabled = z11;
    }

    public final void setAllMessageDisabled(boolean z11) {
        this.isAllMessageDisabled = z11;
    }

    public final void setAllMicrophoneDisabled(boolean z11) {
        this.isAllMicrophoneDisabled = z11;
    }

    public final void setAllScreenShareDisabled(boolean z11) {
        this.isAllScreenShareDisabled = z11;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final void setReminderSecondsBeforeStart(int i11) {
        this.reminderSecondsBeforeStart = i11;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    public final void setScheduleAttendees(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.scheduleAttendees = list;
    }

    public final void setScheduleEndTime(long j11) {
        this.scheduleEndTime = j11;
    }

    public final void setScheduleStartTime(long j11) {
        this.scheduleStartTime = j11;
    }

    @NotNull
    public String toString() {
        return "ScheduleRoomOptions(roomName=" + this.roomName + ", password=" + this.password + ", scheduleStartTime=" + this.scheduleStartTime + ", scheduleEndTime=" + this.scheduleEndTime + ", reminderSecondsBeforeStart=" + this.reminderSecondsBeforeStart + ", scheduleAttendees=" + this.scheduleAttendees + ", isAllMicrophoneDisabled=" + this.isAllMicrophoneDisabled + ", isAllCameraDisabled=" + this.isAllCameraDisabled + ", isAllScreenShareDisabled=" + this.isAllScreenShareDisabled + ", isAllMessageDisabled=" + this.isAllMessageDisabled + ')';
    }

    public /* synthetic */ ScheduleRoomOptions(String str, String str2, long j11, long j12, int i11, List list, boolean z11, boolean z12, boolean z13, boolean z14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) == 0 ? j12 : 0L, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? false : z14);
    }
}
