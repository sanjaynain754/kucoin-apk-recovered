package com.revolut.revolutpay.p123ui.picker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.h */
/* JADX INFO: loaded from: classes59.dex */
public final class C27571h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27571h f56311a = new C27571h();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static Function1<? super C27567d.a, Unit> f56312b;

    /* JADX INFO: renamed from: a */
    public final void m68405a() {
        f56312b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m68406b(@NotNull C27567d.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Function1<? super C27567d.a, Unit> function1 = f56312b;
        if (function1 != null) {
            function1.invoke(result);
        }
    }
}
