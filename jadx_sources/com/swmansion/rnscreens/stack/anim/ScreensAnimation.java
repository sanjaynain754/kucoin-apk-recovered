package com.swmansion.rnscreens.stack.anim;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.ScreenFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreensAnimation.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/swmansion/rnscreens/stack/anim/ScreensAnimation;", "Landroid/view/animation/Animation;", "mFragment", "Lcom/swmansion/rnscreens/ScreenFragment;", "<init>", "(Lcom/swmansion/rnscreens/ScreenFragment;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreensAnimation extends Animation {

    @NotNull
    private final ScreenFragment mFragment;

    public ScreensAnimation(@NotNull ScreenFragment mFragment) {
        Intrinsics.checkNotNullParameter(mFragment, "mFragment");
        this.mFragment = mFragment;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float interpolatedTime, @NotNull Transformation t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        super.applyTransformation(interpolatedTime, t11);
        ScreenFragment screenFragment = this.mFragment;
        screenFragment.dispatchTransitionProgressEvent(interpolatedTime, !screenFragment.isResumed());
    }
}
