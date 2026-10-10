package com.tencent.bugly.proguard;

import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.commons.log.LogUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33888r0 {

    /* JADX INFO: renamed from: a */
    public static final String f71582a = "8666841551";

    /* JADX INFO: renamed from: b */
    public static final String f71583b = "08e00055686";

    /* JADX INFO: renamed from: c */
    public static final String f71584c = "https://h.trace.qq.com/kv";

    /* JADX INFO: renamed from: d */
    public static final int f71585d = 5000;

    /* JADX INFO: renamed from: e */
    public static final int f71586e = 5000;

    /* JADX INFO: renamed from: f */
    public static final String f71587f = "UTF-8";

    /* JADX INFO: renamed from: g */
    public static final int f71588g = -1;

    /* JADX INFO: renamed from: a */
    public Pair<Integer, String> m74707a(List<String> list) {
        try {
            if (C33791m7.m74059g()) {
                C34012x4.m75444f("send atta fail for app in standalone mode.", new Object[0]);
                return new Pair<>(200, "app in standalone mode");
            }
            if (!C33582c8.m72656a(C33582c8.f69399y)) {
                return new Pair<>(200, "crash atta report disabled");
            }
            HashMap map = new HashMap();
            map.put("Atta-Type", "batch-report");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InterfaceC33826o0.f71243o, f71583b).put(InterfaceC33826o0.f71244p, f71582a).put("type", "batch").put("version", "v1.0.0");
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("datas", jSONArray);
            return m74706a("https://h.trace.qq.com/kv", jSONObject.toString(), map);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return new Pair<>(-1, th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Integer, String> m74706a(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        Closeable closeable;
        String string;
        InputStream inputStream;
        Closeable closeable2 = null;
        int responseCode = -1;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                m74709a(httpURLConnection, map);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                byte[] bytes = str2.getBytes("UTF-8");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream.write(bytes);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 400) {
                        inputStream = httpURLConnection.getErrorStream();
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                            sb2.append(LogUtils.NEW_LINE);
                        }
                        bufferedReader.close();
                        string = sb2.toString();
                        m74708a((Closeable) null);
                        m74708a(inputStream);
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        closeable = inputStream;
                        th = th2;
                        try {
                            C34012x4.m75435a(th);
                            String message = th.getMessage();
                            m74708a(closeable2);
                            m74708a(closeable);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            string = message;
                        } catch (Throwable th3) {
                            m74708a(closeable2);
                            m74708a(closeable);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable2 = dataOutputStream;
                    closeable = null;
                }
            } catch (Throwable th5) {
                th = th5;
                closeable = null;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            closeable = null;
        }
        return new Pair<>(Integer.valueOf(responseCode), string);
    }

    /* JADX INFO: renamed from: a */
    public final void m74709a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (httpURLConnection == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m74705a(String str) {
        if (str != null && !str.equals("")) {
            try {
                return URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8");
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final void m74708a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e11) {
            C34012x4.m75435a(e11);
        }
    }
}
