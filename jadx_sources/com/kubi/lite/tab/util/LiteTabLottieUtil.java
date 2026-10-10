package com.kubi.lite.tab.util;

import android.animation.ValueAnimator;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.InterfaceC5085j0;
import com.airbnb.lottie.InterfaceC5089l0;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.lite.tab.bean.TabConfig;
import fo.C37576b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.lite.tab.util.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiteTabLottieUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005J4\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/lite/tab/util/LiteTabLottieUtil;", "", "<init>", "()V", "TAG", "", "setupLottieAnimation", "", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "config", "Lcom/kubi/lite/tab/bean/TabConfig;", "isSelected", "", "tabCount", "", "scrollState", "playLottieAnimation", "onFailed", "Lkotlin/Function0;", "onLoaded", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiteTabLottieUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f32187a = "LiteV2-LiteTabLottieUtil";

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m37664i(LiteTabLottieUtil liteTabLottieUtil, LottieAnimationView lottieAnimationView, TabConfig tabConfig, boolean z11, int i11, String str, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            str = null;
        }
        liteTabLottieUtil.m37666h(lottieAnimationView, tabConfig, z11, i13, str);
    }

    /* JADX INFO: renamed from: h */
    public final void m37666h(@Nullable LottieAnimationView lottieAnimationView, @NotNull TabConfig config, boolean z11, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        C44128b.m97266j(this.f32187a, "setupLottieAnimation start: tabId=" + config.getTabId() + ", isSelected=" + z11 + ", tabCount=" + i11);
        if (lottieAnimationView == null) {
            return;
        }
        try {
            lottieAnimationView.setVisibility(8);
            lottieAnimationView.clearAnimation();
            C37576b c37576b = C37576b.f83540a;
            String strM84706a = c37576b.m84706a(config, z11, i11, str);
            if (strM84706a.length() > 0) {
                lottieAnimationView.setAnimationFromUrl(strM84706a, strM84706a + "?isDarkTheme=" + LiteCommonUtils.f32173a.m37654h());
                return;
            }
            int iM84707b = c37576b.m84707b(config, z11, i11, str);
            C44128b.m97266j(this.f32187a, "setupLottieAnimation: loading local raw res, resId=" + iM84707b);
            if (iM84707b != 0) {
                lottieAnimationView.setAnimation(iM84707b);
            }
        } catch (Exception e11) {
            C44128b.m97261e(this.f32187a, "setupLottieAnimation: " + e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m37661e(LiteTabLottieUtil liteTabLottieUtil, Function0 function0, Throwable th2) {
        C44128b.m97266j(liteTabLottieUtil.f32187a, "Lottie animation play failed: " + th2.getMessage());
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static final void m37662f(LiteTabLottieUtil liteTabLottieUtil, Function0 function0, C5080h c5080h) {
        C44128b.m97266j(liteTabLottieUtil.f32187a, "on loaded");
        function0.invoke();
    }

    /* JADX INFO: renamed from: g */
    public static final void m37663g(LottieAnimationView lottieAnimationView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getAnimatedFraction() >= 0.99f) {
            lottieAnimationView.pauseAnimation();
            lottieAnimationView.setProgress(1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m37665d(@Nullable final LottieAnimationView lottieAnimationView, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        if (lottieAnimationView == null) {
            return;
        }
        try {
            lottieAnimationView.setVisibility(0);
            if (function0 != null) {
                lottieAnimationView.setFailureListener(new InterfaceC5085j0() { // from class: com.kubi.lite.tab.util.b
                    @Override // com.airbnb.lottie.InterfaceC5085j0
                    public final void onResult(Object obj) {
                        LiteTabLottieUtil.m37661e(this.f32182a, function0, (Throwable) obj);
                    }
                });
            }
            if (function1 != null) {
                lottieAnimationView.addLottieOnCompositionLoadedListener(new InterfaceC5089l0() { // from class: com.kubi.lite.tab.util.c
                    @Override // com.airbnb.lottie.InterfaceC5089l0
                    /* JADX INFO: renamed from: a */
                    public final void mo5522a(C5080h c5080h) {
                        LiteTabLottieUtil.m37662f(this.f32184a, function1, c5080h);
                    }
                });
            }
            lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.lite.tab.util.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LiteTabLottieUtil.m37663g(lottieAnimationView, valueAnimator);
                }
            });
            lottieAnimationView.playAnimation();
            C44128b.m97266j(this.f32187a, "playLottieAnimation: starting animation");
        } catch (Exception e11) {
            C44128b.m97261e(this.f32187a, "setupLottieAnimation: " + e11);
        }
    }
}
