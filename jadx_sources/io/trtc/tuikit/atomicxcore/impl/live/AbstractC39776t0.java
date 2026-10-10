package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.TakeSeatMode;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.t0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39776t0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88395a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88396b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f88397c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f88398d;

    static {
        int[] iArr = new int[TUIRoomDefine.KickedOutOfRoomReason.values().length];
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.BY_ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.BY_LOGGED_ON_OTHER_DEVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.BY_SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.NETWORK_DISCONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TUIRoomDefine.KickedOutOfRoomReason.COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f88395a = iArr;
        int[] iArr2 = new int[TUIRoomDefine.RoomDismissedReason.values().length];
        try {
            iArr2[TUIRoomDefine.RoomDismissedReason.BY_OWNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TUIRoomDefine.RoomDismissedReason.BY_SERVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f88396b = iArr2;
        int[] iArr3 = new int[TakeSeatMode.values().length];
        try {
            iArr3[TakeSeatMode.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[TakeSeatMode.APPLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f88397c = iArr3;
        int[] iArr4 = new int[TUIRoomDefine.SeatMode.values().length];
        try {
            iArr4[TUIRoomDefine.SeatMode.FREE_TO_TAKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[TUIRoomDefine.SeatMode.APPLY_TO_TAKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f88398d = iArr4;
    }
}
