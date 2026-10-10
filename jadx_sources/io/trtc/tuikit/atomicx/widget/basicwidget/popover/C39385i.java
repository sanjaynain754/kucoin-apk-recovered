package io.trtc.tuikit.atomicx.widget.basicwidget.popover;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.tencent.qcloud.tuicore.TUIConstants;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.i */
/* JADX INFO: compiled from: AtomicPopover.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¨\u0006\u0005"}, m90084d2 = {"doOnEnd", "", "Landroid/animation/ValueAnimator;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "atomic_x_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C39385i {

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.i$a */
    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"io/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopoverKt$doOnEnd$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f87565a;

        public a(Function0<Unit> function0) {
            this.f87565a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f87565a.invoke();
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

    /* JADX INFO: renamed from: b */
    public static final void m88191b(ValueAnimator valueAnimator, Function0<Unit> function0) {
        valueAnimator.addListener(new a(function0));
    }
}
