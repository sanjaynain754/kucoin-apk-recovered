package p549q5;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import p547q3.C43599e;
import p547q3.InterfaceC43595a;

/* JADX INFO: renamed from: q5.k */
/* JADX INFO: compiled from: DefaultCacheKeyFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43622k implements InterfaceC43619h {

    /* JADX INFO: renamed from: a */
    public static C43622k f96296a;

    /* JADX INFO: renamed from: f */
    public static synchronized C43622k m95991f() {
        try {
            if (f96296a == null) {
                f96296a = new C43622k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f96296a;
    }

    @Override // p549q5.InterfaceC43619h
    /* JADX INFO: renamed from: c */
    public InterfaceC43595a mo95976c(ImageRequest imageRequest, Object obj) {
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(m95992e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), null, null);
        bitmapMemoryCacheKey.m95971d(obj);
        return bitmapMemoryCacheKey;
    }

    @Override // p549q5.InterfaceC43619h
    /* JADX INFO: renamed from: d */
    public InterfaceC43595a mo95977d(ImageRequest imageRequest, Uri uri, Object obj) {
        return new C43599e(m95992e(uri).toString());
    }

    @Override // p549q5.InterfaceC43619h
    /* JADX INFO: renamed from: a */
    public InterfaceC43595a mo95974a(ImageRequest imageRequest, Object obj) {
        InterfaceC43595a interfaceC43595a;
        String name;
        InterfaceC5742b postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null) {
            InterfaceC43595a postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            name = postprocessor.getClass().getName();
            interfaceC43595a = postprocessorCacheKey;
        } else {
            interfaceC43595a = null;
            name = null;
        }
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(m95992e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), interfaceC43595a, name);
        bitmapMemoryCacheKey.m95971d(obj);
        return bitmapMemoryCacheKey;
    }

    @Override // p549q5.InterfaceC43619h
    /* JADX INFO: renamed from: b */
    public InterfaceC43595a mo95975b(ImageRequest imageRequest, Object obj) {
        return mo95977d(imageRequest, imageRequest.getSourceUri(), obj);
    }

    /* JADX INFO: renamed from: e */
    public Uri m95992e(Uri uri) {
        return uri;
    }
}
