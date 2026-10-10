package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK implements AFg1zSDK {

    @NotNull
    private final Context getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMediationNetwork;

    public AFf1bSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1zSDK
    @Nullable
    public final AFg1ySDK AFAdRevenueData() {
        String string;
        if (!Boolean.parseBoolean(this.getMediationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getCurrencyIso4217Code);
            int i11 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i14 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i11 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1ySDK(i13, i11, i12, i14, str);
        } catch (Exception e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.DMA, "TCF data collection exception", e11, false, false, false, false, 120, null);
            return null;
        }
    }
}
