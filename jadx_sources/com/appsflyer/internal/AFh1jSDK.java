package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1jSDK extends AFh1mSDK {

    @Nullable
    public final Map<String, Object> copy;

    @NonNull
    public final AFAdRevenueData toString;

    public AFh1jSDK(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.toString = aFAdRevenueData;
        this.copy = map;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1oSDK AFAdRevenueData() {
        return AFe1oSDK.ADREVENUE;
    }
}
