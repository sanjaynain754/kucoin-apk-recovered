package com.tencent.bugly.proguard;

import android.os.SystemClock;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.dh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33612dh {

    /* JADX INFO: renamed from: g */
    public static final String f69612g = "trace_id";

    /* JADX INFO: renamed from: h */
    public static final String f69613h = "span_id";

    /* JADX INFO: renamed from: i */
    public static final String f69614i = "parent_span_id";

    /* JADX INFO: renamed from: j */
    public static final String f69615j = "name";

    /* JADX INFO: renamed from: k */
    public static final String f69616k = "start_time_unix_ms";

    /* JADX INFO: renamed from: l */
    public static final String f69617l = "end_time_unix_ms";

    /* JADX INFO: renamed from: m */
    public static final String f69618m = "kind";

    /* JADX INFO: renamed from: a */
    public final String f69619a;

    /* JADX INFO: renamed from: b */
    public final String f69620b;

    /* JADX INFO: renamed from: c */
    public final String f69621c;

    /* JADX INFO: renamed from: d */
    public final C33612dh f69622d;

    /* JADX INFO: renamed from: e */
    public final long f69623e;

    /* JADX INFO: renamed from: f */
    public long f69624f;

    public C33612dh(String str, String str2, C33612dh c33612dh) {
        this.f69624f = 0L;
        this.f69619a = str;
        this.f69620b = C33591ch.m72742b();
        this.f69621c = str2;
        this.f69622d = c33612dh;
        this.f69623e = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public final long m72858a(long j11, long j12, long j13) {
        return (j13 + j11) - j12;
    }

    /* JADX INFO: renamed from: a */
    public long m72857a() {
        return this.f69623e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m72860b() {
        return this.f69624f != 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{name: ");
        sb2.append(this.f69621c);
        sb2.append(", cost: ");
        sb2.append(this.f69624f - this.f69623e);
        sb2.append(", parentSpan: ");
        C33612dh c33612dh = this.f69622d;
        return C34025xh.m75464a(sb2, c33612dh == null ? "" : c33612dh.f69621c, "}");
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m72859a(long j11, long j12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f69612g, this.f69619a);
        jSONObject.put(f69613h, this.f69620b);
        C33612dh c33612dh = this.f69622d;
        jSONObject.put(f69614i, c33612dh == null ? "" : c33612dh.f69620b);
        jSONObject.put("name", this.f69621c);
        jSONObject.put(f69616k, m72858a(this.f69623e, j11, j12));
        jSONObject.put(f69617l, m72858a(this.f69624f, j11, j12));
        jSONObject.put(f69618m, JPushConstants.Geofence.KEY_INTERVAL);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public void m72861c() {
        this.f69624f = SystemClock.uptimeMillis();
    }

    public C33612dh(String str, String str2, C33612dh c33612dh, long j11, long j12) {
        this.f69624f = 0L;
        this.f69619a = str;
        this.f69620b = C33591ch.m72742b();
        this.f69621c = str2;
        this.f69622d = c33612dh;
        this.f69623e = j11;
        this.f69624f = j12;
    }
}
