package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1hSDK extends AFh1mSDK {

    @Nullable
    public final AFe1oSDK hashCode;

    @Deprecated
    public AFh1hSDK() {
        this.hashCode = null;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1oSDK AFAdRevenueData() {
        AFe1oSDK aFe1oSDK = this.hashCode;
        return aFe1oSDK != null ? aFe1oSDK : AFe1oSDK.CACHED_EVENT;
    }

    public AFh1hSDK(String str, byte[] bArr, String str2, @Nullable AFe1oSDK aFe1oSDK, @Nullable Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component3 = str2;
        getCurrencyIso4217Code(bArr);
        this.hashCode = aFe1oSDK;
        if (map != null) {
            this.getCurrencyIso4217Code.putAll(map);
        }
    }
}
