package io.trtc.tuikit.atomicxcore.api.room;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006#"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;", "", "roomName", "", "password", "isAllMicrophoneDisabled", "", "isAllCameraDisabled", "isAllScreenShareDisabled", "isAllMessageDisabled", "(Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "()Z", "setAllCameraDisabled", "(Z)V", "setAllMessageDisabled", "setAllMicrophoneDisabled", "setAllScreenShareDisabled", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getRoomName", "setRoomName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CreateRoomOptions {
    private boolean isAllCameraDisabled;
    private boolean isAllMessageDisabled;
    private boolean isAllMicrophoneDisabled;
    private boolean isAllScreenShareDisabled;

    @NotNull
    private String password;

    @NotNull
    private String roomName;

    public CreateRoomOptions() {
        this(null, null, false, false, false, false, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateRoomOptions)) {
            return false;
        }
        CreateRoomOptions createRoomOptions = (CreateRoomOptions) other;
        return Intrinsics.areEqual(this.roomName, createRoomOptions.roomName) && Intrinsics.areEqual(this.password, createRoomOptions.password) && this.isAllMicrophoneDisabled == createRoomOptions.isAllMicrophoneDisabled && this.isAllCameraDisabled == createRoomOptions.isAllCameraDisabled && this.isAllScreenShareDisabled == createRoomOptions.isAllScreenShareDisabled && this.isAllMessageDisabled == createRoomOptions.isAllMessageDisabled;
    }

    public CreateRoomOptions(@NotNull String roomName, @NotNull String password, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        this.roomName = roomName;
        this.password = password;
        this.isAllMicrophoneDisabled = z11;
        this.isAllCameraDisabled = z12;
        this.isAllScreenShareDisabled = z13;
        this.isAllMessageDisabled = z14;
    }

    public static /* synthetic */ CreateRoomOptions copy$default(CreateRoomOptions createRoomOptions, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createRoomOptions.roomName;
        }
        if ((i11 & 2) != 0) {
            str2 = createRoomOptions.password;
        }
        if ((i11 & 4) != 0) {
            z11 = createRoomOptions.isAllMicrophoneDisabled;
        }
        if ((i11 & 8) != 0) {
            z12 = createRoomOptions.isAllCameraDisabled;
        }
        if ((i11 & 16) != 0) {
            z13 = createRoomOptions.isAllScreenShareDisabled;
        }
        if ((i11 & 32) != 0) {
            z14 = createRoomOptions.isAllMessageDisabled;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        return createRoomOptions.copy(str, str2, z11, z12, z15, z16);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAllMicrophoneDisabled() {
        return this.isAllMicrophoneDisabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAllCameraDisabled() {
        return this.isAllCameraDisabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAllScreenShareDisabled() {
        return this.isAllScreenShareDisabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsAllMessageDisabled() {
        return this.isAllMessageDisabled;
    }

    @NotNull
    public final CreateRoomOptions copy(@NotNull String roomName, @NotNull String password, boolean isAllMicrophoneDisabled, boolean isAllCameraDisabled, boolean isAllScreenShareDisabled, boolean isAllMessageDisabled) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(password, "password");
        return new CreateRoomOptions(roomName, password, isAllMicrophoneDisabled, isAllCameraDisabled, isAllScreenShareDisabled, isAllMessageDisabled);
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.password, this.roomName.hashCode() * 31, 31);
        boolean z11 = this.isAllMicrophoneDisabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM88220a + r11) * 31;
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

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    @NotNull
    public String toString() {
        return "CreateRoomOptions(roomName=" + this.roomName + ", password=" + this.password + ", isAllMicrophoneDisabled=" + this.isAllMicrophoneDisabled + ", isAllCameraDisabled=" + this.isAllCameraDisabled + ", isAllScreenShareDisabled=" + this.isAllScreenShareDisabled + ", isAllMessageDisabled=" + this.isAllMessageDisabled + ')';
    }

    public /* synthetic */ CreateRoomOptions(String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? false : z14);
    }
}
