package p611s;

import aai.telemetry.enums.PluginPlatform;
import ai.advance.common.entity.BaseResultEntity;
import ai.advance.sdk.global.iqa.lib.EnumC0360w;
import ai.advance.sdk.global.iqa.lib.JNI;
import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p246f.C37287i;
import p277g.C37738d;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40826a;
import p387k.C40832g;
import p387k.C40835j;
import p442m.C42334d;
import p457n.C42687h;
import p579r.C43890a;
import p647u.InterfaceC45081b;

/* JADX INFO: renamed from: s.o0 */
/* JADX INFO: loaded from: classes23.dex */
public class C44237o0 {

    /* JADX INFO: renamed from: v */
    public static final String f97711v = C40835j.m89369c();

    /* JADX INFO: renamed from: a */
    public InterfaceC45081b f97712a;

    /* JADX INFO: renamed from: b */
    public LinkedBlockingQueue<C44210c0> f97713b;

    /* JADX INFO: renamed from: c */
    public LinkedBlockingQueue<C44217e1> f97714c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f97715d;

    /* JADX INFO: renamed from: e */
    public c f97716e;

    /* JADX INFO: renamed from: f */
    public ExecutorService f97717f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f97718g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f97719h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f97720i;

    /* JADX INFO: renamed from: j */
    public final Context f97721j;

    /* JADX INFO: renamed from: k */
    public C44220g f97722k;

    /* JADX INFO: renamed from: l */
    public C44224i f97723l;

    /* JADX INFO: renamed from: m */
    public C44208b1 f97724m;

    /* JADX INFO: renamed from: n */
    public C37739e f97725n;

    /* JADX INFO: renamed from: o */
    public final String f97726o;

    /* JADX INFO: renamed from: p */
    public C44216e0 f97727p;

    /* JADX INFO: renamed from: q */
    public Handler f97728q;

    /* JADX INFO: renamed from: r */
    public volatile C44217e1 f97729r;

    /* JADX INFO: renamed from: s */
    public float f97730s;

    /* JADX INFO: renamed from: t */
    public long f97731t;

    /* JADX INFO: renamed from: u */
    public boolean f97732u;

