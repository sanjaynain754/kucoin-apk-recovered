package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFh1xSDK implements AFg1aSDK {

    @Nullable
    private AFh1wSDK AFAdRevenueData;

    @Nullable
    private AFg1cSDK getCurrencyIso4217Code;

    @NotNull
    private final AFd1zSDK getMediationNetwork;

    @Nullable
    private AFg1eSDK getMonetizationNetwork;

    public AFh1xSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void AFAdRevenueData() {
        AFg1cSDK aFg1cSDK = this.getCurrencyIso4217Code;
        if (aFg1cSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK.v$default(aFLogger, AFh1ySDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1cSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void component2() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMonetizationNetwork == null) {
            this.getMonetizationNetwork = new AFg1eSDK();
        }
        AFg1eSDK aFg1eSDK = this.getMonetizationNetwork;
        Intrinsics.checkNotNull(aFg1eSDK);
        aFLogger.registerClient(aFg1eSDK);
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void getCurrencyIso4217Code() {
        AFh1wSDK aFh1wSDK = this.AFAdRevenueData;
        if (aFh1wSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK.v$default(aFLogger, AFh1ySDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFh1wSDK(this.getMediationNetwork);
        }
        AFh1wSDK aFh1wSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFh1wSDK);
        aFLogger.registerClient(aFh1wSDK);
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void getMonetizationNetwork() {
        AFg1eSDK aFg1eSDK = this.getMonetizationNetwork;
        if (aFg1eSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK.v$default(aFLogger, AFh1ySDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1eSDK);
            this.getMonetizationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFg1cSDK(this.getMediationNetwork);
        }
        AFg1cSDK aFg1cSDK = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(aFg1cSDK);
        aFLogger.registerClient(aFg1cSDK);
    }
}
