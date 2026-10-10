package com.sumsub.sns.internal.core.common;

import android.text.style.URLSpan;
import android.view.View;
import com.sumsub.sns.core.presentation.base.text.span.AbstractC28151a;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28482p extends AbstractC28151a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f58020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ URLSpan f58021b;

    public C28482p(Function1 function1, URLSpan uRLSpan) {
        this.f58020a = function1;
        this.f58021b = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.cancelPendingInputEvents();
        Function1 function1 = this.f58020a;
        if (function1 != null) {
            function1.invoke(this.f58021b.getURL());
        }
    }
}
