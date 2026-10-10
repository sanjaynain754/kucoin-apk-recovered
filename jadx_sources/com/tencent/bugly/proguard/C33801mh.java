package com.tencent.bugly.proguard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.mh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33801mh extends C33921sd {

    /* JADX INFO: renamed from: f */
    public HashMap<String, byte[]> f70972f = null;

    /* JADX INFO: renamed from: g */
    public HashMap<String, Object> f70973g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public C33752ka f70974h = new C33752ka();

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: a */
    public void mo74144a() {
        this.f70973g.clear();
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: b */
    public <T> void mo74149b(String str, T t11) {
        if (this.f70972f == null) {
            super.mo74149b(str, t11);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t11 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t11 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C33773la c33773la = new C33773la(128);
        c33773la.f70834b = this.f71936d;
        c33773la.m73955a(t11, 0);
        this.f70972f.put(str, C33794ma.m74111b(c33773la.f70833a));
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: c */
    public String mo74152c() {
        return this.f71936d;
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: d */
    public Set<String> mo74156d() {
        HashMap<String, byte[]> map = this.f70972f;
        return map != null ? Collections.unmodifiableSet(map.keySet()) : Collections.unmodifiableSet(this.f71933a.keySet());
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: e */
    public boolean mo74159e() {
        HashMap<String, byte[]> map = this.f70972f;
        return map != null ? map.isEmpty() : this.f71933a.isEmpty();
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: f */
    public void mo74162f(String str) {
        this.f71936d = str;
    }

    /* JADX INFO: renamed from: c */
    private void m74140c(String str, Object obj) {
        this.f70973g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: a */
    public boolean mo74146a(String str) {
        HashMap<String, byte[]> map = this.f70972f;
        return map != null ? map.containsKey(str) : this.f71933a.containsKey(str);
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: f */
    public int mo74160f() {
        HashMap<String, byte[]> map = this.f70972f;
        return map != null ? map.size() : this.f71933a.size();
    }

    /* JADX INFO: renamed from: g */
    public void mo74163g() {
        this.f70972f = new HashMap<>();
    }

    /* JADX INFO: renamed from: c */
    public void mo74153c(byte[] bArr) {
        this.f70974h.m73768a(bArr);
        this.f70974h.f70614b = this.f71936d;
        HashMap map = new HashMap(1);
        map.put("", new byte[0]);
        this.f70972f = this.f70974h.m73761a((Map) map, 0, false);
    }

    /* JADX INFO: renamed from: d */
    public <T> T m74155d(String str, T t11) throws C33818nd {
        HashMap<String, byte[]> map = this.f70972f;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f70973g.containsKey(str)) {
                return (T) this.f70973g.get(str);
            }
            try {
                T t12 = (T) m74143a(this.f70972f.get(str), t11);
                if (t12 == null) {
                    return t12;
                }
                this.f70973g.put(str, t12);
                return t12;
            } catch (Exception e11) {
                throw new C33818nd(e11);
            }
        }
        if (!this.f71933a.containsKey(str)) {
            return null;
        }
        if (this.f70973g.containsKey(str)) {
            return (T) this.f70973g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f71933a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f70974h.m73768a(value);
            C33752ka c33752ka = this.f70974h;
            c33752ka.f70614b = this.f71936d;
            T t13 = (T) c33752ka.m73758a((Object) t11, 0, true);
            this.f70973g.put(str, t13);
            return t13;
        } catch (Exception e12) {
            throw new C33818nd(e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public <T> T m74158e(String str, T t11) throws C33818nd {
        if (!this.f70972f.containsKey(str)) {
            return null;
        }
        if (this.f70973g.containsKey(str)) {
            return (T) this.f70973g.get(str);
        }
        try {
            T t12 = (T) m74143a(this.f70972f.get(str), t11);
            if (t12 == null) {
                return t12;
            }
            this.f70973g.put(str, t12);
            return t12;
        } catch (Exception e11) {
            throw new C33818nd(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> T m74142a(String str, T t11, Object obj) {
        return !this.f70972f.containsKey(str) ? obj : (T) m74155d(str, t11);
    }

    /* JADX INFO: renamed from: f */
    public <T> T m74161f(String str, T t11) throws C33818nd {
        if (!this.f70972f.containsKey(str)) {
            return null;
        }
        if (t11 != null) {
            return (T) m74143a(this.f70972f.remove(str), t11);
        }
        this.f70972f.remove(str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Object m74143a(byte[] bArr, Object obj) {
        this.f70974h.m73768a(bArr);
        C33752ka c33752ka = this.f70974h;
        c33752ka.f70614b = this.f71936d;
        return c33752ka.m73758a(obj, 0, true);
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: a */
    public <T> T mo74141a(String str, Object obj) {
        if (this.f70972f == null) {
            return (T) super.mo74141a(str, obj);
        }
        throw new RuntimeException("data is encoded by new version, please use get(String name, T proxy, Object defaultValue)");
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: e */
    public <T> T mo74157e(String str) throws C33818nd {
        HashMap<String, byte[]> map = this.f70972f;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            this.f70972f.remove(str);
            return null;
        }
        return (T) super.mo74157e(str);
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: a */
    public void mo74145a(byte[] bArr) {
        try {
            super.mo74145a(bArr);
        } catch (Exception unused) {
            this.f70974h.m73768a(bArr);
            this.f70974h.f70614b = this.f71936d;
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f70972f = this.f70974h.m73761a((Map) map, 0, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public <T> T m74148b(String str, T t11, T t12) throws C33818nd {
        HashMap<String, byte[]> map = this.f70972f;
        if (map != null) {
            if (map.containsKey(str)) {
                if (this.f70973g.containsKey(str)) {
                    return (T) this.f70973g.get(str);
                }
                try {
                    T t13 = (T) m74143a(this.f70972f.get(str), t11);
                    if (t13 == null) {
                        return t13;
                    }
                    this.f70973g.put(str, t13);
                    return t13;
                } catch (Exception e11) {
                    throw new C33818nd(e11);
                }
            }
        } else if (this.f71933a.containsKey(str)) {
            if (this.f70973g.containsKey(str)) {
                return (T) this.f70973g.get(str);
            }
            byte[] value = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.f71933a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                next.getKey();
                value = next.getValue();
            }
            try {
                this.f70974h.m73768a(value);
                C33752ka c33752ka = this.f70974h;
                c33752ka.f70614b = this.f71936d;
                T t14 = (T) c33752ka.m73758a((Object) t11, 0, true);
                this.f70973g.put(str, t14);
                return t14;
            } catch (Exception e12) {
                throw new C33818nd(e12);
            }
        }
        return t12;
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: d */
    public <T> T mo74154d(String str) throws C33818nd {
        if (this.f70972f == null) {
            return (T) super.mo74154d(str);
        }
        throw new RuntimeException("data is encoded by new version, please use getJceStruct(String name,T proxy)");
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: b */
    public <T> T mo74147b(String str) throws C33818nd {
        if (this.f70972f == null) {
            return (T) super.mo74147b(str);
        }
        throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
    }

    @Override // com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: b */
    public byte[] mo74151b() {
        if (this.f70972f != null) {
            C33773la c33773la = new C33773la(0);
            c33773la.f70834b = this.f71936d;
            c33773la.m73959a((Map) this.f70972f, 0);
            return C33794ma.m74111b(c33773la.f70833a);
        }
        return super.mo74151b();
    }

    /* JADX INFO: renamed from: b */
    public void mo74150b(byte[] bArr) {
        super.mo74145a(bArr);
    }
}
