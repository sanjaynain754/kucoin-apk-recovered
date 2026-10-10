package com.sumsub.sns.internal.core.presentation.bottomsheet;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28722f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28725i f58408a;

    public C28722f(AbstractC28725i abstractC28725i) {
        this.f58408a = abstractC28725i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f58408a.f58412e = null;
        lifecycleOwner.getLifecycle().removeObserver(this);
    }
}
