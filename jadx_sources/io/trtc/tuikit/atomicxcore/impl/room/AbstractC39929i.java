package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.i */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39929i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88754a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88755b;

    static {
        int[] iArr = new int[TUIRoomDefine.VideoStreamType.values().length];
        try {
            iArr[TUIRoomDefine.VideoStreamType.CAMERA_STREAM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TUIRoomDefine.VideoStreamType.SCREEN_STREAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88754a = iArr;
        int[] iArr2 = new int[TUIRoomDefine.RequestAction.values().length];
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_MICROPHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_TO_OPEN_REMOTE_CAMERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_TO_OPEN_REMOTE_MICROPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_TO_CLOSE_REMOTE_MICROPHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_TO_CLOSE_REMOTE_CAMERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TUIRoomDefine.RequestAction.REQUEST_TO_CLOSE_REMOTE_SCREEN_SHARE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f88755b = iArr2;
    }
}
