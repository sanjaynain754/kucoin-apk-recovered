package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
abstract class PreviewViewImplementation {
    FrameLayout mParent;
    private final PreviewTransformation mPreviewTransform;
    Size mResolution;
    private boolean mWasSurfaceProvided = false;

    public interface OnSurfaceNotInUseListener {
        void onSurfaceNotInUse();
    }

    public abstract View getPreview();

    public abstract Bitmap getPreviewBitmap();

    public abstract void initializePreview();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public void onSurfaceProvided() {
        this.mWasSurfaceProvided = true;
        redrawPreview();
    }

    public abstract void onSurfaceRequested(SurfaceRequest surfaceRequest, OnSurfaceNotInUseListener onSurfaceNotInUseListener);

    public abstract ListenableFuture<Void> waitForNextFrame();

    public PreviewViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        this.mParent = frameLayout;
        this.mPreviewTransform = previewTransformation;
    }

    public Bitmap getBitmap() {
        Bitmap previewBitmap = getPreviewBitmap();
        if (previewBitmap == null) {
            return null;
        }
        return this.mPreviewTransform.createTransformedBitmap(previewBitmap, new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection());
    }

    public void redrawPreview() {
        View preview = getPreview();
        if (preview != null && this.mWasSurfaceProvided) {
            this.mPreviewTransform.transformView(new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection(), preview);
        }
    }

    public void setFrameUpdateListener(Executor executor, PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
    }
}
