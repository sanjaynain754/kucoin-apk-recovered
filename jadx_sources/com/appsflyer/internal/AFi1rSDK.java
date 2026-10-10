package com.appsflyer.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1rSDK {

    @Nullable
    public AFi1qSDK AFAdRevenueData;

    @NotNull
    public final Context getCurrencyIso4217Code;

    public AFi1rSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getCurrencyIso4217Code = context;
    }
}
