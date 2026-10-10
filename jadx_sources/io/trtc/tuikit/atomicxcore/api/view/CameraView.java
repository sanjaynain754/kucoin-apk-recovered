package io.trtc.tuikit.atomicxcore.api.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/CameraView;", "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "surfaceView", "Landroid/view/SurfaceView;", "(Landroid/view/SurfaceView;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/SurfaceView;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class CameraView extends TUIVideoView {
    public CameraView(@Nullable Context context) {
        super(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(@NotNull SurfaceView surfaceView) {
        super(surfaceView);
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
    }

    public CameraView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraView(@Nullable Context context, @Nullable AttributeSet attributeSet, @Nullable SurfaceView surfaceView) {
        super(context, attributeSet, surfaceView);
    }
}
