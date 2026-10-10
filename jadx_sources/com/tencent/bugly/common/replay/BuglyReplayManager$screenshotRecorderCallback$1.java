package com.tencent.bugly.common.replay;

import android.graphics.Bitmap;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.C33657g;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/tencent/bugly/common/replay/BuglyReplayManager$screenshotRecorderCallback$1", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;", "onScreenshotRecorded", "", "bitmap", "Landroid/graphics/Bitmap;", "shouldRecycle", "", "screenshot", "Ljava/io/File;", "frameTimestamp", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class BuglyReplayManager$screenshotRecorderCallback$1 implements ScreenshotRecorderCallback {
    final /* synthetic */ BuglyReplayManager this$0;

    @Override // com.tencent.bugly.common.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull File screenshot, long frameTimestamp) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
    }

    public BuglyReplayManager$screenshotRecorderCallback$1(BuglyReplayManager buglyReplayManager) {
        this.this$0 = buglyReplayManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onScreenshotRecorded$lambda-0, reason: not valid java name */
    public static final void m103812onScreenshotRecorded$lambda0(Bitmap bitmap, BuglyReplayManager this$0, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.mo77133v("BuglyReplayManager", "onScreenshotRecorded, w: " + bitmap.getWidth() + ", h: " + bitmap.getHeight());
        this$0.replayCache.addFrame$bugly_pro_release(bitmap, System.currentTimeMillis(), C33657g.m73094e());
        if (z11) {
            bitmap.recycle();
        }
    }

    @Override // com.tencent.bugly.common.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull final Bitmap bitmap, final boolean shouldRecycle) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ThreadManager.Companion companion = ThreadManager.INSTANCE;
        final BuglyReplayManager buglyReplayManager = this.this$0;
        ThreadManager.Companion.runInDumpThread$default(companion, new Runnable() { // from class: com.tencent.bugly.common.replay.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BuglyReplayManager$screenshotRecorderCallback$1.m103812onScreenshotRecorded$lambda0(bitmap, buglyReplayManager, shouldRecycle);
            }
        }, 0L, 2, null);
    }
}
