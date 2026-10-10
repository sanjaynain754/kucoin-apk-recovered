package com.kubi.kyc.vendor.jumio.p095ui;

import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.v */
/* JADX INFO: compiled from: JumioKubiActivity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class C17336v implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f31689b;

    public C17336v(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f31689b = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p852kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.f31689b;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f31689b.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
