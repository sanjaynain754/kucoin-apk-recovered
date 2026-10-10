package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.f */
/* JADX INFO: compiled from: DepthPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40179f extends AbstractC40176c {

    /* JADX INFO: renamed from: a */
    public float f89316a = 0.8f;

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
        ViewCompat.setAlpha(view, 0.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        ViewCompat.setAlpha(view, 1.0f);
        ViewCompat.setTranslationX(view, 0.0f);
        ViewCompat.setScaleX(view, 1.0f);
        ViewCompat.setScaleY(view, 1.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        float f12 = 1.0f - f11;
        ViewCompat.setAlpha(view, f12);
        ViewCompat.setTranslationX(view, (-view.getWidth()) * f11);
        float f13 = this.f89316a;
        float f14 = f13 + ((1.0f - f13) * f12);
        ViewCompat.setScaleX(view, f14);
        ViewCompat.setScaleY(view, f14);
    }
}
