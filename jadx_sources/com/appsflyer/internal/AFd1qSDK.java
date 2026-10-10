package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, m90084d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "AFAdRevenueData", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1jSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1jSDK;", "()Lcom/appsflyer/internal/AFd1jSDK;", "getMonetizationNetwork", "()Ljava/lang/String;", "AFa1tSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFd1qSDK extends AFc1bSDK {

    @NotNull
    public static String getCurrencyIso4217Code = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    @NotNull
    private final AFd1jSDK getMediationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1qSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        super(bArr, map, i11);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = AFd1jSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NotNull
    public final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.getMonetizationNetwork(str);
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @JvmName(name = "getMediationNetwork")
    @NotNull
    /* JADX INFO: renamed from: getMediationNetwork, reason: from getter */
    public final AFd1jSDK getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @JvmName(name = "getMonetizationNetwork")
    @NotNull
    public final String getMonetizationNetwork() {
        String str = String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
