package p442m;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33577c3;
import org.json.JSONObject;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes23.dex */
public class C42336f extends C42335e {

    /* JADX INFO: renamed from: a */
    public JSONObject f93849a;

    /* JADX INFO: renamed from: b */
    public Context f93850b;

    /* JADX INFO: renamed from: c */
    public String f93851c;

    /* JADX INFO: renamed from: d */
    public String f93852d;

    /* JADX INFO: renamed from: e */
    public String f93853e;

    /* JADX INFO: renamed from: f */
    public long f93854f;

    /* JADX INFO: renamed from: c */
    public final boolean m92900c() {
        return this.f93849a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m92901d() {
        this.f93849a = new JSONObject();
        m92902f();
    }

    public C42336f(Context context, String str, String str2, String str3) {
        this.f93851c = str;
        this.f93852d = str2;
        this.f93853e = str3;
        this.f93850b = context;
        m92901d();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m92898a(Context context) {
        JSONObject jSONObjectM92897e = C42334d.m92897e();
        try {
            jSONObjectM92897e.put(C33577c3.f69334H, C42334d.m92896d(context));
            jSONObjectM92897e.put("networkStatus", C42337g.m92907d(context));
        } catch (Exception unused) {
        }
        return jSONObjectM92897e;
    }

    /* JADX INFO: renamed from: b */
    public final void m92899b() {
        m92903g("eventCostInMilliSeconds", Long.valueOf(System.currentTimeMillis() - this.f93854f));
    }

    /* JADX INFO: renamed from: e */
    public JSONObject mo92883e(JSONObject jSONObject) {
        if (m92900c()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("mobileInfo", m92898a(this.f93850b));
            } catch (Exception unused) {
            }
            try {
                jSONObject2.put(C33556b3.f68963J, jSONObject);
            } catch (Exception unused2) {
            }
            try {
                this.f93849a.put("info", jSONObject2);
            } catch (Exception unused3) {
            }
            if (this.f93854f > 0) {
                m92899b();
            } else {
                m92903g("eventCostInMilliSeconds", 0);
            }
        }
        return this.f93849a;
    }

    /* JADX INFO: renamed from: f */
    public final void m92902f() {
        if (m92900c()) {
            synchronized (this) {
                try {
                    Context context = this.f93850b;
                    if (context != null) {
                        m92903g("applicationId", context.getPackageName());
                    }
                    m92903g("locale", C42331a.m92879a());
                    String str = this.f93851c;
                    if (str != null) {
                        m92903g("bizType", str);
                    }
                    m92903g(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.f93852d);
                    m92903g("eventTimestamp", Long.valueOf(System.currentTimeMillis()));
                    m92903g("eventType", this.f93853e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m92903g(String str, Object obj) {
        if (m92900c()) {
            try {
                this.f93849a.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m92904h() {
        this.f93854f = System.currentTimeMillis();
    }
}
