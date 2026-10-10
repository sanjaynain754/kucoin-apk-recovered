package p710w1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: w1.e */
/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45687e implements InterfaceC45686d {
    @Override // p710w1.InterfaceC45686d
    /* JADX INFO: renamed from: b */
    public void mo4893b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p710w1.InterfaceC45686d
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo100813d(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // p710w1.InterfaceC45686d
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo100814e(int i11, int i12, Bitmap.Config config) {
        return mo100813d(i11, i12, config);
    }

    @Override // p710w1.InterfaceC45686d
    /* JADX INFO: renamed from: c */
    public void mo100812c() {
    }

    @Override // p710w1.InterfaceC45686d
    /* JADX INFO: renamed from: a */
    public void mo100811a(int i11) {
    }
}
