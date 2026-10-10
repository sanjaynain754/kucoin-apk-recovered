package p457n;

import org.json.JSONObject;

/* JADX INFO: renamed from: n.m */
/* JADX INFO: loaded from: classes23.dex */
public class C42692m {

    /* JADX INFO: renamed from: a */
    public long f94491a;

    /* JADX INFO: renamed from: b */
    public long f94492b;

    /* JADX INFO: renamed from: c */
    public int f94493c;

    /* JADX INFO: renamed from: d */
    public String f94494d;

    /* JADX INFO: renamed from: e */
    public long f94495e;

    /* JADX INFO: renamed from: f */
    public long f94496f;

    /* JADX INFO: renamed from: g */
    public long f94497g;

    /* JADX INFO: renamed from: h */
    public long f94498h;

    /* JADX INFO: renamed from: i */
    public long f94499i;

    /* JADX INFO: renamed from: j */
    public long f94500j;

    /* JADX INFO: renamed from: k */
    public int f94501k;

    /* JADX INFO: renamed from: l */
    public long f94502l;

    /* JADX INFO: renamed from: a */
    public String m93568a() {
        return this.f94494d;
    }

    /* JADX INFO: renamed from: b */
    public int m93569b() {
        return this.f94493c;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m93571d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", this.f94491a);
            jSONObject.put("idleTime", this.f94492b);
            jSONObject.put("httpCode", this.f94493c);
            jSONObject.put("failedMessage", this.f94494d);
            jSONObject.put("dnsCostTime", this.f94495e);
            jSONObject.put("requestHeaderCostTime", this.f94496f);
            jSONObject.put("requestBodyCostTime", this.f94497g);
            jSONObject.put("connectCostTime", this.f94498h);
            jSONObject.put("responseCostTime", this.f94499i);
            jSONObject.put("endTime", this.f94500j);
            jSONObject.put("contentLength", this.f94501k);
            jSONObject.put("totalCostTime", this.f94502l);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m93572e(long j11) {
        this.f94498h = j11;
    }

    /* JADX INFO: renamed from: f */
    public void m93573f(int i11) {
        this.f94501k = i11;
    }

    /* JADX INFO: renamed from: g */
    public void m93574g(long j11) {
        this.f94495e = j11;
    }

    /* JADX INFO: renamed from: h */
    public void m93575h(long j11) {
        this.f94500j = j11;
    }

    /* JADX INFO: renamed from: i */
    public void m93576i(String str) {
        this.f94494d = str;
    }

    /* JADX INFO: renamed from: j */
    public void m93577j(int i11) {
        this.f94493c = i11;
    }

    /* JADX INFO: renamed from: k */
    public void m93578k(long j11) {
        this.f94497g = j11;
    }

    /* JADX INFO: renamed from: l */
    public void m93579l(long j11) {
        this.f94496f = j11;
    }

    /* JADX INFO: renamed from: m */
    public void m93580m(long j11) {
        this.f94499i = j11;
    }

    /* JADX INFO: renamed from: n */
    public void m93581n(long j11) {
        this.f94491a = j11;
    }

    /* JADX INFO: renamed from: o */
    public void m93582o(long j11) {
        this.f94502l = j11;
    }

    public String toString() {
        return "TimeCostDetails{startTime=" + this.f94491a + ", idleTime=" + this.f94492b + ", httpCode=" + this.f94493c + ", failedMessage='" + this.f94494d + "', dnsCostTime='" + this.f94495e + "', requestHeaderCostTime='" + this.f94496f + "', requestBodyCostTime='" + this.f94497g + "', connectCostTime='" + this.f94498h + "', responseCostTime='" + this.f94499i + "', endTime=" + this.f94500j + ", contentLength=" + this.f94501k + ", totalCostTime='" + this.f94502l + "'}";
    }

    /* JADX INFO: renamed from: c */
    public String m93570c() {
        return m93571d().toString();
    }
}
