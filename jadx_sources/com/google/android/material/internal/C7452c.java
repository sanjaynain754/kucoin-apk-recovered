package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.internal.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes45.dex */
public final /* synthetic */ class C7452c implements MultiViewUpdateListener.Listener {
    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setScale(valueAnimator, view);
    }
}
