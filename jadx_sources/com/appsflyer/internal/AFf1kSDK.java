package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\t\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, m90084d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFf1lSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFf1lSDK;)V", "", "getMonetizationNetwork", "()J", "", "getMediationNetwork", "()Z", "Lcom/appsflyer/internal/AFc1kSDK;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", "getRevenue", "AFAdRevenueData", "Lcom/appsflyer/internal/AFf1lSDK;", "AFa1vSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFf1kSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFf1lSDK getRevenue;

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMonetizationNetwork;

    public AFf1kSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFf1lSDK aFf1lSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFf1lSDK, "");
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = aFf1lSDK;
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1kSDK.4
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1kSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1kSDK.1
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1kSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }
        });
    }

    @JvmName(name = "AFAdRevenueData")
    public final boolean AFAdRevenueData() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    public final boolean getMediationNetwork() {
        AFi1uSDK aFi1uSDK;
        AFi1ySDK aFi1ySDK = this.getRevenue.getMediationNetwork;
        if (aFi1ySDK == null) {
            AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1ySDK.getRevenue;
        boolean revenue = (aFi1zSDK == null || (aFi1uSDK = aFi1zSDK.getRevenue) == null) ? false : aFi1uSDK.getRevenue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1lSDK aFf1lSDK = this.getRevenue;
        return revenue || jCurrentTimeMillis - aFf1lSDK.AFAdRevenueData > TimeUnit.SECONDS.toMillis(aFf1lSDK.getRevenue);
    }

    public final long getMonetizationNetwork() {
        Object objM103844constructorimpl;
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            objM103844constructorimpl = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) objM103844constructorimpl).longValue();
    }

    @JvmName(name = "getRevenue")
    public final boolean getRevenue() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }
}
