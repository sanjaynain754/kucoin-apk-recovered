package io.trtc.tuikit.atomicxcore.api.room;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions;", "", "roomName", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getRoomName", "setRoomName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ModifyFlag", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class UpdateRoomOptions {

    @NotNull
    private String password;

    @NotNull
    private String roomName;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions$ModifyFlag;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ROOM_NAME", "PASSWORD", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public enum ModifyFlag {
        ROOM_NAME(1),
        PASSWORD(2);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int value;

        @NotNull
        public static EnumEntries<ModifyFlag> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        ModifyFlag(int i11) {
            this.value = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateRoomOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateRoomOptions)) {
            return false;
        }
        UpdateRoomOptions updateRoomOptions = (UpdateRoomOptions) other;
        return Intrinsics.areEqual(this.roomName, updateRoomOptions.roomName) && Intrinsics.areEqual(this.password, updateRoomOptions.password);
    }

    public UpdateRoomOptions(@NotNull String roomName, @NotNull String password) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        this.roomName = roomName;
        this.password = password;
    }

    public static /* synthetic */ UpdateRoomOptions copy$default(UpdateRoomOptions updateRoomOptions, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = updateRoomOptions.roomName;
        }
        if ((i11 & 2) != 0) {
            str2 = updateRoomOptions.password;
        }
        return updateRoomOptions.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final UpdateRoomOptions copy(@NotNull String roomName, @NotNull String password) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        return new UpdateRoomOptions(roomName, password);
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.roomName.hashCode() * 31);
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateRoomOptions(roomName=");
        sb2.append(this.roomName);
        sb2.append(", password=");
        return AbstractC39392b.m88221a(sb2, this.password, ')');
    }

    public /* synthetic */ UpdateRoomOptions(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
