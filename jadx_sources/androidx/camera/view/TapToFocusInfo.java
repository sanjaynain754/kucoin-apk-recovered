package androidx.camera.view;

import android.graphics.PointF;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TapToFocusInfo.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/camera/view/TapToFocusInfo;", "", "focusState", "", "tapPoint", "Landroid/graphics/PointF;", "<init>", "(ILandroid/graphics/PointF;)V", "getFocusState", "()I", "getTapPoint", "()Landroid/graphics/PointF;", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class TapToFocusInfo {
    private final int focusState;

    @Nullable
    private final PointF tapPoint;

    public final int getFocusState() {
        return this.focusState;
    }

    @Nullable
    public final PointF getTapPoint() {
        return this.tapPoint;
    }

    public TapToFocusInfo(int i11, @Nullable PointF pointF) {
        this.focusState = i11;
        this.tapPoint = pointF;
    }
}
