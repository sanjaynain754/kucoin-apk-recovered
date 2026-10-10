package p277g;

import com.facebook.react.devsupport.StackTraceHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes23.dex */
public class C37738d {

    /* JADX INFO: renamed from: a */
    public String f85033a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f85034b;

    /* JADX INFO: renamed from: c */
    public boolean f85035c;

    /* JADX INFO: renamed from: g.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f85036a;

        /* JADX INFO: renamed from: b */
        public final Map<String, Object> f85037b = new HashMap();

        /* JADX INFO: renamed from: c */
        public boolean f85038c;

        /* JADX INFO: renamed from: a */
        public static Map<String, Object> m85084a(JSONObject jSONObject) {
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
        public b m85085b(Object obj) {
            this.f85037b.put("code", obj);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m85086c(int i11) {
            this.f85037b.put("cost_in_milli_seconds", Integer.valueOf(i11));
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m85088e(Object obj) {
            this.f85037b.put(Constants.ScionAnalytics.PARAM_LABEL, obj);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m85090g(Object obj) {
            this.f85037b.put(FirebaseAnalytics.Param.LEVEL, obj);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m85092i(Map map) {
            this.f85037b.putAll(map);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m85093j(JSONObject jSONObject) {
            try {
                this.f85037b.putAll(m85084a(jSONObject));
            } catch (Exception unused) {
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m85094k(String str, Object obj) {
            this.f85037b.put(str, obj);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m85095l(Object obj) {
            this.f85037b.put(StackTraceHelper.STACK_KEY, obj);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C37738d m85096m() {
            C37738d c37738d = new C37738d();
            c37738d.f85033a = this.f85036a;
            c37738d.f85034b = this.f85037b;
            c37738d.f85035c = this.f85038c;
            return c37738d;
        }

        /* JADX INFO: renamed from: n */
        public b m85097n(boolean z11) {
            this.f85038c = z11;
            return this;
        }

        public b(Object obj) {
            this.f85036a = String.valueOf(obj);
        }

        /* JADX INFO: renamed from: d */
        public b m85087d(int i11) {
            m85094k("cost_in_milli_seconds", Integer.valueOf(i11));
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m85089f(Object obj) {
            m85094k(Constants.ScionAnalytics.PARAM_LABEL, obj);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m85091h(String str) {
            m85094k("message", str);
            return this;
        }
    }

    public C37738d() {
    }

    /* JADX INFO: renamed from: d */
    public String m85081d() {
        return this.f85033a;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, Object> m85082e() {
        return this.f85034b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85083f() {
        return this.f85035c;
    }
}
