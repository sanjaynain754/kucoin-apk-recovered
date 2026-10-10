package com.sumsub.sns.internal.core.common;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28421U {
    /* JADX INFO: renamed from: a */
    public static final void m69304a(InterfaceC41634e interfaceC41634e, LifecycleOwner lifecycleOwner, Function2 function2) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C28408N(lifecycleOwner, interfaceC41634e, function2, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC41775x1 m69305b(InterfaceC41634e interfaceC41634e, LifecycleOwner lifecycleOwner, Function2 function2) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C28417S(lifecycleOwner, interfaceC41634e, function2, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC41775x1 m69303a(InterfaceC41634e interfaceC41634e, InterfaceC41709m0 interfaceC41709m0, Function2 function2) {
        return C41696j.m91104d(interfaceC41709m0, null, null, new C28410O(null, function2, interfaceC41634e), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC41775x1 m69306b(InterfaceC41634e interfaceC41634e, InterfaceC41709m0 interfaceC41709m0, Function2 function2) {
        return C41696j.m91104d(interfaceC41709m0, null, null, new C28412P(null, function2, interfaceC41634e), 3, null);
    }
}
