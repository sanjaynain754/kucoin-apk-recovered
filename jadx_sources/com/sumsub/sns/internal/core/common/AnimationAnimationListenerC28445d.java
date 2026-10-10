package com.sumsub.sns.internal.core.common;

import android.view.animation.Animation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class AnimationAnimationListenerC28445d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f57955a;

    public AnimationAnimationListenerC28445d(Function0 function0) {
        this.f57955a = function0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Function0 function0 = this.f57955a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
