package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.core.constants.ConstantsKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFd1hSDK {
    private final int AFAdRevenueData;

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @NonNull
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e11) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.mo5915e(AFh1ySDK.HTTP_CLIENT, e11.getMessage() != null ? e11.getMessage() : "", e11, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z11 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z11) {
                            sb2.append('\n');
                        }
                        sb2.append(line);
                        z11 = false;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th2 = th3;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th2;
                        }
                        bufferedReader.close();
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th2;
        }
        bufferedReader.close();
        throw th2;
    }

    public final AFe1zSDK<String> AFAdRevenueData(AFd1aSDK aFd1aSDK) throws IOException {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1aSDK.getRevenue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1aSDK.getMediationNetwork);
            sb2.append(C33844oi.f71346o);
            sb2.append(aFd1aSDK.getCurrencyIso4217Code);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] revenue2 = aFd1aSDK.getRevenue();
            if (aFd1aSDK.getCurrencyIso4217Code() && revenue2 != null) {
                try {
                    String str = aFd1aSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th3) {
                    httpURLConnection = null;
                    th2 = th3;
                    try {
                        AFd1eSDK aFd1eSDK = new AFd1eSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th2);
                        sb4.append("\n took ");
                        sb4.append(aFd1eSDK.getRevenue);
                        sb4.append("ms");
                        String string = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1ySDK aFh1ySDK = AFh1ySDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1aSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(string);
                        aFLogger.m5975e(aFh1ySDK, sb5.toString(), th2, false, false, false);
                        throw new HttpException(th2, aFd1eSDK);
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th4;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1aSDK.getRevenue.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1aSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.m5971d(AFh1ySDK.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFd1aSDK.getCurrencyIso4217Code).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFd1aSDK.getMediationNetwork);
                if (aFd1aSDK.AFAdRevenueData()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1aSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i11 = this.AFAdRevenueData;
                    int i12 = aFd1aSDK.component3;
                    if (i12 != -1) {
                        i11 = i12;
                    }
                    httpURLConnection2.setConnectTimeout(i11);
                    httpURLConnection2.setReadTimeout(i11);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1aSDK.getMediationNetwork() ? ConstantsKt.MIME_TYPE_OCTET_STREAM : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1aSDK.getRevenue.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z11 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = aFd1aSDK.getMonetizationNetwork() ? getMediationNetwork(httpURLConnection2) : "";
                    AFd1eSDK aFd1eSDK2 = new AFd1eSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(C33627eb.f69716f);
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(mediationNetwork);
                    sb8.append("\n took ");
                    sb8.append(aFd1eSDK2.getRevenue);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1ySDK aFh1ySDK2 = AFh1ySDK.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1aSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    aFLogger2.m5971d(aFh1ySDK2, sb9.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFe1zSDK<String> aFe1zSDK = new AFe1zSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z11, map, aFd1eSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1zSDK;
                } catch (Throwable th7) {
                    th = th7;
                    th2 = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1eSDK aFd1eSDK3 = new AFd1eSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb10 = new StringBuilder("error: ");
                    sb10.append(th2);
                    sb10.append("\n took ");
                    sb10.append(aFd1eSDK3.getRevenue);
                    sb10.append("ms");
                    String string3 = sb10.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFh1ySDK aFh1ySDK3 = AFh1ySDK.HTTP_CLIENT;
                    StringBuilder sb11 = new StringBuilder("[");
                    sb11.append(aFd1aSDK.hashCode());
                    sb11.append("] ");
                    sb11.append(string3);
                    aFLogger3.m5975e(aFh1ySDK3, sb11.toString(), th2, false, false, false);
                    throw new HttpException(th2, aFd1eSDK3);
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th2 = th9;
            httpURLConnection = null;
        }
    }

    public AFd1hSDK(int i11) {
        this.AFAdRevenueData = i11;
    }
}
