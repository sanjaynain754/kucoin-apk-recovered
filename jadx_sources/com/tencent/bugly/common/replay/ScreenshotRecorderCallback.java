package com.tencent.bugly.common.replay;

import android.graphics.Bitmap;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;", "", "onScreenshotRecorded", "", "bitmap", "Landroid/graphics/Bitmap;", "shouldRecycle", "", "screenshot", "Ljava/io/File;", "frameTimestamp", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface ScreenshotRecorderCallback {
    void onScreenshotRecorded(@NotNull Bitmap bitmap, boolean shouldRecycle);

    void onScreenshotRecorded(@NotNull File screenshot, long frameTimestamp);
}
