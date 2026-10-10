package com.sumsub.sns.internal.core.presentation.common;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28784q implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28787t f58540a;

    public C28784q(AbstractC28787t abstractC28787t) {
        this.f58540a = abstractC28787t;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        this.f58540a.m69612f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f58540a.m69613g();
        lifecycleOwner.getLifecycle().removeObserver(this);
    }
}
