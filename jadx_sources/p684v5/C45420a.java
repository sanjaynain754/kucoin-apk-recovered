package p684v5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;
import p006a4.AbstractC0110a;
import p034b6.InterfaceC4495d;
import p253f6.C37381b;
import p422l5.C42054a;
import p585r5.C43928c;
import p712w3.C45708h;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p749x5.C46075i;
import p749x5.C46079m;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;
import p749x5.InterfaceC46080n;

/* JADX INFO: renamed from: v5.a */
/* JADX INFO: compiled from: DefaultImageDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45420a implements InterfaceC45421b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45421b f102444a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45421b f102445b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4495d f102446c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC45711k<Boolean> f102447d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC45421b f102448e;

    /* JADX INFO: renamed from: f */
    public final Map<ImageFormat, InterfaceC45421b> f102449f;

    /* JADX INFO: renamed from: v5.a$a */
    /* JADX INFO: compiled from: DefaultImageDecoder.java */
    public class a implements InterfaceC45421b {
        public a() {
        }

        @Override // p684v5.InterfaceC45421b
        public InterfaceC46071e decode(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
            ColorSpace colorSpaceM101576k;
            ImageFormat imageFormatM101578m = c46075i.m101578m();
            if (((Boolean) C45420a.this.f102447d.get()).booleanValue()) {
                colorSpaceM101576k = c43928c.f97129k;
                if (colorSpaceM101576k == null) {
                    colorSpaceM101576k = c46075i.m101576k();
                }
            } else {
                colorSpaceM101576k = c43928c.f97129k;
            }
            ColorSpace colorSpace = colorSpaceM101576k;
            if (imageFormatM101578m == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String) {
                return C45420a.this.m100378d(c46075i, i11, interfaceC46080n, c43928c, colorSpace);
            }
            if (imageFormatM101578m == C42054a.GIF) {
                return C45420a.this.m100377c(c46075i, i11, interfaceC46080n, c43928c);
            }
            if (imageFormatM101578m == C42054a.WEBP_ANIMATED) {
                return C45420a.this.m100376b(c46075i, i11, interfaceC46080n, c43928c);
            }
            if (imageFormatM101578m != ImageFormat.f8817d) {
                return C45420a.this.m100379e(c46075i, c43928c);
            }
            throw new DecodeException("unknown image format", c46075i);
        }
    }

    public C45420a(InterfaceC45421b interfaceC45421b, InterfaceC45421b interfaceC45421b2, InterfaceC4495d interfaceC4495d) {
        this(interfaceC45421b, interfaceC45421b2, interfaceC4495d, null);
    }

    public C45420a(InterfaceC45421b interfaceC45421b, InterfaceC45421b interfaceC45421b2, InterfaceC4495d interfaceC4495d, Map<ImageFormat, InterfaceC45421b> map) {
        this.f102448e = new a();
        this.f102444a = interfaceC45421b;
        this.f102445b = interfaceC45421b2;
        this.f102446c = interfaceC4495d;
        this.f102449f = map;
        this.f102447d = C45712l.f103052b;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC46071e m100376b(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
        InterfaceC45421b interfaceC45421b;
        return (c43928c.f97125g || (interfaceC45421b = this.f102445b) == null) ? m100379e(c46075i, c43928c) : interfaceC45421b.decode(c46075i, i11, interfaceC46080n, c43928c);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC46072f m100378d(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c, ColorSpace colorSpace) {
        AbstractC0110a<Bitmap> abstractC0110aMo4293a = this.f102446c.mo4293a(c46075i, c43928c.f97126h, null, i11, colorSpace);
        try {
            C37381b.m84046a(null, abstractC0110aMo4293a);
            C45708h.m100896g(abstractC0110aMo4293a);
            InterfaceC46072f interfaceC46072fM101551I = InterfaceC46072f.m101551I(abstractC0110aMo4293a, interfaceC46080n, c46075i.m101559F(), c46075i.m101583t());
            interfaceC46072fM101551I.putExtra(HasExtraData.Companion.KEY_IS_ROUNDED, false);
            return interfaceC46072fM101551I;
        } finally {
            AbstractC0110a.m555j(abstractC0110aMo4293a);
        }
    }

    @Override // p684v5.InterfaceC45421b
    public InterfaceC46071e decode(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
        InputStream inputStreamM101579n;
        InterfaceC45421b interfaceC45421b;
        InterfaceC45421b interfaceC45421b2 = c43928c.f97128j;
        if (interfaceC45421b2 != null) {
            return interfaceC45421b2.decode(c46075i, i11, interfaceC46080n, c43928c);
        }
        ImageFormat imageFormatM101578m = c46075i.m101578m();
        if ((imageFormatM101578m == null || imageFormatM101578m == ImageFormat.f8817d) && (inputStreamM101579n = c46075i.m101579n()) != null) {
            imageFormatM101578m = ImageFormatChecker.m9096d(inputStreamM101579n);
            c46075i.m101567S(imageFormatM101578m);
        }
        Map<ImageFormat, InterfaceC45421b> map = this.f102449f;
        return (map == null || (interfaceC45421b = map.get(imageFormatM101578m)) == null) ? this.f102448e.decode(c46075i, i11, interfaceC46080n, c43928c) : interfaceC45421b.decode(c46075i, i11, interfaceC46080n, c43928c);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC46072f m100379e(C46075i c46075i, C43928c c43928c) {
        AbstractC0110a<Bitmap> abstractC0110aMo4294b = this.f102446c.mo4294b(c46075i, c43928c.f97126h, null, c43928c.f97129k);
        try {
            C37381b.m84046a(null, abstractC0110aMo4294b);
            C45708h.m100896g(abstractC0110aMo4294b);
            InterfaceC46072f interfaceC46072fM101551I = InterfaceC46072f.m101551I(abstractC0110aMo4294b, C46079m.f103527d, c46075i.m101559F(), c46075i.m101583t());
            interfaceC46072fM101551I.putExtra(HasExtraData.Companion.KEY_IS_ROUNDED, false);
            return interfaceC46072fM101551I;
        } finally {
            AbstractC0110a.m555j(abstractC0110aMo4294b);
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC46071e m100377c(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
        InterfaceC45421b interfaceC45421b;
        if (c46075i.getWidth() != -1 && c46075i.getHeight() != -1) {
            if (!c43928c.f97125g && (interfaceC45421b = this.f102444a) != null) {
                return interfaceC45421b.decode(c46075i, i11, interfaceC46080n, c43928c);
            }
            return m100379e(c46075i, c43928c);
        }
        throw new DecodeException("image width or height is incorrect", c46075i);
    }
}
