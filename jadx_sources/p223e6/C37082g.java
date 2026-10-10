package p223e6;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.transcoder.SimpleImageTranscoder;

/* JADX INFO: renamed from: e6.g */
/* JADX INFO: compiled from: SimpleImageTranscoderFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37082g implements InterfaceC37079d {

    /* JADX INFO: renamed from: a */
    public final int f82347a;

    @Override // p223e6.InterfaceC37079d
    public InterfaceC37078c createImageTranscoder(ImageFormat imageFormat, boolean z11) {
        return new SimpleImageTranscoder(z11, this.f82347a);
    }

    public C37082g(int i11) {
        this.f82347a = i11;
    }
}
