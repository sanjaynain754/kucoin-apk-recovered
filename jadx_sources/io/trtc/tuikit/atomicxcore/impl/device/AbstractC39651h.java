package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.AudioRoute;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.h */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39651h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88084a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88085b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f88086c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f88087d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int[] f88088e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int[] f88089f;

    static {
        int[] iArr = new int[MirrorType.values().length];
        try {
            iArr[MirrorType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MirrorType.ENABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MirrorType.DISABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f88084a = iArr;
        int[] iArr2 = new int[TUICommonDefine.Error.values().length];
        try {
            iArr2[TUICommonDefine.Error.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TUICommonDefine.Error.CAMERA_OCCUPIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TUICommonDefine.Error.CAMERA_DEVICE_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TUICommonDefine.Error.MICROPHONE_DEVICE_EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TUICommonDefine.Error.OPEN_CAMERA_NEED_PERMISSION_FROM_ADMIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TUICommonDefine.Error.OPEN_MICROPHONE_NEED_PERMISSION_FROM_ADMIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TUICommonDefine.Error.OPEN_SCREEN_SHARE_NEED_PERMISSION_FROM_ADMIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f88085b = iArr2;
        int[] iArr3 = new int[AudioRoute.values().length];
        try {
            iArr3[AudioRoute.EARPIECE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[AudioRoute.SPEAKERPHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f88086c = iArr3;
        int[] iArr4 = new int[VideoQuality.values().length];
        try {
            iArr4[VideoQuality.QUALITY_360P.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[VideoQuality.QUALITY_540P.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[VideoQuality.QUALITY_720P.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[VideoQuality.QUALITY_1080P.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        f88087d = iArr4;
        int[] iArr5 = new int[TUICommonDefine.NetworkQuality.values().length];
        try {
            iArr5[TUICommonDefine.NetworkQuality.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.EXCELLENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.GOOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.POOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.BAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.VERY_BAD.ordinal()] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[TUICommonDefine.NetworkQuality.DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused23) {
        }
        f88088e = iArr5;
        int[] iArr6 = new int[TUIRoomDefine.DeviceStatus.values().length];
        try {
            iArr6[TUIRoomDefine.DeviceStatus.OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        f88089f = iArr6;
    }
}
