package p389k1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5083i0;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import com.airbnb.lottie.model.layer.Layer;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37321q;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: k1.b */
/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40858b extends AbstractC5095a {

    /* JADX INFO: renamed from: D */
    public final Paint f90826D;

    /* JADX INFO: renamed from: E */
    public final Rect f90827E;

    /* JADX INFO: renamed from: F */
    public final Rect f90828F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public final C5083i0 f90829G;

    /* JADX INFO: renamed from: H */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f90830H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public AbstractC37305a<Bitmap, Bitmap> f90831I;

    @Nullable
    /* JADX INFO: renamed from: O */
    public final Bitmap m89415O() {
        Bitmap bitmapMo83831h;
        AbstractC37305a<Bitmap, Bitmap> abstractC37305a = this.f90831I;
        if (abstractC37305a != null && (bitmapMo83831h = abstractC37305a.mo83831h()) != null) {
            return bitmapMo83831h;
        }
        Bitmap bitmapM5565I = this.f6150p.m5565I(this.f6151q.m5754n());
        if (bitmapM5565I != null) {
            return bitmapM5565I;
        }
        C5083i0 c5083i0 = this.f90829G;
        if (c5083i0 != null) {
            return c5083i0.m5673b();
        }
        return null;
    }

    public C40858b(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f90826D = new C36592a(3);
        this.f90827E = new Rect();
        this.f90828F = new Rect();
        this.f90829G = lottieDrawable.m5583R(layer.m5754n());
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f6001K) {
            if (c43350c == null) {
                this.f90830H = null;
                return;
            } else {
                this.f90830H = new C37321q(c43350c);
                return;
            }
        }
        if (t11 == InterfaceC5091m0.f6004N) {
            if (c43350c == null) {
                this.f90831I = null;
            } else {
                this.f90831I = new C37321q(c43350c);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        super.mo5786b(rectF, matrix, z11);
        if (this.f90829G != null) {
            float fM94202e = C42930l.m94202e();
            rectF.set(0.0f, 0.0f, this.f90829G.m5677f() * fM94202e, this.f90829G.m5675d() * fM94202e);
            this.f6149o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: t */
    public void mo5802t(@NonNull Canvas canvas, Matrix matrix, int i11) {
        Bitmap bitmapM89415O = m89415O();
        if (bitmapM89415O != null && !bitmapM89415O.isRecycled() && this.f90829G != null) {
            float fM94202e = C42930l.m94202e();
            this.f90826D.setAlpha(i11);
            AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f90830H;
            if (abstractC37305a != null) {
                this.f90826D.setColorFilter(abstractC37305a.mo83831h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f90827E.set(0, 0, bitmapM89415O.getWidth(), bitmapM89415O.getHeight());
            if (this.f6150p.m5585S()) {
                this.f90828F.set(0, 0, (int) (this.f90829G.m5677f() * fM94202e), (int) (this.f90829G.m5675d() * fM94202e));
            } else {
                this.f90828F.set(0, 0, (int) (bitmapM89415O.getWidth() * fM94202e), (int) (bitmapM89415O.getHeight() * fM94202e));
            }
            canvas.drawBitmap(bitmapM89415O, this.f90827E, this.f90828F, this.f90826D);
            canvas.restore();
        }
    }
}
