package p277g;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes23.dex */
public class C37737c {

    /* JADX INFO: renamed from: a */
    public String f85025a;

    /* JADX INFO: renamed from: b */
    public String f85026b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f85027c;

    /* JADX INFO: renamed from: d */
    public boolean f85028d;

    /* JADX INFO: renamed from: g.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f85029a;

        /* JADX INFO: renamed from: b */
        public String f85030b;

        /* JADX INFO: renamed from: c */
        public final Map<String, Object> f85031c;

        /* JADX INFO: renamed from: d */
        public boolean f85032d;

        /* JADX INFO: renamed from: a */
        public static Map<String, Object> m85073a(JSONObject jSONObject) {
            Object obj;
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    obj = jSONObject.get(next);
                } catch (Exception unused) {
                    obj = null;
                }
                map.put(next, obj);
            }
            return map;
        }

        /* JADX INFO: renamed from: b */
        public b m85074b(JSONObject jSONObject) {
            try {
                this.f85031c.putAll(m85073a(jSONObject));
            } catch (Exception unused) {
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m85075c(String str, Object obj) {
            this.f85031c.put(str, obj);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C37737c m85076d() {
            C37737c c37737c = new C37737c();
            c37737c.f85025a = this.f85029a;
            c37737c.f85027c = this.f85031c;
            c37737c.f85028d = this.f85032d;
            c37737c.f85026b = this.f85030b;
            return c37737c;
        }

        /* JADX INFO: renamed from: e */
        public b m85077e(boolean z11) {
            this.f85032d = z11;
            return this;
        }

        public b(String str) {
            this.f85029a = str;
            HashMap map = new HashMap();
            this.f85031c = map;
            map.put("thread_info", Thread.currentThread());
        }
    }

    public C37737c() {
    }

    /* JADX INFO: renamed from: e */
    public String m85069e() {
        return this.f85026b;
    }

    /* JADX INFO: renamed from: f */
    public String m85070f() {
        return this.f85025a;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, Object> m85071g() {
        return this.f85027c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85072h() {
        return this.f85028d;
    }
}
