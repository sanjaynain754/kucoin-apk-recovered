package io.trtc.tuikit.atomicxcore.api.room;

import com.facebook.react.uimanager.ViewProps;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0012\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\u0083\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001J\u0013\u0010B\u001a\u00020\u00102\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018¨\u0006G"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;", "", "userID", "", TUIConstantDefine.USER_NAME, "avatarURL", TUIConstantDefine.NAME_CARD, ViewProps.ROLE, "Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;", TUIConstants.TUILive.ROOM_STATUS, "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;", "microphoneStatus", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;", "cameraStatus", "screenShareStatus", TUIConstantDefine.IS_MESSAGE_DISABLED, "", "metaData", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "getCameraStatus", "()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;", "setCameraStatus", "(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;)V", "()Z", "setMessageDisabled", "(Z)V", "getMetaData", "()Ljava/util/Map;", V2TXLiveProperty.kV2SetMetaData, "(Ljava/util/Map;)V", "getMicrophoneStatus", "setMicrophoneStatus", "getNameCard", "setNameCard", "getRole", "()Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;", "setRole", "(Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;)V", "getRoomStatus", "()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;", "setRoomStatus", "(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;)V", "getScreenShareStatus", "setScreenShareStatus", "getUserID", "setUserID", "getUserName", "setUserName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RoomParticipant {

    @NotNull
    private String avatarURL;

    @NotNull
    private DeviceStatus cameraStatus;
    private boolean isMessageDisabled;

    @NotNull
    private Map<String, byte[]> metaData;

    @NotNull
    private DeviceStatus microphoneStatus;

    @NotNull
    private String nameCard;

    @NotNull
    private ParticipantRole role;

    @NotNull
    private RoomParticipantStatus roomStatus;

    @NotNull
    private DeviceStatus screenShareStatus;

    @NotNull
    private String userID;

    @NotNull
    private String userName;

    public RoomParticipant() {
        this(null, null, null, null, null, null, null, null, null, false, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomParticipant copy$default(RoomParticipant roomParticipant, String str, String str2, String str3, String str4, ParticipantRole participantRole, RoomParticipantStatus roomParticipantStatus, DeviceStatus deviceStatus, DeviceStatus deviceStatus2, DeviceStatus deviceStatus3, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = roomParticipant.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = roomParticipant.userName;
        }
        if ((i11 & 4) != 0) {
            str3 = roomParticipant.avatarURL;
        }
        if ((i11 & 8) != 0) {
            str4 = roomParticipant.nameCard;
        }
        if ((i11 & 16) != 0) {
            participantRole = roomParticipant.role;
        }
        if ((i11 & 32) != 0) {
            roomParticipantStatus = roomParticipant.roomStatus;
        }
        if ((i11 & 64) != 0) {
            deviceStatus = roomParticipant.microphoneStatus;
        }
        if ((i11 & 128) != 0) {
            deviceStatus2 = roomParticipant.cameraStatus;
        }
        if ((i11 & 256) != 0) {
            deviceStatus3 = roomParticipant.screenShareStatus;
        }
        if ((i11 & 512) != 0) {
            z11 = roomParticipant.isMessageDisabled;
        }
        if ((i11 & 1024) != 0) {
            map = roomParticipant.metaData;
        }
        boolean z12 = z11;
        Map map2 = map;
        DeviceStatus deviceStatus4 = deviceStatus2;
        DeviceStatus deviceStatus5 = deviceStatus3;
        RoomParticipantStatus roomParticipantStatus2 = roomParticipantStatus;
        DeviceStatus deviceStatus6 = deviceStatus;
        ParticipantRole participantRole2 = participantRole;
        String str5 = str3;
        return roomParticipant.copy(str, str2, str5, str4, participantRole2, roomParticipantStatus2, deviceStatus6, deviceStatus4, deviceStatus5, z12, map2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomParticipant)) {
            return false;
        }
        RoomParticipant roomParticipant = (RoomParticipant) other;
        return Intrinsics.areEqual(this.userID, roomParticipant.userID) && Intrinsics.areEqual(this.userName, roomParticipant.userName) && Intrinsics.areEqual(this.avatarURL, roomParticipant.avatarURL) && Intrinsics.areEqual(this.nameCard, roomParticipant.nameCard) && this.role == roomParticipant.role && this.roomStatus == roomParticipant.roomStatus && this.microphoneStatus == roomParticipant.microphoneStatus && this.cameraStatus == roomParticipant.cameraStatus && this.screenShareStatus == roomParticipant.screenShareStatus && this.isMessageDisabled == roomParticipant.isMessageDisabled && Intrinsics.areEqual(this.metaData, roomParticipant.metaData);
    }

    public RoomParticipant(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL, @NotNull String nameCard, @NotNull ParticipantRole role, @NotNull RoomParticipantStatus roomStatus, @NotNull DeviceStatus microphoneStatus, @NotNull DeviceStatus cameraStatus, @NotNull DeviceStatus screenShareStatus, boolean z11, @NotNull Map<String, byte[]> metaData) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(nameCard, "nameCard");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(screenShareStatus, "screenShareStatus");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        this.userID = userID;
        this.userName = userName;
        this.avatarURL = avatarURL;
        this.nameCard = nameCard;
        this.role = role;
        this.roomStatus = roomStatus;
        this.microphoneStatus = microphoneStatus;
        this.cameraStatus = cameraStatus;
        this.screenShareStatus = screenShareStatus;
        this.isMessageDisabled = z11;
        this.metaData = metaData;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsMessageDisabled() {
        return this.isMessageDisabled;
    }

    @NotNull
    public final Map<String, byte[]> component11() {
        return this.metaData;
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
    public final String getNameCard() {
        return this.nameCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ParticipantRole getRole() {
        return this.role;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RoomParticipantStatus getRoomStatus() {
        return this.roomStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceStatus getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceStatus getCameraStatus() {
        return this.cameraStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceStatus getScreenShareStatus() {
        return this.screenShareStatus;
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
    public final Map<String, byte[]> getMetaData() {
        return this.metaData;
    }

    @NotNull
    public final DeviceStatus getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    @NotNull
    public final String getNameCard() {
        return this.nameCard;
    }

    @NotNull
    public final ParticipantRole getRole() {
        return this.role;
    }

    @NotNull
    public final RoomParticipantStatus getRoomStatus() {
        return this.roomStatus;
    }

    @NotNull
    public final DeviceStatus getScreenShareStatus() {
        return this.screenShareStatus;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    public int hashCode() {
        int iHashCode = (this.screenShareStatus.hashCode() + ((this.cameraStatus.hashCode() + ((this.microphoneStatus.hashCode() + ((this.roomStatus.hashCode() + ((this.role.hashCode() + AbstractC39391a.m88220a(this.nameCard, AbstractC39391a.m88220a(this.avatarURL, AbstractC39391a.m88220a(this.userName, this.userID.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z11 = this.isMessageDisabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return this.metaData.hashCode() + ((iHashCode + r11) * 31);
    }

    public final boolean isMessageDisabled() {
        return this.isMessageDisabled;
    }

    public final void setAvatarURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarURL = str;
    }

    public final void setCameraStatus(@NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(deviceStatus, "<set-?>");
        this.cameraStatus = deviceStatus;
    }

    public final void setMessageDisabled(boolean z11) {
        this.isMessageDisabled = z11;
    }

    public final void setMetaData(@NotNull Map<String, byte[]> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.metaData = map;
    }

    public final void setMicrophoneStatus(@NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(deviceStatus, "<set-?>");
        this.microphoneStatus = deviceStatus;
    }

    public final void setNameCard(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameCard = str;
    }

    public final void setRole(@NotNull ParticipantRole participantRole) {
        Intrinsics.checkNotNullParameter(participantRole, "<set-?>");
        this.role = participantRole;
    }

    public final void setRoomStatus(@NotNull RoomParticipantStatus roomParticipantStatus) {
        Intrinsics.checkNotNullParameter(roomParticipantStatus, "<set-?>");
        this.roomStatus = roomParticipantStatus;
    }

    public final void setScreenShareStatus(@NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(deviceStatus, "<set-?>");
        this.screenShareStatus = deviceStatus;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    @NotNull
    public String toString() {
        return "RoomParticipant(userID=" + this.userID + ", userName=" + this.userName + ", avatarURL=" + this.avatarURL + ", nameCard=" + this.nameCard + ", role=" + this.role + ", roomStatus=" + this.roomStatus + ", microphoneStatus=" + this.microphoneStatus + ", cameraStatus=" + this.cameraStatus + ", screenShareStatus=" + this.screenShareStatus + ", isMessageDisabled=" + this.isMessageDisabled + ", metaData=" + this.metaData + ')';
    }

    @NotNull
    public final RoomParticipant copy(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL, @NotNull String nameCard, @NotNull ParticipantRole role, @NotNull RoomParticipantStatus roomStatus, @NotNull DeviceStatus microphoneStatus, @NotNull DeviceStatus cameraStatus, @NotNull DeviceStatus screenShareStatus, boolean isMessageDisabled, @NotNull Map<String, byte[]> metaData) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(nameCard, "nameCard");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(roomStatus, "roomStatus");
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(screenShareStatus, "screenShareStatus");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        return new RoomParticipant(userID, userName, avatarURL, nameCard, role, roomStatus, microphoneStatus, cameraStatus, screenShareStatus, isMessageDisabled, metaData);
    }

    public /* synthetic */ RoomParticipant(String str, String str2, String str3, String str4, ParticipantRole participantRole, RoomParticipantStatus roomParticipantStatus, DeviceStatus deviceStatus, DeviceStatus deviceStatus2, DeviceStatus deviceStatus3, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? ParticipantRole.GENERAL_USER : participantRole, (i11 & 32) != 0 ? RoomParticipantStatus.SCHEDULED : roomParticipantStatus, (i11 & 64) != 0 ? DeviceStatus.OFF : deviceStatus, (i11 & 128) != 0 ? DeviceStatus.OFF : deviceStatus2, (i11 & 256) != 0 ? DeviceStatus.OFF : deviceStatus3, (i11 & 512) != 0 ? false : z11, (i11 & 1024) != 0 ? new LinkedHashMap() : map);
    }
}
