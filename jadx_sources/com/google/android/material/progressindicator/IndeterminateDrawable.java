package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.C7090R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int i11;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            int i12 = 0;
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                this.staticDummyDrawable.setTint(this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i13 = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            boolean z11 = (baseProgressIndicatorSpec instanceof LinearProgressIndicatorSpec) || ((baseProgressIndicatorSpec instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateTrackVisible);
            boolean z12 = z11 && i13 == 0 && !baseProgressIndicatorSpec.hasWavyEffect(false);
            if (!z12) {
                if (z11) {
                    DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                    List<DrawingDelegate.ActiveIndicator> list = this.animatorDelegate.activeIndicators;
                    DrawingDelegate.ActiveIndicator activeIndicator2 = list.get(list.size() - 1);
                    DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                    if (drawingDelegate instanceof LinearDrawingDelegate) {
                        i11 = i13;
                        drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i11);
                        canvas2 = canvas;
                        this.drawingDelegate.fillTrack(canvas2, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i11);
                    } else {
                        canvas2 = canvas;
                        i11 = i13;
                        canvas.save();
                        canvas.rotate(activeIndicator2.rotationDegree);
                        this.drawingDelegate.fillTrack(canvas2, this.paint, activeIndicator2.endFraction, activeIndicator.startFraction + 1.0f, this.baseSpec.trackColor, alpha, i11);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i12 < this.animatorDelegate.activeIndicators.size()) {
                    DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i12);
                    activeIndicator3.phaseFraction = getPhaseFraction();
                    this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                    if (i12 <= 0 && !z12 && z11) {
                        this.drawingDelegate.fillTrack(canvas2, this.paint, this.animatorDelegate.activeIndicators.get(i12 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i11);
                    }
                    i12++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.drawingDelegate.fillTrack(canvas2, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            i11 = i13;
            while (i12 < this.animatorDelegate.activeIndicators.size()) {
                DrawingDelegate.ActiveIndicator activeIndicator4 = this.animatorDelegate.activeIndicators.get(i12);
                activeIndicator4.phaseFraction = getPhaseFraction();
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator4, getAlpha());
                if (i12 <= 0) {
                }
                i12++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull CircularDrawingDelegate circularDrawingDelegate) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, circularProgressIndicatorSpec.indeterminateAnimationType == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(context, circularProgressIndicatorSpec) : new CircularIndeterminateAdvanceAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), C7090R.drawable.ic_mtrl_arrow_circle, null));
        return indeterminateDrawable;
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull LinearDrawingDelegate linearDrawingDelegate) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec));
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    @NonNull
    public IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    @NonNull
    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    public void setAnimatorDelegate(@NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    public void setDrawingDelegate(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12, boolean z13) {
        return super.setVisible(z11, z12, z13);
    }

    public IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, m1553to = 255) int i11) {
        super.setAlpha(i11);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z11, boolean z12, boolean z13) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z11, z12, z13);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z11, z12);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (!z11 || !z13) {
            return visibleInternal;
        }
        this.animatorDelegate.startAnimator();
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }
}
