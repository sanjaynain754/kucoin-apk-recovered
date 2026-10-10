package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.j0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39747j0 {
    /* JADX INFO: renamed from: a */
    public static final LiveUserInfo m88321a(TUIRoomDefine.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LiveUserInfo liveUserInfo = new LiveUserInfo(null, null, null, 7, null);
        String userId = request.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        liveUserInfo.setUserID(userId);
        String userName = request.userName;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        liveUserInfo.setUserName(userName);
        String avatarUrl = request.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "avatarUrl");
        liveUserInfo.setAvatarURL(avatarUrl);
        return liveUserInfo;
    }

    /* JADX INFO: renamed from: a */
    public static final LiveUserInfo m88322a(TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        String userId = userInfo.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        String userName = userInfo.userName;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        String avatarUrl = userInfo.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "avatarUrl");
        return new LiveUserInfo(userId, userName, avatarUrl);
    }
}
