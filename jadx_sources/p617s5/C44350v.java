package p617s5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RequiresApi;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.C5676a;
import com.facebook.imagepipeline.producers.C5681b1;
import com.facebook.imagepipeline.producers.C5689e0;
import com.facebook.imagepipeline.producers.C5690e1;
import com.facebook.imagepipeline.producers.C5694g;
import com.facebook.imagepipeline.producers.C5697h;
import com.facebook.imagepipeline.producers.C5699h1;
import com.facebook.imagepipeline.producers.C5700i;
import com.facebook.imagepipeline.producers.C5703j;
import com.facebook.imagepipeline.producers.C5705j1;
import com.facebook.imagepipeline.producers.C5706k;
import com.facebook.imagepipeline.producers.C5707k0;
import com.facebook.imagepipeline.producers.C5710l0;
import com.facebook.imagepipeline.producers.C5716o;
import com.facebook.imagepipeline.producers.C5717o0;
import com.facebook.imagepipeline.producers.C5721q0;
import com.facebook.imagepipeline.producers.C5722r;
import com.facebook.imagepipeline.producers.C5725s0;
import com.facebook.imagepipeline.producers.C5726t;
import com.facebook.imagepipeline.producers.C5727t0;
import com.facebook.imagepipeline.producers.C5728u;
import com.facebook.imagepipeline.producers.C5732w;
import com.facebook.imagepipeline.producers.C5734x;
import com.facebook.imagepipeline.producers.C5736y;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.InterfaceC5693f1;
import com.facebook.imagepipeline.producers.InterfaceC5708k1;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import p006a4.AbstractC0110a;
import p223e6.InterfaceC37079d;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p549q5.C43613b;
import p549q5.InterfaceC43619h;
import p684v5.InterfaceC45421b;
import p684v5.InterfaceC45424e;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p749x5.C46075i;
import p749x5.InterfaceC46071e;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: s5.v */
/* JADX INFO: compiled from: ProducerFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44350v {

    /* JADX INFO: renamed from: a */
    public ContentResolver f97996a;

    /* JADX INFO: renamed from: b */
    public Resources f97997b;

    /* JADX INFO: renamed from: c */
    public AssetManager f97998c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC46672a f97999d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC45421b f98000e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC45424e f98001f;

    /* JADX INFO: renamed from: g */
    public final DownsampleMode f98002g;

    /* JADX INFO: renamed from: h */
    public final boolean f98003h;

    /* JADX INFO: renamed from: i */
    public final boolean f98004i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC44341n f98005j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC46679h f98006k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC45711k<InterfaceC44317b> f98007l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> f98008m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f98009n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC43619h f98010o;

    /* JADX INFO: renamed from: p */
    public final C43613b<InterfaceC43595a> f98011p;

    /* JADX INFO: renamed from: q */
    public final C43613b<InterfaceC43595a> f98012q;

    /* JADX INFO: renamed from: r */
    public final AbstractC43387c f98013r;

    /* JADX INFO: renamed from: s */
    public final int f98014s;

    /* JADX INFO: renamed from: t */
    public final int f98015t;

    /* JADX INFO: renamed from: u */
    public boolean f98016u;

    /* JADX INFO: renamed from: v */
    public final C44315a f98017v;

    /* JADX INFO: renamed from: w */
    public final int f98018w;

    /* JADX INFO: renamed from: x */
    public final boolean f98019x;

    public C44350v(Context context, InterfaceC46672a interfaceC46672a, InterfaceC45421b interfaceC45421b, InterfaceC45424e interfaceC45424e, DownsampleMode downsampleMode, boolean z11, boolean z12, InterfaceC44341n interfaceC44341n, InterfaceC46679h interfaceC46679h, InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f2, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, AbstractC43387c abstractC43387c, int i11, int i12, boolean z13, int i13, C44315a c44315a, boolean z14, int i14) {
        this.f97996a = context.getApplicationContext().getContentResolver();
        this.f97997b = context.getApplicationContext().getResources();
        this.f97998c = context.getApplicationContext().getAssets();
        this.f97999d = interfaceC46672a;
        this.f98000e = interfaceC45421b;
        this.f98001f = interfaceC45424e;
        this.f98002g = downsampleMode;
        this.f98003h = z11;
        this.f98004i = z12;
        this.f98005j = interfaceC44341n;
        this.f98006k = interfaceC46679h;
        this.f98009n = interfaceC5648f;
        this.f98008m = interfaceC5648f2;
        this.f98007l = interfaceC45711k;
        this.f98010o = interfaceC43619h;
        this.f98013r = abstractC43387c;
        this.f98011p = new C43613b<>(i14);
        this.f98012q = new C43613b<>(i14);
        this.f98014s = i11;
        this.f98015t = i12;
        this.f98016u = z13;
        this.f98018w = i13;
        this.f98017v = c44315a;
        this.f98019x = z14;
    }

    /* JADX INFO: renamed from: a */
    public static C5676a m97816a(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5676a(interfaceC5731v0);
    }

    /* JADX INFO: renamed from: h */
    public static C5706k m97817h(InterfaceC5731v0<C46075i> interfaceC5731v0, InterfaceC5731v0<C46075i> interfaceC5731v1) {
        return new C5706k(interfaceC5731v0, interfaceC5731v1);
    }

    /* JADX INFO: renamed from: A */
    public C5725s0 m97818A(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5725s0(this.f98009n, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: B */
    public C5727t0 m97819B(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5727t0(interfaceC5731v0, this.f98013r, this.f98005j.getBackgroundExecutor());
    }

    /* JADX INFO: renamed from: C */
    public QualifiedResourceFetchProducer m97820C() {
        return new QualifiedResourceFetchProducer(this.f98005j.getIoBoundExecutor(), this.f98006k, this.f97996a);
    }

    /* JADX INFO: renamed from: D */
    public C5681b1 m97821D(InterfaceC5731v0<C46075i> interfaceC5731v0, boolean z11, InterfaceC37079d interfaceC37079d) {
        return new C5681b1(this.f98005j.getBackgroundExecutor(), this.f98006k, interfaceC5731v0, z11, interfaceC37079d);
    }

    /* JADX INFO: renamed from: E */
    public <T> C5690e1<T> m97822E(InterfaceC5731v0<T> interfaceC5731v0) {
        return new C5690e1<>(interfaceC5731v0);
    }

    /* JADX INFO: renamed from: F */
    public <T> C5699h1<T> m97823F(InterfaceC5731v0<T> interfaceC5731v0) {
        return new C5699h1<>(5, this.f98005j.getLightWeightBackgroundExecutor(), interfaceC5731v0);
    }

    /* JADX INFO: renamed from: G */
    public C5705j1 m97824G(InterfaceC5708k1<C46075i>[] interfaceC5708k1Arr) {
        return new C5705j1(interfaceC5708k1Arr);
    }

    /* JADX INFO: renamed from: b */
    public <T> InterfaceC5731v0<T> m97825b(InterfaceC5731v0<T> interfaceC5731v0, InterfaceC5693f1 interfaceC5693f1) {
        return new ThreadHandoffProducer(interfaceC5731v0, interfaceC5693f1);
    }

    /* JADX INFO: renamed from: c */
    public BitmapMemoryCacheGetProducer m97826c(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new BitmapMemoryCacheGetProducer(this.f98009n, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: d */
    public C5694g m97827d(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5694g(this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: e */
    public C5697h m97828e(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5697h(this.f98009n, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: f */
    public C5700i m97829f(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5700i(interfaceC5731v0, this.f98014s, this.f98015t, this.f98016u);
    }

    /* JADX INFO: renamed from: g */
    public C5703j m97830g(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5703j(this.f98008m, this.f98007l, this.f98010o, this.f98011p, this.f98012q, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: i */
    public C5716o m97831i() {
        return new C5716o(this.f98006k);
    }

    /* JADX INFO: renamed from: j */
    public DecodeProducer m97832j(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new DecodeProducer(this.f97999d, this.f98005j.getDecodeExecutor(), this.f98000e, this.f98001f, this.f98002g, this.f98003h, this.f98004i, interfaceC5731v0, this.f98018w, this.f98017v, null, C45712l.f103052b);
    }

    /* JADX INFO: renamed from: k */
    public C5722r m97833k(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        return new C5722r(interfaceC5731v0, this.f98005j.getBackgroundScheduledExecutorService());
    }

    /* JADX INFO: renamed from: l */
    public C5726t m97834l(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5726t(this.f98007l, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: m */
    public C5728u m97835m(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5728u(this.f98007l, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: n */
    public C5732w m97836n(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5732w(this.f98010o, this.f98019x, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC5731v0<C46075i> m97837o(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5734x(this.f98008m, this.f98010o, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: p */
    public C5736y m97838p(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5736y(this.f98007l, this.f98010o, this.f98011p, this.f98012q, interfaceC5731v0);
    }

    /* JADX INFO: renamed from: q */
    public LocalAssetFetchProducer m97839q() {
        return new LocalAssetFetchProducer(this.f98005j.getIoBoundExecutor(), this.f98006k, this.f97998c);
    }

    /* JADX INFO: renamed from: r */
    public LocalContentUriFetchProducer m97840r() {
        return new LocalContentUriFetchProducer(this.f98005j.getIoBoundExecutor(), this.f98006k, this.f97996a);
    }

    /* JADX INFO: renamed from: s */
    public C5689e0 m97841s() {
        return new C5689e0(this.f98005j.getIoBoundExecutor(), this.f98006k, this.f97996a);
    }

    /* JADX INFO: renamed from: t */
    public LocalExifThumbnailProducer m97842t() {
        return new LocalExifThumbnailProducer(this.f98005j.mo9200d(), this.f98006k, this.f97996a);
    }

    /* JADX INFO: renamed from: u */
    public LocalFileFetchProducer m97843u() {
        return new LocalFileFetchProducer(this.f98005j.getIoBoundExecutor(), this.f98006k);
    }

    /* JADX INFO: renamed from: v */
    public LocalResourceFetchProducer m97844v() {
        return new LocalResourceFetchProducer(this.f98005j.getIoBoundExecutor(), this.f98006k, this.f97997b);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: w */
    public C5707k0 m97845w() {
        return new C5707k0(this.f98005j.getBackgroundExecutor(), this.f97996a);
    }

    /* JADX INFO: renamed from: x */
    public C5710l0 m97846x() {
        return new C5710l0(this.f98005j.getIoBoundExecutor(), this.f97996a);
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC5731v0<C46075i> m97847y(InterfaceC5719p0 interfaceC5719p0) {
        return new C5717o0(this.f98006k, this.f97999d, interfaceC5719p0);
    }

    /* JADX INFO: renamed from: z */
    public C5721q0 m97848z(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        return new C5721q0(this.f98007l, this.f98010o, this.f98006k, this.f97999d, interfaceC5731v0);
    }
}
