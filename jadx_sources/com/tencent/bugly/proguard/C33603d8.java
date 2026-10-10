package com.tencent.bugly.proguard;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat;
import com.facebook.fresco.middleware.HasExtraData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import okhttp3.Connection;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d8 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33603d8 {

    /* JADX INFO: renamed from: M */
    public static final int f69517M = 0;

    /* JADX INFO: renamed from: N */
    public static final int f69518N = -1;

    /* JADX INFO: renamed from: O */
    public static final int f69519O = -2;

    /* JADX INFO: renamed from: P */
    public static final String f69520P = "RMonitor_net_quality_event";

    /* JADX INFO: renamed from: Q */
    public static final boolean f69521Q = false;

    /* JADX INFO: renamed from: R */
    public static final C33851p4 f69522R = new C33851p4();

    /* JADX INFO: renamed from: a */
    public long f69535a;

    /* JADX INFO: renamed from: b */
    public long f69536b;

    /* JADX INFO: renamed from: c */
    public long f69537c;

    /* JADX INFO: renamed from: d */
    public String f69538d;

    /* JADX INFO: renamed from: e */
    public int f69539e = 0;

    /* JADX INFO: renamed from: f */
    public String f69540f = null;

    /* JADX INFO: renamed from: g */
    public Exception f69541g = null;

    /* JADX INFO: renamed from: h */
    public long f69542h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f69543i = false;

    /* JADX INFO: renamed from: j */
    public int f69544j = 0;

    /* JADX INFO: renamed from: k */
    public long f69545k = 0;

    /* JADX INFO: renamed from: l */
    public int f69546l = 0;

    /* JADX INFO: renamed from: m */
    public int f69547m = 0;

    /* JADX INFO: renamed from: n */
    public String f69548n = null;

    /* JADX INFO: renamed from: o */
    public int f69549o = 0;

    /* JADX INFO: renamed from: p */
    public String f69550p = null;

    /* JADX INFO: renamed from: q */
    public int f69551q = 0;

    /* JADX INFO: renamed from: r */
    public int f69552r = 0;

    /* JADX INFO: renamed from: s */
    public long f69553s = 0;

    /* JADX INFO: renamed from: t */
    public int f69554t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f69555u = false;

    /* JADX INFO: renamed from: v */
    public String f69556v = null;

    /* JADX INFO: renamed from: w */
    public String f69557w = null;

    /* JADX INFO: renamed from: x */
    public String f69558x = null;

    /* JADX INFO: renamed from: y */
    public String f69559y = null;

    /* JADX INFO: renamed from: z */
    public String f69560z = null;

    /* JADX INFO: renamed from: A */
    public String f69523A = null;

    /* JADX INFO: renamed from: B */
    public boolean f69524B = false;

    /* JADX INFO: renamed from: C */
    public long f69525C = 0;

    /* JADX INFO: renamed from: D */
    public long f69526D = 0;

    /* JADX INFO: renamed from: E */
    public boolean f69527E = false;

    /* JADX INFO: renamed from: F */
    public long f69528F = 0;

    /* JADX INFO: renamed from: G */
    public long f69529G = 0;

    /* JADX INFO: renamed from: H */
    public int f69530H = 0;

    /* JADX INFO: renamed from: I */
    public String f69531I = null;

    /* JADX INFO: renamed from: J */
    public long f69532J = 0;

    /* JADX INFO: renamed from: K */
    public long f69533K = 0;

    /* JADX INFO: renamed from: L */
    public final HashMap<String, Long> f69534L = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final long m72789a(long j11, long j12) {
        if (j12 == 0) {
            return 0L;
        }
        return j11 / j12;
    }

    /* JADX INFO: renamed from: b */
    public final String m72803b(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public void m72806c() {
        Long lM72805c = m72805c("responseHeadersStart");
        Long lM72805c2 = m72805c("requestBodyEnd");
        if (m72802a(lM72805c, lM72805c2)) {
            this.f69528F = lM72805c.longValue() - lM72805c2.longValue();
        }
        Long lM72805c3 = m72805c("callStart");
        if (m72802a(lM72805c, lM72805c3)) {
            this.f69529G = lM72805c.longValue() - lM72805c3.longValue();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m72808d(String str) {
        Long lM72805c = m72805c("dnsStart");
        Long lM72805c2 = m72805c("dnsEnd");
        if (m72802a(lM72805c2, lM72805c)) {
            long jLongValue = lM72805c2.longValue() - lM72805c.longValue();
            this.f69544j++;
            this.f69545k += jLongValue;
        }
        m72795a("dnsEnd", str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72800a() {
        return this.f69544j <= 0 && this.f69546l <= 0 && this.f69552r <= 0 && this.f69554t > 0;
    }

    /* JADX INFO: renamed from: b */
    public void m72804b(long j11) {
        Long lM72805c = m72805c("responseHeadersStart");
        Long lM72805c2 = m72805c("responseBodyEnd");
        if (m72802a(lM72805c2, lM72805c)) {
            this.f69532J = lM72805c2.longValue() - lM72805c.longValue();
        }
        this.f69533K = j11;
    }

    /* JADX INFO: renamed from: e */
    public C34055z7 m72809e() {
        C34055z7 c34055z7 = new C34055z7();
        c34055z7.f72611a = this.f69535a;
        c34055z7.f72618h = this.f69541g != null;
        try {
            C33671gd.m73177a(c34055z7);
            JSONObject jSONObject = new JSONObject();
            c34055z7.f72623m = jSONObject;
            jSONObject.put("request_time_in_ms", c34055z7.f72611a);
            c34055z7.f72623m.put("protocol", m72803b(this.f69523A));
            c34055z7.f72623m.put("is_https", this.f69524B);
            c34055z7.f72623m.put("host", m72803b(this.f69558x));
            c34055z7.f72623m.put("path", m72803b(this.f69559y));
            c34055z7.f72623m.put("query_string", m72803b(this.f69560z));
            c34055z7.f72623m.put(HasExtraData.Companion.KEY_ORIGINAL_URL, this.f69556v);
            c34055z7.f72623m.put(FirebaseAnalytics.Param.METHOD, m72803b(this.f69557w));
            c34055z7.f72623m.put("stage", m72803b(c34055z7.f72622l));
            c34055z7.f72623m.put("is_reuse_connection", m72800a());
            c34055z7.f72623m.put("is_canceled", this.f69555u);
            c34055z7.f72623m.put("has_redirect", this.f69527E);
            c34055z7.f72623m.put("status_code", this.f69530H);
            c34055z7.f72623m.put(FontsContractCompat.Columns.RESULT_CODE, this.f69539e);
            c34055z7.f72623m.put("total_cost_in_ms", this.f69542h);
            c34055z7.f72623m.put("dns_cost_in_ms", m72789a(this.f69545k, this.f69544j));
            c34055z7.f72623m.put("tcp_cost_in_ms", m72789a(this.f69547m, this.f69546l));
            c34055z7.f72623m.put("ssl_cost_in_ms", m72789a(this.f69553s, this.f69552r));
            c34055z7.f72623m.put("request_cost_in_ms", this.f69526D);
            c34055z7.f72623m.put("wait_cost_in_ms", this.f69528F);
            c34055z7.f72623m.put("response_cost_in_ms", this.f69532J);
            c34055z7.f72623m.put("first_package_cost_in_ms", this.f69529G);
            c34055z7.f72623m.put("request_byte_count", this.f69525C);
            c34055z7.f72623m.put("response_byte_count", this.f69533K);
            c34055z7.f72623m.put("host_ip", m72803b(this.f69548n));
            c34055z7.f72623m.put("host_port", this.f69549o);
            c34055z7.f72623m.put("client_ip", m72803b(this.f69550p));
            c34055z7.f72623m.put("client_port", this.f69551q);
            JSONObject jSONObject2 = c34055z7.f72623m;
            C33851p4 c33851p4 = f69522R;
            jSONObject2.put("client_operator", c33851p4.m74503d());
            c34055z7.f72623m.put("client_operator_code", c33851p4.m74501b());
            c34055z7.f72623m.put("client_country_code", c33851p4.m74499a());
            c34055z7.f72623m.put("client_region_id", c33851p4.m74504e());
            C33671gd.m73178a(c34055z7.f72623m, this.f69540f, this.f69541g);
            c34055z7.f72623m.put("user_custom", C33991w3.m75338a().m77159g());
            return c34055z7;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f69520P, C33799mf.m74131a("toMeta fail for ", th2));
            return c34055z7;
        }
    }

    public String toString() {
        return "{url: " + this.f69556v + ", host: " + this.f69558x + ", statusCode: " + this.f69530H + ", cost: " + this.f69542h + "}";
    }

    public C33603d8() {
        this.f69535a = 0L;
        this.f69536b = 0L;
        this.f69537c = 0L;
        this.f69538d = null;
        this.f69535a = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f69536b = jElapsedRealtime;
        this.f69537c = jElapsedRealtime;
        this.f69538d = "callStart";
    }

    /* JADX INFO: renamed from: a */
    public void m72794a(String str, IOException iOException) {
        Long lM72805c;
        Long lM72805c2 = m72805c("callStart");
        if (!"callEnd".equals(str) && !"callFailed".equals(str)) {
            lM72805c = Long.valueOf(this.f69537c);
        } else {
            lM72805c = m72805c(str);
        }
        if (m72802a(lM72805c, lM72805c2)) {
            this.f69542h = lM72805c.longValue() - lM72805c2.longValue();
        }
        if ("callFailed".equals(str)) {
            this.f69543i = false;
            m72791a(-1, "callFailed", iOException);
            return;
        }
        int i11 = this.f69530H;
        this.f69543i = i11 >= 200 && i11 < 300;
        if (this.f69555u) {
            m72791a(0, "cancel", iOException);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C33603d8 m72788b() {
        return new C33603d8();
    }

    /* JADX INFO: renamed from: c */
    public final Long m72805c(String str) {
        return this.f69534L.get(str);
    }

    /* JADX INFO: renamed from: d */
    public void m72807d() {
        Long lM72805c = m72805c("secureConnectStart");
        Long lM72805c2 = m72805c("secureConnectEnd");
        if (m72802a(lM72805c2, lM72805c)) {
            long jLongValue = lM72805c2.longValue() - lM72805c.longValue();
            this.f69552r++;
            this.f69553s += jLongValue;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72795a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.equals(this.f69558x, str2)) {
            return;
        }
        this.f69558x = str2;
    }

    /* JADX INFO: renamed from: a */
    public void m72799a(boolean z11, InetSocketAddress inetSocketAddress, Protocol protocol, IOException iOException) {
        Long lM72805c = m72805c("connectStart");
        Long lM72805c2 = m72805c(z11 ? "connectFailed" : "connectEnd");
        if (m72802a(lM72805c2, lM72805c)) {
            long jLongValue = lM72805c2.longValue() - lM72805c.longValue();
            this.f69546l++;
            this.f69547m = (int) (((long) this.f69547m) + jLongValue);
        }
        if (protocol != null) {
            this.f69523A = protocol.getProtocol();
        }
        if (inetSocketAddress != null) {
            this.f69548n = m72790a(inetSocketAddress.getAddress());
            this.f69549o = inetSocketAddress.getPort();
        }
        if (z11) {
            m72791a(-2, "connectFailed", iOException);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72797a(Connection connection) {
        Socket socket;
        this.f69554t++;
        if (connection == null || (socket = connection.socket()) == null) {
            return;
        }
        this.f69548n = m72790a(socket.getInetAddress());
        this.f69549o = socket.getPort();
        this.f69550p = m72790a(socket.getLocalAddress());
        this.f69551q = socket.getLocalPort();
    }

    /* JADX INFO: renamed from: a */
    public void m72796a(String str, Request request) {
        HttpUrl httpUrlUrl;
        if (request == null || (httpUrlUrl = request.url()) == null) {
            return;
        }
        try {
            this.f69557w = request.method();
            this.f69524B = httpUrlUrl.getIsHttps();
            this.f69558x = httpUrlUrl.host();
            this.f69559y = httpUrlUrl.encodedPath();
            this.f69560z = httpUrlUrl.encodedQuery();
            if ("callStart".equals(str)) {
                this.f69556v = httpUrlUrl.getUrl();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72792a(long j11) {
        Long lM72805c = m72805c("requestHeadersStart");
        Long lM72805c2 = m72805c("requestBodyEnd");
        if (m72802a(lM72805c2, lM72805c)) {
            this.f69526D = lM72805c2.longValue() - lM72805c.longValue();
        }
        this.f69525C += j11;
    }

    /* JADX INFO: renamed from: a */
    public void m72798a(Response response) {
        if (response == null) {
            return;
        }
        this.f69530H = response.code();
        this.f69543i = response.isSuccessful();
        this.f69531I = response.message();
        if (response.isRedirect()) {
            this.f69527E = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m72802a(Long l11, Long l12) {
        return (l12 == null || l11 == null || l11.longValue() < l12.longValue()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public void m72793a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f69538d = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f69537c = jElapsedRealtime;
        this.f69534L.put(this.f69538d, Long.valueOf(jElapsedRealtime));
    }

    /* JADX INFO: renamed from: a */
    public void m72791a(int i11, String str, IOException iOException) {
        if (this.f69539e != 0) {
            return;
        }
        this.f69539e = i11;
        this.f69541g = iOException;
        if (iOException != null) {
            this.f69540f = iOException.getMessage();
        } else {
            this.f69540f = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m72801a(long j11, @NonNull C33734jd c33734jd) {
        long j12 = this.f69537c;
        if (j11 < j12) {
            j11 = SystemClock.elapsedRealtime();
            j12 = this.f69537c;
        }
        long j13 = j11 - j12;
        int i11 = this.f69530H;
        if (i11 == 0) {
            return j13 >= c33734jd.f70390p;
        }
        if (i11 >= 400) {
            return j13 >= c33734jd.f70389o;
        }
        if (i11 == 204) {
            return j13 >= c33734jd.f70389o;
        }
        if (i11 < 200 || i11 >= 300) {
            return j13 >= c33734jd.f70390p;
        }
        return j13 >= c33734jd.f70388n;
    }

    /* JADX INFO: renamed from: a */
    public final String m72790a(InetAddress inetAddress) {
        return inetAddress != null ? inetAddress.getHostAddress() : "";
    }
}
