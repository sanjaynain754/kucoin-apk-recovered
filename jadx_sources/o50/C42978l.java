package o50;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o50.l */
/* JADX INFO: compiled from: ViewAnimatorExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002¨\u0006\n"}, m90084d2 = {"setAnimator", "", "Landroid/view/View;", "repeatCount", "", TypedValues.TransitionType.S_DURATION, "", "interpolator", "Landroid/view/animation/Interpolator;", "closeAnimator", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42978l {

    /* JADX INFO: renamed from: o50.l$a */
    /* JADX INFO: compiled from: ViewAnimatorExt.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/tradingbotkit/ext/ViewAnimatorExtKt$setAnimator$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f95113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RotateAnimation f95114c;

        public a(View view, RotateAnimation rotateAnimation) {
            this.f95113b = view;
            this.f95114c = rotateAnimation;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            if (Intrinsics.areEqual(this.f95113b.getTag(), Integer.valueOf(R$mipmap.kucoin_icon_strategy_stopping))) {
                this.f95113b.setAnimation(this.f95114c);
            } else {
                this.f95113b.clearAnimation();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m94385a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
    }

    /* JADX INFO: renamed from: b */
    public static final void m94386b(@NotNull View view, int i11, long j11, @NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, C27029c.m66601d(view, 16) / 2.0f, C27029c.m66601d(view, 16) / 2.0f);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(i11);
        rotateAnimation.setInterpolator(interpolator);
        rotateAnimation.setDuration(j11);
        rotateAnimation.setFillAfter(false);
        if (Intrinsics.areEqual(view.getTag(), Integer.valueOf(R$mipmap.kucoin_icon_strategy_stopping))) {
            view.setAnimation(rotateAnimation);
        } else {
            view.clearAnimation();
        }
        view.addOnAttachStateChangeListener(new a(view, rotateAnimation));
    }
}
