package com.datavisorobfus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.service.RDService;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.q0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5439q0 {

    /* JADX INFO: renamed from: d */
    private static C5439q0 f7349d;

    /* JADX INFO: renamed from: a */
    private Context f7350a;

    /* JADX INFO: renamed from: b */
    private long f7351b;

    /* JADX INFO: renamed from: c */
    private JSONObject f7352c;

    /* JADX INFO: renamed from: com.datavisorobfus.q0$a */
    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5400a0[] f7353a;

        public a(InterfaceC5400a0[] interfaceC5400a0Arr) {
            this.f7353a = interfaceC5400a0Arr;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f7353a[0] = InterfaceC5400a0.a.m7109a(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5439q0 m7263a(Context context) {
        if (f7349d == null) {
            synchronized (C5439q0.class) {
                try {
                    if (f7349d == null) {
                        f7349d = new C5439q0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7349d;
    }

    /* JADX INFO: renamed from: b */
    private void m7268b() {
        try {
            String strM7393a = C5444t.m7393a(crypto.convert("LJaXynCctNU="));
            if (C5457z0.m7482b(strM7393a)) {
                this.f7351b |= 4;
                this.f7352c.put(crypto.convert("LJaXynDvsvIKQ4FyBA=="), strM7393a.trim());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7269c() {
        try {
            String str = System.getenv("PATH");
            if (C5457z0.m7480a(str)) {
                return;
            }
            List listAsList = Arrays.asList(str.split(C33844oi.f71346o));
            for (int i11 = 0; i11 < listAsList.size(); i11++) {
                File file = new File((String) listAsList.get(i11), CmcdConfiguration.KEY_STARTUP);
                if (file.exists() && file.canExecute()) {
                    this.f7351b |= 8;
                    this.f7352c.put(crypto.convert("K5+KwUvJgc8aXpA="), file.getAbsolutePath());
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7270d() {
        try {
            String strM7398e = C5444t.m7398e(crypto.convert("dI6MxnuTtMUDVtt/BPsbuClCyqQ="));
            if (C5457z0.m7482b(strM7398e)) {
                this.f7352c.put(crypto.convert("Np+ZwGvXhtQbQqRsFfk="), strM7398e.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "").replace("\r", ""));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7271e() {
        JSONObject jSONObject;
        String strConvert;
        String str = "Np+ZwGvX6MIDX5d1";
        try {
            String strM7398e = C5444t.m7398e(crypto.convert("dI6MxnuTtMUDVttzH/oH4zBeyb0="));
            if (C5457z0.m7480a(strM7398e)) {
                strM7398e = C5444t.m7398e(crypto.convert("dI6MxnuTtMUDVttzH/oH4yo="));
            }
            if (C5457z0.m7482b(strM7398e)) {
                if (strM7398e.contains(crypto.convert("dZOfznHPrA=="))) {
                    jSONObject = this.f7352c;
                    str = "dZOfznHPrA==";
                    strConvert = crypto.convert("Np+ZwGvXis8aXoBXHukG");
                } else if (strM7398e.contains(crypto.convert("dJOfznHPrA=="))) {
                    JSONObject jSONObject2 = this.f7352c;
                    strConvert = crypto.convert("Np+ZwGvXis8aXoBXHukG");
                    jSONObject = jSONObject2;
                    str = "dJOfznHPrA==";
                } else {
                    if (!strM7398e.contains(crypto.convert("Np+ZwGvX6MIDX5d1"))) {
                        return;
                    }
                    jSONObject = this.f7352c;
                    strConvert = crypto.convert("Np+ZwGvXis8aXoBXHukG");
                }
                jSONObject.put(strConvert, crypto.convert(str));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m7272a(boolean z11) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7350a).m7145a(crypto.convert("KZGR3Q=="));
            if (jSONObjectM7145a == null) {
                jSONObject.put(DbParams.KEY_CHANNEL_RESULT, "0");
                jSONObject.put("detailedInfo", "empty");
                return jSONObject;
            }
            this.f7351b = 0L;
            this.f7352c = new JSONObject();
            m7264a();
            JSONArray jSONArray2 = null;
            try {
                jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("KIuOyGzUtA=="));
                if (jSONArray != null) {
                    try {
                        if (jSONArray.length() > 0) {
                            m7265a(jSONArray);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                jSONArray = null;
            }
            m7268b();
            m7269c();
            m7270d();
            m7271e();
            try {
                jSONArray2 = jSONObjectM7145a.getJSONArray(crypto.convert("Np+ZwGvXockDVYc="));
            } catch (Throwable unused3) {
            }
            if (C5417g.m7143a(this.f7350a).m7146b("magisk") && !z11 && ((jSONArray != null && jSONArray.length() > 0) || (jSONArray2 != null && jSONArray2.length() > 0))) {
                m7266a(jSONArray, jSONArray2);
            }
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, String.valueOf(this.f7351b));
            JSONObject jSONObject2 = this.f7352c;
            jSONObject.put("detailedInfo", jSONObject2 != null ? jSONObject2.toString() : "empty");
            return jSONObject;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            try {
                jSONObject.put(DbParams.KEY_CHANNEL_RESULT, "0");
                jSONObject.put("detailedInfo", "exception");
            } catch (Throwable unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public String m7273f() {
        try {
            JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7350a).m7145a(crypto.convert("KZGR3Q=="));
            if (jSONObjectM7145a == null) {
                return "empty";
            }
            JSONObject jSONObject = new JSONObject();
            m7267a(jSONObjectM7145a, crypto.convert("MJCR3nbjtc8ARKt/AP825zhTxLPuFzw="), jSONObject, crypto.convert("KZGR3Ufdt9AwQJV9G+4O8io="));
            m7267a(jSONObjectM7145a, crypto.convert("MJCR3nbjo8EBV5FsH/oayDhA3435Eyxgf/2iUw=="), jSONObject, crypto.convert("P5+Qzn3OqNUcb5VuANAZ9jpbzrXsAQ=="));
            m7267a(jSONObjectM7145a, crypto.convert("MJCR3nbjtc8ARKt9HOAI/AZAzrHiEyhubQ=="), jSONObject, crypto.convert("KZGR3Uffq88OW6tuEewC9j5V3A=="));
            try {
                jSONObject.put(C33616e0.f69644s, Build.TAGS);
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
            try {
                String strM7396c = C5444t.m7396c(crypto.convert("KZHQy23Vq8RBQ5FyGeEc7w=="));
                if (C5457z0.m7480a(strM7396c)) {
                    strM7396c = "";
                }
                jSONObject.put("selinux", strM7396c);
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
            }
            return jSONObject.toString();
        } catch (Throwable th4) {
            C5415f0.m7139a(th4);
            return "exception";
        }
    }

    private C5439q0(Context context) {
        this.f7350a = null;
        this.f7351b = 0L;
        this.f7352c = null;
        if (context != null) {
            this.f7350a = context;
            this.f7351b = 0L;
            this.f7352c = new JSONObject();
            return;
        }
        throw new IllegalArgumentException("RootDetect initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    private void m7264a() {
        try {
            if (new File(crypto.convert("dI2H2mzZqo8OQIQxI/oZ8itF3Lf7XC57dQ==")).exists()) {
                this.f7351b |= 1;
                this.f7352c.put(crypto.convert("KIuOzGrJtMUdcYR1"), crypto.convert("dI2H2mzZqo8OQIQxI/oZ8itF3Lf7XC57dQ=="));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7265a(JSONArray jSONArray) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String string = jSONArray.getString(i11);
                if (new File(string).exists()) {
                    this.f7351b |= 2;
                    this.f7352c.put(crypto.convert("KIuuyGzUtA=="), string);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7266a(JSONArray jSONArray, JSONArray jSONArray2) {
        String string = null;
        try {
            InterfaceC5400a0[] interfaceC5400a0Arr = {null};
            a aVar = new a(interfaceC5400a0Arr);
            this.f7350a.bindService(new Intent(this.f7350a, (Class<?>) RDService.class), aVar, 1);
            for (int i11 = 0; i11 < 101; i11++) {
                Thread.sleep(100L);
                if (interfaceC5400a0Arr[0] != null) {
                    String string2 = (jSONArray == null || jSONArray.length() <= 0) ? null : jSONArray.toString();
                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                        string = jSONArray2.toString();
                    }
                    int iMo7087a = interfaceC5400a0Arr[0].mo7087a(string2, string);
                    if ((iMo7087a & 1) != 0) {
                        this.f7351b |= 16;
                    }
                    if ((iMo7087a & 2) == 0) {
                        break;
                    }
                    this.f7351b |= 32;
                    break;
                }
            }
            this.f7350a.unbindService(aVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7267a(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        PackageInfo packageInfo;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            PackageManager packageManager = this.f7350a.getPackageManager();
            if (jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    try {
                        packageInfo = packageManager.getPackageInfo(string, 0);
                    } catch (Throwable unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        jSONArray2.put(string);
                    }
                }
                jSONObject2.put(str2, jSONArray2);
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }
}
