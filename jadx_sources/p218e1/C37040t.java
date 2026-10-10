package p218e1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p248f1.AbstractC37305a;
import p248f1.C37306b;
import p248f1.C37321q;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.t */
/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37040t extends AbstractC37021a {

    /* JADX INFO: renamed from: r */
    public final AbstractC5095a f82288r;

    /* JADX INFO: renamed from: s */
    public final String f82289s;

    /* JADX INFO: renamed from: t */
    public final boolean f82290t;

    /* JADX INFO: renamed from: u */
    public final AbstractC37305a<Integer, Integer> f82291u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f82292v;

    @Override // p218e1.AbstractC37021a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f82290t) {
            return;
        }
        this.f82154i.setColor(((C37306b) this.f82291u).m83845q());
        AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82292v;
        if (abstractC37305a != null) {
            this.f82154i.setColorFilter(abstractC37305a.mo83831h());
        }
        super.mo5787d(canvas, matrix, i11);
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82289s;
    }

    public C37040t(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, ShapeStroke shapeStroke) {
        super(lottieDrawable, abstractC5095a, shapeStroke.m5709b().toPaintCap(), shapeStroke.m5712e().toPaintJoin(), shapeStroke.m5714g(), shapeStroke.m5716i(), shapeStroke.m5717j(), shapeStroke.m5713f(), shapeStroke.m5711d());
        this.f82288r = abstractC5095a;
        this.f82289s = shapeStroke.m5715h();
        this.f82290t = shapeStroke.m5718k();
        AbstractC37305a<Integer, Integer> abstractC37305aMo86574a = shapeStroke.m5710c().mo86574a();
        this.f82291u = abstractC37305aMo86574a;
        abstractC37305aMo86574a.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a);
    }

    @Override // p218e1.AbstractC37021a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f6008b) {
            this.f82291u.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6001K) {
            AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82292v;
            if (abstractC37305a != null) {
                this.f82288r.m5777G(abstractC37305a);
            }
            if (c43350c == null) {
                this.f82292v = null;
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f82292v = c37321q;
            c37321q.m83824a(this);
            this.f82288r.m5791i(this.f82291u);
        }
    }
}
