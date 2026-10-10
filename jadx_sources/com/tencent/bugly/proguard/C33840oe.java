package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.oe */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33840oe implements InterfaceC33917s9 {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, String> f71330a;

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public Set<String> mo74447a() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f71330a;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.keySet();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public boolean mo74449a(String str, boolean z11) {
        String strM74444a = m74444a(str);
        if (!TextUtils.isEmpty(strM74444a)) {
            try {
                return Boolean.parseBoolean(strM74444a);
            } catch (Throwable unused) {
            }
        }
        return z11;
    }

    public C33840oe(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            this.f71330a = new ConcurrentHashMap<>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f71330a.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public long mo74443a(String str, long j11) {
        String strM74444a = m74444a(str);
        if (!TextUtils.isEmpty(strM74444a)) {
            try {
                return Long.parseLong(strM74444a);
            } catch (Throwable unused) {
            }
        }
        return j11;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public double mo74442a(String str, double d11) {
        String strM74444a = m74444a(str);
        if (!TextUtils.isEmpty(strM74444a)) {
            try {
                return Double.parseDouble(strM74444a);
            } catch (Throwable unused) {
            }
        }
        return d11;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public String mo74445a(String str, String str2) {
        String strM74444a = m74444a(str);
        return strM74444a == null ? str2 : strM74444a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public List<String> mo74446a(String str, List<String> list) {
        String strM74444a = m74444a(str);
        return strM74444a == null ? list : C33861pe.m74563a(strM74444a);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33917s9
    /* JADX INFO: renamed from: a */
    public JSONObject mo74448a(String str, JSONObject jSONObject) {
        String strM74444a = m74444a(str);
        if (strM74444a == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(strM74444a);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m74444a(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f71330a) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }
}
