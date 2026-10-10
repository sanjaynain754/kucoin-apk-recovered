package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.i */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39652i {
    /* JADX INFO: renamed from: a */
    public static final DeviceError m88296a(TUICommonDefine.Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (AbstractC39651h.f88085b[error.ordinal()]) {
            case 1:
                return DeviceError.NO_ERROR;
            case 2:
                return DeviceError.OCCUPIED_ERROR;
            case 3:
                return DeviceError.NO_DEVICE_DETECTED;
            case 4:
                return DeviceError.NO_DEVICE_DETECTED;
            case 5:
            case 6:
            case 7:
                return DeviceError.NO_SYSTEM_PERMISSION;
            default:
                return DeviceError.UNKNOWN_ERROR;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TUIRoomDefine.VideoQuality m88295a(VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        int i11 = AbstractC39651h.f88087d[videoQuality.ordinal()];
        if (i11 == 1) {
            return TUIRoomDefine.VideoQuality.Q_360P;
        }
        if (i11 == 2) {
            return TUIRoomDefine.VideoQuality.Q_540P;
        }
        if (i11 == 3) {
            return TUIRoomDefine.VideoQuality.Q_720P;
        }
        if (i11 == 4) {
            return TUIRoomDefine.VideoQuality.Q_1080P;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final DeviceStatus m88297a(TUIRoomDefine.DeviceStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (AbstractC39651h.f88089f[status.ordinal()] == 1) {
            return DeviceStatus.ON;
        }
        return DeviceStatus.OFF;
    }
}
