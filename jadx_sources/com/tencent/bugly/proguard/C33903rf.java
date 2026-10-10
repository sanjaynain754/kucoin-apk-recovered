package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33903rf {

    /* JADX INFO: renamed from: c */
    public static C33903rf f71732c = null;

    /* JADX INFO: renamed from: d */
    public static final int f71733d = 10000;

    /* JADX INFO: renamed from: e */
    public static final int f71734e = 30000;

    /* JADX INFO: renamed from: f */
    public static final int f71735f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f71736g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f71737h = 10000;

    /* JADX INFO: renamed from: a */
    public Context f71738a;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f71739b = null;

    /* JADX INFO: renamed from: a */
    public boolean m74865a(int i11) {
        return i11 == 301 || i11 == 302 || i11 == 303 || i11 == 307;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m74867b(HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = bufferedInputStream.read(bArr);
                    if (i11 <= 0) {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                            return byteArray;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (!C34012x4.m75438b(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33903rf m74861a(Context context) {
        if (f71732c == null) {
            f71732c = new C33903rf(context);
        }
        return f71732c;
    }

    public C33903rf(Context context) {
        this.f71738a = context;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0172 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #3 {all -> 0x00e7, blocks: (B:25:0x009b, B:27:0x00a6, B:29:0x00be, B:33:0x00d3, B:32:0x00cf, B:45:0x00ef, B:47:0x00f5, B:49:0x00fd, B:60:0x012c, B:78:0x016a, B:80:0x0172, B:64:0x0143, B:67:0x014e), top: B:100:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0182 A[PHI: r0 r4 r10 r11 r12
      0x0182: PHI (r0v18 'th' java.lang.Throwable) = (r0v17 'th' java.lang.Throwable), (r0v30 'th' java.lang.Throwable) binds: [B:85:0x0180, B:72:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r4v9 int) = (r4v8 int), (r4v15 int) binds: [B:85:0x0180, B:72:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r10v6 java.lang.String) = (r10v5 java.lang.String), (r10v10 java.lang.String) binds: [B:85:0x0180, B:72:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r11v7 int) = (r11v6 int), (r11v10 int) binds: [B:85:0x0180, B:72:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r12v8 int) = (r12v7 int), (r12v12 int) binds: [B:85:0x0180, B:72:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public byte[] m74866a(String str, byte[] bArr, RunnableC33925sh runnableC33925sh, Map<String, String> map) {
        int i11;
        int i12;
        byte[] bArr2 = null;
        int i13 = 0;
        if (str == null) {
            C34012x4.m75437b("Failed for no URL.", new Object[0]);
            return null;
        }
        long length = bArr == null ? 0L : bArr.length;
        C34012x4.m75434a("request: %s, send: %d (pid=%d | tid=%d)", str, Long.valueOf(length), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        String str2 = str;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < 1 && i15 < 1) {
            if (i16 != 0) {
                i16 = i13;
            } else {
                i14++;
                if (i14 > 1) {
                    C34012x4.m75431a(LogState.DEBUG, C33986vi.m75326a("try time: ", i14), new Object[i13]);
                    SystemClock.sleep(((long) new Random(System.currentTimeMillis()).nextInt(10000)) + 10000);
                }
            }
            int i17 = i14;
            String strM74391a = C33830o4.m74391a(this.f71738a);
            if (strM74391a == null) {
                C34012x4.m75431a(LogState.WARN, "Failed to request for network not avail", new Object[i13]);
                i11 = i13;
            } else {
                runnableC33925sh.m74997a(str2, length, strM74391a);
                HttpURLConnection httpURLConnectionM74863a = m74863a(str2, bArr, strM74391a, map);
                if (httpURLConnectionM74863a != null) {
                    try {
                        try {
                            int responseCode = httpURLConnectionM74863a.getResponseCode();
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                try {
                                    sb2.append("response code ");
                                    sb2.append(responseCode);
                                    LogState logState = LogState.DEBUG;
                                    C34012x4.m75431a(logState, sb2.toString(), new Object[i13]);
                                    if (responseCode == 200) {
                                        this.f71739b = m74864a(httpURLConnectionM74863a);
                                        byte[] bArrM74867b = m74867b(httpURLConnectionM74863a);
                                        runnableC33925sh.m74995a(bArrM74867b == null ? 0L : bArrM74867b.length);
                                        return bArrM74867b;
                                    }
                                    if (m74865a(responseCode)) {
                                        try {
                                            String headerField = httpURLConnectionM74863a.getHeaderField("Location");
                                            if (headerField == null) {
                                                C34012x4.m75431a(LogState.ERROR, "Failed to redirect: %d" + responseCode, new Object[0]);
                                                try {
                                                    httpURLConnectionM74863a.disconnect();
                                                } catch (Throwable th2) {
                                                    if (!C34012x4.m75432a(LogState.WARN, th2)) {
                                                        th2.printStackTrace();
                                                    }
                                                }
                                                return bArr2;
                                            }
                                            i15++;
                                            try {
                                                C34012x4.m75431a(logState, "redirect code: %d ,to:%s", Integer.valueOf(responseCode), headerField);
                                                str2 = headerField;
                                                i17 = 0;
                                                i16 = 1;
                                            } catch (IOException e11) {
                                                e = e11;
                                                str2 = headerField;
                                                i17 = 0;
                                                i16 = 1;
                                                if (!C34012x4.m75432a(LogState.WARN, e)) {
                                                    e.printStackTrace();
                                                }
                                                httpURLConnectionM74863a.disconnect();
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            i12 = 1;
                                            i16 = i12;
                                        }
                                    }
                                    long contentLength = httpURLConnectionM74863a.getContentLength();
                                    if (contentLength < 0) {
                                        contentLength = 0;
                                    }
                                    runnableC33925sh.m74995a(contentLength);
                                    try {
                                        httpURLConnectionM74863a.disconnect();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (!C34012x4.m75432a(LogState.WARN, th)) {
                                            th.printStackTrace();
                                        }
                                    }
                                    i14 = i17;
                                    i13 = 0;
                                } catch (IOException e13) {
                                    e = e13;
                                    i12 = i16;
                                }
                                httpURLConnectionM74863a.disconnect();
                            } catch (Throwable th4) {
                                th = th4;
                                if (!C34012x4.m75432a(LogState.WARN, th)) {
                                    th.printStackTrace();
                                }
                            }
                        } catch (IOException e14) {
                            e = e14;
                        }
                        i14 = i17;
                        i13 = 0;
                    } finally {
                        try {
                            httpURLConnectionM74863a.disconnect();
                        } catch (Throwable th5) {
                            if (!C34012x4.m75432a(LogState.WARN, th5)) {
                                th5.printStackTrace();
                            }
                        }
                    }
                    i16 = i12;
                    if (!C34012x4.m75432a(LogState.WARN, e)) {
                        e.printStackTrace();
                    }
                } else {
                    i11 = i13;
                    C34012x4.m75431a(LogState.DEBUG, "Failed to execute post.", new Object[i11]);
                    runnableC33925sh.m74995a(0L);
                }
            }
            i14 = i17;
            i13 = i11;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m74864a(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() >= 1) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public HttpURLConnection m74863a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            C34012x4.m75437b("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection httpURLConnectionM74862a = m74862a(str2, str);
        if (httpURLConnectionM74862a == null) {
            C34012x4.m75437b("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            httpURLConnectionM74862a.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnectionM74862a.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnectionM74862a.setRequestProperty(C33556b3.f69037e1, str2);
            httpURLConnectionM74862a.setRequestProperty(C33556b3.f69041f1, str2);
            OutputStream outputStream = httpURLConnectionM74862a.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
                return httpURLConnectionM74862a;
            }
            outputStream.write(bArr);
            return httpURLConnectionM74862a;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            C34012x4.m75431a(LogState.ERROR, "Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public HttpURLConnection m74862a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            Proxy proxy = C34035y7.f72550a;
            if (proxy != null) {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
            } else if (str != null && str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))))));
            } else {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
