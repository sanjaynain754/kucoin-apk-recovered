package p447m4;

import com.facebook.fresco.p061ui.common.C5617a;
import com.facebook.imagepipeline.request.ImageRequest;
import p050c4.InterfaceC4820b;
import p821z5.C46702a;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: compiled from: ImagePerfRequestListener.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42423a extends C46702a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4820b f94043a;

    /* JADX INFO: renamed from: b */
    public final C5617a f94044b;

    @Override // p821z5.C46702a, p821z5.InterfaceC46705d
    public void onRequestCancellation(String str) {
        this.f94044b.m8856J(this.f94043a.now());
        this.f94044b.m8862P(str);
    }

    @Override // p821z5.C46702a, p821z5.InterfaceC46705d
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z11) {
        this.f94044b.m8856J(this.f94043a.now());
        this.f94044b.m8855I(imageRequest);
        this.f94044b.m8862P(str);
        this.f94044b.m8861O(z11);
    }

    @Override // p821z5.C46702a, p821z5.InterfaceC46705d
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z11) {
        this.f94044b.m8857K(this.f94043a.now());
        this.f94044b.m8855I(imageRequest);
        this.f94044b.m8868y(obj);
        this.f94044b.m8862P(str);
        this.f94044b.m8861O(z11);
    }

    @Override // p821z5.C46702a, p821z5.InterfaceC46705d
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z11) {
        this.f94044b.m8856J(this.f94043a.now());
        this.f94044b.m8855I(imageRequest);
        this.f94044b.m8862P(str);
        this.f94044b.m8861O(z11);
    }

    public C42423a(InterfaceC4820b interfaceC4820b, C5617a c5617a) {
        this.f94043a = interfaceC4820b;
        this.f94044b = c5617a;
    }
}
