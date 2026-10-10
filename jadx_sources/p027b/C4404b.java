package p027b;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p246f.C37294p;
import p277g.C37736b;
import p277g.C37739e;
import p387k.C40832g;

/* JADX INFO: renamed from: b.b */
/* JADX INFO: loaded from: classes23.dex */
public class C4404b extends AbstractC4406d {

    /* JADX INFO: renamed from: c */
    public static volatile C4404b f3838c;

    /* JADX INFO: renamed from: f */
    public static C4404b m4061f() {
        if (f3838c == null) {
            synchronized (C4404b.class) {
                try {
                    if (f3838c == null) {
                        f3838c = new C4404b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f3838c;
    }

    @Override // p027b.AbstractC4406d
    /* JADX INFO: renamed from: c */
    public MonitorType mo4059c() {
        return MonitorType.EVENT;
    }

    /* JADX INFO: renamed from: g */
    public void m4062g(String str, C37739e c37739e, Context context) {
        if (str != null && c37739e.m85102e(str) == null) {
            c37739e.m85105h(str);
            m4065j(str, c37739e, context);
        }
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m4063h(Map<String, Object> map, C37739e c37739e) {
        JSONObject jSONObject = new JSONObject();
        C40832g.m89354i(jSONObject, "relative_time_in_milli_seconds", Long.valueOf(c37739e.m85103f() == null ? 0L : System.currentTimeMillis() - c37739e.m85103f().longValue()));
        if (c37739e.m85101d() != null) {
            C40832g.m89354i(jSONObject, "relative_detection_time_in_milli_seconds", Long.valueOf(System.currentTimeMillis() - c37739e.m85101d().longValue()));
        }
        if (map != null) {
            for (String str : map.keySet()) {
                C40832g.m89354i(jSONObject, str.toString(), map.get(str));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public void m4064i(C37736b c37736b, C37739e c37739e, Context context) {
        if (c37739e == null) {
            return;
        }
        try {
            String strM85055d = c37736b.m85055d();
            JSONObject jSONObjectM4063h = m4063h(c37736b.m85056e(), c37739e);
            HashMap<String, Object> mapM85100c = c37739e.m85100c();
            for (String str : mapM85100c.keySet()) {
                C40832g.m89354i(jSONObjectM4063h, str, mapM85100c.get(str));
            }
            Locale locale = Locale.ENGLISH;
            m4069e(strM85055d.toLowerCase(locale), C37294p.m83561c(strM85055d.toLowerCase(locale), jSONObjectM4063h.toString(), c37739e), context);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4065j(String str, C37739e c37739e, Context context) {
        m4064i(new C37736b.b(str).m85063f(), c37739e, context);
    }
}
