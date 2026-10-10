package p277g;

import aai.telemetry.AAITelemetryJNI;
import java.util.HashMap;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes23.dex */
public class C37739e {

    /* JADX INFO: renamed from: a */
    public final byte[] f85039a;

    /* JADX INFO: renamed from: b */
    public final byte[] f85040b;

    /* JADX INFO: renamed from: c */
    public Long f85041c;

    /* JADX INFO: renamed from: d */
    public Long f85042d;

    /* JADX INFO: renamed from: e */
    public final String f85043e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, Long> f85044f;

    /* JADX INFO: renamed from: g */
    public final HashMap<String, Object> f85045g;

    /* JADX INFO: renamed from: h */
    public final Object f85046h = new Object();

    /* JADX INFO: renamed from: i */
    public final Object f85047i = new Object();

    public C37739e(C37739e c37739e) {
        this.f85039a = (byte[]) c37739e.f85039a.clone();
        this.f85040b = (byte[]) c37739e.f85040b.clone();
        this.f85041c = c37739e.f85041c;
        this.f85043e = c37739e.f85043e;
        this.f85045g = c37739e.f85045g;
        this.f85042d = c37739e.f85042d;
        synchronized (c37739e.f85047i) {
            this.f85044f = new HashMap<>(c37739e.f85044f);
        }
    }

    public C37739e(String str) {
        AAITelemetryJNI.O0ooE(str);
        this.f85043e = str;
        this.f85039a = AAITelemetryJNI.m827O0();
        this.f85040b = AAITelemetryJNI.O0o();
        this.f85044f = new HashMap<>();
        this.f85045g = new HashMap<>();
        this.f85041c = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public static C37739e m85098b(C37739e c37739e) {
        C37739e c37739e2;
        try {
            c37739e2 = new C37739e(c37739e);
        } catch (Exception unused) {
            c37739e2 = null;
        }
        return c37739e2 == null ? c37739e : c37739e2;
    }

    /* JADX INFO: renamed from: a */
    public void m85099a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        synchronized (this.f85046h) {
            this.f85045g.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public HashMap<String, Object> m85100c() {
        HashMap<String, Object> map;
        synchronized (this.f85046h) {
            map = this.f85045g;
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public Long m85101d() {
        return this.f85042d;
    }

    /* JADX INFO: renamed from: e */
    public Long m85102e(String str) {
        Long l11;
        if (str == null) {
            return null;
        }
        synchronized (this.f85047i) {
            l11 = this.f85044f.get(str);
        }
        return l11;
    }

    /* JADX INFO: renamed from: f */
    public Long m85103f() {
        return this.f85041c;
    }

    /* JADX INFO: renamed from: g */
    public String m85104g() {
        return this.f85043e;
    }

    /* JADX INFO: renamed from: h */
    public void m85105h(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f85047i) {
            try {
                if (!this.f85044f.containsKey(str)) {
                    this.f85044f.put(str, Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
