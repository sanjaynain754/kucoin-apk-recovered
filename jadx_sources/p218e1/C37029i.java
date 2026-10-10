package p218e1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.C5094a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p248f1.AbstractC37305a;
import p248f1.C37321q;
import p355j1.C40201d;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.i */
/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37029i extends AbstractC37021a {

    /* JADX INFO: renamed from: A */
    public final AbstractC37305a<PointF, PointF> f82219A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public C37321q f82220B;

    /* JADX INFO: renamed from: r */
    public final String f82221r;

    /* JADX INFO: renamed from: s */
    public final boolean f82222s;

    /* JADX INFO: renamed from: t */
    public final LongSparseArray<LinearGradient> f82223t;

    /* JADX INFO: renamed from: u */
    public final LongSparseArray<RadialGradient> f82224u;

    /* JADX INFO: renamed from: v */
    public final RectF f82225v;

    /* JADX INFO: renamed from: w */
    public final GradientType f82226w;

    /* JADX INFO: renamed from: x */
    public final int f82227x;

    /* JADX INFO: renamed from: y */
    public final AbstractC37305a<C40201d, C40201d> f82228y;

    /* JADX INFO: renamed from: z */
    public final AbstractC37305a<PointF, PointF> f82229z;

    @Override // p218e1.AbstractC37021a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f82222s) {
            return;
        }
        mo5786b(this.f82225v, matrix, false);
        Shader shaderM82869l = this.f82226w == GradientType.LINEAR ? m82869l() : m82870m();
        shaderM82869l.setLocalMatrix(matrix);
        this.f82154i.setShader(shaderM82869l);
        super.mo5787d(canvas, matrix, i11);
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82221r;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m82867j(int[] iArr) {
        C37321q c37321q = this.f82220B;
        if (c37321q != null) {
            Integer[] numArr = (Integer[]) c37321q.mo83831h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m82868k() {
        int iRound = Math.round(this.f82229z.m83829f() * this.f82227x);
        int iRound2 = Math.round(this.f82219A.m83829f() * this.f82227x);
        int iRound3 = Math.round(this.f82228y.m83829f() * this.f82227x);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    public C37029i(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C5094a c5094a) {
        super(lottieDrawable, abstractC5095a, c5094a.m5728b().toPaintCap(), c5094a.m5733g().toPaintJoin(), c5094a.m5735i(), c5094a.m5737k(), c5094a.m5739m(), c5094a.m5734h(), c5094a.m5729c());
        this.f82223t = new LongSparseArray<>();
        this.f82224u = new LongSparseArray<>();
        this.f82225v = new RectF();
        this.f82221r = c5094a.m5736j();
        this.f82226w = c5094a.m5732f();
        this.f82222s = c5094a.m5740n();
        this.f82227x = (int) (lottieDrawable.m5571L().m5653d() / 32.0f);
        AbstractC37305a<C40201d, C40201d> abstractC37305aMo86574a = c5094a.m5731e().mo86574a();
        this.f82228y = abstractC37305aMo86574a;
        abstractC37305aMo86574a.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a2 = c5094a.m5738l().mo86574a();
        this.f82229z = abstractC37305aMo86574a2;
        abstractC37305aMo86574a2.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a3 = c5094a.m5730d().mo86574a();
        this.f82219A = abstractC37305aMo86574a3;
        abstractC37305aMo86574a3.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p218e1.AbstractC37021a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f6002L) {
            C37321q c37321q = this.f82220B;
            if (c37321q != null) {
                this.f82151f.m5777G(c37321q);
            }
            if (c43350c == null) {
                this.f82220B = null;
                return;
            }
            C37321q c37321q2 = new C37321q(c43350c);
            this.f82220B = c37321q2;
            c37321q2.m83824a(this);
            this.f82151f.m5791i(this.f82220B);
        }
    }

    /* JADX INFO: renamed from: l */
    public final LinearGradient m82869l() {
        long jM82868k = m82868k();
        LinearGradient linearGradient = this.f82223t.get(jM82868k);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFMo83831h = this.f82229z.mo83831h();
        PointF pointFMo83831h2 = this.f82219A.mo83831h();
        C40201d c40201dMo83831h = this.f82228y.mo83831h();
        LinearGradient linearGradient2 = new LinearGradient(pointFMo83831h.x, pointFMo83831h.y, pointFMo83831h2.x, pointFMo83831h2.y, m82867j(c40201dMo83831h.m88560d()), c40201dMo83831h.m88561e(), Shader.TileMode.CLAMP);
        this.f82223t.put(jM82868k, linearGradient2);
        return linearGradient2;
    }

    /* JADX INFO: renamed from: m */
    public final RadialGradient m82870m() {
        long jM82868k = m82868k();
        RadialGradient radialGradient = this.f82224u.get(jM82868k);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFMo83831h = this.f82229z.mo83831h();
        PointF pointFMo83831h2 = this.f82219A.mo83831h();
        C40201d c40201dMo83831h = this.f82228y.mo83831h();
        int[] iArrM82867j = m82867j(c40201dMo83831h.m88560d());
        float[] fArrM88561e = c40201dMo83831h.m88561e();
        float f11 = pointFMo83831h.x;
        float f12 = pointFMo83831h.y;
        RadialGradient radialGradient2 = new RadialGradient(f11, f12, (float) Math.hypot(pointFMo83831h2.x - f11, pointFMo83831h2.y - f12), iArrM82867j, fArrM88561e, Shader.TileMode.CLAMP);
        this.f82224u.put(jM82868k, radialGradient2);
        return radialGradient2;
    }
}
