package p389k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import com.airbnb.lottie.model.layer.C5096b;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;
import p218e1.C37024d;
import p218e1.InterfaceC37023c;
import p297h1.C38074d;
import p355j1.C40198a;
import p355j1.C40208k;
import p444m1.C42365j;

/* JADX INFO: renamed from: k1.d */
/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C40860d extends AbstractC5095a {

    /* JADX INFO: renamed from: D */
    public final C37024d f90832D;

    /* JADX INFO: renamed from: E */
    public final C5096b f90833E;

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: H */
    public void mo5778H(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        this.f90832D.mo5790g(c38074d, i11, list, c38074d2);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: t */
    public void mo5802t(@NonNull Canvas canvas, Matrix matrix, int i11) {
        this.f90832D.mo5787d(canvas, matrix, i11);
    }

    public C40860d(LottieDrawable lottieDrawable, Layer layer, C5096b c5096b, C5080h c5080h) {
        super(lottieDrawable, layer);
        this.f90833E = c5096b;
        C37024d c37024d = new C37024d(lottieDrawable, this, new C40208k("__container", layer.m5755o(), false), c5080h);
        this.f90832D = c37024d;
        List<InterfaceC37023c> list = Collections.EMPTY_LIST;
        c37024d.mo5789f(list, list);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        super.mo5786b(rectF, matrix, z11);
        this.f90832D.mo5786b(rectF, this.f6149o, z11);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    @Nullable
    /* JADX INFO: renamed from: w */
    public C40198a mo5804w() {
        C40198a c40198aMo5804w = super.mo5804w();
        if (c40198aMo5804w != null) {
            return c40198aMo5804w;
        }
        return this.f90833E.mo5804w();
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    @Nullable
    /* JADX INFO: renamed from: y */
    public C42365j mo5806y() {
        C42365j c42365jMo5806y = super.mo5806y();
        if (c42365jMo5806y != null) {
            return c42365jMo5806y;
        }
        return this.f90833E.mo5806y();
    }
}
