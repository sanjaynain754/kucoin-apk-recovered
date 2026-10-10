package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.A */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40043A {
    /* JADX INFO: renamed from: a */
    public static final TUIRoomDefine.UserInfo m88426a(LiveUserInfo liveUserInfo) {
        Intrinsics.checkNotNullParameter(liveUserInfo, "liveUserInfo");
        TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
        userInfo.userId = liveUserInfo.getUserID();
        userInfo.userName = liveUserInfo.getUserName();
        userInfo.avatarUrl = liveUserInfo.getAvatarURL();
        return userInfo;
    }
}
