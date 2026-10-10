package p585r5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p684v5.InterfaceC45421b;
import p712w3.C45706f;

/* JADX INFO: renamed from: r5.c */
/* JADX INFO: compiled from: ImageDecodeOptions.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43928c {

    /* JADX INFO: renamed from: m */
    public static final C43928c f97118m = m96832b().m96834a();

    /* JADX INFO: renamed from: a */
    public final int f97119a;

    /* JADX INFO: renamed from: b */
    public final int f97120b;

    /* JADX INFO: renamed from: c */
    public final boolean f97121c;

    /* JADX INFO: renamed from: d */
    public final boolean f97122d;

    /* JADX INFO: renamed from: e */
    public final boolean f97123e;

    /* JADX INFO: renamed from: f */
    public final boolean f97124f;

    /* JADX INFO: renamed from: g */
    public final boolean f97125g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.Config f97126h;

    /* JADX INFO: renamed from: i */
    public final Bitmap.Config f97127i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC45421b f97128j;

    /* JADX INFO: renamed from: k */
    public final ColorSpace f97129k;

    /* JADX INFO: renamed from: l */
    public final boolean f97130l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43928c c43928c = (C43928c) obj;
        if (this.f97119a != c43928c.f97119a || this.f97120b != c43928c.f97120b || this.f97121c != c43928c.f97121c || this.f97122d != c43928c.f97122d || this.f97123e != c43928c.f97123e || this.f97124f != c43928c.f97124f || this.f97125g != c43928c.f97125g) {
            return false;
        }
        boolean z11 = this.f97130l;
        if (z11 || this.f97126h == c43928c.f97126h) {
            return (z11 || this.f97127i == c43928c.f97127i) && this.f97128j == c43928c.f97128j && this.f97129k == c43928c.f97129k;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static C43928c m96831a() {
        return f97118m;
    }

    /* JADX INFO: renamed from: b */
    public static C43929d m96832b() {
        return new C43929d();
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f97119a * 31) + this.f97120b) * 31) + (this.f97121c ? 1 : 0)) * 31) + (this.f97122d ? 1 : 0)) * 31) + (this.f97123e ? 1 : 0)) * 31) + (this.f97124f ? 1 : 0)) * 31) + (this.f97125g ? 1 : 0);
        if (!this.f97130l) {
            iOrdinal = (iOrdinal * 31) + this.f97126h.ordinal();
        }
        if (!this.f97130l) {
            int i11 = iOrdinal * 31;
            Bitmap.Config config = this.f97127i;
            iOrdinal = i11 + (config != null ? config.ordinal() : 0);
        }
        int i12 = iOrdinal * 31;
        InterfaceC45421b interfaceC45421b = this.f97128j;
        int iHashCode = (i12 + (interfaceC45421b != null ? interfaceC45421b.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f97129k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + m96833c().toString() + "}";
    }

    public C43928c(C43929d c43929d) {
        this.f97119a = c43929d.m96845l();
        this.f97120b = c43929d.m96844k();
        this.f97121c = c43929d.m96841h();
        this.f97122d = c43929d.m96847n();
        this.f97123e = c43929d.m96846m();
        this.f97124f = c43929d.m96840g();
        this.f97125g = c43929d.m96843j();
        this.f97126h = c43929d.m96836c();
        this.f97127i = c43929d.m96835b();
        this.f97128j = c43929d.m96839f();
        c43929d.m96837d();
        this.f97129k = c43929d.m96838e();
        this.f97130l = c43929d.m96842i();
    }

    /* JADX INFO: renamed from: c */
    public C45706f.a m96833c() {
        return C45706f.m100884b(this).m100885a("minDecodeIntervalMs", this.f97119a).m100885a("maxDimensionPx", this.f97120b).m100887c("decodePreviewFrame", this.f97121c).m100887c("useLastFrameForPreview", this.f97122d).m100887c("useEncodedImageForPreview", this.f97123e).m100887c("decodeAllFrames", this.f97124f).m100887c("forceStaticImage", this.f97125g).m100886b("bitmapConfigName", this.f97126h.name()).m100886b("animatedBitmapConfigName", this.f97127i.name()).m100886b("customImageDecoder", this.f97128j).m100886b("bitmapTransformation", null).m100886b("colorSpace", this.f97129k);
    }
}
