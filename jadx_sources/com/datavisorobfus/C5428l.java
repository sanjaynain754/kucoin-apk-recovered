package com.datavisorobfus;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.datavisor.vangogh.face.DVKeyName;
import com.datavisor.vangogh.util.ExceptionUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.l */
/* JADX INFO: loaded from: classes34.dex */
public class C5428l {

    /* JADX INFO: renamed from: d */
    private static C5428l f7308d;

    /* JADX INFO: renamed from: e */
    private static final String f7309e = C5420h.f7256a;

    /* JADX INFO: renamed from: a */
    private Context f7310a;

    /* JADX INFO: renamed from: b */
    private String f7311b = "";

    /* JADX INFO: renamed from: c */
    private Map<String, String> f7312c;

    /* JADX INFO: renamed from: com.datavisorobfus.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7313a;

        /* JADX INFO: renamed from: com.datavisorobfus.l$a$a, reason: collision with other inner class name */
        public class RunnableC46963a implements Runnable {
            public RunnableC46963a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    HashMap map = new HashMap();
                    map.put("c", "1");
                    map.put("pretoken", "1");
                    C5422i.m7160b().f7271j = System.nanoTime();
                    C5443s0 c5443s0M7388c = C5441r0.m7388c(map, C5422i.m7160b().f7268g, C5428l.this.f7310a);
                    C5422i.m7160b().f7271j = (System.nanoTime() - C5422i.m7160b().f7271j) / 1000000;
                    C5422i.m7160b().f7268g = null;
                    C5437p0 c5437p0 = new C5437p0(C5428l.this.f7310a, c5443s0M7388c);
                    if (c5437p0.f7348h == 0) {
                        C5455y0.m7470a(C5428l.this.f7310a).m7476a(c5437p0);
                    }
                    C5422i.m7160b().f7270i = (System.nanoTime() - C5422i.m7160b().f7270i) / 1000000;
                    C5422i.m7160b().m7164a(C5428l.this.f7310a, c5437p0.f7348h, c5437p0.f7347g, a.this.f7313a);
                    if (c5437p0.f7348h != 0) {
                        C5422i.m7160b().f7267f = false;
                        C5422i.m7160b().f7266e.await();
                        return;
                    }
                    C5422i.m7160b().f7267f = true;
                    C5422i.m7160b().f7266e.await();
                    C5422i.m7160b().f7266e.await();
                    if (!C5457z0.m7482b(c5437p0.f7346f) || C5422i.m7160b().f7269h == null) {
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("c", "1");
                    map2.put("ut", c5437p0.f7346f);
                    C5443s0 c5443s0M7387b = C5441r0.m7387b(map2, C5422i.m7160b().f7269h, C5428l.this.f7310a);
                    if (c5443s0M7387b != null) {
                        str = "上报DynamicData status" + c5443s0M7387b.f7383c;
                    } else {
                        str = "上报DynamicData status resultSecond is null";
                    }
                    C5415f0.m7136a(str);
                    C5422i.m7160b().f7269h = null;
                } catch (Throwable th2) {
                    ExceptionUtil.m7095b("singleThreadVangoghRealPost", th2, C5428l.this.f7310a);
                    C5415f0.m7139a(th2);
                }
            }
        }

        public a(String str) {
            this.f7313a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C5426k.m7189a().f7295c.execute(new RunnableC46963a());
            } catch (Throwable th2) {
                ExceptionUtil.m7095b("singleThreadVangoghPost", th2, C5428l.this.f7310a);
                C5415f0.m7139a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m7205d() {
        try {
            if (!C5424j.m7188b(this.f7310a) && !C5424j.m7187a(this.f7310a)) {
                return m7199b();
            }
            long jM7415d = C5447u0.m7415d(this.f7310a, "DVSPDVMA");
            return jM7415d < 0 || System.currentTimeMillis() > jM7415d + 2592000000L;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5428l m7195a(Context context) {
        if (f7308d == null) {
            synchronized (C5428l.class) {
                try {
                    if (f7308d == null) {
                        f7308d = new C5428l(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7308d;
    }

    /* JADX INFO: renamed from: b */
    private boolean m7199b() {
        long jM7415d = C5447u0.m7415d(this.f7310a, "DVSPDVMA");
        return jM7415d < 0 || System.currentTimeMillis() > jM7415d;
    }

    /* JADX INFO: renamed from: c */
    private boolean m7200c() {
        Map<String, String> mapM7125f = C5408d.m7125f(this.f7310a);
        TreeMap treeMap = new TreeMap();
        JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7310a).m7145a(crypto.convert("KIqf3XHfsMgGRJE="));
        JSONArray jSONArrayOptJSONArray = jSONObjectM7145a != null ? jSONObjectM7145a.optJSONArray(crypto.convert("PZebxXzP")) : null;
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                String strOptString = jSONArrayOptJSONArray.optString(i11);
                if (strOptString.equals("e1")) {
                    Map<String, String> map = this.f7312c;
                    if (map != null && !map.isEmpty()) {
                        treeMap.put("e1", C5411e.m7130b(new TreeMap(this.f7312c)).toString());
                    }
                } else if (C5457z0.m7482b(strOptString)) {
                    String str = mapM7125f.get(strOptString);
                    if (C5457z0.m7482b(str)) {
                        treeMap.put(strOptString, str);
                    }
                }
            }
            mapM7125f = treeMap;
        }
        String strM7403a = C5446u.m7403a(C5411e.m7130b(mapM7125f).toString());
        if (C5457z0.m7480a(strM7403a)) {
            return true;
        }
        String strM7416e = C5447u0.m7416e(this.f7310a, "DVSPNEEDUPLOAD");
        if (!C5457z0.m7480a(strM7416e)) {
            if (strM7416e.equals(strM7403a)) {
                C5415f0.m7136a("=========Equallllll,no need to upload");
                return false;
            }
            C5415f0.m7136a("=========not hit, need to upload");
        }
        C5447u0.m7411b(this.f7310a, "DVSPNEEDUPLOAD", strM7403a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m7201e() {
        long jM7415d = C5447u0.m7415d(this.f7310a, "DVSPDVMA");
        return C5457z0.m7480a(C5455y0.m7470a(this.f7310a).m7475a(crypto.convert("H6iqxnPZqQ=="))) || C5455y0.m7470a(this.f7310a).m7479c() || ((jM7415d > 0L ? 1 : (jM7415d == 0L ? 0 : -1)) < 0 || (System.currentTimeMillis() > (jM7415d + 2592000000L) ? 1 : (System.currentTimeMillis() == (jM7415d + 2592000000L) ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: f */
    private void m7202f() {
        storage.globalSet(crypto.convert("H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"), "", 0);
        storage.globalSet(crypto.convert("H6ih/XXMmPMrc5VsFNA59i1Y"), "", 0);
        storage.globalSet(crypto.convert("H6ih/XXMmO4KRLN/BOo="), "", 0);
    }

    /* JADX INFO: renamed from: g */
    private void m7203g() {
        try {
            String strM7398e = C5444t.m7398e(crypto.convert("dI6MxnuTtMUDVttzEf8a"));
            if (C5457z0.m7482b(strM7398e)) {
                storage.globalSet(crypto.convert("H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"), strM7398e.toLowerCase(), 0);
            }
            File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? this.f7310a.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
            if (externalFilesDir != null) {
                String absolutePath = externalFilesDir.getAbsolutePath();
                if (C5457z0.m7482b(absolutePath)) {
                    storage.globalSet(crypto.convert("H6ih/XXMmPMrc5VsFNA59i1Y"), absolutePath, 0);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private C5428l(Context context) {
        this.f7310a = null;
        if (context != null) {
            this.f7310a = context;
            return;
        }
        throw new IllegalArgumentException("DVIDManger initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    private void m7196a(String str) {
        if (!C5417g.m7143a(this.f7310a).m7146b("main")) {
            C5422i.m7160b().m7164a(this.f7310a, 0, null, str);
            return;
        }
        if (!C5422i.m7160b().m7170c(this.f7310a)) {
            C5422i.m7160b().m7164a(this.f7310a, 0, null, str);
            return;
        }
        if (!((C5424j.m7188b(this.f7310a) || C5424j.m7187a(this.f7310a)) ? m7201e() : m7198a())) {
            C5422i.m7160b().m7164a(this.f7310a, 0, null, str);
            return;
        }
        Map<String, String> mapM7125f = C5408d.m7125f(this.f7310a);
        HashMap map = new HashMap();
        map.putAll(mapM7125f);
        m7197a((Map<String, String>) map, false);
        C5430m.a aVarM7220a = C5430m.m7220a(C5411e.m7130b(map).toString(), 1);
        if (aVarM7220a == null || aVarM7220a.f7317b == null) {
            C5422i.m7160b().m7164a(this.f7310a, 1, null, str);
            return;
        }
        if (aVarM7220a.f7316a != 0) {
            C5422i.m7160b().m7164a(this.f7310a, aVarM7220a.f7316a, null, str);
            return;
        }
        long jNanoTime = System.nanoTime();
        int i11 = 0;
        while (i11 < 60 && !C5440r.m7286q().m7346j0(this.f7310a)) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            i11++;
        }
        if (i11 >= 60) {
            C5422i.m7160b().m7164a(this.f7310a, 13, null, str);
            return;
        }
        C5447u0.m7407a(this.f7310a, "DVSPLASTREAL120WAITTIME", (System.nanoTime() - jNanoTime) / 1000000);
        C5422i.m7160b().f7268g = aVarM7220a.f7317b;
        C5426k.m7189a().f7294b.execute(new a(str));
        Map<String, String> mapM7120b = C5408d.m7120b(this.f7310a);
        try {
            C5422i.m7160b().f7266e.await();
        } catch (Throwable th2) {
            ExceptionUtil.m7095b("barrierException", th2, this.f7310a);
            C5415f0.m7139a(th2);
        }
        if (C5422i.m7160b().f7267f) {
            mapM7120b.put("d96", C5422i.m7160b().f7271j + "");
            mapM7120b.put("d98", C5422i.m7160b().f7272k);
            mapM7120b.put("d100", C5422i.m7160b().f7270i + "");
            mapM7120b.put("v1", C5455y0.m7470a(this.f7310a).m7475a(crypto.convert("H6i37Q==")));
            mapM7120b.put("v2", C5455y0.m7470a(this.f7310a).m7475a(crypto.convert("H6iqxnPZqQ==")));
            HashMap map2 = new HashMap();
            map2.putAll(mapM7120b);
            m7197a((Map<String, String>) map2, false);
            C5430m.a aVarM7220a2 = C5430m.m7220a(C5411e.m7130b(map2).toString(), 0);
            if (aVarM7220a2 == null || aVarM7220a2.f7317b == null || aVarM7220a2.f7316a != 0) {
                C5422i.m7160b().f7269h = null;
            } else {
                C5422i.m7160b().f7269h = aVarM7220a2.f7317b;
            }
            try {
                C5422i.m7160b().f7266e.await();
            } catch (Throwable th3) {
                ExceptionUtil.m7095b("barrierException", th3, this.f7310a);
                C5415f0.m7139a(th3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7204a(Map<String, String> map, String str) {
        C5422i.m7160b().f7270i = System.nanoTime();
        if (C5457z0.m7480a(C5422i.m7160b().m7162a()) || C5457z0.m7480a(C5422i.m7160b().m7169c())) {
            C5422i.m7160b().m7164a(this.f7310a, 8, null, str);
            return;
        }
        this.f7312c = map;
        m7203g();
        m7196a(str);
        m7202f();
        C5408d.m7118a();
    }

    /* JADX INFO: renamed from: a */
    private void m7197a(Map<String, String> map, boolean z11) {
        if (C5457z0.m7482b(C5422i.m7160b().m7162a())) {
            map.put("u1", C5422i.m7160b().m7162a());
        }
        if (C5457z0.m7482b(C5422i.m7160b().m7169c())) {
            map.put("u2", C5422i.m7160b().m7169c());
        }
        if (z11 && C5457z0.m7482b(this.f7311b)) {
            map.put("event_name", this.f7311b);
        }
        Map<String, String> map2 = this.f7312c;
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        HashMap map3 = new HashMap(this.f7312c);
        String str = (String) map3.get(DVKeyName.DV_EXTERN_KEY);
        if (map3.containsKey(DVKeyName.DV_EXTERN_KEY) && !C5457z0.m7480a(str)) {
            map.put("u3", str);
            map3.remove(DVKeyName.DV_EXTERN_KEY);
        }
        if (map3.isEmpty()) {
            return;
        }
        String string = C5411e.m7130b(map3).toString();
        if (C5457z0.m7482b(string)) {
            map.put("e1", string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private boolean m7198a() {
        String strM7475a = C5455y0.m7470a(this.f7310a).m7475a(crypto.convert("H6iqxnPZqQ=="));
        boolean zM7479c = C5455y0.m7470a(this.f7310a).m7479c();
        boolean zM7200c = m7200c();
        boolean zM7199b = m7199b();
        Object[] objArr = C5457z0.m7480a(strM7475a) || zM7479c;
        C5408d.f7244d = (zM7199b ? 2 : 0) | (zM7200c ? 1 : 0) | (objArr != false ? 4 : 0);
        return zM7200c || zM7199b || objArr == true;
    }
}
