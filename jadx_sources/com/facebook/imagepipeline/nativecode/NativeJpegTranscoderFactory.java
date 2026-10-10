package com.facebook.imagepipeline.nativecode;

import com.facebook.imageformat.ImageFormat;
import p223e6.InterfaceC37078c;
import p223e6.InterfaceC37079d;
import p422l5.C42054a;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class NativeJpegTranscoderFactory implements InterfaceC37079d {

    /* JADX INFO: renamed from: a */
    public final int f9177a;

    /* JADX INFO: renamed from: b */
    public final boolean f9178b;

    /* JADX INFO: renamed from: c */
    public final boolean f9179c;

    @Override // p223e6.InterfaceC37079d
    @InterfaceC45704d
    public InterfaceC37078c createImageTranscoder(ImageFormat imageFormat, boolean z11) {
        if (imageFormat != C42054a.JPEG) {
            return null;
        }
        return new NativeJpegTranscoder(z11, this.f9177a, this.f9178b, this.f9179c);
    }

    @InterfaceC45704d
    public NativeJpegTranscoderFactory(int i11, boolean z11, boolean z12) {
        this.f9177a = i11;
        this.f9178b = z11;
        this.f9179c = z12;
    }
}
