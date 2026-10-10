package p349iw;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: iw.b */
/* JADX INFO: compiled from: AlphaPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public class C40175b extends AbstractC40176c {

    /* JADX INFO: renamed from: a */
    public float f89313a = 0.4f;

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: b */
    public void mo88533b(View view, float f11) {
        ViewCompat.setAlpha(view, 0.0f);
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: c */
    public void mo88534c(View view, float f11) {
        float f12 = this.f89313a;
        ViewCompat.setAlpha(view, f12 + ((1.0f - f12) * (f11 + 1.0f)));
    }

    @Override // p349iw.AbstractC40176c
    /* JADX INFO: renamed from: d */
    public void mo88535d(View view, float f11) {
        float f12 = this.f89313a;
        ViewCompat.setAlpha(view, f12 + ((1.0f - f12) * (1.0f - f11)));
    }
}
