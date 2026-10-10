package com.kubi.share.lib.utils;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.kubi.share.R$anim;
import com.kubi.utils.C27100x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.utils.d */
/* JADX INFO: compiled from: ShareAnimationHelper.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\r\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a&\u0010\u000f\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u0012"}, m90084d2 = {"DUATION_300", "", "DUATION_230", "EASE_OUT", "Landroid/view/animation/Interpolator;", "getEASE_OUT", "()Landroid/view/animation/Interpolator;", "EASE_IN", "getEASE_IN", "shareConentIn", "", "Landroid/view/View;", TypedValues.TransitionType.S_DURATION, "shareConentOut", "shareChanneIn", "shareChanneOut", "onEnd", "Lkotlin/Function0;", "ShareLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24634d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Interpolator f49513a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Interpolator f49514b;

    /* JADX INFO: renamed from: e */
    public static final Unit m59874e(View view, long j11) {
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        Interpolator interpolator = f49513a;
        viewPropertyAnimatorAnimate.setInterpolator(interpolator).setDuration(j11).alpha(1.0f).start();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R$anim.anim_bottom_in_300);
        animationLoadAnimation.setDuration(j11);
        animationLoadAnimation.setInterpolator(interpolator);
        view.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final void m59873d(@NotNull final View view, final long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.utils.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24634d.m59874e(view, j11);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m59875f(@NotNull final View view, final long j11, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.utils.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24634d.m59876g(view, j11, function0);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final void m59877h(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m59878i(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAnimation(null);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(j11).setInterpolator(f49513a).start();
    }

    /* JADX INFO: renamed from: j */
    public static final void m59879j(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(j11).setInterpolator(f49514b).start();
    }

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.05f, 0.7f, 0.1f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        f49513a = interpolatorCreate;
        Interpolator interpolatorCreate2 = PathInterpolatorCompat.create(0.3f, 0.0f, 1.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate2, "create(...)");
        f49514b = interpolatorCreate2;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m59876g(View view, long j11, final Function0 function0) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R$anim.anim_bottom_out_230);
        animationLoadAnimation.setDuration(j11);
        Interpolator interpolator = f49514b;
        animationLoadAnimation.setInterpolator(interpolator);
        view.startAnimation(animationLoadAnimation);
        view.setAlpha(1.0f);
        view.animate().setInterpolator(interpolator).setDuration(j11).withEndAction(new Runnable() { // from class: com.kubi.share.lib.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                C24634d.m59877h(function0);
            }
        }).alpha(0.0f).start();
        return Unit.INSTANCE;
    }
}
