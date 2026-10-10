package a3d20260409;

import aai.liveness.Detector$DetectionFailedType;
import aai.liveness.Detector$DetectionType;
import aai.liveness.Detector$WarnCode;
import aai.liveness.http.entity.ResultEntity;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.datavisor.vangogh.face.DVTokenClient;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import intl.OoOOoOoO;
import intl.OoooOOOoooooo;
import intl.o0oOOOOOooooo;
import intl.oOooooooooooooo;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import p045c.InterfaceC4751a;
import p045c.InterfaceC4752b;
import p277g.C37736b;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p326i.C38390w;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40829d;
import p387k.C40830e;
import p387k.C40831f;
import p387k.C40832g;
import p387k.C40833h;
import p387k.C40835j;
import p416l.C42010b;
import p442m.C42338h;
import p457n.C42687h;
import p579r.C43890a;
import we0.C45816c;
import we0.C45819f;
import we0.C45820g;

/* JADX INFO: renamed from: a3d20260409.h */
/* JADX INFO: loaded from: classes23.dex */
public class C0071h {

    /* JADX INFO: renamed from: B */
    public JSONObject f183B;

    /* JADX INFO: renamed from: C */
    public final C37739e f184C;

    /* JADX INFO: renamed from: D */
    public final C45816c f185D;

    /* JADX INFO: renamed from: E */
    public final C45820g f186E;

    /* JADX INFO: renamed from: F */
    public long f187F;

    /* JADX INFO: renamed from: G */
    public long f188G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f189H;

    /* JADX INFO: renamed from: J */
    public C0067d f191J;

    /* JADX INFO: renamed from: K */
    public int f192K;

    /* JADX INFO: renamed from: L */
    public o0o00 f193L;

    /* JADX INFO: renamed from: a */
    public final Context f194a;

    /* JADX INFO: renamed from: b */
    public long f195b;

    /* JADX INFO: renamed from: c */
    public Detector$DetectionType f196c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4751a f197d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f198e;

    /* JADX INFO: renamed from: f */
    public BlockingQueue<C0067d> f199f;

    /* JADX INFO: renamed from: g */
    public LinkedBlockingQueue<C0066c> f200g;

    /* JADX INFO: renamed from: h */
    public o f201h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4752b f202i;

    /* JADX INFO: renamed from: j */
    public C0069f f203j;

    /* JADX INFO: renamed from: k */
    public int f204k;

    /* JADX INFO: renamed from: l */
    public ExecutorService f205l;

    /* JADX INFO: renamed from: m */
    public C0066c f206m;

    /* JADX INFO: renamed from: n */
    public C0066c f207n;

    /* JADX INFO: renamed from: o */
    public C0066c f208o;

    /* JADX INFO: renamed from: p */
    public final AtomicInteger f209p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f210q;

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f211r;

    /* JADX INFO: renamed from: s */
    public final AssetManager f212s;

    /* JADX INFO: renamed from: t */
    public final AtomicInteger f213t;

    /* JADX INFO: renamed from: u */
    public final AtomicInteger f214u;

    /* JADX INFO: renamed from: v */
    public final C40830e f215v;

    /* JADX INFO: renamed from: w */
    public final C40830e f216w;

    /* JADX INFO: renamed from: x */
    public final C40830e f217x;

    /* JADX INFO: renamed from: y */
    public final C0074k f218y;

    /* JADX INFO: renamed from: z */
    public OoOOoOoO f219z;

    /* JADX INFO: renamed from: A */
    public final Object f182A = new Object();

    /* JADX INFO: renamed from: I */
    public volatile boolean f190I = false;

    /* JADX INFO: renamed from: a3d20260409.h$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            C0071h.this.m274v(O0000o0o0.INIT);
            C0071h.this.f196c = Detector$DetectionType.BLINK;
            C0071h.this.m263g();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$b */
    public class b implements DVTokenClient.InitResultListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f221a;

        /* JADX INFO: renamed from: a3d20260409.h$b$a */
        public class a implements InterfaceC37735a<C37736b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f223a;

