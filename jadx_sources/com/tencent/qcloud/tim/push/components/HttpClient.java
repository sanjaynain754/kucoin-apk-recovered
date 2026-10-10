package com.tencent.qcloud.tim.push.components;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes56.dex */
public class HttpClient {

    /* JADX INFO: renamed from: c */
    public static final String f74860c = "HttpClient";

    /* JADX INFO: renamed from: d */
    public static final int f74861d = 15000;

    /* JADX INFO: renamed from: e */
    public static final int f74862e = 15000;

    /* JADX INFO: renamed from: f */
    public static volatile HttpClient f74863f;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f74864a = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: b */
    public final Handler f74865b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static HttpClient m76828a() {
        if (f74863f == null) {
            synchronized (HttpClient.class) {
                try {
                    if (f74863f == null) {
                        f74863f = new HttpClient();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f74863f;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:75), block:B:11:0x004a */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m76835b(String str, String str2, Map map, String str3, TIMPushCallback tIMPushCallback) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    httpsURLConnection.setRequestMethod(str2);
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(15000);
                    httpsURLConnection.setDoInput(true);
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if ("POST".equals(str2) && str3 != null) {
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                        OutputStream outputStream = httpsURLConnection.getOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                            try {
                                bufferedWriter.write(str3);
                                bufferedWriter.flush();
                                bufferedWriter.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        String strM76829a = m76829a(httpsURLConnection.getErrorStream());
                        TIMPushLog.m77017e(f74860c, "Request error code: " + responseCode + ", message: " + strM76829a);
                        m76830a(responseCode, strM76829a, (Object) null, tIMPushCallback);
                    } else {
                        m76831a(m76829a(httpsURLConnection.getInputStream()), tIMPushCallback);
                    }
                } catch (Exception e11) {
                    e = e11;
                    String str4 = "Request exception for URL: " + str + e;
                    TIMPushLog.m77017e(f74860c, str4);
                    m76830a(TIMPushConstants.ERR_HTTPS_REQUEST_FAILED, str4, (Object) null, tIMPushCallback);
                    if (httpsURLConnection == null) {
                        return;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            httpsURLConnection = null;
        } catch (Throwable th7) {
            th = th7;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        httpsURLConnection.disconnect();
    }

    private HttpClient() {
    }

    /* JADX INFO: renamed from: a */
    public void m76833a(String str, Map<String, String> map, TIMPushCallback tIMPushCallback) {
        m76832a("GET", str, map, null, tIMPushCallback);
    }

    /* JADX INFO: renamed from: a */
    public void m76834a(String str, Map<String, String> map, String str2, TIMPushCallback tIMPushCallback) {
        m76832a("POST", str, map, str2, tIMPushCallback);
    }

    /* JADX INFO: renamed from: a */
    public final void m76832a(final String str, final String str2, final Map<String, String> map, final String str3, final TIMPushCallback tIMPushCallback) {
        this.f74864a.submit(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f74931b.m76835b(str2, str, map, str3, tIMPushCallback);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final String m76829a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    String string = sb2.toString();
                    bufferedReader.close();
                    return string;
                }
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76831a(final String str, final TIMPushCallback tIMPushCallback) {
        this.f74865b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.HttpClient.1
            @Override // java.lang.Runnable
            public void run() {
                TIMPushUtils.m77026a(tIMPushCallback, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m76830a(final int i11, final String str, final Object obj, final TIMPushCallback tIMPushCallback) {
        this.f74865b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.HttpClient.2
            @Override // java.lang.Runnable
            public void run() {
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, obj);
            }
        });
    }
}
