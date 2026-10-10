package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1ySDK implements AFj1vSDK {
    /* JADX INFO: renamed from: A_ */
    private static ProviderInfo m6019A_(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.REFERRER;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            AFg1bSDK.e$default(aFLogger, aFh1ySDK, message, th2, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1vSDK
    public final boolean AFAdRevenueData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return m6019A_(context) != null;
    }

    @Override // com.appsflyer.internal.AFj1vSDK
    public final boolean getRevenue(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo providerInfoM6019A_ = m6019A_(context);
        if (providerInfoM6019A_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoM6019A_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.REFERRER;
            String message = th2.getMessage();
            AFg1bSDK.e$default(aFLogger, aFh1ySDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            return false;
        }
    }
}
