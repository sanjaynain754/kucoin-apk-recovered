package com.sumsub.sns.internal.core.common;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28402K implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28404L f57894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f57895b;

    public C28402K(C28404L c28404l, Fragment fragment) {
        this.f57894a = c28404l;
        this.f57895b = fragment;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C28404L c28404l = this.f57894a;
        c28404l.f57905a = null;
        c28404l.f57906b = false;
        this.f57895b.getViewLifecycleOwner().getLifecycle().removeObserver(this);
    }
}
