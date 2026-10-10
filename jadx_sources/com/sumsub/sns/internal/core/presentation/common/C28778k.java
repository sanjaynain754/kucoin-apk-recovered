package com.sumsub.sns.internal.core.presentation.common;

import android.view.View;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28778k implements ReadOnlyProperty, InterfaceC28779l {

    /* JADX INFO: renamed from: a */
    public final int f58531a;

    /* JADX INFO: renamed from: b */
    public final Function0 f58532b;

    /* JADX INFO: renamed from: c */
    public View f58533c;

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28779l
    public final void clear() {
        this.f58533c = null;
    }

    @Override // p852kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        View viewFindViewById;
        View view = this.f58533c;
        if (view != null) {
            return view;
        }
        View view2 = (View) this.f58532b.invoke();
        if (view2 == null || (viewFindViewById = view2.findViewById(this.f58531a)) == null) {
            return null;
        }
        this.f58533c = viewFindViewById;
        return viewFindViewById;
    }

    public C28778k(int i11, Function0 function0) {
        this.f58531a = i11;
        this.f58532b = function0;
    }
}
