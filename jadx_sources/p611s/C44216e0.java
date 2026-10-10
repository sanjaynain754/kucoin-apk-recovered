package p611s;

import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p277g.C37738d;
import p277g.InterfaceC37735a;
import p387k.C40830e;

/* JADX INFO: renamed from: s.e0 */
/* JADX INFO: loaded from: classes23.dex */
public class C44216e0 {

    /* JADX INFO: renamed from: e */
    public final Object f97636e = new Object();

    /* JADX INFO: renamed from: a */
    public final C40830e f97632a = new C40830e();

    /* JADX INFO: renamed from: b */
    public final C40830e f97633b = new C40830e();

    /* JADX INFO: renamed from: c */
    public final C40830e f97634c = new C40830e();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap<String, Integer> f97635d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f97637f = new AtomicInteger();

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f97638g = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C37738d m97496b() {
        return new C37738d.b("runtime_metrics").m85092i(this.f97635d).m85094k("compress_avg_cost", Float.valueOf(this.f97633b.m89340b())).m85094k("detect_frame_count", Long.valueOf(this.f97633b.m89341c())).m85094k("model_avg_cost", Long.valueOf(this.f97632a.m89341c())).m85094k("camera_call_back_avg_cost", Float.valueOf(this.f97634c.m89340b())).m85094k("camera_call_back_frame_count", Long.valueOf(this.f97634c.m89341c())).m85094k("compress_frame_count", Long.valueOf(this.f97633b.m89341c())).m85094k("camera_fps", Float.valueOf(this.f97634c.m89339a())).m85094k("compress_fps", Float.valueOf(this.f97633b.m89339a())).m85094k("model_fps", Float.valueOf(this.f97632a.m89339a())).m85094k("discard_processed_frame_count", Integer.valueOf(this.f97637f.get())).m85094k("discard_camera_frame_count", Integer.valueOf(this.f97638g.get())).m85096m();
    }

    /* JADX INFO: renamed from: c */
    public void m97497c() {
        this.f97634c.m89342d();
    }

    /* JADX INFO: renamed from: d */
    public void m97498d() {
        this.f97638g.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public void m97499e() {
        this.f97637f.incrementAndGet();
    }

    /* JADX INFO: renamed from: f */
    public void m97500f(int i11, int i12, ImageWarnCode imageWarnCode) {
        synchronized (this.f97636e) {
            this.f97633b.m89343e(i11);
            this.f97632a.m89343e(i12);
            Integer num = this.f97635d.get(imageWarnCode.name());
            ConcurrentHashMap<String, Integer> concurrentHashMap = this.f97635d;
            String strName = imageWarnCode.name();
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            concurrentHashMap.put(strName, Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m97501g() {
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.d0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return this.f97622a.m97496b();
            }
        });
    }
}
