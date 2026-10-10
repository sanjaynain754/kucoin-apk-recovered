package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d"}, m90084d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getRevenue", "()Z", "Ljava/net/HttpURLConnection;", "AFAdRevenueData", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "getMonetizationNetwork", "(Ljava/net/HttpURLConnection;J)Z", "[B", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1jSDK;", "()Lcom/appsflyer/internal/AFd1jSDK;", "Ljava/util/Map;", "getCurrencyIso4217Code", "Z", "I", "()Ljava/lang/String;", "areAllFieldsValid"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMonitorHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n215#2,2:135\n215#2,2:138\n1#3:137\n*S KotlinDebug\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n*L\n58#1:135,2\n104#1:138,2\n*E\n"})
public abstract class AFc1bSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public byte[] getMediationNetwork;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final boolean getRevenue;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    public int getMonetizationNetwork;

    private static String AFAdRevenueData(HttpURLConnection p11) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p11.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.HTTP_CLIENT;
            String message = th2.getMessage();
            AFg1bSDK.e$default(aFLogger, aFh1ySDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = p11.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJoinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strJoinToString$default == null ? "" : strJoinToString$default;
    }

    private final boolean getMonetizationNetwork(HttpURLConnection httpURLConnection, long j11) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + C33844oi.f71346o + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getMediationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getGetRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getMonetizationNetwork);
        httpURLConnection.setConnectTimeout(this.getMonetizationNetwork);
        httpURLConnection.addRequestProperty("Content-Type", getGetMediationNetwork().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMediationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMediationNetwork);
        bufferedOutputStream.close();
        String strAFAdRevenueData2 = AFAdRevenueData(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        String str = "response code:" + httpURLConnection.getResponseCode() + C33627eb.f69716f + httpURLConnection.getResponseMessage() + "\n\tbody:" + strAFAdRevenueData2 + "\n\ttook " + jCurrentTimeMillis + "ms";
        String strAFAdRevenueData3 = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData3);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData3);
        }
        return AFd1sSDK.getCurrencyIso4217Code(httpURLConnection);
    }

    @NotNull
    public abstract String AFAdRevenueData(@NotNull String str);

    @JvmName(name = "getMediationNetwork")
    @NotNull
    /* JADX INFO: renamed from: getMediationNetwork */
    public abstract AFd1jSDK getGetMediationNetwork();

    @JvmName(name = "getMonetizationNetwork")
    @NotNull
    public abstract String getMonetizationNetwork();

    public AFc1bSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = i11;
        this.getRevenue = true;
    }

    @JvmName(name = "getCurrencyIso4217Code")
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from getter */
    public boolean getGetRevenue() {
        return this.getRevenue;
    }

    @WorkerThread
    public final boolean getRevenue() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String monetizationNetwork = getMonetizationNetwork();
            Intrinsics.checkNotNullParameter(monetizationNetwork, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(monetizationNetwork).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            try {
                boolean monetizationNetwork2 = getMonetizationNetwork(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return monetizationNetwork2;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getGetRevenue()) {
                        AFLogger.afRDLog(strAFAdRevenueData);
                    } else {
                        AFLogger.afVerboseLog(strAFAdRevenueData);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
