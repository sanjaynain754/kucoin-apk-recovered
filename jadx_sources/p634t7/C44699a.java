package p634t7;

import com.forter.mobile.fortersdk.AbstractC6506a3;
import com.forter.mobile.fortersdk.C6534e3;
import com.forter.mobile.fortersdk.EnumC6509ab;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: loaded from: classes.dex */
public class C44699a {

    /* JADX INFO: renamed from: a */
    public String f99480a;

    /* JADX INFO: renamed from: b */
    public String f99481b;

    /* JADX INFO: renamed from: c */
    public String f99482c;

    /* JADX INFO: renamed from: d */
    public String f99483d;

    /* JADX INFO: renamed from: e */
    public Boolean f99484e;

    /* JADX INFO: renamed from: f */
    public boolean f99485f;

    /* JADX INFO: renamed from: g */
    public boolean f99486g;

    /* JADX INFO: renamed from: h */
    public C6534e3 f99487h;

    public C44699a(String str, String str2) {
        this.f99480a = null;
        this.f99484e = null;
        this.f99485f = true;
        this.f99486g = true;
        this.f99487h = new C6534e3();
        m98868E(str);
        m98866C(str2);
        m98900z(AbstractC6506a3.m12127u());
        m98897w();
    }

    public C44699a(C44699a c44699a) {
        this.f99480a = null;
        this.f99484e = null;
        this.f99485f = true;
        this.f99486g = true;
        this.f99487h = new C6534e3();
        this.f99480a = c44699a.f99480a;
        this.f99481b = c44699a.f99481b;
        this.f99482c = c44699a.f99482c;
        this.f99483d = c44699a.f99483d;
        this.f99484e = c44699a.f99484e;
        this.f99485f = c44699a.f99485f;
        this.f99486g = c44699a.f99486g;
        this.f99487h = new C6534e3(c44699a.f99487h);
    }

    /* JADX INFO: renamed from: A */
    public void m98864A(boolean z11) {
        this.f99485f = z11;
    }

    /* JADX INFO: renamed from: B */
    public void m98865B(int i11) {
        this.f99487h.m12243c(EnumC6509ab.LOG_LEVEL, i11);
    }

    /* JADX INFO: renamed from: C */
    public void m98866C(String str) {
        this.f99481b = str;
    }

    /* JADX INFO: renamed from: D */
    public void m98867D(boolean z11) {
        this.f99487h.m12245e(EnumC6509ab.SHOULD_REGISTER_FOR_LOCATION_UPDATES, z11);
    }

    /* JADX INFO: renamed from: E */
    public void m98868E(String str) {
        this.f99480a = str;
    }

    /* JADX INFO: renamed from: F */
    public boolean m98869F() {
        return this.f99487h.m12247h(EnumC6509ab.CACHE_EVENTS);
    }

    /* JADX INFO: renamed from: G */
    public boolean m98870G() {
        return this.f99487h.m12247h(EnumC6509ab.COMPRESS_EVENTS);
    }

    /* JADX INFO: renamed from: H */
    public boolean m98871H() {
        return this.f99486g;
    }

    /* JADX INFO: renamed from: I */
    public boolean m98872I() {
        return this.f99487h.m12247h(EnumC6509ab.FORCE_GET_REQUESTS);
    }

    /* JADX INFO: renamed from: J */
    public boolean m98873J() {
        return this.f99487h.m12247h(EnumC6509ab.REDUCE_BACKGROUND_NETWORKING);
    }

    /* JADX INFO: renamed from: K */
    public boolean m98874K() {
        return this.f99487h.m12247h(EnumC6509ab.SHOULD_REGISTER_FOR_LOCATION_UPDATES);
    }

    /* JADX INFO: renamed from: a */
    public String m98875a() {
        return this.f99487h.m12242a(EnumC6509ab.BASE_API_URL);
    }

    /* JADX INFO: renamed from: b */
    public int m98876b() {
        return this.f99487h.m12246g(EnumC6509ab.BUFFER_MAX_EVENTS);
    }

    /* JADX INFO: renamed from: c */
    public String m98877c() {
        return this.f99482c;
    }

    /* JADX INFO: renamed from: d */
    public String m98878d() {
        return this.f99483d;
    }

    /* JADX INFO: renamed from: e */
    public String m98879e() {
        return this.f99487h.m12242a(EnumC6509ab.ERROR_REPORTING_API_URL);
    }

    /* JADX INFO: renamed from: f */
    public int m98880f() {
        return this.f99487h.m12246g(EnumC6509ab.EVENT_CACHE_FOR_SECONDS);
    }

    /* JADX INFO: renamed from: g */
    public int m98881g() {
        return this.f99487h.m12246g(EnumC6509ab.EVENT_MAX_AGE_SECONDS);
    }

    /* JADX INFO: renamed from: h */
    public int m98882h() {
        return this.f99487h.m12246g(EnumC6509ab.LOCATION_REFRESH_RATIO_METERS);
    }

    /* JADX INFO: renamed from: i */
    public int m98883i() {
        return this.f99487h.m12246g(EnumC6509ab.LOCATION_REFRESH_RATIO_SECONDS);
    }

