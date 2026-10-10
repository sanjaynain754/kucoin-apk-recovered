package androidx.media3.p022ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    @Nullable
    private AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f11, float f12, boolean z11);
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            if (AspectRatioFrameLayout.this.aspectRatioListener == null) {
                return;
            }
            AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
        }

        public void scheduleUpdate(float f11, float f12, boolean z11) {
            this.targetAspectRatio = f11;
            this.naturalAspectRatio = f12;
            this.aspectRatioMismatch = z11;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3627R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public void setAspectRatio(float f11) {
        if (this.videoAspectRatio != f11) {
            this.videoAspectRatio = f11;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public void setResizeMode(int i11) {
        if (this.resizeMode != i11) {
            this.resizeMode = i11;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.videoAspectRatio <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.videoAspectRatio / f15) - 1.0f;
        if (Math.abs(f16) <= MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f15, false);
            return;
        }
        int i13 = this.resizeMode;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 4) {
                        if (f16 > 0.0f) {
                            f11 = this.videoAspectRatio;
                        } else {
                            f12 = this.videoAspectRatio;
                        }
                    }
                } else {
                    f11 = this.videoAspectRatio;
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.videoAspectRatio;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > 0.0f) {
            f12 = this.videoAspectRatio;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.videoAspectRatio;
            measuredWidth = (int) (f14 * f11);
        }
        this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
