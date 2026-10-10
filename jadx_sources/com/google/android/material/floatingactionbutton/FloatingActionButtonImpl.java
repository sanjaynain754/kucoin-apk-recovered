package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes45.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE = 0.0f;
    private static final float SPEC_HIDE_SCALE = 0.0f;

    @Nullable
    BorderDrawable borderDrawable;

    @Nullable
    Drawable contentBackground;

    @Nullable
    private Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;

    @Nullable
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private int maxImageSize;
    int minTouchTargetSize;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;

    @Nullable
    Drawable rippleDrawable;
    final ShadowViewDelegate shadowViewDelegate;

    @Nullable
    ShapeAppearanceModel shapeAppearance;

    @Nullable
    MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;

    @Nullable
    private MotionSpec showMotionSpec;

    @Nullable
    private StateListAnimator stateListAnimator;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    final FloatingActionButton view;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    private static final int SHOW_ANIM_DURATION_ATTR = C7090R.attr.motionDurationLong2;
    private static final int SHOW_ANIM_EASING_ATTR = C7090R.attr.motionEasingEmphasizedInterpolator;
    private static final int HIDE_ANIM_DURATION_ATTR = C7090R.attr.motionDurationMedium1;
    private static final int HIDE_ANIM_EASING_ATTR = C7090R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] PRESSED_ENABLED_STATE_SET = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];
    boolean shadowPaddingEnabled = true;
    private float imageMatrixScale = 1.0f;
    private int animState = 0;
    private final Rect tmpRect = new Rect();
    private final RectF tmpRectF1 = new RectF();
    private final RectF tmpRectF2 = new RectF();
    private final Matrix tmpMatrix = new Matrix();

    public interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    public interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }

        public AlwaysStatefulMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }
    }

    @NonNull
    private AnimatorSet createAnimator(@NonNull MotionSpec motionSpec, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.ALPHA, f11);
        motionSpec.getTiming(ViewProps.OPACITY).apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_X, f12);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat2);
        workAroundOreoBug(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_Y, f12);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat3);
        workAroundOreoBug(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        calculateImageMatrixFromScale(f13, this.tmpMatrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.view, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f14, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.imageMatrixScale = f14;
                return super.evaluate(f14, matrix, matrix2);
            }
        }, new Matrix(this.tmpMatrix));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet createDefaultAnimator(final float f11, final float f12, final float f13, int i11, int i12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.view.getAlpha();
        final float scaleX = this.view.getScaleX();
        final float scaleY = this.view.getScaleY();
        final float f14 = this.imageMatrixScale;
        final Matrix matrix = new Matrix(this.tmpMatrix);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FloatingActionButtonImpl.m13124a(this.f11841b, alpha, f11, scaleX, f12, scaleY, f14, f13, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.view.getContext(), i11, this.view.getContext().getResources().getInteger(C7090R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.view.getContext(), i12, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    @NonNull
    private StateListAnimator createDefaultStateListAnimator(float f11, float f12, float f13) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(f11, f13));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f11, f12));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f11, f12));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(f11, f12));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.view, "elevation", f11).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.view;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        stateListAnimator.addState(ENABLED_STATE_SET, animatorSet);
        stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(0.0f, 0.0f));
        return stateListAnimator;
    }

    @NonNull
    private Animator createElevationAnimator(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.view, "elevation", f11).setDuration(0L)).with(ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        return animatorSet;
    }

    private boolean shouldAnimateVisibilityChange() {
        return this.view.isLaidOut() && !this.view.isInEditMode();
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            final FloatEvaluator floatEvaluator = new FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public Float evaluate(float f11, Float f12, Float f13) {
                float fFloatValue = this.floatEvaluator.evaluate(f11, (Number) f12, (Number) f13).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            }
        });
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.hideListeners == null) {
            this.hideListeners = new ArrayList<>();
        }
        this.hideListeners.add(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.showListeners == null) {
            this.showListeners = new ArrayList<>();
        }
        this.showListeners.add(animatorListener);
    }

    public void addTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        if (this.transformationCallbacks == null) {
            this.transformationCallbacks = new ArrayList<>();
        }
        this.transformationCallbacks.add(internalTransformationCallback);
    }

    @NonNull
    public BorderDrawable createBorderDrawable(int i11, ColorStateList colorStateList) {
        Context context = this.view.getContext();
        BorderDrawable borderDrawable = new BorderDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.shapeAppearance));
        borderDrawable.setGradientColors(ContextCompat.getColor(context, C7090R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, C7090R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, C7090R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, C7090R.color.design_fab_stroke_end_outer_color));
        borderDrawable.setBorderWidth(i11);
        borderDrawable.setBorderTint(colorStateList);
        return borderDrawable;
    }

    public MaterialShapeDrawable createShapeDrawable() {
        return new AlwaysStatefulMaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.shapeAppearance));
    }

    @Nullable
    public final Drawable getContentBackground() {
        return this.contentBackground;
    }

    public float getElevation() {
        return this.view.getElevation();
    }

    public boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    @Nullable
    public final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    public void getPadding(@NonNull Rect rect) {
        if (this.shadowViewDelegate.isCompatPaddingEnabled()) {
            int touchTargetPadding = getTouchTargetPadding();
            float elevation = this.shadowPaddingEnabled ? getElevation() + this.pressedTranslationZ : 0.0f;
            int iMax = Math.max(touchTargetPadding, (int) Math.ceil(elevation));
            int iMax2 = Math.max(touchTargetPadding, (int) Math.ceil(elevation * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!ignoreExpandBoundsForA11y()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.minTouchTargetSize - this.view.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    public float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    @Nullable
    public final ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    @Nullable
    public final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public int getTouchTargetPadding() {
        if (this.ensureMinTouchTargetSize) {
            return Math.max((this.minTouchTargetSize - this.view.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public final boolean ignoreExpandBoundsForA11y() {
        return this.ensureMinTouchTargetSize && this.view.getSizeDimension() < this.minTouchTargetSize;
    }

    public boolean isOrWillBeHidden() {
        if (this.view.getVisibility() == 0) {
            return this.animState == 1;
        }
        return this.animState != 2;
    }

    public boolean isOrWillBeShown() {
        if (this.view.getVisibility() != 0) {
            return this.animState == 2;
        }
        return this.animState != 1;
    }

    public void onAttachedToWindow() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.view, materialShapeDrawable);
        }
    }

    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.preDrawListener = null;
        }
    }

    public void onDrawableStateChangedForLollipop() {
        if (!this.view.isEnabled()) {
            this.view.setElevation(0.0f);
            this.view.setTranslationZ(0.0f);
            return;
        }
        this.view.setElevation(this.elevation);
        if (this.view.isPressed()) {
            this.view.setTranslationZ(this.pressedTranslationZ);
        } else if (this.view.isFocused() || this.view.isHovered()) {
            this.view.setTranslationZ(this.hoveredFocusedTranslationZ);
        } else {
            this.view.setTranslationZ(0.0f);
        }
    }

    public void onElevationsChanged(float f11, float f12, float f13) {
        if (this.view.getStateListAnimator() == this.stateListAnimator) {
            StateListAnimator stateListAnimatorCreateDefaultStateListAnimator = createDefaultStateListAnimator(f11, f12, f13);
            this.stateListAnimator = stateListAnimatorCreateDefaultStateListAnimator;
            this.view.setStateListAnimator(stateListAnimatorCreateDefaultStateListAnimator);
        }
        if (shouldAddPadding()) {
            updatePadding();
        }
    }

    public void onPaddingUpdated(@NonNull Rect rect) {
        Preconditions.checkNotNull(this.contentBackground, "Didn't initialize content background");
        if (!shouldAddPadding()) {
            this.shadowViewDelegate.setBackgroundDrawable(this.contentBackground);
        } else {
            this.shadowViewDelegate.setBackgroundDrawable(new InsetDrawable(this.contentBackground, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void onScaleChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged();
            }
        }
    }

    public void onTranslationChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTranslationChanged();
            }
        }
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setBorderTint(colorStateList);
        }
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    public final void setElevation(float f11) {
        if (this.elevation != f11) {
            this.elevation = f11;
            onElevationsChanged(f11, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.ensureMinTouchTargetSize = z11;
    }

    public final void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public final void setHoveredFocusedTranslationZ(float f11) {
        if (this.hoveredFocusedTranslationZ != f11) {
            this.hoveredFocusedTranslationZ = f11;
            onElevationsChanged(this.elevation, f11, this.pressedTranslationZ);
        }
    }

    public final void setImageMatrixScale(float f11) {
        this.imageMatrixScale = f11;
        Matrix matrix = this.tmpMatrix;
        calculateImageMatrixFromScale(f11, matrix);
        this.view.setImageMatrix(matrix);
    }

    public final void setMaxImageSize(int i11) {
        if (this.maxImageSize != i11) {
            this.maxImageSize = i11;
            updateImageMatrixScale();
        }
    }

    public void setMinTouchTargetSize(int i11) {
        this.minTouchTargetSize = i11;
    }

    public final void setPressedTranslationZ(float f11) {
        if (this.pressedTranslationZ != f11) {
            this.pressedTranslationZ = f11;
            onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, f11);
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.rippleDrawable;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    public void setShadowPaddingEnabled(boolean z11) {
        this.shadowPaddingEnabled = z11;
        updatePadding();
    }

    public final void setShapeAppearance(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearance = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.rippleDrawable;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public boolean shouldAddPadding() {
        return this.shadowViewDelegate.isCompatPaddingEnabled() || ignoreExpandBoundsForA11y();
    }

    public final void updateImageMatrixScale() {
        setImageMatrixScale(this.imageMatrixScale);
    }

    public final void updatePadding() {
        Rect rect = this.tmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void updateShapeElevation(float f11) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f11);
        }
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.view = floatingActionButton;
        this.shadowViewDelegate = shadowViewDelegate;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13124a(FloatingActionButtonImpl floatingActionButtonImpl, float f11, float f12, float f13, float f14, float f15, float f16, float f17, Matrix matrix, ValueAnimator valueAnimator) {
        floatingActionButtonImpl.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        floatingActionButtonImpl.view.setAlpha(AnimationUtils.lerp(f11, f12, 0.0f, 0.2f, fFloatValue));
        floatingActionButtonImpl.view.setScaleX(AnimationUtils.lerp(f13, f14, fFloatValue));
        floatingActionButtonImpl.view.setScaleY(AnimationUtils.lerp(f15, f14, fFloatValue));
        floatingActionButtonImpl.imageMatrixScale = AnimationUtils.lerp(f16, f17, fFloatValue);
        floatingActionButtonImpl.calculateImageMatrixFromScale(AnimationUtils.lerp(f16, f17, fFloatValue), matrix);
        floatingActionButtonImpl.view.setImageMatrix(matrix);
    }

    private void calculateImageMatrixFromScale(float f11, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.view.getDrawable();
        if (drawable != null && this.maxImageSize != 0) {
            RectF rectF = this.tmpRectF1;
            RectF rectF2 = this.tmpRectF2;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i11 = this.maxImageSize;
            rectF2.set(0.0f, 0.0f, i11, i11);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i12 = this.maxImageSize;
            matrix.postScale(f11, f11, i12 / 2.0f, i12 / 2.0f);
        }
    }

    public void hide(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z11) {
        int i11;
        FloatingActionButtonImpl floatingActionButtonImpl;
        AnimatorSet animatorSetCreateDefaultAnimator;
        if (!isOrWillBeHidden()) {
            Animator animator = this.currentAnimator;
            if (animator != null) {
                animator.cancel();
            }
            if (shouldAnimateVisibilityChange()) {
                MotionSpec motionSpec = this.hideMotionSpec;
                if (motionSpec != null) {
                    animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 0.0f, 0.0f, 0.0f);
                    floatingActionButtonImpl = this;
                } else {
                    floatingActionButtonImpl = this;
                    animatorSetCreateDefaultAnimator = floatingActionButtonImpl.createDefaultAnimator(0.0f, 0.4f, 0.4f, HIDE_ANIM_DURATION_ATTR, HIDE_ANIM_EASING_ATTR);
                }
                animatorSetCreateDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
                    private boolean cancelled;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                        this.cancelled = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        FloatingActionButtonImpl.this.animState = 0;
                        FloatingActionButtonImpl.this.currentAnimator = null;
                        if (this.cancelled) {
                            return;
                        }
                        FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.view;
                        boolean z12 = z11;
                        floatingActionButton.internalSetVisibility(z12 ? 8 : 4, z12);
                        InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                        if (internalVisibilityChangedListener2 != null) {
                            internalVisibilityChangedListener2.onHidden();
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                        FloatingActionButtonImpl.this.view.internalSetVisibility(0, z11);
                        FloatingActionButtonImpl.this.animState = 1;
                        FloatingActionButtonImpl.this.currentAnimator = animator2;
                        this.cancelled = false;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = floatingActionButtonImpl.hideListeners;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetCreateDefaultAnimator.addListener(it.next());
                    }
                }
                animatorSetCreateDefaultAnimator.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.view;
            if (z11) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            floatingActionButton.internalSetVisibility(i11, z11);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onHidden();
            }
        }
    }

    public void initializeBackgroundDrawable(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableCreateShapeDrawable = createShapeDrawable();
        this.shapeDrawable = materialShapeDrawableCreateShapeDrawable;
        materialShapeDrawableCreateShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        if (i11 > 0) {
            this.borderDrawable = createBorderDrawable(i11, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.borderDrawable), (Drawable) Preconditions.checkNotNull(this.shapeDrawable)});
        } else {
            this.borderDrawable = null;
            layerDrawable = this.shapeDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), layerDrawable, null);
        this.rippleDrawable = rippleDrawable;
        this.contentBackground = rippleDrawable;
    }

    public void onCompatShadowChanged() {
        updatePadding();
    }

    public void show(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z11) {
        boolean z12;
        AnimatorSet animatorSetCreateDefaultAnimator;
        FloatingActionButtonImpl floatingActionButtonImpl;
        float f11;
        float f12;
        if (!isOrWillBeShown()) {
            Animator animator = this.currentAnimator;
            if (animator != null) {
                animator.cancel();
            }
            if (this.showMotionSpec == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (shouldAnimateVisibilityChange()) {
                if (this.view.getVisibility() != 0) {
                    float f13 = 0.0f;
                    this.view.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.view;
                    if (z12) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f11);
                    FloatingActionButton floatingActionButton2 = this.view;
                    if (z12) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.0f;
                    }
                    floatingActionButton2.setScaleX(f12);
                    if (z12) {
                        f13 = 0.4f;
                    }
                    setImageMatrixScale(f13);
                }
                MotionSpec motionSpec = this.showMotionSpec;
                if (motionSpec != null) {
                    animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 1.0f, 1.0f, 1.0f);
                    floatingActionButtonImpl = this;
                } else {
                    animatorSetCreateDefaultAnimator = createDefaultAnimator(1.0f, 1.0f, 1.0f, SHOW_ANIM_DURATION_ATTR, SHOW_ANIM_EASING_ATTR);
                    floatingActionButtonImpl = this;
                }
                animatorSetCreateDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        FloatingActionButtonImpl.this.animState = 0;
                        FloatingActionButtonImpl.this.currentAnimator = null;
                        InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                        if (internalVisibilityChangedListener2 != null) {
                            internalVisibilityChangedListener2.onShown();
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                        FloatingActionButtonImpl.this.view.internalSetVisibility(0, z11);
                        FloatingActionButtonImpl.this.animState = 2;
                        FloatingActionButtonImpl.this.currentAnimator = animator2;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = floatingActionButtonImpl.showListeners;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetCreateDefaultAnimator.addListener(it.next());
                    }
                }
                animatorSetCreateDefaultAnimator.start();
                return;
            }
            this.view.internalSetVisibility(0, z11);
            this.view.setAlpha(1.0f);
            this.view.setScaleY(1.0f);
            this.view.setScaleX(1.0f);
            setImageMatrixScale(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onShown();
            }
        }
    }
}
