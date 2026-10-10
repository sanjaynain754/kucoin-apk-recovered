package com.kubi.resources.widget.button;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.ColorUtils;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.BaseAnimatedButton;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseAnimatedButton.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0010\u0010&\u001a\u00020'2\u0006\u0010%\u001a\u00020\u0007H$J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020\u0019H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/resources/widget/button/BaseAnimatedButton;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scaleAnimator", "Landroid/animation/ObjectAnimator;", "colorAnimator", "Landroid/animation/ValueAnimator;", "originalBackgroundColor", "getOriginalBackgroundColor", "()I", "setOriginalBackgroundColor", "(I)V", "isPressed", "", "animationEnabled", "buttonInterpolator", "Landroid/view/animation/PathInterpolator;", "setEnabled", "", "enabled", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setAnimationEnabled", "startPressAnimation", "startReleaseAnimation", "getCurrentBackgroundColor", "getBrighterColor", "originalColor", "updateBackgroundColor", "color", "createBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getCornerRadius", "", "onDetachedFromWindow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseAnimatedButton extends BaseTextView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public ObjectAnimator f44397b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ValueAnimator f44398c;

    /* JADX INFO: renamed from: d */
    public int f44399d;

    /* JADX INFO: renamed from: e */
    public boolean f44400e;

    /* JADX INFO: renamed from: f */
    public boolean f44401f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final PathInterpolator f44402g;

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract GradientDrawable mo55036d(int i11);

    /* JADX INFO: renamed from: f */
    public final void m55038f() {
        ObjectAnimator objectAnimator = this.f44397b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.f44398c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.995f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.995f));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.f44402g);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f44397b = objectAnimatorOfPropertyValuesHolder;
        int currentBackgroundColor = getCurrentBackgroundColor();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(currentBackgroundColor, m55037e(currentBackgroundColor));
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.setInterpolator(this.f44402g);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kw.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseAnimatedButton.m55034g(this.f92197b, valueAnimator2);
            }
        });
        valueAnimatorOfArgb.start();
        this.f44398c = valueAnimatorOfArgb;
    }

    /* JADX INFO: renamed from: h */
    public final void m55039h() {
        ObjectAnimator objectAnimator = this.f44397b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.f44398c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", getScaleX(), 1.0f), PropertyValuesHolder.ofFloat("scaleY", getScaleY(), 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.f44402g);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f44397b = objectAnimatorOfPropertyValuesHolder;
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(getCurrentBackgroundColor(), this.f44399d);
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.setInterpolator(this.f44402g);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kw.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseAnimatedButton.m55035i(this.f92196b, valueAnimator2);
            }
        });
        valueAnimatorOfArgb.start();
        this.f44398c = valueAnimatorOfArgb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAnimatedButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44401f = true;
        this.f44402g = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public static final void m55034g(BaseAnimatedButton baseAnimatedButton, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        baseAnimatedButton.m55040j(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: i */
    public static final void m55035i(BaseAnimatedButton baseAnimatedButton, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        baseAnimatedButton.m55040j(((Integer) animatedValue).intValue());
    }

    public float getCornerRadius() {
        return C5275i0.m6236a(28.0f);
    }

    /* JADX INFO: renamed from: getOriginalBackgroundColor, reason: from getter */
    public final int getF44399d() {
        return this.f44399d;
    }

    public final void setAnimationEnabled(boolean enabled) {
        this.f44401f = enabled;
    }

    public final void setOriginalBackgroundColor(int i11) {
        this.f44399d = i11;
    }

    private final int getCurrentBackgroundColor() {
        int[] iArr;
        Integer numFirstOrNull;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        if (background instanceof GradientDrawable) {
            try {
                Field declaredField = GradientDrawable.class.getDeclaredField("mSolidColors");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(background);
                if (obj instanceof int[]) {
                    iArr = (int[]) obj;
                } else {
                    iArr = null;
                }
                if (iArr != null && (numFirstOrNull = ArraysKt.firstOrNull(iArr)) != null) {
                    return numFirstOrNull.intValue();
                }
                return this.f44399d;
            } catch (Exception unused) {
                return this.f44399d;
            }
        }
        return this.f44399d;
    }

    /* JADX INFO: renamed from: e */
    public final int m55037e(int i11) {
        float f11;
        if (ColorUtils.calculateLuminance(i11) < 0.5d) {
            f11 = 0.08f;
        } else {
            f11 = 0.12f;
        }
        return ColorUtils.blendARGB(i11, -1, f11);
    }

    /* JADX INFO: renamed from: j */
    public void m55040j(int i11) {
        setBackground(mo55036d(i11));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f44397b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.f44398c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf;
        if (isEnabled() && this.f44401f) {
            if (event != null) {
                numValueOf = Integer.valueOf(event.getAction());
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.f44400e = true;
                m55038f();
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                if (this.f44400e) {
                    this.f44400e = false;
                    m55039h();
                }
            } else if (numValueOf != null && numValueOf.intValue() == 3 && this.f44400e) {
                this.f44400e = false;
                m55039h();
            }
            return super.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        float f11;
        super.setEnabled(enabled);
        if (enabled) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        setAlpha(f11);
        this.f44401f = enabled;
    }
}
