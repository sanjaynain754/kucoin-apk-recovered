package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public final class ScreenFlashView extends View {
    private static final long ANIMATION_DURATION_MILLIS = 1000;
    private static final String TAG = "ScreenFlashView";
    private CameraController mCameraController;
    private ImageCapture.ScreenFlash mScreenFlash;
    private Window mScreenFlashWindow;

    @UiThread
    public ScreenFlashView(Context context) {
        this(context, null);
    }

    @UiThread
    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator animateToFullOpacity(final Runnable runnable) {
        Logger.m1866d(TAG, "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScreenFlashView.m2245a(this.f2177b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.camera.view.ScreenFlashView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Logger.m1866d(ScreenFlashView.TAG, "ScreenFlash#apply: onAnimationEnd");
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.mScreenFlashWindow;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        Logger.m1868e(TAG, "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f11) {
        if (this.mScreenFlashWindow == null) {
            Logger.m1868e(TAG, "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f11)) {
            Logger.m1868e(TAG, "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.mScreenFlashWindow.getAttributes();
        attributes.screenBrightness = f11;
        this.mScreenFlashWindow.setAttributes(attributes);
        Logger.m1866d(TAG, "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.mCameraController;
        if (cameraController == null) {
            Logger.m1866d(TAG, "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new ScreenFlashUiInfo(ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW, screenFlash));
        }
    }

    private void updateScreenFlash(Window window) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateScreenFlash: is new window null = ");
        sb2.append(window == null);
        sb2.append(",  is new window same as previous = ");
        sb2.append(window == this.mScreenFlashWindow);
        Logger.m1866d(TAG, sb2.toString());
        if (this.mScreenFlashWindow != window) {
            this.mScreenFlash = window == null ? null : new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.ScreenFlashView.1
                private ValueAnimator mAnimator;
                private float mPreviousBrightness;

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void apply(long j11, final ImageCapture.ScreenFlashListener screenFlashListener) {
                    Logger.m1866d(ScreenFlashView.TAG, "ScreenFlash#apply");
                    this.mPreviousBrightness = ScreenFlashView.this.getBrightness();
                    ScreenFlashView.this.setBrightness(1.0f);
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ScreenFlashView screenFlashView = ScreenFlashView.this;
                    Objects.requireNonNull(screenFlashListener);
                    this.mAnimator = screenFlashView.animateToFullOpacity(new Runnable() { // from class: androidx.camera.view.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            screenFlashListener.onCompleted();
                        }
                    });
                }

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void clear() {
                    Logger.m1866d(ScreenFlashView.TAG, "ScreenFlash#clear");
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.mAnimator = null;
                    }
                    ScreenFlashView.this.setAlpha(0.0f);
                    ScreenFlashView.this.setBrightness(this.mPreviousBrightness);
                }
            };
        }
    }

    @UiThread
    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    @UiThread
    public ScreenFlashView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2245a(ScreenFlashView screenFlashView, ValueAnimator valueAnimator) {
        screenFlashView.getClass();
        Logger.m1866d(TAG, "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        screenFlashView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @UiThread
    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.mCameraController;
        if (cameraController2 != null && cameraController2 != cameraController) {
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = cameraController;
        if (cameraController == null) {
            return;
        }
        if (cameraController.getImageCaptureFlashMode() == 3 && this.mScreenFlashWindow == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        updateScreenFlash(window);
        this.mScreenFlashWindow = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public ScreenFlashView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
