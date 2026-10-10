package p362j8;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import p010a8.C0191b;
import p054c8.C4905a;
import p194d8.C36639a;
import p219e2.AbstractC37046b;
import p286g8.C37837a;
import p298h2.InterfaceC38084e;
import p304h8.C38144f;
import p425l8.C42136a;
import p451m8.C42485l;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;
import p823z7.C46714a;

/* JADX INFO: renamed from: j8.d */
/* JADX INFO: compiled from: FrameDrawableTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C40346d implements InterfaceC38084e<FrameSeqDecoder, Drawable> {

    /* JADX INFO: renamed from: j8.d$a */
    /* JADX INFO: compiled from: FrameDrawableTranscoder.java */
    /* JADX INFO: loaded from: classes45.dex */
    public class a extends AbstractC37046b<Drawable> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C46714a f89612c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Drawable drawable, C46714a c46714a) {
            super(drawable);
            this.f89612c = c46714a;
        }

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Drawable> mo4266a() {
            return Drawable.class;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return this.f89612c.m102313d();
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
            this.f89612c.stop();
        }

        @Override // p219e2.AbstractC37046b, p680v1.InterfaceC45356g
        public void initialize() {
            super.initialize();
        }
    }

    /* JADX INFO: renamed from: j8.d$b */
    /* JADX INFO: compiled from: FrameDrawableTranscoder.java */
    public class b extends AbstractC37046b<Drawable> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C42136a f89614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Drawable drawable, C42136a c42136a) {
            super(drawable);
            this.f89614c = c42136a;
        }

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Drawable> mo4266a() {
            return Drawable.class;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return this.f89614c.m102313d();
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
            this.f89614c.stop();
        }

        @Override // p219e2.AbstractC37046b, p680v1.InterfaceC45356g
        public void initialize() {
            super.initialize();
        }
    }

    /* JADX INFO: renamed from: j8.d$c */
    /* JADX INFO: compiled from: FrameDrawableTranscoder.java */
    /* JADX INFO: loaded from: classes45.dex */
    public class c extends AbstractC37046b<Drawable> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C37837a f89616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Drawable drawable, C37837a c37837a) {
            super(drawable);
            this.f89616c = c37837a;
        }

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Drawable> mo4266a() {
            return Drawable.class;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return this.f89616c.m102313d();
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
            this.f89616c.stop();
        }

        @Override // p219e2.AbstractC37046b, p680v1.InterfaceC45356g
        public void initialize() {
            super.initialize();
        }
    }

    /* JADX INFO: renamed from: j8.d$d */
    /* JADX INFO: compiled from: FrameDrawableTranscoder.java */
    /* JADX INFO: loaded from: classes45.dex */
    public class d extends AbstractC37046b<Drawable> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4905a f89618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Drawable drawable, C4905a c4905a) {
            super(drawable);
            this.f89618c = c4905a;
        }

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Drawable> mo4266a() {
            return Drawable.class;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return this.f89618c.m102313d();
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
            this.f89618c.stop();
        }

        @Override // p219e2.AbstractC37046b, p680v1.InterfaceC45356g
        public void initialize() {
            super.initialize();
        }
    }

    @Override // p298h2.InterfaceC38084e
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<Drawable> mo85980a(@NonNull InterfaceC45359j<FrameSeqDecoder> interfaceC45359j, @NonNull C44613e c44613e) {
        FrameSeqDecoder frameSeqDecoder = interfaceC45359j.get();
        boolean zBooleanValue = ((Boolean) c44613e.m98732c(C40343a.f89605d)).booleanValue();
        if (frameSeqDecoder instanceof C0191b) {
            C46714a c46714a = new C46714a((C0191b) frameSeqDecoder);
            c46714a.m102317h(false);
            c46714a.m102318i(zBooleanValue);
            return new a(c46714a, c46714a);
        }
        if (frameSeqDecoder instanceof C42485l) {
            C42136a c42136a = new C42136a((C42485l) frameSeqDecoder);
            c42136a.m102317h(false);
            c42136a.m102318i(zBooleanValue);
            return new b(c42136a, c42136a);
        }
        if (frameSeqDecoder instanceof C38144f) {
            C37837a c37837a = new C37837a((C38144f) frameSeqDecoder);
            c37837a.m102317h(false);
            c37837a.m102318i(zBooleanValue);
            return new c(c37837a, c37837a);
        }
        if (frameSeqDecoder instanceof C36639a) {
            C4905a c4905a = new C4905a((C36639a) frameSeqDecoder);
            c4905a.m102317h(false);
            c4905a.m102318i(zBooleanValue);
            return new d(c4905a, c4905a);
        }
        return null;
    }
}
