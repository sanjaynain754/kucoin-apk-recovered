package com.sumsub.sns.internal.core.presentation.bottomsheet;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28779l;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28723g implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28725i f58409a;

    public C28723g(AbstractC28725i abstractC28725i) {
        this.f58409a = abstractC28725i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        this.f58409a.mo69551p();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f58409a.mo69552q();
        ArrayList arrayList = this.f58409a.f58413f;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((InterfaceC28779l) obj).clear();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }
}
