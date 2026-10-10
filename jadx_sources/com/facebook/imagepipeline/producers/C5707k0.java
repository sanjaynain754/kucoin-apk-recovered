package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p190d4.C36613d;
import p526p5.C43389e;
import p749x5.C46079m;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;
import p784y3.C46369a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0 */
/* JADX INFO: compiled from: LocalThumbnailBitmapSdk29Producer.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(29)
public class C5707k0 implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final Executor f9380a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f9381b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0$a */
    /* JADX INFO: compiled from: LocalThumbnailBitmapSdk29Producer.java */
    public class a extends AbstractC5687d1<AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC5737y0 f9382g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5733w0 f9383h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ImageRequest f9384i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ CancellationSignal f9385j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5712m interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, String str, InterfaceC5737y0 interfaceC5737y1, InterfaceC5733w0 interfaceC5733w1, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(interfaceC5712m, interfaceC5737y0, interfaceC5733w0, str);
            this.f9382g = interfaceC5737y1;
            this.f9383h = interfaceC5733w1;
            this.f9384i = imageRequest;
            this.f9385j = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo9587i(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            return ImmutableMap.m8533of("createdThumbnail", String.valueOf(abstractC0110a != null));
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC0110a<InterfaceC46071e> mo9586c() throws IOException {
            String strM9720e;
            Bitmap bitmapLoadThumbnail;
            Size size = new Size(this.f9384i.getPreferredWidth(), this.f9384i.getPreferredHeight());
            try {
                strM9720e = C5707k0.this.m9720e(this.f9384i);
            } catch (IllegalArgumentException unused) {
                strM9720e = null;
            }
            if (strM9720e != null) {
                bitmapLoadThumbnail = C46369a.m102265c(C46369a.m102264b(strM9720e)) ? ThumbnailUtils.createVideoThumbnail(new File(strM9720e), size, this.f9385j) : ThumbnailUtils.createImageThumbnail(new File(strM9720e), size, this.f9385j);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = C5707k0.this.f9381b.loadThumbnail(this.f9384i.getSourceUri(), size, this.f9385j);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            InterfaceC46072f interfaceC46072fM101550G = InterfaceC46072f.m101550G(bitmapLoadThumbnail, C43389e.m95564a(), C46079m.f103527d, 0);
            this.f9383h.putExtra(HasExtraData.Companion.KEY_IMAGE_FORMAT, "thumbnail");
            interfaceC46072fM101550G.putExtras(this.f9383h.getExtras());
            return AbstractC0110a.m558p(interfaceC46072fM101550G);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1, p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: d */
        public void mo9655d() {
            super.mo9655d();
            this.f9385j.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1, p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: e */
        public void mo9656e(Exception exc) {
            super.mo9656e(exc);
            this.f9382g.mo9453a(this.f9383h, "LocalThumbnailBitmapSdk29Producer", false);
            this.f9383h.mo9668j(ImagesContract.LOCAL, "thumbnail_bitmap");
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo9585b(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            AbstractC0110a.m555j(abstractC0110a);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1, p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo9597f(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            boolean z11;
            super.mo9597f(abstractC0110a);
            InterfaceC5737y0 interfaceC5737y0 = this.f9382g;
            InterfaceC5733w0 interfaceC5733w0 = this.f9383h;
            if (abstractC0110a != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC5737y0.mo9453a(interfaceC5733w0, "LocalThumbnailBitmapSdk29Producer", z11);
            this.f9383h.mo9668j(ImagesContract.LOCAL, "thumbnail_bitmap");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0$b */
    /* JADX INFO: compiled from: LocalThumbnailBitmapSdk29Producer.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5687d1 f9387a;

        public b(AbstractC5687d1 abstractC5687d1) {
            this.f9387a = abstractC5687d1;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9387a.m99725a();
        }
    }

    public C5707k0(Executor executor, ContentResolver contentResolver) {
        this.f9380a = executor;
        this.f9381b = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        interfaceC5733w0.mo9668j(ImagesContract.LOCAL, "thumbnail_bitmap");
        a aVar = new a(interfaceC5712m, interfaceC5737y0Mo9665g, interfaceC5733w0, "LocalThumbnailBitmapSdk29Producer", interfaceC5737y0Mo9665g, interfaceC5733w0, imageRequestMo9666h, new CancellationSignal());
        interfaceC5733w0.mo9667i(new b(aVar));
        this.f9380a.execute(aVar);
    }

    /* JADX INFO: renamed from: e */
    public final String m9720e(ImageRequest imageRequest) {
        return C36613d.m81936e(this.f9381b, imageRequest.getSourceUri());
    }
}
