package com.forter.mobile.fortersdk;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ProxyConfig;
import com.forter.mobile.fortersdk.models.TrackType;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
import p587r7.C43937c;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6520c implements InterfaceC6525d {

    /* JADX INFO: renamed from: r */
    public static final C6520c f10914r = new C6520c();

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f10915a = null;

    /* JADX INFO: renamed from: b */
    public C6510ae f10916b = null;

    /* JADX INFO: renamed from: c */
    public C44699a f10917c = null;

    /* JADX INFO: renamed from: d */
    public C6512am f10918d = null;

    /* JADX INFO: renamed from: e */
    public C6590q f10919e = null;

    /* JADX INFO: renamed from: f */
    public C43937c f10920f = null;

    /* JADX INFO: renamed from: g */
    public C6580o f10921g = null;

    /* JADX INFO: renamed from: h */
    public long f10922h = -1;

    /* JADX INFO: renamed from: i */
    public C6556j0 f10923i = null;

    /* JADX INFO: renamed from: j */
    public boolean f10924j = false;

    /* JADX INFO: renamed from: k */
    public boolean f10925k = false;

    /* JADX INFO: renamed from: l */
    public boolean f10926l = false;

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC6525d> f10927m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public HandlerThread f10928n = null;

    /* JADX INFO: renamed from: o */
    public Handler f10929o = null;

    /* JADX INFO: renamed from: p */
    public String f10930p = null;

    /* JADX INFO: renamed from: q */
    public long f10931q = 0;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!C6520c.this.m12193l(false)) {
                AbstractC6524c3.m12209a();
                return;
            }
            C6520c.this.m12203w();
            C6520c.this.m12195n(false);
            AbstractC6524c3.m12214f();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12183k(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                URL url = new URL(str);
                return url.getProtocol().equals(ProxyConfig.MATCH_HTTPS) && url.getHost().endsWith("forter.com");
            } catch (MalformedURLException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m12184q(C44699a c44699a) {
        boolean z11;
        if (c44699a == null) {
            AbstractC6524c3.m12213e();
            AbstractC6524c3.m12213e();
            return false;
        }
        if (c44699a.m98892r() == null || "".equals(c44699a.m98892r())) {
            AbstractC6524c3.m12213e();
            z11 = false;
        } else {
            z11 = true;
        }
        if (c44699a.m98886l() == null || "".equals(c44699a.m98886l())) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98878d() == null) {
            AbstractC6524c3.m12213e();
        }
        if (c44699a.m98890p() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98881g() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98876b() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98885k() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98888n() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98889o() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98885k() < 0) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (c44699a.m98891q() < 0.0f) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (!m12183k(c44699a.m98875a())) {
            AbstractC6524c3.m12213e();
            z11 = false;
        }
        if (m12183k(c44699a.m98879e())) {
            return z11;
        }
        AbstractC6524c3.m12213e();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m12187e(String str, String str2) {
        if (m12193l(false)) {
            m12192j(new C6559j3(str, str2), true);
            m12203w();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12188f(Context context, C6510ae c6510ae) {
        String str;
        if (context == null || context.getApplicationContext() == null) {
            str = "Failed to initiate SDK -> context was null";
        } else if (c6510ae == null) {
            str = "Failed to initiate SDK -> configuration was null";
        } else {
            if (m12190h(c6510ae)) {
                m12199s(context.getApplicationContext());
                if (m12193l(true)) {
                    C6556j0 c6556j0 = this.f10923i;
                    AbstractC6524c3.m12216h();
                    c6556j0.m12400a();
                    AbstractC6524c3.m12213e();
                } else {
                    this.f10915a = new WeakReference<>(context.getApplicationContext());
                    this.f10918d = new C6512am();
                    try {
                        this.f10923i = new C6556j0();
                    } catch (Throwable th2) {
                        String.format("ForterClient::initHelpers() -> got exception while creating new events_buffer!! : %s", th2.getMessage());
                        AbstractC6524c3.m12209a();
                    }
                    try {
                        HandlerThread handlerThread = new HandlerThread("ForterClient");
                        this.f10928n = handlerThread;
                        handlerThread.start();
                        this.f10929o = new Handler(this.f10928n.getLooper());
                    } catch (Throwable th3) {
                        String str2 = String.format("ForterClient::initHelpers() -> got exception while creating new handlerThread!! : %s", th3.getMessage());
                        AbstractC6524c3.m12209a();
                        m12187e(str2, null);
                    }
                    this.f10922h = System.currentTimeMillis();
                    AbstractC6524c3.m12214f();
                    m12204x();
                }
                return true;
            }
            str = "Failed to initiate SDK -> failed updating conf internally";
        }
        AbstractC6524c3.m12211c("ForterClient", str);
        mo12155a(C6508aa.f10805b, null);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m12190h(C6510ae c6510ae) {
        C44699a c44699aM12134b = c6510ae.m12134b();
        if (c44699aM12134b == null) {
            return false;
        }
        this.f10916b = c6510ae;
        this.f10917c = c44699aM12134b;
        if (!m12184q(m12197p())) {
            return false;
        }
        C6512am.m12141g(this.f10917c);
        AbstractC6524c3.m12210b(this.f10917c.m98884j());
        this.f10917c.m98892r();
        this.f10917c.m98886l();
        AbstractC6524c3.m12214f();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX INFO: renamed from: i */
    public final boolean m12191i(InterfaceC6619v3 interfaceC6619v3) {
        C6512am c6512am;
        String strMo12304b;
        JSONObject jSONObjectM12143d;
        String strM12138a;
        if (!m12193l(false)) {
            return false;
        }
        m12184q(m12197p());
        try {
            if (this.f10918d == null) {
                AbstractC6524c3.m12209a();
                return false;
            }
            switch (interfaceC6619v3.mo12304b()) {
                case "app/active":
                    this.f10918d.m12146h((C6544g3) interfaceC6619v3);
                    return true;
                case "nav/":
                    c6512am = this.f10918d;
                    C6574m3 c6574m3 = (C6574m3) interfaceC6619v3;
                    strMo12304b = "nav/" + c6574m3.f10999a;
                    jSONObjectM12143d = c6512am.m12143d(c6574m3);
                    strM12138a = C6512am.m12138a(C6512am.a.DATA);
                    c6512am.m12148k(strMo12304b, strM12138a, jSONObjectM12143d);
                    return true;
                case "app/versions":
                case "app/track":
                case "app/network":
                case "app/network_conf":
                case "app/network2":
                case "app/location":
                case "app/sensors":
                case "app/netstat":
                case "app/display":
                case "app/files":
                    c6512am = this.f10918d;
                    strMo12304b = interfaceC6619v3.mo12304b();
                    jSONObjectM12143d = c6512am.m12143d(interfaceC6619v3);
                    strM12138a = C6512am.m12138a(C6512am.a.DATA);
                    c6512am.m12148k(strMo12304b, strM12138a, jSONObjectM12143d);
                    return true;
                case "error":
                    C6512am c6512am2 = this.f10918d;
                    String strMo12304b2 = interfaceC6619v3.mo12304b();
                    JSONObject jSONObjectM12143d2 = c6512am2.m12143d(interfaceC6619v3);
                    String str = C6512am.f10850h;
                    Objects.toString(interfaceC6619v3.mo12303a());
                    AbstractC6524c3.m12214f();
                    c6512am2.m12148k(strMo12304b2, str, jSONObjectM12143d2);
                    return true;
                default:
                    return true;
            }
        } catch (Exception e11) {
            e11.getMessage();
            AbstractC6524c3.m12209a();
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12192j(InterfaceC6619v3 interfaceC6619v3, boolean z11) {
        C44699a c44699a;
        ConcurrentLinkedQueue<InterfaceC6619v3> concurrentLinkedQueue;
        int i11;
        if (!m12193l(false)) {
            return false;
        }
        try {
            this.f10923i.m12401b(interfaceC6619v3);
            mo12155a(C6508aa.f10806c, interfaceC6619v3);
            if (!this.f10926l) {
                try {
                    if (!(interfaceC6619v3 instanceof C6589p3) && !(interfaceC6619v3 instanceof C6594q3) && (!(interfaceC6619v3 instanceof C6599r3) || ((i11 = b.f10934b[((C6599r3) interfaceC6619v3).f11051b.ordinal()]) != 1 && i11 != 2))) {
                        Context contextM12200t = m12200t();
                        if (contextM12200t != null && !this.f10926l) {
                            this.f10926l = true;
                            AbstractC6609t3.m12476c(contextM12200t);
                        }
                    }
                } catch (Exception e11) {
                    m12187e("Failed to check for shouldTriggerAppActiveEventsForEventType", e11.getMessage());
                }
            }
        } catch (Exception e12) {
            m12187e(String.format("Failed to queue event, got ex: %s", e12.getMessage()), null);
        }
        if (z11 && (c44699a = this.f10917c) != null && !c44699a.m98893s() && !m12206z() && !C6566l0.m12419a().m12422d() && m12193l(false)) {
            try {
                Context contextM12200t2 = m12200t();
                if (this.f10917c.m98890p() > 0 && (concurrentLinkedQueue = this.f10923i.f10972a) != null && concurrentLinkedQueue.size() > 0 && contextM12200t2 != null) {
                    m12195n(true);
                    int iM98890p = this.f10917c.m98890p() * 1000;
                    if (this.f10929o.postAtTime(new a(), SystemClock.uptimeMillis() + ((long) iM98890p))) {
                        "Scheduled a 'flushBuffer' alarm to fire within millis: ".concat(String.valueOf(iM98890p));
                        AbstractC6524c3.m12214f();
                    } else {
                        m12205y();
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
                AbstractC6524c3.m12209a();
                m12205y();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized boolean m12193l(boolean z11) {
        boolean z12;
        boolean z13;
        try {
            z12 = false;
            if (this.f10917c == null) {
                if (z11) {
                    AbstractC6524c3.m12211c("ForterClient", "Forter state validation: Configuration cannot be null");
                }
                z13 = false;
            } else {
                z13 = true;
            }
            if (m12200t() == null) {
                if (z11) {
                    AbstractC6524c3.m12211c("ForterClient", "Forter state validation: Context cannot be null");
                }
                z13 = false;
            }
            if (this.f10922h < 0) {
                z13 = false;
            }
            if (this.f10923i == null) {
                z13 = false;
            }
            if (this.f10918d != null) {
                z12 = z13;
            }
            if (z12 && !this.f10925k) {
                m12204x();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z12;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m12195n(boolean z11) {
        this.f10924j = z11;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized String m12196o(@NonNull Context context) {
        StringBuilder sb2;
        String string;
        try {
            if (this.f10930p == null) {
                String strM12217a = C6526d0.m12217a(context);
                if (TextUtils.isEmpty(strM12217a) || "000000000000000".equals(strM12217a) || "012345678912345".equals(strM12217a)) {
                    String strM12218b = C6526d0.m12218b(context);
                    if (TextUtils.isEmpty(strM12218b)) {
                        String strM12219c = C6526d0.m12219c(context);
                        if (TextUtils.isEmpty(strM12219c)) {
                            sb2 = new StringBuilder("9");
                            sb2.append(AbstractC6539f3.m12289w("failure"));
                        } else {
                            string = "4" + AbstractC6539f3.m12289w(strM12219c);
                        }
                        this.f10930p = string;
                    } else {
                        sb2 = new StringBuilder("2");
                        sb2.append(AbstractC6539f3.m12289w(strM12218b));
                    }
                } else {
                    sb2 = new StringBuilder("1");
                    sb2.append(AbstractC6539f3.m12289w(strM12217a));
                }
                string = sb2.toString();
                this.f10930p = string;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10930p;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized C44699a m12197p() {
        return this.f10917c;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized C6510ae m12198r() {
        return this.f10916b;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m12199s(@NonNull Context context) {
        this.f10915a = new WeakReference<>(context);
        this.f10918d = new C6512am();
    }

    /* JADX INFO: renamed from: x */
    public final void m12204x() {
        this.f10925k = true;
        Context contextM12200t = m12200t();
        if (contextM12200t == null) {
            mo12155a(C6508aa.f10805b, null);
            return;
        }
        m12201u(contextM12200t);
        m12185c(contextM12200t);
        m12202v(contextM12200t);
        mo12155a(C6508aa.f10804a, null);
        AbstractC6524c3.m12211c("ForterClient", "[ForterSDK] started successfully");
    }

    /* JADX INFO: renamed from: z */
    public final synchronized boolean m12206z() {
        return this.f10924j;
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.c$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10933a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10934b;

        static {
            int[] iArr = new int[TrackType.values().length];
            f10934b = iArr;
            try {
                iArr[TrackType.APP_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10934b[TrackType.ACCOUNT_ID_ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC6620w.values().length];
            f10933a = iArr2;
            try {
                iArr2[EnumC6620w.ON_RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10933a[EnumC6620w.ON_PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10933a[EnumC6620w.ON_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10933a[EnumC6620w.ON_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10933a[EnumC6620w.ON_STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10933a[EnumC6620w.ON_DESTROYED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10933a[EnumC6620w.ON_SAVE_INSTANCE_STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C6520c m12182b() {
        return f10914r;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6525d
    /* JADX INFO: renamed from: a */
    public final void mo12155a(int i11, Object obj) {
        if (AbstractC6539f3.m12283q(this.f10927m)) {
            return;
        }
        try {
            Iterator<InterfaceC6525d> it = this.f10927m.iterator();
            while (it.hasNext()) {
                it.next().mo12155a(i11, obj);
            }
        } catch (Exception e11) {
            e11.getMessage();
            AbstractC6524c3.m12209a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12185c(Context context) {
        C44699a c44699a;
        if (this.f10920f == null && m12193l(false) && (c44699a = this.f10917c) != null && c44699a.m98874K()) {
            C43937c c43937c = new C43937c();
            this.f10920f = c43937c;
            c43937c.m96882a(context, this.f10917c.m98883i(), this.f10917c.m98882h());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12186d(EnumC6620w enumC6620w, Context context) {
        try {
            int i11 = b.f10933a[enumC6620w.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                C6566l0.m12419a().m12420b(false);
            } else {
                if (m12200t() == null) {
                    m12199s(context);
                }
                if (C6566l0.m12419a().m12421c()) {
                    AbstractC6609t3.m12480g(context);
                    AbstractC6524c3.m12214f();
                }
                C6566l0.m12419a().m12420b(true);
            }
        } catch (Exception e11) {
            m12187e(String.format("ForterClient::activityEvent(withContext) -> got exception: %s", e11.getMessage()), null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12194m(Context context) {
        C43937c c43937c = this.f10920f;
        if (c43937c == null || context == null) {
            return;
        }
        c43937c.m96883b(context);
        this.f10920f = null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Context m12200t() {
        WeakReference<Context> weakReference = this.f10915a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f10915a.get();
    }

    /* JADX INFO: renamed from: u */
    public final void m12201u(Context context) {
        if (this.f10919e == null && m12193l(false)) {
            try {
                C6590q c6590q = new C6590q();
                this.f10919e = c6590q;
                c6590q.m12466a(context);
            } catch (Exception unused) {
                AbstractC6524c3.m12212d();
            }
        }
    }

    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: v */
    public final void m12202v(Context context) {
        C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("app/display");
        if (c6545hArrM12165b == null) {
            return;
        }
        JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArrM12165b, "actions");
        if (!AbstractC6539f3.m12285s(jSONArrayM12175i) && this.f10921g == null && m12193l(false)) {
            try {
                C6580o c6580o = new C6580o(context, jSONArrayM12175i);
                this.f10921g = c6580o;
                c6580o.m12440b();
            } catch (Throwable unused) {
                AbstractC6524c3.m12212d();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12189g(Location location) {
        Context contextM12200t = m12200t();
        if (m12193l(false) && contextM12200t != null && location != null) {
            float accuracy = location.getAccuracy();
            if (accuracy >= 0.0f && !Float.isNaN(accuracy) && !Float.isInfinite(accuracy) && !Double.isInfinite(location.getLatitude()) && !Double.isInfinite(location.getLongitude()) && location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d && location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                AbstractC6609t3.m12477d(contextM12200t, location);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m12203w() {
        AbstractC6524c3.m12214f();
        C6556j0 c6556j0 = this.f10923i;
        if (c6556j0 != null) {
            AbstractC6524c3.m12216h();
            if (c6556j0.m12400a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m12205y() {
        AbstractC6524c3.m12209a();
        m12195n(false);
        m12203w();
    }
}
