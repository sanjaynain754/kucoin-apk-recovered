package com.datavisorobfus;

import android.content.Context;
import android.util.Base64;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.datavisorobfus.y */
/* JADX INFO: loaded from: classes34.dex */
public class C5454y {

    /* JADX INFO: renamed from: m */
    private static volatile C5454y f7397m;

    /* JADX INFO: renamed from: a */
    private Context f7398a;

    /* JADX INFO: renamed from: e */
    private List<String> f7402e;

    /* JADX INFO: renamed from: k */
    private int f7408k;

    /* JADX INFO: renamed from: l */
    private List<String> f7409l;

    /* JADX INFO: renamed from: b */
    private String f7399b = "";

    /* JADX INFO: renamed from: c */
    private String f7400c = "";

    /* JADX INFO: renamed from: d */
    private String f7401d = "";

    /* JADX INFO: renamed from: f */
    private Map<String, String> f7403f = new HashMap();

    /* JADX INFO: renamed from: g */
    private List<String> f7404g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private List<String> f7405h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private Map<String, String> f7406i = new HashMap();

    /* JADX INFO: renamed from: j */
    private List<String> f7407j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static C5454y m7454a(Context context) {
        if (f7397m == null) {
            synchronized (C5454y.class) {
                try {
                    if (f7397m == null) {
                        f7397m = new C5454y(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7397m;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m7462b(int i11) {
        try {
            if (this.f7402e.size() == 0) {
                return 0;
            }
            int i12 = i11 + 1;
            return i12 < this.f7402e.size() ? i12 : 0;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m7465c() {
        try {
            String strM7163a = C5422i.m7160b().m7163a(this.f7398a);
            if (C5457z0.m7482b(strM7163a)) {
                return "https://" + strM7163a;
            }
            return "https://" + this.f7399b;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m7466d() {
        try {
            String strM7163a = C5422i.m7160b().m7163a(this.f7398a);
            if (C5457z0.m7482b(strM7163a)) {
                return "https://" + strM7163a;
            }
            return "https://" + this.f7401d;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m7468e() {
        return this.f7402e.size();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX INFO: renamed from: c */
    private Map<String, String> m7459c(String str) {
        String str2;
        int i11;
        if (C5457z0.m7480a(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[strArrSplit.length - 1];
        if (str3.contains(C33844oi.f71346o)) {
            String[] strArrSplit2 = str3.split(C33844oi.f71346o);
            if (strArrSplit2.length == 2) {
                try {
                    i11 = Integer.parseInt(strArrSplit2[1]);
                } catch (Throwable unused) {
                    i11 = 0;
                }
                if (i11 != 0) {
                    String str4 = strArrSplit2[1];
                    String str5 = strArrSplit2[0];
                    str2 = str4;
                    str3 = str5;
                } else {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        String str6 = strArrSplit[strArrSplit.length - 2];
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < strArrSplit.length - 2; i12++) {
            sb2.append(strArrSplit[i12]);
            sb2.append(C33978va.f72339h);
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        HashMap map = new HashMap();
        map.put("first", str3);
        map.put("second", str6);
        map.put("third", string);
        map.put("port", str2);
        return map;
    }

    /* JADX INFO: renamed from: f */
    private boolean m7460f() {
        if (C5447u0.m7409a(this.f7398a, "DVSPANYCASTFIRST")) {
            return C5447u0.m7410a(this.f7398a, "DVSPANYCASTFIRST", true);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m7461a(int i11) {
        try {
            String strM7163a = C5422i.m7160b().m7163a(this.f7398a);
            if (C5457z0.m7482b(strM7163a)) {
                return "https://" + strM7163a;
            }
            if (this.f7402e.size() == 0) {
                return null;
            }
            if (i11 >= this.f7402e.size()) {
                i11 = 0;
            }
            return "https://" + this.f7402e.get(i11);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7463b(String str) {
        String str2;
        HashSet hashSet = new HashSet(Collections.singletonList(new String(Base64.decode("YWlyYXNpYQ==", 2))));
        HashSet hashSet2 = new HashSet(Arrays.asList(new String(Base64.decode("em9tYXRvLXpvbWF0bw==", 2)), new String(Base64.decode("em9tYXRvLXJpZGVy", 2)), new String(Base64.decode("cGF5ZmF6eg==", 2)), new String(Base64.decode("YXBheWxhdGVy", 2)), new String(Base64.decode("dG9rb3BlZGlh", 2)), new String(Base64.decode("YmxpYmxp", 2)), new String(Base64.decode("YXRvbWU=", 2)), new String(Base64.decode("Z29qZWs=", 2)), new String(Base64.decode("YmxpYmxpLXNlbGxlcg==", 2)), new String(Base64.decode("YWR2YW5jZS1kZW1v", 2))));
        HashSet hashSet3 = new HashSet(Arrays.asList(new String(Base64.decode("bmVv", 2)), new String(Base64.decode("dGFza3JhYmJpdA==", 2)), new String(Base64.decode("YnJpZ2h0aG9yaXpvbnM=", 2)), new String(Base64.decode("bmFzYWZjdQ==", 2)), new String(Base64.decode("bXliYW1idQ==", 2)), new String(Base64.decode("dHJpcGFkdmlzb3I=", 2)), new String(Base64.decode("aGFwcHltb25leQ==", 2))));
        HashSet hashSet4 = new HashSet(Collections.singletonList(new String(Base64.decode("Ym9va2luZw==", 2))));
        if (hashSet.contains(str)) {
            str2 = "SGHIGHFLOW";
        } else if (hashSet2.contains(str)) {
            str2 = "SGOTHER";
        } else if (hashSet3.contains(str)) {
            str2 = "US";
        } else {
            str2 = hashSet4.contains(str) ? "EU" : "";
        }
        if (C5457z0.m7480a(str2)) {
            if (str.endsWith("-sg")) {
                return "SGOTHER";
            }
            if (str.endsWith("-sg2")) {
                return "SGHIGHFLOW";
            }
            if (str.endsWith("-us")) {
                return "US";
            }
            if (str.endsWith("-eu")) {
                return "EU";
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m7467d(String str) {
        this.f7399b = m7455a(str);
        m7456a();
        C5441r0.m7384a(m7464b());
    }

    private C5454y(Context context) {
        this.f7402e = null;
        this.f7408k = 0;
        this.f7409l = null;
        this.f7398a = context;
        this.f7402e = new ArrayList();
        this.f7408k = 0;
        this.f7409l = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private String m7455a(String str) {
        try {
            if (C5457z0.m7482b(str)) {
                if (str.substring(str.length() - 1).equals(C33978va.f72339h)) {
                    str = str.substring(0, str.length() - 1);
                }
                return str.contains(".:") ? str.replace(".:", C33844oi.f71346o) : str;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public synchronized Map<String, String> m7464b() {
        return this.f7403f;
    }

    /* JADX INFO: renamed from: a */
    private void m7456a() {
        try {
            this.f7402e.clear();
            this.f7403f = new HashMap();
            this.f7404g = new ArrayList();
            this.f7405h = new ArrayList();
            Map<String, String> mapM7459c = m7459c(this.f7399b);
            if (mapM7459c == null) {
                return;
            }
            String str = "";
            String str2 = mapM7459c.get("first") == null ? "" : mapM7459c.get("first");
            String str3 = mapM7459c.get("second") == null ? "" : mapM7459c.get("second");
            String str4 = mapM7459c.get("third") == null ? "" : mapM7459c.get("third");
            if (mapM7459c.get("port") != null) {
                str = mapM7459c.get("port");
            }
            if ("gw-dv".equals(str3)) {
                m7457a(str2, str4);
                m7458b(str2, str4);
                boolean zM7460f = m7460f();
                if (zM7460f) {
                    List<String> list = this.f7404g;
                    if (list != null) {
                        this.f7402e.addAll(list);
                    }
                    List<String> list2 = this.f7405h;
                    if (list2 != null) {
                        this.f7402e.addAll(list2);
                    }
                }
                this.f7402e.add(str4 + ".gw-dv." + str2);
                if (!"io".equals(str2)) {
                    this.f7402e.add(str4 + ".gw-dv.io");
                }
                if (!"xyz".equals(str2)) {
                    this.f7402e.add(str4 + ".gw-dv.xyz");
                }
                if (!zM7460f) {
                    List<String> list3 = this.f7404g;
                    if (list3 != null) {
                        this.f7402e.addAll(list3);
                    }
                    List<String> list4 = this.f7405h;
                    if (list4 != null) {
                        this.f7402e.addAll(list4);
                    }
                }
            } else {
                this.f7402e.add(str4 + C33978va.f72339h + str3 + C33978va.f72339h + str2);
            }
            if (C5457z0.m7482b(str)) {
                for (int i11 = 0; i11 < this.f7402e.size(); i11++) {
                    String str5 = this.f7402e.get(i11);
                    this.f7402e.set(i11, str5 + C33844oi.f71346o + str);
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7458b(String str, String str2) {
        try {
            String strM7463b = m7463b(str2);
            HashMap map = new HashMap();
            int i11 = 0;
            map.put("SGHIGHFLOW", new String[0]);
            map.put("SGOTHER", new String[0]);
            map.put("US", new String[]{new String(Base64.decode("NTIuNDIuMTgzLjExNQ==", 2))});
            map.put("EU", new String[]{new String(Base64.decode("NTIuMjA5Ljc4Ljg4", 2))});
            String[] strArr = null;
            String[] strArr2 = C5457z0.m7482b(strM7463b) ? (String[]) map.get(strM7463b) : null;
            String strM7416e = C5447u0.m7416e(this.f7398a, "SPVANGOGHEIPS");
            try {
                if (C5457z0.m7482b(strM7416e)) {
                    JSONArray jSONArray = new JSONArray(strM7416e);
                    strArr = new String[jSONArray.length()];
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        strArr[i12] = jSONArray.getString(i12);
                    }
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
            if (strArr != null) {
                strArr2 = strArr;
            }
            if (strArr2 != null && strArr2.length != 0) {
                while (i11 < strArr2.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("eip");
                    int i13 = i11 + 1;
                    sb2.append(i13);
                    sb2.append(C33820nf.f71144W);
                    sb2.append(str2);
                    sb2.append(".gw-dv.");
                    sb2.append(str);
                    String string = sb2.toString();
                    this.f7403f.put(string, strArr2[i11]);
                    this.f7405h.add(string);
                    i11 = i13;
                }
                return;
            }
            C5415f0.m7136a("aryEips is null or empty");
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7457a(String str, String str2) {
        try {
            String strM7463b = m7463b(str2);
            HashMap map = new HashMap();
            map.put("SGHIGHFLOW", new String[]{new String(Base64.decode("MTMuMjQ4LjE5NS4xODI=", 2)), new String(Base64.decode("NzYuMjIzLjgwLjE0NQ==", 2))});
            map.put("SGOTHER", new String[]{new String(Base64.decode("NzUuMi40Mi4xNDM=", 2)), new String(Base64.decode("OTkuODMuMTUyLjE3OQ==", 2))});
            map.put("US", new String[]{new String(Base64.decode("MTUuMTk3LjE1Ni4xNjY=", 2)), new String(Base64.decode("My4zMy4xNTYuMTc2", 2))});
            map.put("EU", new String[]{new String(Base64.decode("MTMuMjQ4LjE0OC4xNTU=", 2)), new String(Base64.decode("NzYuMjIzLjI1LjE0Mw==", 2))});
            String[] strArr = null;
            String[] strArr2 = C5457z0.m7482b(strM7463b) ? (String[]) map.get(strM7463b) : null;
            String strM7416e = C5447u0.m7416e(this.f7398a, "SPANYCASTIPS");
            int i11 = 0;
            try {
                if (C5457z0.m7482b(strM7416e)) {
                    JSONArray jSONArray = new JSONArray(strM7416e);
                    strArr = new String[jSONArray.length()];
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        strArr[i12] = jSONArray.getString(i12);
                    }
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
            if (strArr != null) {
                strArr2 = strArr;
            }
            if (strArr2 != null && strArr2.length != 0) {
                while (i11 < strArr2.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("anycast");
                    int i13 = i11 + 1;
                    sb2.append(i13);
                    sb2.append(C33820nf.f71144W);
                    sb2.append(str2);
                    sb2.append(".gw-dv.");
                    sb2.append(str);
                    String string = sb2.toString();
                    this.f7403f.put(string, strArr2[i11]);
                    this.f7404g.add(string);
                    i11 = i13;
                }
                return;
            }
            C5415f0.m7136a("aryAnycastIps is null or empty");
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
        }
    }
}
