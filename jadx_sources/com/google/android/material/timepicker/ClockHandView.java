package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;

    @NonNull
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;

    @Px
    private final int selectorStrokeWidth;

    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, boolean z11);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, boolean z11);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    @Dimension
    private int getLeveledCircleRadius(int i11) {
        return i11 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11) {
        setHandRotation(f11, false);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialClockStyle);
    }

    private void initRotationAnimator() {
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.m13205a(this.f11936b, valueAnimator);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, boolean z11) {
        float f12 = f11 % 360.0f;
        this.originalDeg = f12;
        this.degRad = Math.toRadians(f12 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float fSin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i11 = this.selectorRadius;
        rectF.set(fCos - i11, fSin - i11, fCos + i11, fSin + i11);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f12, z11);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = 0.0d, m1552to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.animatingOnTouchUp = z11;
    }

    public void setCircleRadius(@Dimension int i11) {
        this.circleRadius = i11;
        invalidate();
    }

    public void setCurrentLevel(int i11) {
        this.currentLevel = i11;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, boolean z11) {
        this.rotationAnimator.cancel();
        if (!z11) {
            setHandRotationInternal(f11, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f11);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.start();
    }

    public void setMultiLevel(boolean z11) {
        if (this.isMultiLevel && !z11) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z11;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.ClockHandView, i11, C7090R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, C7090R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, C7090R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.selectorStrokeWidth = resources.getDimensionPixelSize(C7090R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = resources.getDimensionPixelSize(C7090R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(C7090R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        initRotationAnimator();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13205a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void adjustLevel(float f11, float f12) {
        int i11 = 2;
        if (MathUtils.dist(getWidth() / 2, getHeight() / 2, f11, f12) > getLeveledCircleRadius(2) + ViewUtils.dpToPx(getContext(), 12)) {
            i11 = 1;
        }
        this.currentLevel = i11;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float f11 = width;
        float f12 = leveledCircleRadius;
        float fCos = (((float) Math.cos(this.degRad)) * f12) + f11;
        float f13 = height;
        float fSin = (f12 * ((float) Math.sin(this.degRad))) + f13;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.selectorRadius, this.paint);
        double dSin = Math.sin(this.degRad);
        double dCos = Math.cos(this.degRad);
        double d11 = leveledCircleRadius - this.selectorRadius;
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f11, f13, width + ((int) (dCos * d11)), height + ((int) (d11 * dSin)), this.paint);
        canvas.drawCircle(f11, f13, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f11, float f12) {
        int degrees = (int) Math.toDegrees(Math.atan2(f12 - (getHeight() / 2), f11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            return degrees + 450;
        }
        return i11;
    }

    private Pair<Float, Float> getValuesForAnimation(float f11) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f11) > 180.0f) {
            if (handRotation > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (handRotation < 180.0f && f11 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f11));
    }

    private boolean handleTouchInput(float f11, float f12, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float degreesFromXY = getDegreesFromXY(f11, f12);
        boolean z15 = false;
        if (getHandRotation() != degreesFromXY) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z12 && z14) {
            return true;
        }
        if (!z14 && !z11) {
            return false;
        }
        if (z13 && this.animatingOnTouchUp) {
            z15 = true;
        }
        setHandRotation(degreesFromXY, z15);
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!this.rotationAnimator.isRunning()) {
            setHandRotation(getHandRotation());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        OnActionUpListener onActionUpListener;
        boolean z14;
        boolean z15;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z12 = false;
                z11 = false;
                z13 = false;
            } else {
                int i11 = (int) (x11 - this.downX);
                int i12 = (int) (y11 - this.downY);
                if ((i11 * i11) + (i12 * i12) > this.scaledTouchSlop) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.isInTapRegion = z14;
                z12 = this.changedDuringTouch;
                if (actionMasked == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (this.isMultiLevel) {
                    adjustLevel(x11, y11);
                }
                z13 = z15;
                z11 = false;
            }
        } else {
            this.downX = x11;
            this.downY = y11;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z11 = true;
            z12 = false;
            z13 = false;
        }
        boolean zHandleTouchInput = this.changedDuringTouch | handleTouchInput(x11, y11, z12, z11, z13);
        this.changedDuringTouch = zHandleTouchInput;
        if (zHandleTouchInput && z13 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x11, y11), this.isInTapRegion);
        }
        return true;
    }
}
