package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScaleInAnimation.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/chad/library/adapter/base/animation/ScaleInAnimation;", "Lcom/chad/library/adapter/base/animation/ItemAnimator;", TypedValues.TransitionType.S_DURATION, "", "mFrom", "", "(JF)V", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "animator", "Landroid/animation/Animator;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "Companion", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ScaleInAnimation implements ItemAnimator {
    private static final float DEFAULT_SCALE_FROM = 0.5f;
    private final long duration;

    @NotNull
    private final DecelerateInterpolator interpolator;
    private final float mFrom;

    @JvmOverloads
    public ScaleInAnimation() {
        this(0L, 0.0f, 3, null);
    }

    @JvmOverloads
    public ScaleInAnimation(long j11) {
        this(j11, 0.0f, 2, null);
    }

    @JvmOverloads
    public ScaleInAnimation(long j11, float f11) {
        this.duration = j11;
        this.mFrom = f11;
        this.interpolator = new DecelerateInterpolator();
    }

    @Override // com.chad.library.adapter.base.animation.ItemAnimator
    @NotNull
    public Animator animator(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", this.mFrom, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.mFrom, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.duration);
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        return animatorSet;
    }

    public /* synthetic */ ScaleInAnimation(long j11, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 300L : j11, (i11 & 2) != 0 ? 0.5f : f11);
    }
}
