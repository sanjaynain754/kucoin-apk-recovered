package com.sumsub.sns.internal.core.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28404L implements ReadOnlyProperty {

    /* JADX INFO: renamed from: a */
    public View f57905a;

    /* JADX INFO: renamed from: b */
    public boolean f57906b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f57907c;

    public C28404L(int i11) {
        this.f57907c = i11;
    }

    @Override // p852kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        Fragment fragment = (Fragment) obj;
        View view = fragment.getView();
        if (view == null) {
            return null;
        }
        View view2 = this.f57905a;
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById = view.findViewById(this.f57907c);
        if (viewFindViewById != null) {
            this.f57905a = viewFindViewById;
        }
        if (!this.f57906b) {
            this.f57906b = true;
            fragment.getViewLifecycleOwner().getLifecycle().addObserver(new C28402K(this, fragment));
        }
        return this.f57905a;
    }
}
