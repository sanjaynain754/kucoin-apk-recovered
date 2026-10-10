package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1xSDK {

    @NotNull
    private final String AFAdRevenueData;

    @NotNull
    private final Map<String, Object> getCurrencyIso4217Code;

    @Nullable
    private final PackageManager getMonetizationNetwork;

    public AFg1xSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.getCurrencyIso4217Code = new LinkedHashMap();
        Context context = aFc1fSDK.getMonetizationNetwork;
        this.getMonetizationNetwork = context != null ? context.getPackageManager() : null;
        String packageName = aFc1kSDK.getMediationNetwork.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFAdRevenueData = packageName;
    }

    @RequiresApi(30)
    private final Map<String, Object> getCurrencyIso4217Code() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.AFAdRevenueData;
            PackageManager packageManager = this.getMonetizationNetwork;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                }
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put("installing_package", installingPackageName);
                }
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put("originating_package", originatingPackageName);
                }
                return linkedHashMap2;
            }
        } catch (Throwable th2) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.DEVICE_DATA, "Failed to get the app install source info", th2, true, false, true, true, 16, null);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        String installerPackageName;
        if (this.getCurrencyIso4217Code.isEmpty()) {
            try {
                PackageManager packageManager = this.getMonetizationNetwork;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFAdRevenueData)) != null) {
                    this.getCurrencyIso4217Code.put("installer_package", installerPackageName);
                }
            } catch (Exception e11) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e11);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.getCurrencyIso4217Code.put("install_source_info", getCurrencyIso4217Code());
            }
        }
        return this.getCurrencyIso4217Code;
    }
}
