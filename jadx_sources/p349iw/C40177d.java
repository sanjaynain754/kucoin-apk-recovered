package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.d */
/* JADX INFO: compiled from: CubePageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40177d extends AbstractC40176c {

    /* JADX INFO: renamed from: a */
    public float f89315a = 90.0f;

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        ViewCompat.setPivotX(view, 0.0f);
        ViewCompat.setPivotY(view, view.getMeasuredHeight() * 0.5f);
        ViewCompat.setRotationY(view, this.f89315a * f11);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
        ViewCompat.setPivotX(view, view.getMeasuredWidth());
        ViewCompat.setPivotY(view, view.getMeasuredHeight() * 0.5f);
        ViewCompat.setRotationY(view, 0.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        ViewCompat.setPivotX(view, view.getMeasuredWidth());
        ViewCompat.setPivotY(view, view.getMeasuredHeight() * 0.5f);
        ViewCompat.setRotationY(view, this.f89315a * f11);
    }
}
