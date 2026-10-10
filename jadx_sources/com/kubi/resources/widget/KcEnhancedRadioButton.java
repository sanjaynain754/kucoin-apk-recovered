package com.kubi.resources.widget;

import android.R;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcEnhancedRadioButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "请使用KuRadioButton")
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\"H\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u00100\u001a\u00020%H\u0002J\b\u00101\u001a\u00020%H\u0002J\u0010\u00102\u001a\u00020%2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020%H\u0002J\b\u00104\u001a\u00020%H\u0014J\u000e\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\u0007J\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\fJ\u000e\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\fJ\u0006\u0010;\u001a\u00020%J\u0006\u0010<\u001a\u00020%J\u0006\u0010=\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020\fJ\u0006\u0010?\u001a\u00020\fR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/resources/widget/KcEnhancedRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "radioStyleType", "animationEnabled", "", "useOriginalDrawable", "bezierInterpolator", "Landroid/view/animation/PathInterpolator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "getArgbEvaluator", "innerCircleScale", "", "borderProgress", "isAnimating", "borderAnimator", "Landroid/animation/ValueAnimator;", "innerCircleSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "innerCircleAlphaAnimator", "borderPaint", "Landroid/graphics/Paint;", "innerCirclePaint", "checkedColor", "uncheckedColor", "innerCircleScaleProperty", "Landroidx/dynamicanimation/animation/FloatPropertyCompat;", "getInnerCircleScaleProperty", "parseAttributes", "", "setupOriginalDrawable", "updatePaintForStyle", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawCustomRadioButton", "drawAnimationOverlay", "setChecked", "checked", "animateToState", "animateToChecked", "animateToUnchecked", "updateStateWithoutAnimation", "cancelAllAnimations", "onDetachedFromWindow", "setRadioStyle", TtmlNode.TAG_STYLE, "setAnimationEnabled", "enabled", "setUseOriginalDrawable", "use", "setStyle20dp", "setStyle24dp", "getRadioStyle", "isAnimationEnabled", "isUsingOriginalDrawable", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcEnhancedRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f43851r = new Companion(null);

    /* JADX INFO: renamed from: b */
    public int f43852b;

    /* JADX INFO: renamed from: c */
    public boolean f43853c;

    /* JADX INFO: renamed from: d */
    public boolean f43854d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final PathInterpolator f43855e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ArgbEvaluator f43856f;

    /* JADX INFO: renamed from: g */
    public float f43857g;

    /* JADX INFO: renamed from: h */
    public float f43858h;

    /* JADX INFO: renamed from: i */
    public boolean f43859i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ValueAnimator f43860j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public SpringAnimation f43861k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ValueAnimator f43862l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Paint f43863m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Paint f43864n;

    /* JADX INFO: renamed from: o */
    public final int f43865o;

    /* JADX INFO: renamed from: p */
    public final int f43866p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public FloatPropertyCompat<KcEnhancedRadioButton> f43867q;

    /* JADX INFO: compiled from: KcEnhancedRadioButton.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/KcEnhancedRadioButton$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "SPRING_DAMPING_RATIO", "", "SPRING_STIFFNESS", "STYLE_20DP", "", "STYLE_24DP", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcEnhancedRadioButton$a */
    /* JADX INFO: compiled from: KcEnhancedRadioButton.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/KcEnhancedRadioButton$animateToUnchecked$2$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22921a implements Animator.AnimatorListener {
        public C22921a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            KcEnhancedRadioButton.this.f43857g = 0.0f;
            KcEnhancedRadioButton.this.f43859i = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcEnhancedRadioButton$b */
    /* JADX INFO: compiled from: KcEnhancedRadioButton.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/KcEnhancedRadioButton$getInnerCircleScaleProperty$1", "Landroidx/dynamicanimation/animation/FloatPropertyCompat;", "Lcom/kubi/resources/widget/KcEnhancedRadioButton;", "getValue", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setValue", "", "value", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22922b extends FloatPropertyCompat<KcEnhancedRadioButton> {
        public C22922b() {
            super("innerCircleScale");
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(KcEnhancedRadioButton view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.f43857g;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(KcEnhancedRadioButton view, float f11) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.f43857g = f11;
            view.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedRadioButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: k */
    private final void m54576k() {
        this.f43857g = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43858h, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(this.f43855e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedRadioButton.m54577l(this.f44998b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.f43860j = valueAnimatorOfFloat;
        SpringAnimation springAnimation = new SpringAnimation(this, getInnerCircleScaleProperty());
        springAnimation.setStartValue(0.0f);
        SpringForce springForce = new SpringForce();
        springForce.setFinalPosition(1.0f);
        springForce.setDampingRatio(0.2367f);
        springForce.setStiffness(321.47f);
        springAnimation.setSpring(springForce);
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: com.kubi.resources.widget.o0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f11, float f12) {
                KcEnhancedRadioButton.m54578m(this.f45009a, dynamicAnimation, f11, f12);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.kubi.resources.widget.p0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                KcEnhancedRadioButton.m54579n(this.f45014a, dynamicAnimation, z11, f11, f12);
            }
        });
        springAnimation.start();
        this.f43861k = springAnimation;
    }

    /* JADX INFO: renamed from: n */
    public static final void m54579n(KcEnhancedRadioButton kcEnhancedRadioButton, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        kcEnhancedRadioButton.f43859i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ArgbEvaluator getArgbEvaluator() {
        if (this.f43856f == null) {
            this.f43856f = new ArgbEvaluator();
        }
        ArgbEvaluator argbEvaluator = this.f43856f;
        Intrinsics.checkNotNull(argbEvaluator);
        return argbEvaluator;
    }

    private final FloatPropertyCompat<KcEnhancedRadioButton> getInnerCircleScaleProperty() {
        if (this.f43867q == null) {
            this.f43867q = new C22922b();
        }
        FloatPropertyCompat<KcEnhancedRadioButton> floatPropertyCompat = this.f43867q;
        Intrinsics.checkNotNull(floatPropertyCompat);
        return floatPropertyCompat;
    }

    /* JADX INFO: renamed from: l */
    public static final void m54577l(KcEnhancedRadioButton kcEnhancedRadioButton, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedRadioButton.f43858h = ((Float) animatedValue).floatValue();
        kcEnhancedRadioButton.invalidate();
    }

    /* JADX INFO: renamed from: m */
    public static final void m54578m(KcEnhancedRadioButton kcEnhancedRadioButton, DynamicAnimation dynamicAnimation, float f11, float f12) {
        kcEnhancedRadioButton.f43857g = f11;
        kcEnhancedRadioButton.invalidate();
    }

    /* JADX INFO: renamed from: p */
    private final void m54581p() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43858h, 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(this.f43855e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.r0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedRadioButton.m54582q(this.f45030b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.f43860j = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f43857g, 0.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(this.f43855e);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.s0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedRadioButton.m54583r(this.f45106b, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C22921a());
        valueAnimatorOfFloat2.start();
        this.f43862l = valueAnimatorOfFloat2;
    }

    /* JADX INFO: renamed from: q */
    public static final void m54582q(KcEnhancedRadioButton kcEnhancedRadioButton, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedRadioButton.f43858h = ((Float) animatedValue).floatValue();
        kcEnhancedRadioButton.invalidate();
    }

    /* JADX INFO: renamed from: r */
    public static final void m54583r(KcEnhancedRadioButton kcEnhancedRadioButton, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedRadioButton.f43857g = ((Float) animatedValue).floatValue();
        kcEnhancedRadioButton.invalidate();
    }

    /* JADX INFO: renamed from: s */
    private final void m54584s() {
        ValueAnimator valueAnimator = this.f43860j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        SpringAnimation springAnimation = this.f43861k;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        ValueAnimator valueAnimator2 = this.f43862l;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m54586v(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.KcMaterialCheckBox);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f43852b = typedArrayObtainStyledAttributes.getInt(R$styleable.KcMaterialCheckBox_materialCheckboxStyle, 1);
                this.f43853c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcMaterialCheckBox_materialEnableAnimation, true);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        m54588x();
    }

    /* JADX INFO: renamed from: w */
    private final void m54587w() {
        if (this.f43854d) {
            setButtonDrawable(R$drawable.ui_selector_radio);
        } else {
            setButtonDrawable((Drawable) null);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m54588x() {
        int i11 = this.f43852b;
        if (i11 == 0) {
            this.f43863m.setStrokeWidth(C27029c.m66600c(this, 1.5f));
        } else {
            if (i11 != 1) {
                return;
            }
            this.f43863m.setStrokeWidth(C27029c.m66600c(this, 2.0f));
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m54589y(boolean z11) {
        if (z11) {
            this.f43858h = 1.0f;
            this.f43857g = 1.0f;
        } else {
            this.f43858h = 0.0f;
            this.f43857g = 0.0f;
        }
        this.f43859i = false;
        invalidate();
    }

    /* JADX INFO: renamed from: getRadioStyle, reason: from getter */
    public final int getF43852b() {
        return this.f43852b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f43854d) {
            m54590u(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.f43853c) {
            if (this.f43859i || this.f43858h > 0.0f || this.f43857g > 0.0f) {
                m54585t(canvas);
            }
        }
    }

    public final void setAnimationEnabled(boolean enabled) {
        if (this.f43853c != enabled) {
            this.f43853c = enabled;
            if (enabled) {
                return;
            }
            m54584s();
            m54589y(isChecked());
        }
    }

    public final void setRadioStyle(int style) {
        if (this.f43852b != style) {
            this.f43852b = style;
            m54588x();
            m54587w();
            invalidate();
        }
    }

    public final void setUseOriginalDrawable(boolean use) {
        if (this.f43854d != use) {
            this.f43854d = use;
            m54587w();
            invalidate();
        }
    }

    public /* synthetic */ KcEnhancedRadioButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.radioButtonStyle : i11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m54572g(KcEnhancedRadioButton kcEnhancedRadioButton) {
        kcEnhancedRadioButton.m54589y(kcEnhancedRadioButton.isChecked());
    }

    /* JADX INFO: renamed from: o */
    private final void m54580o(boolean z11) {
        m54584s();
        this.f43859i = true;
        if (z11) {
            m54576k();
        } else {
            m54581p();
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m54585t(Canvas canvas) {
        Rect bounds;
        Drawable buttonDrawable = getButtonDrawable();
        if (buttonDrawable != null && (bounds = buttonDrawable.getBounds()) != null) {
            float fCenterX = bounds.centerX();
            float fCenterY = bounds.centerY();
            float fMin = Math.min(bounds.width(), bounds.height()) / 2.0f;
            float f11 = this.f43857g;
            if (f11 > 0.0f) {
                this.f43864n.setColor(this.f43865o);
                canvas.drawCircle(fCenterX, fCenterY, fMin * 0.5f * f11, this.f43864n);
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54584s();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        boolean zIsChecked = isChecked();
        super.setChecked(checked);
        if (zIsChecked != checked && this.f43853c) {
            m54580o(checked);
        } else if (!this.f43853c) {
            m54589y(checked);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m54590u(Canvas canvas) {
        int iM66601d;
        int iIntValue;
        if (getWidth() > 0 && getHeight() > 0) {
            int i11 = this.f43852b;
            if (i11 != 0) {
                if (i11 != 1) {
                    iM66601d = C27029c.m66601d(this, 24);
                } else {
                    iM66601d = C27029c.m66601d(this, 24);
                }
            } else {
                iM66601d = C27029c.m66601d(this, 20);
            }
            float f11 = iM66601d;
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float fMin = Math.min(f11 / 2.0f, (Math.min(getWidth(), getHeight()) / 2.0f) - C27029c.m66601d(this, 2));
            if (isChecked()) {
                if (this.f43858h < 1.0f && this.f43853c) {
                    Object objEvaluate = getArgbEvaluator().evaluate(this.f43858h, Integer.valueOf(this.f43866p), Integer.valueOf(this.f43865o));
                    Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue = ((Integer) objEvaluate).intValue();
                } else {
                    iIntValue = this.f43865o;
                }
            } else if (this.f43858h > 0.0f && this.f43853c) {
                Object objEvaluate2 = getArgbEvaluator().evaluate(this.f43858h, Integer.valueOf(this.f43866p), Integer.valueOf(this.f43865o));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objEvaluate2).intValue();
            } else {
                iIntValue = this.f43866p;
            }
            this.f43863m.setColor(iIntValue);
            canvas.drawCircle(width, height, fMin, this.f43863m);
            float f12 = this.f43857g;
            if (f12 > 0.0f) {
                this.f43864n.setColor(this.f43865o);
                canvas.drawCircle(width, height, fMin * 0.5f * f12, this.f43864n);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int iM66601d;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43852b = 1;
        this.f43853c = true;
        this.f43855e = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C27029c.m66600c(this, 2.0f));
        this.f43863m = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f43864n = paint2;
        this.f43865o = ContextCompat.getColor(context, R$color.c_text);
        this.f43866p = ContextCompat.getColor(context, R$color.c_icon40);
        m54586v(attributeSet);
        m54587w();
        int i12 = this.f43852b;
        if (i12 == 0) {
            iM66601d = C27029c.m66601d(this, 20);
        } else if (i12 != 1) {
            iM66601d = C27029c.m66601d(this, 24);
        } else {
            iM66601d = C27029c.m66601d(this, 24);
        }
        setMinimumWidth(iM66601d);
        setMinimumHeight(iM66601d);
        setBackground(null);
        setForeground(null);
        setClickable(true);
        setFocusable(true);
        post(new Runnable() { // from class: com.kubi.resources.widget.q0
            @Override // java.lang.Runnable
            public final void run() {
                KcEnhancedRadioButton.m54572g(this.f45022b);
            }
        });
    }
}
