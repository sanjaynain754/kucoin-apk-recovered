package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1gSDK<T> {

    @NotNull
    public final Function0<T> getMediationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1gSDK(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getMediationNetwork = function0;
    }
}
