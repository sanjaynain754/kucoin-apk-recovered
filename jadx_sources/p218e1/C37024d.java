package p218e1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37320p;
import p297h1.C38074d;
import p297h1.InterfaceC38075e;
import p328i1.C38404l;
import p355j1.C40208k;
import p355j1.InterfaceC40200c;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class C37024d implements InterfaceC37025e, InterfaceC37033m, AbstractC37305a.b, InterfaceC38075e {

    /* JADX INFO: renamed from: a */
    public final Paint f82166a;

    /* JADX INFO: renamed from: b */
    public final RectF f82167b;

    /* JADX INFO: renamed from: c */
    public final Matrix f82168c;

    /* JADX INFO: renamed from: d */
    public final Path f82169d;

    /* JADX INFO: renamed from: e */
    public final RectF f82170e;

    /* JADX INFO: renamed from: f */
    public final String f82171f;

    /* JADX INFO: renamed from: g */
    public final boolean f82172g;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC37023c> f82173h;

    /* JADX INFO: renamed from: i */
    public final LottieDrawable f82174i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public List<InterfaceC37033m> f82175j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C37320p f82176k;

    public C37024d(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40208k c40208k, C5080h c5080h) {
        this(lottieDrawable, abstractC5095a, c40208k.m88596c(), c40208k.m88597d(), m82856c(lottieDrawable, c5080h, abstractC5095a, c40208k.m88595b()), m82857i(c40208k.m88595b()));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static C38404l m82857i(List<InterfaceC40200c> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC40200c interfaceC40200c = list.get(i11);
            if (interfaceC40200c instanceof C38404l) {
                return (C38404l) interfaceC40200c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m82861m() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f82173h.size(); i12++) {
            if ((this.f82173h.get(i12) instanceof InterfaceC37025e) && (i11 = i11 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC37023c> m82856c(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a, List<InterfaceC40200c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC37023c interfaceC37023cMo5692a = list.get(i11).mo5692a(lottieDrawable, c5080h, abstractC5095a);
            if (interfaceC37023cMo5692a != null) {
                arrayList.add(interfaceC37023cMo5692a);
            }
        }
        return arrayList;
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        C37320p c37320p = this.f82176k;
        if (c37320p != null) {
            c37320p.m83882c(t11, c43350c);
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        this.f82168c.set(matrix);
        C37320p c37320p = this.f82176k;
        if (c37320p != null) {
            this.f82168c.preConcat(c37320p.m83885f());
        }
        this.f82170e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f82173h.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = this.f82173h.get(size);
            if (interfaceC37023c instanceof InterfaceC37025e) {
                ((InterfaceC37025e) interfaceC37023c).mo5786b(this.f82170e, this.f82168c, z11);
                rectF.union(this.f82170e);
            }
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f82172g) {
            return;
        }
        this.f82168c.set(matrix);
        C37320p c37320p = this.f82176k;
        if (c37320p != null) {
            this.f82168c.preConcat(c37320p.m83885f());
            i11 = (int) (((((this.f82176k.m83887h() == null ? 100 : this.f82176k.m83887h().mo83831h().intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f82174i.m5608h0() && m82861m() && i11 != 255;
        if (z11) {
            this.f82167b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo5786b(this.f82167b, this.f82168c, true);
            this.f82166a.setAlpha(i11);
            C42930l.m94210m(canvas, this.f82167b, this.f82166a);
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.f82173h.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = this.f82173h.get(size);
            if (interfaceC37023c instanceof InterfaceC37025e) {
                ((InterfaceC37025e) interfaceC37023c).mo5787d(canvas, this.f82168c, i11);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82174i.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f82173h.size());
        arrayList.addAll(list);
        for (int size = this.f82173h.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = this.f82173h.get(size);
            interfaceC37023c.mo5789f(arrayList, this.f82173h.subList(0, size));
            arrayList.add(interfaceC37023c);
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82171f;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        this.f82168c.reset();
        C37320p c37320p = this.f82176k;
        if (c37320p != null) {
            this.f82168c.set(c37320p.m83885f());
        }
        this.f82169d.reset();
        if (this.f82172g) {
            return this.f82169d;
        }
        for (int size = this.f82173h.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = this.f82173h.get(size);
            if (interfaceC37023c instanceof InterfaceC37033m) {
                this.f82169d.addPath(((InterfaceC37033m) interfaceC37023c).getPath(), this.f82168c);
            }
        }
        return this.f82169d;
    }

    /* JADX INFO: renamed from: j */
    public List<InterfaceC37023c> m82858j() {
        return this.f82173h;
    }

    /* JADX INFO: renamed from: k */
    public List<InterfaceC37033m> m82859k() {
        if (this.f82175j == null) {
            this.f82175j = new ArrayList();
            for (int i11 = 0; i11 < this.f82173h.size(); i11++) {
                InterfaceC37023c interfaceC37023c = this.f82173h.get(i11);
                if (interfaceC37023c instanceof InterfaceC37033m) {
                    this.f82175j.add((InterfaceC37033m) interfaceC37023c);
                }
            }
        }
        return this.f82175j;
    }

    /* JADX INFO: renamed from: l */
    public Matrix m82860l() {
        C37320p c37320p = this.f82176k;
        if (c37320p != null) {
            return c37320p.m83885f();
        }
        this.f82168c.reset();
        return this.f82168c;
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        if (c38074d.m85971g(getName(), i11) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                c38074d2 = c38074d2.m85965a(getName());
                if (c38074d.m85967c(getName(), i11)) {
                    list.add(c38074d2.m85973i(this));
                }
            }
            if (c38074d.m85972h(getName(), i11)) {
                int iM85969e = i11 + c38074d.m85969e(getName(), i11);
                for (int i12 = 0; i12 < this.f82173h.size(); i12++) {
                    InterfaceC37023c interfaceC37023c = this.f82173h.get(i12);
                    if (interfaceC37023c instanceof InterfaceC38075e) {
                        ((InterfaceC38075e) interfaceC37023c).mo5790g(c38074d, iM85969e, list, c38074d2);
                    }
                }
            }
        }
    }

    public C37024d(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, String str, boolean z11, List<InterfaceC37023c> list, @Nullable C38404l c38404l) {
        this.f82166a = new C36592a();
        this.f82167b = new RectF();
        this.f82168c = new Matrix();
        this.f82169d = new Path();
        this.f82170e = new RectF();
        this.f82171f = str;
        this.f82174i = lottieDrawable;
        this.f82172g = z11;
        this.f82173h = list;
        if (c38404l != null) {
            C37320p c37320pM86581b = c38404l.m86581b();
            this.f82176k = c37320pM86581b;
            c37320pM86581b.m83880a(abstractC5095a);
            this.f82176k.m83881b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = list.get(size);
            if (interfaceC37023c instanceof InterfaceC37030j) {
                arrayList.add((InterfaceC37030j) interfaceC37023c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC37030j) arrayList.get(size2)).mo82871c(list.listIterator(list.size()));
        }
    }
}
