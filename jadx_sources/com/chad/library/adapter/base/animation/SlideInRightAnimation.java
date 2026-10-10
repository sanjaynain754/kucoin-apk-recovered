package com.chad.library.adapter.base.animation;

import android.animation.Animator;
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

/* JADX INFO: compiled from: SlideInRightAnimation.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/chad/library/adapter/base/animation/SlideInRightAnimation;", "Lcom/chad/library/adapter/base/animation/ItemAnimator;", TypedValues.TransitionType.S_DURATION, "", "(J)V", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "animator", "Landroid/animation/Animator;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SlideInRightAnimation implements ItemAnimator {
    private final long duration;

    @NotNull
    private final DecelerateInterpolator interpolator;

    @JvmOverloads
    public SlideInRightAnimation() {
        this(0L, 1, null);
    }

    @JvmOverloads
    public SlideInRightAnimation(long j11) {
        this.duration = j11;
        this.interpolator = new DecelerateInterpolator(1.8f);
    }

    @Override // com.chad.library.adapter.base.animation.ItemAnimator
    @NotNull
    public Animator animator(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", view.getRootView().getWidth(), 0.0f);
        animator.setDuration(this.duration);
        animator.setInterpolator(this.interpolator);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return animator;
    }

    public /* synthetic */ SlideInRightAnimation(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 400L : j11);
    }
}
