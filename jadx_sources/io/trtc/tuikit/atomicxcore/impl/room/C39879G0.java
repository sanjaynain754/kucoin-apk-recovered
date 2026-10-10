package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.G0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39879G0 extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88634a;

    public C39879G0(C39904T0 c39904t0) {
        this.f88634a = c39904t0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onAllUserCameraDisableChanged(String roomID, boolean z11) {
        Object value;
        RoomInfo roomInfo;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
            do {
                value = interfaceC41669n.getValue();
                roomInfo = (RoomInfo) value;
            } while (!interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : z11, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false)));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onAllUserMicrophoneDisableChanged(String roomID, boolean z11) {
        Object value;
        RoomInfo roomInfo;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
            do {
                value = interfaceC41669n.getValue();
                roomInfo = (RoomInfo) value;
            } while (!interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : z11, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false)));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomNameChanged(String roomID, String str) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        String roomName = str;
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        if (!Intrinsics.areEqual(roomID, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
        while (true) {
            Object value = interfaceC41669n.getValue();
            RoomInfo roomInfo = (RoomInfo) value;
            if (interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : roomName, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false))) {
                return;
            } else {
                roomName = str;
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomUserCountChanged(String roomId, int i11) {
        Object value;
        RoomInfo roomInfo;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        if (Intrinsics.areEqual(roomId, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
            do {
                value = interfaceC41669n.getValue();
                roomInfo = (RoomInfo) value;
            } while (!interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : i11, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false)));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onScreenShareForAllUserDisableChanged(String roomID, boolean z11) {
        Object value;
        RoomInfo roomInfo;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
            do {
                value = interfaceC41669n.getValue();
                roomInfo = (RoomInfo) value;
            } while (!interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : z11)));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSendMessageForAllUserDisableChanged(String roomID, boolean z11) {
        Object value;
        RoomInfo roomInfo;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, ((RoomInfo) this.f88634a.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88634a.f88697c;
            do {
                value = interfaceC41669n.getValue();
                roomInfo = (RoomInfo) value;
            } while (!interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : z11, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false)));
        }
    }
}
