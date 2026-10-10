package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p190d4.C36613d;
import p526p5.C43389e;
import p712w3.C45708h;
import p749x5.C46079m;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l0 */
/* JADX INFO: compiled from: LocalVideoThumbnailProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5710l0 implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final Executor f9389a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f9390b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l0$a */
    /* JADX INFO: compiled from: LocalVideoThumbnailProducer.java */
    public class a extends AbstractC5687d1<AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC5737y0 f9391g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5733w0 f9392h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ImageRequest f9393i;

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC0110a<InterfaceC46071e> mo9586c() throws Exception {
            String strM9731i;
            try {
                strM9731i = C5710l0.this.m9731i(this.f9393i);
            } catch (IllegalArgumentException unused) {
                strM9731i = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strM9731i != null ? ThumbnailUtils.createVideoThumbnail(strM9731i, C5710l0.m9729g(this.f9393i)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = C5710l0.m9730h(C5710l0.this.f9390b, this.f9393i.getSourceUri());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            InterfaceC46072f interfaceC46072fM101550G = InterfaceC46072f.m101550G(bitmapCreateVideoThumbnail, C43389e.m95564a(), C46079m.f103527d, 0);
            this.f9392h.putExtra(HasExtraData.Companion.KEY_IMAGE_FORMAT, "thumbnail");
            interfaceC46072fM101550G.putExtras(this.f9392h.getExtras());
            return AbstractC0110a.m558p(interfaceC46072fM101550G);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5712m interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, String str, InterfaceC5737y0 interfaceC5737y1, InterfaceC5733w0 interfaceC5733w1, ImageRequest imageRequest) {
            super(interfaceC5712m, interfaceC5737y0, interfaceC5733w0, str);
            this.f9391g = interfaceC5737y1;
            this.f9392h = interfaceC5733w1;
            this.f9393i = imageRequest;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo9587i(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            return ImmutableMap.m8533of("createdThumbnail", String.valueOf(abstractC0110a != null));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1, p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: e */
        public void mo9656e(Exception exc) {
            super.mo9656e(exc);
            this.f9391g.mo9453a(this.f9392h, "VideoThumbnailProducer", false);
            this.f9392h.mo9668j(ImagesContract.LOCAL, "video");
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
            InterfaceC5737y0 interfaceC5737y0 = this.f9391g;
            InterfaceC5733w0 interfaceC5733w0 = this.f9392h;
            if (abstractC0110a != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC5737y0.mo9453a(interfaceC5733w0, "VideoThumbnailProducer", z11);
            this.f9392h.mo9668j(ImagesContract.LOCAL, "video");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l0$b */
    /* JADX INFO: compiled from: LocalVideoThumbnailProducer.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5687d1 f9395a;

        public b(AbstractC5687d1 abstractC5687d1) {
            this.f9395a = abstractC5687d1;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9395a.m99725a();
        }
    }

    public C5710l0(Executor executor, ContentResolver contentResolver) {
        this.f9389a = executor;
        this.f9390b = contentResolver;
    }

    /* JADX INFO: renamed from: g */
    public static int m9729g(ImageRequest imageRequest) {
        if (imageRequest.getPreferredWidth() <= 96 && imageRequest.getPreferredHeight() <= 96) {
            return 3;
        }
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m9730h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            C45708h.m100896g(parcelFileDescriptorOpenFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m9731i(ImageRequest imageRequest) {
        return C36613d.m81936e(this.f9390b, imageRequest.getSourceUri());
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        interfaceC5733w0.mo9668j(ImagesContract.LOCAL, "video");
        a aVar = new a(interfaceC5712m, interfaceC5737y0Mo9665g, interfaceC5733w0, "VideoThumbnailProducer", interfaceC5737y0Mo9665g, interfaceC5733w0, imageRequestMo9666h);
        interfaceC5733w0.mo9667i(new b(aVar));
        this.f9389a.execute(aVar);
    }
}
