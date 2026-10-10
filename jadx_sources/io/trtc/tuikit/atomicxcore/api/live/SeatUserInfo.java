package io.trtc.tuikit.atomicxcore.api.live;

import com.facebook.react.uimanager.ViewProps;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "", "userID", "", TUIConstantDefine.USER_NAME, "avatarURL", ViewProps.ROLE, "Lio/trtc/tuikit/atomicxcore/api/live/Role;", "liveID", "microphoneStatus", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;", "allowOpenMicrophone", "", "cameraStatus", "allowOpenCamera", "userSuspendStatus", "Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;)V", "getAllowOpenCamera", "()Z", "getAllowOpenMicrophone", "getAvatarURL", "()Ljava/lang/String;", "getCameraStatus", "()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;", "getLiveID", "getMicrophoneStatus", "getRole", "()Lio/trtc/tuikit/atomicxcore/api/live/Role;", "getUserID", "getUserName", "getUserSuspendStatus", "()Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class SeatUserInfo {
    private final boolean allowOpenCamera;
    private final boolean allowOpenMicrophone;

    @NotNull
    private final String avatarURL;

    @NotNull
    private final DeviceStatus cameraStatus;

    @NotNull
    private final String liveID;

    @NotNull
    private final DeviceStatus microphoneStatus;

    @NotNull
    private final Role role;

    @NotNull
    private final String userID;

    @NotNull
    private final String userName;

    @NotNull
    private final SuspendStatus userSuspendStatus;

    public SeatUserInfo() {
        this(null, null, null, null, null, null, false, null, false, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeatUserInfo)) {
            return false;
        }
        SeatUserInfo seatUserInfo = (SeatUserInfo) other;
        return Intrinsics.areEqual(this.userID, seatUserInfo.userID) && Intrinsics.areEqual(this.userName, seatUserInfo.userName) && Intrinsics.areEqual(this.avatarURL, seatUserInfo.avatarURL) && this.role == seatUserInfo.role && Intrinsics.areEqual(this.liveID, seatUserInfo.liveID) && this.microphoneStatus == seatUserInfo.microphoneStatus && this.allowOpenMicrophone == seatUserInfo.allowOpenMicrophone && this.cameraStatus == seatUserInfo.cameraStatus && this.allowOpenCamera == seatUserInfo.allowOpenCamera && this.userSuspendStatus == seatUserInfo.userSuspendStatus;
    }

    public SeatUserInfo(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL, @NotNull Role role, @NotNull String liveID, @NotNull DeviceStatus microphoneStatus, boolean z11, @NotNull DeviceStatus cameraStatus, boolean z12, @NotNull SuspendStatus userSuspendStatus) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(userSuspendStatus, "userSuspendStatus");
        this.userID = userID;
        this.userName = userName;
        this.avatarURL = avatarURL;
        this.role = role;
        this.liveID = liveID;
        this.microphoneStatus = microphoneStatus;
        this.allowOpenMicrophone = z11;
        this.cameraStatus = cameraStatus;
        this.allowOpenCamera = z12;
        this.userSuspendStatus = userSuspendStatus;
    }

    public static /* synthetic */ SeatUserInfo copy$default(SeatUserInfo seatUserInfo, String str, String str2, String str3, Role role, String str4, DeviceStatus deviceStatus, boolean z11, DeviceStatus deviceStatus2, boolean z12, SuspendStatus suspendStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = seatUserInfo.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = seatUserInfo.userName;
        }
        if ((i11 & 4) != 0) {
            str3 = seatUserInfo.avatarURL;
        }
        if ((i11 & 8) != 0) {
            role = seatUserInfo.role;
        }
        if ((i11 & 16) != 0) {
            str4 = seatUserInfo.liveID;
        }
        if ((i11 & 32) != 0) {
            deviceStatus = seatUserInfo.microphoneStatus;
        }
        if ((i11 & 64) != 0) {
            z11 = seatUserInfo.allowOpenMicrophone;
        }
        if ((i11 & 128) != 0) {
            deviceStatus2 = seatUserInfo.cameraStatus;
        }
        if ((i11 & 256) != 0) {
            z12 = seatUserInfo.allowOpenCamera;
        }
        if ((i11 & 512) != 0) {
            suspendStatus = seatUserInfo.userSuspendStatus;
        }
        boolean z13 = z12;
        SuspendStatus suspendStatus2 = suspendStatus;
        boolean z14 = z11;
        DeviceStatus deviceStatus3 = deviceStatus2;
        String str5 = str4;
        DeviceStatus deviceStatus4 = deviceStatus;
        return seatUserInfo.copy(str, str2, str3, role, str5, deviceStatus4, z14, deviceStatus3, z13, suspendStatus2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SuspendStatus getUserSuspendStatus() {
        return this.userSuspendStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Role getRole() {
        return this.role;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLiveID() {
        return this.liveID;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceStatus getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAllowOpenMicrophone() {
        return this.allowOpenMicrophone;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceStatus getCameraStatus() {
        return this.cameraStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getAllowOpenCamera() {
        return this.allowOpenCamera;
    }

    public final boolean getAllowOpenCamera() {
        return this.allowOpenCamera;
    }

    public final boolean getAllowOpenMicrophone() {
        return this.allowOpenMicrophone;
    }

    @NotNull
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final DeviceStatus getCameraStatus() {
        return this.cameraStatus;
    }

    @NotNull
    public final String getLiveID() {
        return this.liveID;
    }

    @NotNull
    public final DeviceStatus getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    @NotNull
    public final Role getRole() {
        return this.role;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final SuspendStatus getUserSuspendStatus() {
        return this.userSuspendStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = (this.microphoneStatus.hashCode() + AbstractC39391a.m88220a(this.liveID, (this.role.hashCode() + AbstractC39391a.m88220a(this.avatarURL, AbstractC39391a.m88220a(this.userName, this.userID.hashCode() * 31, 31), 31)) * 31, 31)) * 31;
        boolean z11 = this.allowOpenMicrophone;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iHashCode2 = (this.cameraStatus.hashCode() + ((iHashCode + r11) * 31)) * 31;
        boolean z12 = this.allowOpenCamera;
        return this.userSuspendStatus.hashCode() + ((iHashCode2 + (z12 ? 1 : z12)) * 31);
    }

    @NotNull
    public String toString() {
        return "SeatUserInfo(userID=" + this.userID + ", userName=" + this.userName + ", avatarURL=" + this.avatarURL + ", role=" + this.role + ", liveID=" + this.liveID + ", microphoneStatus=" + this.microphoneStatus + ", allowOpenMicrophone=" + this.allowOpenMicrophone + ", cameraStatus=" + this.cameraStatus + ", allowOpenCamera=" + this.allowOpenCamera + ", userSuspendStatus=" + this.userSuspendStatus + ')';
    }

    @NotNull
    public final SeatUserInfo copy(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL, @NotNull Role role, @NotNull String liveID, @NotNull DeviceStatus microphoneStatus, boolean allowOpenMicrophone, @NotNull DeviceStatus cameraStatus, boolean allowOpenCamera, @NotNull SuspendStatus userSuspendStatus) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(userSuspendStatus, "userSuspendStatus");
        return new SeatUserInfo(userID, userName, avatarURL, role, liveID, microphoneStatus, allowOpenMicrophone, cameraStatus, allowOpenCamera, userSuspendStatus);
    }

    public /* synthetic */ SeatUserInfo(String str, String str2, String str3, Role role, String str4, DeviceStatus deviceStatus, boolean z11, DeviceStatus deviceStatus2, boolean z12, SuspendStatus suspendStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? Role.GENERAL_USER : role, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? DeviceStatus.OFF : deviceStatus, (i11 & 64) != 0 ? true : z11, (i11 & 128) != 0 ? DeviceStatus.OFF : deviceStatus2, (i11 & 256) != 0 ? true : z12, (i11 & 512) != 0 ? SuspendStatus.NONE : suspendStatus);
    }
}
