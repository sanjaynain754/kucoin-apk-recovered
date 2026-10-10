package p448m5;

import android.graphics.Bitmap;
import java.util.List;
import p006a4.AbstractC0110a;
import p253f6.InterfaceC37380a;

/* JADX INFO: renamed from: m5.e */
/* JADX INFO: compiled from: AnimatedImageResultBuilder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42430e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC42427b f94055a;

    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> f94056b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC0110a<Bitmap>> f94057c;

    /* JADX INFO: renamed from: d */
    public int f94058d;

    /* JADX INFO: renamed from: e */
    public String f94059e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public C42429d m93146a() {
        try {
            return new C42429d(this);
        } finally {
            AbstractC0110a.m555j(this.f94056b);
            this.f94056b = null;
            AbstractC0110a.m556k(this.f94057c);
            this.f94057c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC37380a m93147b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<AbstractC0110a<Bitmap>> m93148c() {
        return AbstractC0110a.m554i(this.f94057c);
    }

    /* JADX INFO: renamed from: d */
    public int m93149d() {
        return this.f94058d;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC42427b m93150e() {
        return this.f94055a;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC0110a<Bitmap> m93151f() {
        return AbstractC0110a.m553h(this.f94056b);
    }

    /* JADX INFO: renamed from: g */
    public String m93152g() {
        return this.f94059e;
    }

    /* JADX INFO: renamed from: j */
    public C42430e m93155j(int i11) {
        this.f94058d = i11;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C42430e m93157l(String str) {
        this.f94059e = str;
        return this;
    }

    public C42430e(InterfaceC42427b interfaceC42427b) {
        this.f94055a = interfaceC42427b;
    }

    /* JADX INFO: renamed from: i */
    public C42430e m93154i(List<AbstractC0110a<Bitmap>> list) {
        this.f94057c = AbstractC0110a.m554i(list);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C42430e m93156k(AbstractC0110a<Bitmap> abstractC0110a) {
        this.f94056b = AbstractC0110a.m553h(abstractC0110a);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C42430e m93153h(InterfaceC37380a interfaceC37380a) {
        return this;
    }
}
