package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.nb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33816nb {

    /* JADX INFO: renamed from: c */
    public static final long f71103c = 200;

    /* JADX INFO: renamed from: a */
    public final C33920sc f71104a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33546ae f71105b;

    /* JADX INFO: renamed from: a */
    public final void m74263a(JSONObject jSONObject) throws JSONException {
        C33920sc.a aVarM74969a = this.f71104a.m74969a();
        JSONArray jSONArray = new JSONArray();
        if (aVarM74969a != null) {
            jSONArray.put(aVarM74969a.f71919b);
            jSONArray.put(aVarM74969a.f71920c);
            jSONArray.put(aVarM74969a.f71921d);
            jSONArray.put(m74261a(System.currentTimeMillis(), aVarM74969a.f71919b));
        }
        jSONObject.put("current_item", jSONArray);
    }

    /* JADX INFO: renamed from: b */
    public final void m74264b(JSONObject jSONObject) throws JSONException {
        List<C33920sc.a> listM74973b = this.f71104a.m74973b();
        JSONArray jSONArray = new JSONArray();
        if (listM74973b != null && listM74973b.size() > 0) {
            for (C33920sc.a aVar : listM74973b) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(aVar.f71919b);
                jSONArray2.put(aVar.f71920c);
                jSONArray2.put(aVar.f71921d);
                jSONArray2.put(aVar.f71922e);
                jSONArray2.put(aVar.f71923f);
                jSONArray2.put(m74262a(aVar));
                jSONArray.put(jSONArray2);
            }
        }
        jSONObject.put("excuted_queue", jSONArray);
    }

    /* JADX INFO: renamed from: c */
    public final void m74265c(JSONObject jSONObject) throws JSONException {
        ArrayList<C33920sc.b> arrayListM74974c = this.f71104a.m74974c();
        JSONArray jSONArray = new JSONArray();
        if (arrayListM74974c != null && arrayListM74974c.size() > 0) {
            for (C33920sc.b bVar : arrayListM74974c) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(bVar.f71926a);
                jSONArray2.put(bVar.f71927b);
                jSONArray2.put(bVar.f71928c);
                jSONArray2.put(bVar.f71929d);
                jSONArray2.put(bVar.f71930e);
                jSONArray2.put(bVar.f71931f);
                jSONArray.put(jSONArray2);
            }
        }
        jSONObject.put("excuting_queue", jSONArray);
    }

    public C33816nb(C33920sc c33920sc, InterfaceC33546ae interfaceC33546ae) {
        this.f71104a = c33920sc;
        this.f71105b = interfaceC33546ae;
    }

    /* JADX INFO: renamed from: a */
    public String m74260a() {
        JSONObject jSONObject = new JSONObject();
        try {
            m74264b(jSONObject);
            m74263a(jSONObject);
            m74265c(jSONObject);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m74262a(C33920sc.a aVar) {
        return aVar.m74977b() ? m74261a(aVar.f71924g, 200L) : "";
    }

    /* JADX INFO: renamed from: a */
    public final String m74261a(long j11, long j12) {
        C33978va c33978vaMo72361a = this.f71105b.mo72361a(InterfaceC33617e1.f69652a, "looper_stack", j11);
        return (c33978vaMo72361a == null || Math.abs(j11 - c33978vaMo72361a.f72348g) > j12) ? "" : c33978vaMo72361a.f72346e;
    }
}
