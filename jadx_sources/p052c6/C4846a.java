package p052c6;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.AbstractC5741a;
import p547q3.C43599e;
import p547q3.InterfaceC43595a;
import p712w3.C45708h;

/* JADX INFO: renamed from: c6.a */
/* JADX INFO: compiled from: IterativeBoxBlurPostProcessor.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4846a extends AbstractC5741a {

    /* JADX INFO: renamed from: a */
    public final int f4912a;

    /* JADX INFO: renamed from: b */
    public final int f4913b;

    /* JADX INFO: renamed from: c */
    public InterfaceC43595a f4914c;

    @Override // com.facebook.imagepipeline.request.AbstractC5741a, com.facebook.imagepipeline.request.InterfaceC5742b
    public InterfaceC43595a getPostprocessorCacheKey() {
        if (this.f4914c == null) {
            this.f4914c = new C43599e(String.format(null, "i%dr%d", Integer.valueOf(this.f4912a), Integer.valueOf(this.f4913b)));
        }
        return this.f4914c;
    }

    @Override // com.facebook.imagepipeline.request.AbstractC5741a
    public void process(Bitmap bitmap) {
        NativeBlurFilter.m9506a(bitmap, this.f4912a, this.f4913b);
    }

    public C4846a(int i11, int i12) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        C45708h.m100891b(Boolean.valueOf(i12 > 0));
        this.f4912a = i11;
        this.f4913b = i12;
    }
}
