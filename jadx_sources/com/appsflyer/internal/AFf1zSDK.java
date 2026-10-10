package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nResolveDdlTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,278:1\n1#2:279\n1#2:290\n1603#3,9:280\n1855#3:289\n1856#3:291\n1612#3:292\n1855#3,2:296\n3792#4:293\n4307#4,2:294\n*S KotlinDebug\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n*L\n104#1:290\n104#1:280,9\n104#1:289\n104#1:291\n104#1:292\n202#1:296,2\n197#1:293\n197#1:294,2\n*E\n"})
public final class AFf1zSDK extends AFe1cSDK<DdlResponse> {
    private int AFInAppEventParameterName;
    private int AFInAppEventType;

    @NotNull
    private final CountDownLatch AFKeystoreWrapper;

    @NotNull
    private final List<AFj1tSDK> AFLogger;

    @NotNull
    private final AFa1rSDK component1;

    @NotNull
    private final AFc1iSDK copy;

    @NotNull
    private final AFc1kSDK copydefault;

    @NotNull
    private final AFh1tSDK equals;

    @NotNull
    private final AFj1sSDK hashCode;
    private int registerClient;

    @NotNull
    private final AFa1qSDK toString;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK, AFf1zSDK aFf1zSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, aFj1tSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1zSDK.AFAdRevenueData((AFj1tSDK) observable);
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5964a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1qSDK.values().length];
            try {
                iArr[AFe1qSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1qSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1ySDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1zSDK(@NotNull AFa1rSDK aFa1rSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1oSDK.DLSDK, new AFe1oSDK[]{AFe1oSDK.RC_CDN, AFe1oSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component1 = aFa1rSDK;
        this.AFKeystoreWrapper = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1kSDK currencyIso4217Code = aFd1zSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.copydefault = currencyIso4217Code;
        AFc1iSDK aFc1iSDKMo5949v = aFd1zSDK.mo5949v();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKMo5949v, "");
        this.copy = aFc1iSDKMo5949v;
        AFa1qSDK aFa1qSDKMo5947e = aFd1zSDK.mo5947e();
        Intrinsics.checkNotNullExpressionValue(aFa1qSDKMo5947e, "");
        this.toString = aFa1qSDKMo5947e;
        AFh1tSDK aFh1tSDKComponent3 = aFd1zSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFh1tSDKComponent3, "");
        this.equals = aFh1tSDKComponent3;
        AFj1sSDK aFj1sSDKAFLogger = aFd1zSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFj1sSDKAFLogger, "");
        this.hashCode = aFj1sSDKAFLogger;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1sSDKAFLogger.getCurrencyIso4217Code.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList<AFj1tSDK> arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.areAllFieldsValid != AFj1tSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        for (final AFj1tSDK aFj1tSDK2 : arrayList) {
            AFj1tSDK.AFa1ySDK aFa1ySDK = aFj1tSDK2.areAllFieldsValid;
            int i11 = aFa1ySDK == null ? -1 : AFa1ySDK.AFAdRevenueData[aFa1ySDK.ordinal()];
            if (i11 == 1) {
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, aFj1tSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                AFAdRevenueData(aFj1tSDK2);
            } else if (i11 == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.w
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1zSDK.getCurrencyIso4217Code(aFj1tSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final void AFAdRevenueData(AFj1tSDK aFj1tSDK) {
        if (!getCurrencyIso4217Code(aFj1tSDK)) {
            int i11 = this.AFInAppEventType + 1;
            this.AFInAppEventType = i11;
            if (i11 == this.AFInAppEventParameterName) {
                this.AFKeystoreWrapper.countDown();
                return;
            }
            return;
        }
        this.AFLogger.add(aFj1tSDK);
        this.AFKeystoreWrapper.countDown();
        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Added non-organic " + aFj1tSDK.getClass().getSimpleName(), false, 4, null);
    }

    private final boolean copy() {
        Object obj = this.component1.getMonetizationNetwork.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component1.getMonetizationNetwork.containsKey("referrers");
    }

    private static Map<String, String> getMediationNetwork(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1jSDK.getMediationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.m90091to("type", "unhashed"), TuplesKt.m90091to("value", str));
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    @NotNull
    public final AFe1qSDK getRevenue() {
        AFe1qSDK aFe1qSDK = AFe1qSDK.FAILURE;
        try {
            AFe1qSDK revenue = super.getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            try {
                AFh1tSDK aFh1tSDK = this.equals;
                int i11 = this.registerClient;
                if (i11 <= 0 || i11 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
                } else {
                    int i12 = i11 - 1;
                    aFh1tSDK.component3[i12] = System.currentTimeMillis();
                    long j11 = aFh1tSDK.component4[i12];
                    if (j11 != 0) {
                        long[] jArr = aFh1tSDK.component2;
                        jArr[i12] = aFh1tSDK.component3[i12] - j11;
                        aFh1tSDK.AFAdRevenueData.put("net", jArr);
                    } else {
                        StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                        sb2.append(i12);
                        sb2.append("] ts is missing");
                        AFLogger.afInfoLog(sb2.toString());
                    }
                }
                int i13 = AFa1ySDK.getCurrencyIso4217Code[revenue.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        return revenue;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1ySDK aFh1ySDK = AFh1ySDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1cSDK) this).component2;
                    AFg1bSDK.d$default(aFLogger, aFh1ySDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.equals.getMediationNetwork(deepLinkResult, this.toString.component2);
                    this.toString.getCurrencyIso4217Code(deepLinkResult);
                    return revenue;
                }
                ResponseNetwork responseNetwork2 = ((AFe1cSDK) this).component2;
                Intrinsics.checkNotNull(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                DdlResponse ddlResponse = (DdlResponse) body;
                DeepLink deepLink = ddlResponse.deepLink;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.equals.getMediationNetwork(deepLinkResult2, this.toString.component2);
                    this.toString.getCurrencyIso4217Code(deepLinkResult2);
                    return revenue;
                }
                if (this.registerClient > 1 || !ddlResponse.getSecondPing() || !copy()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.equals.getMediationNetwork(deepLinkResult3, this.toString.component2);
                    this.toString.getCurrencyIso4217Code(deepLinkResult3);
                    return revenue;
                }
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFKeystoreWrapper.await();
                AFh1tSDK aFh1tSDK2 = this.equals;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j12 = aFh1tSDK2.component3[0];
                if (j12 != 0) {
                    aFh1tSDK2.AFAdRevenueData.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j12));
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFInAppEventType != this.AFInAppEventParameterName) {
                    return getRevenue();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.equals.getMediationNetwork(deepLinkResult4, this.toString.component2);
                this.toString.getCurrencyIso4217Code(deepLinkResult4);
                return AFe1qSDK.SUCCESS;
            } catch (Exception e11) {
                e = e11;
                aFe1qSDK = revenue;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.toString.component2 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.equals.getMediationNetwork(deepLinkResult5, this.toString.component2);
                    this.toString.getCurrencyIso4217Code(deepLinkResult5);
                    return AFe1qSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.equals.getMediationNetwork(deepLinkResult6, this.toString.component2);
                    this.toString.getCurrencyIso4217Code(deepLinkResult6);
                    return aFe1qSDK;
                }
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.equals.getMediationNetwork(deepLinkResult7, this.toString.component2);
                this.toString.getCurrencyIso4217Code(deepLinkResult7);
                return aFe1qSDK;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private static boolean getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l11 = obj instanceof Long ? (Long) obj : null;
        if (l11 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l11.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFe1cSDK
    @NotNull
    public final AFd1iSDK<DdlResponse> AFAdRevenueData(@NotNull String str) {
        Map mapMapOf;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i11 = this.registerClient + 1;
        this.registerClient = i11;
        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.DDL, "Preparing request " + i11, false, 4, null);
        Map<String, Object> map = this.component1.getMonetizationNetwork;
        AFk1ySDK aFk1ySDK = null;
        Object[] objArr = 0;
        if (this.registerClient == 1) {
            map.put("is_first", Boolean.valueOf(this.copydefault.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0));
            map.put("lang", Locale.getDefault().getLanguage() + C33820nf.f71144W + Locale.getDefault().getCountry());
            map.put(C33556b3.f69078o2, Build.VERSION.RELEASE);
            map.put("type", Build.MODEL);
            map.put("request_id", AFb1mSDK.getRevenue(this.copydefault.getRevenue));
            AFb1vSDK aFb1vSDK = this.copy.getMonetizationNetwork;
            if (aFb1vSDK != null && (strArr = aFb1vSDK.getRevenue) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map.put("sharing_filter", strArr);
            }
            AdvertisingIdData advertisingIdData = this.copydefault.AFAdRevenueData.component3;
            Map<String, String> mediationNetwork = getMediationNetwork(advertisingIdData != null ? new AFb1jSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null);
            if (mediationNetwork != null) {
                map.put("gaid", mediationNetwork);
            }
            Map<String, String> mediationNetwork2 = getMediationNetwork(AFb1iSDK.AFAdRevenueData(this.copydefault.getMediationNetwork.getMonetizationNetwork));
            if (mediationNetwork2 != null) {
                map.put("oaid", mediationNetwork2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        map.put("request_count", Integer.valueOf(this.registerClient));
        List<AFj1tSDK> list = this.AFLogger;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.areAllFieldsValid == AFj1tSDK.AFa1ySDK.FINISHED) {
                Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.getMediationNetwork.get("source");
                    Intrinsics.checkNotNull(obj2, "");
                    mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("source", (String) obj2), TuplesKt.m90091to("value", str2));
                } else {
                    mapMapOf = null;
                }
            } else {
                mapMapOf = null;
            }
            if (mapMapOf != null) {
                arrayList.add(mapMapOf);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put("referrers", arrayList);
        }
        AFa1rSDK aFa1rSDK = this.component1;
        AFj1eSDK aFj1eSDK = new AFj1eSDK(this.copydefault, aFk1ySDK, 2, objArr == true ? 1 : 0);
        String monetizationNetwork = ((AFe1cSDK) this).component3.getMonetizationNetwork();
        Object obj3 = this.component1.getMonetizationNetwork.get("timestamp");
        Intrinsics.checkNotNull(obj3, "");
        aFa1rSDK.component4 = aFj1eSDK.getCurrencyIso4217Code(monetizationNetwork, (String) obj3);
        AFh1tSDK aFh1tSDK = this.equals;
        int i12 = this.registerClient;
        if (i12 > 0 && i12 <= 2) {
            int i13 = i12 - 1;
            aFh1tSDK.component4[i13] = System.currentTimeMillis();
            if (i13 == 0) {
                long j11 = aFh1tSDK.component1;
                if (j11 != 0) {
                    aFh1tSDK.AFAdRevenueData.put("from_fg", Long.valueOf(aFh1tSDK.component4[i13] - j11));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i12))));
        }
        AFd1iSDK<DdlResponse> aFd1iSDKAFAdRevenueData = ((AFe1cSDK) this).component4.AFAdRevenueData(this.component1);
        Intrinsics.checkNotNullExpressionValue(aFd1iSDKAFAdRevenueData, "");
        return aFd1iSDKAFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return this.toString.component2;
    }
}
