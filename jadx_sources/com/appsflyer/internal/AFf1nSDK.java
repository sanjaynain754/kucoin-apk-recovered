package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1nSDK extends AFe1mSDK<AFf1qSDK> {

    @Nullable
    public final AFf1oSDK areAllFieldsValid;

    @Nullable
    public AFf1qSDK component1;
    public AFi1vSDK component2;
    private final AFc1kSDK component3;
    private final AFf1pSDK component4;
    private final AFf1lSDK copy;
    private final String copydefault;
    private final AFf1fSDK equals;
    private final AFd1mSDK hashCode;
    private final AFf1kSDK toString;

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1qSDK getRevenue() throws Exception {
        try {
            AFf1qSDK aFf1qSDKComponent3 = component3();
            this.component1 = aFf1qSDKComponent3;
            return aFf1qSDKComponent3 == AFf1qSDK.FAILURE ? AFe1qSDK.FAILURE : AFe1qSDK.SUCCESS;
        } catch (InterruptedIOException e11) {
            e = e11;
            AFLogger.INSTANCE.m5975e(AFh1ySDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        } catch (InterruptedException e12) {
            e = e12;
            AFLogger.INSTANCE.m5975e(AFh1ySDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        }
    }

    public AFf1nSDK(@NonNull AFf1pSDK aFf1pSDK, @NonNull AFc1kSDK aFc1kSDK, @NonNull AFf1fSDK aFf1fSDK, @NonNull AFf1lSDK aFf1lSDK, @NonNull AFd1mSDK aFd1mSDK, @NonNull AFf1kSDK aFf1kSDK, @NonNull String str, @Nullable AFf1oSDK aFf1oSDK) {
        super(AFe1oSDK.RC_CDN, new AFe1oSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component4 = aFf1pSDK;
        this.component3 = aFc1kSDK;
        this.equals = aFf1fSDK;
        this.copy = aFf1lSDK;
        this.hashCode = aFd1mSDK;
        this.toString = aFf1kSDK;
        this.copydefault = str;
        this.areAllFieldsValid = aFf1oSDK;
    }

    private void AFAdRevenueData(String str, long j11, AFi1xSDK aFi1xSDK, @Nullable String str2, @Nullable AFe1zSDK<AFi1ySDK> aFe1zSDK) {
        getRevenue(str, j11, aFe1zSDK, aFe1zSDK != null ? aFe1zSDK.getBody() : null, aFi1xSDK, str2 != null ? str2 : null, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066 A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x016b A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x018b A[Catch: all -> 0x0138, IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1qSDK component3() throws InterruptedException, InterruptedIOException {
        String revenue;
        AFLogger aFLogger;
        AFh1ySDK aFh1ySDK;
        AFe1zSDK<AFi1ySDK> aFe1zSDKAFAdRevenueData;
        String monetizationNetwork;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.copydefault;
        String monetizationNetwork2 = this.equals.getMonetizationNetwork();
        if (monetizationNetwork2 == null || monetizationNetwork2.trim().length() == 0) {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str == null) {
                AFLogger.INSTANCE.m5978w(AFh1ySDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                revenue = AFj1dSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component3.getMediationNetwork.getMonetizationNetwork.getPackageName()}), monetizationNetwork2);
            }
            if (revenue == null) {
                AFLogger.INSTANCE.m5977v(AFh1ySDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1qSDK.FAILURE;
            }
            try {
                if (this.toString.getMediationNetwork()) {
                    AFLogger.INSTANCE.m5971d(AFh1ySDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1qSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFh1ySDK = AFh1ySDK.REMOTE_CONTROL;
                aFLogger.m5976i(aFh1ySDK, "Cached config is expired, updating...");
                aFe1zSDKAFAdRevenueData = this.hashCode.AFAdRevenueData(this.toString.getRevenue(), this.toString.AFAdRevenueData(), revenue, 1500).AFAdRevenueData();
                if (aFe1zSDKAFAdRevenueData.isSuccessful()) {
                    AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, aFe1zSDKAFAdRevenueData);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(aFe1zSDKAFAdRevenueData.getStatusCode());
                    aFLogger.m5978w(aFh1ySDK, sb2.toString());
                    return AFf1qSDK.FAILURE;
                }
                AFi1ySDK body = aFe1zSDKAFAdRevenueData.getBody();
                String strAFAdRevenueData = aFe1zSDKAFAdRevenueData.AFAdRevenueData("x-amz-meta-af-auth-v1");
                String strAFAdRevenueData2 = aFe1zSDKAFAdRevenueData.AFAdRevenueData("CF-Cache-Status");
                monetizationNetwork = this.equals.getMonetizationNetwork();
                if (monetizationNetwork != null || monetizationNetwork.trim().length() == 0) {
                    aFLogger.m5978w(aFh1ySDK, "Dev key is not set, SDK is not started.");
                    return AFf1qSDK.FAILURE;
                }
                AFi1tSDK monetizationNetwork3 = this.component4.getMonetizationNetwork(body, strAFAdRevenueData, revenue, monetizationNetwork);
                if (!monetizationNetwork3.getMonetizationNetwork()) {
                    AFAdRevenueData(revenue, jCurrentTimeMillis, monetizationNetwork3.getRevenue, strAFAdRevenueData2, aFe1zSDKAFAdRevenueData);
                    aFLogger.m5978w(aFh1ySDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1qSDK.FAILURE;
                }
                long monetizationNetwork4 = this.toString.getMonetizationNetwork();
                StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                sb3.append(monetizationNetwork4);
                sb3.append(" seconds");
                aFLogger.m5977v(aFh1ySDK, sb3.toString());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AFf1lSDK aFf1lSDK = this.copy;
                String str2 = revenue;
                try {
                    try {
                        aFf1lSDK.getCurrencyIso4217Code.getMonetizationNetwork("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
                        aFf1lSDK.getMonetizationNetwork = aFf1lSDK.getMediationNetwork;
                        aFf1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code("af_rc_timestamp", jCurrentTimeMillis2);
                        aFf1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code("af_rc_max_age", monetizationNetwork4);
                        aFf1lSDK.getMediationNetwork = body;
                        aFf1lSDK.AFAdRevenueData = jCurrentTimeMillis2;
                        aFf1lSDK.getRevenue = monetizationNetwork4;
                        StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb4.append(monetizationNetwork4);
                        sb4.append(" seconds");
                        aFLogger.m5971d(aFh1ySDK, sb4.toString());
                        AFAdRevenueData(str2, jCurrentTimeMillis, monetizationNetwork3.getRevenue, strAFAdRevenueData2, aFe1zSDKAFAdRevenueData);
                        return AFf1qSDK.SUCCESS;
                    } catch (IOException e11) {
                        e = e11;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        IOException iOException = e;
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFh1ySDK aFh1ySDK2 = AFh1ySDK.REMOTE_CONTROL;
                        StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                        sb5.append(iOException.getMessage());
                        aFLogger2.m5975e(aFh1ySDK2, sb5.toString(), iOException, true, false, false);
                        getRevenue(revenue, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                        if (iOException.getCause() instanceof InterruptedIOException) {
                            throw ((InterruptedIOException) iOException.getCause());
                        }
                        return AFf1qSDK.FAILURE;
                    } catch (Throwable th2) {
                        th = th2;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        Throwable th3 = th;
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFh1ySDK aFh1ySDK3 = AFh1ySDK.REMOTE_CONTROL;
                        StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                        sb6.append(th3.getMessage());
                        aFLogger3.m5975e(aFh1ySDK3, sb6.toString(), th3, true, false, false);
                        getRevenue(revenue, jCurrentTimeMillis, null, null, null, null, th3);
                        if (th3.getCause() instanceof InterruptedException) {
                            throw ((InterruptedException) th3.getCause());
                        }
                        return AFf1qSDK.FAILURE;
                    }
                } catch (IOException e12) {
                    e = e12;
                    revenue = str2;
                } catch (Throwable th4) {
                    th = th4;
                    revenue = str2;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        revenue = null;
        if (revenue == null) {
            AFLogger.INSTANCE.m5977v(AFh1ySDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1qSDK.FAILURE;
        }
        if (this.toString.getMediationNetwork()) {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1qSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFh1ySDK = AFh1ySDK.REMOTE_CONTROL;
        aFLogger.m5976i(aFh1ySDK, "Cached config is expired, updating...");
        aFe1zSDKAFAdRevenueData = this.hashCode.AFAdRevenueData(this.toString.getRevenue(), this.toString.AFAdRevenueData(), revenue, 1500).AFAdRevenueData();
        if (aFe1zSDKAFAdRevenueData.isSuccessful()) {
            AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, aFe1zSDKAFAdRevenueData);
            StringBuilder sb7 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb7.append(aFe1zSDKAFAdRevenueData.getStatusCode());
            aFLogger.m5978w(aFh1ySDK, sb7.toString());
            return AFf1qSDK.FAILURE;
        }
        AFi1ySDK body2 = aFe1zSDKAFAdRevenueData.getBody();
        String strAFAdRevenueData3 = aFe1zSDKAFAdRevenueData.AFAdRevenueData("x-amz-meta-af-auth-v1");
        String strAFAdRevenueData4 = aFe1zSDKAFAdRevenueData.AFAdRevenueData("CF-Cache-Status");
        monetizationNetwork = this.equals.getMonetizationNetwork();
        if (monetizationNetwork != null) {
        }
        aFLogger.m5978w(aFh1ySDK, "Dev key is not set, SDK is not started.");
        return AFf1qSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 1500L;
    }

    private void getRevenue(String str, long j11, @Nullable AFe1zSDK<?> aFe1zSDK, AFi1ySDK aFi1ySDK, AFi1xSDK aFi1xSDK, @Nullable String str2, @Nullable Throwable th2) {
        long j12;
        int statusCode;
        Throwable th3;
        if (aFe1zSDK != null) {
            j12 = aFe1zSDK.getMonetizationNetwork.getRevenue;
            statusCode = aFe1zSDK.getStatusCode();
        } else {
            j12 = 0;
            statusCode = 0;
        }
        int i11 = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j12 = ((HttpException) th2).getMetrics().getRevenue;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.component2 = new AFi1vSDK(aFi1ySDK != null ? aFi1ySDK.getCurrencyIso4217Code : null, str, j12, System.currentTimeMillis() - j11, i11, aFi1xSDK, str2, th3);
    }
}