    /* JADX INFO: renamed from: j */
    public int m98884j() {
        return this.f99487h.m12246g(EnumC6509ab.LOG_LEVEL);
    }

    /* JADX INFO: renamed from: k */
    public long m98885k() {
        String str = this.f99487h.f10945a.get(EnumC6509ab.MAX_EVENT_SIZE);
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: l */
    public String m98886l() {
        return this.f99481b;
    }

    /* JADX INFO: renamed from: m */
    public int m98887m() {
        return this.f99487h.m12246g(EnumC6509ab.NETWORK_EXECUTOR_THREAD_POOL_SIZE);
    }

    /* JADX INFO: renamed from: n */
    public int m98888n() {
        return this.f99487h.m12246g(EnumC6509ab.NETWORK_INITIAL_SOCKET_TIMEOUT);
    }

    /* JADX INFO: renamed from: o */
    public int m98889o() {
        return this.f99487h.m12246g(EnumC6509ab.NETWORK_MAX_RETRIES);
    }

    /* JADX INFO: renamed from: p */
    public int m98890p() {
        return this.f99487h.m12246g(EnumC6509ab.NETWORK_SUBMIT_INTERVAL_SECONDS);
    }

    /* JADX INFO: renamed from: q */
    public float m98891q() {
        C6534e3 c6534e3 = this.f99487h;
        String str = c6534e3.f10945a.get(EnumC6509ab.NETWORK_TIMEOUT_BACKOFF_MULTIPLIER);
        if (str != null) {
            return Float.valueOf(str).floatValue();
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: r */
    public String m98892r() {
        return this.f99480a;
    }

    /* JADX INFO: renamed from: s */
    public boolean m98893s() {
        return this.f99487h.m12247h(EnumC6509ab.EXPLICIT_BUFFER_FLUSHING);
    }

    /* JADX INFO: renamed from: t */
    public boolean m98894t() {
        return this.f99487h.m12247h(EnumC6509ab.GZIP_ENABLED);
    }

    /* JADX INFO: renamed from: u */
    public boolean m98895u() {
        return this.f99485f;
    }

    /* JADX INFO: renamed from: v */
    public Boolean m98896v() {
        return this.f99484e;
    }

    /* JADX INFO: renamed from: w */
    public final void m98897w() {
        this.f99487h.m12245e(EnumC6509ab.EXPLICIT_BUFFER_FLUSHING, false);
        this.f99487h.m12245e(EnumC6509ab.SHOULD_REGISTER_FOR_LOCATION_UPDATES, false);
        this.f99487h.m12245e(EnumC6509ab.CACHE_EVENTS, true);
        this.f99487h.m12245e(EnumC6509ab.REDUCE_BACKGROUND_NETWORKING, true);
        this.f99487h.m12245e(EnumC6509ab.COMPRESS_EVENTS, true);
        this.f99487h.m12245e(EnumC6509ab.GZIP_ENABLED, true);
        this.f99487h.m12245e(EnumC6509ab.FORCE_GET_REQUESTS, false);
        this.f99487h.m12243c(EnumC6509ab.NETWORK_SUBMIT_INTERVAL_SECONDS, 10);
        this.f99487h.m12243c(EnumC6509ab.EVENT_MAX_AGE_SECONDS, 86400);
        this.f99487h.m12243c(EnumC6509ab.EVENT_CACHE_FOR_SECONDS, 3600);
        this.f99487h.m12243c(EnumC6509ab.BUFFER_MAX_EVENTS, 1000);
        this.f99487h.m12243c(EnumC6509ab.NETWORK_MAX_RETRIES, 3);
        this.f99487h.m12243c(EnumC6509ab.NETWORK_EXECUTOR_THREAD_POOL_SIZE, 2);
        this.f99487h.m12243c(EnumC6509ab.NETWORK_INITIAL_SOCKET_TIMEOUT, 5000);
        this.f99487h.m12243c(EnumC6509ab.LOCATION_REFRESH_RATIO_METERS, 100);
        this.f99487h.m12243c(EnumC6509ab.LOCATION_REFRESH_RATIO_SECONDS, 300);
        this.f99487h.m12243c(EnumC6509ab.LOG_LEVEL, 0);
        C6534e3 c6534e3 = this.f99487h;
        c6534e3.f10945a.put(EnumC6509ab.MAX_EVENT_SIZE, "16000");
        C6534e3 c6534e4 = this.f99487h;
        c6534e4.f10945a.put(EnumC6509ab.NETWORK_TIMEOUT_BACKOFF_MULTIPLIER, "1.0");
        this.f99487h.m12244d(EnumC6509ab.BASE_API_URL, "");
        this.f99487h.m12244d(EnumC6509ab.ERROR_REPORTING_API_URL, "");
    }

    /* JADX INFO: renamed from: x */
    public void m98898x(EnumC6509ab enumC6509ab, String str) {
        this.f99487h.m12244d(enumC6509ab, str);
    }

    /* JADX INFO: renamed from: y */
    public void m98899y(String str) {
        this.f99482c = str;
    }

    /* JADX INFO: renamed from: z */
    public void m98900z(String str) {
        this.f99483d = str;
    }
}
