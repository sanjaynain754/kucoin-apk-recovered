package com.kubi.launch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.RawRes;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.kubi.app.facade.R$id;
import com.kubi.utils.extensions.core.ViewExtKt;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.launch.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/launch/LottieAnimation;", "Lcom/kubi/launch/AnimationStrategy;", "rawId", "", "speedUp", "", "<init>", "(IZ)V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LottieAnimation implements AnimationStrategy {

    /* JADX INFO: renamed from: a */
    public final int f31818a;

    /* JADX INFO: renamed from: b */
    public final boolean f31819b;

    /* JADX INFO: renamed from: com.kubi.launch.s$a */
    /* JADX INFO: compiled from: AnimationStrategy.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/launch/LottieAnimation$showAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC41769w<Unit> f31820a;

        public a(InterfaceC41769w<Unit> interfaceC41769w) {
            this.f31820a = interfaceC41769w;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f31820a.mo91370n(Unit.INSTANCE);
        }
    }

    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) launcherContext.getF31802a().findViewById(R$id.lottie_view);
        lottieAnimationView.setAnimation(this.f31818a);
        lottieAnimationView.setRenderMode(RenderMode.HARDWARE);
        Intrinsics.checkNotNull(lottieAnimationView);
        ViewExtKt.m66594y(lottieAnimationView);
        if (this.f31819b) {
            lottieAnimationView.setSpeed(1.6f);
        }
        lottieAnimationView.addAnimatorListener(new a(interfaceC41769wM91388c));
        Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
        return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
    }

    public LottieAnimation(@RawRes int i11, boolean z11) {
        this.f31818a = i11;
        this.f31819b = z11;
    }
}
