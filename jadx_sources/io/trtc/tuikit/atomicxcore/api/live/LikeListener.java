package io.trtc.tuikit.atomicxcore.api.live;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LikeListener;", "", "()V", "onReceiveLikesMessage", "", "liveID", "", "totalLikesReceived", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LikeListener {
    public void onReceiveLikesMessage(@NotNull String liveID, long totalLikesReceived, @NotNull LiveUserInfo sender) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(sender, "sender");
    }
}
