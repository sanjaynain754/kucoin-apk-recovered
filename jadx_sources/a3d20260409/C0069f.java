package a3d20260409;

import aai.liveness.Detector$DetectionFailedType;
import aai.liveness.Detector$DetectionType;
import aai.liveness.Detector$WarnCode;
import aai.liveness.GuardianLivenessDetectionSDK$DetectionLevel;
import android.content.Context;
import android.text.TextUtils;
import intl.o0oOOOOOooooo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40832g;
import p442m.AbstractC42332b;
import we0.C45819f;

/* JADX INFO: renamed from: a3d20260409.f */
/* JADX INFO: loaded from: classes23.dex */
public class C0069f extends AbstractC42332b {

    /* JADX INFO: renamed from: A */
    public int f149A;

    /* JADX INFO: renamed from: B */
    public final AtomicInteger f150B;

    /* JADX INFO: renamed from: C */
    public final AtomicInteger f151C;

    /* JADX INFO: renamed from: D */
    public final AtomicInteger f152D;

    /* JADX INFO: renamed from: E */
    public final AtomicInteger f153E;

    /* JADX INFO: renamed from: F */
    public final AtomicInteger f154F;

    /* JADX INFO: renamed from: G */
    public final AtomicInteger f155G;

    /* JADX INFO: renamed from: H */
    public final AtomicInteger f156H;

    /* JADX INFO: renamed from: I */
    public final AtomicInteger f157I;

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f158J;

    /* JADX INFO: renamed from: K */
    public int f159K;

    /* JADX INFO: renamed from: L */
    public final Object f160L;

    /* JADX INFO: renamed from: M */
    public String f161M;

    /* JADX INFO: renamed from: j */
    public List<JSONObject> f162j;

    /* JADX INFO: renamed from: k */
    public Detector$DetectionType f163k;

    /* JADX INFO: renamed from: l */
    public boolean f164l;

    /* JADX INFO: renamed from: m */
    public List<String> f165m;

    /* JADX INFO: renamed from: n */
    public int f166n;

    /* JADX INFO: renamed from: o */
    public long f167o;

    /* JADX INFO: renamed from: p */
    public long f168p;

    /* JADX INFO: renamed from: q */
    public long f169q;

    /* JADX INFO: renamed from: r */
    public Map<String, Integer> f170r;

    /* JADX INFO: renamed from: s */
    public int f171s;

    /* JADX INFO: renamed from: t */
    public int f172t;

    /* JADX INFO: renamed from: u */
    public int f173u;

    /* JADX INFO: renamed from: v */
    public int f174v;

    /* JADX INFO: renamed from: w */
    public float f175w;

    /* JADX INFO: renamed from: x */
    public float f176x;

    /* JADX INFO: renamed from: y */
    public float f177y;

    /* JADX INFO: renamed from: z */
    public int f178z;

    /* JADX INFO: renamed from: a3d20260409.f$a */
    public class a implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONArray f179a;

