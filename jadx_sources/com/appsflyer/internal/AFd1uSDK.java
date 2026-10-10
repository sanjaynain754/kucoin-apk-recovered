package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public interface AFd1uSDK {

    public interface AFa1uSDK {
        void onConfigurationChanged(boolean z11);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(@Nullable AFa1uSDK aFa1uSDK);

    void getMonetizationNetwork();

    void getRevenue(@NonNull Throwable th2, @NonNull String str);
}
