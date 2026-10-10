package p277g;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes23.dex */
public class C37736b {

    /* JADX INFO: renamed from: a */
    public String f85019a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f85020b;

    /* JADX INFO: renamed from: c */
    public boolean f85021c;

    /* JADX INFO: renamed from: g.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f85022a;

        /* JADX INFO: renamed from: b */
        public final Map<String, Object> f85023b = new HashMap();

        /* JADX INFO: renamed from: c */
        public boolean f85024c;

        /* JADX INFO: renamed from: a */
        public b m85058a(int i11) {
            this.f85023b.put("cost_in_milli_seconds", Integer.valueOf(i11));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m85059b(Throwable th2) {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    m85060c(stringWriter.toString());
                    printWriter.close();
                    return this;
                } catch (Throwable th3) {
                    try {
                        printWriter.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Exception unused) {
                return this;
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        public b m85060c(Object obj) {
            this.f85023b.put("failed_reason", obj);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m85061d(String str, Object obj) {
            this.f85023b.put(str, obj);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public b m85062e(boolean z11) {
            this.f85023b.put(DbParams.KEY_CHANNEL_RESULT, Boolean.valueOf(z11));
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C37736b m85063f() {
            C37736b c37736b = new C37736b();
            c37736b.f85019a = this.f85022a;
            c37736b.f85020b = this.f85023b;
            c37736b.f85021c = this.f85024c;
            return c37736b;
        }

        /* JADX INFO: renamed from: g */
        public b m85064g(boolean z11) {
            this.f85024c = z11;
            return this;
        }

        public b(Object obj) {
            this.f85022a = String.valueOf(obj);
        }
    }

    public C37736b() {
    }

    /* JADX INFO: renamed from: d */
    public String m85055d() {
        return this.f85019a;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, Object> m85056e() {
        return this.f85020b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85057f() {
        return this.f85021c;
    }
}
