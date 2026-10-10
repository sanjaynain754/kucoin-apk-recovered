package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ce */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33588ce implements InterfaceC33546ae {

    /* JADX INFO: renamed from: c */
    public static final String f69421c = "RMonitor_link";

    /* JADX INFO: renamed from: d */
    public static volatile C33588ce f69422d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC33546ae f69423a = new C33567be();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, ArrayList<String>> f69424b;

    /* JADX INFO: renamed from: b */
    public static C33588ce m72684b() {
        if (f69422d == null) {
            synchronized (C33588ce.class) {
                try {
                    if (f69422d == null) {
                        f69422d = new C33588ce();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69422d;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public InterfaceC33998wa mo72362a() {
        return this.f69423a.mo72362a();
    }

    /* JADX INFO: renamed from: c */
    public boolean m72691c() {
        return this.f69423a.mo72362a() != null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72363a(InterfaceC33998wa interfaceC33998wa) {
        this.f69423a.mo72363a(interfaceC33998wa);
    }

    /* JADX INFO: renamed from: c */
    public final JSONArray m72690c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C33820nf.f71160p);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONArray(C33820nf.f71131J);
    }

    public C33588ce() {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        this.f69424b = map;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("looper.looper_stack");
        map.put("anr.basic_info", arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("looper.looper_stack");
        arrayList2.add("memory.activity_leak");
        arrayList2.add("memory.fd_leak");
        arrayList2.add("memory.big_bitmap");
        arrayList2.add("memory.fd_leak_ceil");
        arrayList2.add("memory.native_memory");
        arrayList2.add("memory.java_memory_ceiling_hprof");
        map.put("crash.basic_info", arrayList2);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72364a(JSONObject jSONObject) {
        try {
            if (Logger.verbos) {
                String strM74301a = C33820nf.m74301a(jSONObject, C33978va.f72339h);
                Logger.INSTANCE.mo77133v("RMonitor_link", "record link data of " + strM74301a);
            }
            this.f69423a.mo72364a(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72365a(JSONObject jSONObject, List<String> list) {
        try {
            this.f69423a.mo72365a(jSONObject, list);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72689b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ArrayList<String> arrayList = this.f69424b.get(C33820nf.m74301a(jSONObject, C33978va.f72339h));
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        long jElapsedRealtime = Logger.verbos ? SystemClock.elapsedRealtime() : 0L;
        if (m72690c(jSONObject) == null) {
            mo72365a(jSONObject, arrayList);
        }
        C33978va c33978vaM75292a = C33978va.m75292a(jSONObject);
        if (c33978vaM75292a != null && ("crash".equals(c33978vaM75292a.f72342a) || "anr".equals(c33978vaM75292a.f72342a))) {
            m72687a(c33978vaM75292a, C33820nf.m74313g(jSONObject));
        }
        if (Logger.verbos) {
            m72688a(jSONObject, jElapsedRealtime);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public C33978va mo72361a(String str, String str2, long j11) {
        try {
            return this.f69423a.mo72361a(str, str2, j11);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX INFO: renamed from: a */
    public JSONObject m72686a(String str) {
        JSONObject jSONObject;
        try {
            SharedPreferences sharedPreferencesM72965b = C33632eg.m72965b();
            if (sharedPreferencesM72965b != null) {
                String string = sharedPreferencesM72965b.getString(InterfaceC33611dg.f69610s + str, "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(string);
                }
            } else {
                jSONObject = null;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_link", "get last exception data from cache fail for " + th2.toString());
        }
        Logger.INSTANCE.mo77130d("RMonitor_link", "get last exception data from cache " + jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m72687a(C33978va c33978va, String str) {
        String string = "";
        if (c33978va != null) {
            try {
                JSONObject jSONObjectM72686a = m72686a(str);
                if (jSONObjectM72686a == null || c33978va.f72348g > jSONObjectM72686a.optLong(C33820nf.f71148d)) {
                    jSONObjectM72686a = m72685a(c33978va);
                }
                string = jSONObjectM72686a.toString();
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e("RMonitor_link", "save last exception data to cache fail for " + th2.toString());
            }
        }
        SharedPreferences.Editor editorM72964a = C33632eg.m72964a();
        editorM72964a.putString(InterfaceC33611dg.f69610s + str, string);
        editorM72964a.commit();
        Logger.INSTANCE.mo77130d("RMonitor_link", C33770l7.m73937a("save last exception data to cache ", string));
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m72685a(@NotNull C33978va c33978va) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C33820nf.f71149e, c33978va.f72342a);
        jSONObject.put(C33820nf.f71150f, c33978va.f72343b);
        jSONObject.put(C33820nf.f71156l, c33978va.f72346e);
        jSONObject.put("event_time", c33978va.f72347f);
        jSONObject.put(C33820nf.f71148d, c33978va.f72348g);
        jSONObject.put("process_launch_id", c33978va.f72345d);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m72688a(JSONObject jSONObject, long j11) {
        String str;
        try {
            String strM74301a = C33820nf.m74301a(jSONObject, C33978va.f72339h);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
            String strOptString = jSONObject.optString("process_launch_id");
            String strM72746d = C33591ch.m72746d();
            String strOptString2 = jSONObject.optString(C33820nf.f71156l);
            boolean zEquals = TextUtils.equals(strOptString, strM72746d);
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("try collect link data for ");
            sb2.append(strM74301a);
            sb2.append("[");
            sb2.append(strOptString2);
            sb2.append("]");
            sb2.append(zEquals ? " from current launch" : " from last launch");
            sb2.append(" cost ");
            sb2.append(jElapsedRealtime);
            sb2.append(" ms");
            logger.mo77130d("RMonitor_link", sb2.toString());
            JSONArray jSONArrayM72690c = m72690c(jSONObject);
            if (jSONArrayM72690c == null) {
                str = "linkages is null";
            } else {
                str = "linkages is " + jSONArrayM72690c.toString();
            }
            logger.mo77130d("RMonitor_link", str);
        } catch (Throwable unused) {
        }
    }
}
