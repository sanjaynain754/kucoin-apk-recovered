package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.room.CallRejectionReason;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.l0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39936l0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88795a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88796b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f88797c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f88798d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int[] f88799e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int[] f88800f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int[] f88801g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int[] f88802h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int[] f88803i;

    static {
        int[] iArr = new int[TUIRoomDefine.RequestAction.values().length];
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_TO_OPEN_REMOTE_CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_TO_OPEN_REMOTE_MICROPHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_MICROPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_SCREEN_SHARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f88795a = iArr;
        int[] iArr2 = new int[TUIRoomDefine.Role.values().length];
        try {
            iArr2[TUIRoomDefine.Role.ROOM_OWNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TUIRoomDefine.Role.MANAGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TUIRoomDefine.Role.GENERAL_USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f88796b = iArr2;
        int[] iArr3 = new int[DeviceType.values().length];
        try {
            iArr3[DeviceType.MICROPHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DeviceType.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DeviceType.SCREEN_SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f88797c = iArr3;
        int[] iArr4 = new int[TUIRoomDefine.KickedOutOfRoomReason.values().length];
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.BY_ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.BY_LOGGED_ON_OTHER_DEVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.BY_SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.NETWORK_DISCONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[TUIRoomDefine.KickedOutOfRoomReason.COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        f88798d = iArr4;
        int[] iArr5 = new int[TUIConferenceInvitationManager.InvitationCode.values().length];
        try {
            iArr5[TUIConferenceInvitationManager.InvitationCode.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[TUIConferenceInvitationManager.InvitationCode.ALREADY_IN_INVITATION_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[TUIConferenceInvitationManager.InvitationCode.ALREADY_IN_CONFERENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        f88799e = iArr5;
        int[] iArr6 = new int[TUIConferenceInvitationManager.InvitationStatus.values().length];
        try {
            iArr6[TUIConferenceInvitationManager.InvitationStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[TUIConferenceInvitationManager.InvitationStatus.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[TUIConferenceInvitationManager.InvitationStatus.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        f88800f = iArr6;
        int[] iArr7 = new int[TUIConferenceListManager.ConferenceStatus.values().length];
        try {
            iArr7[TUIConferenceListManager.ConferenceStatus.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        f88801g = iArr7;
        int[] iArr8 = new int[CallRejectionReason.values().length];
        try {
            iArr8[CallRejectionReason.REJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr8[CallRejectionReason.IN_OTHER_ROOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        f88802h = iArr8;
        int[] iArr9 = new int[TUIConferenceInvitationManager.RejectedReason.values().length];
        try {
            iArr9[TUIConferenceInvitationManager.RejectedReason.REJECT_TO_ENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr9[TUIConferenceInvitationManager.RejectedReason.IN_OTHER_CONFERENCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        f88803i = iArr9;
    }
}
