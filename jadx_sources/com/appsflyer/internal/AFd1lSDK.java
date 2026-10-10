package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0017\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, m90084d2 = {"Lcom/appsflyer/internal/AFd1lSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;[BLjava/util/Map;I)V", "AFAdRevenueData", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1jSDK;", "component1", "Lcom/appsflyer/internal/AFd1jSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1jSDK;", "getRevenue", "Lcom/appsflyer/internal/AFc1kSDK;", "", "getCurrencyIso4217Code", "Z", "()Z", "getMonetizationNetwork", "()Ljava/lang/String;"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFd1lSDK extends AFc1bSDK {

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFd1jSDK getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final boolean AFAdRevenueData;

    @NotNull
    public AFc1kSDK getMediationNetwork;

    public /* synthetic */ AFd1lSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, bArr, (i12 & 4) != 0 ? null : map, (i12 & 8) != 0 ? 2000 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFd1lSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        super(bArr, map, i11);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = AFd1jSDK.OCTET_STREAM;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NotNull
    public final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @JvmName(name = "getCurrencyIso4217Code")
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from getter */
    public final boolean getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @JvmName(name = "getMediationNetwork")
    @NotNull
    /* JADX INFO: renamed from: getMediationNetwork, reason: from getter */
    public final AFd1jSDK getGetRevenue() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @JvmName(name = "getMonetizationNetwork")
    @NotNull
    public final String getMonetizationNetwork() {
        AFj1eSDK aFj1eSDK = new AFj1eSDK(this.getMediationNetwork, null, 2, null);
        return aFj1eSDK.AFAdRevenueData(aFj1eSDK.getMediationNetwork.AFAdRevenueData(AFj1eSDK.component2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFd1lSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull byte[] bArr) {
        this(aFc1kSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
