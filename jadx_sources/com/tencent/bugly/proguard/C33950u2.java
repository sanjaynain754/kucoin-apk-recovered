package com.tencent.bugly.proguard;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.bugly.common.reporter.upload.QAPMUpload;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.AttaEvent;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33950u2 extends QAPMUpload implements InterfaceC33750k8 {

    /* JADX INFO: renamed from: d */
    public static final int f72169d = 1200;

    /* JADX INFO: renamed from: e */
    public static final int f72170e = 1000;

    /* JADX INFO: renamed from: b */
    public final C33910s2 f72171b;

    /* JADX INFO: renamed from: c */
    public final C33930t2 f72172c;

    @Override // com.tencent.bugly.proguard.InterfaceC33750k8
    /* JADX INFO: renamed from: a */
    public void mo73742a(C33910s2 c33910s2) {
        this.f72171b.m74907b(c33910s2);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33750k8
    /* JADX INFO: renamed from: a */
    public int mo73741a() {
        int i11;
        int i12 = 3;
        try {
            this.f72172c.m75017a();
            if (m75116c() != InterfaceC33750k8.a.FROM_SERVICE || (i11 = this.f72172c.f72028b) == 1200) {
                i12 = 2;
            } else if (i11 == 1000) {
                i12 = 1;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(InterfaceC33750k8.f70598a, th2);
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(InterfaceC33750k8.f70598a, "load config result: " + i12 + ", status: " + this.f72172c.f72028b);
        }
        return i12;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33750k8
    /* JADX INFO: renamed from: b */
    public C33930t2 mo73743b() {
        return this.f72172c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC33750k8.a m75116c() {
        int i11;
        int i12;
        int i13;
        if (C33791m7.m74059g()) {
            Logger.INSTANCE.mo77134w(InterfaceC33750k8.f70598a, "load config fail for app in standalone mode.");
            return InterfaceC33750k8.a.FROM_LOCAL;
        }
        JSONObject jSONObjectM74903a = this.f72171b.m74903a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        HashMap<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/x-gzip");
        map.put("Content-Encoding", "gzip");
        InterfaceC33750k8.a aVar = InterfaceC33750k8.a.FROM_LOCAL;
        HttpURLConnection httpURLConnectionConnectionBuilder = connectionBuilder(map, 30000, 30000);
        int i14 = 0;
        if (httpURLConnectionConnectionBuilder != null) {
            try {
                if (Logger.verbos) {
                    Logger.INSTANCE.mo77133v(InterfaceC33750k8.f70598a, "apply param: " + jSONObjectM74903a);
                }
                m75115a(httpURLConnectionConnectionBuilder, jSONObjectM74903a);
                int responseCode = httpURLConnectionConnectionBuilder.getResponseCode();
                if (responseCode == 200) {
                    i11 = 1;
                    try {
                        String strM75114a = m75114a(httpURLConnectionConnectionBuilder);
                        if (Logger.verbos) {
                            Logger.INSTANCE.mo77133v(InterfaceC33750k8.f70598a, "config from server: " + strM75114a);
                        }
                        if (!TextUtils.isEmpty(strM75114a)) {
                            this.f72172c.m75020a(new JSONObject(strM75114a));
                            aVar = InterfaceC33750k8.a.FROM_SERVICE;
                        }
                        i14 = 1;
                        responseCode = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Logger.INSTANCE.exception(InterfaceC33750k8.f70598a, th);
                            httpURLConnectionConnectionBuilder.disconnect();
                            i12 = i11;
                            i13 = 0;
                        } catch (Throwable th3) {
                            httpURLConnectionConnectionBuilder.disconnect();
                            throw th3;
                        }
                    }
                }
                httpURLConnectionConnectionBuilder.disconnect();
                i13 = responseCode;
                i12 = i14;
            } catch (Throwable th4) {
                th = th4;
                i11 = 0;
            }
        } else {
            i12 = 0;
            i13 = 0;
        }
        C33847p0.b.f71356a.mo72932a(AttaEvent.EventCode.RM_CONFIG, i12, i13, SystemClock.uptimeMillis() - jUptimeMillis);
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(InterfaceC33750k8.f70598a, String.format(Locale.getDefault(), "load config from service, errorCode: %d, configMode: %s", Integer.valueOf(i13), aVar));
        }
        return aVar;
    }

    public C33950u2(@NotNull URL url) {
        super(url);
        this.f72171b = new C33910s2();
        this.f72172c = new C33930t2();
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
        mo73741a();
    }

    /* JADX INFO: renamed from: a */
    public final String m75114a(HttpURLConnection httpURLConnection) throws Throwable {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                String stream = FileUtil.readStream(bufferedInputStream, 8192);
                bufferedInputStream.close();
                return stream;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75115a(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        Throwable th2;
        DataOutputStream dataOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(dataOutputStream);
                try {
                    gZIPOutputStream2.write(jSONObject.toString().getBytes(Charset.forName("utf-8")));
                    gZIPOutputStream2.finish();
                    gZIPOutputStream2.close();
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            dataOutputStream = null;
        }
    }
}
