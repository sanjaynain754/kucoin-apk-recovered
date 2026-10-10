package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1pSDK {
    void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull AFh1mSDK aFh1mSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i11, int i12);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFe1oSDK aFe1oSDK);

    void getMediationNetwork(@NotNull AFh1mSDK aFh1mSDK);

    long getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map);

    @Nullable
    Long getRevenue();

    void getRevenue(@NotNull AFh1mSDK aFh1mSDK);

    void getRevenue(@NotNull Map<String, Object> map);
}
