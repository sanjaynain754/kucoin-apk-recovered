package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "", "()V", "onKickedOutOfLive", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;", "message", "onLiveEnded", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LiveListListener {
    public void onKickedOutOfLive(@NotNull String liveID, @NotNull LiveKickedOutReason reason, @NotNull String message) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public void onLiveEnded(@NotNull String liveID, @NotNull LiveEndedReason reason, @NotNull String message) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
