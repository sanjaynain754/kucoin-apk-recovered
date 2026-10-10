package p218e1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37317m;
import p297h1.C38074d;
import p355j1.C40209l;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.r */
/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37038r implements InterfaceC37033m, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: b */
    public final String f82282b;

    /* JADX INFO: renamed from: c */
    public final boolean f82283c;

    /* JADX INFO: renamed from: d */
    public final LottieDrawable f82284d;

    /* JADX INFO: renamed from: e */
    public final C37317m f82285e;

    /* JADX INFO: renamed from: f */
    public boolean f82286f;

    /* JADX INFO: renamed from: a */
    public final Path f82281a = new Path();

    /* JADX INFO: renamed from: g */
    public final C37022b f82287g = new C37022b();

    /* JADX INFO: renamed from: c */
    private void m82883c() {
        this.f82286f = false;
        this.f82284d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list.get(i11);
            if (interfaceC37023c instanceof C37041u) {
                C37041u c37041u = (C37041u) interfaceC37023c;
                if (c37041u.m82888j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f82287g.m82854a(c37041u);
                    c37041u.m82884a(this);
                } else if (!(interfaceC37023c instanceof InterfaceC37039s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((InterfaceC37039s) interfaceC37023c);
                }
            } else if (!(interfaceC37023c instanceof InterfaceC37039s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((InterfaceC37039s) interfaceC37023c);
            }
        }
        this.f82285e.m83872r(arrayList);
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        if (t11 == InterfaceC5091m0.f6006P) {
            this.f82285e.m83838o(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82282b;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        if (this.f82286f && !this.f82285e.m83834k()) {
            return this.f82281a;
        }
        this.f82281a.reset();
        if (this.f82283c) {
            this.f82286f = true;
            return this.f82281a;
        }
        Path pathMo83831h = this.f82285e.mo83831h();
        if (pathMo83831h == null) {
            return this.f82281a;
        }
        this.f82281a.set(pathMo83831h);
        this.f82281a.setFillType(Path.FillType.EVEN_ODD);
        this.f82287g.m82855b(this.f82281a);
        this.f82286f = true;
        return this.f82281a;
    }

    public C37038r(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40209l c40209l) {
        this.f82282b = c40209l.m88598b();
        this.f82283c = c40209l.m88600d();
        this.f82284d = lottieDrawable;
        C37317m c37317mMo86574a = c40209l.m88599c().mo86574a();
        this.f82285e = c37317mMo86574a;
        abstractC5095a.m5791i(c37317mMo86574a);
        c37317mMo86574a.m83824a(this);
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        m82883c();
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
