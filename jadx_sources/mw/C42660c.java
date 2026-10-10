package mw;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mw.c */
/* JADX INFO: compiled from: PathAnimation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR7\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/animation/PathAnimation;", "", TypedValues.TransitionType.S_DURATION, "", "<init>", "(J)V", "mValueAnimator", "Landroid/animation/ValueAnimator;", "mAnimatedValue", "", "Ljava/lang/Float;", "updateCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "getUpdateCallback", "()Lkotlin/jvm/functions/Function1;", "setUpdateCallback", "(Lkotlin/jvm/functions/Function1;)V", "start", "isStart", "", "()Z", "currentValue", "getCurrentValue", "()F", InterfaceC33730j9.f70350a, "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42660c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public ValueAnimator f94399a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Float f94400b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function1<? super Float, Unit> f94401c;

    /* JADX INFO: renamed from: b */
    public static final void m93441b(C42660c c42660c, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        c42660c.f94400b = f11;
        Function1<? super Float, Unit> function1 = c42660c.f94401c;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f11 != null ? f11.floatValue() : 0.0f));
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m93442c() {
        Float f11 = this.f94400b;
        if (f11 != null) {
            return f11.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93443d() {
        ValueAnimator valueAnimator = this.f94399a;
        if (valueAnimator != null) {
            return valueAnimator.isStarted();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m93444e(@Nullable Function1<? super Float, Unit> function1) {
        this.f94401c = function1;
    }

    /* JADX INFO: renamed from: f */
    public final void m93445f() {
        ValueAnimator valueAnimator = this.f94399a;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m93446g() {
        ValueAnimator valueAnimator = this.f94399a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f94399a;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public C42660c(long j11) {
        if (this.f94399a == null) {
            this.f94399a = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ValueAnimator valueAnimator = this.f94399a;
        if (valueAnimator != null) {
            valueAnimator.setDuration(j11);
        }
        ValueAnimator valueAnimator2 = this.f94399a;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = this.f94399a;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mw.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C42660c.m93441b(this.f94398b, valueAnimator4);
                }
            });
        }
    }
}
