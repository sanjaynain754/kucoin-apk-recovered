package p463n5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import java.util.ArrayList;
import java.util.List;
import p006a4.AbstractC0110a;
import p448m5.C42429d;
import p448m5.InterfaceC42426a;
import p448m5.InterfaceC42427b;
import p488o5.InterfaceC42965b;
import p526p5.AbstractC43387c;
import p585r5.C43928c;
import p712w3.C45708h;
import p749x5.C46069c;
import p749x5.C46075i;
import p749x5.C46079m;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;

/* JADX INFO: renamed from: n5.e */
/* JADX INFO: compiled from: AnimatedImageFactoryImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42755e implements InterfaceC42754d {

    /* JADX INFO: renamed from: e */
    public static InterfaceC42753c f94702e = m93679g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f */
    public static InterfaceC42753c f94703f = m93679g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a */
    public final InterfaceC42965b f94704a;

    /* JADX INFO: renamed from: b */
    public final AbstractC43387c f94705b;

    /* JADX INFO: renamed from: c */
    public final boolean f94706c;

    /* JADX INFO: renamed from: d */
    public final boolean f94707d;

    /* JADX INFO: renamed from: n5.e$a */
    /* JADX INFO: compiled from: AnimatedImageFactoryImpl.java */
    public class a implements AnimatedImageCompositor.InterfaceC5637b {
        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: b */
        public AbstractC0110a<Bitmap> mo8813b(int i11) {
            return null;
        }

        public a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: a */
        public void mo8812a(int i11, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: n5.e$b */
    /* JADX INFO: compiled from: AnimatedImageFactoryImpl.java */
    public class b implements AnimatedImageCompositor.InterfaceC5637b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f94709a;

        public b(List list) {
            this.f94709a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: b */
        public AbstractC0110a<Bitmap> mo8813b(int i11) {
            return AbstractC0110a.m553h((AbstractC0110a) this.f94709a.get(i11));
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: a */
        public void mo8812a(int i11, Bitmap bitmap) {
        }
    }

    public C42755e(InterfaceC42965b interfaceC42965b, AbstractC43387c abstractC43387c, boolean z11) {
        this(interfaceC42965b, abstractC43387c, z11, true);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC46071e m93683f(String str, C43928c c43928c, InterfaceC42427b interfaceC42427b, Bitmap.Config config) throws Throwable {
        List<AbstractC0110a<Bitmap>> listM93682e;
        AbstractC0110a<Bitmap> abstractC0110aM93681d;
        AbstractC0110a<Bitmap> abstractC0110a = null;
        try {
            int iMo7824a = c43928c.f97122d ? interfaceC42427b.mo7824a() - 1 : 0;
            if (c43928c.f97125g) {
                InterfaceC46072f interfaceC46072fM101553y = InterfaceC46072f.m101553y(m93681d(interfaceC42427b, config, iMo7824a), C46079m.f103527d, 0);
                AbstractC0110a.m555j(null);
                AbstractC0110a.m556k(null);
                return interfaceC46072fM101553y;
            }
            if (c43928c.f97124f) {
                listM93682e = m93682e(interfaceC42427b, config);
                try {
                    abstractC0110aM93681d = AbstractC0110a.m553h(listM93682e.get(iMo7824a));
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC0110a.m555j(abstractC0110a);
                    AbstractC0110a.m556k(listM93682e);
                    throw th;
                }
            } else {
                listM93682e = null;
                abstractC0110aM93681d = null;
            }
            try {
                if (c43928c.f97121c && abstractC0110aM93681d == null) {
                    abstractC0110aM93681d = m93681d(interfaceC42427b, config, iMo7824a);
                }
                C46069c c46069c = new C46069c(C42429d.m93141f(interfaceC42427b).m93156k(abstractC0110aM93681d).m93155j(iMo7824a).m93154i(listM93682e).m93153h(null).m93157l(str).m93146a(), this.f94707d);
                AbstractC0110a.m555j(abstractC0110aM93681d);
                AbstractC0110a.m556k(listM93682e);
                return c46069c;
            } catch (Throwable th3) {
                th = th3;
                abstractC0110a = abstractC0110aM93681d;
                AbstractC0110a.m555j(abstractC0110a);
                AbstractC0110a.m556k(listM93682e);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            listM93682e = null;
        }
    }

    public C42755e(InterfaceC42965b interfaceC42965b, AbstractC43387c abstractC43387c, boolean z11, boolean z12) {
        this.f94704a = interfaceC42965b;
        this.f94705b = abstractC43387c;
        this.f94706c = z11;
        this.f94707d = z12;
    }

    @Override // p463n5.InterfaceC42754d
    /* JADX INFO: renamed from: a */
    public InterfaceC46071e mo93677a(C46075i c46075i, C43928c c43928c, Bitmap.Config config) {
        if (f94703f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i.m101574i();
        C45708h.m100896g(abstractC0110aM101574i);
        try {
            PooledByteBuffer pooledByteBufferM565l = abstractC0110aM101574i.m565l();
            return m93683f(c46075i.m101584u(), c43928c, pooledByteBufferM565l.getByteBuffer() != null ? f94703f.mo7832i(pooledByteBufferM565l.getByteBuffer(), c43928c) : f94703f.mo7829f(pooledByteBufferM565l.mo731c(), pooledByteBufferM565l.size(), c43928c), config);
        } finally {
            AbstractC0110a.m555j(abstractC0110aM101574i);
        }
    }

    @Override // p463n5.InterfaceC42754d
    /* JADX INFO: renamed from: b */
    public InterfaceC46071e mo93678b(C46075i c46075i, C43928c c43928c, Bitmap.Config config) {
        if (f94702e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i.m101574i();
        C45708h.m100896g(abstractC0110aM101574i);
        try {
            PooledByteBuffer pooledByteBufferM565l = abstractC0110aM101574i.m565l();
            return m93683f(c46075i.m101584u(), c43928c, pooledByteBufferM565l.getByteBuffer() != null ? f94702e.mo7832i(pooledByteBufferM565l.getByteBuffer(), c43928c) : f94702e.mo7829f(pooledByteBufferM565l.mo731c(), pooledByteBufferM565l.size(), c43928c), config);
        } finally {
            AbstractC0110a.m555j(abstractC0110aM101574i);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public final AbstractC0110a<Bitmap> m93680c(int i11, int i12, Bitmap.Config config) {
        AbstractC0110a<Bitmap> abstractC0110aMo95559d = this.f94705b.mo95559d(i11, i12, config);
        abstractC0110aMo95559d.m565l().eraseColor(0);
        abstractC0110aMo95559d.m565l().setHasAlpha(true);
        return abstractC0110aMo95559d;
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC42753c m93679g(String str) {
        try {
            return (InterfaceC42753c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0110a<Bitmap> m93681d(InterfaceC42427b interfaceC42427b, Bitmap.Config config, int i11) {
        AbstractC0110a<Bitmap> abstractC0110aM93680c = m93680c(interfaceC42427b.getWidth(), interfaceC42427b.getHeight(), config);
        new AnimatedImageCompositor(this.f94704a.mo8828a(C42429d.m93140b(interfaceC42427b), null), this.f94706c, new a()).m9110h(i11, abstractC0110aM93680c.m565l());
        return abstractC0110aM93680c;
    }

    /* JADX INFO: renamed from: e */
    public final List<AbstractC0110a<Bitmap>> m93682e(InterfaceC42427b interfaceC42427b, Bitmap.Config config) {
        InterfaceC42426a interfaceC42426aMo8828a = this.f94704a.mo8828a(C42429d.m93140b(interfaceC42427b), null);
        ArrayList arrayList = new ArrayList(interfaceC42426aMo8828a.mo93130a());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(interfaceC42426aMo8828a, this.f94706c, new b(arrayList));
        for (int i11 = 0; i11 < interfaceC42426aMo8828a.mo93130a(); i11++) {
            AbstractC0110a<Bitmap> abstractC0110aM93680c = m93680c(interfaceC42426aMo8828a.getWidth(), interfaceC42426aMo8828a.getHeight(), config);
            animatedImageCompositor.m9110h(i11, abstractC0110aM93680c.m565l());
            arrayList.add(abstractC0110aM93680c);
        }
        return arrayList;
    }
}
