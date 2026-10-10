package com.sumsub.sns.internal.core.presentation.bottomsheet;

import androidx.lifecycle.Observer;
import p852kotlin.Function;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28724h implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f58410a;

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p852kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f58410a;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f58410a.invoke(obj);
    }

    public C28724h(Function1 function1) {
        this.f58410a = function1;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
