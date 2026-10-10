package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.custom.IUserDataEditor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.th */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33945th implements IUserDataEditor {

    /* JADX INFO: renamed from: a */
    public final int f72121a;

    /* JADX INFO: renamed from: b */
    public final int f72122b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap<String, String> f72123c = new ConcurrentHashMap<>(10);

    /* JADX INFO: renamed from: a */
    public boolean m75062a() {
        return this.f72123c.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m75065b() throws JSONException {
        if (this.f72123c.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f72123c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(value)) {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m75061a(C33945th c33945th) {
        if (c33945th == null || c33945th == this) {
            return;
        }
        this.f72123c.putAll(c33945th.f72123c);
    }

    public C33945th(int i11, int i12) {
        this.f72121a = i11;
        this.f72122b = i12;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75063a(String str) {
        return str == null || str.isEmpty() || str.length() > this.f72121a;
    }

    @Override // com.tencent.rmonitor.custom.IUserDataEditor
    public String getUserData(String str) {
        if (!m75063a(str) && this.f72123c.containsKey(str)) {
            return this.f72123c.get(str);
        }
        return null;
    }

    @Override // com.tencent.rmonitor.custom.IUserDataEditor
    public boolean putUserData(String str, String str2) {
        if (m75063a(str)) {
            return false;
        }
        if (!this.f72123c.containsKey(str) && this.f72123c.size() >= this.f72122b) {
            return false;
        }
        this.f72123c.put(str, C33702i2.m73294a(str2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public String m75064b(String str) {
        if (m75063a(str) || !this.f72123c.containsKey(str)) {
            return null;
        }
        return this.f72123c.remove(str);
    }
}
