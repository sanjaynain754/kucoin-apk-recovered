package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.be */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33567be implements InterfaceC33546ae {

    /* JADX INFO: renamed from: c */
    public static final String f69199c = "RMonitor_link";

    /* JADX INFO: renamed from: d */
    public static final int f69200d = 500;

    /* JADX INFO: renamed from: e */
    public static final int f69201e = 375;

    /* JADX INFO: renamed from: f */
    public static final int f69202f = 100;

    /* JADX INFO: renamed from: a */
    public final LinkedList<C33978va> f69203a = new LinkedList<>();

    /* JADX INFO: renamed from: b */
    public InterfaceC33998wa f69204b;

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public InterfaceC33998wa mo72362a() {
        return this.f69204b;
    }

    /* JADX INFO: renamed from: b */
    public final void m72527b(JSONObject jSONObject, List<C33978va> list) {
        try {
            HashSet hashSet = new HashSet(5);
            Iterator<C33978va> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m75293a());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C33820nf.f71160p);
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put(C33820nf.f71131J, jSONArray);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C33820nf.f71131J, jSONArray);
            jSONObject.put(C33820nf.f71160p, jSONObject2);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77130d("RMonitor_link", "collect plugin link data fail for " + th2.getMessage());
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72363a(InterfaceC33998wa interfaceC33998wa) {
        this.f69204b = interfaceC33998wa;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72364a(JSONObject jSONObject) {
        C33978va c33978vaM75292a;
        if (jSONObject == null || (c33978vaM75292a = C33978va.m75292a(jSONObject)) == null || c33978vaM75292a.m75295b() || this.f69203a.contains(c33978vaM75292a)) {
            return;
        }
        this.f69203a.add(c33978vaM75292a);
        m72525b();
        m72526b(c33978vaM75292a);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public void mo72365a(JSONObject jSONObject, List<String> list) {
        C33978va c33978vaM75292a;
        List<C33978va> listM72520a;
        if (jSONObject == null || list == null || list.isEmpty() || (c33978vaM75292a = C33978va.m75292a(jSONObject)) == null || (listM72520a = m72520a(c33978vaM75292a, list)) == null || listM72520a.isEmpty()) {
            return;
        }
        m72527b(jSONObject, listM72520a);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33546ae
    /* JADX INFO: renamed from: a */
    public C33978va mo72361a(String str, String str2, long j11) {
        long j12 = Long.MAX_VALUE;
        C33978va c33978va = null;
        for (C33978va c33978va2 : this.f69203a) {
            if (TextUtils.equals(str, c33978va2.f72342a) && TextUtils.equals(str2, c33978va2.f72343b)) {
                long jAbs = Math.abs(c33978va2.f72348g - j11);
                if (jAbs < j12) {
                    c33978va = c33978va2;
                    j12 = jAbs;
                }
            }
        }
        return c33978va;
    }

    /* JADX INFO: renamed from: b */
    public final void m72525b() {
        if (this.f69203a.size() < 500) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j11 = jCurrentTimeMillis + 60;
        m72523a(jCurrentTimeMillis - C33978va.f72340i, j11, 500);
        if (this.f69203a.size() > 375) {
            m72523a(jCurrentTimeMillis - 1800, j11, 100);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72523a(long j11, long j12, int i11) {
        int i12 = 0;
        for (int size = this.f69203a.size() - 1; size >= 0; size--) {
            C33978va c33978va = this.f69203a.get(size);
            if (i12 >= i11) {
                this.f69203a.remove(c33978va);
            } else {
                long j13 = c33978va.f72347f;
                if (j11 > j13 || j13 > j12) {
                    this.f69203a.remove(c33978va);
                } else {
                    i12++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72526b(C33978va c33978va) {
        InterfaceC33998wa interfaceC33998wa = this.f69204b;
        if (interfaceC33998wa != null) {
            interfaceC33998wa.saveToDB(c33978va);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<C33978va> m72520a(C33978va c33978va, List<String> list) {
        if (m72524a(c33978va)) {
            return m72521a(c33978va, list, this.f69203a);
        }
        return m72521a(c33978va, list, m72522a(c33978va.f72344c, c33978va.f72345d));
    }

    /* JADX INFO: renamed from: a */
    public final List<C33978va> m72521a(C33978va c33978va, List<String> list, List<C33978va> list2) {
        ArrayList arrayList = null;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<C33978va> it = list2.iterator();
            while (it.hasNext()) {
                C33978va next = it.next();
                if (list.contains(next == null ? "" : next.m75293a()) && c33978va.m75294a(next)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List<C33978va> m72522a(String str, String str2) {
        InterfaceC33998wa interfaceC33998wa = this.f69204b;
        if (interfaceC33998wa != null) {
            return interfaceC33998wa.loadFromDB(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72524a(@NotNull C33978va c33978va) {
        return TextUtils.equals(c33978va.f72345d, C33591ch.m72746d());
    }
}
