package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1wSDK extends AFg1bSDK {
    private final boolean AFAdRevenueData;

    @NotNull
    private final AFd1zSDK getMediationNetwork;

    public AFh1wSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
        this.AFAdRevenueData = true;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: d */
    public final void mo5914d(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("D", getRevenue(str, aFh1ySDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: e */
    public final void mo5915e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z14) {
            this.getMediationNetwork.copy().getMediationNetwork(ExifInterface.LONGITUDE_EAST, getRevenue(str, aFh1ySDK));
        }
        if (z14) {
            this.getMediationNetwork.copy().getCurrencyIso4217Code(th2);
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void force(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork.copy().getMediationNetwork("F", getRevenue(str, aFh1ySDK));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final boolean getShouldExtendMsg() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: i */
    public final void mo5916i(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("I", getRevenue(str, aFh1ySDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: v */
    public final void mo5917v(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, getRevenue(str, aFh1ySDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: w */
    public final void mo5918w(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork(ExifInterface.LONGITUDE_WEST, getRevenue(str, aFh1ySDK));
        }
    }
}
