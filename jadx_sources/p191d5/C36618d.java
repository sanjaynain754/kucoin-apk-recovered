package p191d5;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.cache.AnimationFrameCacheKey;
import com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache;
import com.facebook.fresco.animation.bitmap.cache.KeepLastFrameCache;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameLoaderFactory;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import com.facebook.fresco.vito.options.ImageOptions;
import com.facebook.fresco.vito.options.RoundingOptions;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p033b5.C4490a;
import p050c4.InterfaceC4820b;
import p051c5.C4836b;
import p051c5.C4840f;
import p332i5.InterfaceC38440a;
import p448m5.C42429d;
import p448m5.InterfaceC42426a;
import p448m5.InterfaceC42427b;
import p488o5.C42966c;
import p488o5.InterfaceC42965b;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p683v4.C45416c;
import p683v4.InterfaceC45414a;
import p712w3.C45708h;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p713w4.InterfaceC45718a;
import p713w4.InterfaceC45719b;
import p714w5.InterfaceC45739a;
import p748x4.C46007a;
import p749x5.C46069c;
import p749x5.InterfaceC46071e;
import p785y4.C46376c;
import p785y4.C46377d;
import p785y4.C46379f;
import p785y4.InterfaceC46374a;
import p785y4.InterfaceC46375b;

/* JADX INFO: renamed from: d5.d */
/* JADX INFO: compiled from: DefaultBitmapAnimationDrawableFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C36618d implements InterfaceC45739a, InterfaceC38440a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC42965b f79417a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f79418b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f79419c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4820b f79420d;

    /* JADX INFO: renamed from: e */
    public final AbstractC43387c f79421e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> f79422f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45711k<Integer> f79423g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC45711k<Integer> f79424h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC45711k<Boolean> f79425i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC45711k<Boolean> f79426j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC45711k<Boolean> f79427k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC45711k<Integer> f79428l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC45711k<Integer> f79429m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC45711k<Boolean> f79430n = C45712l.f103052b;

    /* JADX INFO: renamed from: b */
    public final C42966c m81951b(C42429d c42429d) {
        return new C42966c(new AnimationFrameCacheKey(c42429d.hashCode(), this.f79425i.get().booleanValue()), this.f79422f);
    }

    @Override // p714w5.InterfaceC45739a
    public Drawable createDrawable(InterfaceC46071e interfaceC46071e) {
        C46069c c46069c = (C46069c) interfaceC46071e;
        InterfaceC42427b interfaceC42427bM101548p = c46069c.m101548p();
        InterfaceC45414a interfaceC45414aM81952c = m81952c((C42429d) C45708h.m100896g(c46069c.m101549q()), interfaceC42427bM101548p != null ? interfaceC42427bM101548p.mo7830g() : null, null);
        return this.f79430n.get().booleanValue() ? new C4840f(interfaceC45414aM81952c) : new C4836b(interfaceC45414aM81952c);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC45718a m81953d(C42429d c42429d) {
        int iIntValue = this.f79423g.get().intValue();
        if (iIntValue == 1) {
            return new FrescoFrameCache(m81951b(c42429d), true);
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? new C46007a() : new KeepLastFrameCache();
        }
        return new FrescoFrameCache(m81951b(c42429d), false);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC46375b m81954e(InterfaceC45719b interfaceC45719b, Bitmap.Config config) {
        AbstractC43387c abstractC43387c = this.f79421e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new C46376c(abstractC43387c, interfaceC45719b, config, this.f79419c);
    }

    @Override // p714w5.InterfaceC45739a
    public boolean supportsImageType(InterfaceC46071e interfaceC46071e) {
        return interfaceC46071e instanceof C46069c;
    }

    public C36618d(InterfaceC42965b interfaceC42965b, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, InterfaceC4820b interfaceC4820b, AbstractC43387c abstractC43387c, InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> interfaceC5645c, InterfaceC45711k<Integer> interfaceC45711k, InterfaceC45711k<Integer> interfaceC45711k2, InterfaceC45711k<Boolean> interfaceC45711k3, InterfaceC45711k<Boolean> interfaceC45711k4, InterfaceC45711k<Boolean> interfaceC45711k5, InterfaceC45711k<Integer> interfaceC45711k6, InterfaceC45711k<Integer> interfaceC45711k7) {
        this.f79417a = interfaceC42965b;
        this.f79418b = scheduledExecutorService;
        this.f79419c = executorService;
        this.f79420d = interfaceC4820b;
        this.f79421e = abstractC43387c;
        this.f79422f = interfaceC5645c;
        this.f79423g = interfaceC45711k;
        this.f79424h = interfaceC45711k2;
        this.f79425i = interfaceC45711k3;
        this.f79426j = interfaceC45711k4;
        this.f79428l = interfaceC45711k6;
        this.f79427k = interfaceC45711k5;
        this.f79429m = interfaceC45711k7;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC42426a m81950a(C42429d c42429d) {
        InterfaceC42427b interfaceC42427bM93144d = c42429d.m93144d();
        return this.f79417a.mo8828a(c42429d, new Rect(0, 0, interfaceC42427bM93144d.getWidth(), interfaceC42427bM93144d.getHeight()));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC45414a m81952c(C42429d c42429d, Bitmap.Config config, ImageOptions imageOptions) {
        InterfaceC46374a c46379f;
        InterfaceC46375b interfaceC46375bM81954e;
        InterfaceC42426a interfaceC42426aM81950a = m81950a(c42429d);
        C4490a c4490a = new C4490a(interfaceC42426aM81950a);
        InterfaceC45718a interfaceC45718aM81953d = m81953d(c42429d);
        AnimatedDrawableBackendFrameRenderer animatedDrawableBackendFrameRenderer = new AnimatedDrawableBackendFrameRenderer(interfaceC45718aM81953d, interfaceC42426aM81950a, this.f79426j.get().booleanValue());
        int iIntValue = this.f79424h.get().intValue();
        RoundingOptions roundingOptionsM8945r = null;
        if (iIntValue > 0) {
            c46379f = new C46377d(iIntValue);
            interfaceC46375bM81954e = m81954e(animatedDrawableBackendFrameRenderer, config);
        } else {
            c46379f = null;
            interfaceC46375bM81954e = null;
        }
        if (imageOptions != null) {
            roundingOptionsM8945r = imageOptions.getRoundingOptions();
        }
        RoundingOptions roundingOptions = roundingOptionsM8945r;
        if (this.f79426j.get().booleanValue()) {
            c46379f = new C46379f(c42429d.m93145e(), c4490a, animatedDrawableBackendFrameRenderer, new FrameLoaderFactory(this.f79421e, this.f79428l.get().intValue(), this.f79429m.get().intValue()), this.f79427k.get().booleanValue());
        }
        return C45416c.m100369r(new BitmapAnimationBackend(this.f79421e, interfaceC45718aM81953d, c4490a, animatedDrawableBackendFrameRenderer, this.f79426j.get().booleanValue(), c46379f, interfaceC46375bM81954e, roundingOptions), this.f79420d, this.f79418b);
    }
}
