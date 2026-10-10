package com.sumsub.sns.internal.core.presentation.util;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.presentation.base.AbstractC28082W;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28972f {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f58894a;

    /* JADX INFO: renamed from: b */
    public final Function2 f58895b;

    /* JADX INFO: renamed from: c */
    public AbstractC28082W f58896c;

    /* JADX INFO: renamed from: d */
    public ViewBinding f58897d;

    /* JADX INFO: renamed from: a */
    public final ViewBinding m69713a(AbstractC28082W abstractC28082W, Function2 function2, Function1 function1, Function1 function3) {
        AbstractC28082W abstractC28082W2 = this.f58896c;
        if (abstractC28082W2 != null && abstractC28082W2.getClass() == abstractC28082W.getClass()) {
            ViewBinding viewBinding = this.f58897d;
            if (viewBinding == null) {
                viewBinding = null;
            }
            if (viewBinding == null) {
                return null;
            }
            if (function3 != null) {
                function3.invoke(viewBinding);
            }
            return viewBinding;
        }
        ViewGroup viewGroup = this.f58894a;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeAllViews();
        ViewBinding viewBinding2 = (ViewBinding) function2.invoke(LayoutInflater.from(this.f58894a.getContext()), this.f58894a);
        Function2 function4 = this.f58895b;
        if (function4 != null) {
            function4.invoke(abstractC28082W2, abstractC28082W);
        }
        this.f58896c = abstractC28082W;
        this.f58897d = viewBinding2;
        if (viewBinding2 != null) {
            if (function1 != null) {
                function1.invoke(viewBinding2);
            }
            if (function3 != null) {
                function3.invoke(viewBinding2);
            }
        }
        return viewBinding2;
    }

    public C28972f(ConstraintLayout constraintLayout, Function2 function2) {
        this.f58894a = constraintLayout;
        this.f58895b = function2;
    }
}
