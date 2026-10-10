package ld0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ld0.a */
/* JADX INFO: compiled from: AnimationUtils.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ0\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/AnimationUtils;", "", "<init>", "()V", "createFadesInFromLtoR", "Landroid/animation/ObjectAnimator;", "target", "Landroid/view/View;", "star", "", "end", TypedValues.TransitionType.S_DURATION, "", "interpolator", "Landroid/animation/TimeInterpolator;", "createFadesOutAnimator", "startDelay", "startAnimation", "Landroid/animation/AnimatorSet;", "animatorFirst", "animatorSecond", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42171a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42171a f93622a = new C42171a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ObjectAnimator m92594a(@Nullable View view, float f11, float f12, int i11, @Nullable TimeInterpolator timeInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f11, f12);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        objectAnimatorOfFloat.setDuration(i11);
        Intrinsics.checkNotNull(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ObjectAnimator m92595b(@Nullable View view, float f11, float f12, int i11, int i12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationY", f11, f12), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder.setStartDelay(i12);
        objectAnimatorOfPropertyValuesHolder.setDuration(i11);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AnimatorSet m92596c(@Nullable ObjectAnimator objectAnimator, @Nullable ObjectAnimator objectAnimator2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator).before(objectAnimator2);
        animatorSet.start();
        return animatorSet;
    }
}
