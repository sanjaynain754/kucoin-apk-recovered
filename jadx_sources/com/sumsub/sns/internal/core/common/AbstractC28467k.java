package com.sumsub.sns.internal.core.common;

import android.os.SystemClock;
import android.view.View;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28467k {

    /* JADX INFO: renamed from: a */
    public static long f57982a;

    /* JADX INFO: renamed from: a */
    public static final void m69368a(final Function0 function0, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.core.common.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC28467k.m69369b(function0, view2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final void m69369b(Function0 function0, View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f57982a >= 400) {
            f57982a = jElapsedRealtime;
            function0.invoke();
        }
    }
}
