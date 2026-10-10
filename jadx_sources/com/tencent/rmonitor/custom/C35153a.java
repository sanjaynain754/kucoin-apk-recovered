package com.tencent.rmonitor.custom;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33702i2;
import com.tencent.bugly.proguard.C33945th;
import com.tencent.bugly.proguard.InterfaceC33876q8;
import com.tencent.bugly.proguard.InterfaceC33897r9;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.rmonitor.custom.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35153a implements ICustomDataEditorForIssue {

    /* JADX INFO: renamed from: i */
    public static final String f75231i = "a11";

    /* JADX INFO: renamed from: j */
    public static final String f75232j = "a12";

    /* JADX INFO: renamed from: k */
    public static final String f75233k = "a13";

    /* JADX INFO: renamed from: l */
    public static final String[] f75234l = {f75231i, f75232j, f75233k};

    /* JADX INFO: renamed from: m */
    public static final String f75235m = "user_data_";

    /* JADX INFO: renamed from: d */
    public final C33945th f75239d;

    /* JADX INFO: renamed from: e */
    public final C33945th f75240e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet<InterfaceC33876q8> f75241f;

    /* JADX INFO: renamed from: g */
    public long f75242g = 0;

    /* JADX INFO: renamed from: h */
    public InterfaceC33897r9 f75243h = null;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, Double> f75236a = new ConcurrentHashMap<>(10);

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f75237b = new ConcurrentHashMap<>(10);

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f75238c = new ConcurrentHashMap<>(f75234l.length);

    /* JADX INFO: renamed from: a */
    public void m77139a(InterfaceC33897r9 interfaceC33897r9) {
        this.f75243h = interfaceC33897r9;
    }

    /* JADX INFO: renamed from: b */
    public void m77149b(InterfaceC33876q8 interfaceC33876q8) {
        if (interfaceC33876q8 == null) {
            return;
        }
        this.f75241f.remove(interfaceC33876q8);
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m77152c() {
        try {
            return this.f75240e.m75065b();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public long m77154d() {
        return this.f75242g;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m77157e() {
        try {
            if (!this.f75238c.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    m77145a(jSONObject, this.f75238c);
                    return jSONObject;
                } catch (Throwable unused) {
                    return jSONObject;
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m77159g() {
        JSONObject jSONObjectM75065b = null;
        try {
            jSONObjectM75065b = this.f75239d.m75062a() ? null : this.f75239d.m75065b();
            if (!this.f75236a.isEmpty()) {
                if (jSONObjectM75065b == null) {
                    jSONObjectM75065b = new JSONObject();
                }
                m77144a(jSONObjectM75065b);
            }
            if (!this.f75237b.isEmpty()) {
                if (jSONObjectM75065b == null) {
                    jSONObjectM75065b = new JSONObject();
                }
                m77145a(jSONObjectM75065b, this.f75237b);
            }
            if (!this.f75238c.isEmpty()) {
                if (jSONObjectM75065b == null) {
                    jSONObjectM75065b = new JSONObject();
                }
                m77145a(jSONObjectM75065b, this.f75238c);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectM75065b;
    }

    /* JADX INFO: renamed from: a */
    public void m77138a(InterfaceC33876q8 interfaceC33876q8) {
        if (interfaceC33876q8 == null) {
            return;
        }
        this.f75241f.add(interfaceC33876q8);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C35153a clone() {
        C35153a c35153a = new C35153a();
        c35153a.f75236a.putAll(this.f75236a);
        c35153a.f75239d.m75061a(this.f75239d);
        c35153a.f75240e.m75061a(this.f75240e);
        m77143a(this.f75237b, c35153a.f75237b);
        m77143a(this.f75238c, c35153a.f75238c);
        return c35153a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m77153c(String str, String str2) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        boolean zRemove = false;
        if (!TextUtils.isEmpty(str2) && str2.length() <= 1024) {
            if (C33702i2.m73295a(f75234l, str)) {
                copyOnWriteArrayList = this.f75238c.get(str);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(str2)) {
                    zRemove = copyOnWriteArrayList.remove(str2);
                }
            } else {
                copyOnWriteArrayList = null;
            }
            if (zRemove) {
                m77142a(str, copyOnWriteArrayList);
            }
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m77155d(String str) {
        return str == null || str.isEmpty() || str.length() > 1024;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m77158f() {
        try {
            JSONArray jSONArrayM77136a = m77136a(this.f75238c.get(f75231i));
            JSONArray jSONArrayM77136a2 = m77136a(this.f75238c.get(f75232j));
            if (jSONArrayM77136a != null || jSONArrayM77136a2 != null) {
                JSONObject jSONObject = new JSONObject();
                if (jSONArrayM77136a != null) {
                    try {
                        jSONObject.put(f75231i, jSONArrayM77136a);
                    } catch (Throwable unused) {
                        return jSONObject;
                    }
                }
                if (jSONArrayM77136a2 == null) {
                    return jSONObject;
                }
                jSONObject.put(f75232j, jSONArrayM77136a2);
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public double getNumberParam(String str) {
        Double d11 = C33702i2.m73295a(ICustomDataEditor.NUMBER_PARAM_KEYS, str) ? this.f75236a.get(str) : null;
        if (d11 != null) {
            return d11.doubleValue();
        }
        return 0.0d;
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public List<String> getStringArrayParam(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str) ? this.f75237b.get(str) : null;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = IDataEditor.DEFAULT_STRING_ARRAY_VALUE;
        }
        return Collections.unmodifiableList(copyOnWriteArrayList);
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public String getStringParam(String str) {
        String userData = C33702i2.m73295a(ICustomDataEditor.STRING_PARAM_KEYS, str) ? this.f75239d.getUserData(str) : null;
        return userData == null ? "" : userData;
    }

    @Override // com.tencent.rmonitor.custom.IUserDataEditor
    public String getUserData(String str) {
        return this.f75240e.getUserData(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m77160h() {
        return this.f75236a.isEmpty() && this.f75239d.m75062a() && this.f75240e.m75062a() && this.f75237b.isEmpty() && this.f75238c.isEmpty();
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public boolean putNumberParam(String str, double d11) {
        boolean z11;
        if (C33702i2.m73295a(ICustomDataEditor.NUMBER_PARAM_KEYS, str)) {
            this.f75236a.put(str, Double.valueOf(d11));
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m77140a(str, d11);
        }
        return z11;
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public boolean putStringParam(String str, String str2) {
        boolean z11;
        if (C33702i2.m73295a(ICustomDataEditor.STRING_PARAM_KEYS, str)) {
            str2 = C33702i2.m73294a(str2);
            this.f75239d.putUserData(str, str2);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m77141a(str, str2);
        }
        return z11;
    }

    @Override // com.tencent.rmonitor.custom.IUserDataEditor
    public boolean putUserData(String str, String str2) {
        boolean zPutUserData = this.f75240e.putUserData(str, str2);
        if (zPutUserData) {
            m77141a(f75235m + str, str2);
        }
        return zPutUserData;
    }

    public C35153a() {
        int iMax = 0;
        for (String str : ICustomDataEditor.STRING_PARAM_KEYS) {
            iMax = Math.max(str.length(), iMax);
        }
        this.f75239d = new C33945th(iMax + 1, ICustomDataEditor.STRING_PARAM_KEYS.length);
        this.f75240e = new C33945th(200, 100);
        this.f75241f = new CopyOnWriteArraySet<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m77143a(ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap, ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap2) {
        for (String str : concurrentHashMap.keySet()) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = concurrentHashMap.get(str);
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                concurrentHashMap2.put(str, new CopyOnWriteArrayList<>(copyOnWriteArrayList));
            }
        }
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public boolean addStringToSequence(@ICustomDataEditor.InterfaceC35151b String str, String str2) {
        List<String> listM77151c;
        boolean z11 = false;
        if (m77155d(str2)) {
            return false;
        }
        if (C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str)) {
            listM77151c = m77151c(str);
            if (listM77151c.size() < 30) {
                listM77151c.add(str2);
                z11 = true;
            }
        } else {
            listM77151c = null;
        }
        if (z11) {
            m77142a(str, listM77151c);
        }
        return z11;
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public boolean addStringToStringArrayParam(String str, String str2) {
        List<String> listM77151c;
        boolean z11 = false;
        if (m77155d(str2)) {
            return false;
        }
        if (C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str)) {
            listM77151c = m77151c(str);
            if (!listM77151c.contains(str2) && listM77151c.size() < 30) {
                listM77151c.add(str2);
                z11 = true;
            }
        } else {
            listM77151c = null;
        }
        if (z11) {
            m77142a(str, listM77151c);
        }
        return z11;
    }

    @Override // com.tencent.rmonitor.custom.ICustomDataEditor
    public boolean removeStringFromStringArrayParam(String str, String str2) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        boolean zRemove = false;
        if (m77155d(str2)) {
            return false;
        }
        if (C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str)) {
            copyOnWriteArrayList = this.f75237b.get(str);
            if (copyOnWriteArrayList != null) {
                zRemove = copyOnWriteArrayList.remove(str2);
            }
        } else {
            copyOnWriteArrayList = null;
        }
        if (zRemove) {
            m77142a(str, copyOnWriteArrayList);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: e */
    public String m77156e(String str) {
        String strM75064b = this.f75240e.m75064b(str);
        if (!TextUtils.isEmpty(strM75064b)) {
            m77141a(f75235m + str, "");
        }
        return strM75064b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77146a(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        boolean z11 = false;
        if (C33702i2.m73295a(f75234l, str)) {
            copyOnWriteArrayList = this.f75238c.get(str);
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                copyOnWriteArrayList.clear();
                z11 = true;
            }
        } else {
            copyOnWriteArrayList = null;
        }
        if (z11) {
            m77142a(str, copyOnWriteArrayList);
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77150b(String str, String str2) {
        List<String> listM77151c;
        boolean z11 = false;
        if (!TextUtils.isEmpty(str2) && str2.length() <= 1024) {
            if (C33702i2.m73295a(f75234l, str)) {
                listM77151c = m77151c(str);
                if (!listM77151c.contains(str2) && listM77151c.size() < 30) {
                    listM77151c.add(str2);
                    z11 = true;
                }
            } else {
                listM77151c = null;
            }
            if (z11) {
                m77142a(str, listM77151c);
            }
        }
        return z11;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m77151c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        if (C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str)) {
            concurrentHashMap = this.f75237b;
        } else {
            concurrentHashMap = C33702i2.m73295a(f75234l, str) ? this.f75238c : null;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = concurrentHashMap != null ? concurrentHashMap.get(str) : null;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, copyOnWriteArrayList);
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m77141a(String str, String str2) {
        InterfaceC33897r9 interfaceC33897r9 = this.f75243h;
        if (interfaceC33897r9 != null) {
            interfaceC33897r9.mo74125a(str, str2);
            interfaceC33897r9.mo74122a();
        }
        m77137a();
    }

    /* JADX INFO: renamed from: b */
    public List<String> m77148b(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C33702i2.m73295a(f75234l, str) ? this.f75238c.get(str) : null;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = IDataEditor.DEFAULT_STRING_ARRAY_VALUE;
        }
        return Collections.unmodifiableList(copyOnWriteArrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m77140a(String str, double d11) {
        InterfaceC33897r9 interfaceC33897r9 = this.f75243h;
        if (interfaceC33897r9 != null) {
            interfaceC33897r9.mo74123a(str, d11);
            interfaceC33897r9.mo74122a();
        }
        m77137a();
    }

    /* JADX INFO: renamed from: a */
    public final void m77142a(String str, List<String> list) {
        InterfaceC33897r9 interfaceC33897r9 = this.f75243h;
        if (interfaceC33897r9 != null) {
            interfaceC33897r9.mo74126a(str, list);
            interfaceC33897r9.mo74122a();
        }
        m77137a();
    }

    /* JADX INFO: renamed from: a */
    public final void m77137a() {
        this.f75242g++;
        try {
            Iterator<InterfaceC33876q8> it = this.f75241f.iterator();
            while (it.hasNext()) {
                it.next().m74677a(this.f75242g);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77144a(JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, Double> entry : this.f75236a.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (value != null) {
                jSONObject.put(key, value);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77145a(JSONObject jSONObject, ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap) throws JSONException {
        for (Map.Entry<String, CopyOnWriteArrayList<String>> entry : concurrentHashMap.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayM77136a = m77136a(entry.getValue());
            if (jSONArrayM77136a != null) {
                jSONObject.put(key, jSONArrayM77136a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m77136a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }
}
