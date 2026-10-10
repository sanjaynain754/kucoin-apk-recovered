package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33765l2 {

    /* JADX INFO: renamed from: D0 */
    public static final int f70701D0 = 556;

    /* JADX INFO: renamed from: E0 */
    public static final String f70702E0 = "app_channel";

    /* JADX INFO: renamed from: F0 */
    public static final String f70703F0 = "BUGLY_COMMON_VALUES";

    /* JADX INFO: renamed from: G0 */
    public static final String f70704G0 = "BUGLY_RESERVED_VALUES";

    /* JADX INFO: renamed from: B */
    public String f70710B;

    /* JADX INFO: renamed from: G */
    public int f70715G;

    /* JADX INFO: renamed from: H */
    public String f70716H;

    /* JADX INFO: renamed from: a */
    public final Context f70735a;

    /* JADX INFO: renamed from: b */
    public String f70737b;

    /* JADX INFO: renamed from: e */
    public String f70743e;

    /* JADX INFO: renamed from: f */
    public final String f70745f;

    /* JADX INFO: renamed from: g */
    public String f70747g;

    /* JADX INFO: renamed from: h */
    public String f70749h;

    /* JADX INFO: renamed from: i0 */
    public boolean f70752i0;

    /* JADX INFO: renamed from: m0 */
    public final SharedPreferences f70760m0;

    /* JADX INFO: renamed from: n */
    public String f70761n;

    /* JADX INFO: renamed from: n0 */
    public final SharedPreferences f70762n0;

    /* JADX INFO: renamed from: o */
    public final String f70763o;

    /* JADX INFO: renamed from: p */
    public String f70765p;

    /* JADX INFO: renamed from: q */
    public String f70767q;

    /* JADX INFO: renamed from: B0 */
    public static final Map<String, String> f70699B0 = new HashMap();

    /* JADX INFO: renamed from: C0 */
    public static C33765l2 f70700C0 = null;

    /* JADX INFO: renamed from: H0 */
    public static boolean f70705H0 = C33911s3.f71805k;

    /* JADX INFO: renamed from: I0 */
    public static String f70706I0 = C33591ch.m72746d();

    /* JADX INFO: renamed from: J0 */
    public static String f70707J0 = "thread_local_key";

    /* JADX INFO: renamed from: i */
    public boolean f70751i = true;

    /* JADX INFO: renamed from: j */
    public final String f70753j = "com.tencent.bugly";

    /* JADX INFO: renamed from: k */
    public String f70755k = "4.4.7.8";

    /* JADX INFO: renamed from: l */
    public final String f70757l = "";

    /* JADX INFO: renamed from: m */
    @Deprecated
    public final String f70759m = "";

    /* JADX INFO: renamed from: r */
    public String f70769r = "10000";

    /* JADX INFO: renamed from: s */
    public String f70771s = "unknown";

    /* JADX INFO: renamed from: t */
    public String f70773t = "";

    /* JADX INFO: renamed from: u */
    public long f70775u = 0;

    /* JADX INFO: renamed from: v */
    public long f70777v = -1;

    /* JADX INFO: renamed from: w */
    public long f70779w = -1;

    /* JADX INFO: renamed from: x */
    public long f70781x = -1;

    /* JADX INFO: renamed from: y */
    public String f70783y = null;

    /* JADX INFO: renamed from: z */
    public String f70785z = null;

    /* JADX INFO: renamed from: A */
    public String f70708A = null;

    /* JADX INFO: renamed from: C */
    public Map<String, PlugInBean> f70711C = null;

    /* JADX INFO: renamed from: D */
    public boolean f70712D = false;

    /* JADX INFO: renamed from: E */
    public String f70713E = null;

    /* JADX INFO: renamed from: F */
    public String f70714F = null;

    /* JADX INFO: renamed from: I */
    public String f70717I = null;

    /* JADX INFO: renamed from: J */
    public String f70718J = "";

    /* JADX INFO: renamed from: K */
    public Boolean f70719K = null;

    /* JADX INFO: renamed from: L */
    public int f70720L = 0;

    /* JADX INFO: renamed from: M */
    public String f70721M = "";

    /* JADX INFO: renamed from: N */
    public String f70722N = null;

    /* JADX INFO: renamed from: O */
    public String f70723O = null;

    /* JADX INFO: renamed from: P */
    public String f70724P = null;

    /* JADX INFO: renamed from: Q */
    public Map<String, PlugInBean> f70725Q = null;

    /* JADX INFO: renamed from: R */
    public Map<String, PlugInBean> f70726R = null;

    /* JADX INFO: renamed from: S */
    public List<String> f70727S = null;

    /* JADX INFO: renamed from: T */
    public int f70728T = -1;

    /* JADX INFO: renamed from: U */
    public int f70729U = -1;

    /* JADX INFO: renamed from: V */
    public final Map<String, String> f70730V = new HashMap();

    /* JADX INFO: renamed from: W */
    public final Map<String, String> f70731W = new HashMap();

    /* JADX INFO: renamed from: X */
    public final Map<String, String> f70732X = new HashMap();

    /* JADX INFO: renamed from: Y */
    public String f70733Y = "unknown";

    /* JADX INFO: renamed from: Z */
    public long f70734Z = 0;

    /* JADX INFO: renamed from: a0 */
    public long f70736a0 = 0;

    /* JADX INFO: renamed from: b0 */
    public long f70738b0 = 0;

    /* JADX INFO: renamed from: c0 */
    public long f70740c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public boolean f70742d0 = false;

    /* JADX INFO: renamed from: e0 */
    public String f70744e0 = null;

    /* JADX INFO: renamed from: f0 */
    public String f70746f0 = null;

    /* JADX INFO: renamed from: g0 */
    public String f70748g0 = "";

    /* JADX INFO: renamed from: h0 */
    public boolean f70750h0 = false;

    /* JADX INFO: renamed from: j0 */
    public HashMap<String, String> f70754j0 = new HashMap<>();

    /* JADX INFO: renamed from: k0 */
    public boolean f70756k0 = false;

    /* JADX INFO: renamed from: l0 */
    public InterfaceC33587cd f70758l0 = null;

    /* JADX INFO: renamed from: o0 */
    public boolean f70764o0 = true;

    /* JADX INFO: renamed from: p0 */
    public boolean f70766p0 = true;

    /* JADX INFO: renamed from: q0 */
    public boolean f70768q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f70770r0 = true;

    /* JADX INFO: renamed from: s0 */
    public final Object f70772s0 = new Object();

    /* JADX INFO: renamed from: t0 */
    public final Object f70774t0 = new Object();

    /* JADX INFO: renamed from: u0 */
    public final Object f70776u0 = new Object();

    /* JADX INFO: renamed from: v0 */
    public final Object f70778v0 = new Object();

    /* JADX INFO: renamed from: w0 */
    public final Object f70780w0 = new Object();

    /* JADX INFO: renamed from: x0 */
    public final Object f70782x0 = new Object();

    /* JADX INFO: renamed from: y0 */
    public final Object f70784y0 = new Object();

    /* JADX INFO: renamed from: z0 */
    public boolean f70786z0 = false;

    /* JADX INFO: renamed from: A0 */
    public boolean f70709A0 = false;

    /* JADX INFO: renamed from: c */
    public final long f70739c = C33791m7.m74042a();

    /* JADX INFO: renamed from: d */
    public final byte f70741d = 1;

    @Deprecated
    /* JADX INFO: renamed from: I */
    public boolean m73836I() {
        C34012x4.m75442d("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public String m73844Q() {
        try {
            Map<String, ?> all = this.f70735a.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f70774t0) {
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            try {
                                this.f70754j0.put(entry.getKey(), entry.getValue().toString());
                            } catch (Throwable th2) {
                                C34012x4.m75438b(th2);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            C34012x4.m75438b(th4);
        }
        if (this.f70754j0.isEmpty()) {
            C34012x4.m75434a("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f70754j0.entrySet()) {
            sb2.append("[");
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(entry2.getValue());
            sb2.append("] ");
        }
        C34012x4.m75434a("SDK_INFO = %s", sb2.toString());
        m73860b("SDK_INFO", sb2.toString());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m73853a(boolean z11) {
        C34012x4.m75434a("setActivityForeState, isFore:%s", Boolean.valueOf(z11));
        this.f70709A0 = z11;
        InterfaceC33587cd interfaceC33587cd = this.f70758l0;
        if (interfaceC33587cd != null) {
            interfaceC33587cd.setNativeIsAppForeground(z11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73858b(Context context) {
        Map<String, String> mapM75409b = C34007x.m75409b(context);
        if (mapM75409b == null) {
            return;
        }
        try {
            this.f70727S = C34007x.m75406a(mapM75409b);
            String str = mapM75409b.get(C34007x.f72471b);
            if (str != null) {
                this.f70717I = str;
                m73860b("APP_ID", str);
            }
            String str2 = mapM75409b.get("BUGLY_APP_VERSION");
            if (str2 != null) {
                this.f70714F = str2;
            }
            String str3 = mapM75409b.get(C34007x.f72472c);
            if (str3 != null) {
                m73869d(str3);
            }
            String str4 = mapM75409b.get(C34007x.f72475f);
            if (str4 != null) {
                this.f70742d0 = str4.equalsIgnoreCase(CredentialEntry.TRUE_STRING);
            }
            String str5 = mapM75409b.get("com.tencent.rdm.uuid");
            if (str5 != null) {
                this.f70748g0 = str5;
            }
            String str6 = mapM75409b.get(C34007x.f72474e);
            if (TextUtils.isEmpty(str6)) {
                return;
            }
            this.f70715G = Integer.parseInt(str6);
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73865c(Context context) {
        PackageInfo packageInfoM75410c = C34007x.m75410c(context);
        if (packageInfoM75410c == null) {
            return;
        }
        try {
            String str = packageInfoM75410c.versionName;
            this.f70714F = str;
            this.f70744e0 = str;
            this.f70746f0 = Integer.toString(packageInfoM75410c.versionCode);
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73871d(boolean z11) {
        this.f70768q0 = z11;
    }

    /* JADX INFO: renamed from: e */
    public String m73872e() {
        return !C33571bi.m72617c(this.f70747g) ? this.f70747g : this.f70717I;
    }

    /* JADX INFO: renamed from: f */
    public void m73875f(String str) {
        this.f70713E = C33770l7.m73937a("", str);
    }

    /* JADX INFO: renamed from: g */
    public void m73877g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f70708A = str.trim();
    }

    /* JADX INFO: renamed from: h */
    public void m73879h(String str) {
        this.f70785z = str;
    }

    /* JADX INFO: renamed from: i */
    public void m73881i(String str) {
        this.f70765p = str;
        if (!TextUtils.isEmpty(str)) {
            C33571bi.m72616c(C33577c3.f69334H, str);
        }
        synchronized (this.f70784y0) {
            this.f70731W.put(C33577c3.f69351h, str);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m73883j(String str) {
        C34012x4.m75442d("change deviceModel，old:%s new:%s", this.f70761n, str);
        this.f70761n = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C33571bi.m72616c(C33577c3.f69335I, str);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m73885k(String str) {
        this.f70771s = C33770l7.m73937a("", str);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m73887l(String str) {
        this.f70773t = C33770l7.m73937a("", str);
    }

    /* JADX INFO: renamed from: m */
    public String m73888m() {
        return !TextUtils.isEmpty(this.f70785z) ? this.f70785z : "unknown";
    }

    /* JADX INFO: renamed from: n */
    public void m73891n(String str) {
        synchronized (this.f70782x0) {
            this.f70769r = str;
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized String m73892o() {
        if (!TextUtils.isEmpty(this.f70761n)) {
            return this.f70761n;
        }
        String strM72604b = C33571bi.m72604b(C33577c3.f69335I, (String) null);
        this.f70761n = strM72604b;
        if (strM72604b != null) {
            C34012x4.m75434a("collect device model from sp:%s", strM72604b);
            return this.f70761n;
        }
        if (!this.f70712D) {
            C34012x4.m75434a("not allow collect device model", new Object[0]);
            return C33864ph.f71456b;
        }
        String strM74398d = C33830o4.m74398d();
        this.f70761n = strM74398d;
        C34012x4.m75434a("collect device model:%s", strM74398d);
        C33571bi.m72616c(C33577c3.f69335I, this.f70761n);
        return this.f70761n;
    }

    /* JADX INFO: renamed from: r */
    public synchronized String m73895r() {
        return this.f70771s;
    }

    /* JADX INFO: renamed from: u */
    public synchronized Map<String, PlugInBean> m73897u() {
        Map<String, PlugInBean> map;
        map = this.f70725Q;
        Map<String, PlugInBean> map2 = this.f70726R;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* JADX INFO: renamed from: v */
    public synchronized Map<String, PlugInBean> m73898v() {
        Map<String, PlugInBean> map = this.f70711C;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f70711C.size());
            map2.putAll(this.f70711C);
            return map2;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public synchronized String m73899w() {
        return this.f70773t;
    }

    /* JADX INFO: renamed from: s */
    public static synchronized C33765l2 m73827s() {
        return f70700C0;
    }

    /* JADX INFO: renamed from: A */
    public int m73828A() {
        return this.f70729U;
    }

    /* JADX INFO: renamed from: B */
    public String m73829B() {
        String str;
        synchronized (this.f70772s0) {
            try {
                if (this.f70737b == null) {
                    m73845R();
                }
                str = this.f70737b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: C */
    public long m73830C() {
        if (this.f70779w <= 0) {
            this.f70779w = C33830o4.m74407j();
        }
        return this.f70779w;
    }

    /* JADX INFO: renamed from: D */
    public long m73831D() {
        if (this.f70777v <= 0) {
            this.f70777v = C33830o4.m74409l();
        }
        return this.f70777v;
    }

    /* JADX INFO: renamed from: E */
    public long m73832E() {
        if (this.f70781x <= 0) {
            this.f70781x = C33830o4.m74410m();
        }
        return this.f70781x;
    }

    /* JADX INFO: renamed from: F */
    public String m73833F() {
        String str;
        synchronized (this.f70782x0) {
            str = this.f70769r;
        }
        return str;
    }

    /* JADX INFO: renamed from: G */
    public int m73834G() {
        int size;
        synchronized (this.f70776u0) {
            size = this.f70730V.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: H */
    public int m73835H() {
        int i11;
        synchronized (this.f70780w0) {
            i11 = this.f70728T;
        }
        return i11;
    }

    /* JADX INFO: renamed from: J */
    public void m73837J() {
        try {
            if (TextUtils.isEmpty(this.f70785z)) {
                this.f70785z = NativeCrashHandler.getInstance().getProperties("ro.product.cpu.abi");
            }
        } catch (Throwable th2) {
            if (C34012x4.m75444f(C33799mf.m74131a("Failed to read cpu type. ", th2), new Object[0])) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m73838K() {
        C34012x4.m75434a("isAppForeground:%s", Boolean.valueOf(this.f70709A0));
        return this.f70709A0;
    }

    /* JADX INFO: renamed from: L */
    public boolean m73839L() {
        return this.f70766p0;
    }

    /* JADX INFO: renamed from: M */
    public boolean m73840M() {
        return this.f70764o0;
    }

    /* JADX INFO: renamed from: N */
    public boolean m73841N() {
        return this.f70768q0;
    }

    /* JADX INFO: renamed from: O */
    public boolean m73842O() {
        return C34007x.m75412e(this.f70735a);
    }

    /* JADX INFO: renamed from: P */
    public boolean m73843P() {
        return this.f70756k0 && this.f70770r0;
    }

    /* JADX INFO: renamed from: R */
    public void m73845R() {
        synchronized (this.f70772s0) {
            this.f70737b = UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m73846S() {
        try {
            for (Map.Entry<String, ?> entry : this.f70762n0.getAll().entrySet()) {
                C34012x4.m75434a("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m73851a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f70699B0.entrySet()) {
                C34012x4.m75434a("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m73851a(entry2.getKey(), entry2.getValue(), true);
            }
            f70699B0.clear();
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73870d(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        synchronized (this.f70774t0) {
            this.f70754j0.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public Map<String, String> m73878h() {
        synchronized (this.f70778v0) {
            try {
                if (this.f70732X.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f70732X);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m73893p() {
        int i11 = this.f70760m0.getInt(C33577c3.f69337K, 0);
        this.f70720L = i11;
        return i11;
    }

    /* JADX INFO: renamed from: q */
    public String m73894q() {
        String strM72604b = C33571bi.m72604b(C33577c3.f69338L, "");
        this.f70721M = strM72604b;
        return strM72604b;
    }

    /* JADX INFO: renamed from: t */
    public Boolean m73896t() {
        if (this.f70719K == null) {
            this.f70719K = Boolean.valueOf(C33830o4.m74413p());
        }
        return this.f70719K;
    }

    /* JADX INFO: renamed from: x */
    public String m73900x() {
        if (this.f70722N == null) {
            String str = "" + C33830o4.m74397c(this.f70735a);
            this.f70722N = str;
            C34012x4.m75442d("ROM ID: %s", str);
        }
        return this.f70722N;
    }

    /* JADX INFO: renamed from: y */
    public String m73901y() {
        if (!TextUtils.isEmpty(this.f70708A)) {
            C34012x4.m75434a("get cpu type from so:%s", this.f70708A);
            return this.f70708A;
        }
        if (TextUtils.isEmpty(this.f70710B)) {
            return "unknown";
        }
        C34012x4.m75434a("get cpu type from lib dir:%s", this.f70710B);
        return this.f70710B;
    }

    /* JADX INFO: renamed from: z */
    public String m73902z() {
        return this.f70755k;
    }

    public C33765l2(Context context) {
        this.f70710B = null;
        this.f70716H = null;
        this.f70752i0 = false;
        this.f70735a = C33571bi.m72565a(context);
        m73865c(context);
        this.f70743e = C34007x.m75411d(context);
        this.f70745f = C34007x.m75404a(Process.myPid());
        this.f70716H = C34007x.m75405a(context);
        this.f70763o = "Android " + C33830o4.m74411n() + ",level " + C33830o4.m74394b();
        m73858b(context);
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f70752i0 = true;
                C34012x4.m75434a("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (C33900rc.f71640i) {
                th2.printStackTrace();
            }
        }
        this.f70760m0 = C33571bi.m72566a("BUGLY_COMMON_VALUES", context);
        this.f70762n0 = C33571bi.m72566a(f70704G0, context);
        this.f70710B = C33872q4.m74662a(context);
        m73846S();
        C34012x4.m75434a("com info create end", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public String m73874f() {
        if (this.f70749h == null) {
            this.f70749h = C34007x.m75413f(this.f70735a);
            C34012x4.m75442d("Beacon channel " + this.f70749h, new Object[0]);
        }
        return this.f70749h;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, String> m73876g() {
        synchronized (this.f70784y0) {
            try {
                if (this.f70731W.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f70731W);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public String m73884k() {
        return "";
    }

    /* JADX INFO: renamed from: l */
    public String m73886l() {
        if (this.f70783y == null) {
            this.f70783y = C33830o4.m74392a(this.f70735a, true);
        }
        return this.f70783y;
    }

    /* JADX INFO: renamed from: e */
    public void m73873e(String str) {
        this.f70717I = str;
        m73860b("APP_ID", str);
    }

    /* JADX INFO: renamed from: m */
    public void m73889m(String str) {
        this.f70722N = str;
    }

    /* JADX INFO: renamed from: n */
    public String m73890n() {
        if (!TextUtils.isEmpty(this.f70765p)) {
            return this.f70765p;
        }
        SharedPreferences sharedPreferences = C33716ig.m73433a().getSharedPreferences(this.f70735a, InterfaceC33611dg.f69592a, true);
        C33843oh c33843oh = new C33843oh();
        String strM74457a = c33843oh.m74457a(this.f70765p, sharedPreferences, this.f70760m0);
        this.f70765p = strM74457a;
        if (!TextUtils.isEmpty(strM74457a)) {
            c33843oh.m74459b(this.f70765p, sharedPreferences, this.f70760m0);
            return this.f70765p;
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33765l2 m73825a(Context context) {
        try {
            if (f70700C0 == null) {
                f70700C0 = new C33765l2(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f70700C0;
    }

    /* JADX INFO: renamed from: d */
    public void m73869d(String str) {
        if (str == null) {
            this.f70718J = "";
        } else {
            this.f70718J = str;
        }
        C33791m7.m74054e().setAppChannel(this.f70718J);
        C34012x4.m75434a("setAppChannel: " + str, new Object[0]);
    }

    /* JADX INFO: renamed from: j */
    public String m73882j() {
        if (this.f70713E == null) {
            this.f70713E = C33830o4.m74396c();
        }
        return this.f70713E;
    }

    /* JADX INFO: renamed from: c */
    public void m73867c(boolean z11) {
        this.f70770r0 = z11;
    }

    /* JADX INFO: renamed from: i */
    public Map<String, String> m73880i() {
        synchronized (this.f70776u0) {
            try {
                if (this.f70730V.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f70730V);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73854a(boolean z11, boolean z12) {
        this.f70764o0 = z11;
        this.f70766p0 = z12;
    }

    /* JADX INFO: renamed from: c */
    public String m73864c(String str) {
        String strRemove;
        if (C33571bi.m72617c(str)) {
            C34012x4.m75444f("key should not be empty %s", C33770l7.m73937a("", str));
            return null;
        }
        synchronized (this.f70776u0) {
            strRemove = this.f70730V.remove(str);
        }
        return strRemove;
    }

    /* JADX INFO: renamed from: d */
    public String m73868d() {
        return this.f70718J;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m73855a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return false;
        }
        try {
            if (this.f70711C == null) {
                this.f70711C = new HashMap();
            }
            this.f70711C.put(str, new PlugInBean(str, str2, str3));
            C34012x4.m75442d("add %s %s %s", str, str2, str3);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73850a(Boolean bool) {
        this.f70719K = bool;
    }

    /* JADX INFO: renamed from: c */
    public void m73866c(String str, String str2) {
        if (!C33571bi.m72617c(str) && !C33571bi.m72617c(str2)) {
            synchronized (this.f70776u0) {
                this.f70730V.put(str, str2);
            }
            return;
        }
        C34012x4.m75444f("key&value should not be empty %s %s", C33770l7.m73937a("", str), C33770l7.m73937a("", str2));
    }

    /* JADX INFO: renamed from: a */
    public void m73848a() {
        synchronized (this.f70776u0) {
            this.f70730V.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m73847a(String str) {
        String str2;
        if (C33571bi.m72617c(str)) {
            C34012x4.m75444f("key should not be empty %s", C33770l7.m73937a("", str));
            return null;
        }
        synchronized (this.f70776u0) {
            str2 = this.f70730V.get(str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public void m73862b(boolean z11) {
        this.f70712D = z11;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m73859b(String str) {
        if (str != null) {
            Map<String, PlugInBean> map = this.f70711C;
            if (map != null) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m73863c() {
        return C33830o4.m74394b();
    }

    /* JADX INFO: renamed from: b */
    public Set<String> m73856b() {
        Set<String> setKeySet;
        synchronized (this.f70776u0) {
            setKeySet = this.f70730V.keySet();
        }
        return setKeySet;
    }

    /* JADX INFO: renamed from: a */
    public void m73851a(String str, String str2, boolean z11) {
        if (C33571bi.m72617c(str)) {
            C34012x4.m75444f("key should not be empty %s", str);
            return;
        }
        C34012x4.m75434a("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z11));
        synchronized (this.f70784y0) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f70731W.remove(str);
                    this.f70762n0.edit().remove(str).apply();
                } else {
                    this.f70731W.put(str, str2);
                    if (z11) {
                        this.f70762n0.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73860b(String str, String str2) {
        if (!C33571bi.m72617c(str) && !C33571bi.m72617c(str2)) {
            synchronized (this.f70778v0) {
                this.f70732X.put(str, str2);
            }
            return;
        }
        C34012x4.m75444f("server key&value should not be empty %s %s", C33770l7.m73937a("", str), C33770l7.m73937a("", str2));
    }

    /* JADX INFO: renamed from: b */
    public void m73857b(int i11) {
        synchronized (this.f70780w0) {
            try {
                int i12 = this.f70728T;
                if (i12 != i11) {
                    this.f70728T = i11;
                    C34012x4.m75442d("user scene tag %d changed to tag %d", Integer.valueOf(i12), Integer.valueOf(this.f70728T));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73849a(int i11) {
        int i12 = this.f70729U;
        if (i12 != i11) {
            this.f70729U = i11;
            C34012x4.m75442d("server scene tag %d changed to tag %d", Integer.valueOf(i12), Integer.valueOf(this.f70729U));
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73852a(Map<String, PlugInBean> map) {
        this.f70726R = map;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m73861b(Map<String, PlugInBean> map) {
        this.f70725Q = map;
    }

    /* JADX INFO: renamed from: a */
    public static void m73826a(String str, String str2) {
        C33765l2 c33765l2;
        synchronized (C33765l2.class) {
            c33765l2 = f70700C0;
        }
        if (c33765l2 == null) {
            C34012x4.m75434a("not init yet, keep in global reserved map", new Object[0]);
            f70699B0.put(str, str2);
        } else {
            C34012x4.m75434a("already init, keep in extraRequestData", new Object[0]);
            m73827s().m73851a(str, str2, true);
        }
    }
}