        public a(JSONArray jSONArray) {
            this.f179a = jSONArray;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("3d_action_log").m85075c("logs", this.f179a).m85076d();
        }
    }

    /* JADX INFO: renamed from: F */
    public static float m139F(float f11, int i11, int i12) {
        return ((i11 - f11) / i12) + f11;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m174j0() {
        this.f166n = 0;
    }

    /* JADX INFO: renamed from: p0 */
    public void m181p0() {
        this.f164l = true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m189u0() {
        this.f164l = false;
    }

    /* JADX INFO: renamed from: A */
    public void m140A(Object obj) {
        m160V("near_face_cleared_" + this.f153E.incrementAndGet(), obj);
    }

    /* JADX INFO: renamed from: B */
    public void m141B(String str) {
        m92886k("auth_failed_response", "" + str);
    }

    /* JADX INFO: renamed from: D */
    public final String m143D() {
        Detector$DetectionType detector$DetectionType = this.f163k;
        return detector$DetectionType != null ? detector$DetectionType.name().toLowerCase(Locale.ENGLISH) : "prepare";
    }

    /* JADX INFO: renamed from: E */
    public int m144E() {
        return this.f149A;
    }

    /* JADX INFO: renamed from: G */
    public final void m145G() {
        boolean z11 = C0106s.f424d;
    }

    /* JADX INFO: renamed from: I */
    public void m147I(int i11) {
        if (i11 == 0 || this.f168p == 0) {
            return;
        }
        m92886k("camera_fps", Float.valueOf(i11 / ((System.currentTimeMillis() - this.f168p) / 1000.0f)));
    }

    /* JADX INFO: renamed from: L */
    public void m150L(long j11) {
        this.f167o = j11;
    }

    /* JADX INFO: renamed from: M */
    public void m151M(C0066c c0066c, C0065b c0065b, boolean z11) {
        m155Q(c0065b.f109b, z11);
        JSONObject jSONObject = c0065b.f108a;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("log");
            if (C40832g.m89352g(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (this.f162j == null) {
                        this.f162j = new CopyOnWriteArrayList();
                    }
                    jSONObject2.put("t", System.currentTimeMillis() - this.f169q);
                    this.f162j.add(jSONObject2);
                    this.f166n++;
                } catch (Exception unused) {
                }
            }
            if (!c0065b.f116i || TextUtils.isEmpty(c0065b.f115h)) {
                return;
            }
            if (this.f158J.containsKey(c0065b.f115h)) {
                Float f11 = this.f158J.get(c0065b.f115h);
                if (f11 == null || c0065b.f112e == null || f11.floatValue() >= c0065b.f112e.f140e) {
                    return;
                }
                if (C0109v.m520I()) {
                    m165a0(c0066c.m108d(oOooooooo0000000000.LOG_PICTURE), c0065b.f115h);
                }
            } else if (C0109v.m520I()) {
                m165a0(c0066c.m108d(oOooooooo0000000000.LOG_PICTURE), c0065b.f115h);
            }
            this.f158J.put(c0065b.f115h, Float.valueOf(c0065b.f112e.f140e));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m153O(Detector$DetectionType detector$DetectionType) {
        this.f163k = detector$DetectionType;
    }

    /* JADX INFO: renamed from: P */
    public void m154P(Detector$WarnCode detector$WarnCode) {
        m160V("rollback_to_distant_stage_" + this.f150B.incrementAndGet(), detector$WarnCode);
    }

    /* JADX INFO: renamed from: Q */
    public final void m155Q(Detector$WarnCode detector$WarnCode, boolean z11) {
        if (z11 || detector$WarnCode == null) {
            return;
        }
        if (this.f170r == null) {
            this.f170r = new ConcurrentHashMap();
        }
        String lowerCase = detector$WarnCode.name().toLowerCase(Locale.ENGLISH);
        this.f170r.put(lowerCase, Integer.valueOf((this.f170r.containsKey(lowerCase) ? this.f170r.get(lowerCase).intValue() : 0) + 1));
    }

    /* JADX INFO: renamed from: R */
    public void m156R(C37739e c37739e) {
        if (this.f93843g != null) {
            Map<String, Integer> map = this.f170r;
            if (map != null) {
                try {
                    this.f93843g.putOpt("prepare_log", C40832g.m89356k(map));
                } catch (JSONException unused) {
                }
            }
            List<JSONObject> list = this.f162j;
            if (list == null || list.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < this.f162j.size(); i11++) {
                jSONArray.put(this.f162j.get(i11));
            }
            try {
                this.f93843g.putOpt("3d_action_log", jSONArray);
                C45819f.m101227J().m83490F(new a(jSONArray), c37739e);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m157S(o0oOOOOOooooo o0ooooooooooo) {
        int iIncrementAndGet;
        StringBuilder sb2;
        if (o0ooooooooooo == o0oOOOOOooooo.DISTANT_FACE_CAPTURE) {
            iIncrementAndGet = this.f155G.incrementAndGet();
            sb2 = new StringBuilder();
        } else if (o0ooooooooooo == o0oOOOOOooooo.NEAR_FACE_CAPTURE) {
            iIncrementAndGet = this.f156H.incrementAndGet();
            sb2 = new StringBuilder();
        } else {
            if (o0ooooooooooo != o0oOOOOOooooo.BLINK_DETECTION) {
                return;
            }
            iIncrementAndGet = this.f157I.incrementAndGet();
            sb2 = new StringBuilder();
        }
        sb2.append(o0ooooooooooo.name().toLowerCase(Locale.ENGLISH));
        sb2.append("_start_");
        sb2.append(iIncrementAndGet);
        m160V(sb2.toString(), null);
    }

    /* JADX INFO: renamed from: T */
    public void m158T(Object obj) {
        m160V("distant_face_cleared_" + this.f152D.incrementAndGet(), obj);
    }

    /* JADX INFO: renamed from: U */
    public void m159U(String str) {
        m92886k("camera_view_size", str);
    }

    /* JADX INFO: renamed from: V */
    public void m160V(String str, Object obj) {
        synchronized (this.f160L) {
            j3d20260409.O0oooo0oo000o(str, System.currentTimeMillis(), obj == null ? null : obj.toString());
        }
    }

    /* JADX INFO: renamed from: W */
    public void m161W(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th2.printStackTrace(printWriter);
            m92886k("exception_" + UUID.randomUUID(), stringWriter.toString());
        } catch (Exception unused) {
        } finally {
            printWriter.close();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m162X(ArrayList<Detector$DetectionType> arrayList) {
        if (arrayList == null) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<Detector$DetectionType> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().name().toLowerCase(Locale.ENGLISH));
            }
            m92886k("action_list", jSONArray);
        } catch (Exception e11) {
            m161W(e11);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m163Y(JSONArray jSONArray) {
        m92886k("camera_preview_size_list", jSONArray);
    }

    /* JADX INFO: renamed from: a0 */
    public void m165a0(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            return;
        }
        j3d20260409.O0oooo0o(bArr, str);
    }

    /* JADX INFO: renamed from: b0 */
    public int m166b0() {
        return this.f178z;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m167c0() {
        m92886k("model_max_cost", Integer.valueOf(this.f171s));
        m92886k("model_min_cost", Integer.valueOf(this.f173u));
        m92886k("model_avg_cost", Float.valueOf(this.f175w));
        m92886k("compress_max_cost", Integer.valueOf(this.f172t));
        m92886k("compress_min_cost", Integer.valueOf(this.f174v));
        m92886k("compress_avg_cost", Float.valueOf(this.f176x));
        m92886k("frame_avg_cost", Float.valueOf(this.f177y));
    }

    /* JADX INFO: renamed from: e0 */
    public void m169e0(int i11) {
        if (i11 == 0 || this.f168p == 0) {
            return;
        }
        m92886k("model_fps", Float.valueOf(i11 / ((System.currentTimeMillis() - this.f168p) / 1000.0f)));
    }

    /* JADX INFO: renamed from: g0 */
    public void m171g0(String str) {
        m160V("ellipse_config_changed_" + this.f151C.incrementAndGet(), str);
    }

    /* JADX INFO: renamed from: h0 */
    public int m172h0() {
        int i11 = this.f149A + 1;
        this.f149A = i11;
        return i11;
    }

    /* JADX INFO: renamed from: i0 */
    public void m173i0() {
        m92886k("sdk_detection_success", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k0 */
    public int m175k0() {
        int i11 = this.f178z + 1;
        this.f178z = i11;
        m147I(i11);
        return this.f178z;
    }

    /* JADX INFO: renamed from: n0 */
    public void m178n0(String str) {
        m92886k("get_face_meta_data_failed_response", str);
    }

    /* JADX INFO: renamed from: o0 */
    public JSONObject m179o0() {
        JSONObject jSONObjectMo92883e = super.mo92883e(this.f93843g);
        if (jSONObjectMo92883e == null) {
            return new JSONObject();
        }
        try {
            List<JSONObject> list = this.f162j;
            if (list != null) {
                list.clear();
            }
            Map<String, Integer> map = this.f170r;
            if (map != null) {
                map.clear();
            }
        } catch (Exception unused) {
        }
        return jSONObjectMo92883e;
    }

    /* JADX INFO: renamed from: q0 */
    public void m183q0() {
        try {
            m92886k("camera_frame_count", Integer.valueOf(this.f178z));
            m92886k("camera_discard_frame_count", Integer.valueOf(this.f149A));
            m167c0();
            if (this.f93844h) {
                m92888s(false, "auth_give_up");
            }
            if (this.f165m != null) {
                m92886k("success_action_list", new JSONArray((Collection) this.f165m));
            }
            if (this.f164l) {
                j3d20260409.O0ooEoo0Co();
                C0108u.m502b(intl.OOOoooooo.USER_GIVE_UP);
                m187t0("upload_picture_give_up");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s0 */
    public JSONObject m186s0() {
        boolean z11 = C0106s.f424d;
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public void m187t0(String str) {
        this.f161M = str;
        m92886k("failed_reason", str);
    }

    /* JADX INFO: renamed from: v0 */
    public void m191v0() {
        int i11 = this.f159K + 1;
        this.f159K = i11;
        m92886k("hold_still_show_times", Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: w0 */
    public void m193w0() {
        try {
            m92886k("camera_frame_count", Integer.valueOf(this.f178z));
            m92886k("camera_discard_frame_count", Integer.valueOf(this.f149A));
            m167c0();
            if (this.f165m != null) {
                m92886k("success_action_list", new JSONArray((Collection) this.f165m));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public void m194x(int i11) {
        if (i11 == 0 || this.f168p == 0) {
            return;
        }
        m92886k("compress_fps", Float.valueOf(i11 / ((System.currentTimeMillis() - this.f168p) / 1000.0f)));
    }

    /* JADX INFO: renamed from: x0 */
    public String m195x0() {
        return this.f161M;
    }

    /* JADX INFO: renamed from: y */
    public void m196y(int i11, int i12) {
        int i13 = this.f172t;
        if (i13 < i11 || i13 == 0) {
            this.f172t = i11;
        }
        int i14 = this.f174v;
        if (i14 > i11 || i14 == 0) {
            this.f174v = i11;
        }
        this.f176x = m139F(this.f176x, i11, i12);
    }

    /* JADX INFO: renamed from: z */
    public void m198z(int i11, int i12, int i13) {
        int i14 = this.f171s;
        if (i14 < i11 || i14 == 0) {
            this.f171s = i11;
        }
        int i15 = this.f173u;
        if (i15 > i11 || i15 == 0) {
            this.f173u = i11;
        }
        this.f175w = m139F(this.f175w, i11, i12);
        this.f177y = m139F(this.f177y, i13, i12);
    }

    public C0069f(Context context) {
        super(context, "LIVENESS_DETECTION", C0106s.m487m());
        this.f164l = false;
        this.f166n = 0;
        this.f169q = 0L;
        this.f160L = new Object();
        GuardianLivenessDetectionSDK$DetectionLevel guardianLivenessDetectionSDK$DetectionLevelM536j = C0109v.m536j();
        if (guardianLivenessDetectionSDK$DetectionLevelM536j != null) {
            m92886k("detectionLevel", guardianLivenessDetectionSDK$DetectionLevelM536j.name());
        }
        this.f150B = new AtomicInteger(0);
        this.f155G = new AtomicInteger(0);
        this.f156H = new AtomicInteger(0);
        this.f157I = new AtomicInteger(0);
        this.f151C = new AtomicInteger(0);
        this.f152D = new AtomicInteger(0);
        this.f153E = new AtomicInteger(0);
        this.f154F = new AtomicInteger(0);
        this.f158J = new ConcurrentHashMap();
        m92886k("action_time_limit", Long.valueOf(C0106s.f428h));
        m92886k("prepare_time_limit", Long.valueOf(C0106s.f429i));
        m92886k("result_picture_size", Integer.valueOf(C0106s.m486l()));
        m92886k("record_video_switch", Boolean.valueOf(C0106s.f432l));
        if (C0106s.f432l) {
            m92886k("record_video_max_seconds", Integer.valueOf(C0106s.f433m));
        }
        m145G();
    }

    /* JADX INFO: renamed from: C */
    public void m142C(boolean z11) {
        j3d20260409.O0ooEoo0Co();
        if (z11) {
            m187t0(m143D() + "_give_up");
            m190v();
            return;
        }
        m197y0();
        m187t0("prepare_give_up");
    }

    /* JADX INFO: renamed from: H */
    public void m146H(float f11) {
        m92886k("action_stage_model_fps", Float.valueOf(f11));
    }

    /* JADX INFO: renamed from: J */
    public void m148J(int i11, int i12) {
        m92886k("pre_process_thread_wait_times", Integer.valueOf(i11));
        m92886k("model_thread_wait_times", Integer.valueOf(i12));
    }

    /* JADX INFO: renamed from: K */
    public void m149K(int i11, int i12, int i13) {
        m92886k("pre_process_frame_count", Integer.valueOf(i11));
        m92886k("pre_process_discard_frame_count", Integer.valueOf(i12));
        m92886k("detected_frame_count", Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: N */
    public void m152N(Detector$DetectionFailedType detector$DetectionFailedType, boolean z11) {
        j3d20260409.O0ooEoo0Co0();
        if (z11) {
            m187t0((m143D() + "_" + detector$DetectionFailedType.name()).toLowerCase(Locale.ENGLISH));
            m190v();
        } else {
            m187t0(("prepare_" + detector$DetectionFailedType.name()).toLowerCase(Locale.ENGLISH));
            m197y0();
        }
        Boolean bool = Boolean.FALSE;
        m92886k("sdk_detection_success", bool);
        m92886k("final_success", bool);
        m174j0();
    }

    /* JADX INFO: renamed from: Z */
    public void m164Z(boolean z11) {
        m92886k("ui_callback_result", Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: d0 */
    public void m168d0(float f11) {
        m92886k("frame_fps", Float.valueOf(f11));
    }

    /* JADX INFO: renamed from: f0 */
    public void m170f0(int i11, int i12) {
        m92886k("repeat_detect_sum_count", Integer.valueOf(i11));
        m92886k("repeat_detect_repeat_count", Integer.valueOf(i12));
    }

    /* JADX INFO: renamed from: l0 */
    public void m176l0() {
        m92886k("pre_process_thread_count", Integer.valueOf(C0109v.m532U()));
        m92886k("pre_process_queue_max_size", Integer.valueOf(C0109v.m522K()));
        m92886k("yuv_queue_max_size", Integer.valueOf(C0109v.m525N()));
    }

    /* JADX INFO: renamed from: m0 */
    public void m177m0(float f11) {
        m92886k("prepare_stage_model_fps", Float.valueOf(f11));
    }

    @Override // p442m.AbstractC42332b
    /* JADX INFO: renamed from: p */
    public String mo180p() {
        return C0109v.m519H();
    }

    @Override // p442m.AbstractC42332b
    /* JADX INFO: renamed from: q */
    public String mo182q() {
        return C0106s.m484j();
    }

    @Override // p442m.AbstractC42332b
    /* JADX INFO: renamed from: r */
    public String mo184r() {
        return C0106s.m485k();
    }

    /* JADX INFO: renamed from: r0 */
    public void m185r0() {
        this.f168p = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public void m188u() {
        m190v();
        m174j0();
        if (this.f165m == null) {
            this.f165m = new CopyOnWriteArrayList();
        }
        this.f165m.add(m143D());
    }

    /* JADX INFO: renamed from: v */
    public final void m190v() {
        String strM143D = m143D();
        m92886k(strM143D + "_detection_frame_count", Integer.valueOf(this.f166n));
        m92886k(strM143D + "_duration", Long.valueOf(System.currentTimeMillis() - this.f167o));
    }

    /* JADX INFO: renamed from: w */
    public void m192w(float f11) {
        m92886k("camera_fps_new", Float.valueOf(f11));
    }

    /* JADX INFO: renamed from: y0 */
    public void m197y0() {
        m92886k("prepare_duration", Long.valueOf(System.currentTimeMillis() - this.f168p));
    }
}
