package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.m */
/* JADX INFO: compiled from: ZoomPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40186m extends AbstractC40176c {

    /* JADX INFO: renamed from: a */
    public float f89318a = 0.85f;

    /* JADX INFO: renamed from: b */
    public float f89319b = 0.65f;

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
        ViewCompat.setAlpha(view, 0.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        float fMax = Math.max(this.f89318a, f11 + 1.0f);
        float f12 = 1.0f - fMax;
        ViewCompat.setTranslationX(view, ((view.getWidth() * f12) / 2.0f) - (((view.getHeight() * f12) / 2.0f) / 2.0f));
        ViewCompat.setScaleX(view, fMax);
        ViewCompat.setScaleY(view, fMax);
        float f13 = this.f89319b;
        float f14 = this.f89318a;
        ViewCompat.setAlpha(view, f13 + (((fMax - f14) / (1.0f - f14)) * (1.0f - f13)));
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        float fMax = Math.max(this.f89318a, 1.0f - f11);
        float f12 = 1.0f - fMax;
        ViewCompat.setTranslationX(view, (-((view.getWidth() * f12) / 2.0f)) + (((view.getHeight() * f12) / 2.0f) / 2.0f));
        ViewCompat.setScaleX(view, fMax);
        ViewCompat.setScaleY(view, fMax);
        float f13 = this.f89319b;
        float f14 = this.f89318a;
        ViewCompat.setAlpha(view, f13 + (((fMax - f14) / (1.0f - f14)) * (1.0f - f13)));
    }
}
