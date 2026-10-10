package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.k */
/* JADX INFO: compiled from: ZoomCenterPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40184k extends AbstractC40176c {
    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        ViewCompat.setTranslationX(view, (-view.getWidth()) * f11);
        ViewCompat.setPivotX(view, view.getWidth() * 0.5f);
        ViewCompat.setPivotY(view, view.getHeight() * 0.5f);
        float f12 = f11 + 1.0f;
        ViewCompat.setScaleX(view, f12);
        ViewCompat.setScaleY(view, f12);
        if (f11 < -0.95f) {
            ViewCompat.setAlpha(view, 0.0f);
        } else {
            ViewCompat.setAlpha(view, 1.0f);
        }
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        ViewCompat.setTranslationX(view, (-view.getWidth()) * f11);
        ViewCompat.setPivotX(view, view.getWidth() * 0.5f);
        ViewCompat.setPivotY(view, view.getHeight() * 0.5f);
        float f12 = 1.0f - f11;
        ViewCompat.setScaleX(view, f12);
        ViewCompat.setScaleY(view, f12);
        if (f11 > 0.95f) {
            ViewCompat.setAlpha(view, 0.0f);
        } else {
            ViewCompat.setAlpha(view, 1.0f);
        }
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
    }
}
