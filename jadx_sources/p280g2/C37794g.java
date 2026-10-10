package p280g2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p419l2.C42032f;
import p445m2.AbstractC42392c;
import p460n2.InterfaceC42704b;
import p485o2.C42950d;
import p523p2.C43363j;
import p523p2.C43364k;
import p581r1.InterfaceC43896a;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: g2.g */
/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37794g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC43896a f85129a;

    /* JADX INFO: renamed from: b */
    public final Handler f85130b;

    /* JADX INFO: renamed from: c */
    public final List<b> f85131c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C5314h f85132d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC45686d f85133e;

    /* JADX INFO: renamed from: f */
    public boolean f85134f;

    /* JADX INFO: renamed from: g */
    public boolean f85135g;

    /* JADX INFO: renamed from: h */
    public boolean f85136h;

    /* JADX INFO: renamed from: i */
    public C5313g<Bitmap> f85137i;

    /* JADX INFO: renamed from: j */
    public a f85138j;

    /* JADX INFO: renamed from: k */
    public boolean f85139k;

    /* JADX INFO: renamed from: l */
    public a f85140l;

    /* JADX INFO: renamed from: m */
    public Bitmap f85141m;

    /* JADX INFO: renamed from: n */
    public InterfaceC44616h<Bitmap> f85142n;

    /* JADX INFO: renamed from: o */
    public a f85143o;

    /* JADX INFO: renamed from: p */
    public int f85144p;

    /* JADX INFO: renamed from: q */
    public int f85145q;

    /* JADX INFO: renamed from: r */
    public int f85146r;

    /* JADX INFO: renamed from: g2.g$a */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    @VisibleForTesting
    public static class a extends AbstractC42392c<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final Handler f85147e;

        /* JADX INFO: renamed from: f */
        public final int f85148f;

        /* JADX INFO: renamed from: g */
        public final long f85149g;

        /* JADX INFO: renamed from: h */
        public Bitmap f85150h;

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: c */
        public void mo59882c(@Nullable Drawable drawable) {
            this.f85150h = null;
        }

        /* JADX INFO: renamed from: b */
        public Bitmap m85289b() {
            return this.f85150h;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6639e(@NonNull Bitmap bitmap, @Nullable InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            this.f85150h = bitmap;
            this.f85147e.sendMessageAtTime(this.f85147e.obtainMessage(1, this), this.f85149g);
        }

        public a(Handler handler, int i11, long j11) {
            this.f85147e = handler;
            this.f85148f = i11;
            this.f85149g = j11;
        }
    }

    /* JADX INFO: renamed from: g2.g$b */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo85252a();
    }

    /* JADX INFO: renamed from: g2.g$c */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                C37794g.this.m85282n((a) message.obj);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            C37794g.this.f85132d.m6626n((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: renamed from: g2.g$d */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    @VisibleForTesting
    public interface d {
    }

    public C37794g(ComponentCallbacks2C5309c componentCallbacks2C5309c, InterfaceC43896a interfaceC43896a, int i11, int i12, InterfaceC44616h<Bitmap> interfaceC44616h, Bitmap bitmap) {
        this(componentCallbacks2C5309c.m6562f(), ComponentCallbacks2C5309c.m6556t(componentCallbacks2C5309c.m6564h()), interfaceC43896a, null, m85270j(ComponentCallbacks2C5309c.m6556t(componentCallbacks2C5309c.m6564h()), i11, i12), interfaceC44616h, bitmap);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public void m85282n(a aVar) {
        this.f85135g = false;
        if (this.f85139k) {
            this.f85130b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f85134f) {
            if (this.f85136h) {
                this.f85130b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f85143o = aVar;
                return;
            }
        }
        if (aVar.m85289b() != null) {
            m85283o();
            a aVar2 = this.f85138j;
            this.f85138j = aVar;
            for (int size = this.f85131c.size() - 1; size >= 0; size--) {
                this.f85131c.get(size).mo85252a();
            }
            if (aVar2 != null) {
                this.f85130b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m85281m();
    }

    /* JADX INFO: renamed from: r */
    public final void m85286r() {
        this.f85134f = false;
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC44610b m85269g() {
        return new C42950d(Double.valueOf(Math.random()));
    }

    /* JADX INFO: renamed from: a */
    public void m85271a() {
        this.f85131c.clear();
        m85283o();
        m85286r();
        a aVar = this.f85138j;
        if (aVar != null) {
            this.f85132d.m6626n(aVar);
            this.f85138j = null;
        }
        a aVar2 = this.f85140l;
        if (aVar2 != null) {
            this.f85132d.m6626n(aVar2);
            this.f85140l = null;
        }
        a aVar3 = this.f85143o;
        if (aVar3 != null) {
            this.f85132d.m6626n(aVar3);
            this.f85143o = null;
        }
        this.f85129a.clear();
        this.f85139k = true;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m85272b() {
        return this.f85129a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m85273c() {
        a aVar = this.f85138j;
        return aVar != null ? aVar.m85289b() : this.f85141m;
    }

    /* JADX INFO: renamed from: d */
    public int m85274d() {
        a aVar = this.f85138j;
        if (aVar != null) {
            return aVar.f85148f;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m85275e() {
        return this.f85141m;
    }

    /* JADX INFO: renamed from: f */
    public int m85276f() {
        return this.f85129a.mo96671a();
    }

    /* JADX INFO: renamed from: h */
    public int m85277h() {
        return this.f85146r;
    }

    /* JADX INFO: renamed from: i */
    public int m85278i() {
        return this.f85129a.mo96678h();
    }

    /* JADX INFO: renamed from: k */
    public int m85279k() {
        return this.f85129a.mo96675e() + this.f85144p;
    }

    /* JADX INFO: renamed from: l */
    public int m85280l() {
        return this.f85145q;
    }

    /* JADX INFO: renamed from: m */
    public final void m85281m() {
        if (!this.f85134f || this.f85135g) {
            return;
        }
        if (this.f85136h) {
            C43363j.m95503a(this.f85143o == null, "Pending target must be null when starting from the first frame");
            this.f85129a.mo96673c();
            this.f85136h = false;
        }
        a aVar = this.f85143o;
        if (aVar != null) {
            this.f85143o = null;
            m85282n(aVar);
            return;
        }
        this.f85135g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f85129a.mo96679i());
        this.f85129a.mo96677g();
        this.f85140l = new a(this.f85130b, this.f85129a.mo96674d(), jUptimeMillis);
        this.f85137i.mo6606a(C42032f.m92240x0(m85269g())).mo6600K0(this.f85129a).m6591B0(this.f85140l);
    }

    /* JADX INFO: renamed from: o */
    public final void m85283o() {
        Bitmap bitmap = this.f85141m;
        if (bitmap != null) {
            this.f85133e.mo4893b(bitmap);
            this.f85141m = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m85285q() {
        if (this.f85134f) {
            return;
        }
        this.f85134f = true;
        this.f85139k = false;
        m85281m();
    }

    /* JADX INFO: renamed from: s */
    public void m85287s(b bVar) {
        if (this.f85139k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f85131c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f85131c.isEmpty();
        this.f85131c.add(bVar);
        if (zIsEmpty) {
            m85285q();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m85288t(b bVar) {
        this.f85131c.remove(bVar);
        if (this.f85131c.isEmpty()) {
            m85286r();
        }
    }

    /* JADX INFO: renamed from: j */
    public static C5313g<Bitmap> m85270j(ComponentCallbacks2C5314h componentCallbacks2C5314h, int i11, int i12) {
        return componentCallbacks2C5314h.mo6621d().mo6606a(C42032f.m92238v0(AbstractC45352c.f101955b).mo92219r0(true).mo92207l0(true).mo92186a0(i11, i12));
    }

    /* JADX INFO: renamed from: p */
    public void m85284p(InterfaceC44616h<Bitmap> interfaceC44616h, Bitmap bitmap) {
        this.f85142n = (InterfaceC44616h) C43363j.m95506d(interfaceC44616h);
        this.f85141m = (Bitmap) C43363j.m95506d(bitmap);
        this.f85137i = this.f85137i.mo6606a(new C42032f().mo92213o0(interfaceC44616h));
        this.f85144p = C43364k.m95515h(bitmap);
        this.f85145q = bitmap.getWidth();
        this.f85146r = bitmap.getHeight();
    }

    public C37794g(InterfaceC45686d interfaceC45686d, ComponentCallbacks2C5314h componentCallbacks2C5314h, InterfaceC43896a interfaceC43896a, Handler handler, C5313g<Bitmap> c5313g, InterfaceC44616h<Bitmap> interfaceC44616h, Bitmap bitmap) {
        this.f85131c = new ArrayList();
        this.f85132d = componentCallbacks2C5314h;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f85133e = interfaceC45686d;
        this.f85130b = handler;
        this.f85137i = c5313g;
        this.f85129a = interfaceC43896a;
        m85284p(interfaceC44616h, bitmap);
    }

    @VisibleForTesting
    public void setOnEveryFrameReadyListener(@Nullable d dVar) {
    }
}
