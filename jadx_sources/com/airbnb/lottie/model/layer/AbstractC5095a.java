package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p187d1.C36592a;
import p218e1.InterfaceC37023c;
import p218e1.InterfaceC37025e;
import p248f1.AbstractC37305a;
import p248f1.C37308d;
import p248f1.C37312h;
import p248f1.C37320p;
import p297h1.C38074d;
import p297h1.InterfaceC38075e;
import p355j1.C40198a;
import p355j1.C40206i;
import p389k1.C40858b;
import p389k1.C40859c;
import p389k1.C40860d;
import p389k1.C40861e;
import p389k1.C40862f;
import p444m1.C42365j;
import p484o1.C42924f;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.a */
/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5095a implements InterfaceC37025e, AbstractC37305a.b, InterfaceC38075e {

    /* JADX INFO: renamed from: A */
    @Nullable
    public Paint f6132A;

    /* JADX INFO: renamed from: B */
    public float f6133B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public BlurMaskFilter f6134C;

    /* JADX INFO: renamed from: a */
    public final Path f6135a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f6136b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f6137c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final Paint f6138d = new C36592a(1);

    /* JADX INFO: renamed from: e */
    public final Paint f6139e;

    /* JADX INFO: renamed from: f */
    public final Paint f6140f;

    /* JADX INFO: renamed from: g */
    public final Paint f6141g;

    /* JADX INFO: renamed from: h */
    public final Paint f6142h;

    /* JADX INFO: renamed from: i */
    public final RectF f6143i;

    /* JADX INFO: renamed from: j */
    public final RectF f6144j;

    /* JADX INFO: renamed from: k */
    public final RectF f6145k;

    /* JADX INFO: renamed from: l */
    public final RectF f6146l;

    /* JADX INFO: renamed from: m */
    public final RectF f6147m;

    /* JADX INFO: renamed from: n */
    public final String f6148n;

    /* JADX INFO: renamed from: o */
    public final Matrix f6149o;

    /* JADX INFO: renamed from: p */
    public final LottieDrawable f6150p;

    /* JADX INFO: renamed from: q */
    public final Layer f6151q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public C37312h f6152r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public C37308d f6153s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public AbstractC5095a f6154t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public AbstractC5095a f6155u;

    /* JADX INFO: renamed from: v */
    public List<AbstractC5095a> f6156v;

    /* JADX INFO: renamed from: w */
    public final List<AbstractC37305a<?, ?>> f6157w;

    /* JADX INFO: renamed from: x */
    public final C37320p f6158x;

    /* JADX INFO: renamed from: y */
    public boolean f6159y;

    /* JADX INFO: renamed from: z */
    public boolean f6160z;

    /* JADX INFO: renamed from: t */
    public abstract void mo5802t(Canvas canvas, Matrix matrix, int i11);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.a$a */
    /* JADX INFO: compiled from: BaseLayer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6161a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6162b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f6162b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6162b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6162b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6162b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f6161a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6161a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6161a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6161a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6161a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6161a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6161a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static AbstractC5095a m5770u(C5096b c5096b, Layer layer, LottieDrawable lottieDrawable, C5080h c5080h) {
        switch (a.f6161a[layer.m5747g().ordinal()]) {
            case 1:
                return new C40860d(lottieDrawable, layer, c5096b, c5080h);
            case 2:
                return new C5096b(lottieDrawable, layer, c5080h.m5664o(layer.m5754n()), c5080h);
            case 3:
                return new C40861e(lottieDrawable, layer);
            case 4:
                return new C40858b(lottieDrawable, layer);
            case 5:
                return new C40859c(lottieDrawable, layer);
            case 6:
                return new C40862f(lottieDrawable, layer);
            default:
                C42924f.m94158c("Unknown layer type " + layer.m5747g());
                return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m5771A() {
        C37312h c37312h = this.f6152r;
        return (c37312h == null || c37312h.m83862a().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public boolean m5772B() {
        return this.f6154t != null;
    }

    /* JADX INFO: renamed from: C */
    public final void m5773C(RectF rectF, Matrix matrix) {
        this.f6145k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m5771A()) {
            int size = this.f6152r.m83863b().size();
            for (int i11 = 0; i11 < size; i11++) {
                Mask mask = this.f6152r.m83863b().get(i11);
                Path pathMo83831h = this.f6152r.m83862a().get(i11).mo83831h();
                if (pathMo83831h != null) {
                    this.f6135a.set(pathMo83831h);
                    this.f6135a.transform(matrix);
                    int i12 = a.f6162b[mask.m5687a().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        return;
                    }
                    if ((i12 == 3 || i12 == 4) && mask.m5690d()) {
                        return;
                    }
                    this.f6135a.computeBounds(this.f6147m, false);
                    if (i11 == 0) {
                        this.f6145k.set(this.f6147m);
                    } else {
                        RectF rectF2 = this.f6145k;
                        rectF2.set(Math.min(rectF2.left, this.f6147m.left), Math.min(this.f6145k.top, this.f6147m.top), Math.max(this.f6145k.right, this.f6147m.right), Math.max(this.f6145k.bottom, this.f6147m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f6145k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m5775E() {
        this.f6150p.invalidateSelf();
    }

    /* JADX INFO: renamed from: F */
    public final void m5776F(float f11) {
        this.f6150p.m5571L().m5663n().m5899a(this.f6151q.m5750j(), f11);
    }

    /* JADX INFO: renamed from: G */
    public void m5777G(AbstractC37305a<?, ?> abstractC37305a) {
        this.f6157w.remove(abstractC37305a);
    }

    /* JADX INFO: renamed from: I */
    public void m5779I(@Nullable AbstractC5095a abstractC5095a) {
        this.f6154t = abstractC5095a;
    }

    /* JADX INFO: renamed from: J */
    public void mo5780J(boolean z11) {
        if (z11 && this.f6132A == null) {
            this.f6132A = new C36592a();
        }
        this.f6160z = z11;
    }

    /* JADX INFO: renamed from: K */
    public void m5781K(@Nullable AbstractC5095a abstractC5095a) {
        this.f6155u = abstractC5095a;
    }

    /* JADX INFO: renamed from: M */
    public final void m5783M(boolean z11) {
        if (z11 != this.f6159y) {
            this.f6159y = z11;
            m5775E();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m5784N() {
        if (this.f6151q.m5746f().isEmpty()) {
            m5783M(true);
            return;
        }
        C37308d c37308d = new C37308d(this.f6151q.m5746f());
        this.f6153s = c37308d;
        c37308d.m83836m();
        this.f6153s.m83824a(new AbstractC37305a.b() { // from class: k1.a
            @Override // p248f1.AbstractC37305a.b
            /* JADX INFO: renamed from: e */
            public final void mo5788e() {
                AbstractC5095a abstractC5095a = this.f90825a;
                abstractC5095a.m5783M(abstractC5095a.f6153s.m83855q() == 1.0f);
            }
        });
        m5783M(this.f6153s.mo83831h().floatValue() == 1.0f);
        m5791i(this.f6153s);
    }

    @Override // p297h1.InterfaceC38075e
    @CallSuper
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        this.f6158x.m83882c(t11, c43350c);
    }

    @Override // p218e1.InterfaceC37025e
    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        this.f6143i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m5800r();
        this.f6149o.set(matrix);
        if (z11) {
            List<AbstractC5095a> list = this.f6156v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f6149o.preConcat(this.f6156v.get(size).f6158x.m83885f());
                }
            } else {
                AbstractC5095a abstractC5095a = this.f6155u;
                if (abstractC5095a != null) {
                    this.f6149o.preConcat(abstractC5095a.f6158x.m83885f());
                }
            }
        }
        this.f6149o.preConcat(this.f6158x.m83885f());
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        Paint paint;
        Integer numMo83831h;
        C5072d.m5642b(this.f6148n);
        if (!this.f6159y || this.f6151q.m5765y()) {
            C5072d.m5643c(this.f6148n);
            return;
        }
        m5800r();
        if (C5072d.m5647g()) {
            C5072d.m5642b("Layer#parentMatrix");
        }
        this.f6136b.reset();
        this.f6136b.set(matrix);
        for (int size = this.f6156v.size() - 1; size >= 0; size--) {
            this.f6136b.preConcat(this.f6156v.get(size).f6158x.m83885f());
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("Layer#parentMatrix");
        }
        AbstractC37305a<?, Integer> abstractC37305aM83887h = this.f6158x.m83887h();
        int iIntValue = (int) ((((i11 / 255.0f) * ((abstractC37305aM83887h == null || (numMo83831h = abstractC37305aM83887h.mo83831h()) == null) ? 100 : numMo83831h.intValue())) / 100.0f) * 255.0f);
        if (!m5772B() && !m5771A()) {
            this.f6136b.preConcat(this.f6158x.m83885f());
            if (C5072d.m5647g()) {
                C5072d.m5642b("Layer#drawLayer");
            }
            mo5802t(canvas, this.f6136b, iIntValue);
            if (C5072d.m5647g()) {
                C5072d.m5643c("Layer#drawLayer");
            }
            m5776F(C5072d.m5643c(this.f6148n));
            return;
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("Layer#computeBounds");
        }
        mo5786b(this.f6143i, this.f6136b, false);
        m5774D(this.f6143i, matrix);
        this.f6136b.preConcat(this.f6158x.m83885f());
        m5773C(this.f6143i, this.f6136b);
        this.f6144j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f6137c);
        if (!this.f6137c.isIdentity()) {
            Matrix matrix2 = this.f6137c;
            matrix2.invert(matrix2);
            this.f6137c.mapRect(this.f6144j);
        }
        if (!this.f6143i.intersect(this.f6144j)) {
            this.f6143i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("Layer#computeBounds");
        }
        if (this.f6143i.width() >= 1.0f && this.f6143i.height() >= 1.0f) {
            if (C5072d.m5647g()) {
                C5072d.m5642b("Layer#saveLayer");
            }
            this.f6138d.setAlpha(255);
            C42930l.m94210m(canvas, this.f6143i, this.f6138d);
            if (C5072d.m5647g()) {
                C5072d.m5643c("Layer#saveLayer");
            }
            m5801s(canvas);
            if (C5072d.m5647g()) {
                C5072d.m5642b("Layer#drawLayer");
            }
            mo5802t(canvas, this.f6136b, iIntValue);
            if (C5072d.m5647g()) {
                C5072d.m5643c("Layer#drawLayer");
            }
            if (m5771A()) {
                m5797o(canvas, this.f6136b);
            }
            if (m5772B()) {
                if (C5072d.m5647g()) {
                    C5072d.m5642b("Layer#drawMatte");
                    C5072d.m5642b("Layer#saveLayer");
                }
                C42930l.m94211n(canvas, this.f6143i, this.f6141g, 19);
                if (C5072d.m5647g()) {
                    C5072d.m5643c("Layer#saveLayer");
                }
                m5801s(canvas);
                this.f6154t.mo5787d(canvas, matrix, iIntValue);
                if (C5072d.m5647g()) {
                    C5072d.m5642b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C5072d.m5647g()) {
                    C5072d.m5643c("Layer#restoreLayer");
                    C5072d.m5643c("Layer#drawMatte");
                }
            }
            if (C5072d.m5647g()) {
                C5072d.m5642b("Layer#restoreLayer");
            }
            canvas.restore();
            if (C5072d.m5647g()) {
                C5072d.m5643c("Layer#restoreLayer");
            }
        }
        if (this.f6160z && (paint = this.f6132A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f6132A.setColor(-251901);
            this.f6132A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f6143i, this.f6132A);
            this.f6132A.setStyle(Paint.Style.FILL);
            this.f6132A.setColor(1357638635);
            canvas.drawRect(this.f6143i, this.f6132A);
        }
        m5776F(C5072d.m5643c(this.f6148n));
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        AbstractC5095a abstractC5095a = this.f6154t;
        if (abstractC5095a != null) {
            C38074d c38074dM85965a = c38074d2.m85965a(abstractC5095a.getName());
            if (c38074d.m85967c(this.f6154t.getName(), i11)) {
                list.add(c38074dM85965a.m85973i(this.f6154t));
            }
            if (c38074d.m85972h(getName(), i11)) {
                this.f6154t.mo5778H(c38074d, c38074d.m85969e(this.f6154t.getName(), i11) + i11, list, c38074dM85965a);
            }
        }
        if (c38074d.m85971g(getName(), i11)) {
            if (!"__container".equals(getName())) {
                c38074d2 = c38074d2.m85965a(getName());
                if (c38074d.m85967c(getName(), i11)) {
                    list.add(c38074d2.m85973i(this));
                }
            }
            if (c38074d.m85972h(getName(), i11)) {
                mo5778H(c38074d, i11 + c38074d.m85969e(getName(), i11), list, c38074d2);
            }
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f6151q.m5750j();
    }

    /* JADX INFO: renamed from: i */
    public void m5791i(@Nullable AbstractC37305a<?, ?> abstractC37305a) {
        if (abstractC37305a == null) {
            return;
        }
        this.f6157w.add(abstractC37305a);
    }

    /* JADX INFO: renamed from: k */
    public final void m5793k(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a, AbstractC37305a<Integer, Integer> abstractC37305a2) {
        C42930l.m94210m(canvas, this.f6143i, this.f6139e);
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        this.f6138d.setAlpha((int) (abstractC37305a2.mo83831h().intValue() * 2.55f));
        canvas.drawPath(this.f6135a, this.f6138d);
        canvas.restore();
    }

    /* JADX INFO: renamed from: l */
    public final void m5794l(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a, AbstractC37305a<Integer, Integer> abstractC37305a2) {
        C42930l.m94210m(canvas, this.f6143i, this.f6138d);
        canvas.drawRect(this.f6143i, this.f6138d);
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        this.f6138d.setAlpha((int) (abstractC37305a2.mo83831h().intValue() * 2.55f));
        canvas.drawPath(this.f6135a, this.f6140f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: m */
    public final void m5795m(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a, AbstractC37305a<Integer, Integer> abstractC37305a2) {
        C42930l.m94210m(canvas, this.f6143i, this.f6139e);
        canvas.drawRect(this.f6143i, this.f6138d);
        this.f6140f.setAlpha((int) (abstractC37305a2.mo83831h().intValue() * 2.55f));
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        canvas.drawPath(this.f6135a, this.f6140f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: n */
    public final void m5796n(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a, AbstractC37305a<Integer, Integer> abstractC37305a2) {
        C42930l.m94210m(canvas, this.f6143i, this.f6140f);
        canvas.drawRect(this.f6143i, this.f6138d);
        this.f6140f.setAlpha((int) (abstractC37305a2.mo83831h().intValue() * 2.55f));
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        canvas.drawPath(this.f6135a, this.f6140f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5799q() {
        if (this.f6152r.m83862a().isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f6152r.m83863b().size(); i11++) {
            if (this.f6152r.m83863b().get(i11).m5687a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m5800r() {
        if (this.f6156v != null) {
            return;
        }
        if (this.f6155u == null) {
            this.f6156v = Collections.EMPTY_LIST;
            return;
        }
        this.f6156v = new ArrayList();
        for (AbstractC5095a abstractC5095a = this.f6155u; abstractC5095a != null; abstractC5095a = abstractC5095a.f6155u) {
            this.f6156v.add(abstractC5095a);
        }
    }

    /* JADX INFO: renamed from: v */
    public LBlendMode m5803v() {
        return this.f6151q.m5741a();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public C40198a mo5804w() {
        return this.f6151q.m5742b();
    }

    /* JADX INFO: renamed from: x */
    public BlurMaskFilter m5805x(float f11) {
        if (this.f6133B == f11) {
            return this.f6134C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f11 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f6134C = blurMaskFilter;
        this.f6133B = f11;
        return blurMaskFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public C42365j mo5806y() {
        return this.f6151q.m5744d();
    }

    /* JADX INFO: renamed from: z */
    public Layer m5807z() {
        return this.f6151q;
    }

    public AbstractC5095a(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f6139e = new C36592a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f6140f = new C36592a(1, mode2);
        C36592a c36592a = new C36592a(1);
        this.f6141g = c36592a;
        this.f6142h = new C36592a(PorterDuff.Mode.CLEAR);
        this.f6143i = new RectF();
        this.f6144j = new RectF();
        this.f6145k = new RectF();
        this.f6146l = new RectF();
        this.f6147m = new RectF();
        this.f6149o = new Matrix();
        this.f6157w = new ArrayList();
        this.f6159y = true;
        this.f6133B = 0.0f;
        this.f6150p = lottieDrawable;
        this.f6151q = layer;
        this.f6148n = layer.m5750j() + "#draw";
        if (layer.m5749i() == Layer.MatteType.INVERT) {
            c36592a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c36592a.setXfermode(new PorterDuffXfermode(mode));
        }
        C37320p c37320pM86581b = layer.m5764x().m86581b();
        this.f6158x = c37320pM86581b;
        c37320pM86581b.m83881b(this);
        if (layer.m5748h() != null && !layer.m5748h().isEmpty()) {
            C37312h c37312h = new C37312h(layer.m5748h());
            this.f6152r = c37312h;
            Iterator<AbstractC37305a<C40206i, Path>> it = c37312h.m83862a().iterator();
            while (it.hasNext()) {
                it.next().m83824a(this);
            }
            for (AbstractC37305a<Integer, Integer> abstractC37305a : this.f6152r.m83864c()) {
                m5791i(abstractC37305a);
                abstractC37305a.m83824a(this);
            }
        }
        m5784N();
    }

    /* JADX INFO: renamed from: D */
    public final void m5774D(RectF rectF, Matrix matrix) {
        if (m5772B() && this.f6151q.m5749i() != Layer.MatteType.INVERT) {
            this.f6146l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6154t.mo5786b(this.f6146l, matrix, true);
            if (!rectF.intersect(this.f6146l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo5782L(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("BaseLayer#setProgress");
            C5072d.m5642b("BaseLayer#setProgress.transform");
        }
        this.f6158x.m83889j(f11);
        if (C5072d.m5647g()) {
            C5072d.m5643c("BaseLayer#setProgress.transform");
        }
        if (this.f6152r != null) {
            if (C5072d.m5647g()) {
                C5072d.m5642b("BaseLayer#setProgress.mask");
            }
            for (int i11 = 0; i11 < this.f6152r.m83862a().size(); i11++) {
                this.f6152r.m83862a().get(i11).mo83837n(f11);
            }
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f6153s != null) {
            if (C5072d.m5647g()) {
                C5072d.m5642b("BaseLayer#setProgress.inout");
            }
            this.f6153s.mo83837n(f11);
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f6154t != null) {
            if (C5072d.m5647g()) {
                C5072d.m5642b("BaseLayer#setProgress.matte");
            }
            this.f6154t.mo5782L(f11);
            if (C5072d.m5647g()) {
                C5072d.m5643c("BaseLayer#setProgress.matte");
            }
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("BaseLayer#setProgress.animations." + this.f6157w.size());
        }
        for (int i12 = 0; i12 < this.f6157w.size(); i12++) {
            this.f6157w.get(i12).mo83837n(f11);
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("BaseLayer#setProgress.animations." + this.f6157w.size());
            C5072d.m5643c("BaseLayer#setProgress");
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        m5775E();
    }

    /* JADX INFO: renamed from: j */
    public final void m5792j(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a, AbstractC37305a<Integer, Integer> abstractC37305a2) {
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        this.f6138d.setAlpha((int) (abstractC37305a2.mo83831h().intValue() * 2.55f));
        canvas.drawPath(this.f6135a, this.f6138d);
    }

    /* JADX INFO: renamed from: o */
    public final void m5797o(Canvas canvas, Matrix matrix) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("Layer#saveLayer");
        }
        C42930l.m94211n(canvas, this.f6143i, this.f6139e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m5801s(canvas);
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("Layer#saveLayer");
        }
        for (int i11 = 0; i11 < this.f6152r.m83863b().size(); i11++) {
            Mask mask = this.f6152r.m83863b().get(i11);
            AbstractC37305a<C40206i, Path> abstractC37305a = this.f6152r.m83862a().get(i11);
            AbstractC37305a<Integer, Integer> abstractC37305a2 = this.f6152r.m83864c().get(i11);
            int i12 = a.f6162b[mask.m5687a().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            if (mask.m5690d()) {
                                m5794l(canvas, matrix, abstractC37305a, abstractC37305a2);
                            } else {
                                m5792j(canvas, matrix, abstractC37305a, abstractC37305a2);
                            }
                        }
                    } else if (mask.m5690d()) {
                        m5795m(canvas, matrix, abstractC37305a, abstractC37305a2);
                    } else {
                        m5793k(canvas, matrix, abstractC37305a, abstractC37305a2);
                    }
                } else {
                    if (i11 == 0) {
                        this.f6138d.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f6138d.setAlpha(255);
                        canvas.drawRect(this.f6143i, this.f6138d);
                    }
                    if (mask.m5690d()) {
                        m5796n(canvas, matrix, abstractC37305a, abstractC37305a2);
                    } else {
                        m5798p(canvas, matrix, abstractC37305a);
                    }
                }
            } else if (m5799q()) {
                this.f6138d.setAlpha(255);
                canvas.drawRect(this.f6143i, this.f6138d);
            }
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C5072d.m5647g()) {
            C5072d.m5643c("Layer#restoreLayer");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5798p(Canvas canvas, Matrix matrix, AbstractC37305a<C40206i, Path> abstractC37305a) {
        this.f6135a.set(abstractC37305a.mo83831h());
        this.f6135a.transform(matrix);
        canvas.drawPath(this.f6135a, this.f6140f);
    }

    /* JADX INFO: renamed from: s */
    public final void m5801s(Canvas canvas) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("Layer#clearLayer");
        }
        RectF rectF = this.f6143i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6142h);
        if (C5072d.m5647g()) {
            C5072d.m5643c("Layer#clearLayer");
        }
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
    }

    /* JADX INFO: renamed from: H */
    public void mo5778H(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
    }
}
