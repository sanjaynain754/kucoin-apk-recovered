package p389k1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import com.airbnb.lottie.model.layer.Layer;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37321q;
import p522p1.C43350c;

/* JADX INFO: renamed from: k1.e */
/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40861e extends AbstractC5095a {

    /* JADX INFO: renamed from: D */
    public final RectF f90834D;

    /* JADX INFO: renamed from: E */
    public final Paint f90835E;

    /* JADX INFO: renamed from: F */
    public final float[] f90836F;

    /* JADX INFO: renamed from: G */
    public final Path f90837G;

    /* JADX INFO: renamed from: H */
    public final Layer f90838H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f90839I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public AbstractC37305a<Integer, Integer> f90840J;

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: t */
    public void mo5802t(Canvas canvas, Matrix matrix, int i11) {
        int iAlpha = Color.alpha(this.f90838H.m5756p());
        if (iAlpha == 0) {
            return;
        }
        AbstractC37305a<Integer, Integer> abstractC37305a = this.f90840J;
        Integer numMo83831h = abstractC37305a == null ? null : abstractC37305a.mo83831h();
        if (numMo83831h != null) {
            this.f90835E.setColor(numMo83831h.intValue());
        } else {
            this.f90835E.setColor(this.f90838H.m5756p());
        }
        int iIntValue = (int) ((i11 / 255.0f) * (((iAlpha / 255.0f) * (this.f6158x.m83887h() == null ? 100 : this.f6158x.m83887h().mo83831h().intValue())) / 100.0f) * 255.0f);
        this.f90835E.setAlpha(iIntValue);
        AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a2 = this.f90839I;
        if (abstractC37305a2 != null) {
            this.f90835E.setColorFilter(abstractC37305a2.mo83831h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f90836F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f90838H.m5758r();
            float[] fArr2 = this.f90836F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f90838H.m5758r();
            this.f90836F[5] = this.f90838H.m5757q();
            float[] fArr3 = this.f90836F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f90838H.m5757q();
            matrix.mapPoints(this.f90836F);
            this.f90837G.reset();
            Path path = this.f90837G;
            float[] fArr4 = this.f90836F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f90837G;
            float[] fArr5 = this.f90836F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f90837G;
            float[] fArr6 = this.f90836F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f90837G;
            float[] fArr7 = this.f90836F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f90837G;
            float[] fArr8 = this.f90836F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f90837G.close();
            canvas.drawPath(this.f90837G, this.f90835E);
        }
    }

    public C40861e(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f90834D = new RectF();
        C36592a c36592a = new C36592a();
        this.f90835E = c36592a;
        this.f90836F = new float[8];
        this.f90837G = new Path();
        this.f90838H = layer;
        c36592a.setAlpha(0);
        c36592a.setStyle(Paint.Style.FILL);
        c36592a.setColor(layer.m5756p());
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f6001K) {
            if (c43350c == null) {
                this.f90839I = null;
                return;
            } else {
                this.f90839I = new C37321q(c43350c);
                return;
            }
        }
        if (t11 == InterfaceC5091m0.f6007a) {
            if (c43350c == null) {
                this.f90840J = null;
                this.f90835E.setColor(this.f90838H.m5756p());
            } else {
                this.f90840J = new C37321q(c43350c);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        super.mo5786b(rectF, matrix, z11);
        this.f90834D.set(0.0f, 0.0f, this.f90838H.m5758r(), this.f90838H.m5757q());
        this.f6149o.mapRect(this.f90834D);
        rectF.set(this.f90834D);
    }
}
