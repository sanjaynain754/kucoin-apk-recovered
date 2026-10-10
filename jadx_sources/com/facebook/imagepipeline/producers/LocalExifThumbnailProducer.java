package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.soloader.DoNotOptimize;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p190d4.C36613d;
import p284g6.C37818c;
import p284g6.C37821f;
import p422l5.C42054a;
import p712w3.C45708h;
import p747x3.C45999a;
import p749x5.C46075i;
import p819z3.C46680i;
import p819z3.InterfaceC46679h;

/* JADX INFO: loaded from: classes34.dex */
public class LocalExifThumbnailProducer implements InterfaceC5708k1<C46075i> {

    /* JADX INFO: renamed from: a */
    public final Executor f9235a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46679h f9236b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f9237c;

    @DoNotOptimize
    public class Api24Utils {
        public Api24Utils() {
        }

        /* JADX INFO: renamed from: a */
        public ExifInterface m9584a(FileDescriptor fileDescriptor) throws IOException {
            return new ExifInterface(fileDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    public class C5672a extends AbstractC5687d1<C46075i> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ImageRequest f9239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5672a(InterfaceC5712m interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, String str, ImageRequest imageRequest) {
            super(interfaceC5712m, interfaceC5737y0, interfaceC5733w0, str);
            this.f9239g = imageRequest;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo9587i(C46075i c46075i) {
            return ImmutableMap.m8533of("createdThumbnail", Boolean.toString(c46075i != null));
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C46075i mo9586c() throws Exception {
            ExifInterface exifInterfaceM9582g = LocalExifThumbnailProducer.this.m9582g(this.f9239g.getSourceUri());
            if (exifInterfaceM9582g == null || !exifInterfaceM9582g.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.m9580e(LocalExifThumbnailProducer.this.f9236b.mo604c((byte[]) C45708h.m100896g(exifInterfaceM9582g.getThumbnail())), exifInterfaceM9582g);
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo9585b(C46075i c46075i) {
            C46075i.m101556g(c46075i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    public class C5673b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5687d1 f9241a;

        public C5673b(AbstractC5687d1 abstractC5687d1) {
            this.f9241a = abstractC5687d1;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9241a.m99725a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public boolean m9581f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5708k1
    /* JADX INFO: renamed from: b */
    public boolean mo9579b(ResizeOptions resizeOptions) {
        return C5711l1.m9737b(512, 512, resizeOptions);
    }

    /* JADX INFO: renamed from: e */
    public final C46075i m9580e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairM85337d = C37818c.m85337d(new C46680i(pooledByteBuffer));
        int iM9583h = m9583h(exifInterface);
        int iIntValue = pairM85337d != null ? ((Integer) pairM85337d.first).intValue() : -1;
        int iIntValue2 = pairM85337d != null ? ((Integer) pairM85337d.second).intValue() : -1;
        AbstractC0110a abstractC0110aM558p = AbstractC0110a.m558p(pooledByteBuffer);
        try {
            C46075i c46075i = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
            AbstractC0110a.m555j(abstractC0110aM558p);
            c46075i.m101567S(C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String);
            c46075i.m101568T(iM9583h);
            c46075i.m101571W(iIntValue);
            c46075i.m101566R(iIntValue2);
            return c46075i;
        } catch (Throwable th2) {
            AbstractC0110a.m555j(abstractC0110aM558p);
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public ExifInterface m9582g(Uri uri) {
        String strM81936e = C36613d.m81936e(this.f9237c, uri);
        if (strM81936e == null) {
            return null;
        }
        try {
            if (m9581f(strM81936e)) {
                return new ExifInterface(strM81936e);
            }
            AssetFileDescriptor assetFileDescriptorM81932a = C36613d.m81932a(this.f9237c, uri);
            if (assetFileDescriptorM81932a != null) {
                ExifInterface exifInterfaceM9584a = new Api24Utils().m9584a(assetFileDescriptorM81932a.getFileDescriptor());
                assetFileDescriptorM81932a.close();
                return exifInterfaceM9584a;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C45999a.m101503i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m9583h(ExifInterface exifInterface) {
        return C37821f.m85350a(Integer.parseInt((String) C45708h.m100896g(exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION))));
    }

    public LocalExifThumbnailProducer(Executor executor, InterfaceC46679h interfaceC46679h, ContentResolver contentResolver) {
        this.f9235a = executor;
        this.f9236b = interfaceC46679h;
        this.f9237c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        interfaceC5733w0.mo9668j(ImagesContract.LOCAL, "exif");
        C5672a c5672a = new C5672a(interfaceC5712m, interfaceC5737y0Mo9665g, interfaceC5733w0, "LocalExifThumbnailProducer", imageRequestMo9666h);
        interfaceC5733w0.mo9667i(new C5673b(c5672a));
        this.f9235a.execute(c5672a);
    }
}
