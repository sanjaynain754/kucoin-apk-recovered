package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "", "()V", "onAudienceJoined", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onAudienceLeft", "onAudienceMessageDisabled", "isDisable", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveAudienceListener {
    public void onAudienceJoined(@NotNull LiveUserInfo audience) {
        Intrinsics.checkNotNullParameter(audience, "audience");
    }

    public void onAudienceLeft(@NotNull LiveUserInfo audience) {
        Intrinsics.checkNotNullParameter(audience, "audience");
    }

    public void onAudienceMessageDisabled(@NotNull LiveUserInfo audience, boolean isDisable) {
        Intrinsics.checkNotNullParameter(audience, "audience");
    }
}
