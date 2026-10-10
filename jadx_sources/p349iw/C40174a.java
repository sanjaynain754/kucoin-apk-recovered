package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.a */
/* JADX INFO: compiled from: AccordionPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40174a extends AbstractC40176c {
    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        ViewCompat.setPivotX(view, 0.0f);
        ViewCompat.setScaleX(view, 1.0f - f11);
        ViewCompat.setAlpha(view, 1.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        ViewCompat.setPivotX(view, view.getWidth());
        ViewCompat.setScaleX(view, f11 + 1.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
    }
}
