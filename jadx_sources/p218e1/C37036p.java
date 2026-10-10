package p218e1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p248f1.AbstractC37305a;
import p248f1.C37320p;
import p297h1.C38074d;
import p355j1.C40204g;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.p */
/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37036p implements InterfaceC37025e, InterfaceC37033m, InterfaceC37030j, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: a */
    public final Matrix f82267a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f82268b = new Path();

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f82269c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5095a f82270d;

    /* JADX INFO: renamed from: e */
    public final String f82271e;

    /* JADX INFO: renamed from: f */
    public final boolean f82272f;

    /* JADX INFO: renamed from: g */
    public final AbstractC37305a<Float, Float> f82273g;

    /* JADX INFO: renamed from: h */
    public final AbstractC37305a<Float, Float> f82274h;

    /* JADX INFO: renamed from: i */
    public final C37320p f82275i;

    /* JADX INFO: renamed from: j */
    public C37024d f82276j;

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        if (this.f82275i.m83882c(t11, c43350c)) {
            return;
        }
        if (t11 == InterfaceC5091m0.f6027u) {
            this.f82273g.m83838o(c43350c);
        } else if (t11 == InterfaceC5091m0.f6028v) {
            this.f82274h.m83838o(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        this.f82276j.mo5786b(rectF, matrix, z11);
    }

    @Override // p218e1.InterfaceC37030j
    /* JADX INFO: renamed from: c */
    public void mo82871c(ListIterator<InterfaceC37023c> listIterator) {
        if (this.f82276j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f82276j = new C37024d(this.f82269c, this.f82270d, "Repeater", this.f82272f, arrayList, null);
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        float fFloatValue = this.f82273g.mo83831h().floatValue();
        float fFloatValue2 = this.f82274h.mo83831h().floatValue();
        float fFloatValue3 = this.f82275i.m83888i().mo83831h().floatValue() / 100.0f;
        float fFloatValue4 = this.f82275i.m83884e().mo83831h().floatValue() / 100.0f;
        for (int i12 = ((int) fFloatValue) - 1; i12 >= 0; i12--) {
            this.f82267a.set(matrix);
            float f11 = i12;
            this.f82267a.preConcat(this.f82275i.m83886g(f11 + fFloatValue2));
            this.f82276j.mo5787d(canvas, this.f82267a, (int) (i11 * C42929k.m94195i(fFloatValue3, fFloatValue4, f11 / fFloatValue)));
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82269c.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        this.f82276j.mo5789f(list, list2);
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82271e;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        Path path = this.f82276j.getPath();
        this.f82268b.reset();
        float fFloatValue = this.f82273g.mo83831h().floatValue();
        float fFloatValue2 = this.f82274h.mo83831h().floatValue();
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f82267a.set(this.f82275i.m83886g(i11 + fFloatValue2));
            this.f82268b.addPath(path, this.f82267a);
        }
        return this.f82268b;
    }

    public C37036p(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40204g c40204g) {
        this.f82269c = lottieDrawable;
        this.f82270d = abstractC5095a;
        this.f82271e = c40204g.m88578c();
        this.f82272f = c40204g.m88581f();
        AbstractC37305a<Float, Float> abstractC37305aMo86574a = c40204g.m88577b().mo86574a();
        this.f82273g = abstractC37305aMo86574a;
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC37305aMo86574a.m83824a(this);
        AbstractC37305a<Float, Float> abstractC37305aMo86574a2 = c40204g.m88579d().mo86574a();
        this.f82274h = abstractC37305aMo86574a2;
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        abstractC37305aMo86574a2.m83824a(this);
        C37320p c37320pM86581b = c40204g.m88580e().m86581b();
        this.f82275i = c37320pM86581b;
        c37320pM86581b.m83880a(abstractC5095a);
        c37320pM86581b.m83881b(this);
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
        for (int i12 = 0; i12 < this.f82276j.m82858j().size(); i12++) {
            InterfaceC37023c interfaceC37023c = this.f82276j.m82858j().get(i12);
            if (interfaceC37023c instanceof InterfaceC37031k) {
                C42929k.m94197k(c38074d, i11, list, c38074d2, (InterfaceC37031k) interfaceC37023c);
            }
        }
    }
}