            public a(int i11) {
                this.f223a = i11;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                return new C37736b.b(OoooOOOoooooo.GET_DV_TOKEN_RESULT).m85061d("dv_code", Integer.valueOf(this.f223a)).m85058a((int) (System.currentTimeMillis() - b.this.f221a)).m85064g(true).m85063f();
            }
        }

        public b(long j11) {
            this.f221a = j11;
        }

        @Override // com.datavisor.vangogh.face.DVTokenClient.InitResultListener
        public void onResult(String str, int i11) {
            C0071h.this.m244E(new a(i11));
            j3d20260409.OoOoOoo(str, i11, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$c */
    public class c implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DVTokenClient f225a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f226b;

        public c(DVTokenClient dVTokenClient, long j11) {
            this.f225a = dVTokenClient;
            this.f226b = j11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.DV_INIT_FINISH).m85062e(this.f225a != null).m85058a((int) (System.currentTimeMillis() - this.f226b)).m85060c(this.f225a == null ? "no_client" : null).m85064g(true).m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$d */
    public class d implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f228a;

        public d(long j11) {
            this.f228a = j11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.DV_INIT_FINISH).m85058a((int) (System.currentTimeMillis() - this.f228a)).m85064g(true).m85062e(false).m85060c("not_open").m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$e */
    public class e implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f230a;

        public e(String str) {
            this.f230a = str;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            try {
                JSONObject jSONObject = new JSONObject(this.f230a);
                C40832g.m89354i(jSONObject, "timeoutLimit", Long.valueOf(C0106s.f429i));
                C40832g.m89354i(jSONObject, "resultPictureSize", Integer.valueOf(C0106s.m486l()));
                C40832g.m89354i(jSONObject, "jniVersion", C0106s.m485k());
                C40832g.m89354i(jSONObject, "auditConfig", C0071h.this.f203j.m186s0());
                return new C37737c.b("configs").m85074b(jSONObject).m85076d();
            } catch (Exception e11) {
                C0071h.this.m250K(e11);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$f */
    public class f implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ResultEntity f232a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pair f233b;

        public f(ResultEntity resultEntity, Pair pair) {
            this.f232a = resultEntity;
            this.f233b = pair;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.UPLOAD_FACE_DATA_FINISH).m85062e(this.f232a.success).m85060c(this.f232a.message).m85058a(((Integer) this.f233b.second).intValue()).m85064g(true).m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$h */
    public class h implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f237a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f238b;

        public h(long j11, Throwable th2) {
            this.f237a = j11;
            this.f238b = th2;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.DV_INIT_FINISH).m85058a((int) (System.currentTimeMillis() - this.f237a)).m85064g(true).m85062e(false).m85059b(this.f238b).m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$i */
    public class i extends Thread {
        public i() {
            super("preprocess_camera_image");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                boolean z11 = C0106s.f424d;
                C40830e c40830e = new C40830e();
                while (C0071h.this.f198e) {
                    if (C0071h.this.f199f != null) {
                        C0067d c0067d = (C0067d) C0071h.this.f199f.poll(30L, TimeUnit.MILLISECONDS);
                        if (c0067d == null) {
                            C0071h.this.f213t.incrementAndGet();
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C0066c c0066c = new C0066c(c0067d);
                            c0066c.m105a();
                            if (c0066c.f121a != null) {
                                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                                c40830e.m89343e(iCurrentTimeMillis);
                                C0071h.this.f186E.m101230c(iCurrentTimeMillis);
                                int iIncrementAndGet = C0071h.this.f209p.incrementAndGet();
                                C0071h.this.f203j.m194x(iIncrementAndGet);
                                C0071h.this.f203j.m196y(c0066c.f125e, iIncrementAndGet);
                                if (C0109v.m544r(intl.oOooooooo0000000000.RPT_FRAME)) {
                                    C0071h.this.f185D.m101213j(c0067d);
                                }
                                if (C0071h.this.f200g != null) {
                                    if (C0071h.this.f200g.size() == C0109v.m522K()) {
                                        C0071h.this.f210q.incrementAndGet();
                                        C0071h.this.f200g.poll();
                                    }
                                    C0071h.this.f200g.offer(c0066c);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C0071h.this.m250K(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$j */
    public class j implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f241a;

        public j(long j11) {
            this.f241a = j11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.NATIVE_INIT_FINISH).m85062e(true).m85058a((int) (System.currentTimeMillis() - this.f241a)).m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$k */
    public class k implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f243a;

        public k(long j11) {
            this.f243a = j11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("wait_bk_cam_finish").m85075c("exist", Boolean.valueOf(C0109v.m534h())).m85075c("cost", Long.valueOf(System.currentTimeMillis() - this.f243a)).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$l */
    public class l implements InterfaceC37735a<C37736b> {
        public l() {
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            C37736b.b bVar = new C37736b.b(OoooOOOoooooo.DETECTOR_RELEASE);
            String strM195x0 = C0071h.this.f203j.m195x0();
            if (strM195x0 == null) {
                strM195x0 = C0108u.m505e();
            }
            bVar.m85061d("final_reason", strM195x0);
            bVar.m85061d("final_stage", C0071h.this.f219z.name());
            return bVar.m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$m */
    public class m implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f246a;

        public m(long j11) {
            this.f246a = j11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.NATIVE_INIT_FINISH).m85058a((int) (System.currentTimeMillis() - this.f246a)).m85062e(false).m85060c("model error").m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$n */
    public class n implements InterfaceC37735a<C37737c> {
        public n() {
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("risk_info").m85075c("risk_info", C0071h.this.f183B).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$o */
    public class o extends Thread {

        /* JADX INFO: renamed from: b */
        public long f249b;

        /* JADX INFO: renamed from: c */
        public double f250c;

        /* JADX INFO: renamed from: d */
        public double f251d;

        /* JADX INFO: renamed from: e */
        public double f252e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f253f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f254g;

        /* JADX INFO: renamed from: h */
        public boolean f255h;

        /* JADX INFO: renamed from: i */
        public volatile int f256i;

        /* JADX INFO: renamed from: j */
        public boolean f257j;

        /* JADX INFO: renamed from: k */
        public JSONArray f258k;

        /* JADX INFO: renamed from: l */
        public final Object f259l;

        /* JADX INFO: renamed from: m */
        public C40830e f260m;

        /* JADX INFO: renamed from: n */
        public C40830e f261n;

        /* JADX INFO: renamed from: o */
        public final AtomicInteger f262o;

        /* JADX INFO: renamed from: p */
        public final AtomicInteger f263p;

        /* JADX INFO: renamed from: q */
        public int f264q;

        /* JADX INFO: renamed from: r */
        public int f265r;

        /* JADX INFO: renamed from: s */
        public int f266s;

        /* JADX INFO: renamed from: t */
        public int f267t;

        /* JADX INFO: renamed from: u */
        public int f268u;

        /* JADX INFO: renamed from: v */
        public final Map<Detector$WarnCode, Integer> f269v;

        /* JADX INFO: renamed from: a3d20260409.h$o$a */
        public class a implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ JSONObject f271a;

            public a(JSONObject jSONObject) {
                this.f271a = jSONObject;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                C37737c.b bVar = new C37737c.b("runtime_metrics");
                ConcurrentHashMap<String, C40830e> concurrentHashMapM101232e = C0071h.this.f186E.m101232e();
                for (String str : concurrentHashMapM101232e.keySet()) {
                    C40830e c40830e = concurrentHashMapM101232e.get(str);
                    if (c40830e != null) {
                        bVar.m85075c(str.toLowerCase(Locale.ENGLISH) + "_stage_avg_cost", Integer.valueOf(Math.round(c40830e.m89340b())));
                    }
                }
                bVar.m85075c("compress_avg_cost", Integer.valueOf(Math.round(C0071h.this.f186E.m101228a().m89340b())));
                bVar.m85075c("camera_callback_avg_interval", Integer.valueOf(Math.round(C0071h.this.f186E.m101229b().m89340b())));
                int iM166b0 = C0071h.this.f203j.m166b0();
                bVar.m85075c("frame_lost_rate", Float.valueOf((iM166b0 - ((C0071h.this.f211r.get() + C0071h.this.f199f.size()) + C0071h.this.f200g.size())) / iM166b0));
                try {
                    C42010b c42010b = new C42010b(C0071h.this.f194a);
                    bVar.m85075c("cpu_core_number", Integer.valueOf(c42010b.m92104i()));
                    bVar.m85075c("memory_total_size", Long.valueOf(c42010b.m92110o()));
                    bVar.m85075c("os_version", Integer.valueOf(c42010b.m92109n()));
                    bVar.m85075c("brandAndCpu", Build.BRAND + C33820nf.f71144W + Build.HARDWARE);
                    bVar.m85075c("abi", Build.CPU_ABI);
                    if (C0109v.m544r(intl.oOooooooo0000000000.RPT_FRAME)) {
                        JSONObject jSONObject = this.f271a;
                        if (jSONObject != null) {
                            jSONObject.remove("rpt_array");
                        }
                        bVar.m85074b(this.f271a);
                    }
                } catch (Exception unused) {
                }
                bVar.m85077e(true);
                return bVar.m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$b */
        public class b implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f273a;

            public b(C0065b c0065b) {
                this.f273a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("blink_image_update_skip").m85075c("oldValue", Double.valueOf(o.this.f250c)).m85075c("times", Integer.valueOf(o.this.f264q)).m85075c("newValue", Double.valueOf(this.f273a.f119l)).m85075c("r", this.f273a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$c */
        public class c implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f275a;

            public c(C0065b c0065b) {
                this.f275a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("blink_image_update").m85075c("oldValue", Double.valueOf(o.this.f252e)).m85075c("newValue", Double.valueOf(this.f275a.f119l)).m85075c("isForceEyeClosed", Boolean.valueOf(o0oOOOOOooooo.BLINK_DETECTION == this.f275a.f110c)).m85075c("r", this.f275a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$d */
        public class d implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ float f277a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0065b f278b;

            public d(float f11, C0065b c0065b) {
                this.f277a = f11;
                this.f278b = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("distant_image_update").m85075c("oldValue", Double.valueOf(o.this.f250c)).m85075c("times", Integer.valueOf(o.this.f264q)).m85075c("newValue", Float.valueOf(this.f277a)).m85075c("r", this.f278b.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$e */
        public class e implements InterfaceC37735a<C37737c> {
            public e() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("performance_details").m85075c("cost", o.this.f258k).m85075c("model_thread_wait_times", Integer.valueOf(C0071h.this.f214u.get())).m85075c("preprocess_thread_wait_times", Integer.valueOf(C0071h.this.f213t.get())).m85075c("detected_frame_count", Integer.valueOf(C0071h.this.f211r.get())).m85075c("preprocess_frame_count", Integer.valueOf(C0071h.this.f209p.get())).m85075c("camera_callback_frame_count", Integer.valueOf(C0071h.this.f203j.m166b0())).m85075c("discard_camera_frame_count", Integer.valueOf(C0071h.this.f203j.m144E())).m85075c("discard_preprocess_frame_count", C0071h.this.f210q).m85077e(true).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$f */
        public class f implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f281a;

            public f(C0065b c0065b) {
                this.f281a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("distant_image_clear").m85075c("times", Integer.valueOf(o.this.f266s)).m85075c("r", this.f281a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$g */
        public class g implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f283a;

            public g(C0065b c0065b) {
                this.f283a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("near_image_update").m85075c("oldValue", Double.valueOf(o.this.f250c)).m85075c("times", Integer.valueOf(o.this.f265r)).m85075c("newValue", Double.valueOf(o.this.f251d)).m85075c("r", this.f283a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$h */
        public class h implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ float f285a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0065b f286b;

            public h(float f11, C0065b c0065b) {
                this.f285a = f11;
                this.f286b = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("distant_image_update_skip").m85075c("oldValue", Double.valueOf(o.this.f250c)).m85075c("times", Integer.valueOf(o.this.f264q)).m85075c("newValue", Float.valueOf(this.f285a)).m85075c("r", this.f286b.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$i */
        public class i implements InterfaceC37735a<C37736b> {
            public i() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                C37736b.b bVar = new C37736b.b(OoooOOOoooooo.DISTANT_FACE_CAPTURE_SUCCESS);
                int iIntValue = 0;
                Detector$WarnCode detector$WarnCode = null;
                for (Detector$WarnCode detector$WarnCode2 : o.this.f269v.keySet()) {
                    Integer num = (Integer) o.this.f269v.get(detector$WarnCode2);
                    if (num != null && num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        detector$WarnCode = detector$WarnCode2;
                    }
                }
                o.this.f269v.clear();
                bVar.m85061d("max_frequency_code", detector$WarnCode == null ? "No" : detector$WarnCode.name());
                bVar.m85061d("face_captured_change_times", Integer.valueOf(o.this.f264q));
                bVar.m85061d("face_cleared_times", Integer.valueOf(o.this.f266s));
                bVar.m85061d("hold_still_show_times", Integer.valueOf(o.this.f262o.get()));
                Long lM83487B = C45819f.m101227J().m83487B(o0oOOOOOooooo.DISTANT_FACE_CALIBRATE.name(), C0071h.this.f184C);
                if (lM83487B != null) {
                    bVar.m85058a((int) (System.currentTimeMillis() - lM83487B.longValue()));
                }
                return bVar.m85063f();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$j */
        public class j implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f289a;

            public j(C0065b c0065b) {
                this.f289a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("roll_back_" + this.f289a.f109b.name().toLowerCase(Locale.ENGLISH)).m85075c("r", this.f289a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$k */
        public class k implements InterfaceC37735a<C37736b> {
            public k() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                C37736b.b bVar = new C37736b.b(OoooOOOoooooo.FORCE_EYE_CLOSED_FACE_CAPTURE_FINISH);
                bVar.m85062e(true);
                bVar.m85061d("face_captured_times", Integer.valueOf(o.this.f268u));
                Long lM83487B = C45819f.m101227J().m83487B(o0oOOOOOooooo.BLINK_DETECTION.name(), C0071h.this.f184C);
                if (lM83487B != null) {
                    bVar.m85058a((int) (System.currentTimeMillis() - lM83487B.longValue()));
                }
                return bVar.m85063f();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$l */
        public class l implements InterfaceC37735a<C37737c> {
            public l() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("session_log").m85075c("logs", j3d20260409.O0000o00o0o0()).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$m */
        public class m implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ float f293a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0065b f294b;

            public m(float f11, C0065b c0065b) {
                this.f293a = f11;
                this.f294b = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("near_image_update_skip").m85075c("oldValue", Double.valueOf(o.this.f250c)).m85075c("times", Integer.valueOf(o.this.f264q)).m85075c("newValue", Float.valueOf(this.f293a)).m85075c("r", this.f294b.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$n */
        public class n implements InterfaceC37735a<C37737c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0065b f296a;

            public n(C0065b c0065b) {
                this.f296a = c0065b;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("near_image_clear").m85075c("times", Integer.valueOf(o.this.f267t)).m85075c("r", this.f296a.f108a).m85076d();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.h$o$o, reason: collision with other inner class name */
        public class C46952o implements InterfaceC37735a<C37736b> {
            public C46952o() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                C37736b.b bVar = new C37736b.b(OoooOOOoooooo.NEAR_FACE_CAPTURE_SUCCESS);
                int iIntValue = 0;
                Detector$WarnCode detector$WarnCode = null;
                for (Detector$WarnCode detector$WarnCode2 : o.this.f269v.keySet()) {
                    Integer num = (Integer) o.this.f269v.get(detector$WarnCode2);
                    if (num != null && num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        detector$WarnCode = detector$WarnCode2;
                    }
                }
                o.this.f269v.clear();
                bVar.m85061d("max_frequency_code", detector$WarnCode == null ? "No" : detector$WarnCode.name());
                bVar.m85061d("face_captured_change_times", Integer.valueOf(o.this.f265r));
                bVar.m85061d("face_cleared_times", Integer.valueOf(o.this.f267t));
                bVar.m85061d("hold_still_show_times", Integer.valueOf(o.this.f263p.get()));
                Long lM83487B = C45819f.m101227J().m83487B(o0oOOOOOooooo.NEAR_FACE_CALIBRATE.name(), C0071h.this.f184C);
                if (lM83487B != null) {
                    bVar.m85058a((int) (System.currentTimeMillis() - lM83487B.longValue()));
                }
                return bVar.m85063f();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m308e(Object obj) {
            this.f253f = false;
            this.f250c = 0.0d;
            C0071h.this.f206m = null;
            C0071h.this.f203j.m158T(obj);
            m322y(obj);
        }

        public o() {
            super("liveness_worker");
            this.f253f = false;
            this.f255h = false;
            this.f257j = false;
            this.f259l = new Object();
            this.f262o = new AtomicInteger(0);
            this.f263p = new AtomicInteger(0);
            this.f269v = new HashMap();
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ C37737c m298k(byte[][] bArr, byte[] bArr2, byte[] bArr3, long j11) {
            return new C37737c.b("images_build_result").m85075c("distant_image_is_null", Boolean.valueOf(bArr[0] == null)).m85075c("distant_original_size_image_is_null", Boolean.valueOf(bArr[1] == null)).m85075c("full_face_image_is_null", Boolean.valueOf(bArr[2] == null)).m85075c("distant_original_ratio_image_is_null", Boolean.valueOf(bArr2 == null)).m85075c("near_image_is_null", Boolean.valueOf(bArr3 == null)).m85075c("cost", Long.valueOf(System.currentTimeMillis() - j11)).m85076d();
        }

        /* JADX INFO: renamed from: D */
        public final void m303D(Object obj) {
            this.f251d = 0.0d;
            C0071h.this.f207n = null;
            C0071h.this.f203j.m140A(obj);
            m322y(obj);
        }

        /* JADX INFO: renamed from: F */
        public final void m304F() {
            C0071h.this.m246G(OoOOoOoO.build_final_images_start);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final byte[][] bArrM110f = C0071h.this.f206m.m110f();
            j3d20260409.Oo0Oo00O0000o(bArrM110f[0], bArrM110f[2], bArrM110f[1]);
            final byte[] bArrM108d = C0071h.this.f206m.m108d(oOooooooo0000000000.FAR_ORIGINAL_SIZE);
            j3d20260409.Ooo(bArrM108d);
            final byte[] bArrM108d2 = C0071h.this.f207n.m108d(oOooooooo0000000000.NEAR);
            j3d20260409.Oo0Oo00O0000O(bArrM108d2);
            if (C0071h.this.f208o != null) {
                j3d20260409.Oo0Oo00O000(C0071h.this.f208o.m108d(oOooooooo0000000000.BLINK));
            }
            C0071h.this.m265j(new InterfaceC37735a() { // from class: a3d20260409.i
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C0071h.o.m298k(bArrM110f, bArrM108d, bArrM108d2, jCurrentTimeMillis);
                }
            });
            this.f254g = true;
            if (C0071h.this.f197d != null) {
                C0071h.this.f197d.mo437p();
            }
            C0071h.this.m246G(OoOOoOoO.build_final_images_finish);
            C0071h.this.f203j.m197y0();
            C0071h.this.m247H(OoooOOOoooooo.DETECTION_SUCCESS);
            C0071h.this.m274v(O0000o0o0.PREPARE_FINISHED);
            if (!C0071h.this.m276w0()) {
                C0071h c0071h = C0071h.this;
                c0071h.f203j.m153O(c0071h.f196c);
                m302C();
                return;
            }
            if (C0109v.m544r(intl.oOooooooo0000000000.RPT_FRAME)) {
                try {
                    Pair<Integer, Integer> pairM101216o = C0071h.this.f185D.m101216o();
                    C0071h.this.f203j.m170f0(((Integer) pairM101216o.first).intValue(), ((Integer) pairM101216o.second).intValue());
                } catch (Throwable th2) {
                    C0071h.this.m250K(th2);
                }
            }
            C0071h.this.f203j.m173i0();
            C0071h.this.f198e = false;
            if (C0071h.this.f197d != null) {
                C0071h c0071h2 = C0071h.this;
                c0071h2.f196c = c0071h2.f197d.mo422f(new C0073j(Detector$WarnCode.OK));
            }
        }

        /* JADX INFO: renamed from: H */
        public void m305H() {
            JSONObject jSONObjectM101211h;
            if (C0109v.m544r(intl.oOooooooo0000000000.RPT_FRAME)) {
                jSONObjectM101211h = C0071h.this.f185D.m101211h();
                C0071h.this.f203j.m92886k("rpt_result", jSONObjectM101211h);
            } else {
                jSONObjectM101211h = null;
            }
            C0071h.this.m265j(new a(jSONObjectM101211h));
            synchronized (this.f259l) {
                C0071h.this.m265j(new e());
            }
        }

        /* JADX INFO: renamed from: c */
        public void m306c() {
            AtomicInteger atomicInteger;
            if (this.f256i == o0oOOOOOooooo.DISTANT_FACE_CAPTURE.ordinal()) {
                atomicInteger = this.f262o;
            } else if (this.f256i != o0oOOOOOooooo.NEAR_FACE_CAPTURE.ordinal()) {
                return;
            } else {
                atomicInteger = this.f263p;
            }
            atomicInteger.incrementAndGet();
        }

        /* JADX INFO: renamed from: d */
        public final void m307d(C0066c c0066c, C0065b c0065b) {
            Detector$WarnCode detector$WarnCode;
            Detector$WarnCode detector$WarnCode2 = (c0065b.f110c == o0oOOOOOooooo.BLINK_DETECTION && c0065b.f109b == Detector$WarnCode.OK) ? Detector$WarnCode.PLEASE_BLINK : c0065b.f109b;
            C0073j c0073j = new C0073j(detector$WarnCode2);
            c0073j.f308c = c0065b.f112e;
            c0073j.f309d = c0065b.f113f;
            if (detector$WarnCode2 != Detector$WarnCode.FACECAPTURE && detector$WarnCode2 != Detector$WarnCode.OK) {
                Integer num = this.f269v.get(detector$WarnCode2);
                this.f269v.put(detector$WarnCode2, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
            }
            if (C0071h.this.f197d != null) {
                C0071h.this.f197d.mo433m(c0073j);
            }
            if (m317r(c0066c, c0073j) || (detector$WarnCode = c0065b.f109b) == null || g.f236b[detector$WarnCode.ordinal()] != 1) {
                return;
            }
            if (C0071h.this.f196c != null) {
                C0071h.this.m248I(C0071h.this.f196c.name().toLowerCase(Locale.ENGLISH) + "_finished");
            }
            if (C0071h.this.f197d != null) {
                C0071h c0071h = C0071h.this;
                c0071h.f196c = c0071h.f197d.mo422f(c0073j);
            }
            m320w();
        }

        /* JADX INFO: renamed from: g */
        public final void m309g() {
            C0071h.this.m244E(new C46952o());
        }

        /* JADX INFO: renamed from: i */
        public final void m310i() {
            C0071h.this.m244E(new i());
        }

        /* JADX INFO: renamed from: m */
        public void m312m(C0065b c0065b) {
            try {
                synchronized (this.f259l) {
                    JSONObject jSONObject = new JSONObject();
                    C40832g.m89354i(jSONObject, "c", Integer.valueOf(c0065b.f118k));
                    C40832g.m89354i(jSONObject, "m", Integer.valueOf(c0065b.f117j));
                    this.f258k.put(jSONObject);
                    this.f260m.m89343e(c0065b.f117j);
                    this.f261n.m89343e(c0065b.f118k);
                }
            } catch (Exception e11) {
                C0071h.this.m250K(e11);
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m313n(C0066c c0066c, C0065b c0065b) {
            o0oOOOOOooooo o0ooooooooooo;
            o0oOOOOOooooo o0ooooooooooo2 = c0065b.f110c;
            int i11 = this.f256i;
            o0oOOOOOooooo o0ooooooooooo3 = o0oOOOOOooooo.DISTANT_FACE_CAPTURE;
            if (i11 == o0ooooooooooo3.ordinal() && o0ooooooooooo2 == o0oOOOOOooooo.NEAR_FACE_CALIBRATE) {
                m310i();
                if (C0109v.m544r(intl.oOooooooo0000000000.COLLECT_PREVIEW_IMAGE)) {
                    j3d20260409.Oo0O00O0000oooo(m318s());
                }
            } else if (this.f256i == o0oOOOOOooooo.NEAR_FACE_CAPTURE.ordinal() && (o0ooooooooooo2 == o0oOOOOOooooo.FINAL || o0ooooooooooo2 == o0oOOOOOooooo.BLINK_DETECTION)) {
                m309g();
                if (C0109v.m544r(intl.oOooooooo0000000000.COLLECT_PREVIEW_IMAGE)) {
                    j3d20260409.Oo0O00Oo000oooo(m318s());
                }
            } else if (this.f256i == o0oOOOOOooooo.BLINK_DETECTION.ordinal() && o0ooooooooooo2 == o0oOOOOOooooo.FINAL) {
                m319u();
            }
            if (o0ooooooooooo2 != null) {
                m315p(o0ooooooooooo2);
                C45819f.m101227J().m83486A(o0ooooooooooo2.name(), C0071h.this.f184C);
                this.f256i = c0065b.f110c.ordinal();
            }
            if (C0071h.this.f193L != null) {
                C0071h.this.f193L.mo412a(o0ooooooooooo2);
            }
            o0oOOOOOooooo o0ooooooooooo4 = o0oOOOOOooooo.NEAR_FACE_CALIBRATE;
            if (o0ooooooooooo2 == o0ooooooooooo4) {
                this.f253f = true;
            }
            if (this.f253f && o0ooooooooooo2 == o0oOOOOOooooo.DISTANT_FACE_CALIBRATE) {
                C0071h.this.m265j(new j(c0065b));
                m316q("ROLL_BACK_" + c0065b.f109b);
                C0071h.this.f203j.m154P(c0065b.f109b);
                return;
            }
            if (o0ooooooooooo2 == o0oOOOOOooooo.DISTANT_FACE_CALIBRATE && C0071h.this.f206m != null) {
                this.f266s++;
                C0071h.this.m265j(new f(c0065b));
                m316q(c0065b.f109b);
                return;
            }
            if (o0ooooooooooo2 == o0ooooooooooo4 && C0071h.this.f207n != null) {
                this.f267t++;
                C0071h.this.m265j(new n(c0065b));
                m303D(c0065b.f109b);
                return;
            }
            if (c0065b.f120m && (((o0ooooooooooo = c0065b.f110c) == o0oOOOOOooooo.NEAR_FACE_CAPTURE || o0ooooooooooo == o0ooooooooooo3 || o0ooooooooooo == o0oOOOOOooooo.BLINK_DETECTION) && C0109v.m535i())) {
                double d11 = c0065b.f119l;
                if (d11 <= 0.0d) {
                    C0071h.this.m265j(new b(c0065b));
                } else if (d11 > this.f252e) {
                    C0071h.this.m265j(new c(c0065b));
                    o0oOOOOOooooo o0ooooooooooo5 = c0065b.f110c;
                    o0oOOOOOooooo o0ooooooooooo6 = o0oOOOOOooooo.BLINK_DETECTION;
                    if (o0ooooooooooo5 == o0ooooooooooo6) {
                        this.f268u++;
                    }
                    this.f252e = c0065b.f119l;
                    C0071h.this.f208o = c0066c;
                    C0071h.this.m275w(O0000o0o0.EYE_CLOSED_FACE_CAPTURED_CHANGED, Double.valueOf(c0065b.f119l));
                    C0071h.this.f203j.m92886k("eye_closed_captured_stage", o0ooooooooooo2);
                    if (c0065b.f110c != o0ooooooooooo6) {
                        C45819f.m101227J().m83486A(OoooOOOoooooo.SILENCE_EYE_CLOSED_FACE_CAPTURE.name(), C0071h.this.f184C);
                    }
                }
            }
            o0oOOOOOooooo o0ooooooooooo7 = c0065b.f110c;
            if (o0ooooooooooo7 == o0ooooooooooo3) {
                C0068e c0068e = c0065b.f112e;
                if (c0068e == null) {
                    return;
                }
                float f11 = c0068e.f140e;
                if (f11 <= 0.0f) {
                    C0071h.this.m265j(new h(f11, c0065b));
                    return;
                }
                if (C0071h.this.f206m == null) {
                    C0071h.this.f203j.m157S(c0065b.f110c);
                }
                double d12 = f11;
                if (d12 > this.f250c) {
                    this.f264q++;
                    C0071h.this.m265j(new d(f11, c0065b));
                    this.f250c = d12;
                    C0071h.this.f206m = c0066c;
                    j3d20260409.o0o00(C0071h.this.f206m.f128h);
                    C0071h.this.m275w(O0000o0o0.DISTANT_FACE_CAPTURED_CHANGED, Float.valueOf(f11));
                    return;
                }
                return;
            }
            if (o0ooooooooooo7 != o0oOOOOOooooo.NEAR_FACE_CAPTURE) {
                if (C0071h.this.f193L != null) {
                    C0071h.this.f193L.mo436o(j3d20260409.OoooolLi(C0071h.this.f195b));
                    return;
                }
                return;
            }
            C0068e c0068e2 = c0065b.f112e;
            if (c0068e2 == null) {
                return;
            }
            float f12 = c0068e2.f140e;
            double d13 = f12;
            if (d13 > this.f251d) {
                if (f12 <= 0.0f) {
                    C0071h.this.m265j(new m(f12, c0065b));
                    return;
                }
                this.f265r++;
                C0071h.this.m265j(new g(c0065b));
                if (C0071h.this.f207n == null) {
                    C0071h.this.f203j.m157S(c0065b.f110c);
                }
                this.f251d = d13;
                C0071h.this.f207n = c0066c;
                j3d20260409.o0o0O(C0071h.this.f207n.f128h);
                C0071h.this.m275w(O0000o0o0.NEAR_FACE_CAPTURED_CHANGED, Float.valueOf(f12));
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m314o(Detector$DetectionFailedType detector$DetectionFailedType) {
            C0071h.this.m266k(detector$DetectionFailedType.name());
            C0108u.m501a(detector$DetectionFailedType);
            C0071h.this.f203j.m152N(detector$DetectionFailedType, this.f254g);
            if (C0071h.this.f197d != null) {
                C0071h.this.f197d.mo425g(detector$DetectionFailedType);
            }
            C0071h.this.f198e = false;
        }

        /* JADX INFO: renamed from: p */
        public final void m315p(o0oOOOOOooooo o0ooooooooooo) {
            C0071h c0071h;
            OoOOoOoO ooOOoOoO;
            int i11 = g.f235a[o0ooooooooooo.ordinal()];
            if (i11 == 1) {
                c0071h = C0071h.this;
                ooOOoOoO = OoOOoOoO.distant_celebration;
            } else if (i11 == 2) {
                c0071h = C0071h.this;
                ooOOoOoO = OoOOoOoO.distant_capture;
            } else if (i11 == 3) {
                c0071h = C0071h.this;
                ooOOoOoO = OoOOoOoO.near_celebration;
            } else if (i11 == 4) {
                c0071h = C0071h.this;
                ooOOoOoO = OoOOoOoO.near_capture;
            } else {
                if (i11 != 5) {
                    return;
                }
                c0071h = C0071h.this;
                ooOOoOoO = OoOOoOoO.blink_detection;
            }
            c0071h.m246G(ooOOoOoO);
        }

        /* JADX INFO: renamed from: r */
        public final boolean m317r(C0066c c0066c, C0073j c0073j) {
            if (!this.f255h) {
                return false;
            }
            C0071h.this.f206m = c0066c;
            if (C0071h.this.f196c != null) {
                C0071h.this.m248I(C0071h.this.f196c.name().toLowerCase(Locale.ENGLISH) + "_finished");
            }
            C0071h.this.f196c = Detector$DetectionType.DONE;
            if (C0071h.this.f197d != null) {
                C0071h c0071h = C0071h.this;
                c0071h.f196c = c0071h.f197d.mo422f(c0073j);
            }
            m320w();
            return true;
        }

        /* JADX INFO: renamed from: s */
        public final byte[] m318s() {
            Bitmap bitmap = C0071h.this.f193L.getBitmap();
            if (bitmap != null) {
                return C40826a.m89315a(C40826a.m89325k(bitmap, j3d20260409.OOoooOO0000o0()), Bitmap.CompressFormat.JPEG, j3d20260409.OOo0ooOO0000o0());
            }
            return null;
        }

        /* JADX INFO: renamed from: u */
        public final void m319u() {
            C0071h.this.m244E(new k());
        }

        /* JADX INFO: renamed from: w */
        public final void m320w() {
            C0071h.this.f203j.m188u();
            C0071h c0071h = C0071h.this;
            c0071h.f203j.m153O(c0071h.f196c);
            if (C0071h.this.f196c != Detector$DetectionType.DONE) {
                m302C();
            } else {
                C0071h.this.f203j.m173i0();
                C0071h.this.f198e = false;
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m321x(C0066c c0066c, C0065b c0065b) {
            C0071h.this.f203j.m151M(c0066c, c0065b, this.f254g);
        }

        /* JADX INFO: renamed from: z */
        public final void m323z() {
            C0071h.this.m265j(new l());
        }

        /* JADX INFO: renamed from: C */
        public final void m302C() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f249b = jCurrentTimeMillis;
            C0071h.this.f203j.m150L(jCurrentTimeMillis);
            if (C0071h.this.f196c != null) {
                C0071h.this.m248I(C0071h.this.f196c.name().toLowerCase(Locale.ENGLISH) + "_start");
            }
        }

        /* JADX INFO: renamed from: j */
        public final C0065b m311j(C0066c c0066c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM539m = C0109v.m539m(C0071h.this.f195b, c0066c.f121a, c0066c.f122b, c0066c.f123c, C0071h.this.f196c.mInterValue);
            C0065b c0065b = new C0065b();
            c0065b.f117j = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            c0065b.m104a(strM539m);
            c0065b.f118k = c0066c.f125e;
            c0066c.f126f = c0065b.f112e;
            byte[] bArrOO0oOO = j3d20260409.oO0oOO(c0066c.f127g.getYuvData(), System.currentTimeMillis());
            if (bArrOO0oOO != null && bArrOO0oOO.length > 0 && C0071h.this.f193L != null) {
                C0071h.this.m266k("wt_st");
                C0071h.this.f193L.onPreviewFrame(bArrOO0oOO, C0071h.this.f193L.getCamera());
            }
            return c0065b;
        }

        /* JADX INFO: renamed from: q */
        public final void m316q(Object obj) {
            m308e(obj);
            m303D(obj);
            m322y(obj);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jM213c0;
            this.f249b = System.currentTimeMillis();
            C0063a c0063a = new C0063a();
            this.f258k = new JSONArray();
            this.f260m = new C40830e();
            this.f261n = new C40830e();
            while (C0071h.this.f198e) {
                try {
                    if (C0071h.this.f196c == Detector$DetectionType.DONE) {
                        break;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0066c c0066c = (C0066c) C0071h.this.f200g.poll(30L, TimeUnit.MILLISECONDS);
                    if (c0066c == null) {
                        C0071h.this.f214u.incrementAndGet();
                    } else {
                        if (!this.f257j) {
                            this.f257j = true;
                            C0071h.this.m274v(O0000o0o0.FIRST_FRAME_START_DETECT);
                            C0071h.this.f203j.m185r0();
                            C0071h.this.m274v(O0000o0o0.PREPARE_START);
                        }
                        if (this.f254g && C0071h.this.f197d != null) {
                            C0071h.this.f197d.mo430l((this.f249b + C0071h.m213c0()) - System.currentTimeMillis());
                        }
                        C0065b c0065bM311j = m311j(c0066c);
                        (this.f254g ? C0071h.this.f216w : C0071h.this.f215v).m89343e(c0065bM311j.f117j);
                        m312m(c0065bM311j);
                        c0063a.m94a(c0066c, c0065bM311j);
                        int iIncrementAndGet = C0071h.this.f211r.incrementAndGet();
                        m321x(c0066c, c0065bM311j);
                        C0071h.this.f203j.m169e0(iIncrementAndGet);
                        C0071h.this.f203j.m198z(c0065bM311j.f117j, iIncrementAndGet, (int) (System.currentTimeMillis() - jCurrentTimeMillis));
                        m307d(c0066c, c0065bM311j);
                        m313n(c0066c, c0065bM311j);
                        C0071h.this.f186E.m101231d(c0065bM311j.f110c, c0065bM311j.f117j);
                        C0071h.this.f217x.m89342d();
                        if (!this.f254g && c0065bM311j.f110c == o0oOOOOOooooo.FINAL) {
                            m304F();
                        }
                        if (C0071h.this.f198e) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f249b;
                            if (this.f254g) {
                                jM213c0 = C0071h.m213c0();
                            } else {
                                jM213c0 = C0106s.f429i;
                            }
                            if (jCurrentTimeMillis2 >= jM213c0) {
                                m314o(Detector$DetectionFailedType.TIMEOUT);
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th2) {
                    C0071h.this.m250K(th2);
                }
            }
            m305H();
            m323z();
        }

        /* JADX INFO: renamed from: y */
        public final void m322y(Object obj) {
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$p */
    public class p implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f299a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ResultEntity f300b;

        public p(long j11, ResultEntity resultEntity) {
            this.f299a = j11;
            this.f300b = resultEntity;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(OoooOOOoooooo.AUTH_FINISH).m85058a((int) this.f299a).m85062e(this.f300b.success).m85060c(this.f300b.message).m85061d("auth_way", C0106s.f434n).m85064g(true).m85063f();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m248I(String str) {
        m249J(str, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m267k0() {
        C0069f c0069f;
        Boolean bool;
        this.f190I = true;
        JSONObject jSONObjectM256W = m256W();
        C0067d c0067d = this.f191J;
        if (c0067d != null) {
            new C0066c(c0067d).m108d(oOooooooo0000000000.AUDIT);
            this.f191J.m124i();
            boolean z11 = C0106s.f424d;
            throw null;
        }
        this.f203j.m181p0();
        m246G(OoOOoOoO.upload_face_data_start);
        m247H(OoooOOOoooooo.UPLOAD_FACE_DATA_START);
        C37739e c37739eM85098b = C37739e.m85098b(this.f184C);
        m245F(c37739eM85098b);
        Pair<C42687h, Integer> pairM361d = C0075l.m361d(oOooooooooooooo.DETECTION, j3d20260409.O0o0Ooo(C40835j.m89368b(), this.f203j.m92887o(jSONObjectM256W), "esu2fhj1C0QmBl2Z", C43890a.m96661b()), c37739eM85098b);
        String strM93549a = ((C42687h) pairM361d.first).m93549a();
        m246G(OoOOoOoO.upload_face_data_finish);
        ResultEntity resultEntity = (ResultEntity) C40832g.m89353h(strM93549a, ResultEntity.class);
        C45819f.m101227J().m83501y(new f(resultEntity, pairM361d), c37739eM85098b);
        this.f203j.m189u0();
        if (j3d20260409.lIl() || j3d20260409.lll()) {
            C45819f.m101227J().m83491G("face_data_cleared_before_upload_finish", c37739eM85098b);
            C0108u.m502b(intl.OOOoooooo.USER_GIVE_UP);
            C0108u.m511k("user_give_up");
        } else {
            j3d20260409.O0o0Oooo(strM93549a, System.currentTimeMillis());
            if (TextUtils.isEmpty(strM93549a)) {
                C0108u.m502b(intl.OOOoooooo.CHECKING_BAD_NETWORK);
                C0108u.m511k("Please check network");
                this.f203j.m187t0("picture_upload_failed");
            } else {
                if (C0108u.m510j()) {
                    m274v(O0000o0o0.GET_FACE_META_DATA_SUCCESS);
                    j3d20260409.O0ooEoo0Co00();
                    c0069f = this.f203j;
                    bool = Boolean.TRUE;
                } else {
                    C0108u.m503c("CHECKING_" + resultEntity.code);
                    m274v(O0000o0o0.GET_FACE_META_DATA_FAILED);
                    this.f203j.m178n0(strM93549a);
                    this.f203j.m92886k("server_detection_failed_message", resultEntity.message);
                    c0069f = this.f203j;
                    bool = Boolean.FALSE;
                }
                c0069f.m92886k("server_detection_success", bool);
                this.f203j.m92886k("final_success", bool);
            }
        }
        this.f190I = false;
    }

    /* JADX INFO: renamed from: v */
    public final void m274v(O0000o0o0 o0000o0o0) {
        m275w(o0000o0o0, null);
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m276w0() {
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public synchronized void m278z0() {
        try {
            if (this.f189H) {
                return;
            }
            if (intl.OOOoooooo.UNDEFINED.name().equals(C0108u.m505e())) {
                C0108u.m502b(intl.OOOoooooo.USER_GIVE_UP);
                this.f203j.m187t0("user_give_up");
            }
            m274v(O0000o0o0.DETECTOR_RELEASE_START);
            this.f189H = true;
            try {
                if (this.f201h != null) {
                    if (this.f198e) {
                        C0108u.m502b(intl.OOOoooooo.USER_GIVE_UP);
                        this.f203j.m142C(this.f201h.f254g);
                    }
                    this.f198e = false;
                }
                m271q0();
                m257Y();
                if (this.f202i != null) {
                    this.f202i = null;
                }
                long j11 = this.f195b;
                if (j11 != 0) {
                    C0109v.m542p(j11);
                    this.f195b = 0L;
                }
                this.f199f = null;
                this.f185D.m101218q();
            } catch (Throwable th2) {
                m250K(th2);
            }
            m274v(O0000o0o0.DETECTOR_RELEASE_FINISHED);
            if (!C0109v.m526O()) {
                j3d20260409.OOOOooOOOO(this.f203j.m92887o(m260e(false)), this.f194a);
                Context context = this.f194a;
                if (context != null) {
                    C0103p.m474a(context.getApplicationContext(), C37739e.m85098b(this.f184C));
                }
            }
            m272s0();
            C45819f.m101227J().mo83498u();
            this.f193L = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: a3d20260409.h$g */
    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f235a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f236b;

        static {
            int[] iArr = new int[Detector$WarnCode.values().length];
            f236b = iArr;
            try {
                iArr[Detector$WarnCode.OK_ACTIONDONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f236b[Detector$WarnCode.FACEMISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f236b[Detector$WarnCode.WARN_MULTIPLEFACES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f236b[Detector$WarnCode.WARN_MOUTH_OCCLUSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[o0oOOOOOooooo.values().length];
            f235a = iArr2;
            try {
                iArr2[o0oOOOOOooooo.DISTANT_FACE_CALIBRATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f235a[o0oOOOOOooooo.DISTANT_FACE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f235a[o0oOOOOOooooo.NEAR_FACE_CALIBRATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f235a[o0oOOOOOooooo.NEAR_FACE_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f235a[o0oOOOOOooooo.BLINK_DETECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ C37737c m205S(boolean z11) {
        return new C37737c.b("no_best_image").m85075c(Constants.ScionAnalytics.PARAM_LABEL, z11 ? "distant_image_empty" : "near_image_empty").m85076d();
    }

    /* JADX INFO: renamed from: c0 */
    public static long m213c0() {
        return C0106s.f428h;
    }

    /* JADX INFO: renamed from: A0 */
    public void m241A0(InterfaceC4751a interfaceC4751a) {
        this.f197d = interfaceC4751a;
    }

    /* JADX INFO: renamed from: C */
    public void m242C(o0o00 o0o00Var) {
        this.f193L = o0o00Var;
    }

    /* JADX INFO: renamed from: F */
    public final void m245F(C37739e c37739e) {
        if (C0109v.m544r(intl.oOooooooo0000000000.COLLECT_BACK_IMAGE)) {
            C45819f.m101227J().m83491G("wait_bk_cam_start", c37739e);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iOOoooOO000000 = (j3d20260409.OOoooOO000000() + 100) / 100;
            for (int i11 = 0; i11 < iOOoooOO000000 && !C0109v.m534h(); i11++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e11) {
                    m250K(e11);
                }
            }
            C45819f.m101227J().m83490F(new k(jCurrentTimeMillis), c37739e);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m246G(OoOOoOoO ooOOoOoO) {
        synchronized (this.f182A) {
            this.f219z = ooOOoOoO;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m249J(String str, Object obj) {
        this.f203j.m160V(str, obj);
    }

    /* JADX INFO: renamed from: K */
    public void m250K(Throwable th2) {
        C0069f c0069f = this.f203j;
        if (c0069f != null) {
            c0069f.m161W(th2);
        }
        C45819f.m101227J().m83493I(th2, this.f184C);
    }

    /* JADX INFO: renamed from: L */
    public void m251L(boolean z11) {
        this.f203j.m164Z(z11);
    }

    /* JADX INFO: renamed from: M */
    public final void m252M(boolean z11, String str, String str2) {
        if (!z11) {
            if ("NO_RESPONSE".equals(str)) {
                C0108u.m502b(intl.OOOoooooo.AUTH_BAD_NETWORK);
            } else {
                C0108u.m503c("AUTH_" + str);
            }
            C0108u.m511k(str2);
        }
        InterfaceC4752b interfaceC4752b = this.f202i;
        if (interfaceC4752b != null) {
            interfaceC4752b.mo418d(z11, str, str2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m254Q() {
        o oVar = this.f201h;
        if (oVar != null) {
            oVar.m306c();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m255U() {
        try {
            this.f183B = new C42338h(this.f194a, "LIVENESS_RISK_INFO", "1.0").m92909u();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: W */
    public final JSONObject m256W() {
        JSONObject jSONObjectM260e = m260e(true);
        try {
            jSONObjectM260e.getJSONObject("info").putOpt("risk", this.f183B.getJSONObject("info").getJSONObject(C33556b3.f68963J));
            return jSONObjectM260e;
        } catch (Throwable th2) {
            m250K(th2);
            return jSONObjectM260e;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m257Y() {
        try {
            o oVar = this.f201h;
            if (oVar != null) {
                oVar.join();
                this.f201h = null;
            }
        } catch (Throwable th2) {
            m250K(th2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m258b0() {
        if (this.f189H) {
            return;
        }
        this.f185D.m101212i(C0109v.m523L());
        m265j(new e(j3d20260409.O0ooooo00o00ooOO0o00()));
        C40833h.m89362f("sdk auth success");
        m274v(O0000o0o0.NATIVE_INIT_START);
        if (this.f212s == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        m246G(OoOOoOoO.native_init_start);
        this.f195b = C0109v.m538l(this.f212s);
        m246G(OoOOoOoO.native_init_finish);
        if (this.f195b == 0) {
            m274v(O0000o0o0.NATIVE_INIT_FAILED);
            m252M(false, intl.OOOoooooo.MODEL_ERROR.toString(), "model error");
            m244E(new m(jCurrentTimeMillis));
            return;
        }
        m244E(new j(jCurrentTimeMillis));
        this.f199f = new LinkedBlockingQueue(C0109v.m525N());
        this.f200g = new LinkedBlockingQueue<>(C0109v.m522K());
        this.f205l = Executors.newFixedThreadPool(C0109v.m532U() + 1);
        m274v(O0000o0o0.NATIVE_INIT_SUCCESS);
        this.f203j.m176l0();
        m252M(true, "", "");
        if (this.f188G != 0) {
            m274v(O0000o0o0.WAIT_BEFORE_PREPARE);
            try {
                Thread.sleep(this.f188G);
            } catch (Throwable th2) {
                m274v(O0000o0o0.WAIT_BEFORE_PREPARE_ERROR);
                m250K(th2);
            }
        }
        int iM524M = C0109v.m524M();
        if (iM524M > 0) {
            m248I("prepare_wait_start");
            try {
                if (this.f197d != null) {
                    C0073j c0073j = new C0073j(Detector$WarnCode.FACENOTCENTER);
                    c0073j.f307b = true;
                    this.f197d.mo433m(c0073j);
                }
                m246G(OoOOoOoO.wait_before_detection_start);
                Thread.sleep(iM524M);
                m246G(OoOOoOoO.wait_before_detection_finish);
            } catch (Throwable th3) {
                m250K(th3);
            }
            m248I("prepare_wait_finished");
        }
        m264i0();
    }

    /* JADX INFO: renamed from: c */
    public void m259c() {
        try {
            o oVar = this.f201h;
            if (oVar == null || oVar.f256i != o0oOOOOOooooo.NEAR_FACE_CALIBRATE.ordinal()) {
                return;
            }
            m247H(OoooOOOoooooo.NEAR_ELLIPSE_CONFIG_CHANGED);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m260e(boolean z11) {
        this.f203j.m168d0(this.f217x.m89339a());
        this.f203j.m177m0(this.f215v.m89339a());
        this.f203j.m146H(this.f216w.m89339a());
        this.f203j.m149K(this.f209p.get(), this.f210q.get(), this.f211r.get());
        this.f203j.m148J(this.f213t.get(), this.f214u.get());
        this.f203j.m92886k("video_info", this.f218y.m351a());
        if (z11) {
            this.f203j.m193w0();
        } else {
            this.f203j.m183q0();
        }
        this.f203j.m156R(this.f184C);
        return this.f203j.m179o0();
    }

    /* JADX INFO: renamed from: f0 */
    public void m262f0(Detector$DetectionType detector$DetectionType, InterfaceC4752b interfaceC4752b) {
        this.f202i = interfaceC4752b;
        this.f187F = System.currentTimeMillis();
        if (this.f201h != null) {
            m252M(false, intl.OOOoooooo.ALREADY_INIT.toString(), "already init");
        }
        new a().start();
    }

    /* JADX INFO: renamed from: g */
    public final void m263g() throws Throwable {
        m246G(OoOOoOoO.auth_start);
        this.f203j.m92889t();
        m274v(O0000o0o0.AUTH_START);
        this.f203j.m92884i(this.f204k);
        C40833h.m89362f("auth checking");
        InterfaceC4752b interfaceC4752b = this.f202i;
        if (interfaceC4752b != null) {
            interfaceC4752b.mo428j();
        }
        m247H(OoooOOOoooooo.AUTH_START);
        C37739e c37739eM85098b = C37739e.m85098b(this.f184C);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strO0OO0oOo000 = j3d20260409.O0OO0oOo000();
        String string = null;
        if (TextUtils.isEmpty(strO0OO0oOo000)) {
            String strM89337b = C40829d.m89337b(this.f194a, "did");
            Pair<C42687h, Integer> pairM359b = C0075l.m359b(oOooooooooooooo.AUTH_CHECK, j3d20260409.O0OO0oOo1(C40835j.m89368b(), C0107t.m498d(this.f194a, strM89337b), strM89337b), this.f184C);
            String strM93549a = ((C42687h) pairM359b.first).m93549a();
            if (!C40832g.m89352g(strM93549a)) {
                C40833h.m89363g("Request Network Error:\n" + C40831f.m89345b(((C42687h) pairM359b.first).m93550b().m93570c()));
                String strM93568a = ((C42687h) pairM359b.first).m93550b().m93568a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("NETWORK_ERROR(");
                sb2.append(((C42687h) pairM359b.first).m93550b().m93569b());
                sb2.append(")");
                if (strM93568a == null) {
                    strM93568a = "";
                }
                sb2.append(strM93568a);
                string = sb2.toString();
            }
            strO0OO0oOo000 = strM93549a;
        }
        if (!TextUtils.isEmpty(strO0OO0oOo000)) {
            strO0OO0oOo000 = strO0OO0oOo000.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
        }
        ResultEntity resultEntity = (ResultEntity) C40832g.m89353h(strO0OO0oOo000, ResultEntity.class);
        if ("NO_RESPONSE".equals(resultEntity.code)) {
            resultEntity.code = "NETWORK_ERROR";
        }
        if (resultEntity.success) {
            j3d20260409.O0OO0oOo2(strO0OO0oOo000);
            C40829d.m89338c(this.f194a, "did", j3d20260409.O00000oo());
        }
        m243D(resultEntity, System.currentTimeMillis() - jCurrentTimeMillis, c37739eM85098b);
        if (resultEntity.success) {
            C40829d.m89338c(C43890a.m96661b(), CmcdData.Factory.STREAM_TYPE_LIVE, String.valueOf(C0109v.m520I()));
        }
        if (resultEntity.success) {
            m246G(OoOOoOoO.auth_success);
            m274v(O0000o0o0.AUTH_SUCCESS);
            this.f203j.m92888s(resultEntity.success, resultEntity.message);
            m258b0();
            m269n();
            return;
        }
        m246G(OoOOoOoO.auth_failed);
        m274v(O0000o0o0.AUTH_FAILED);
        this.f203j.m92888s(resultEntity.success, string == null ? resultEntity.message : string);
        this.f203j.m141B(strO0OO0oOo000);
        if (this.f202i == null) {
            C40833h.m89362f(" sdk auth failed ");
            return;
        }
        String str = resultEntity.code;
        if (string == null) {
            string = resultEntity.message;
        }
        m252M(false, str, string);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m264i0() {
        if (this.f189H) {
            return;
        }
        if (this.f201h == null) {
            if (this.f218y.m357g()) {
                m277x0();
            }
            try {
                this.f198e = true;
                o oVar = new o();
                this.f201h = oVar;
                oVar.start();
                m246G(OoOOoOoO.start_detection_worker);
                m274v(O0000o0o0.DETECTOR_STARTED);
            } catch (Throwable th2) {
                m274v(O0000o0o0.DETECTOR_START_ERROR);
                m250K(th2);
            }
        }
        try {
            if (!this.f189H && !this.f205l.isShutdown()) {
                for (int i11 = 0; i11 < C0109v.m532U(); i11++) {
                    if (!this.f189H && !this.f205l.isShutdown()) {
                        this.f205l.submit(new i());
                    }
                    return;
                }
                m274v(O0000o0o0.PRE_PROCESS_WORKER_STARTED);
            }
        } catch (Throwable th3) {
            m274v(O0000o0o0.PRE_PROCESS_WORKER_START_ERROR);
            m250K(th3);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m268m0() {
        if (this.f218y.m357g() && this.f218y.m355e()) {
            try {
                this.f218y.m356f();
                m248I("video_recorder_stopped");
            } catch (Exception e11) {
                m250K(e11);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m269n() {
        String strM531T = C0109v.m531T();
        if (TextUtils.isEmpty(strM531T)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject(strM531T);
            if (!jSONObject.getBoolean(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)) {
                m244E(new d(jCurrentTimeMillis));
                m249J("dv_token_client_init", "dfp_closed");
                return;
            }
            m247H(OoooOOOoooooo.DV_INIT_START);
            DVTokenClient dVTokenClientM480f = C0106s.m480f();
            m249J("dv_token_client_init", dVTokenClientM480f == null ? "no_client" : "init_success");
            m244E(new c(dVTokenClientM480f, jCurrentTimeMillis));
            if (dVTokenClientM480f != null) {
                dVTokenClientM480f.setDVCustomDomain(C40832g.m89351f(jSONObject, "d"));
                dVTokenClientM480f.initToken(C40832g.m89351f(jSONObject, "b"), C40832g.m89351f(jSONObject, "c"), null, new b(System.currentTimeMillis()));
            }
        } catch (Throwable th2) {
            m244E(new h(jCurrentTimeMillis, th2));
            m249J("dv_token_client_init", th2.getMessage());
            m250K(th2);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m270p() {
        m274v(O0000o0o0.GET_FACE_META_DATA_START);
        this.f203j.m181p0();
        final boolean zLIl = j3d20260409.lIl();
        boolean zLll = j3d20260409.lll();
        if (!zLIl && !zLll) {
            if (!C0109v.m526O()) {
                m267k0();
                return;
            }
            m248I(O0000o0o0.GET_FACE_META_DATA_SUCCESS.name().toLowerCase(Locale.ENGLISH) + "_offline");
            return;
        }
        m265j(new InterfaceC37735a() { // from class: a3d20260409.g
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C0071h.m205S(zLIl);
            }
        });
        C0108u.m502b(intl.OOOoooooo.NO_UPLOAD_IMAGE);
        C0108u.m511k("not get best image(sdk message)");
        m248I(O0000o0o0.GET_FACE_META_DATA_FAILED.name().toLowerCase(Locale.ENGLISH) + "_no_best_image");
        this.f203j.m189u0();
        C0069f c0069f = this.f203j;
        Boolean bool = Boolean.FALSE;
        c0069f.m92886k("server_detection_success", bool);
        this.f203j.m92886k("final_success", bool);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m271q0() {
        try {
            ExecutorService executorService = this.f205l;
            if (executorService != null) {
                executorService.shutdown();
            }
        } catch (Throwable th2) {
            m250K(th2);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m272s0() {
        m244E(new l());
    }

    /* JADX INFO: renamed from: u */
    public void m273u(long j11) {
        this.f188G = j11;
    }

    /* JADX INFO: renamed from: w */
    public final void m275w(O0000o0o0 o0000o0o0, Object obj) {
        this.f203j.m160V(o0000o0o0.name().toLowerCase(Locale.ENGLISH), obj);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m277x0() {
        try {
            Camera.Size previewSize = this.f193L.getPreviewSize();
            int i11 = (this.f193L.m1185X() ? 360 : 180) - this.f204k;
            if (i11 < 0) {
                i11 += TXVodDownloadDataSource.QUALITY_360P;
            }
            if (i11 == 360) {
                i11 = 0;
            }
            this.f218y.m352b(previewSize.width, previewSize.height, i11);
            if (this.f218y.m354d(this.f194a.getFilesDir() + File.separator + "aai_liveness_" + System.currentTimeMillis() + ".mp4")) {
                m248I("video_recorder_started");
            }
        } catch (Exception e11) {
            m250K(e11);
        }
    }

    public C0071h(Activity activity, C37739e c37739e) {
        this.f204k = 90;
        m246G(OoOOoOoO.constructor_start);
        this.f184C = c37739e;
        Context applicationContext = activity.getApplicationContext();
        this.f194a = applicationContext;
        this.f204k = C40828c.m89331e(C0106s.m483i(), activity);
        this.f203j = new C0069f(applicationContext);
        this.f212s = activity.getAssets();
        this.f186E = new C45820g();
        this.f209p = new AtomicInteger(0);
        this.f210q = new AtomicInteger(0);
        this.f211r = new AtomicInteger(0);
        this.f213t = new AtomicInteger(0);
        this.f214u = new AtomicInteger(0);
        this.f215v = new C40830e();
        this.f216w = new C40830e();
        this.f217x = new C40830e();
        this.f218y = new C0074k();
        this.f185D = new C45816c();
        m274v(O0000o0o0.BEFORE_INIT);
        m247H(OoooOOOoooooo.INIT);
        m246G(OoOOoOoO.constructor_finish);
        m255U();
        m265j(new n());
    }

    /* JADX INFO: renamed from: D */
    public final void m243D(ResultEntity resultEntity, long j11, C37739e c37739e) {
        C45819f.m101227J().m83501y(new p(j11, resultEntity), c37739e);
    }

    /* JADX INFO: renamed from: E */
    public final void m244E(InterfaceC37735a<C37736b> interfaceC37735a) {
        C45819f.m101227J().m83501y(interfaceC37735a, this.f184C);
    }

    /* JADX INFO: renamed from: H */
    public final void m247H(OoooOOOoooooo ooooOOOoooooo) {
        C45819f.m101227J().m83502z(ooooOOOoooooo.name(), this.f184C);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m253O(byte[] bArr, Camera.Size size) {
        boolean zOo0ooO = j3d20260409.oo0ooO(bArr);
        boolean z11 = C0106s.f424d;
        return zOo0ooO;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m261e0(byte[] bArr, Camera.Size size) {
        boolean z11;
        boolean zM253O = m253O(bArr, size);
        if (this.f199f != null && this.f201h != null && this.f198e && !zM253O) {
            try {
                if (this.f199f.size() == C0109v.m525N()) {
                    this.f199f.poll();
                    this.f203j.m172h0();
                }
                this.f186E.m101233f();
                int i11 = size.width;
                int i12 = size.height;
                int i13 = this.f204k;
                if (C0106s.m483i() != C40826a.m89321g()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0067d c0067d = new C0067d(bArr, i11, i12, i13, z11);
                try {
                    int i14 = this.f192K + 1;
                    this.f192K = i14;
                    c0067d.m123h(i14);
                } catch (Exception e11) {
                    m250K(e11);
                }
                boolean zOffer = this.f199f.offer(c0067d);
                this.f203j.m92885j(size);
                this.f203j.m175k0();
                j3d20260409.oo00oo0();
                if (this.f218y.m355e()) {
                    this.f218y.m353c(new C38390w(bArr, System.currentTimeMillis()));
                }
                return zOffer;
            } catch (Throwable th2) {
                m250K(th2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m265j(InterfaceC37735a<C37737c> interfaceC37735a) {
        C45819f.m101227J().m83490F(interfaceC37735a, this.f184C);
    }

    /* JADX INFO: renamed from: k */
    public final void m266k(String str) {
        C45819f.m101227J().m83491G(str, this.f184C);
    }
}
