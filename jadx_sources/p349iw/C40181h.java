package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.h */
/* JADX INFO: compiled from: FlipPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40181h extends AbstractC40176c {
    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        ViewCompat.setTranslationX(view, (-view.getWidth()) * f11);
        ViewCompat.setRotationY(view, 180.0f * f11);
        if (f11 > -0.5d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        ViewCompat.setTranslationX(view, (-view.getWidth()) * f11);
        ViewCompat.setRotationY(view, 180.0f * f11);
        if (f11 < 0.5d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
    }
}
