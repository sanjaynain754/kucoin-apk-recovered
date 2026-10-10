package com.sumsub.sns.internal.core.presentation.common;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28777j implements ReadOnlyProperty, InterfaceC28779l {

    /* JADX INFO: renamed from: a */
    public final Function1 f58528a;

    /* JADX INFO: renamed from: b */
    public final Function0 f58529b;

    /* JADX INFO: renamed from: c */
    public ViewBinding f58530c;

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28779l
    public final void clear() {
        this.f58530c = null;
    }

    @Override // p852kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        ViewBinding viewBinding;
        ViewBinding viewBinding2 = this.f58530c;
        if (viewBinding2 != null) {
            return viewBinding2;
        }
        View view = (View) this.f58529b.invoke();
        if (view == null || (viewBinding = (ViewBinding) this.f58528a.invoke(view)) == null) {
            return null;
        }
        this.f58530c = viewBinding;
        return viewBinding;
    }

    public C28777j(Function1 function1, Function0 function0) {
        this.f58528a = function1;
        this.f58529b = function0;
    }
}
