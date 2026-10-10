package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37321q;
import p297h1.C38074d;
import p328i1.C38394b;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.b */
/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C5096b extends AbstractC5095a {

    /* JADX INFO: renamed from: D */
    @Nullable
    public AbstractC37305a<Float, Float> f6163D;

    /* JADX INFO: renamed from: E */
    public final List<AbstractC5095a> f6164E;

    /* JADX INFO: renamed from: F */
    public final RectF f6165F;

    /* JADX INFO: renamed from: G */
    public final RectF f6166G;

    /* JADX INFO: renamed from: H */
    public final Paint f6167H;

    /* JADX INFO: renamed from: I */
    public float f6168I;

    /* JADX INFO: renamed from: J */
    public boolean f6169J;

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: H */
    public void mo5778H(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        for (int i12 = 0; i12 < this.f6164E.size(); i12++) {
            this.f6164E.get(i12).mo5790g(c38074d, i11, list, c38074d2);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.b$a */
    /* JADX INFO: compiled from: CompositionLayer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6170a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f6170a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6170a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public float m5808O() {
        return this.f6168I;
    }

    /* JADX INFO: renamed from: P */
    public void m5809P(boolean z11) {
        this.f6169J = z11;
    }

    public C5096b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, C5080h c5080h) {
        int i11;
        AbstractC5095a abstractC5095a;
        super(lottieDrawable, layer);
        this.f6164E = new ArrayList();
        this.f6165F = new RectF();
        this.f6166G = new RectF();
        this.f6167H = new Paint();
        this.f6169J = true;
        C38394b c38394bM5762v = layer.m5762v();
        if (c38394bM5762v != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a = c38394bM5762v.mo86574a();
            this.f6163D = abstractC37305aMo86574a;
            m5791i(abstractC37305aMo86574a);
            this.f6163D.m83824a(this);
        } else {
            this.f6163D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(c5080h.m5660k().size());
        int size = list.size() - 1;
        AbstractC5095a abstractC5095a2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            AbstractC5095a abstractC5095aM5770u = AbstractC5095a.m5770u(this, layer2, lottieDrawable, c5080h);
            if (abstractC5095aM5770u != null) {
                longSparseArray.put(abstractC5095aM5770u.m5807z().m5745e(), abstractC5095aM5770u);
                if (abstractC5095a2 != null) {
                    abstractC5095a2.m5779I(abstractC5095aM5770u);
                    abstractC5095a2 = null;
                } else {
                    this.f6164E.add(0, abstractC5095aM5770u);
                    int i12 = a.f6170a[layer2.m5749i().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        abstractC5095a2 = abstractC5095aM5770u;
                    }
                }
            }
            size--;
        }
        for (i11 = 0; i11 < longSparseArray.size(); i11++) {
            AbstractC5095a abstractC5095a3 = (AbstractC5095a) longSparseArray.get(longSparseArray.keyAt(i11));
            if (abstractC5095a3 != null && (abstractC5095a = (AbstractC5095a) longSparseArray.get(abstractC5095a3.m5807z().m5751k())) != null) {
                abstractC5095a3.m5781K(abstractC5095a);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: J */
    public void mo5780J(boolean z11) {
        super.mo5780J(z11);
        Iterator<AbstractC5095a> it = this.f6164E.iterator();
        while (it.hasNext()) {
            it.next().mo5780J(z11);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: L */
    public void mo5782L(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("CompositionLayer#setProgress");
        }
        this.f6168I = f11;
        super.mo5782L(f11);
        if (this.f6163D != null) {
            f11 = ((this.f6163D.mo83831h().floatValue() * this.f6151q.m5743c().m5658i()) - this.f6151q.m5743c().m5665p()) / (this.f6150p.m5571L().m5654e() + 0.01f);
        }
        if (this.f6163D == null) {
            f11 -= this.f6151q.m5759s();
        }
        if (this.f6151q.m5763w() != 0.0f && !"__container".equals(this.f6151q.m5750j())) {
            f11 /= this.f6151q.m5763w();
        }
        for (int size = this.f6164E.size() - 1; size >= 0; size--) {
            this.f6164E.get(size).mo5782L(f11);
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("CompositionLayer#setProgress");
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f5995E) {
            if (c43350c == null) {
                AbstractC37305a<Float, Float> abstractC37305a = this.f6163D;
                if (abstractC37305a != null) {
                    abstractC37305a.m83838o(null);
                    return;
                }
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f6163D = c37321q;
            c37321q.m83824a(this);
            m5791i(this.f6163D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        super.mo5786b(rectF, matrix, z11);
        for (int size = this.f6164E.size() - 1; size >= 0; size--) {
            this.f6165F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6164E.get(size).mo5786b(this.f6165F, this.f6149o, true);
            rectF.union(this.f6165F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: t */
    public void mo5802t(Canvas canvas, Matrix matrix, int i11) {
        boolean z11;
        boolean zClipRect;
        if (C5072d.m5647g()) {
            C5072d.m5642b("CompositionLayer#draw");
        }
        this.f6166G.set(0.0f, 0.0f, this.f6151q.m5753m(), this.f6151q.m5752l());
        matrix.mapRect(this.f6166G);
        if (this.f6150p.m5608h0() && this.f6164E.size() > 1 && i11 != 255) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f6167H.setAlpha(i11);
            C42930l.m94210m(canvas, this.f6166G, this.f6167H);
        } else {
            canvas.save();
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.f6164E.size() - 1; size >= 0; size--) {
            if ((this.f6169J || !"__container".equals(this.f6151q.m5750j())) && !this.f6166G.isEmpty()) {
                zClipRect = canvas.clipRect(this.f6166G);
            } else {
                zClipRect = true;
            }
            if (zClipRect) {
                this.f6164E.get(size).mo5787d(canvas, matrix, i11);
            }
        }
        canvas.restore();
        if (C5072d.m5647g()) {
            C5072d.m5643c("CompositionLayer#draw");
        }
    }
}
