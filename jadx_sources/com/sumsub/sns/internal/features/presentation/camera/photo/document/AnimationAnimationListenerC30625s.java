package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.view.View;
import android.view.animation.Animation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class AnimationAnimationListenerC30625s implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30471K f61873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f61874b;

    public AnimationAnimationListenerC30625s(C30471K c30471k, Function0 function0) {
        this.f61873a = c30471k;
        this.f61874b = function0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C30471K c30471k = this.f61873a;
        C30590m c30590m = C30471K.f61458R;
        View view = (View) c30471k.f61465F.getValue(c30471k, C30471K.f61459S[22]);
        if (view != null) {
            view.setVisibility(8);
        }
        Function0 function0 = this.f61874b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C30471K c30471k = this.f61873a;
        C30590m c30590m = C30471K.f61458R;
        View view = (View) c30471k.f61465F.getValue(c30471k, C30471K.f61459S[22]);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
