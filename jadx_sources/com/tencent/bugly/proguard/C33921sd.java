package com.tencent.bugly.proguard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33921sd {

    /* JADX INFO: renamed from: a */
    public HashMap<String, HashMap<String, byte[]>> f71933a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, Object> f71934b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public HashMap<String, Object> f71935c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public String f71936d = "GBK";

    /* JADX INFO: renamed from: e */
    public C33752ka f71937e = new C33752ka();

    /* JADX INFO: renamed from: a */
    public void mo74144a() {
        this.f71935c.clear();
    }

    /* JADX INFO: renamed from: b */
    public <T> void mo74149b(String str, T t11) {
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
        byte[] bArrM74111b = C33794ma.m74111b(c33773la.f70833a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList<String> arrayList = new ArrayList<>(1);
        m74978a(arrayList, t11);
        map.put(C33638f1.m72979a(arrayList), bArrM74111b);
        this.f71935c.remove(str);
        this.f71933a.put(str, map);
    }

    /* JADX INFO: renamed from: c */
    public String mo74152c() {
        return this.f71936d;
    }

    /* JADX INFO: renamed from: d */
    public Set<String> mo74156d() {
        return Collections.unmodifiableSet(this.f71933a.keySet());
    }

    /* JADX INFO: renamed from: e */
    public boolean mo74159e() {
        return this.f71933a.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public void mo74162f(String str) {
        this.f71936d = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo74146a(String str) {
        return this.f71933a.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public final Object m74979c(String str) {
        if (this.f71934b.containsKey(str)) {
            return this.f71934b.get(str);
        }
        Object objM72982b = C33638f1.m72982b(str);
        this.f71934b.put(str, objM72982b);
        return objM72982b;
    }

    /* JADX INFO: renamed from: d */
    public <T> T mo74154d(String str) throws C33818nd {
        String key = null;
        if (!this.f71933a.containsKey(str)) {
            return null;
        }
        if (this.f71935c.containsKey(str)) {
            return (T) this.f71935c.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f71933a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            key = next.getKey();
            value = next.getValue();
        }
        try {
            Object objM74979c = m74979c(key);
            this.f71937e.m73768a(value);
            C33752ka c33752ka = this.f71937e;
            c33752ka.f70614b = this.f71936d;
            T t11 = (T) c33752ka.m73757a((JceStruct) objM74979c, 0, true);
            m74980c(str, t11);
            return t11;
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new C33818nd(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public <T> T mo74157e(String str) throws C33818nd {
        String key;
        byte[] value;
        if (!this.f71933a.containsKey(str)) {
            return null;
        }
        byte[] bArr = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f71933a.remove(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            key = next.getKey();
            value = next.getValue();
        } else {
            key = "";
            value = bArr;
        }
        try {
            Object objM72982b = C33638f1.m72982b(key);
            this.f71937e.m73768a(value);
            C33752ka c33752ka = this.f71937e;
            c33752ka.f70614b = this.f71936d;
            return (T) c33752ka.m73758a(objM72982b, 0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new C33818nd(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo74160f() {
        return this.f71933a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> T mo74141a(String str, Object obj) {
        String key;
        byte[] value;
        if (!this.f71933a.containsKey(str)) {
            return obj;
        }
        if (this.f71935c.containsKey(str)) {
            return (T) this.f71935c.get(str);
        }
        byte[] bArr = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f71933a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            key = next.getKey();
            value = next.getValue();
        } else {
            key = "";
            value = bArr;
        }
        try {
            Object objM74979c = m74979c(key);
            this.f71937e.m73768a(value);
            C33752ka c33752ka = this.f71937e;
            c33752ka.f70614b = this.f71936d;
            T t11 = (T) c33752ka.m73758a(objM74979c, 0, true);
            m74980c(str, t11);
            return t11;
        } catch (Exception e11) {
            e11.printStackTrace();
            m74980c(str, obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74980c(String str, Object obj) {
        this.f71935c.put(str, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public <T> T mo74147b(String str) throws C33818nd {
        String key = null;
        if (!this.f71933a.containsKey(str)) {
            return null;
        }
        if (this.f71935c.containsKey(str)) {
            return (T) this.f71935c.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f71933a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            key = next.getKey();
            value = next.getValue();
        }
        try {
            Object objM74979c = m74979c(key);
            this.f71937e.m73768a(value);
            C33752ka c33752ka = this.f71937e;
            c33752ka.f70614b = this.f71936d;
            T t11 = (T) c33752ka.m73758a(objM74979c, 0, true);
            m74980c(str, t11);
            return t11;
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new C33818nd(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74978a(ArrayList<String> arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (obj.getClass().getComponentType().toString().equals("byte")) {
                if (Array.getLength(obj) > 0) {
                    arrayList.add("java.util.List");
                    m74978a(arrayList, Array.get(obj, 0));
                    return;
                } else {
                    arrayList.add("Array");
                    arrayList.add("?");
                    return;
                }
            }
            throw new IllegalArgumentException("only byte[] is supported");
        }
        if (!(obj instanceof Array)) {
            if (obj instanceof List) {
                arrayList.add("java.util.List");
                List list = (List) obj;
                if (list.size() > 0) {
                    m74978a(arrayList, list.get(0));
                    return;
                } else {
                    arrayList.add("?");
                    return;
                }
            }
            if (obj instanceof Map) {
                arrayList.add("java.util.Map");
                Map map = (Map) obj;
                if (map.size() > 0) {
                    Object next = map.keySet().iterator().next();
                    Object obj2 = map.get(next);
                    arrayList.add(next.getClass().getName());
                    m74978a(arrayList, obj2);
                    return;
                }
                arrayList.add("?");
                arrayList.add("?");
                return;
            }
            arrayList.add(obj.getClass().getName());
            return;
        }
        throw new IllegalArgumentException("can not support Array, please use List");
    }

    /* JADX INFO: renamed from: b */
    public byte[] mo74151b() {
        C33773la c33773la = new C33773la(0);
        c33773la.f70834b = this.f71936d;
        c33773la.m73959a((Map) this.f71933a, 0);
        return C33794ma.m74111b(c33773la.f70833a);
    }

    /* JADX INFO: renamed from: a */
    public void mo74145a(byte[] bArr) {
        this.f71937e.m73768a(bArr);
        this.f71937e.f70614b = this.f71936d;
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f71933a = this.f71937e.m73761a((Map) map, 0, false);
    }
}