    /* JADX INFO: renamed from: s.o0$a */
    public class a implements InterfaceC44214d1 {
        public a() {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ C37738d m97581f(long j11, String str, long j12) {
            C37738d.b bVar = new C37738d.b("native_init_finished");
            if (j11 == 0) {
                str = AppConstants.AB_TEST_SUCCESS;
            }
            return bVar.m85085b(str).m85086c((int) j12).m85096m();
        }

        @Override // p611s.InterfaceC44214d1
        /* JADX INFO: renamed from: a */
        public void mo97489a() {
            C44237o0.this.m97569k(new Runnable() { // from class: s.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97701b.m97582g();
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m97582g() {
            if (C44237o0.this.f97712a != null) {
                C44237o0.this.f97712a.mo97676c();
            }
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m97583h(boolean z11, String str, String str2) {
            if (C44237o0.this.f97712a != null) {
                InterfaceC45081b interfaceC45081b = C44237o0.this.f97712a;
                if (z11) {
                    str = AppConstants.AB_TEST_SUCCESS;
                }
                interfaceC45081b.mo97675b(z11, str, str2);
            }
        }

        @Override // p611s.InterfaceC44214d1
        /* JADX INFO: renamed from: b */
        public void mo97490b(final long j11, final long j12, final boolean z11, final String str, final String str2, String str3) {
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.m0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44237o0.a.m97581f(j11, str, j12);
                }
            });
            if (z11) {
                C44237o0.this.m97566M();
            }
            C44237o0.this.m97569k(new Runnable() { // from class: s.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97705b.m97583h(z11, str, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s.o0$b */
    public class b extends Thread {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m97584a(C44217e1 c44217e1, byte[] bArr) {
            try {
                if (JNI.isRecordModelLog() && c44217e1.f97648j.m97480a() != ImageWarnCode.GOOD) {
                    c44217e1.f97644f = C44234n.m97533b(c44217e1.m97504c(bArr));
                }
            } catch (Exception e11) {
                C44251v0.m97602g(e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (C44237o0.this.f97715d) {
                try {
                    C44210c0 c44210c0 = (C44210c0) C44237o0.this.f97713b.poll(30L, TimeUnit.MILLISECONDS);
                    if (c44210c0 == null) {
                        C44237o0.this.f97719h.incrementAndGet();
                    } else if (c44210c0.f97606b != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        Bitmap bitmapM97537f = C44234n.m97537f(c44210c0.f97605a, JNI.getOutputPictureMinSize(), c44210c0.f97606b, C44237o0.this.f97722k.f97659i, C44237o0.this.f97722k.f97660j, c44210c0.f97607c);
                        if (bitmapM97537f != null) {
                            byte[] bArrM89322h = C40826a.m89322h(bitmapM97537f);
                            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis2);
                            C44237o0.this.f97718g.incrementAndGet();
                            C44217e1 c44217e1 = new C44217e1(bitmapM97537f.getWidth(), bitmapM97537f.getHeight(), C44237o0.this.m97577x());
                            bitmapM97537f.recycle();
                            c44217e1.f97645g = iCurrentTimeMillis;
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            String strM1363h = JNI.m1363h(bArrM89322h, c44217e1.f97641c, c44217e1.f97642d, C44237o0.this.f97722k.f97653c, C44237o0.this.f97722k.f97651a);
                            c44217e1.f97646h = (int) (System.currentTimeMillis() - jCurrentTimeMillis3);
                            C44209c c44209cM97534c = C44234n.m97534c(strM1363h, C44237o0.this.f97722k.f97651a);
                            c44217e1.f97648j = c44209cM97534c;
                            C44237o0.this.f97727p.m97500f(c44217e1.f97645g, c44217e1.f97646h, c44209cM97534c.m97480a());
                            if (C44237o0.this.m97577x()) {
                                m97584a(c44217e1, bArrM89322h);
                                if (c44217e1.f97648j.m97480a() == ImageWarnCode.GOOD) {
                                    c44217e1.m97503b(bArrM89322h, c44210c0.f97605a);
                                }
                            }
                            if (C44237o0.this.f97714c.size() == JNI.getPreProcessQueueMaxSize()) {
                                C44237o0.this.f97714c.poll();
                                C44237o0.this.f97727p.m97499e();
                            }
                            C44237o0.this.f97714c.offer(c44217e1);
                            c44217e1.f97647i = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                    }
                } catch (Exception e11) {
                    C44251v0.m97602g(e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s.o0$c */
    public class c extends Thread {

        /* JADX INFO: renamed from: b */
        public C44222h f97735b = new C44222h();

        /* JADX INFO: renamed from: c */
        public long f97736c;

        /* JADX INFO: renamed from: d */
        public ImageWarnCode f97737d;

        /* JADX INFO: renamed from: e */
        public ImageWarnCode f97738e;

        /* JADX INFO: renamed from: f */
        public int f97739f;

        /* JADX INFO: renamed from: s.o0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C44237o0.this.f97712a != null) {
                    C44237o0.this.f97712a.mo97679f();
                }
            }
        }

        /* JADX INFO: renamed from: s.o0$c$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C44237o0.this.f97712a != null) {
                    C44237o0.this.f97712a.mo97679f();
                }
            }
        }

        public c() {
        }

        /* JADX INFO: renamed from: e */
        public final void m97589e() {
            if (C44237o0.this.m97577x()) {
                final int iMax = Math.max(0, C44237o0.this.f97722k.f97657g - ((int) ((System.currentTimeMillis() - this.f97736c) / 1000)));
                if (iMax == 0 && C44237o0.this.f97729r != null) {
                    C44237o0.this.f97715d = false;
                    C44237o0.this.m97569k(new a());
                    return;
                }
                C44237o0.this.m97569k(new Runnable() { // from class: s.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97747b.m97590f(iMax);
                    }
                });
                if (iMax == 0) {
                    C44237o0.this.f97715d = false;
                    if (C44237o0.this.f97722k.f97654d) {
                        C44203a.m97443p("SCAN_TIMEOUT");
                        C44203a.m97444q("Scan timeout.");
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m97590f(int i11) {
            if (C44237o0.this.f97712a != null) {
                C44237o0.this.f97712a.mo97674a(i11);
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m97591g(ImageWarnCode imageWarnCode, C44209c c44209c) {
            if (C44237o0.this.f97712a != null) {
                this.f97737d = imageWarnCode;
                C44237o0.this.f97712a.mo97678e(imageWarnCode, c44209c);
            }
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m97592h(C44209c c44209c) {
            if (C44237o0.this.f97712a != null) {
                C44237o0.this.f97712a.mo97678e(ImageWarnCode.CARD_POOR_QUALITY, c44209c);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m97593i(C44217e1 c44217e1) {
            final C44209c c44209c = c44217e1.f97648j;
            if (!c44217e1.f97643e) {
                if (c44209c.m97481b() || c44209c.f97582c) {
                    C44237o0.this.m97569k(new Runnable() { // from class: s.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f97744b.m97592h(c44209c);
                        }
                    });
                    return;
                }
                return;
            }
            ImageWarnCode imageWarnCodeM97480a = c44209c.m97480a();
            if (C44237o0.this.f97729r == null) {
                if (imageWarnCodeM97480a == ImageWarnCode.GOOD) {
                    C44237o0 c44237o0 = C44237o0.this;
                    c44237o0.f97730s = c44209c.f97587h;
                    c44237o0.f97729r = c44217e1;
                    C44237o0.this.f97731t = System.currentTimeMillis();
                }
                m97595k(imageWarnCodeM97480a, c44209c);
                return;
            }
            if (imageWarnCodeM97480a == ImageWarnCode.GOOD) {
                float f11 = c44209c.f97587h;
                C44237o0 c44237o1 = C44237o0.this;
                if (f11 > c44237o1.f97730s) {
                    c44237o1.f97729r = c44217e1;
                    C44237o0.this.f97730s = c44209c.f97587h;
                }
            }
            if (System.currentTimeMillis() - C44237o0.this.f97731t >= JNI.getHoldStillTimeMills()) {
                C44237o0.this.f97715d = false;
                C44237o0.this.m97569k(new b());
            }
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m97594j(ImageWarnCode imageWarnCode, C44209c c44209c) {
            if (C44237o0.this.f97712a != null) {
                this.f97737d = this.f97738e;
                C44237o0.this.f97712a.mo97678e(imageWarnCode, c44209c);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m97595k(final ImageWarnCode imageWarnCode, final C44209c c44209c) {
            ImageWarnCode imageWarnCode2 = this.f97737d;
            if (imageWarnCode == imageWarnCode2) {
                return;
            }
            if (imageWarnCode2 == null || imageWarnCode == ImageWarnCode.GOOD) {
                this.f97738e = imageWarnCode;
                C44237o0.this.m97569k(new Runnable() { // from class: s.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97753b.m97591g(imageWarnCode, c44209c);
                    }
                });
            } else {
                if (imageWarnCode != this.f97738e) {
                    this.f97739f = 1;
                    this.f97738e = imageWarnCode;
                    return;
                }
                int i11 = this.f97739f + 1;
                this.f97739f = i11;
                if (i11 >= JNI.getContinuousWarnCodeCount()) {
                    C44237o0.this.m97569k(new Runnable() { // from class: s.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f97750b.m97594j(imageWarnCode, c44209c);
                        }
                    });
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            C44237o0.this.f97715d = true;
            C44237o0.this.f97729r = null;
            C44237o0 c44237o0 = C44237o0.this;
            c44237o0.f97730s = 0.0f;
            c44237o0.f97731t = 0L;
            this.f97736c = System.currentTimeMillis();
            while (C44237o0.this.f97715d) {
                try {
                    m97589e();
                    if (!C44237o0.this.f97715d) {
                        return;
                    }
                    C44217e1 c44217e1 = (C44217e1) C44237o0.this.f97714c.poll(200L, TimeUnit.MILLISECONDS);
                    if (c44217e1 == null) {
                        C44237o0.this.f97720i.incrementAndGet();
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        m97593i(c44217e1);
                        String str = c44217e1.f97644f;
                        if (str != null) {
                            this.f97735b.m97517a(c44217e1.f97648j, str, jCurrentTimeMillis - this.f97736c);
                        }
                    }
                } catch (Exception e11) {
                    C44251v0.m97602g(e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m97570l(String str) {
        m97571m(str, null);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C37738d m97540E() {
        return new C37738d.b("platform_not_supported").m85088e(C44206b.f97560d).m85096m();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C37738d m97551h(BaseResultEntity baseResultEntity) {
        return new C37738d.b("upload_image_data_finished").m85085b(baseResultEntity.code).m85088e(C44203a.m97435h()).m85096m();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C37738d m97558y() {
        return new C37738d.b("iqa_frontend_flow_finished").m85085b(C44203a.m97441n() ? AppConstants.AB_TEST_SUCCESS : C44203a.m97433f()).m85096m();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C37738d m97560A() {
        return new C37738d.b("detection_thread_started").m85094k("mUICallbackThread_empty_status", Boolean.valueOf(this.f97716e == null)).m85094k("working", Boolean.valueOf(this.f97715d)).m85096m();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m97561D() {
        InterfaceC45081b interfaceC45081b = this.f97712a;
        if (interfaceC45081b != null) {
            interfaceC45081b.mo97677d();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C37738d m97562G() {
        return new C37738d.b("app_configs").m85094k(TtmlNode.TAG_REGION, this.f97722k.f97651a).m85094k("cardSide", this.f97722k.f97652b.name()).m85094k("cardType", this.f97722k.f97653c.name()).m85094k("scanMode", Boolean.valueOf(this.f97722k.f97654d)).m85094k("eventId", this.f97722k.f97655e).m85094k("pageId", this.f97722k.f97656f).m85094k("scanTimeoutLimitSeconds", Integer.valueOf(this.f97722k.f97657g)).m85094k("screenOrient", Integer.valueOf(this.f97722k.f97658h)).m85094k("isPortrait", Boolean.valueOf(this.f97722k.f97659i)).m85094k("isFrontCamera", Boolean.valueOf(this.f97722k.f97660j)).m85094k("pictureMaxSize", Integer.valueOf(this.f97722k.f97661k)).m85096m();
    }

    /* JADX INFO: renamed from: J */
    public void m97563J() {
        if (this.f97732u) {
            return;
        }
        this.f97727p.m97501g();
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.h0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44237o0.m97558y();
            }
        });
        C44211c1.m97482R().mo83478o();
        this.f97729r = null;
        this.f97732u = true;
        JNI.release();
        m97564K();
        try {
            this.f97712a = null;
            this.f97715d = false;
            c cVar = this.f97716e;
            if (cVar != null) {
                cVar.join();
            }
        } catch (Exception e11) {
            C44251v0.m97602g(e11);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m97564K() {
        try {
            ExecutorService executorService = this.f97717f;
            if (executorService != null) {
                executorService.shutdown();
            }
        } catch (Exception e11) {
            C44251v0.m97602g(e11);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m97568j() {
        LinkedBlockingQueue<C44210c0> linkedBlockingQueue = this.f97713b;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
        }
        LinkedBlockingQueue<C44217e1> linkedBlockingQueue2 = this.f97714c;
        if (linkedBlockingQueue2 != null) {
            linkedBlockingQueue2.clear();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m97569k(Runnable runnable) {
        Handler handler = this.f97728q;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m97571m(String str, String str2) {
        C44251v0.m97601f(str, "ImageQualityDetector", str2);
    }

    /* JADX INFO: renamed from: n */
    public final void m97572n(C44220g c44220g) {
        this.f97722k = c44220g;
        PluginPlatform pluginPlatformValueOf = PluginPlatform.Standard;
        try {
            pluginPlatformValueOf = PluginPlatform.valueOf(C44206b.f97560d);
        } catch (Exception unused) {
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.i0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44237o0.m97540E();
                }
            });
        }
        C37739e c37739eMo83479p = C44211c1.m97482R().mo83479p(new C37287i.a().m83530k(JNI.isProdEnv()).m83528i(JNI.getUrlByType(EnumC0360w.MIXED_EVENT.name())).m83532m(this.f97722k.f97655e).m83524e(C33820nf.f71144W).m83526g(C33820nf.f71144W).m83527h(C33820nf.f71144W).m83529j(pluginPlatformValueOf).m83521b(C42334d.m92896d(this.f97721j)).m83522c("GLOBAL_IQA").m83523d(C44206b.m97447g()).m83525f(f97711v).m83531l(C43890a.m96662c()).m83520a());
        this.f97725n = c37739eMo83479p;
        c37739eMo83479p.m85099a(TtmlNode.TAG_REGION, this.f97722k.f97651a);
        this.f97725n.m85099a("card_side", this.f97722k.f97652b);
        this.f97725n.m85099a("card_type", this.f97722k.f97653c);
        this.f97725n.m85099a("mode", this.f97722k.f97654d ? "SCAN" : "TAKE_PHOTO");
        this.f97725n.m85099a("process_id", this.f97722k.f97656f);
        C44203a.m97445r(this.f97722k.f97655e);
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.j0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return this.f97694a.m97562G();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m97573o(C44210c0 c44210c0) {
        if (this.f97713b == null || !this.f97715d) {
            return;
        }
        this.f97727p.m97497c();
        if (this.f97713b.size() == JNI.getYuvQueueMaxSize()) {
            this.f97713b.poll();
            this.f97727p.m97498d();
        }
        this.f97713b.offer(c44210c0);
    }

    /* JADX INFO: renamed from: q */
    public void m97574q(InterfaceC45081b interfaceC45081b) {
        this.f97712a = interfaceC45081b;
    }

    /* JADX INFO: renamed from: u */
    public C44220g m97576u() {
        return this.f97722k;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m97577x() {
        return this.f97722k.f97654d;
    }

    public C44237o0(Context context, String str, C44220g c44220g) {
        this.f97721j = context.getApplicationContext();
        m97572n(c44220g);
        this.f97726o = str;
        this.f97718g = new AtomicInteger(0);
        this.f97719h = new AtomicInteger(0);
        this.f97720i = new AtomicInteger(0);
        this.f97727p = new C44216e0();
        this.f97728q = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: L */
    public void m97565L() {
        C44211c1.m97482R().m83470M("iqa_frontend_flow_started");
        this.f97724m = new C44208b1(this.f97721j, this.f97726o, this.f97725n, new a());
        if (JNI.isAuthenticated()) {
            this.f97724m.m97461l();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m97566M() {
        m97570l("startDetectionWorker");
        if (this.f97716e == null || !this.f97715d) {
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.f0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return this.f97650a.m97560A();
                }
            });
            this.f97715d = true;
            this.f97713b = new LinkedBlockingQueue<>(JNI.getYuvQueueMaxSize());
            this.f97714c = new LinkedBlockingQueue<>(JNI.getPreProcessQueueMaxSize());
            c cVar = new c();
            this.f97716e = cVar;
            cVar.start();
            this.f97717f = Executors.newFixedThreadPool(JNI.getPreProcessThreadCount());
            for (int i11 = 0; i11 < JNI.getPreProcessThreadCount(); i11++) {
                try {
                    this.f97717f.submit(new b());
                } catch (Exception e11) {
                    C44251v0.m97602g(e11);
                }
            }
            m97569k(new Runnable() { // from class: s.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97673b.m97561D();
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public void m97567N() {
        try {
            m97570l("stopDetection");
            m97574q(null);
            m97568j();
        } catch (Exception unused) {
        }
        this.f97715d = false;
    }

    /* JADX INFO: renamed from: s */
    public BaseResultEntity m97575s(String str) {
        String str2;
        String str3;
        C44211c1.m97482R().m83470M("upload_image_data_started");
        C37739e c37739eMo83477k = C44211c1.m97482R().mo83477k();
        EnumC0360w enumC0360w = EnumC0360w.DETECTION;
        C44220g c44220g = this.f97722k;
        String str4 = c44220g.f97651a;
        String strName = c44220g.f97652b.name();
        String strName2 = this.f97722k.f97653c.name();
        String strM89368b = C40835j.m89368b();
        if (this.f97722k.f97654d) {
            str2 = "SCAN";
        } else {
            str2 = "TAKE_PHOTO";
        }
        final BaseResultEntity baseResultEntityM89353h = C40832g.m89353h(((C42687h) C44232m.m97531i(enumC0360w, JNI.buildUploadPictureData(str, false, str4, strName, strName2, strM89368b, str2), c37739eMo83477k).first).m93549a(), BaseResultEntity.class);
        C44203a.m97428a(baseResultEntityM89353h);
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.k0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44237o0.m97551h(baseResultEntityM89353h);
            }
        });
        if (baseResultEntityM89353h.success) {
            if (this.f97722k.f97654d) {
                str3 = "scan";
            } else {
                str3 = "takePhoto";
            }
            C44203a.m97429b(str3, str);
            return baseResultEntityM89353h;
        }
        C44203a.m97443p(baseResultEntityM89353h.code);
        C44203a.m97444q(baseResultEntityM89353h.message);
        return baseResultEntityM89353h;
    }
}
