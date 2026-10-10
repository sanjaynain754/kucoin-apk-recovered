package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39655l extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39661r f88091a;

    public C39655l(C39661r c39661r) {
        this.f88091a = c39661r;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onError(TUICommonDefine.Error errorCode, String message) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        if (errorCode == TUICommonDefine.Error.CAMERA_OCCUPIED) {
            this.f88091a.f88109g.setValue(AbstractC39652i.m88296a(errorCode));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserNetworkQualityChanged(Map map) {
        NetworkQuality networkQuality;
        TUICommonDefine.NetworkInfo networkInfo = map != null ? (TUICommonDefine.NetworkInfo) map.get(TUIRoomEngine.getSelfInfo().userId) : null;
        if (networkInfo == null) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88091a.f88115m;
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        String str = networkInfo.userId;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        TUICommonDefine.NetworkQuality networkQuality2 = networkInfo.quality;
        Intrinsics.checkNotNullExpressionValue(networkQuality2, "quality");
        Intrinsics.checkNotNullParameter(networkQuality2, "networkQuality");
        switch (AbstractC39651h.f88088e[networkQuality2.ordinal()]) {
            case 1:
                networkQuality = NetworkQuality.UNKNOWN;
                break;
            case 2:
                networkQuality = NetworkQuality.EXCELLENT;
                break;
            case 3:
                networkQuality = NetworkQuality.GOOD;
                break;
            case 4:
                networkQuality = NetworkQuality.POOR;
                break;
            case 5:
                networkQuality = NetworkQuality.BAD;
                break;
            case 6:
                networkQuality = NetworkQuality.VERY_BAD;
                break;
            case 7:
                networkQuality = NetworkQuality.DOWN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        interfaceC41669n.setValue(new NetworkInfo(str2, networkQuality, networkInfo.upLoss, networkInfo.downLoss, networkInfo.delay));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVideoStateChanged(String userID, TUIRoomDefine.VideoStreamType streamType, boolean z11, TUIRoomDefine.ChangeReason reason) {
        DeviceStatus deviceStatus;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (Intrinsics.areEqual(userID, TUIRoomEngine.getSelfInfo().userId) && streamType == TUIRoomDefine.VideoStreamType.SCREEN_STREAM) {
            InterfaceC41669n interfaceC41669n = this.f88091a.f88114l;
            if (z11) {
                deviceStatus = DeviceStatus.ON;
            } else {
                deviceStatus = DeviceStatus.OFF;
            }
            interfaceC41669n.setValue(deviceStatus);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVoiceVolumeChanged(Map volumeMap) {
        Intrinsics.checkNotNullParameter(volumeMap, "volumeMap");
        Integer num = (Integer) volumeMap.get(TUIRoomEngine.getSelfInfo().userId);
        if (num != null) {
            this.f88091a.f88106d.setValue(Integer.valueOf(num.intValue()));
        }
    }
}
