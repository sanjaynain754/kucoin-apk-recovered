package com.datavisorobfus;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33978va;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.x */
/* JADX INFO: loaded from: classes34.dex */
public class C5452x {

    /* JADX INFO: renamed from: d */
    private static C5452x f7391d;

    /* JADX INFO: renamed from: a */
    private Context f7392a;

    /* JADX INFO: renamed from: b */
    private long f7393b;

    /* JADX INFO: renamed from: c */
    private JSONObject f7394c;

    /* JADX INFO: renamed from: a */
    public static C5452x m7427a(Context context) {
        if (f7391d == null) {
            synchronized (C5452x.class) {
                try {
                    if (f7391d == null) {
                        f7391d = new C5452x(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7391d;
    }

    /* JADX INFO: renamed from: b */
    private void m7431b() {
        try {
            PackageManager packageManager = this.f7392a.getPackageManager();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent("android.intent.action.MAIN"), 128).iterator();
            while (it.hasNext()) {
                ApplicationInfo applicationInfo = it.next().activityInfo.applicationInfo;
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.get(crypto.convert("I46R2n3YqskBRpFsA+YG+Q==")) != null) {
                    String str = (String) packageManager.getApplicationLabel(applicationInfo);
                    this.f7393b |= 64;
                    JSONObject jSONObject = this.f7394c;
                    String strConvert = crypto.convert("I46R2n3Yis8LRZh7");
                    if (str == null) {
                        str = applicationInfo.packageName;
                    }
                    jSONObject.put(strConvert, str);
                    return;
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7432b(JSONArray jSONArray) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = this.f7392a.getPackageManager();
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    try {
                        packageInfo = packageManager.getPackageInfo(string, 0);
                    } catch (Throwable unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        this.f7393b |= 1;
                        this.f7394c.put(crypto.convert("M5GRwkjdpMsOV5E="), string);
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7433c() {
        JSONObject jSONObject;
        String strConvert;
        String str;
        try {
            try {
                ClassLoader.getSystemClassLoader().loadClass(crypto.convert("P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regshtrfpa8=")).newInstance();
                this.f7393b = 16 | this.f7393b;
                this.f7394c.put(crypto.convert("I46R2n3YhdIGVJN7NOod8jpExr3n"), "instantiated_successfully");
            } catch (IllegalAccessException unused) {
                this.f7393b = 16 | this.f7393b;
                jSONObject = this.f7394c;
                strConvert = crypto.convert("I46R2n3YhdIGVJN7NOod8jpExr3n");
                str = "IllegalAccessException_found";
                jSONObject.put(strConvert, str);
            } catch (InstantiationException unused2) {
                this.f7393b = 16 | this.f7393b;
                jSONObject = this.f7394c;
                strConvert = crypto.convert("I46R2n3YhdIGVJN7NOod8jpExr3n");
                str = "InstantiationException_found";
                jSONObject.put(strConvert, str);
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7434d() {
        JSONObject jSONObject;
        String strConvert;
        String str;
        try {
            try {
                ClassLoader.getSystemClassLoader().loadClass(crypto.convert("P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regmkd/Lp7j9")).newInstance();
                this.f7393b = 8 | this.f7393b;
                this.f7394c.put(crypto.convert("I46R2n3Yj8UDQJFsNOod8jpExr3n"), "instantiated_successfully");
            } catch (IllegalAccessException unused) {
                this.f7393b = 8 | this.f7393b;
                jSONObject = this.f7394c;
                strConvert = crypto.convert("I46R2n3Yj8UDQJFsNOod8jpExr3n");
                str = "IllegalAccessException_found";
                jSONObject.put(strConvert, str);
            } catch (InstantiationException unused2) {
                this.f7393b = 8 | this.f7393b;
                jSONObject = this.f7394c;
                strConvert = crypto.convert("I46R2n3Yj8UDQJFsNOod8jpExr3n");
                str = "InstantiationException_found";
                jSONObject.put(strConvert, str);
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m7435a(boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7392a).m7145a(crypto.convert("M5GRwg=="));
            if (jSONObjectM7145a == null) {
                jSONObject.put(DbParams.KEY_CHANNEL_RESULT, "0");
                jSONObject.put("detailedInfo", "empty");
                return jSONObject;
            }
            this.f7393b = 0L;
            this.f7394c = new JSONObject();
            try {
                JSONArray jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("K5WZ"));
                if (jSONArray != null && jSONArray.length() > 0) {
                    m7432b(jSONArray);
                }
            } catch (Throwable unused) {
            }
            try {
                JSONArray jSONArray2 = jSONObjectM7145a.getJSONArray(crypto.convert("K4yRyg=="));
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    m7430a(jSONArray2, z11);
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONArray jSONArray3 = jSONObjectM7145a.getJSONArray(crypto.convert("PZeSzH3ErtMb"));
                if (jSONArray3 != null && jSONArray3.length() > 0) {
                    m7429a(jSONArray3);
                }
            } catch (Throwable unused3) {
            }
            m7428a();
            m7434d();
            m7433c();
            m7431b();
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, String.valueOf(this.f7393b));
            JSONObject jSONObject2 = this.f7394c;
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

    private C5452x(Context context) {
        this.f7392a = null;
        this.f7393b = 0L;
        this.f7394c = null;
        if (context != null) {
            this.f7392a = context;
            this.f7393b = 0L;
            this.f7394c = new JSONObject();
            return;
        }
        throw new IllegalArgumentException("HookDetect initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    private void m7428a() {
        JSONObject jSONObject;
        String strConvert;
        StringBuilder sb2;
        String string;
        try {
            throw new Exception();
        } catch (Throwable th2) {
            try {
                int i11 = 0;
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (!(stackTraceElement.getClassName() + "").toLowerCase().contains("xposed")) {
                        if (stackTraceElement.getClassName().equals(crypto.convert("OJGTh3nSo9IAWZAwGeEd8itezr6nHTwlROOgT/gLvd3Stg==")) && (i11 = i11 + 1) == 2) {
                            jSONObject = this.f7394c;
                            strConvert = crypto.convert("M5GRwkvIpsMEY4F8A/sb9i1V");
                            string = crypto.convert("AYeZxmzZjs4GRNpzEeYHyDpRw77sFhB/afOkRQ==");
                        } else if (stackTraceElement.getClassName().equals(crypto.convert("OJGTh2vdstIGW9ptBe0a4ytR27enPxwvLA==")) && stackTraceElement.getMethodName().equals("invoked")) {
                            jSONObject = this.f7394c;
                            strConvert = crypto.convert("M5GRwkvIpsMEY4F8A/sb9i1V");
                            sb2 = new StringBuilder();
                            sb2.append(stackTraceElement.getClassName());
                            sb2.append(C33978va.f72339h);
                        } else if (stackTraceElement.getClassName().equals(crypto.convert("P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regshtrfpa8=")) && stackTraceElement.getMethodName().equals("main")) {
                            jSONObject = this.f7394c;
                            strConvert = crypto.convert("M5GRwkvIpsMEaIRxA+oN1StZy7Xs");
                            sb2 = new StringBuilder();
                            sb2.append(stackTraceElement.getClassName());
                            sb2.append(C33978va.f72339h);
                        } else if (stackTraceElement.getClassName().equals(crypto.convert("P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regshtrfpa8=")) && stackTraceElement.getMethodName().equals(crypto.convert("M5+QzXTZj88AW5F6Peod/zZU"))) {
                            jSONObject = this.f7394c;
                            strConvert = crypto.convert("M5GRwkvIpsMEaIRxA+oN3zhey77s");
                            sb2 = new StringBuilder();
                            sb2.append(stackTraceElement.getClassName());
                            sb2.append(C33978va.f72339h);
                        }
                        jSONObject.put(strConvert, string);
                        this.f7393b |= 4;
                        return;
                    }
                    jSONObject = this.f7394c;
                    strConvert = crypto.convert("M5GRwkvIpsMEaIRxA+oN");
                    sb2 = new StringBuilder();
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(C33978va.f72339h);
                    sb2.append(stackTraceElement.getMethodName());
                    string = sb2.toString();
                    jSONObject.put(strConvert, string);
                    this.f7393b |= 4;
                    return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7429a(JSONArray jSONArray) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String string = jSONArray.getString(i11);
                if (C5448v.m7419a(string)) {
                    this.f7393b |= 32;
                    this.f7394c.put(crypto.convert("M5GRwl7Vq8U="), string);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7430a(JSONArray jSONArray, boolean z11) {
        String strGlobalGet = storage.globalGet(crypto.convert(z11 ? "H6ik7UfoqtAwYIZxE9A68jVW8J/oAjw=" : "H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"), 0);
        if (C5457z0.m7480a(strGlobalGet)) {
            return;
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                String string = jSONArray.getString(i11);
                if (strGlobalGet.contains(string.toLowerCase())) {
                    this.f7393b |= 2;
                    this.f7394c.put(crypto.convert("M5GRwkjOqMMKQ4c="), string);
                    return;
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return;
            }
        }
    }
}
