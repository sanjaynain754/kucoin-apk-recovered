package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.i */
/* JADX INFO: compiled from: RotatePageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40182i extends AbstractC40176c {

    /* JADX INFO: renamed from: a */
    public float f89317a = 15.0f;

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        float f12 = this.f89317a * f11;
        ViewCompat.setPivotX(view, view.getMeasuredWidth() * 0.5f);
        ViewCompat.setPivotY(view, view.getMeasuredHeight());
        ViewCompat.setRotation(view, f12);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
        ViewCompat.setPivotX(view, view.getMeasuredWidth() * 0.5f);
        ViewCompat.setPivotY(view, view.getMeasuredHeight());
        ViewCompat.setRotation(view, 0.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        mo88534c(view, f11);
    }
}
