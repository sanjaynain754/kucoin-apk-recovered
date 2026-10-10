package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.upload.QAPMUpload;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33674gg extends QAPMUpload {

    /* JADX INFO: renamed from: g */
    public static final String f69986g = "CrashReport";

    /* JADX INFO: renamed from: b */
    public final JSONObject f69987b;

    /* JADX INFO: renamed from: c */
    public JSONObject f69988c;

    /* JADX INFO: renamed from: d */
    public final String f69989d;

    /* JADX INFO: renamed from: e */
    public final String f69990e;

    /* JADX INFO: renamed from: f */
    public final String f69991f;

    public C33674gg(@NotNull URL url, JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        String str;
        super(url);
        String strOptString3 = null;
        this.f69988c = null;
        this.f69987b = jSONObject;
        if (jSONObject != null) {
            try {
                strOptString = jSONObject.optString(C33820nf.f71149e, "");
                try {
                    strOptString2 = jSONObject.optString(C33820nf.f71150f, "");
                    try {
                        strOptString3 = jSONObject.optString(C33820nf.f71156l, "");
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    strOptString2 = null;
                }
            } catch (Throwable unused3) {
                strOptString = null;
                strOptString2 = null;
            }
            str = strOptString3;
            strOptString3 = strOptString;
        } else {
            str = null;
            strOptString2 = null;
        }
        this.f69989d = strOptString3;
        this.f69990e = strOptString2;
        this.f69991f = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m73204a(HashMap<String, String> map) {
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json");
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m73205c() {
        return this.f69988c;
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
        HttpURLConnection httpURLConnectionConnectionBuilder;
        if (this.f69987b == null) {
            return;
        }
        if (C33579c5.m72641c(this.f69989d, this.f69990e)) {
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("block report with {baseType:");
            sb2.append(this.f69989d);
            sb2.append(", subType:");
            sb2.append(this.f69990e);
            sb2.append(", clientIdentify:");
            logger.mo77134w("CrashReport", C34025xh.m75464a(sb2, this.f69991f, "}"));
            return;
        }
        C33588ce.m72684b().m72689b(this.f69987b);
        HashMap<String, String> map = new HashMap<>();
        m73204a(map);
        try {
            httpURLConnectionConnectionBuilder = connectionBuilder(map, 30000, 30000);
            if (httpURLConnectionConnectionBuilder != null) {
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new DataOutputStream(httpURLConnectionConnectionBuilder.getOutputStream()));
                    gZIPOutputStream.write(this.f69987b.toString().getBytes());
                    gZIPOutputStream.finish();
                    if (httpURLConnectionConnectionBuilder.getResponseCode() >= 400) {
                        Logger.INSTANCE.mo77134w("CrashReport", FileUtil.readStream(new BufferedInputStream(httpURLConnectionConnectionBuilder.getErrorStream()), 8192));
                    } else {
                        JSONObject jSONObject = new JSONObject(FileUtil.readStream(new BufferedInputStream(httpURLConnectionConnectionBuilder.getInputStream()), 8192));
                        this.f69988c = jSONObject;
                        if (jSONObject.optInt("code") == 0) {
                            C33579c5.m72639a(this.f69989d, this.f69990e, this.f69988c);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        this.f69988c = null;
                        if (httpURLConnectionConnectionBuilder == null) {
                            return;
                        }
                    } finally {
                        if (httpURLConnectionConnectionBuilder != null) {
                            httpURLConnectionConnectionBuilder.disconnect();
                        }
                    }
                }
            }
            if (httpURLConnectionConnectionBuilder == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionConnectionBuilder = null;
        }
    }
}
