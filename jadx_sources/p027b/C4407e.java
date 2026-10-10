package p027b;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p246f.C37294p;
import p277g.C37737c;
import p277g.C37739e;
import p387k.C40832g;

/* JADX INFO: renamed from: b.e */
/* JADX INFO: loaded from: classes23.dex */
public class C4407e extends AbstractC4406d {

    /* JADX INFO: renamed from: c */
    public static volatile C4407e f3845c;

    /* JADX INFO: renamed from: f */
    public static C4407e m4070f() {
        if (f3845c == null) {
            synchronized (C4407e.class) {
                try {
                    if (f3845c == null) {
                        f3845c = new C4407e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f3845c;
    }

    /* JADX INFO: renamed from: g */
    private JSONObject m4071g(Map<String, Object> map, C37739e c37739e) {
        JSONObject jSONObject = new JSONObject();
        if (c37739e.m85103f() != null) {
            C40832g.m89354i(jSONObject, "relative_time_in_milli_seconds", Long.valueOf(System.currentTimeMillis() - c37739e.m85103f().longValue()));
        }
        if (map != null) {
            for (String str : map.keySet()) {
                C40832g.m89354i(jSONObject, str.toString(), map.get(str));
            }
        }
        return jSONObject;
    }

    @Override // p027b.AbstractC4406d
    /* JADX INFO: renamed from: c */
    public MonitorType mo4059c() {
        return MonitorType.LOG;
    }

    /* JADX INFO: renamed from: h */
    public void m4072h(C37737c c37737c, C37739e c37739e, Context context) {
        if (c37739e == null) {
            return;
        }
        try {
            String strM85070f = c37737c.m85070f();
            m4069e(strM85070f, C37294p.m83562d(strM85070f.toLowerCase(Locale.ENGLISH), m4071g(c37737c.m85071g(), c37739e).toString(), c37739e.m85104g(), c37737c.m85069e()), context);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m4073i(String str, C37739e c37739e, Context context) {
        if (str != null && c37739e.m85102e(str) == null) {
            c37739e.m85105h(str);
            m4072h(new C37737c.b(str).m85076d(), c37739e, context);
        }
    }
}
