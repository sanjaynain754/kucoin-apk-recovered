package p392k4;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p251f4.InterfaceC37351b;
import p283g5.InterfaceC37809b;
import p487o4.InterfaceC42956c;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p631t4.InterfaceC44686a;
import p714w5.InterfaceC45739a;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46077k;
import p821z5.InterfaceC46705d;

/* JADX INFO: renamed from: k4.f */
/* JADX INFO: compiled from: PipelineDraweeControllerBuilder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40891f extends AbstractDraweeControllerBuilder<C40891f, ImageRequest, AbstractC0110a<InterfaceC46071e>, InterfaceC46077k> {

    /* JADX INFO: renamed from: t */
    public final ImagePipeline f90942t;

    /* JADX INFO: renamed from: u */
    public final C40893h f90943u;

    /* JADX INFO: renamed from: v */
    public ImmutableList<InterfaceC45739a> f90944v;

    /* JADX INFO: renamed from: w */
    public InterfaceC37809b f90945w;

    /* JADX INFO: renamed from: k4.f$a */
    /* JADX INFO: compiled from: PipelineDraweeControllerBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90946a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f90946a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90946a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90946a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static ImageRequest.RequestLevel m89562H(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i11 = a.f90946a[cacheLevel.ordinal()];
        if (i11 == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i11 == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i11 == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> mo8623i(InterfaceC44686a interfaceC44686a, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f90942t.m9224m(imageRequest, obj, m89562H(cacheLevel), m89565K(interfaceC44686a), str);
    }

    /* JADX INFO: renamed from: K */
    public InterfaceC46705d m89565K(InterfaceC44686a interfaceC44686a) {
        if (interfaceC44686a instanceof C40890e) {
            return ((C40890e) interfaceC44686a).m89547p0();
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public C40891f m89567M(InterfaceC37809b interfaceC37809b) {
        this.f90945w = interfaceC37809b;
        return m8632r();
    }

    @Override // p631t4.InterfaceC44689d
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public C40891f mo89569b(Uri uri) {
        return uri == null ? (C40891f) super.m8613D(null) : (C40891f) super.m8613D(ImageRequestBuilder.m9851x(uri).m9867P(RotationOptions.m9191e()).m9872a());
    }

    public C40891f(Context context, C40893h c40893h, ImagePipeline imagePipeline, Set<InterfaceC42956c> set, Set<ControllerListener2> set2) {
        super(context, set, set2);
        this.f90942t = imagePipeline;
        this.f90943u = c40893h;
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC43595a m89563I() {
        ImageRequest imageRequestM8628n = m8628n();
        InterfaceC43619h cacheKeyFactory = this.f90942t.getCacheKeyFactory();
        if (cacheKeyFactory != null && imageRequestM8628n != null) {
            if (imageRequestM8628n.getPostprocessor() != null) {
                return cacheKeyFactory.mo95974a(imageRequestM8628n, m8620f());
            }
            return cacheKeyFactory.mo95976c(imageRequestM8628n, m8620f());
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C40890e mo8638x() {
        C40890e c40890eM89573c;
        if (C36621b.m81959d()) {
            C36621b.m81957a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            InterfaceC44686a interfaceC44686aM8630p = m8630p();
            String strM8609e = AbstractDraweeControllerBuilder.m8609e();
            if (interfaceC44686aM8630p instanceof C40890e) {
                c40890eM89573c = (C40890e) interfaceC44686aM8630p;
            } else {
                c40890eM89573c = this.f90943u.m89573c();
            }
            C40890e c40890e = c40890eM89573c;
            c40890e.m89549r0(m8639y(c40890e, strM8609e), strM8609e, m89563I(), m8620f(), this.f90944v);
            c40890e.m89551s0(this.f90945w, this);
            return c40890e;
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }
}
