package com.kubi.resources.widget;

import android.R;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.PathInterpolator;
import androidx.core.content.ContextCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.checkbox.MaterialCheckBox;
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

/* JADX INFO: compiled from: KcEnhancedMaterialCheckBox.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "请使用KuCheckbox")
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000)H\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0002J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J(\u00105\u001a\u00020,2\u0006\u00100\u001a\u0002012\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0014H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\fH\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010<\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020,H\u0002J\u0010\u0010>\u001a\u00020,2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010?\u001a\u00020,H\u0002J\b\u0010@\u001a\u00020,H\u0014J\u000e\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020\fJ\u000e\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020\fJ\u0006\u0010G\u001a\u00020,J\u0006\u0010H\u001a\u00020,J\u0006\u0010I\u001a\u00020\u0007J\u0006\u0010J\u001a\u00020\fJ\u0006\u0010K\u001a\u00020\fR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, m90084d2 = {"Lcom/kubi/resources/widget/KcEnhancedMaterialCheckBox;", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkboxStyleType", "animationEnabled", "", "useOriginalDrawable", "bezierInterpolator", "Landroid/view/animation/PathInterpolator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "getArgbEvaluator", "checkMarkProgress", "", "backgroundProgress", "isAnimating", "backgroundAnimator", "Landroid/animation/ValueAnimator;", "checkMarkSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "checkMarkAlphaAnimator", "animationPaint", "Landroid/graphics/Paint;", "overlayPaint", "borderPaint", "backgroundPaint", "checkMarkPath", "Landroid/graphics/Path;", "checkMarkMeasure", "Landroid/graphics/PathMeasure;", "checkMarkDrawPath", "checkedColor", "uncheckedColor", "checkMarkProgressProperty", "Landroidx/dynamicanimation/animation/FloatPropertyCompat;", "getCheckMarkProgressProperty", "parseAttributes", "", "setupOriginalDrawable", "updatePaintForStyle", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawCustomCheckbox", "drawAnimationOverlay", "resolveCheckmarkColor", "drawAnimatedCheckMark", "centerX", "centerY", "size", "setChecked", "checked", "animateToState", "animateToChecked", "animateToUnchecked", "updateStateWithoutAnimation", "cancelAllAnimations", "onDetachedFromWindow", "setCheckBoxStyle", TtmlNode.TAG_STYLE, "setAnimationEnabled", "enabled", "setUseOriginalDrawable", "use", "setStyle20dp", "setStyle24dp", "getCheckBoxStyle", "isAnimationEnabled", "isUsingOriginalDrawable", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcEnhancedMaterialCheckBox extends MaterialCheckBox {

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f43828w = new Companion(null);

    /* JADX INFO: renamed from: b */
    public int f43829b;

    /* JADX INFO: renamed from: c */
    public boolean f43830c;

    /* JADX INFO: renamed from: d */
    public boolean f43831d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final PathInterpolator f43832e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ArgbEvaluator f43833f;

    /* JADX INFO: renamed from: g */
    public float f43834g;

    /* JADX INFO: renamed from: h */
    public float f43835h;

    /* JADX INFO: renamed from: i */
    public boolean f43836i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ValueAnimator f43837j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public SpringAnimation f43838k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ValueAnimator f43839l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Paint f43840m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Paint f43841n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Paint f43842o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Paint f43843p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Path f43844q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final PathMeasure f43845r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Path f43846s;

    /* JADX INFO: renamed from: t */
    public final int f43847t;

    /* JADX INFO: renamed from: u */
    public final int f43848u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public FloatPropertyCompat<KcEnhancedMaterialCheckBox> f43849v;

    /* JADX INFO: compiled from: KcEnhancedMaterialCheckBox.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/KcEnhancedMaterialCheckBox$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "SPRING_DAMPING_RATIO", "", "SPRING_STIFFNESS", "STYLE_20DP", "", "STYLE_24DP", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcEnhancedMaterialCheckBox$a */
    /* JADX INFO: compiled from: KcEnhancedMaterialCheckBox.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/KcEnhancedMaterialCheckBox$animateToUnchecked$2$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22919a implements Animator.AnimatorListener {
        public C22919a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            KcEnhancedMaterialCheckBox.this.f43834g = 0.0f;
            KcEnhancedMaterialCheckBox.this.f43836i = false;
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

    /* JADX INFO: renamed from: com.kubi.resources.widget.KcEnhancedMaterialCheckBox$b */
    /* JADX INFO: compiled from: KcEnhancedMaterialCheckBox.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/widget/KcEnhancedMaterialCheckBox$getCheckMarkProgressProperty$1", "Landroidx/dynamicanimation/animation/FloatPropertyCompat;", "Lcom/kubi/resources/widget/KcEnhancedMaterialCheckBox;", "getValue", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setValue", "", "value", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22920b extends FloatPropertyCompat<KcEnhancedMaterialCheckBox> {
        public C22920b() {
            super("checkMarkProgress");
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(KcEnhancedMaterialCheckBox view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.f43834g;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(KcEnhancedMaterialCheckBox view, float f11) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.f43834g = f11;
            view.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedMaterialCheckBox(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: m */
    public static final void m54548m(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        kcEnhancedMaterialCheckBox.f43836i = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m54553k() {
        this.f43834g = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43835h, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(this.f43832e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.k0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedMaterialCheckBox.m54549n(this.f44927b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.f43837j = valueAnimatorOfFloat;
        SpringAnimation springAnimation = new SpringAnimation(this, getCheckMarkProgressProperty());
        springAnimation.setStartValue(0.0f);
        SpringForce springForce = new SpringForce();
        springForce.setFinalPosition(1.0f);
        springForce.setDampingRatio(0.2367f);
        springForce.setStiffness(321.47f);
        springAnimation.setSpring(springForce);
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: com.kubi.resources.widget.l0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f11, float f12) {
                KcEnhancedMaterialCheckBox.m54547l(this.f44937a, dynamicAnimation, f11, f12);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.kubi.resources.widget.m0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                KcEnhancedMaterialCheckBox.m54548m(this.f44988a, dynamicAnimation, z11, f11, f12);
            }
        });
        springAnimation.start();
        this.f43838k = springAnimation;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedMaterialCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ArgbEvaluator getArgbEvaluator() {
        if (this.f43833f == null) {
            this.f43833f = new ArgbEvaluator();
        }
        ArgbEvaluator argbEvaluator = this.f43833f;
        Intrinsics.checkNotNull(argbEvaluator);
        return argbEvaluator;
    }

    private final FloatPropertyCompat<KcEnhancedMaterialCheckBox> getCheckMarkProgressProperty() {
        if (this.f43849v == null) {
            this.f43849v = new C22920b();
        }
        FloatPropertyCompat<KcEnhancedMaterialCheckBox> floatPropertyCompat = this.f43849v;
        Intrinsics.checkNotNull(floatPropertyCompat);
        return floatPropertyCompat;
    }

    /* JADX INFO: renamed from: l */
    public static final void m54547l(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox, DynamicAnimation dynamicAnimation, float f11, float f12) {
        kcEnhancedMaterialCheckBox.f43834g = f11;
        kcEnhancedMaterialCheckBox.invalidate();
    }

    /* JADX INFO: renamed from: n */
    public static final void m54549n(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedMaterialCheckBox.f43835h = ((Float) animatedValue).floatValue();
        kcEnhancedMaterialCheckBox.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public static final void m54550q(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedMaterialCheckBox.f43835h = ((Float) animatedValue).floatValue();
        kcEnhancedMaterialCheckBox.invalidate();
    }

    /* JADX INFO: renamed from: r */
    public static final void m54551r(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kcEnhancedMaterialCheckBox.f43834g = ((Float) animatedValue).floatValue();
        kcEnhancedMaterialCheckBox.invalidate();
    }

    /* JADX INFO: renamed from: A */
    public final void m54552A(boolean z11) {
        if (z11) {
            this.f43835h = 1.0f;
            this.f43834g = 1.0f;
        } else {
            this.f43835h = 0.0f;
            this.f43834g = 0.0f;
        }
        this.f43836i = false;
        invalidate();
    }

    /* JADX INFO: renamed from: getCheckBoxStyle, reason: from getter */
    public final int getF43829b() {
        return this.f43829b;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f43831d) {
            m54559v(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.f43830c) {
            if (this.f43836i || this.f43835h > 0.0f || this.f43834g > 0.0f) {
                m54558u(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m54555p() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43835h, 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(this.f43832e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.h0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedMaterialCheckBox.m54550q(this.f44850b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.f43837j = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f43834g, 0.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(this.f43832e);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.i0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KcEnhancedMaterialCheckBox.m54551r(this.f44855b, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C22919a());
        valueAnimatorOfFloat2.start();
        this.f43839l = valueAnimatorOfFloat2;
    }

    /* JADX INFO: renamed from: s */
    public final void m54556s() {
        ValueAnimator valueAnimator = this.f43837j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        SpringAnimation springAnimation = this.f43838k;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        ValueAnimator valueAnimator2 = this.f43839l;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public final void setAnimationEnabled(boolean enabled) {
        if (this.f43830c != enabled) {
            this.f43830c = enabled;
            if (enabled) {
                return;
            }
            m54556s();
            m54552A(isChecked());
        }
    }

    public final void setCheckBoxStyle(int style) {
        if (this.f43829b != style) {
            this.f43829b = style;
            m54563z();
            m54562y();
            invalidate();
        }
    }

    public final void setUseOriginalDrawable(boolean use) {
        if (this.f43831d != use) {
            this.f43831d = use;
            m54562y();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m54557t(Canvas canvas, float f11, float f12, float f13) {
        float f14 = f13 / 24.0f;
        float f15 = (-4.707f) * f14;
        float f16 = (-0.7069998f) * f14;
        float f17 = (-1.7069998f) * f14;
        float f18 = 3.7069998f * f14;
        float f19 = 5.7070007f * f14;
        float f21 = (-2.2930002f) * f14;
        double radians = (float) Math.toRadians(-10.0f);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        this.f43844q.reset();
        this.f43844q.moveTo(((f15 * fCos) - (f16 * fSin)) + f11, (f15 * fSin) + (f16 * fCos) + f12);
        this.f43844q.lineTo(((f17 * fCos) - (f18 * fSin)) + f11, (f17 * fSin) + (f18 * fCos) + f12);
        this.f43844q.lineTo(f11 + ((f19 * fCos) - (f21 * fSin)), f12 + (f19 * fSin) + (f21 * fCos));
        this.f43845r.setPath(this.f43844q, false);
        float length = this.f43845r.getLength();
        this.f43846s.reset();
        float f22 = this.f43834g;
        if (f22 > 0.0f) {
            this.f43845r.getSegment(0.0f, length * f22, this.f43846s, true);
            this.f43840m.setColor(m54561x());
            this.f43840m.setAlpha((int) (255 * Math.min(1.0f, this.f43834g)));
            this.f43840m.setStrokeWidth(this.f43829b != 0 ? f14 * 2.0f : C27029c.m66600c(this, 1.5f));
            canvas.drawPath(this.f43846s, this.f43840m);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m54560w(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.KcMaterialCheckBox);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f43829b = typedArrayObtainStyledAttributes.getInt(R$styleable.KcMaterialCheckBox_materialCheckboxStyle, 1);
                this.f43830c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KcMaterialCheckBox_materialEnableAnimation, true);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        m54563z();
    }

    /* JADX INFO: renamed from: y */
    public final void m54562y() {
        int i11;
        int i12 = this.f43829b;
        if (i12 != 0) {
            i11 = i12 != 1 ? R$drawable.ui_selector_checkbox_24 : R$drawable.ui_selector_checkbox_24;
        } else {
            i11 = R$drawable.ui_selector_checkbox_20;
        }
        if (this.f43831d) {
            setButtonDrawable(ContextCompat.getDrawable(getContext(), i11));
        } else {
            setButtonDrawable((Drawable) null);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m54563z() {
        int i11 = this.f43829b;
        if (i11 == 0) {
            this.f43840m.setStrokeWidth(C27029c.m66601d(this, 2));
        } else {
            if (i11 != 1) {
                return;
            }
            this.f43840m.setStrokeWidth(C27029c.m66600c(this, 2.5f));
        }
    }

    public /* synthetic */ KcEnhancedMaterialCheckBox(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.checkboxStyle : i11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m54543g(KcEnhancedMaterialCheckBox kcEnhancedMaterialCheckBox) {
        kcEnhancedMaterialCheckBox.m54552A(kcEnhancedMaterialCheckBox.isChecked());
    }

    /* JADX INFO: renamed from: o */
    public final void m54554o(boolean z11) {
        m54556s();
        this.f43836i = true;
        if (z11) {
            m54553k();
        } else {
            m54555p();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54556s();
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        boolean zIsChecked = isChecked();
        super.setChecked(checked);
        if (zIsChecked != checked && this.f43830c) {
            m54554o(checked);
        } else if (!this.f43830c) {
            m54552A(checked);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m54558u(Canvas canvas) {
        Rect bounds;
        Drawable buttonDrawable = getButtonDrawable();
        if (buttonDrawable != null && (bounds = buttonDrawable.getBounds()) != null) {
            float fCenterX = bounds.centerX();
            float fCenterY = bounds.centerY();
            float fMin = Math.min(bounds.width(), bounds.height());
            if (isChecked()) {
                float f11 = this.f43835h;
                if (f11 > 0.0f && f11 < 1.0f) {
                    this.f43841n.setColor(this.f43847t);
                    this.f43841n.setAlpha((int) (64 * this.f43835h));
                    canvas.drawCircle(fCenterX, fCenterY, (fMin / 2.0f) * 0.7f, this.f43841n);
                }
            }
            if (this.f43834g > 0.0f) {
                m54557t(canvas, fCenterX, fCenterY, fMin);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m54559v(Canvas canvas) {
        int iM66601d;
        int iIntValue;
        int iM66600c;
        if (getWidth() > 0 && getHeight() > 0) {
            int i11 = this.f43829b;
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
            int iIntValue2 = 0;
            if (isChecked()) {
                if (this.f43835h < 1.0f && this.f43830c) {
                    Object objEvaluate = getArgbEvaluator().evaluate(this.f43835h, Integer.valueOf(this.f43848u), Integer.valueOf(this.f43847t));
                    Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue = ((Integer) objEvaluate).intValue();
                    Object objEvaluate2 = getArgbEvaluator().evaluate(this.f43835h, 0, Integer.valueOf(this.f43847t));
                    Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue2 = ((Integer) objEvaluate2).intValue();
                } else {
                    iIntValue2 = this.f43847t;
                    iIntValue = iIntValue2;
                }
            } else if (this.f43835h > 0.0f && this.f43830c) {
                Object objEvaluate3 = getArgbEvaluator().evaluate(this.f43835h, Integer.valueOf(this.f43848u), Integer.valueOf(this.f43847t));
                Intrinsics.checkNotNull(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objEvaluate3).intValue();
                Object objEvaluate4 = getArgbEvaluator().evaluate(this.f43835h, 0, Integer.valueOf(this.f43847t));
                Intrinsics.checkNotNull(objEvaluate4, "null cannot be cast to non-null type kotlin.Int");
                iIntValue2 = ((Integer) objEvaluate4).intValue();
            } else {
                iIntValue = this.f43848u;
            }
            if (iIntValue2 != 0) {
                this.f43843p.setColor(iIntValue2);
                canvas.drawCircle(width, height, fMin, this.f43843p);
            }
            this.f43842o.setColor(iIntValue);
            Paint paint = this.f43842o;
            int i12 = this.f43829b;
            if (i12 != 0) {
                if (i12 != 1) {
                    iM66600c = C27029c.m66600c(this, 2.0f);
                } else {
                    iM66600c = C27029c.m66600c(this, 2.0f);
                }
            } else {
                iM66600c = C27029c.m66600c(this, 1.5f);
            }
            paint.setStrokeWidth(iM66600c);
            canvas.drawCircle(width, height, fMin, this.f43842o);
            if (this.f43834g > 0.0f) {
                m54557t(canvas, width, height, fMin * 2.0f);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m54561x() {
        int i11;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            i11 = R$color.c_text_black;
        } else {
            i11 = R$color.c_text_white;
        }
        return ContextCompat.getColor(getContext(), i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcEnhancedMaterialCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int iM66601d;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43829b = 1;
        this.f43830c = true;
        this.f43832e = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(C27029c.m66601d(this, 2));
        paint.setColor(-1);
        this.f43840m = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f43841n = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(C27029c.m66600c(this, 1.5f));
        this.f43842o = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        this.f43843p = paint4;
        this.f43844q = new Path();
        this.f43845r = new PathMeasure();
        this.f43846s = new Path();
        this.f43847t = ContextCompat.getColor(context, R$color.c_text);
        this.f43848u = ContextCompat.getColor(context, R$color.c_icon40);
        m54560w(attributeSet);
        m54562y();
        int i12 = this.f43829b;
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
        post(new Runnable() { // from class: com.kubi.resources.widget.j0
            @Override // java.lang.Runnable
            public final void run() {
                KcEnhancedMaterialCheckBox.m54543g(this.f44917b);
            }
        });
    }
}
