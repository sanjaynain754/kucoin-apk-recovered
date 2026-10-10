package p562qj;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.kubi.home.R$color;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qj.v */
/* JADX INFO: compiled from: ScaleAnimationHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/ScaleAnimationHelper;", "", "<init>", "()V", "CARD_ELEVATION_RAISED", "", "getCARD_ELEVATION_RAISED", "()F", "SHADOW_COLOR", "", "getSHADOW_COLOR", "()I", "CARD_SCALE_RAISED", "CARD_SCALE_NORMAL", "animateCardScale", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "targetScale", TypedValues.TransitionType.S_DURATION, "", "onEnd", "Lkotlin/Function0;", "applyShadow", "cardView", "Landroidx/cardview/widget/CardView;", "raise", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScaleAnimationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleAnimationHelper.kt\ncom/kubi/home/v2/container/ui/ScaleAnimationHelper\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,52:1\n30#2:53\n91#2,14:54\n*S KotlinDebug\n*F\n+ 1 ScaleAnimationHelper.kt\ncom/kubi/home/v2/container/ui/ScaleAnimationHelper\n*L\n41#1:53\n41#1:54,14\n*E\n"})
public final class C43766v {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43766v f96768a = new C43766v();

    /* JADX INFO: renamed from: b */
    public static final float f96769b = C27040e.m66658b(5);

    /* JADX INFO: renamed from: c */
    public static final int f96770c = ContextCompat.getColor(BaseApplication.INSTANCE.get(), R$color.c_20_black);

    /* JADX INFO: renamed from: qj.v$a */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 ScaleAnimationHelper.kt\ncom/kubi/home/v2/container/ui/ScaleAnimationHelper\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n42#3,2:125\n94#4:127\n93#5:128\n*E\n"})
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f96771a;

        public a(Function0 function0) {
            this.f96771a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Function0 function0 = this.f96771a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m96421a(@NotNull View view, float f11, long j11, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getScaleX() == f11 && view.getScaleY() == f11) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f11);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f11);
        objectAnimatorOfFloat.setDuration(j11);
        objectAnimatorOfFloat2.setDuration(j11);
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat2.start();
        Intrinsics.checkNotNull(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addListener(new a(function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96420b(C43766v c43766v, View view, float f11, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = 200;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        c43766v.m96421a(view, f11, j12, function0);
    }

    /* JADX INFO: renamed from: c */
    public final void m96422c(@NotNull CardView cardView, boolean z11) {
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        if (Build.VERSION.SDK_INT >= 28) {
            cardView.setOutlineSpotShadowColor(f96770c);
        }
        cardView.setCardElevation(f96769b * (z11 ? 2 : 1));
    }
}
