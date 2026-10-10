package com.kubi.resources.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseSwitchButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004*\u0001\u001d\b&\u0018\u0000 >2\u00020\u0001:\u0001>B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH$J\b\u0010!\u001a\u00020\tH$J\b\u0010\"\u001a\u00020\tH$J\b\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020$H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020$H\u0014J\u0018\u0010,\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\tH\u0004J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020.H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020$H\u0002J\u0018\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\u0010\u0010=\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u00020\u00188DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006?"}, m90084d2 = {"Lcom/kubi/resources/widget/BaseSwitchButton;", "Landroidx/appcompat/widget/SwitchCompat;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "trackOnColor", "", "getTrackOnColor", "()I", "trackOnColor$delegate", "Lkotlin/Lazy;", "trackOffColor", "getTrackOffColor", "trackOffColor$delegate", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "thumbSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "backgroundAlphaAnimator", "Landroid/animation/ValueAnimator;", "isInitialized", "", "()Z", "setInitialized", "(Z)V", "thumbPosProperty", "com/kubi/resources/widget/BaseSwitchButton$thumbPosProperty$1", "Lcom/kubi/resources/widget/BaseSwitchButton$thumbPosProperty$1;", "getShowTrackOnColor", "getSwitchWidth", "getTrackResource", "getThumbResource", "onAttachedToWindow", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "toggle", "setChecked", "checked", "onDetachedFromWindow", "animateSwitch", "from", "", "playThumbSpring", TypedValues.TransitionType.S_TO, "animateTrackTint", "applyTrackTint", "color", "cancelAllAnimations", "getThumbPositionCompat", "setThumbPositionCompat", "pos", "cancelDefaultPositionAnimator", "toDampingRatio", "tension", "", "friction", "toStiffness", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseSwitchButton extends SwitchCompat {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double SPRING_DAMPING = 23.67d;

    @Deprecated
    public static final double SPRING_STIFFNESS = 321.47d;

    @Deprecated
    public static final long TRACK_ANIMATION_DURATION = 300;

    @NotNull
    private final ArgbEvaluator argbEvaluator;

    @Nullable
    private ValueAnimator backgroundAlphaAnimator;
    private boolean isInitialized;

    @NotNull
    private final C22914b thumbPosProperty;

    @Nullable
    private SpringAnimation thumbSpringAnimation;

    /* JADX INFO: renamed from: trackOffColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackOffColor;

    /* JADX INFO: renamed from: trackOnColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackOnColor;

    /* JADX INFO: compiled from: BaseSwitchButton.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/resources/widget/BaseSwitchButton$Companion;", "", "<init>", "()V", "SPRING_STIFFNESS", "", "SPRING_DAMPING", "TRACK_ANIMATION_DURATION", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.BaseSwitchButton$a */
    /* JADX INFO: compiled from: BaseSwitchButton.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/resources/widget/BaseSwitchButton$animateTrackTint$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationCancel", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22913a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f43716b;

        public C22913a(int i11) {
            this.f43716b = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            BaseSwitchButton.this.applyTrackTint(this.f43716b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            BaseSwitchButton.this.applyTrackTint(this.f43716b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.BaseSwitchButton$b */
    /* JADX INFO: compiled from: BaseSwitchButton.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/BaseSwitchButton$thumbPosProperty$1", "Landroidx/dynamicanimation/animation/FloatPropertyCompat;", "Lcom/kubi/resources/widget/BaseSwitchButton;", "getValue", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setValue", "", "value", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22914b extends FloatPropertyCompat<BaseSwitchButton> {
        public C22914b() {
            super("thumbPos");
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(BaseSwitchButton view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getThumbPositionCompat();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(BaseSwitchButton view, float f11) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setThumbPositionCompat(f11);
            view.invalidate();
        }
    }

    public /* synthetic */ BaseSwitchButton(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public abstract int getSwitchWidth();

    public abstract int getThumbResource();

    public abstract int getTrackResource();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSwitchButton(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.trackOnColor = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BaseSwitchButton.trackOnColor_delegate$lambda$0(context));
            }
        });
        this.trackOffColor = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BaseSwitchButton.trackOffColor_delegate$lambda$1(context));
            }
        });
        this.argbEvaluator = new ArgbEvaluator();
        this.thumbPosProperty = new C22914b();
        setBackground(null);
        setTrackResource(getTrackResource());
        setThumbResource(getThumbResource());
        this.isInitialized = true;
    }

    private final void animateSwitch(boolean checked, float from) {
        playThumbSpring(from, checked ? 1.0f : 0.0f);
        animateTrackTint(checked);
    }

    private final void animateTrackTint(boolean checked) {
        ValueAnimator valueAnimator = this.backgroundAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int trackOffColor = checked ? getTrackOffColor() : getShowTrackOnColor();
        final int showTrackOnColor = checked ? getShowTrackOnColor() : getTrackOffColor();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseSwitchButton.animateTrackTint$lambda$7$lambda$6(this.f44843b, trackOffColor, showTrackOnColor, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new C22913a(showTrackOnColor));
        valueAnimatorOfFloat.start();
        this.backgroundAlphaAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTrackTint$lambda$7$lambda$6(BaseSwitchButton baseSwitchButton, int i11, int i12, ValueAnimator va2) {
        Intrinsics.checkNotNullParameter(va2, "va");
        Object animatedValue = va2.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        Object objEvaluate = baseSwitchButton.argbEvaluator.evaluate(((Float) animatedValue).floatValue(), Integer.valueOf(i11), Integer.valueOf(i12));
        Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        baseSwitchButton.applyTrackTint(((Integer) objEvaluate).intValue());
    }

    private final void cancelDefaultPositionAnimator() {
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mPositionAnimator");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            ObjectAnimator objectAnimator = obj instanceof ObjectAnimator ? (ObjectAnimator) obj : null;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getThumbPositionCompat() {
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mThumbPosition");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return ((Float) obj).floatValue();
        } catch (Throwable unused) {
            return isChecked() ? 1.0f : 0.0f;
        }
    }

    private final int getTrackOnColor() {
        return ((Number) this.trackOnColor.getValue()).intValue();
    }

    private final void playThumbSpring(float from, final float to2) {
        SpringAnimation springAnimation = this.thumbSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        if (Math.abs(to2 - from) < 1.0E-4d) {
            setThumbPositionCompat(to2);
            invalidate();
            return;
        }
        SpringForce springForce = new SpringForce(to2);
        springForce.setStiffness(toStiffness(321.47d));
        springForce.setDampingRatio(toDampingRatio(321.47d, 23.67d));
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.thumbPosProperty);
        springAnimation2.setStartValue(from);
        springAnimation2.setMinimumVisibleChange(0.001f);
        springAnimation2.setSpring(springForce);
        springAnimation2.start();
        this.thumbSpringAnimation = springAnimation2;
        postDelayed(new Runnable() { // from class: com.kubi.resources.widget.j
            @Override // java.lang.Runnable
            public final void run() {
                BaseSwitchButton.playThumbSpring$lambda$5(this.f44915b, to2);
            }
        }, 320L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playThumbSpring$lambda$5(BaseSwitchButton baseSwitchButton, float f11) {
        SpringAnimation springAnimation = baseSwitchButton.thumbSpringAnimation;
        if (springAnimation == null || !springAnimation.isRunning()) {
            return;
        }
        springAnimation.cancel();
        baseSwitchButton.setThumbPositionCompat(f11);
        baseSwitchButton.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setThumbPositionCompat(float pos) {
        try {
            try {
                Method declaredMethod = SwitchCompat.class.getDeclaredMethod("setThumbPosition", Float.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, Float.valueOf(pos));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            Field declaredField = SwitchCompat.class.getDeclaredField("mThumbPosition");
            declaredField.setAccessible(true);
            declaredField.setFloat(this, pos);
        }
    }

    private final float toStiffness(double tension) {
        return (float) Math.min(Math.max(tension, 50.0d), 20000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trackOffColor_delegate$lambda$1(Context context) {
        return ContextCompat.getColor(context, R$color.c_icon40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int trackOnColor_delegate$lambda$0(Context context) {
        return ContextCompat.getColor(context, R$color.c_text);
    }

    public final int getTrackOffColor() {
        return ((Number) this.trackOffColor.getValue()).intValue();
    }

    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    public final void setInitialized(boolean z11) {
        this.isInitialized = z11;
    }

    private final void cancelAllAnimations() {
        cancelDefaultPositionAnimator();
        SpringAnimation springAnimation = this.thumbSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        ValueAnimator valueAnimator = this.backgroundAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void applyTrackTint(int color) {
        try {
            setTrackTintList(ColorStateList.valueOf(color));
            setTrackTintMode(PorterDuff.Mode.SRC_IN);
            invalidate();
        } catch (Exception unused) {
        }
    }

    public int getShowTrackOnColor() {
        return getTrackOnColor();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int trackOffColor;
        super.onAttachedToWindow();
        if (getIsInitialized()) {
            if (isChecked()) {
                trackOffColor = getShowTrackOnColor();
            } else {
                trackOffColor = getTrackOffColor();
            }
            applyTrackTint(trackOffColor);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        cancelAllAnimations();
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mSwitchWidth");
            declaredField.setAccessible(true);
            declaredField.setInt(this, C27029c.m66601d(this, getSwitchWidth()));
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        float f11;
        if (isChecked() != checked) {
            cancelAllAnimations();
            float thumbPositionCompat = getThumbPositionCompat();
            super.setChecked(checked);
            cancelDefaultPositionAnimator();
            if (getIsInitialized() && isAttachedToWindow()) {
                animateSwitch(checked, thumbPositionCompat);
                return;
            }
            if (checked) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            setThumbPositionCompat(f11);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    private final float toDampingRatio(double tension, double friction) {
        return (float) Math.min(Math.max(Math.max(0.0d, friction) / (Math.sqrt(Math.max(0.001d, tension)) * 2.0d), 0.05d), 1.5d);
    }
}
