package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.Role;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39719a {
    /* JADX INFO: renamed from: a */
    public static final SeatUserInfo m88318a(TUILiveBattleManager.BattleUser battleUser) {
        if (battleUser == null) {
            return new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null);
        }
        String userId = battleUser.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        String userName = battleUser.userName;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        String avatarUrl = battleUser.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "avatarUrl");
        Role role = Role.GENERAL_USER;
        String roomId = battleUser.roomId;
        Intrinsics.checkNotNullExpressionValue(roomId, "roomId");
        DeviceStatus deviceStatus = DeviceStatus.OFF;
        return new SeatUserInfo(userId, userName, avatarUrl, role, roomId, deviceStatus, true, deviceStatus, true, null, 512, null);
    }
}
