package com.sumsub.sns.internal.core.common;

import android.R;
import android.view.View;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.c1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28443c1 {
    /* JADX INFO: renamed from: c */
    public static final void m69324c(View view) {
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69322a(View view) {
        view.animate().cancel();
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(view.getResources().getInteger(R.integer.config_mediumAnimTime)).start();
    }

    /* JADX INFO: renamed from: b */
    public static final void m69323b(final View view) {
        view.animate().cancel();
        view.animate().alpha(0.0f).setDuration(view.getResources().getInteger(R.integer.config_mediumAnimTime)).withEndAction(new Runnable() { // from class: com.sumsub.sns.internal.core.common.q1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28443c1.m69324c(view);
            }
        }).start();
    }
}
