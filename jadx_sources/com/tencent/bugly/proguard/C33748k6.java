package com.tencent.bugly.proguard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33748k6 extends C33913s5 implements Serializable {

    /* JADX INFO: renamed from: t */
    public static final String f70558t = "RMonitor_FdLeak_Result";

    /* JADX INFO: renamed from: u */
    public static final String f70559u = "ref_stacks";

    /* JADX INFO: renamed from: p */
    public final int f70560p;

    /* JADX INFO: renamed from: q */
    public final int f70561q;

    /* JADX INFO: renamed from: r */
    public List<C33706i6> f70562r;

    /* JADX INFO: renamed from: s */
    public final Map<String, C33727j6> f70563s = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m73717a(C33727j6 c33727j6) {
        if (c33727j6 != null) {
            this.f70563s.put(c33727j6.m73529c(), c33727j6);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73720a(List<C33706i6> list) {
        this.f70562r = list;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, C33727j6> m73721d() {
        return this.f70563s;
    }

    /* JADX INFO: renamed from: e */
    public int m73722e() {
        return this.f70561q;
    }

    /* JADX INFO: renamed from: f */
    public List<C33706i6> m73723f() {
        return this.f70562r;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m73724g() {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f70563s.keySet()) {
            C33727j6 c33727j6 = this.f70563s.get(str);
            if (c33727j6 != null) {
                m73719a(str, c33727j6, jSONObject);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public int m73725h() {
        return this.f70560p;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m73726i() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : this.f70563s.keySet()) {
            C33727j6 c33727j6 = this.f70563s.get(str);
            if (c33727j6 != null) {
                m73718a(str, c33727j6, jSONArray);
            }
        }
        try {
            jSONObject.put(f70559u, jSONArray);
            return jSONObject;
        } catch (JSONException e11) {
            C33648fb.m73043b(f70558t, "getStacksJson failed: " + e11.getMessage());
            return jSONObject;
        }
    }

    public String toString() {
        return "FdLeakIssueResult{fdType=" + this.f70560p + ", fdCount=" + this.f70561q + ", fdAnalyzeResult=" + m73724g() + ", " + m73726i() + "}";
    }

    public C33748k6(int i11, int i12) {
        this.f70560p = i11;
        this.f70561q = i12;
    }

    /* JADX INFO: renamed from: a */
    public final void m73719a(String str, C33727j6 c33727j6, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C33973v5 c33973v5 : c33727j6.m73525a()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(c33973v5.m75287b(), c33973v5.m75286a());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(str, jSONArray);
        } catch (JSONException e11) {
            C33648fb.m73043b(f70558t, "toJsonString failed: " + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73718a(String str, C33727j6 c33727j6, JSONArray jSONArray) {
        List<C33973v5> listM73527b = c33727j6.m73527b();
        if (listM73527b == null) {
            return;
        }
        try {
            for (C33973v5 c33973v5 : listM73527b) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("call_stack", c33973v5.m75287b());
                jSONObject.put("count", c33973v5.m75286a());
                jSONObject.put("fd_issue_type", str);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e11) {
            C33648fb.m73043b(f70558t, "toJsonString failed: " + e11.getMessage());
        }
    }
}
