package com.sumsub.sns.internal.core.common;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Function;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28419T implements InterfaceC41635f, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f57932a;

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return this.f57932a.invoke(obj, continuation);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC41635f) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p852kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f57932a;
    }

    public C28419T(Function2 function2) {
        this.f57932a = function2;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
