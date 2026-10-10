package io.trtc.tuikit.atomicxcore.impl.live;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.e0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39732e0 {
    public abstract void onWillLeaveRoom(String str);

    public void onDidLeaveRoom(@NotNull String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
    }
}
